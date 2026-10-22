package dev.rdf453.RuneCraft.Rune.HeimdallAettir;

import dev.rdf453.RuneCraft.Rune.BaseRune;
import dev.rdf453.RuneCraft.api.Enum.ERuneTier;
import dev.rdf453.RuneCraft.api.rune.IRune;

/**
 * Eihwaz
 */
public class Eihwaz extends BaseRune {

    public Eihwaz() {
        super("Eihwaz", "ᛇ", ERuneTier.Spiritual);
    }

    @Override 
    public void onBow() {
        
        //차징 중 처음 확정 두번째부턴 50%의 죽음 면역 및 죽을 때 마다 데미지 500% 증가 죽을때 마다 마나 사용 
        // 5번째부턴 화살이 기본뎀 + 최대체력 퍼뎀으로 들어감
        //패시브: 활 강화 재료의 한계보다 룬을 더 넣을 수 있게 해줌
    }

    @Override
    public void onArrow() {
        //적중 대상 재생10 2초
    }
    
}