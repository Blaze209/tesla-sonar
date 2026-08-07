package hr;

import java.io.EOFException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ts.d0 f73398a = new ts.d0(10);

    public ur.a a(l lVar, zr.h.a aVar) throws Throwable {
        ur.a aVarE = null;
        int i11 = 0;
        while (true) {
            try {
                lVar.e(this.f73398a.e(), 0, 10);
                this.f73398a.U(0);
                if (this.f73398a.K() != 4801587) {
                    break;
                }
                this.f73398a.V(3);
                int iG = this.f73398a.G();
                int i12 = iG + 10;
                if (aVarE == null) {
                    byte[] bArr = new byte[i12];
                    System.arraycopy(this.f73398a.e(), 0, bArr, 0, 10);
                    lVar.e(bArr, 10, iG);
                    aVarE = new zr.h(aVar).e(bArr, i12);
                } else {
                    lVar.i(iG);
                }
                i11 += i12;
            } catch (EOFException unused) {
            }
        }
        lVar.g();
        lVar.i(i11);
        return aVarE;
    }
}
