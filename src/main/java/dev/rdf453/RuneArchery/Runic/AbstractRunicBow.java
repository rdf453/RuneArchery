package dev.rdf453.RuneArchery.Runic;

import dev.rdf453.RuneArchery.api.Runic.IRunic;
import dev.rdf453.RuneArchery.api.rune.IRuneHolder;
import net.minecraft.world.item.ProjectileWeaponItem;



public abstract class AbstractRunicBow extends ProjectileWeaponItem implements IRunic,IRuneHolder {
    
    public AbstractRunicBow(Properties prob) {
        super(prob);
    }
}
