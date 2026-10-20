package dev.rdf453.RuneCraft.Rune.FreyjaAettir;

import dev.rdf453.RuneCraft.Rune.BaseRune;
import dev.rdf453.RuneCraft.api.Enum.ERuneTier;
import dev.rdf453.RuneCraft.api.rune.IRune;

/**
 * Thurisaz
 */
public class Thurisaz extends BaseRune {

    public Thurisaz() {
        super("Thurisaz","ᚦ",ERuneTier.Spiritual);
    }

    @Override
    public void onBow() {
        //차징중 때린 대상에게 벼락
    }

    @Override
    public void onArrow() {
        //지형지물 무시
    }

    
}