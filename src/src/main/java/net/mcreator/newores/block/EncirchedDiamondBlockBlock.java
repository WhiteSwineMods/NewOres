
package net.mcreator.newores.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.newores.itemgroup.NewOresItemGroup;
import net.mcreator.newores.NewOresModElements;

import java.util.List;
import java.util.Collections;

@NewOresModElements.ModElement.Tag
public class EncirchedDiamondBlockBlock extends NewOresModElements.ModElement {
	@ObjectHolder("new_ores:encirched_diamond_block")
	public static final Block block = null;
	public EncirchedDiamondBlockBlock(NewOresModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(NewOresItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 10f).setLightLevel(s -> 0).harvestLevel(10)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("encirched_diamond_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
