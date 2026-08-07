package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class o1 implements o3<androidx.camera.core.f>, r1, k0.l {
    public static final x0.a<Integer> L = x0.a.a("camerax.core.imageAnalysis.backpressureStrategy", androidx.camera.core.f.b.class);
    public static final x0.a<Integer> M = x0.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final x0.a<c0.w0> N = x0.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", c0.w0.class);
    public static final x0.a<Integer> O = x0.a.a("camerax.core.imageAnalysis.outputImageFormat", androidx.camera.core.f.e.class);
    public static final x0.a<Boolean> P = x0.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);
    public static final x0.a<Boolean> Q = x0.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);
    private final i2 K;

    public o1(@NonNull i2 i2Var) {
        this.K = i2Var;
    }

    public int Z(int i11) {
        return ((Integer) d(L, Integer.valueOf(i11))).intValue();
    }

    public int a0(int i11) {
        return ((Integer) d(M, Integer.valueOf(i11))).intValue();
    }

    public c0.w0 b0() {
        return (c0.w0) d(N, null);
    }

    public Boolean c0(Boolean bool) {
        return (Boolean) d(P, bool);
    }

    public int d0(int i11) {
        return ((Integer) d(O, Integer.valueOf(i11))).intValue();
    }

    public Boolean e0(Boolean bool) {
        return (Boolean) d(Q, bool);
    }

    @Override // androidx.camera.core.impl.s2
    @NonNull
    public x0 getConfig() {
        return this.K;
    }

    @Override // androidx.camera.core.impl.q1
    public int getInputFormat() {
        return 35;
    }
}
