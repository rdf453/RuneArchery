package dev.rdf453.RuneCraft.api.rune;

import java.util.EnumSet;
import java.util.Set;

import dev.rdf453.RuneCraft.api.Enum.Elements;
import dev.rdf453.RuneCraft.api.Enum.RuneTier;

public interface  IRune extends RuneTier {
    //룬 티어 속성 분리 필요
    protected final Set<Elements> elements;
    
    public IRune(Elements... elements) {
        if(elements.length == 0) {
            this.elements = EnumSet.noneOf(Elements.class);
        }
        else {
            this.elements = EnumSet.of(elements[0], elements);
        }
    }

    public String getSymbol(){
        return null;
    }

    public int getManaUsage(){
        return 0;
    }

    
    
}