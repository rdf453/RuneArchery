package dev.rdf453.RuneArchery.Rune.FreyjaAettir;

import dev.rdf453.RuneArchery.api.Enum.ERuneTier;
import dev.rdf453.RuneArchery.common.BaseRune;


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