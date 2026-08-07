package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class l2 implements o3<c0.h1>, r1, k0.l {
    private final i2 K;

    public l2(@NonNull i2 i2Var) {
        this.K = i2Var;
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
}
