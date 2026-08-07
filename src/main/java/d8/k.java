package d8;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p7.u;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i f59842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f59843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f59844c;

    public static abstract class a extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f59845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f59846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List<d> f59847f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f59848g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f59849h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final long f59850i;

        public a(i iVar, long j11, long j12, long j13, long j14, List<d> list, long j15, long j16, long j17) {
            super(iVar, j11, j12);
            this.f59845d = j13;
            this.f59846e = j14;
            this.f59847f = list;
            this.f59850i = j15;
            this.f59848g = j16;
            this.f59849h = j17;
        }

        public long c(long j11, long j12) {
            long jG = g(j11);
            return jG != -1 ? jG : (int) (i((j12 - this.f59849h) + this.f59850i, j11) - d(j11, j12));
        }

        public long d(long j11, long j12) {
            if (g(j11) == -1) {
                long j13 = this.f59848g;
                if (j13 != -9223372036854775807L) {
                    return Math.max(e(), i((j12 - this.f59849h) - j13, j11));
                }
            }
            return e();
        }

        public long e() {
            return this.f59845d;
        }

        public long f(long j11, long j12) {
            if (this.f59847f != null) {
                return -9223372036854775807L;
            }
            long jD = d(j11, j12) + c(j11, j12);
            return (j(jD) + h(jD, j11)) - this.f59850i;
        }

        public abstract long g(long j11);

        public final long h(long j11, long j12) {
            List<d> list = this.f59847f;
            if (list != null) {
                return (list.get((int) (j11 - this.f59845d)).f59856b * 1000000) / this.f59843b;
            }
            long jG = g(j12);
            return (jG == -1 || j11 != (e() + jG) - 1) ? (this.f59846e * 1000000) / this.f59843b : j12 - j(j11);
        }

        public long i(long j11, long j12) {
            long jE = e();
            long jG = g(j12);
            if (jG != 0) {
                if (this.f59847f != null) {
                    long j13 = (jG + jE) - 1;
                    long j14 = jE;
                    while (j14 <= j13) {
                        long j15 = ((j13 - j14) / 2) + j14;
                        long j16 = j(j15);
                        if (j16 < j11) {
                            j14 = j15 + 1;
                        } else {
                            if (j16 <= j11) {
                                return j15;
                            }
                            j13 = j15 - 1;
                        }
                    }
                    return j14 == jE ? j14 : j13;
                }
                long j17 = this.f59845d + (j11 / ((this.f59846e * 1000000) / this.f59843b));
                if (j17 >= jE) {
                    return jG == -1 ? j17 : Math.min(j17, (jE + jG) - 1);
                }
            }
            return jE;
        }

        public final long j(long j11) {
            List<d> list = this.f59847f;
            return q0.s1(list != null ? list.get((int) (j11 - this.f59845d)).f59855a - this.f59844c : (j11 - this.f59845d) * this.f59846e, 1000000L, this.f59843b);
        }

        public abstract i k(j jVar, long j11);

        public boolean l() {
            return this.f59847f != null;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final List<i> f59851j;

        public b(i iVar, long j11, long j12, long j13, long j14, List<d> list, long j15, List<i> list2, long j16, long j17) {
            super(iVar, j11, j12, j13, j14, list, j15, j16, j17);
            this.f59851j = list2;
        }

        @Override // d8.k.a
        public long g(long j11) {
            return this.f59851j.size();
        }

        @Override // d8.k.a
        public i k(j jVar, long j11) {
            return this.f59851j.get((int) (j11 - this.f59845d));
        }

        @Override // d8.k.a
        public boolean l() {
            return true;
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final n f59852j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final n f59853k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final long f59854l;

        public c(i iVar, long j11, long j12, long j13, long j14, long j15, List<d> list, long j16, n nVar, n nVar2, long j17, long j18) {
            super(iVar, j11, j12, j13, j15, list, j16, j17, j18);
            this.f59852j = nVar;
            this.f59853k = nVar2;
            this.f59854l = j14;
        }

        @Override // d8.k
        public i a(j jVar) {
            n nVar = this.f59852j;
            if (nVar == null) {
                return super.a(jVar);
            }
            u uVar = jVar.f59829b;
            return new i(nVar.a(uVar.f101530a, 0L, uVar.f101539j, 0L), 0L, -1L);
        }

        @Override // d8.k.a
        public long g(long j11) {
            List<d> list = this.f59847f;
            if (list != null) {
                return list.size();
            }
            long j12 = this.f59854l;
            if (j12 != -1) {
                return (j12 - this.f59845d) + 1;
            }
            if (j11 != -9223372036854775807L) {
                return qu.a.a(BigInteger.valueOf(j11).multiply(BigInteger.valueOf(this.f59843b)), BigInteger.valueOf(this.f59846e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // d8.k.a
        public i k(j jVar, long j11) {
            List<d> list = this.f59847f;
            long j12 = list != null ? list.get((int) (j11 - this.f59845d)).f59855a : (j11 - this.f59845d) * this.f59846e;
            n nVar = this.f59853k;
            u uVar = jVar.f59829b;
            return new i(nVar.a(uVar.f101530a, j11, uVar.f101539j, j12), 0L, -1L);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f59855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f59856b;

        public d(long j11, long j12) {
            this.f59855a = j11;
            this.f59856b = j12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f59855a == dVar.f59855a && this.f59856b == dVar.f59856b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f59855a) * 31) + ((int) this.f59856b);
        }
    }

    public k(i iVar, long j11, long j12) {
        this.f59842a = iVar;
        this.f59843b = j11;
        this.f59844c = j12;
    }

    public i a(j jVar) {
        return this.f59842a;
    }

    public long b() {
        return q0.s1(this.f59844c, 1000000L, this.f59843b);
    }

    public static class e extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f59857d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f59858e;

        public e(i iVar, long j11, long j12, long j13, long j14) {
            super(iVar, j11, j12);
            this.f59857d = j13;
            this.f59858e = j14;
        }

        public i c() {
            long j11 = this.f59858e;
            if (j11 <= 0) {
                return null;
            }
            return new i(null, this.f59857d, j11);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
