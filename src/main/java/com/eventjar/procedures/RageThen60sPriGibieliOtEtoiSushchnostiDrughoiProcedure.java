package com.eventjar.procedures;

import net.minecraft.world.entity.Entity;

public class RageThen60sPriGibieliOtEtoiSushchnostiDrughoiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
