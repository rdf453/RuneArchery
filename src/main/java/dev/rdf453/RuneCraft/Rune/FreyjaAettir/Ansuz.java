package dev.rdf453.RuneCraft.Rune.FreyjaAettir;

import dev.rdf453.RuneCraft.Rune.BaseRune;
import dev.rdf453.RuneCraft.api.Enum.ERuneTier;

public class Ansuz extends BaseRune {

    public Ansuz() {
        super("Ansuz", "ᚨ", ERuneTier.Divine);
    }

    @Override
    public void onArrow() {

        // 궁니르: 
        // 적중 대상 마나 몰수

    }

    @Override
    public void onBow() {
        // 차징중 마나무한
        // 명중 할때 마다 플레이어가 장착 중인 다른 스킬이나 룬의 쿨타임이 싹 초기화
        // 오딘의 안광: 활을 당기는 동안 주변(벽 뒤 포함)의 모든 적대적 엔티티를 투시(Glow)하며 차징중 모든 블럭 투명화 및 조준선에 일치하는 대상에게 무조건적으로 적중
        // 적들의 버프와 은신 상태를 강제로 해제하고 시야를 지배함
    }

}
// • ᚨ — Ansuz (안수즈)
// • 뜻: 신 / 입 (God / Mouth) 아스가르드의 신(오딘), 전령, 지혜/소통
// • 상징: 주신 오딘의 계시, 지혜, 의사소통, 영감, 주문, 말의 힘 신성한 영감, 주문, 언어, 지혜