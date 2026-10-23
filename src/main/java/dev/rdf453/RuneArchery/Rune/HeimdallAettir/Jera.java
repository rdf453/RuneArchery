package dev.rdf453.RuneArchery.Rune.HeimdallAettir;

import dev.rdf453.RuneArchery.api.Enum.ERuneTier;
import dev.rdf453.RuneArchery.common.BaseRune;

/**
 * Jera
 * • ᛃ — Jera (예라)
	• 뜻: 수확 / 1년 (Year / Harvest)
	• 상징: 시간이 흘러 얻는 결실, 인과응보, 주기적인 반복, 노력의 대가
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