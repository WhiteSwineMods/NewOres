
package net.mcreator.newores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.newores.itemgroup.NewOresItemGroup;
import net.mcreator.newores.NewOresModElements;

@NewOresModElements.ModElement.Tag
public class EncirchedDiamondShovelItem extends NewOresModElements.ModElement {
	@ObjectHolder("new_ores:encirched_diamond_shovel")
	public static final Item block = null;
	public EncirchedDiamondShovelItem(NewOresModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(EncirchedDiamondItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(NewOresItemGroup.tab)) {
		}.setRegistryName("encirched_diamond_shovel"));
	}
}
