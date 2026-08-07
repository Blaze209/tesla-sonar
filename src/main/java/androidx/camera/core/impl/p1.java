package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class p1 implements o3<c0.r0>, r1, k0.f {
    public static final x0.a<Integer> L;
    public static final x0.a<Integer> M;
    public static final x0.a<u0> N;
    public static final x0.a<Integer> O;
    public static final x0.a<Integer> P;
    public static final x0.a<Integer> Q;
    public static final x0.a<c0.w0> R;
    public static final x0.a<Boolean> S;
    public static final x0.a<Integer> T;
    public static final x0.a<Integer> U;
    public static final x0.a<c0.r0.i> V;
    public static final x0.a<s0.c> W;
    public static final x0.a<Boolean> X;
    private final i2 K;

    static {
        Class cls = Integer.TYPE;
        L = x0.a.a("camerax.core.imageCapture.captureMode", cls);
        M = x0.a.a("camerax.core.imageCapture.flashMode", cls);
        N = x0.a.a("camerax.core.imageCapture.captureBundle", u0.class);
        O = x0.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        P = x0.a.a("camerax.core.imageCapture.outputFormat", Integer.class);
        Q = x0.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        R = x0.a.a("camerax.core.imageCapture.imageReaderProxyProvider", c0.w0.class);
        S = x0.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        T = x0.a.a("camerax.core.imageCapture.flashType", cls);
        U = x0.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        V = x0.a.a("camerax.core.imageCapture.screenFlash", c0.r0.i.class);
        W = x0.a.a("camerax.core.useCase.postviewResolutionSelector", s0.c.class);
        X = x0.a.a("camerax.core.useCase.isPostviewEnabled", Boolean.class);
    }

    public p1(@NonNull i2 i2Var) {
        this.K = i2Var;
    }

    public u0 Z(u0 u0Var) {
        return (u0) d(N, u0Var);
    }

    public int a0() {
        return ((Integer) a(L)).intValue();
    }

    public int b0(int i11) {
        return ((Integer) d(M, Integer.valueOf(i11))).intValue();
    }

    public int c0(int i11) {
        return ((Integer) d(T, Integer.valueOf(i11))).intValue();
    }

    public c0.w0 d0() {
        return (c0.w0) d(R, null);
    }

    public Executor e0(Executor executor) {
        return (Executor) d(k0.f.G, executor);
    }

    public int f0() {
        return ((Integer) a(U)).intValue();
    }

    public c0.r0.i g0() {
        return (c0.r0.i) d(V, null);
    }

    @Override // androidx.camera.core.impl.s2
    @NonNull
    public x0 getConfig() {
        return this.K;
    }

    @Override // androidx.camera.core.impl.q1
    public int getInputFormat() {
        return ((Integer) a(q1.f3281h)).intValue();
    }

    public boolean h0() {
        return e(L);
    }
}
