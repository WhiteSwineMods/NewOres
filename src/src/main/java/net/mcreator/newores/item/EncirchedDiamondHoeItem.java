
package net.mcreator.newores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.newores.itemgroup.NewOresItemGroup;
import net.mcreator.newores.NewOresModElements;

@NewOresModElements.ModElement.Tag
public class EncirchedDiamondHoeItem extends NewOresModElements.ModElement {
	@ObjectHolder("new_ores:encirched_diamond_hoe")
	public static final Item block = null;

	public EncirchedDiamondHoeItem(NewOresModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EncirchedDiamondItem.block));
			}
		}, 0, -3f, new Item.Properties().group(NewOresItemGroup.tab)) {
		}.setRegistryName("encirched_diamond_hoe"));
	}
}
