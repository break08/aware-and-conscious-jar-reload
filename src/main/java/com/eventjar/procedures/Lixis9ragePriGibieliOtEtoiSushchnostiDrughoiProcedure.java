package com.eventjar.procedures;

import net.minecraft.world.entity.Entity;

public class Lixis9ragePriGibieliOtEtoiSushchnostiDrughoiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
