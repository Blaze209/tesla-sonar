package io.sentry.android.core;

import android.os.Debug;
import io.sentry.o3;

/* JADX INFO: loaded from: classes9.dex */
public class c0 implements io.sentry.v0 {
    @Override // io.sentry.v0
    public void c() {
    }

    @Override // io.sentry.v0
    public void d(o3 o3Var) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        o3Var.f(Long.valueOf(jFreeMemory));
        o3Var.g(Long.valueOf(nativeHeapSize));
    }
}
