package dev.rdf453.RuneCraft.Mixin.Archery;

import javax.annotation.Nullable;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import dev.rdf453.RuneCraft.Archery.Helper.RunicArrowHelper;
import dev.rdf453.RuneCraft.Helper.RuneHelper;
import dev.rdf453.RuneCraft.Registry.RuneAttachments;
import dev.rdf453.RuneCraft.Registry.RuneDataComponents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

@Mixin (AbstractArrow.class)
public class AbstractArrowMixin {
    

    @Inject(method = "shoot",at = @At("TAIL") )
    private void isRunicArrow(Level level, ItemStack itemStack, LivingEntity owner, @Nullable ItemStack firedFromWeapon) {
        var a = RuneHelper.readRuneIds(itemStack);
        if(!a.isEmpty() && a != null) {
            AbstractArrow arrow = (AbstractArrow) (Object) this;
            var temp = arrow.getPickupItemStackOrigin().get(RuneDataComponents.RUNES.get());
            arrow.setData(RuneAttachments.RUNES.get(), temp);// attachment 선언 필요

            RunicArrowHelper.activation(itemStack,arrow); 


        }
    }
}
