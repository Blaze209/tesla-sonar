package da;

import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
final class h0 extends w8.e {

    private static final class a implements w8.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s7.i0 f60013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s7.c0 f60014b = new s7.c0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f60015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f60016d;

        public a(int i11, s7.i0 i0Var, int i12) {
            this.f60015c = i11;
            this.f60013a = i0Var;
            this.f60016d = i12;
        }

        private w8.e.C2600e c(s7.c0 c0Var, long j11, long j12) {
            int iA;
            int iA2;
            int iJ = c0Var.j();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (c0Var.a() >= 188 && (iA2 = (iA = m0.a(c0Var.f(), c0Var.g(), iJ)) + 188) <= iJ) {
                long jC = m0.c(c0Var, iA, this.f60015c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f60013a.b(jC);
                    if (jB > j11) {
                        return j15 == -9223372036854775807L ? w8.e.C2600e.d(jB, j12) : w8.e.C2600e.e(j12 + j14);
                    }
                    if (100000 + jB > j11) {
                        return w8.e.C2600e.e(j12 + ((long) iA));
                    }
                    j14 = iA;
                    j15 = jB;
                }
                c0Var.b0(iA2);
                j13 = iA2;
            }
            return j15 != -9223372036854775807L ? w8.e.C2600e.f(j15, j12 + j13) : w8.e.C2600e.f121288d;
        }

        @Override // w8.e.f
        public void a() {
            this.f60014b.Y(q0.f110459f);
        }

        @Override // w8.e.f
        public w8.e.C2600e b(w8.q qVar, long j11) {
            long position = qVar.getPosition();
            int iMin = (int) Math.min(this.f60016d, qVar.getLength() - position);
            this.f60014b.X(iMin);
            qVar.e(this.f60014b.f(), 0, iMin);
            return c(this.f60014b, j11, position);
        }
    }

    public h0(s7.i0 i0Var, long j11, long j12, int i11, int i12) {
        super(new w8.e.b(), new a(i11, i0Var, i12), j11, 0L, j11 + 1, 0L, j12, 188L, 940);
    }
}
