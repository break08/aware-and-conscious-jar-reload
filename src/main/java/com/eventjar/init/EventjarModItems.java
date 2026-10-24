/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.eventjar.init;

import com.eventjar.Eventjar;
import com.eventjar.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EventjarModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(Eventjar.MODID);

	public static final DeferredItem<Item> MEETBOY_SPAWN_EGG = REGISTRY.register("meetboy_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.MEETBOY, -3407872, -1, new Item.Properties()));
	public static final DeferredItem<BlockItem> MEETBLOCK = block(EventjarModBlocks.MEETBLOCK);
	public static final DeferredItem<Item> WHOAMI_SPAWN_EGG = REGISTRY.register("whoami_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.WHOAMI, -3407872, -1, new Item.Properties()));
	public static final DeferredItem<Item> ERRUNDEFINE_SPAWN_EGG = REGISTRY.register("errundefine_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.ERRUNDEFINE, -1, -1, new Item.Properties()));
	public static final DeferredItem<BlockItem> TASTYBLOCK = block(EventjarModBlocks.TASTYBLOCK);
	public static final DeferredItem<TAstyblock122Item> T_ASTYBLOCK_122 = REGISTRY.register("t_astyblock_122", TAstyblock122Item::new);
	public static final DeferredItem<Item> ENTITY_000125_SPAWN_EGG = REGISTRY.register("entity_000125_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.ENTITY_000125, -3407872, -1, new Item.Properties()));
	public static final DeferredItem<Item> ENTITYWHOWATCHYOU_SPAWN_EGG = REGISTRY.register("entitywhowatchyou_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.ENTITYWHOWATCHYOU, -3407872, -1, new Item.Properties()));
	public static final DeferredItem<Item> ENTITY_CENTIPEDE_SPAWN_EGG = REGISTRY.register("entity_centipede_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.ENTITY_CENTIPEDE, -3407872, -1, new Item.Properties()));
	public static final DeferredItem<RisperidoneItem> RISPERIDONE = REGISTRY.register("risperidone", RisperidoneItem::new);
	public static final DeferredItem<Item> LIXIS_9_SPAWN_EGG = REGISTRY.register("lixis_9_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.LIXIS_9, -1, -1, new Item.Properties()));
	public static final DeferredItem<HammerItem> HAMMER = REGISTRY.register("hammer", HammerItem::new);
	public static final DeferredItem<MeeetttItem> MEEETTT = REGISTRY.register("meeettt", MeeetttItem::new);
	public static final DeferredItem<Item> RAGE_THEN_60S_SPAWN_EGG = REGISTRY.register("rage_then_60s_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.RAGE_THEN_60S, -1, -1, new Item.Properties()));
	public static final DeferredItem<BlockItem> GODISLOVEYOUBLOCK = block(EventjarModBlocks.GODISLOVEYOUBLOCK);
	public static final DeferredItem<Item> MEETBOYFAST_SPAWN_EGG = REGISTRY.register("meetboyfast_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.MEETBOYFAST, -3407872, -1, new Item.Properties()));
	public static final DeferredItem<Item> CARETAKER_SPAWN_EGG = REGISTRY.register("caretaker_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.CARETAKER, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> PLAYER_SPAWN_EGG = REGISTRY.register("player_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.PLAYER, -1, -1, new Item.Properties()));
	public static final DeferredItem<FingerItem> FINGER = REGISTRY.register("finger", FingerItem::new);
	public static final DeferredItem<ScissorsItem> SCISSORS = REGISTRY.register("scissors", ScissorsItem::new);
	public static final DeferredItem<Item> EYES_SPAWN_EGG = REGISTRY.register("eyes_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.EYES, -1, -1, new Item.Properties()));
	public static final DeferredItem<WierdItem> WIERD = REGISTRY.register("wierd", WierdItem::new);
	public static final DeferredItem<Item> EYE_SPAWN_EGG = REGISTRY.register("eye_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.EYE, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> CAVEMEETBOY_SPAWN_EGG = REGISTRY.register("cavemeetboy_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.CAVEMEETBOY, -3407872, -1, new Item.Properties()));
	public static final DeferredItem<Item> INVISIBLE_WEIRD_ENTITY_SPAWN_EGG = REGISTRY.register("invisible_weird_entity_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.INVISIBLE_WEIRD_ENTITY, -1, -1, new Item.Properties()));
	public static final DeferredItem<RedemptionItem> REDEMPTION = REGISTRY.register("redemption", RedemptionItem::new);
	public static final DeferredItem<Item> NOISE_ENTITY_SPAWN_EGG = REGISTRY.register("noise_entity_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.NOISE_ENTITY, -1, -1, new Item.Properties()));
	public static final DeferredItem<BlockItem> NOISEBLOCK = block(EventjarModBlocks.NOISEBLOCK);
	public static final DeferredItem<Item> INVISIBLE_DIST_SPAWN_EGG = REGISTRY.register("invisible_dist_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.INVISIBLE_DIST, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> SEEKER_SPAWN_EGG = REGISTRY.register("seeker_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.SEEKER, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> SEEKERACT_SPAWN_EGG = REGISTRY.register("seekeract_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.SEEKERACT, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> WATCHER_SPAWN_EGG = REGISTRY.register("watcher_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.WATCHER, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> MEETBOY_LONG_SPAWN_EGG = REGISTRY.register("meetboy_long_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.MEETBOY_LONG, -3407872, -1, new Item.Properties()));
	public static final DeferredItem<Item> FAULT_SPAWN_EGG = REGISTRY.register("fault_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.FAULT, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> SCAVENGER_SPAWN_EGG = REGISTRY.register("scavenger_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.SCAVENGER, -1, -1, new Item.Properties()));
	public static final DeferredItem<BlockItem> EYESSEEMEBLOCK = block(EventjarModBlocks.EYESSEEMEBLOCK);
	public static final DeferredItem<EyesworldItem> EYESWORLD = REGISTRY.register("eyesworld", EyesworldItem::new);
	public static final DeferredItem<Item> MEATBOYDISTORTED_SPAWN_EGG = REGISTRY.register("meatboydistorted_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.MEATBOYDISTORTED, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> EYESINDARK_SPAWN_EGG = REGISTRY.register("eyesindark_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.EYESINDARK, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> SON_OFGOD_SPAWN_EGG = REGISTRY.register("son_ofgod_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.SON_OFGOD, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> DEFAULT_VILLAGER_SPAWN_EGG = REGISTRY.register("default_villager_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.DEFAULT_VILLAGER, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> SCARY_DEFAULT_VILLAGER_SPAWN_EGG = REGISTRY.register("scary_default_villager_spawn_egg", () -> new DeferredSpawnEggItem(EventjarModEntities.SCARY_DEFAULT_VILLAGER, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items

	private static DeferredItem<BlockItem> block(DeferredBlock<?> block) {
		return REGISTRY.registerSimpleBlockItem(block);
	}
}