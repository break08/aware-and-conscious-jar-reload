package com.eventjar.init;
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */


import com.eventjar.init.EventjarModEntities;


import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

import static com.eventjar.Eventjar.MODID;

@EventBusSubscriber(modid = MODID, value = Dist.CLIENT)
public class EventjarModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EventjarModEntities.MEETBOY.get(), MeetboyRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.WHOAMI.get(), WhoamiRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.ERRUNDEFINE.get(), ErrundefineRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.ENTITY_000125.get(), Entity000125Renderer::new);
		event.registerEntityRenderer(EventjarModEntities.ENTITYWHOWATCHYOU.get(), EntitywhowatchyouRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.ENTITY_CENTIPEDE.get(), EntityCentipedeRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.LIXIS_9.get(), Lixis9Renderer::new);
		event.registerEntityRenderer(EventjarModEntities.RAGE_THEN_60S.get(), RageThen60sRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.MEETBOYFAST.get(), MeetboyfastRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.CARETAKER.get(), CaretakerRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.GOD.get(), GodRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.PLAYER.get(), PlayerRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.EYES.get(), EyesRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.EYE.get(), EyeRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.CAVEMEETBOY.get(), CavemeetboyRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.INVISIBLE_WEIRD_ENTITY.get(), InvisibleWeirdEntityRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.NOISE_ENTITY.get(), NoiseEntityRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.INVISIBLE_DIST.get(), InvisibleDistRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.SEEKER.get(), SeekerRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.SEEKERACT.get(), SeekeractRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.WATCHER.get(), WatcherRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.MEETBOY_LONG.get(), MeetboyLongRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.FAULT.get(), FaultRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.SCAVENGER.get(), ScavengerRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.MEATBOYDISTORTED.get(), MeatboydistortedRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.EYESINDARK.get(), EyesindarkRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.SON_OFGOD.get(), SonOfgodRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.DEFAULT_VILLAGER.get(), DefaultVillagerRenderer::new);
		event.registerEntityRenderer(EventjarModEntities.SCARY_DEFAULT_VILLAGER.get(), ScaryDefaultVillagerRenderer::new);
	}
}
