package dev.rdf453.RuneCraft.Rune.HeimdallAettir;

import dev.rdf453.RuneCraft.Rune.BaseRune;
import dev.rdf453.RuneCraft.api.Enum.ERuneTier;


/**
 * Isa
 */
public class Isa extends BaseRune {

    public Isa() {
        super("Isa","ᛁ",ERuneTier.Mental);
    }

    @Override
    public void onBow() {
        // 
    }

    @Override
    public void onArrow() {
        //적중한 대상 5초 움직임 고정
    }

}