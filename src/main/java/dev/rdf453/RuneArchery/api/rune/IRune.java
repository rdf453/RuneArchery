package dev.rdf453.RuneArchery.api.rune;

import dev.rdf453.RuneArchery.api.Enum.ERuneTier;


public interface IRune {

    String getRuneId();

    String getSymbol();

    ERuneTier getTier();


    void onBow();

    
    void onArrow();



}