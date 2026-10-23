package dev.rdf453.RuneArchery.Rune.HeimdallAettir;

import dev.rdf453.RuneArchery.api.rune.IRune;

/**
 * Perthro
 * • ᛈ — Perthro (페르트로)
	• 뜻: 주사위 통 / 비밀 (Dice cup / Secret)
	• 상징: 무엇이 나올지 모르는 주사위 컵, 운명, 확률, 비밀, 미지의 가능성
 */
public class Perthro extends IRune {

    @Override 
    public int getManaUsage() {
        return MYTHIC;
    }
}