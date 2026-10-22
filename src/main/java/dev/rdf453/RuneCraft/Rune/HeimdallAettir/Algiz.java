package dev.rdf453.RuneCraft.Rune.HeimdallAettir;

import dev.rdf453.RuneCraft.Rune.BaseRune;
import dev.rdf453.RuneCraft.api.Enum.ERuneTier;


/**
 * Algiz
 */
public class Algiz extends BaseRune {

    public Algiz() {
        super("Algiz","ᛉ",ERuneTier.Spiritual);
    }

    @Override
    public void onBow() {
        //차징중 날라오는 모든 투사체 삭제 로 아이아스!!!
        //
    }

    @Override
    public void onArrow() {
        //맞은 대상 저항 5 5초 부여
    }

    
    
}