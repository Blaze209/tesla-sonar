package p013kotlin.reflect.jvm.internal.impl.load.java.lazy;

import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f87248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Annotations f87249b;

    public b(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        this.f87248a = lazyJavaResolverContext;
        this.f87249b = annotations;
    }

    @Override // wn0.a
    public Object invoke() {
        return ContextKt.e(this.f87248a, this.f87249b);
    }
}
