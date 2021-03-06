
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
public class MegaEnrichedDiamondHoeItem extends NewOresModElements.ModElement {
	@ObjectHolder("new_ores:mega_enriched_diamond_hoe")
	public static final Item block = null;

	public MegaEnrichedDiamondHoeItem(NewOresModElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 3072;
			}

			public float getEfficiency() {
				return 18f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 12;
			}

			public int getEnchantability() {
				return 84;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MegaEnrichedDiamondItem.block));
			}
		}, 0, -3f, new Item.Properties().group(NewOresItemGroup.tab)) {
		}.setRegistryName("mega_enriched_diamond_hoe"));
	}
}
