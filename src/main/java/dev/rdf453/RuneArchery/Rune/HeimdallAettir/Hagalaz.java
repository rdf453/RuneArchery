package dev.rdf453.RuneArchery.Rune.HeimdallAettir;

import dev.rdf453.RuneArchery.api.Enum.ERuneTier;
import dev.rdf453.RuneArchery.common.BaseRune;


/**
 * Hagalaz
 * • ᚺ — Hagalaz (하갈라즈)
	• 뜻: 우박 (Hail)
	• 상징: 하늘에서 떨어지는 얼음 파편, 예기치 못한 재앙, 파괴, 변화를 위한 붕괴
 */
public class Hagalaz extends BaseRune {

    public Hagalaz() {
        super("Hagalaz","ᚺ",ERuneTier.Spiritual);
    }

    @Override
    public void onBow() {
        //
    }

    @Override
    public void onArrow() {
        //화살 분열
    }


}