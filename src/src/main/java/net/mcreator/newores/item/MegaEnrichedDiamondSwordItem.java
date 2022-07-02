
package net.mcreator.newores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.newores.itemgroup.NewOresItemGroup;
import net.mcreator.newores.NewOresModElements;

@NewOresModElements.ModElement.Tag
public class MegaEnrichedDiamondSwordItem extends NewOresModElements.ModElement {
	@ObjectHolder("new_ores:mega_enriched_diamond_sword")
	public static final Item block = null;
	public MegaEnrichedDiamondSwordItem(NewOresModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(MegaEnrichedDiamondItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(NewOresItemGroup.tab)) {
		}.setRegistryName("mega_enriched_diamond_sword"));
	}
}
