package dev.rdf453.RuneArchery.Rune.HeimdallAettir;

import dev.rdf453.RuneArchery.api.Enum.ERuneTier;
import dev.rdf453.RuneArchery.common.BaseRune;


/**
 * Isa
 * • ᛁ — Isa (이사)
	• 뜻: 얼음 (Ice)
	• 상징: 모든 것을 얼리는 추위, 정지, 정체, 차가움, 보존, 감정의 억제
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