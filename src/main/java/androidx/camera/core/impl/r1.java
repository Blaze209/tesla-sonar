package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface r1 extends s2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x0.a<Integer> f3286k = x0.a.a("camerax.core.imageOutput.targetAspectRatio", c0.a.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x0.a<Integer> f3287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x0.a<Integer> f3288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x0.a<Integer> f3289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x0.a<Size> f3290o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final x0.a<Size> f3291p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final x0.a<Size> f3292q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x0.a<List<Pair<Integer, Size[]>>> f3293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final x0.a<s0.c> f3294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final x0.a<List<Size>> f3295t;

    public interface a<B> {
        @NonNull
        B a(int i11);

        @NonNull
        B c(@NonNull Size size);
    }

    static {
        Class cls = Integer.TYPE;
        f3287l = x0.a.a("camerax.core.imageOutput.targetRotation", cls);
        f3288m = x0.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f3289n = x0.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f3290o = x0.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f3291p = x0.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f3292q = x0.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f3293r = x0.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f3294s = x0.a.a("camerax.core.imageOutput.resolutionSelector", s0.c.class);
        f3295t = x0.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    static void N(@NonNull r1 r1Var) {
        boolean zP = r1Var.P();
        boolean z11 = r1Var.C(null) != null;
        if (zP && z11) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (r1Var.x(null) != null) {
            if (zP || z11) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default Size C(Size size) {
        return (Size) d(f3290o, size);
    }

    default int H(int i11) {
        return ((Integer) d(f3289n, Integer.valueOf(i11))).intValue();
    }

    @NonNull
    default s0.c J() {
        return (s0.c) a(f3294s);
    }

    default boolean P() {
        return e(f3286k);
    }

    default int R() {
        return ((Integer) a(f3286k)).intValue();
    }

    default Size S(Size size) {
        return (Size) d(f3291p, size);
    }

    default Size i(Size size) {
        return (Size) d(f3292q, size);
    }

    default List<Pair<Integer, Size[]>> k(List<Pair<Integer, Size[]>> list) {
        return (List) d(f3293r, list);
    }

    default int p(int i11) {
        return ((Integer) d(f3288m, Integer.valueOf(i11))).intValue();
    }

    default int u(int i11) {
        return ((Integer) d(f3287l, Integer.valueOf(i11))).intValue();
    }

    default s0.c x(s0.c cVar) {
        return (s0.c) d(f3294s, cVar);
    }

    default List<Size> y(List<Size> list) {
        List list2 = (List) d(f3295t, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }
}
