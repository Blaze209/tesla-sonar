package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends DeferrableSurface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Surface f3307o;

    public t1(@NonNull Surface surface, @NonNull Size size, int i11) {
        super(size, i11);
        this.f3307o = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @NonNull
    public com.google.common.util.concurrent.s<Surface> o() {
        return j0.n.p(this.f3307o);
    }

    public t1(@NonNull Surface surface) {
        this.f3307o = surface;
    }
}
