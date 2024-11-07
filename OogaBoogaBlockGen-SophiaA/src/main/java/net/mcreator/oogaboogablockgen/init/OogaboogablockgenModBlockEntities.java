
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.oogaboogablockgen.block.entity.OogaBoogaBlockGenBlockEntity;
import net.mcreator.oogaboogablockgen.block.entity.GoofyAhhBlockYIPPEEEBlockEntity;
import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class OogaboogablockgenModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, OogaboogablockgenMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> OOGA_BOOGA_BLOCK_GEN = register("ooga_booga_block_gen", OogaboogablockgenModBlocks.OOGA_BOOGA_BLOCK_GEN, OogaBoogaBlockGenBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GOOFY_AHH_BLOCK_YIPPEEE = register("goofy_ahh_block_yippeee", OogaboogablockgenModBlocks.GOOFY_AHH_BLOCK_YIPPEEE, GoofyAhhBlockYIPPEEEBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, OOGA_BOOGA_BLOCK_GEN.get(), (blockEntity, side) -> ((OogaBoogaBlockGenBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GOOFY_AHH_BLOCK_YIPPEEE.get(), (blockEntity, side) -> ((GoofyAhhBlockYIPPEEEBlockEntity) blockEntity).getItemHandler());
	}
}
