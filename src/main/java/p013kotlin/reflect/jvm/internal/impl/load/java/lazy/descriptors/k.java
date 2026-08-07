package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class k implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f87366a;

    public k(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f87366a = lazyJavaClassMemberScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaClassMemberScope.U0(this.f87366a);
    }
}
