package z8;

import s7.c0;
import w8.i0;
import w8.l0;
import w8.p;
import w8.q;
import w8.r;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f127329a = new c0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f127330b = new l0(-1, -1, "image/avif");

    private boolean b(q qVar, int i11) {
        this.f127329a.X(4);
        qVar.e(this.f127329a.f(), 0, 4);
        return this.f127329a.O() == ((long) i11);
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        this.f127330b.a(j11, j12);
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f127330b.e(rVar);
    }

    @Override // w8.p
    public int h(q qVar, i0 i0Var) {
        return this.f127330b.h(qVar, i0Var);
    }

    @Override // w8.p
    public boolean l(q qVar) {
        qVar.i(4);
        return b(qVar, 1718909296) && b(qVar, 1635150182);
    }

    @Override // w8.p
    public void release() {
    }
}
