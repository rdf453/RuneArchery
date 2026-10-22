package dev.rdf453.RuneCraft.Rune.HeimdallAettir;

import dev.rdf453.RuneCraft.Rune.BaseRune;
import dev.rdf453.RuneCraft.api.Enum.ERuneTier;

/**
 * Jera
 */
public class Jera extends BaseRune {

    public Jera() {
        super("Jera", "ᛃ", ERuneTier.Physical);
    }

    @Override
    public void onBow() {
        //차지 시간에 비례한 데미지,사용 마나 증가,받는 데미지 2배 증가
    }

    @Override
    public void onArrow() {
        //룬 발현 반복 1회
    }
    
}