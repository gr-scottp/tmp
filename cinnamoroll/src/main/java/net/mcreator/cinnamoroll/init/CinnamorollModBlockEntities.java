
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cinnamoroll.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.cinnamoroll.block.entity.WinterLandBlockEntity;
import net.mcreator.cinnamoroll.block.entity.LoLBlockEntity;
import net.mcreator.cinnamoroll.CinnamorollMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CinnamorollModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, CinnamorollMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> WINTER_LAND = register("winter_land", CinnamorollModBlocks.WINTER_LAND, WinterLandBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> LO_L = register("lo_l", CinnamorollModBlocks.LO_L, LoLBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WINTER_LAND.get(), (blockEntity, side) -> ((WinterLandBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, LO_L.get(), (blockEntity, side) -> ((LoLBlockEntity) blockEntity).getItemHandler());
	}
}
