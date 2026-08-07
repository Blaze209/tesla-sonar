package com.facebook.jni;

import bp.a;
import com.facebook.jni.annotations.DoNotStrip;

/* JADX INFO: loaded from: classes3.dex */
@DoNotStrip
public class ThreadScopeSupport {
    static {
        a.d("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j11) {
        runStdFunctionImpl(j11);
    }

    private static native void runStdFunctionImpl(long j11);
}
