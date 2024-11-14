
package net.mcreator.oogaboogablockgen.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ThankYouForPayingYourFanumTaxItem extends Item {
	public ThankYouForPayingYourFanumTaxItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 100f;
	}
}
