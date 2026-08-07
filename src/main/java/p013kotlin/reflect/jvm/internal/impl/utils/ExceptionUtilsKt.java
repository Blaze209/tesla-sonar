package p013kotlin.reflect.jvm.internal.impl.utils;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class ExceptionUtilsKt {
    public static final boolean isProcessCanceledException(Throwable th2) {
        s.k(th2, "<this>");
        Class<?> superclass = th2.getClass();
        while (!s.f(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException rethrow(Throwable e11) throws Throwable {
        s.k(e11, "e");
        throw e11;
    }
}
