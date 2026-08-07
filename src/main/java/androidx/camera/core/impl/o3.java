package androidx.camera.core.impl;

import android.util.Range;
import androidx.annotation.NonNull;
import c0.a2;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface o3<T extends c0.a2> extends k0.k<T>, q1 {
    public static final x0.a<Boolean> A;
    public static final x0.a<Boolean> B;
    public static final x0.a<p3.b> C;
    public static final x0.a<Integer> D;
    public static final x0.a<Integer> E;
    public static final x0.a<e0.a1.b> F;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final x0.a<x2> f3266u = x0.a.a("camerax.core.useCase.defaultSessionConfig", x2.class);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x0.a<v0> f3267v = x0.a.a("camerax.core.useCase.defaultCaptureConfig", v0.class);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final x0.a<x2.e> f3268w = x0.a.a("camerax.core.useCase.sessionConfigUnpacker", x2.e.class);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final x0.a<v0.b> f3269x = x0.a.a("camerax.core.useCase.captureConfigUnpacker", v0.b.class);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final x0.a<Integer> f3270y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final x0.a<Range<Integer>> f3271z;

    class a implements e0.a1.b {
        a() {
        }

        @Override // e0.a1.b
        @NonNull
        public e0.a1 a(@NonNull e0.c0 c0Var) {
            return new e0.e1(c0Var);
        }
    }

    public interface b<T extends c0.a2, C extends o3<T>, B> extends c0.d0<T> {
        @NonNull
        C d();
    }

    static {
        Class cls = Integer.TYPE;
        f3270y = x0.a.a("camerax.core.useCase.surfaceOccupancyPriority", cls);
        f3271z = x0.a.a("camerax.core.useCase.targetFrameRate", Range.class);
        Class cls2 = Boolean.TYPE;
        A = x0.a.a("camerax.core.useCase.zslDisabled", cls2);
        B = x0.a.a("camerax.core.useCase.highResolutionDisabled", cls2);
        C = x0.a.a("camerax.core.useCase.captureType", p3.b.class);
        D = x0.a.a("camerax.core.useCase.previewStabilizationMode", cls);
        E = x0.a.a("camerax.core.useCase.videoStabilizationMode", cls);
        F = x0.a.a("camerax.core.useCase.takePictureManagerProvider", e0.a1.b.class);
    }

    @NonNull
    default x2 A() {
        return (x2) a(f3266u);
    }

    default boolean F(boolean z11) {
        return ((Boolean) d(B, Boolean.valueOf(z11))).booleanValue();
    }

    default v0 L(v0 v0Var) {
        return (v0) d(f3267v, v0Var);
    }

    default Range<Integer> O(Range<Integer> range) {
        return (Range) d(f3271z, range);
    }

    default boolean T(boolean z11) {
        return ((Boolean) d(A, Boolean.valueOf(z11))).booleanValue();
    }

    @NonNull
    default p3.b U() {
        return (p3.b) a(C);
    }

    default x2.e Y(x2.e eVar) {
        return (x2.e) d(f3268w, eVar);
    }

    default x2 l(x2 x2Var) {
        return (x2) d(f3266u, x2Var);
    }

    @NonNull
    default e0.a1.b n() {
        e0.a1.b bVar = (e0.a1.b) d(F, new a());
        Objects.requireNonNull(bVar);
        return bVar;
    }

    default v0.b o(v0.b bVar) {
        return (v0.b) d(f3269x, bVar);
    }

    default int r() {
        return ((Integer) d(E, 0)).intValue();
    }

    default int s(int i11) {
        return ((Integer) d(f3270y, Integer.valueOf(i11))).intValue();
    }

    default int t() {
        return ((Integer) d(D, 0)).intValue();
    }
}
