package dev.rdf453.RuneCraft.Mixin.Archery;

import javax.annotation.Nullable;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import dev.rdf453.RuneCraft.Helper.RuneHelper;
import dev.rdf453.RuneCraft.Registry.RuneDataComponents;
import dev.rdf453.RuneCraft.Runic.AbstractRunicArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

@Mixin (AbstractArrow.class)
public class AbstractArrowMixin {
    

    @Inject(method = "shoot",at = @At("TAIL"), cancellable = true )
    private void isRunicArrow(Level level, ItemStack itemStack, LivingEntity owner, @Nullable ItemStack firedFromWeapon) {
        var a = RuneHelper.readRuneIds(itemStack);
        if(!a.isEmpty() && a != null) {
            AbstractRunicArrow.activation(); //헬퍼로 만들고 this로 대충 알아 하쇼
        }
    }
}
