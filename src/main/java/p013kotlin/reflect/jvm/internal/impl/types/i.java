package p013kotlin.reflect.jvm.internal.impl.types;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f89013a;

    public i(AbstractTypeConstructor abstractTypeConstructor) {
        this.f89013a = abstractTypeConstructor;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.z(this.f89013a, (KotlinType) obj);
    }
}
