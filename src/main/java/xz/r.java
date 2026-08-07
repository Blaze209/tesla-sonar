package xz;

import org.bouncycastle.crypto.hpke.HPKE;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes6.dex */
public class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final r f124221n = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    short f124222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short f124223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f124224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f124225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f124226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    short f124227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    short f124228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    short f124229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    short f124230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    o f124231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    r f124232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    l f124233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    r f124234m;

    private void b(int i11, int i12, int i13) {
        if (this.f124226e == null) {
            this.f124226e = new int[6];
        }
        int[] iArr = this.f124226e;
        int i14 = iArr[0];
        if (i14 + 2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f124226e = iArr2;
        }
        int[] iArr3 = this.f124226e;
        iArr3[i14 + 1] = i11;
        int i15 = i14 + 2;
        iArr3[i15] = i12 | i13;
        iArr3[0] = i15;
    }

    private r g(r rVar) {
        for (l lVar = this.f124233l; lVar != null; lVar = lVar.f124187c) {
            if ((this.f124222a & 16) == 0 || lVar != this.f124233l.f124187c) {
                r rVar2 = lVar.f124186b;
                if (rVar2.f124234m == null) {
                    rVar2.f124234m = rVar;
                    rVar = rVar2;
                }
            }
        }
        return rVar;
    }

    final void a(s sVar, boolean z11) {
        short s11;
        sVar.o(this);
        if (!z11 || (s11 = this.f124223b) == 0) {
            return;
        }
        sVar.q(s11 & HPKE.aead_EXPORT_ONLY, this);
        if (this.f124224c == null) {
            return;
        }
        int i11 = 1;
        while (true) {
            int[] iArr = this.f124224c;
            if (i11 > iArr[0]) {
                return;
            }
            sVar.q(iArr[i11], this);
            i11++;
        }
    }

    final void c(int i11) {
        if (this.f124223b == 0) {
            this.f124223b = (short) i11;
            return;
        }
        if (this.f124224c == null) {
            this.f124224c = new int[4];
        }
        int[] iArr = this.f124224c;
        int i12 = iArr[0] + 1;
        iArr[0] = i12;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f124224c = iArr2;
        }
        this.f124224c[i12] = i11;
    }

    final void d(r rVar) {
        r rVar2 = f124221n;
        this.f124234m = rVar2;
        r rVar3 = rVar2;
        r rVarG = this;
        while (rVarG != f124221n) {
            r rVar4 = rVarG.f124234m;
            rVarG.f124234m = rVar3;
            if ((rVarG.f124222a & 64) != 0 && rVarG.f124230i != rVar.f124230i) {
                rVarG.f124233l = new l(rVarG.f124228g, rVar.f124233l.f124186b, rVarG.f124233l);
            }
            rVar3 = rVarG;
            rVarG = rVarG.g(rVar4);
        }
        while (rVar3 != f124221n) {
            r rVar5 = rVar3.f124234m;
            rVar3.f124234m = null;
            rVar3 = rVar5;
        }
    }

    final r e() {
        o oVar = this.f124231j;
        return oVar == null ? this : oVar.f124201a;
    }

    final void f(short s11) {
        this.f124234m = f124221n;
        r rVarG = this;
        while (rVarG != f124221n) {
            r rVar = rVarG.f124234m;
            rVarG.f124234m = null;
            if (rVarG.f124230i == 0) {
                rVarG.f124230i = s11;
                rVarG = rVarG.g(rVar);
            } else {
                rVarG = rVar;
            }
        }
    }

    final void h(d dVar, int i11, boolean z11) {
        if ((this.f124222a & 4) != 0) {
            if (z11) {
                dVar.i(this.f124225d - i11);
                return;
            } else {
                dVar.k(this.f124225d - i11);
                return;
            }
        }
        if (z11) {
            b(i11, PKIFailureInfo.duplicateCertReq, dVar.f124127b);
            dVar.i(-1);
        } else {
            b(i11, 268435456, dVar.f124127b);
            dVar.k(-1);
        }
    }

    final boolean i(byte[] bArr, int i11) {
        this.f124222a = (short) (this.f124222a | 4);
        this.f124225d = i11;
        int[] iArr = this.f124226e;
        boolean z11 = false;
        if (iArr == null) {
            return false;
        }
        for (int i12 = iArr[0]; i12 > 0; i12 -= 2) {
            int[] iArr2 = this.f124226e;
            int i13 = iArr2[i12 - 1];
            int i14 = iArr2[i12];
            int i15 = i11 - i13;
            int i16 = 268435455 & i14;
            if ((i14 & (-268435456)) == 268435456) {
                if (i15 < -32768 || i15 > 32767) {
                    int i17 = bArr[i13] & 255;
                    if (i17 < 198) {
                        bArr[i13] = (byte) (i17 + 49);
                    } else {
                        bArr[i13] = (byte) (i17 + 20);
                    }
                    z11 = true;
                }
                bArr[i16] = (byte) (i15 >>> 8);
                bArr[i16 + 1] = (byte) i15;
            } else {
                bArr[i16] = (byte) (i15 >>> 24);
                bArr[i16 + 1] = (byte) (i15 >>> 16);
                bArr[i16 + 2] = (byte) (i15 >>> 8);
                bArr[i16 + 3] = (byte) i15;
            }
        }
        return z11;
    }

    public String toString() {
        return "L" + System.identityHashCode(this);
    }
}
