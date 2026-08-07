package r9;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import s7.q0;
import w8.j0;
import w8.k0;
import w8.q;
import w8.s;

/* JADX INFO: loaded from: classes3.dex */
final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f107309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f107310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f107311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f107312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f107313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f107314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f107315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f107316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f107317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f107318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f107319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f107320l;

    private final class b implements j0 {
        private b() {
        }

        @Override // w8.j0
        public j0.a c(long j11) {
            return new j0.a(new k0(j11, q0.s((a.this.f107310b + BigInteger.valueOf(a.this.f107312d.c(j11)).multiply(BigInteger.valueOf(a.this.f107311c - a.this.f107310b)).divide(BigInteger.valueOf(a.this.f107314f)).longValue()) - 30000, a.this.f107310b, a.this.f107311c - 1)));
        }

        @Override // w8.j0
        public boolean d() {
            return true;
        }

        @Override // w8.j0
        public long g() {
            return a.this.f107312d.b(a.this.f107314f);
        }
    }

    public a(i iVar, long j11, long j12, long j13, long j14, boolean z11) {
        s7.a.a(j11 >= 0 && j12 > j11);
        this.f107312d = iVar;
        this.f107310b = j11;
        this.f107311c = j12;
        if (j13 == j12 - j11 || z11) {
            this.f107314f = j14;
            this.f107313e = 4;
        } else {
            this.f107313e = 0;
        }
        this.f107309a = new f();
    }

    private long i(q qVar) throws IOException {
        if (this.f107317i == this.f107318j) {
            return -1L;
        }
        long position = qVar.getPosition();
        if (!this.f107309a.d(qVar, this.f107318j)) {
            long j11 = this.f107317i;
            if (j11 != position) {
                return j11;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f107309a.a(qVar, false);
        qVar.g();
        long j12 = this.f107316h;
        f fVar = this.f107309a;
        long j13 = fVar.f107339c;
        long j14 = j12 - j13;
        int i11 = fVar.f107344h + fVar.f107345i;
        if (0 <= j14 && j14 < 72000) {
            return -1L;
        }
        if (j14 < 0) {
            this.f107318j = position;
            this.f107320l = j13;
        } else {
            this.f107317i = qVar.getPosition() + ((long) i11);
            this.f107319k = this.f107309a.f107339c;
        }
        long j15 = this.f107318j;
        long j16 = this.f107317i;
        if (j15 - j16 < 100000) {
            this.f107318j = j16;
            return j16;
        }
        long position2 = qVar.getPosition() - (((long) i11) * (j14 <= 0 ? 2L : 1L));
        long j17 = this.f107318j;
        long j18 = this.f107317i;
        return q0.s(position2 + ((j14 * (j17 - j18)) / (this.f107320l - this.f107319k)), j18, j17 - 1);
    }

    private void k(q qVar) throws ParserException {
        while (true) {
            this.f107309a.c(qVar);
            this.f107309a.a(qVar, false);
            f fVar = this.f107309a;
            if (fVar.f107339c > this.f107316h) {
                qVar.g();
                return;
            } else {
                qVar.k(fVar.f107344h + fVar.f107345i);
                this.f107317i = qVar.getPosition();
                this.f107319k = this.f107309a.f107339c;
            }
        }
    }

    @Override // r9.g
    public long a(q qVar) throws IOException {
        int i11 = this.f107313e;
        if (i11 == 0) {
            long position = qVar.getPosition();
            this.f107315g = position;
            this.f107313e = 1;
            long j11 = this.f107311c - 65307;
            if (j11 > position) {
                return j11;
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
                long jI = i(qVar);
                if (jI != -1) {
                    return jI;
                }
                this.f107313e = 3;
            } else if (i11 != 3) {
                if (i11 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(qVar);
            this.f107313e = 4;
            return -(this.f107319k + 2);
        }
        this.f107314f = j(qVar);
        this.f107313e = 4;
        return this.f107315g;
    }

    @Override // r9.g
    public void c(long j11) {
        this.f107316h = q0.s(j11, 0L, this.f107314f - 1);
        this.f107313e = 2;
        this.f107317i = this.f107310b;
        this.f107318j = this.f107311c;
        this.f107319k = 0L;
        this.f107320l = this.f107314f;
    }

    @Override // r9.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b b() {
        if (this.f107314f != 0) {
            return new b();
        }
        return null;
    }

    long j(q qVar) throws ParserException, EOFException {
        this.f107309a.b();
        if (!this.f107309a.c(qVar)) {
            throw new EOFException();
        }
        this.f107309a.a(qVar, false);
        f fVar = this.f107309a;
        qVar.k(fVar.f107344h + fVar.f107345i);
        long j11 = this.f107309a.f107339c;
        while (true) {
            f fVar2 = this.f107309a;
            if ((fVar2.f107338b & 4) == 4 || !fVar2.c(qVar) || qVar.getPosition() >= this.f107311c || !this.f107309a.a(qVar, true)) {
                break;
            }
            f fVar3 = this.f107309a;
            if (!s.f(qVar, fVar3.f107344h + fVar3.f107345i)) {
                break;
            }
            j11 = this.f107309a.f107339c;
        }
        return j11;
    }
}
