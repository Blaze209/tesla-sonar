package da;

import com.google.android.gms.location.DeviceOrientationRequest;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
final class z extends w8.e {

    private static final class b implements w8.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s7.i0 f60345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s7.c0 f60346b;

        private w8.e.C2600e c(s7.c0 c0Var, long j11, long j12) {
            int iG = -1;
            int iG2 = -1;
            long j13 = -9223372036854775807L;
            while (c0Var.a() >= 4) {
                if (z.k(c0Var.f(), c0Var.g()) != 442) {
                    c0Var.c0(1);
                } else {
                    c0Var.c0(4);
                    long jL = a0.l(c0Var);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f60345a.b(jL);
                        if (jB > j11) {
                            return j13 == -9223372036854775807L ? w8.e.C2600e.d(jB, j12) : w8.e.C2600e.e(j12 + ((long) iG2));
                        }
                        if (100000 + jB > j11) {
                            return w8.e.C2600e.e(j12 + ((long) c0Var.g()));
                        }
                        iG2 = c0Var.g();
                        j13 = jB;
                    }
                    d(c0Var);
                    iG = c0Var.g();
                }
            }
            return j13 != -9223372036854775807L ? w8.e.C2600e.f(j13, j12 + ((long) iG)) : w8.e.C2600e.f121288d;
        }

        private static void d(s7.c0 c0Var) {
            int iK;
            int iJ = c0Var.j();
            if (c0Var.a() < 10) {
                c0Var.b0(iJ);
                return;
            }
            c0Var.c0(9);
            int iM = c0Var.M() & 7;
            if (c0Var.a() < iM) {
                c0Var.b0(iJ);
                return;
            }
            c0Var.c0(iM);
            if (c0Var.a() < 4) {
                c0Var.b0(iJ);
                return;
            }
            if (z.k(c0Var.f(), c0Var.g()) == 443) {
                c0Var.c0(4);
                int iU = c0Var.U();
                if (c0Var.a() < iU) {
                    c0Var.b0(iJ);
                    return;
                }
                c0Var.c0(iU);
            }
            while (c0Var.a() >= 4 && (iK = z.k(c0Var.f(), c0Var.g())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                c0Var.c0(4);
                if (c0Var.a() < 2) {
                    c0Var.b0(iJ);
                    return;
                }
                c0Var.b0(Math.min(c0Var.j(), c0Var.g() + c0Var.U()));
            }
        }

        @Override // w8.e.f
        public void a() {
            this.f60346b.Y(q0.f110459f);
        }

        @Override // w8.e.f
        public w8.e.C2600e b(w8.q qVar, long j11) {
            long position = qVar.getPosition();
            int iMin = (int) Math.min(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, qVar.getLength() - position);
            this.f60346b.X(iMin);
            qVar.e(this.f60346b.f(), 0, iMin);
            return c(this.f60346b, j11, position);
        }

        private b(s7.i0 i0Var) {
            this.f60345a = i0Var;
            this.f60346b = new s7.c0();
        }
    }

    public z(s7.i0 i0Var, long j11, long j12) {
        super(new w8.e.b(), new b(i0Var), j11, 0L, j11 + 1, 0L, j12, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }
}
