
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.something.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.something.block.entity.VoldemortIsStealingMyShampooBlockEntity;
import net.mcreator.something.block.entity.JUSTINBEBEBlockEntity;
import net.mcreator.something.SomethingMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SomethingModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, SomethingMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> JUSTINBEBE = register("justinbebe", SomethingModBlocks.JUSTINBEBE, JUSTINBEBEBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> VOLDEMORT_IS_STEALING_MY_SHAMPOO = register("voldemort_is_stealing_my_shampoo", SomethingModBlocks.VOLDEMORT_IS_STEALING_MY_SHAMPOO,
			VoldemortIsStealingMyShampooBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, JUSTINBEBE.get(), (blockEntity, side) -> ((JUSTINBEBEBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, VOLDEMORT_IS_STEALING_MY_SHAMPOO.get(), (blockEntity, side) -> ((VoldemortIsStealingMyShampooBlockEntity) blockEntity).getItemHandler());
	}
}
