package f0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.i0;
import c0.i1;
import c0.n;

/* JADX INFO: loaded from: classes.dex */
public class a implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f63750a;

    a(@NonNull i0 i0Var) {
        this.f63750a = i0Var.z();
    }

    @NonNull
    public static i1 b(@NonNull n nVar) {
        return new a((i0) nVar);
    }

    @Override // c0.i1
    public boolean a() {
        return this.f63750a;
    }
}
