package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface q1 extends s2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x0.a<Integer> f3281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x0.a<Integer> f3282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x0.a<c0.b0> f3283j;

    static {
        Class cls = Integer.TYPE;
        f3281h = x0.a.a("camerax.core.imageInput.inputFormat", cls);
        f3282i = x0.a.a("camerax.core.imageInput.secondaryInputFormat", cls);
        f3283j = x0.a.a("camerax.core.imageInput.inputDynamicRange", c0.b0.class);
    }

    default int W() {
        return ((Integer) d(f3282i, 0)).intValue();
    }

    default int getInputFormat() {
        return ((Integer) a(f3281h)).intValue();
    }

    @NonNull
    default c0.b0 w() {
        return (c0.b0) u5.h.g((c0.b0) d(f3283j, c0.b0.f18254c));
    }

    default boolean z() {
        return e(f3283j);
    }
}
