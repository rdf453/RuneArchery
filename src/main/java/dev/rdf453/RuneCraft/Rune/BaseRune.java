package dev.rdf453.RuneCraft.Rune;

import java.util.EnumSet;
import java.util.Set;

import dev.rdf453.RuneCraft.api.Enum.ERuneTier;
import dev.rdf453.RuneCraft.api.Enum.Elements;
import dev.rdf453.RuneCraft.api.rune.IRune;

public abstract class BaseRune implements IRune{
    protected final ERuneTier runeTier;

    protected final Set<Elements> elements;
    public BaseRune (ERuneTier tier,Elements... elements) {
        this.runeTier = tier;
        if(elements.length == 0) {
            this.elements = EnumSet.noneOf(Elements.class);
        }
        else {
            this.elements = EnumSet.of(elements[0], elements);
        }
    }

    @Override
    public String getSymbol() {
        return "";
    }

    
    @Override
    public ERuneTier getTier() {
        return runeTier;
    }

    public int getManaCost() {
        return this.runeTier.getMana();
    }
}
