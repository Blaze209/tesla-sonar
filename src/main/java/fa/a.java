package fa;

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
    private final c0 f64707a = new c0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f64708b = new l0(-1, -1, ClipboardModule.MIMETYPE_WEBP);

    @Override // w8.p
    public void a(long j11, long j12) {
        this.f64708b.a(j11, j12);
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f64708b.e(rVar);
    }

    @Override // w8.p
    public int h(q qVar, i0 i0Var) {
        return this.f64708b.h(qVar, i0Var);
    }

    @Override // w8.p
    public boolean l(q qVar) {
        this.f64707a.X(4);
        qVar.e(this.f64707a.f(), 0, 4);
        if (this.f64707a.O() != 1380533830) {
            return false;
        }
        qVar.i(4);
        this.f64707a.X(4);
        qVar.e(this.f64707a.f(), 0, 4);
        return this.f64707a.O() == 1464156752;
    }

    @Override // w8.p
    public void release() {
    }
}
