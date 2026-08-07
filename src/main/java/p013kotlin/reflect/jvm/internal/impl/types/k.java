package p013kotlin.reflect.jvm.internal.impl.types;

import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f89016a;

    public k(l lVar) {
        this.f89016a = lVar;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return IntersectionTypeConstructor.f(this.f89016a, (KotlinType) obj);
    }
}
