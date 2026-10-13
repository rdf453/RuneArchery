package dev.rdf453.RuneCraft.Rune.FreyjaAettir;

import dev.rdf453.RuneCraft.Rune.BaseRune;
import dev.rdf453.RuneCraft.api.Enum.ERuneTier;
import dev.rdf453.RuneCraft.api.Enum.Elements;

public class Fehu extends BaseRune {

    public Fehu() {
        super(ERuneTier.Physical, Elements.NATURE, Elements.FLOW, Elements.FERTILITY, Elements.ENERGY);
    }

    @Override
    public String getSymbol() {
        return "ᚠ";
    }

    @Override
    public void onArrowShoot() {
        // 화살이 3개로 분열
    }

    @Override
    public void onArrowFly() {

    }

    @Override
    public void onArrowHit() {
        // 약탈적용 및 전리품이 발사자에게 이동
    }

    @Override
    public Elements getOpposite() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOpposite'");
    }

    @Override
    public boolean conflictsWith(Elements other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'conflictsWith'");
    }

    @Override
    public void onCharge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onCharge'");
    }

    @Override
    public void completeCharge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'completeCharge'");
    }

}
// *• ᚠ — Fehu (페후)
// • 뜻: 가축 (Cattle)
// • 상징: 가축이 곧 자산이던 시절의
// 부, 풍요, 움직이는 재산, 시작되는 에너지 에너지의 순환
// 아몰라 이제부터 이건 활잽이 모드다*/