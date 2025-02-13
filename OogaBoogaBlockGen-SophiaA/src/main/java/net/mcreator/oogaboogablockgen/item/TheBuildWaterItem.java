
package net.mcreator.oogaboogablockgen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModFluids;

public class TheBuildWaterItem extends BucketItem {
	public TheBuildWaterItem() {
		super(OogaboogablockgenModFluids.THE_BUILD_WATER.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}
}
