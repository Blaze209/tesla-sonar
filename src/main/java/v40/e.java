package v40;

import qj0.f;
import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f117849a;

    e(d dVar) {
        this.f117849a = dVar;
    }

    public static i<c.d> b(d dVar) {
        return f.a(new e(dVar));
    }

    @Override // v40.c.d
    public c a(ErrorState errorState) {
        return this.f117849a.b(errorState);
    }
}
