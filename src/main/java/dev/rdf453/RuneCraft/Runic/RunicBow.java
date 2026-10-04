package dev.rdf453.RuneCraft.Runic;




public class RunicBow<C> extends AbstractRunicBow {
    // 
    // 태그에 RuneArchery:Runic Bow 를 넣어 부여되는 룬의 효과를 관리한다*//
    private final Class<C> originClass;

    public RunicBow(Class<C> originClass) {
        this.originClass = originClass;
    }

    public Class<C> getOriginClass() {
        return this.originClass;
    }
}
