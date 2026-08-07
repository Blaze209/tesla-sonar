package p9;

import s7.c0;
import s7.q0;
import w8.f0;

/* JADX INFO: loaded from: classes3.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.a f102014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f102015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f102016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f102017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f102018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f102019f;

    private i(f0.a aVar, long j11, long j12, long[] jArr, int i11, int i12) {
        this.f102014a = new f0.a(aVar);
        this.f102015b = j11;
        this.f102016c = j12;
        this.f102019f = jArr;
        this.f102017d = i11;
        this.f102018e = i12;
    }

    public static i b(f0.a aVar, c0 c0Var) {
        long[] jArr;
        int i11;
        int i12;
        int iV = c0Var.v();
        int iQ = (iV & 1) != 0 ? c0Var.Q() : -1;
        long jO = (iV & 2) != 0 ? c0Var.O() : -1L;
        if ((iV & 4) == 4) {
            jArr = new long[100];
            for (int i13 = 0; i13 < 100; i13++) {
                jArr[i13] = c0Var.M();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iV & 8) != 0) {
            c0Var.c0(4);
        }
        if (c0Var.a() >= 24) {
            c0Var.c0(21);
            int iP = c0Var.P();
            i12 = iP & 4095;
            i11 = (16773120 & iP) >> 12;
        } else {
            i11 = -1;
            i12 = -1;
        }
        return new i(aVar, iQ, jO, jArr2, i11, i12);
    }

    public long a() {
        long j11 = this.f102015b;
        if (j11 == -1 || j11 == 0) {
            return -9223372036854775807L;
        }
        f0.a aVar = this.f102014a;
        return q0.r1((j11 * ((long) aVar.f121308g)) - 1, aVar.f121305d);
    }
}
