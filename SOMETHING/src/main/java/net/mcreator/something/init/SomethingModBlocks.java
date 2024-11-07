
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.something.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.something.block.VoldemortIsStealingMyShampooBlock;
import net.mcreator.something.block.OverunderPortalBlock;
import net.mcreator.something.block.NOTWATERBlock;
import net.mcreator.something.block.JUSTINBEBEBlock;
import net.mcreator.something.SomethingMod;

public class SomethingModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SomethingMod.MODID);
	public static final DeferredBlock<Block> JUSTINBEBE = REGISTRY.register("justinbebe", JUSTINBEBEBlock::new);
	public static final DeferredBlock<Block> NOTWATER = REGISTRY.register("notwater", NOTWATERBlock::new);
	public static final DeferredBlock<Block> OVERUNDER_PORTAL = REGISTRY.register("overunder_portal", OverunderPortalBlock::new);
	public static final DeferredBlock<Block> VOLDEMORT_IS_STEALING_MY_SHAMPOO = REGISTRY.register("voldemort_is_stealing_my_shampoo", VoldemortIsStealingMyShampooBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
