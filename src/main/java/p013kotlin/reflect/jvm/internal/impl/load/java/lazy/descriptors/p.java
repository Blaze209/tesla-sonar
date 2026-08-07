package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class p implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SimpleFunctionDescriptor f87378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LazyJavaClassMemberScope f87379b;

    public p(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f87378a = simpleFunctionDescriptor;
        this.f87379b = lazyJavaClassMemberScope;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.T0(this.f87378a, this.f87379b, (Name) obj);
    }
}
