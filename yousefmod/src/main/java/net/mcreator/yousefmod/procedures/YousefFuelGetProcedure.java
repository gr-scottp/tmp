package net.mcreator.yousefmod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class YousefFuelGetProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		return GetfuelProcedure.execute(world, x, y, z) + "fuel";
	}
}
