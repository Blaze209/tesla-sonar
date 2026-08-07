package p013kotlin.reflect.jvm.internal.impl.types;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f89011a;

    public g(AbstractTypeConstructor abstractTypeConstructor) {
        this.f89011a = abstractTypeConstructor;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.x(this.f89011a, (KotlinType) obj);
    }
}
