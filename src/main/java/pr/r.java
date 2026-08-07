package pr;

import org.spongycastle.asn1.cmp.PKIFailureInfo;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f103914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f103915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f103916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f103917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f103918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f103919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f103920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f103921h;

    public r(o oVar, long[] jArr, int[] iArr, int i11, long[] jArr2, int[] iArr2, long j11) {
        ts.a.a(iArr.length == jArr2.length);
        ts.a.a(jArr.length == jArr2.length);
        ts.a.a(iArr2.length == jArr2.length);
        this.f103914a = oVar;
        this.f103916c = jArr;
        this.f103917d = iArr;
        this.f103918e = i11;
        this.f103919f = jArr2;
        this.f103920g = iArr2;
        this.f103921h = j11;
        this.f103915b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | PKIFailureInfo.duplicateCertReq;
        }
    }

    public int a(long j11) {
        for (int i11 = p0.i(this.f103919f, j11, true, false); i11 >= 0; i11--) {
            if ((this.f103920g[i11] & 1) != 0) {
                return i11;
            }
        }
        return -1;
    }

    public int b(long j11) {
        for (int iE = p0.e(this.f103919f, j11, true, false); iE < this.f103919f.length; iE++) {
            if ((this.f103920g[iE] & 1) != 0) {
                return iE;
            }
        }
        return -1;
    }
}
