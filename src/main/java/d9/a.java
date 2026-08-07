package d9;

import com.reactnativecommunity.clipboard.ClipboardModule;
import s7.c0;
import w8.i0;
import w8.l0;
import w8.p;
import w8.q;
import w8.r;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f59922a = new c0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f59923b = new l0(-1, -1, ClipboardModule.MIMETYPE_HEIF);

    private boolean b(q qVar, int i11) {
        this.f59922a.X(4);
        qVar.e(this.f59922a.f(), 0, 4);
        return this.f59922a.O() == ((long) i11);
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        this.f59923b.a(j11, j12);
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f59923b.e(rVar);
    }

    @Override // w8.p
    public int h(q qVar, i0 i0Var) {
        return this.f59923b.h(qVar, i0Var);
    }

    @Override // w8.p
    public boolean l(q qVar) {
        qVar.i(4);
        return b(qVar, 1718909296) && b(qVar, 1751476579);
    }

    @Override // w8.p
    public void release() {
    }
}
