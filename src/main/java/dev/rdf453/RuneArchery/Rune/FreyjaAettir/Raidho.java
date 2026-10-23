package dev.rdf453.RuneArchery.Rune.FreyjaAettir;

import dev.rdf453.RuneArchery.api.Enum.ERuneTier;
import dev.rdf453.RuneArchery.common.BaseRune;

public class Raidho extends BaseRune {

    public Raidho() {
        super("Raidho","ᚱ",ERuneTier.Physical);
    }
    
    @Override 
    public void onArrow() {
        // 마지막으로 명중한 대상으로 유도
    }

    @Override 
    public void onBow() {
        //차징속도 증가
        //패시브: 소지시 이속 증가
    }

}