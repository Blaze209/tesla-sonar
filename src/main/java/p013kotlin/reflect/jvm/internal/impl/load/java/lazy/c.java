package p013kotlin.reflect.jvm.internal.impl.load.java.lazy;

import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaAnnotations f87250a;

    public c(LazyJavaAnnotations lazyJavaAnnotations) {
        this.f87250a = lazyJavaAnnotations;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return LazyJavaAnnotations.d(this.f87250a, (JavaAnnotation) obj);
    }
}
