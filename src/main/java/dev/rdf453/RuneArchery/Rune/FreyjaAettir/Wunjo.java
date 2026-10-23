package dev.rdf453.RuneArchery.Rune.FreyjaAettir;

import dev.rdf453.RuneArchery.api.Enum.ERuneTier;
import dev.rdf453.RuneArchery.common.BaseRune;


public class Wunjo extends BaseRune {

    public Wunjo() {
        super("Wunjo","ᚹ",ERuneTier.Mental);
    }

    @Override
    public void onBow() {
        //명중 시 기쁨 스택을 쌓고 스택에 따라 이속,차징속도 증가
        //패시브 행운 증가
    }

    @Override
    public void onArrow() {
        //명중 후 사살 시 기쁨의 파동이 일어나 파동에 맞은 플레이어는 짧은 재생 및 마나 회복 부여
    }
}