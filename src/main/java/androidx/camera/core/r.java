package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import c0.s0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f3444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s0 f3445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f3446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f3447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f3448h;

    r(n nVar, s0 s0Var) {
        this(nVar, null, s0Var);
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public int getHeight() {
        return this.f3448h;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public int getWidth() {
        return this.f3447g;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    public void r2(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f3444d) {
            this.f3446f = rect;
        }
    }

    @Override // androidx.camera.core.e, androidx.camera.core.n
    @NonNull
    public s0 z() {
        return this.f3445e;
    }

    public r(@NonNull n nVar, Size size, @NonNull s0 s0Var) {
        super(nVar);
        this.f3444d = new Object();
        if (size == null) {
            this.f3447g = super.getWidth();
            this.f3448h = super.getHeight();
        } else {
            this.f3447g = size.getWidth();
            this.f3448h = size.getHeight();
        }
        this.f3445e = s0Var;
    }
}
