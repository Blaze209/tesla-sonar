package rr;

import com.google.android.gms.location.DeviceOrientationRequest;
import ts.m0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f109061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f109062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f109063e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f109059a = new m0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f109064f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f109065g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f109066h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts.d0 f109060b = new ts.d0();

    y() {
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(hr.l lVar) {
        this.f109060b.R(p0.f115045f);
        this.f109061c = true;
        lVar.g();
        return 0;
    }

    private int f(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    private int h(hr.l lVar, hr.y yVar) {
        int iMin = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, lVar.getLength());
        long j11 = 0;
        if (lVar.getPosition() != j11) {
            yVar.f73403a = j11;
            return 1;
        }
        this.f109060b.Q(iMin);
        lVar.g();
        lVar.e(this.f109060b.e(), 0, iMin);
        this.f109064f = i(this.f109060b);
        this.f109062d = true;
        return 0;
    }

    private long i(ts.d0 d0Var) {
        int iG = d0Var.g();
        for (int iF = d0Var.f(); iF < iG - 3; iF++) {
            if (f(d0Var.e(), iF) == 442) {
                d0Var.U(iF + 4);
                long jL = l(d0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(hr.l lVar, hr.y yVar) {
        long length = lVar.getLength();
        int iMin = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, length);
        long j11 = length - ((long) iMin);
        if (lVar.getPosition() != j11) {
            yVar.f73403a = j11;
            return 1;
        }
        this.f109060b.Q(iMin);
        lVar.g();
        lVar.e(this.f109060b.e(), 0, iMin);
        this.f109065g = k(this.f109060b);
        this.f109063e = true;
        return 0;
    }

    private long k(ts.d0 d0Var) {
        int iF = d0Var.f();
        for (int iG = d0Var.g() - 4; iG >= iF; iG--) {
            if (f(d0Var.e(), iG) == 442) {
                d0Var.U(iG + 4);
                long jL = l(d0Var);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(ts.d0 d0Var) {
        int iF = d0Var.f();
        if (d0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        d0Var.l(bArr, 0, 9);
        d0Var.U(iF);
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
        return this.f109066h;
    }

    public m0 d() {
        return this.f109059a;
    }

    public boolean e() {
        return this.f109061c;
    }

    public int g(hr.l lVar, hr.y yVar) {
        if (!this.f109063e) {
            return j(lVar, yVar);
        }
        if (this.f109065g == -9223372036854775807L) {
            return b(lVar);
        }
        if (!this.f109062d) {
            return h(lVar, yVar);
        }
        long j11 = this.f109064f;
        if (j11 == -9223372036854775807L) {
            return b(lVar);
        }
        long jB = this.f109059a.b(this.f109065g) - this.f109059a.b(j11);
        this.f109066h = jB;
        if (jB < 0) {
            ts.u.i("PsDurationReader", "Invalid duration: " + this.f109066h + ". Using TIME_UNSET instead.");
            this.f109066h = -9223372036854775807L;
        }
        return b(lVar);
    }
}
