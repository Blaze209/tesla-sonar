package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class y implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f87390a;

    public y(LazyJavaScope lazyJavaScope) {
        this.f87390a = lazyJavaScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaScope.m(this.f87390a);
    }
}
