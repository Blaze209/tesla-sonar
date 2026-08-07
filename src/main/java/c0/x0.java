package c0;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g3;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 implements s0 {
    @NonNull
    public static s0 f(@NonNull g3 g3Var, long j11, int i11, @NonNull Matrix matrix) {
        return new d(g3Var, j11, i11, matrix);
    }

    @Override // c0.s0
    public abstract long a();

    @Override // c0.s0
    public void b(@NonNull h0.i.b bVar) {
        bVar.m(d());
    }

    @Override // c0.s0
    @NonNull
    public abstract g3 c();

    @Override // c0.s0
    public abstract int d();

    @Override // c0.s0
    @NonNull
    public abstract Matrix e();
}
