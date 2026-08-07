package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class p implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KotlinTypeRefiner f89028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LazyWrappedType f89029b;

    public p(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        this.f89028a = kotlinTypeRefiner;
        this.f89029b = lazyWrappedType;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyWrappedType.d(this.f89028a, this.f89029b);
    }
}
