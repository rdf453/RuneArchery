package dev.rdf453.RuneCraft.Rune.FreyjaAettir;

import dev.rdf453.RuneCraft.Rune.BaseRune;
import dev.rdf453.RuneCraft.api.Enum.ERuneTier;
import dev.rdf453.RuneCraft.api.rune.IRune;

/**
 * Gebo
 */
public class Gebo extends BaseRune {

    public Gebo() {
        super("Gebo", "ᚷ", ERuneTier.Divine);

    }


    @Override
    public void onBow() {
        //체력을 희생하여(하한선 1) 화살의 데미지,속도 증가
    }

    @Override
    public void onArrow() {
        //적중시 반경 10블럭 이내의 중립,적대 엔티티에 데미지 공유
    }

    
}