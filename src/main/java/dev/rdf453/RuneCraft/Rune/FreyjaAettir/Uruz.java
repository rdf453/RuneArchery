package dev.rdf453.RuneCraft.Rune.FreyjaAettir;

import dev.rdf453.RuneCraft.Rune.BaseRune;
import dev.rdf453.RuneCraft.api.Enum.ERuneTier;
import dev.rdf453.RuneCraft.api.rune.IRune;

/**
 * Uruz
 */
public class Uruz extends BaseRune {

    public Uruz() {
        super("Uruz","ᚢ",ERuneTier.Physical);
    }

    @Override
    public void onBow() {
        //차징중 저항1 부여
    }

    @Override
    public void onArrow() {
       //차징중 맞은 데미지를 화살에 추가
    }


}