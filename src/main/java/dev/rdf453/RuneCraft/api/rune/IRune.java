package dev.rdf453.RuneCraft.api.rune;

import dev.rdf453.RuneCraft.api.Enum.ERuneTier;
import dev.rdf453.RuneCraft.api.Enum.Elements;

public interface IRune {

    String getSymbol();

    ERuneTier getTier();
    void onArrowShoot();
    void onArrowFly();
    void onArrowHit();
    //상극 룬
    Elements getOpposite();
    //반발
    boolean conflictsWith(Elements other);
    
    
}