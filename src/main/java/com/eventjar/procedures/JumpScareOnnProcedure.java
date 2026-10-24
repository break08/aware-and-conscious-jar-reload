package com.eventjar.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import com.eventjar.network.EventjarModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class JumpScareOnnProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event) {
		execute(event);
	}

	public static boolean execute() {
		return execute(null);
	}

	private static boolean execute(@Nullable Event event) {
		if (EventjarModVariables.guibool == true) {
			return true;
		}
		return false;
	}
}
