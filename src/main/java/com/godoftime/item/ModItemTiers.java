package com.godoftime.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class ModItemTiers {

    public static final Tier ASTRAL = new Tier() {
        @Override
        public int getUses() {
            return -1; // effectively unbreakable
        }

        @Override
        public float getSpeed() {
            return 50.0F;
        }

        @Override
        public float getAttackDamageBonus() {
            // Flavor value only — the real "infinite damage" is enforced in AstralSwordItem#hurtEnemy.
            return 2000.0F;
        }

        @Override
        public TagKey<Block> getIncorrectBlocksForDrops() {
            return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
        }

        @Override
        public int getEnchantmentValue() {
            return 30;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.EMPTY;
        }
    };
}
