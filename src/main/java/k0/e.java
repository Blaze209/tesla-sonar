package k0;

import androidx.annotation.NonNull;
import c0.d2;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements d2 {
    @NonNull
    public static d2 e(float f11, float f12, float f13, float f14) {
        return new a(f11, f12, f13, f14);
    }

    @NonNull
    public static d2 f(@NonNull d2 d2Var) {
        return new a(d2Var.d(), d2Var.a(), d2Var.c(), d2Var.b());
    }

    @Override // c0.d2
    public abstract float a();

    @Override // c0.d2
    public abstract float b();

    @Override // c0.d2
    public abstract float c();

    @Override // c0.d2
    public abstract float d();
}
