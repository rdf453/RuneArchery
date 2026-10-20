package dev.rdf453.RuneCraft.api.rune;

import dev.rdf453.RuneCraft.api.Enum.ERuneTier;


public interface IRune {

    String getRuneId();

    String getSymbol();

    ERuneTier getTier();


    void onBow();

    
    void onArrow();



}