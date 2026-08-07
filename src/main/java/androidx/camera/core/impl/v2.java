package androidx.camera.core.impl;

import android.util.Range;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public class v2 extends m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f3333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z2 f3334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final b0 f3337f;

    class a implements c0.c0 {
        a() {
        }

        @Override // c0.c0
        public int a() {
            return 0;
        }

        @Override // c0.c0
        @NonNull
        public Range<Integer> b() {
            return new Range<>(0, 0);
        }
    }

    public v2(@NonNull i0 i0Var, @NonNull b0 b0Var) {
        super(i0Var);
        this.f3335d = false;
        this.f3336e = false;
        this.f3333b = i0Var;
        this.f3337f = b0Var;
        this.f3334c = b0Var.I(null);
        C(b0Var.B());
        B(b0Var.X());
    }

    @NonNull
    public b0 A() {
        return this.f3337f;
    }

    public void B(boolean z11) {
        this.f3336e = z11;
    }

    public void C(boolean z11) {
        this.f3335d = z11;
    }

    @Override // androidx.camera.core.impl.m1, androidx.camera.core.impl.i0
    @NonNull
    public i0 getImplementation() {
        return this.f3333b;
    }

    @Override // androidx.camera.core.impl.m1, c0.n
    public boolean j(@NonNull c0.e0 e0Var) {
        c0.e0 e0VarA = h0.p.a(this.f3334c, e0Var);
        if (e0VarA == null) {
            return false;
        }
        return this.f3333b.j(e0VarA);
    }

    @Override // androidx.camera.core.impl.m1, c0.n
    @NonNull
    public androidx.p003lifecycle.d0<c0.d2> l() {
        return !h0.p.b(this.f3334c, 0) ? new androidx.p003lifecycle.i0(k0.e.e(1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED)) : this.f3333b.l();
    }

    @Override // androidx.camera.core.impl.m1, c0.n
    public boolean q() {
        if (h0.p.b(this.f3334c, 5)) {
            return this.f3333b.q();
        }
        return false;
    }

    @Override // androidx.camera.core.impl.m1, c0.n
    @NonNull
    public androidx.p003lifecycle.d0<Integer> u() {
        return !h0.p.b(this.f3334c, 6) ? new androidx.p003lifecycle.i0(0) : this.f3333b.u();
    }

    @Override // androidx.camera.core.impl.m1, c0.n
    @NonNull
    public c0.c0 v() {
        return !h0.p.b(this.f3334c, 7) ? new a() : this.f3333b.v();
    }
}
