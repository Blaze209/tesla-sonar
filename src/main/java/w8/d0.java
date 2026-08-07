package w8;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.c0 f121268a = new s7.c0(10);

    public p7.f0 a(q qVar, k9.h.a aVar) throws Throwable {
        p7.f0 f0VarE = null;
        int i11 = 0;
        while (true) {
            try {
                qVar.e(this.f121268a.f(), 0, 10);
                this.f121268a.b0(0);
                if (this.f121268a.P() != 4801587) {
                    break;
                }
                this.f121268a.c0(3);
                int iL = this.f121268a.L();
                int i12 = iL + 10;
                if (f0VarE == null) {
                    byte[] bArr = new byte[i12];
                    System.arraycopy(this.f121268a.f(), 0, bArr, 0, 10);
                    qVar.e(bArr, 10, iL);
                    f0VarE = new k9.h(aVar).e(bArr, i12);
                } else {
                    qVar.i(iL);
                }
                i11 += i12;
            } catch (EOFException unused) {
            }
        }
        qVar.g();
        qVar.i(i11);
        return f0VarE;
    }
}
