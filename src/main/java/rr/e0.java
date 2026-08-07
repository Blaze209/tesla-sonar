package rr;

import ts.m0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class e0 extends hr.a {

    private static final class a implements hr.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m0 f108753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ts.d0 f108754b = new ts.d0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f108755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f108756d;

        public a(int i11, m0 m0Var, int i12) {
            this.f108755c = i11;
            this.f108753a = m0Var;
            this.f108756d = i12;
        }

        private hr.a.e c(ts.d0 d0Var, long j11, long j12) {
            int iA;
            int iA2;
            int iG = d0Var.g();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (d0Var.a() >= 188 && (iA2 = (iA = j0.a(d0Var.e(), d0Var.f(), iG)) + 188) <= iG) {
                long jC = j0.c(d0Var, iA, this.f108755c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f108753a.b(jC);
                    if (jB > j11) {
                        return j15 == -9223372036854775807L ? hr.a.e.d(jB, j12) : hr.a.e.e(j12 + j14);
                    }
                    if (100000 + jB > j11) {
                        return hr.a.e.e(j12 + ((long) iA));
                    }
                    j14 = iA;
                    j15 = jB;
                }
                d0Var.U(iA2);
                j13 = iA2;
            }
            return j15 != -9223372036854775807L ? hr.a.e.f(j15, j12 + j13) : hr.a.e.f73296d;
        }

        @Override // hr.a.f
        public void a() {
            this.f108754b.R(p0.f115045f);
        }

        @Override // hr.a.f
        public hr.a.e b(hr.l lVar, long j11) {
            long position = lVar.getPosition();
            int iMin = (int) Math.min(this.f108756d, lVar.getLength() - position);
            this.f108754b.Q(iMin);
            lVar.e(this.f108754b.e(), 0, iMin);
            return c(this.f108754b, j11, position);
        }
    }

    public e0(m0 m0Var, long j11, long j12, int i11, int i12) {
        super(new hr.a.b(), new a(i11, m0Var, i12), j11, 0L, j11 + 1, 0L, j12, 188L, 940);
    }
}
