package rr;

import com.google.android.gms.location.DeviceOrientationRequest;
import ts.m0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class x extends hr.a {

    private static final class b implements hr.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m0 f109057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ts.d0 f109058b;

        private hr.a.e c(ts.d0 d0Var, long j11, long j12) {
            int iF = -1;
            int iF2 = -1;
            long j13 = -9223372036854775807L;
            while (d0Var.a() >= 4) {
                if (x.k(d0Var.e(), d0Var.f()) != 442) {
                    d0Var.V(1);
                } else {
                    d0Var.V(4);
                    long jL = y.l(d0Var);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f109057a.b(jL);
                        if (jB > j11) {
                            return j13 == -9223372036854775807L ? hr.a.e.d(jB, j12) : hr.a.e.e(j12 + ((long) iF2));
                        }
                        if (100000 + jB > j11) {
                            return hr.a.e.e(j12 + ((long) d0Var.f()));
                        }
                        iF2 = d0Var.f();
                        j13 = jB;
                    }
                    d(d0Var);
                    iF = d0Var.f();
                }
            }
            return j13 != -9223372036854775807L ? hr.a.e.f(j13, j12 + ((long) iF)) : hr.a.e.f73296d;
        }

        private static void d(ts.d0 d0Var) {
            int iK;
            int iG = d0Var.g();
            if (d0Var.a() < 10) {
                d0Var.U(iG);
                return;
            }
            d0Var.V(9);
            int iH = d0Var.H() & 7;
            if (d0Var.a() < iH) {
                d0Var.U(iG);
                return;
            }
            d0Var.V(iH);
            if (d0Var.a() < 4) {
                d0Var.U(iG);
                return;
            }
            if (x.k(d0Var.e(), d0Var.f()) == 443) {
                d0Var.V(4);
                int iN = d0Var.N();
                if (d0Var.a() < iN) {
                    d0Var.U(iG);
                    return;
                }
                d0Var.V(iN);
            }
            while (d0Var.a() >= 4 && (iK = x.k(d0Var.e(), d0Var.f())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                d0Var.V(4);
                if (d0Var.a() < 2) {
                    d0Var.U(iG);
                    return;
                }
                d0Var.U(Math.min(d0Var.g(), d0Var.f() + d0Var.N()));
            }
        }

        @Override // hr.a.f
        public void a() {
            this.f109058b.R(p0.f115045f);
        }

        @Override // hr.a.f
        public hr.a.e b(hr.l lVar, long j11) {
            long position = lVar.getPosition();
            int iMin = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, lVar.getLength() - position);
            this.f109058b.Q(iMin);
            lVar.e(this.f109058b.e(), 0, iMin);
            return c(this.f109058b, j11, position);
        }

        private b(m0 m0Var) {
            this.f109057a = m0Var;
            this.f109058b = new ts.d0();
        }
    }

    public x(m0 m0Var, long j11, long j12) {
        super(new hr.a.b(), new b(m0Var), j11, 0L, j11 + 1, 0L, j12, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }
}
