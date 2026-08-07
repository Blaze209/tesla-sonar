package k0;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g3;
import androidx.camera.core.impl.z;
import c0.s0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f84596a;

    public b(@NonNull z zVar) {
        this.f84596a = zVar;
    }

    @Override // c0.s0
    public long a() {
        return this.f84596a.a();
    }

    @Override // c0.s0
    public void b(@NonNull h0.i.b bVar) {
        this.f84596a.b(bVar);
    }

    @Override // c0.s0
    @NonNull
    public g3 c() {
        return this.f84596a.c();
    }

    @Override // c0.s0
    public int d() {
        return 0;
    }

    @Override // c0.s0
    @NonNull
    public Matrix e() {
        return new Matrix();
    }

    @NonNull
    public z f() {
        return this.f84596a;
    }
}
