package e9;

import com.reactnativecommunity.clipboard.ClipboardModule;
import w8.i0;
import w8.l0;
import w8.p;
import w8.q;
import w8.r;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f62260a;

    public a(int i11) {
        if ((i11 & 1) != 0) {
            this.f62260a = new l0(65496, 2, ClipboardModule.MIMETYPE_JPEG);
        } else {
            this.f62260a = new b();
        }
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        this.f62260a.a(j11, j12);
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f62260a.e(rVar);
    }

    @Override // w8.p
    public int h(q qVar, i0 i0Var) {
        return this.f62260a.h(qVar, i0Var);
    }

    @Override // w8.p
    public boolean l(q qVar) {
        return this.f62260a.l(qVar);
    }

    @Override // w8.p
    public void release() {
        this.f62260a.release();
    }
}
