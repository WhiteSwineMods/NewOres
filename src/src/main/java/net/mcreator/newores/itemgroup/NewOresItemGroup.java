
package net.mcreator.newores.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.newores.item.EncirchedDiamondItem;
import net.mcreator.newores.NewOresModElements;

@NewOresModElements.ModElement.Tag
public class NewOresItemGroup extends NewOresModElements.ModElement {
	public NewOresItemGroup(NewOresModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnew_ores") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EncirchedDiamondItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
