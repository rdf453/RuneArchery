package dev.rdf453.RuneCraft.Runic;

import dev.rdf453.RuneCraft.api.Runic.IRunic;
import dev.rdf453.RuneCraft.api.rune.IRuneHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.level.Level;

public abstract class AbstractRunicArrow extends AbstractArrow implements IRunic,IRuneHolder {
    
    public AbstractRunicArrow(EntityType<? extends AbstractRunicArrow> type, Level level){
        super(type,level);
    }
}
