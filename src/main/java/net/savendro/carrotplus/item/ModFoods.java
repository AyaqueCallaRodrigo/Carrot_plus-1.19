package net.savendro.carrotplus.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BAKED_CARROT = new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build();
    public static final FoodProperties YAM  = new FoodProperties.Builder().nutrition(3).saturationMod(0.3f).build();
    public static final FoodProperties BAKED_YAM  = new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build();
    public static final FoodProperties COPPERED_POTATO = new FoodProperties.Builder().nutrition(6).saturationMod(0.2f).effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 0), 1.0f).build();
}
