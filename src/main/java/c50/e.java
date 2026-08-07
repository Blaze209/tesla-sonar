package c50;

import qj0.f;
import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f18778a;

    e(d dVar) {
        this.f18778a = dVar;
    }

    public static i<c.d> b(d dVar) {
        return f.a(new e(dVar));
    }

    @Override // c50.c.d
    public c a(ManualEntrySuccessState manualEntrySuccessState) {
        return this.f18778a.b(manualEntrySuccessState);
    }
}
