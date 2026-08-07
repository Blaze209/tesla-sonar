package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class i3 implements c0.k1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f3194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0.k1 f3195e;

    public i3(long j11, @NonNull c0.k1 k1Var) {
        u5.h.b(j11 >= 0, "Timeout must be non-negative.");
        this.f3194d = j11;
        this.f3195e = k1Var;
    }

    @Override // c0.k1
    public long a() {
        return this.f3194d;
    }

    @Override // c0.k1
    @NonNull
    public c0.k1.c e(@NonNull c0.k1.b bVar) {
        c0.k1.c cVarE = this.f3195e.e(bVar);
        return (a() <= 0 || bVar.a() < a() - cVarE.b()) ? cVarE : c0.k1.c.f18351d;
    }
}
