package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class a3 extends DeferrableSurface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Surface f3113o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f3114p;

    public a3(@NonNull Surface surface, int i11) {
        this.f3113o = surface;
        this.f3114p = i11;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @NonNull
    public com.google.common.util.concurrent.s<Surface> o() {
        return j0.n.p(this.f3113o);
    }

    public int q() {
        return this.f3114p;
    }
}
