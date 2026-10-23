package dev.rdf453.RuneArchery.Rune.FreyjaAettir;

import dev.rdf453.RuneArchery.api.Enum.ERuneTier;
import dev.rdf453.RuneArchery.common.BaseRune;

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