package dev.rdf453.RuneCraft.Runic;

import dev.rdf453.RuneCraft.api.Runic.IRunic;
import dev.rdf453.RuneCraft.api.rune.IRuneHolder;
import net.minecraft.world.item.ProjectileWeaponItem;



public abstract class AbstractRunicBow extends ProjectileWeaponItem implements IRunic,IRuneHolder {
    
    public AbstractRunicBow(Properties prob) {
        super(prob);
    }
}
