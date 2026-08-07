package w8;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f121370a = new byte[4096];

    @Override // w8.o0
    public void a(s7.c0 c0Var, int i11, int i12) {
        c0Var.c0(i11);
    }

    @Override // w8.o0
    public int c(p7.j jVar, int i11, boolean z11, int i12) throws EOFException {
        int i13 = jVar.read(this.f121370a, 0, Math.min(this.f121370a.length, i11));
        if (i13 != -1) {
            return i13;
        }
        if (z11) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // w8.o0
    public void g(p7.u uVar) {
    }

    @Override // w8.o0
    public void b(long j11, int i11, int i12, int i13, o0.a aVar) {
    }
}
