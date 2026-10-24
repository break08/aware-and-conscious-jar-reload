import os
import shutil

OLD = "net.lixis9.eventjar"
NEW = "com.eventjar"

HERE = os.path.dirname(os.path.abspath(__file__))              # src/main/java
RESOURCES = os.path.abspath(os.path.join(HERE, "..", "resources"))
ROOTS = [HERE] + ([RESOURCES] if os.path.isdir(RESOURCES) else [])

EXTS = {".java", ".json", ".toml", ".cfg", ".mcmeta", ".xml", ".properties", ".txt"}
SELF = os.path.abspath(__file__)

def replace_in_files(root):
    count = 0
    for dirpath, _, files in os.walk(root):
        for name in files:
            path = os.path.join(dirpath, name)
            if path == SELF or os.path.splitext(name)[1].lower() not in EXTS:
                continue
            try:
                with open(path, "r", encoding="utf-8") as f:
                    text = f.read()
            except UnicodeDecodeError:
                continue
            new = text.replace(OLD, NEW).replace(OLD.replace(".", "/"), NEW.replace(".", "/"))
            if new != text:
                with open(path, "w", encoding="utf-8", newline="") as f:
                    f.write(new)
                count += 1
                print("edited:", os.path.relpath(path, HERE))
    return count

def merge_move(src, dst):
    os.makedirs(dst, exist_ok=True)
    for item in os.listdir(src):
        s, d = os.path.join(src, item), os.path.join(dst, item)
        if os.path.isdir(s):
            merge_move(s, d)
        else:
            if os.path.exists(d):
                print("SKIP (already exists):", d)
            else:
                shutil.move(s, d)
    if not os.listdir(src):
        os.rmdir(src)

def move_dirs(root):
    old_dir = os.path.join(root, *OLD.split("."))
    new_dir = os.path.join(root, *NEW.split("."))
    if os.path.isdir(old_dir):
        merge_move(old_dir, new_dir)
        print("moved:", old_dir, "->", new_dir)
        # dọn thư mục rỗng net/lixis9, net
        parent = os.path.dirname(old_dir)
        while parent != root and os.path.isdir(parent) and not os.listdir(parent):
            os.rmdir(parent)
            parent = os.path.dirname(parent)

if __name__ == "__main__":
    total = sum(replace_in_files(r) for r in ROOTS)
    for r in ROOTS:
        move_dirs(r)
    print(f"Done. {total} file(s) edited.")