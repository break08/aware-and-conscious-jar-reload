package com.eventjar.procedures;

public class CutsceneTracker {
    private static boolean cutsceneShown = false;

    public static boolean isCutsceneShown() {
        return cutsceneShown;
    }

    public static void markCutsceneShown() {
        cutsceneShown = true;
    }

    public static void resetCutscene() {
        cutsceneShown = false;
    }
}
