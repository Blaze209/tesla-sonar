package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class c0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f87350a;

    public c0(LazyJavaScope lazyJavaScope) {
        this.f87350a = lazyJavaScope;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return LazyJavaScope.x(this.f87350a, (Name) obj);
    }
}
