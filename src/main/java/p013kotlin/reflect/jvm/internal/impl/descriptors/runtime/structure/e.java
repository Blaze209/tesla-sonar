package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReflectJavaClass f87059a;

    public e(ReflectJavaClass reflectJavaClass) {
        this.f87059a = reflectJavaClass;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(ReflectJavaClass.c(this.f87059a, (Method) obj));
    }
}
