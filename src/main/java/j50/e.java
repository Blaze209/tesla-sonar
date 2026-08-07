package j50;

import qj0.f;
import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f82709a;

    e(d dVar) {
        this.f82709a = dVar;
    }

    public static i<c.d> b(d dVar) {
        return f.a(new e(dVar));
    }

    @Override // j50.c.d
    public c a(ResetState resetState) {
        return this.f82709a.b(resetState);
    }
}
