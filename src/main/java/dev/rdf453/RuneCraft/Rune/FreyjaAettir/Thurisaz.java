package dev.rdf453.RuneCraft.Rune.FreyjaAettir;

import dev.rdf453.RuneCraft.Rune.BaseRune;
import dev.rdf453.RuneCraft.api.Enum.ERuneTier;

/**
 * Thurisaz
 */
public class Thurisaz extends BaseRune {

    public Thurisaz() {
        super("Thurisaz", "ᚦ", ERuneTier.Spiritual);
    }

    // 투리사즈로 인해 소환된 번개에 파사의 공능 부여
    @Override
    public void onBow() {
        // 차징중 플레이어를 때린 대상에게 벼락

    }

    @Override
    public void onArrow() {
        // 지형지물 무시
    }

}