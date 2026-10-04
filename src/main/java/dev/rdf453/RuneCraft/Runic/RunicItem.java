package dev.rdf453.RuneCraft.Runic;


import dev.rdf453.RuneCraft.api.Runic.AbstractRunic;

public class RunicItem<C> extends AbstractRunic<T> {
    // C 에 들어가는 클래스는 룬이 부여 되기 전 아이템의 클래스를 의미한다
    // 태그에 RuneCraft:Runic C 를 넣어 부여되는 룬의 효과를 관리한다*//
    private final Class<C> originClass;

    public RunicItem(Class<C> originClass) {
        this.originClass = originClass;
    }

    public Class<C> getOriginClass() {
        return this.originClass;
    }
}
