package r0;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import h0.s;
import java.util.UUID;
import p0.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    @NonNull
    public static f h(int i11, int i12, @NonNull Rect rect, @NonNull Size size, int i13, boolean z11) {
        return i(i11, i12, rect, size, i13, z11, false);
    }

    @NonNull
    public static f i(int i11, int i12, @NonNull Rect rect, @NonNull Size size, int i13, boolean z11, boolean z12) {
        return new b(UUID.randomUUID(), i11, i12, rect, size, i13, z11, z12);
    }

    @NonNull
    public static f j(@NonNull n0 n0Var) {
        return h(n0Var.t(), n0Var.p(), n0Var.n(), s.f(n0Var.n(), n0Var.q()), n0Var.q(), n0Var.w());
    }

    @NonNull
    public abstract Rect a();

    public abstract int b();

    public abstract int c();

    @NonNull
    public abstract Size d();

    public abstract int e();

    @NonNull
    abstract UUID f();

    public abstract boolean g();

    public abstract boolean k();
}
