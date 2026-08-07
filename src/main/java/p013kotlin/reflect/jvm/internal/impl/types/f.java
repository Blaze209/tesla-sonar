package p013kotlin.reflect.jvm.internal.impl.types;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f89010a;

    public f(AbstractTypeConstructor abstractTypeConstructor) {
        this.f89010a = abstractTypeConstructor;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.w(this.f89010a, (TypeConstructor) obj);
    }
}
