
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.erikmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.erikmod.block.entity.ErikytuBlockEntity;
import net.mcreator.erikmod.block.entity.ErikBlocksBlockEntity;
import net.mcreator.erikmod.ErikmodMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ErikmodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, ErikmodMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ERIK_BLOCKS = register("erik_blocks", ErikmodModBlocks.ERIK_BLOCKS, ErikBlocksBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ERIKYTU = register("erikytu", ErikmodModBlocks.ERIKYTU, ErikytuBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ERIK_BLOCKS.get(), (blockEntity, side) -> ((ErikBlocksBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ERIKYTU.get(), (blockEntity, side) -> ((ErikytuBlockEntity) blockEntity).getItemHandler());
	}
}
