package com.endremastered.endrem.mixin;

import net.minecraft.entity.EyeOfEnderEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(EyeOfEnderEntity.class)
public interface EyeOfEnderEntityAccessorMixin {
    @Accessor("dropsItem")
    public void setDropsItem(boolean dropsItem);

}