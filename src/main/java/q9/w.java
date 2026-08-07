package q9;

import org.spongycastle.asn1.cmp.PKIFailureInfo;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f105110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f105112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f105113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f105114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f105115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f105116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f105117h;

    public w(t tVar, long[] jArr, int[] iArr, int i11, long[] jArr2, int[] iArr2, long j11) {
        s7.a.a(iArr.length == jArr2.length);
        s7.a.a(jArr.length == jArr2.length);
        s7.a.a(iArr2.length == jArr2.length);
        this.f105110a = tVar;
        this.f105112c = jArr;
        this.f105113d = iArr;
        this.f105114e = i11;
        this.f105115f = jArr2;
        this.f105116g = iArr2;
        this.f105117h = j11;
        this.f105111b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | PKIFailureInfo.duplicateCertReq;
        }
    }

    public int a(long j11) {
        for (int iK = q0.k(this.f105115f, j11, true, false); iK >= 0; iK--) {
            if ((this.f105116g[iK] & 1) != 0) {
                return iK;
            }
        }
        return -1;
    }

    public int b(long j11) {
        for (int iG = q0.g(this.f105115f, j11, true, false); iG < this.f105115f.length; iG++) {
            if ((this.f105116g[iG] & 1) != 0) {
                return iG;
            }
        }
        return -1;
    }
}
