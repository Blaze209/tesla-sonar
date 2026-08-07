package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.jvm.internal.n0;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class a0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f87344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaField f87345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f87346c;

    public a0(LazyJavaScope lazyJavaScope, JavaField javaField, n0 n0Var) {
        this.f87344a = lazyJavaScope;
        this.f87345b = javaField;
        this.f87346c = n0Var;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaScope.S(this.f87344a, this.f87345b, this.f87346c);
    }
}
