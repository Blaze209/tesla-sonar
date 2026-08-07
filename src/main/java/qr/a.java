package qr;

import com.google.android.exoplayer2.ParserException;
import hr.a0;
import hr.l;
import hr.n;
import hr.z;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f105856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f105857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f105858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f105859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f105860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f105861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f105862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f105863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f105864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f105865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f105866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f105867l;

    private final class b implements z {
        private b() {
        }

        @Override // hr.z
        public z.a c(long j11) {
            return new z.a(new a0(j11, p0.r((a.this.f105857b + BigInteger.valueOf(a.this.f105859d.c(j11)).multiply(BigInteger.valueOf(a.this.f105858c - a.this.f105857b)).divide(BigInteger.valueOf(a.this.f105861f)).longValue()) - 30000, a.this.f105857b, a.this.f105858c - 1)));
        }

        @Override // hr.z
        public boolean d() {
            return true;
        }

        @Override // hr.z
        public long g() {
            return a.this.f105859d.b(a.this.f105861f);
        }
    }

    public a(i iVar, long j11, long j12, long j13, long j14, boolean z11) {
        ts.a.a(j11 >= 0 && j12 > j11);
        this.f105859d = iVar;
        this.f105857b = j11;
        this.f105858c = j12;
        if (j13 == j12 - j11 || z11) {
            this.f105861f = j14;
            this.f105860e = 4;
        } else {
            this.f105860e = 0;
        }
        this.f105856a = new f();
    }

    private long i(l lVar) throws IOException {
        if (this.f105864i == this.f105865j) {
            return -1L;
        }
        long position = lVar.getPosition();
        if (!this.f105856a.d(lVar, this.f105865j)) {
            long j11 = this.f105864i;
            if (j11 != position) {
                return j11;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f105856a.a(lVar, false);
        lVar.g();
        long j12 = this.f105863h;
        f fVar = this.f105856a;
        long j13 = fVar.f105886c;
        long j14 = j12 - j13;
        int i11 = fVar.f105891h + fVar.f105892i;
        if (0 <= j14 && j14 < 72000) {
            return -1L;
        }
        if (j14 < 0) {
            this.f105865j = position;
            this.f105867l = j13;
        } else {
            this.f105864i = lVar.getPosition() + ((long) i11);
            this.f105866k = this.f105856a.f105886c;
        }
        long j15 = this.f105865j;
        long j16 = this.f105864i;
        if (j15 - j16 < 100000) {
            this.f105865j = j16;
            return j16;
        }
        long position2 = lVar.getPosition() - (((long) i11) * (j14 <= 0 ? 2L : 1L));
        long j17 = this.f105865j;
        long j18 = this.f105864i;
        return p0.r(position2 + ((j14 * (j17 - j18)) / (this.f105867l - this.f105866k)), j18, j17 - 1);
    }

    private void k(l lVar) throws ParserException {
        while (true) {
            this.f105856a.c(lVar);
            this.f105856a.a(lVar, false);
            f fVar = this.f105856a;
            if (fVar.f105886c > this.f105863h) {
                lVar.g();
                return;
            } else {
                lVar.k(fVar.f105891h + fVar.f105892i);
                this.f105864i = lVar.getPosition();
                this.f105866k = this.f105856a.f105886c;
            }
        }
    }

    @Override // qr.g
    public long a(l lVar) throws IOException {
        int i11 = this.f105860e;
        if (i11 == 0) {
            long position = lVar.getPosition();
            this.f105862g = position;
            this.f105860e = 1;
            long j11 = this.f105858c - 65307;
            if (j11 > position) {
                return j11;
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
                long jI = i(lVar);
                if (jI != -1) {
                    return jI;
                }
                this.f105860e = 3;
            } else if (i11 != 3) {
                if (i11 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(lVar);
            this.f105860e = 4;
            return -(this.f105866k + 2);
        }
        this.f105861f = j(lVar);
        this.f105860e = 4;
        return this.f105862g;
    }

    @Override // qr.g
    public void c(long j11) {
        this.f105863h = p0.r(j11, 0L, this.f105861f - 1);
        this.f105860e = 2;
        this.f105864i = this.f105857b;
        this.f105865j = this.f105858c;
        this.f105866k = 0L;
        this.f105867l = this.f105861f;
    }

    @Override // qr.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b b() {
        if (this.f105861f != 0) {
            return new b();
        }
        return null;
    }

    long j(l lVar) throws ParserException, EOFException {
        this.f105856a.b();
        if (!this.f105856a.c(lVar)) {
            throw new EOFException();
        }
        this.f105856a.a(lVar, false);
        f fVar = this.f105856a;
        lVar.k(fVar.f105891h + fVar.f105892i);
        long j11 = this.f105856a.f105886c;
        while (true) {
            f fVar2 = this.f105856a;
            if ((fVar2.f105885b & 4) == 4 || !fVar2.c(lVar) || lVar.getPosition() >= this.f105858c || !this.f105856a.a(lVar, true)) {
                break;
            }
            f fVar3 = this.f105856a;
            if (!n.e(lVar, fVar3.f105891h + fVar3.f105892i)) {
                break;
            }
            j11 = this.f105856a.f105886c;
        }
        return j11;
    }
}
