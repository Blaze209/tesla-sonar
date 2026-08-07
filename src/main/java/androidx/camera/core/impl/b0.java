package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface b0 extends s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0.a<p3> f3122a = x0.a.a("camerax.core.camera.useCaseConfigFactory", p3.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x0.a<n1> f3123b = x0.a.a("camerax.core.camera.compatibilityId", n1.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0.a<Integer> f3124c = x0.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x0.a<z2> f3125d = x0.a.a("camerax.core.camera.SessionProcessor", z2.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x0.a<Boolean> f3126e = x0.a.a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x0.a<Boolean> f3127f = x0.a.a("camerax.core.camera.isPostviewSupported", Boolean.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x0.a<Boolean> f3128g = x0.a.a("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);

    default boolean B() {
        return ((Boolean) d(f3127f, Boolean.FALSE)).booleanValue();
    }

    @NonNull
    n1 E();

    default z2 I(z2 z2Var) {
        return (z2) d(f3125d, z2Var);
    }

    default int M() {
        return ((Integer) d(f3124c, 0)).intValue();
    }

    default boolean X() {
        return ((Boolean) d(f3128g, Boolean.FALSE)).booleanValue();
    }

    @NonNull
    default p3 j() {
        return (p3) d(f3122a, p3.f3278a);
    }
}
