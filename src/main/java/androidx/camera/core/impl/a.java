package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    a() {
    }

    @NonNull
    public static a a(@NonNull e3 e3Var, int i11, @NonNull Size size, @NonNull c0.b0 b0Var, @NonNull List<p3.b> list, x0 x0Var, Range<Integer> range) {
        return new b(e3Var, i11, size, b0Var, list, x0Var, range);
    }

    @NonNull
    public abstract List<p3.b> b();

    @NonNull
    public abstract c0.b0 c();

    public abstract int d();

    public abstract x0 e();

    @NonNull
    public abstract Size f();

    @NonNull
    public abstract e3 g();

    public abstract Range<Integer> h();

    @NonNull
    public c3 i(@NonNull x0 x0Var) {
        c3.a aVarD = c3.a(f()).b(c()).d(x0Var);
        if (h() != null) {
            aVarD.c(h());
        }
        return aVarD.a();
    }
}
