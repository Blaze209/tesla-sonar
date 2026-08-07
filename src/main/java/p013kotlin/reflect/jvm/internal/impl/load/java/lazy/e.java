package p013kotlin.reflect.jvm.internal.impl.load.java.lazy;

import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaTypeParameterResolver f87394a;

    public e(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver) {
        this.f87394a = lazyJavaTypeParameterResolver;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return LazyJavaTypeParameterResolver.b(this.f87394a, (JavaTypeParameter) obj);
    }
}
