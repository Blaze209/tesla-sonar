package p013kotlin.reflect.jvm.internal.impl.types;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f89012a;

    public h(AbstractTypeConstructor abstractTypeConstructor) {
        this.f89012a = abstractTypeConstructor;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.y(this.f89012a, (TypeConstructor) obj);
    }
}
