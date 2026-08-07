package da;

import com.google.android.gms.location.DeviceOrientationRequest;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f59926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f59927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f59928e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.i0 f59924a = new s7.i0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f59929f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f59930g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f59931h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.c0 f59925b = new s7.c0();

    a0() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(w8.q qVar) {
        this.f59925b.Y(q0.f110459f);
        this.f59926c = true;
        qVar.g();
        return 0;
    }

    private int f(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    private int h(w8.q qVar, w8.i0 i0Var) {
        int iMin = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, qVar.getLength());
        long j11 = 0;
        if (qVar.getPosition() != j11) {
            i0Var.f121323a = j11;
            return 1;
        }
        this.f59925b.X(iMin);
        qVar.g();
        qVar.e(this.f59925b.f(), 0, iMin);
        this.f59929f = i(this.f59925b);
        this.f59927d = true;
        return 0;
    }

    private long i(s7.c0 c0Var) {
        int iJ = c0Var.j();
        for (int iG = c0Var.g(); iG < iJ - 3; iG++) {
            if (f(c0Var.f(), iG) == 442) {
                c0Var.b0(iG + 4);
                long jL = l(c0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(w8.q qVar, w8.i0 i0Var) {
        long length = qVar.getLength();
        int iMin = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, length);
        long j11 = length - ((long) iMin);
        if (qVar.getPosition() != j11) {
            i0Var.f121323a = j11;
            return 1;
        }
        this.f59925b.X(iMin);
        qVar.g();
        qVar.e(this.f59925b.f(), 0, iMin);
        this.f59930g = k(this.f59925b);
        this.f59928e = true;
        return 0;
    }

    private long k(s7.c0 c0Var) {
        int iG = c0Var.g();
        for (int iJ = c0Var.j() - 4; iJ >= iG; iJ--) {
            if (f(c0Var.f(), iJ) == 442) {
                c0Var.b0(iJ + 4);
                long jL = l(c0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(s7.c0 c0Var) {
        int iG = c0Var.g();
        if (c0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c0Var.q(bArr, 0, 9);
        c0Var.b0(iG);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        byte b11 = bArr[0];
        long j11 = (((((long) b11) & 56) >> 3) << 30) | ((((long) b11) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b12 = bArr[2];
        return j11 | (((((long) b12) & 248) >> 3) << 15) | ((((long) b12) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f59931h;
    }

    public s7.i0 d() {
        return this.f59924a;
    }

    public boolean e() {
        return this.f59926c;
    }

    public int g(w8.q qVar, w8.i0 i0Var) {
        if (!this.f59928e) {
            return j(qVar, i0Var);
        }
        if (this.f59930g == -9223372036854775807L) {
            return b(qVar);
        }
        if (!this.f59927d) {
            return h(qVar, i0Var);
        }
        long j11 = this.f59929f;
        if (j11 == -9223372036854775807L) {
            return b(qVar);
        }
        this.f59931h = this.f59924a.c(this.f59930g) - this.f59924a.b(j11);
        return b(qVar);
    }
}
