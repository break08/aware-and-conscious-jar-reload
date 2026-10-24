
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.eventjar.init;


import com.eventjar.block.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.eventjar.Eventjar.MODID;


public class EventjarModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MODID);
	public static final DeferredBlock<Block> MEETBLOCK = REGISTRY.register("meetblock", () -> new MeetblockBlock());
	public static final DeferredBlock<Block> TASTYBLOCK = REGISTRY.register("tastyblock", () -> new TastyblockBlock());
	public static final DeferredBlock<Block> MEEETTT_PORTAL = REGISTRY.register("meeettt_portal", () -> new MeeetttPortalBlock());
	public static final DeferredBlock<Block> GODISLOVEYOUBLOCK = REGISTRY.register("godisloveyoublock", () -> new GodisloveyoublockBlock());
	public static final DeferredBlock<Block> WIERD_PORTAL = REGISTRY.register("wierd_portal", () -> new WierdPortalBlock());
	public static final DeferredBlock<Block> NOISEBLOCK = REGISTRY.register("noiseblock", () -> new NoiseblockBlock());
	public static final DeferredBlock<Block> EYESSEEMEBLOCK = REGISTRY.register("eyesseemeblock", () -> new EyesseemeblockBlock());
	public static final DeferredBlock<Block> EYESWORLD_PORTAL =
			REGISTRY.register("eyesworld_portal", () -> new EyesworldPortalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
