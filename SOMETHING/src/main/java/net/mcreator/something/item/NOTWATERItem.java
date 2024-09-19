
package net.mcreator.something.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.something.init.SomethingModFluids;

public class NOTWATERItem extends BucketItem {
	public NOTWATERItem() {
		super(SomethingModFluids.NOTWATER.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
