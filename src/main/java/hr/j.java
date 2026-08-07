package hr;

import com.google.android.exoplayer2.u0;
import java.io.EOFException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f73374a = new byte[4096];

    @Override // hr.b0
    public int c(ss.g gVar, int i11, boolean z11, int i12) throws EOFException {
        int i13 = gVar.read(this.f73374a, 0, Math.min(this.f73374a.length, i11));
        if (i13 != -1) {
            return i13;
        }
        if (z11) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // hr.b0
    public void f(ts.d0 d0Var, int i11, int i12) {
        d0Var.V(i11);
    }

    @Override // hr.b0
    public void b(u0 u0Var) {
    }

    @Override // hr.b0
    public void e(long j11, int i11, int i12, int i13, b0.a aVar) {
    }
}
