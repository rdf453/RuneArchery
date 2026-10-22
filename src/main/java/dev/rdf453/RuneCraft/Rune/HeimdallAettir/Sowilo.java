package dev.rdf453.RuneCraft.Rune.HeimdallAettir;

import dev.rdf453.RuneCraft.Rune.BaseRune;
import dev.rdf453.RuneCraft.api.Enum.ERuneTier;
import dev.rdf453.RuneCraft.api.rune.IRune;

/**
 * Sowilo
 */
public class Sowilo extends BaseRune {

    public Sowilo() {
        super("Sowilo", "ᛊ", ERuneTier.Divine);
    }

    @Override
    public void onBow() {
        //패시브: 주변 언데드에게 초당 최대체력 25%의 데미지
        //오마주: 갓 에스카노르, 정오에 가까워 질수록 플레이어는 강해짐
    }

    @Override
    public void onArrow() {
        //적중시 
        // 언데드면 즉사 
        // 승리의 서광: 화살이 적중할 때마다 이동/차징/공격 속도가 중첩하여 폭발적으로 증가 (최대 중첩 시 태양의 광륜 전개)
        // 태양의 낙인: 꺼지지 않는 불데미지 부여-데미지가 들어갈수록 피해량 1씩 증가
    }
}