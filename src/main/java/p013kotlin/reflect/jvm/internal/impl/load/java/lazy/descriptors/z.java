package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.jvm.internal.n0;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class z implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f87391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaField f87392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f87393c;

    public z(LazyJavaScope lazyJavaScope, JavaField javaField, n0 n0Var) {
        this.f87391a = lazyJavaScope;
        this.f87392b = javaField;
        this.f87393c = n0Var;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaScope.R(this.f87391a, this.f87392b, this.f87393c);
    }
}
