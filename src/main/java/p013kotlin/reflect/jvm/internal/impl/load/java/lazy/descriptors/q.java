package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f87380a;

    public q(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f87380a = lazyJavaClassMemberScope;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.o0(this.f87380a, (Name) obj);
    }
}
