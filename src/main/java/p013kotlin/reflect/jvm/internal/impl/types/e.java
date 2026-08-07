package p013kotlin.reflect.jvm.internal.impl.types;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f88982a;

    public e(AbstractTypeConstructor abstractTypeConstructor) {
        this.f88982a = abstractTypeConstructor;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.v(this.f88982a, (AbstractTypeConstructor.b) obj);
    }
}
