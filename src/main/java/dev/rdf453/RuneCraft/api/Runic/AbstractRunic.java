package dev.rdf453.RuneCraft.api.Runic;

public abstract class AbstractRunic<C> {
    private final Class<C> originClass;
    //*C: 룬 클래스
    // 이 추상 클래스는 룬의 적용, 태그등을 관리한다 */

    public AbstractRunic(Class<C> originClass) {
        this.originClass=originClass;
    }

    public Class<C> getOriginClass() {
        return this.originClass;
    }
}
