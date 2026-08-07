package nr;

import com.google.android.exoplayer2.ParserException;
import hr.l;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f95293a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<b> f95294b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f95295c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private nr.b f95296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f95297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f95298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f95299g;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f95300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f95301b;

        private b(int i11, long j11) {
            this.f95300a = i11;
            this.f95301b = j11;
        }
    }

    @RequiresNonNull({"processor"})
    private long c(l lVar) {
        lVar.g();
        while (true) {
            lVar.e(this.f95293a, 0, 4);
            int iC = g.c(this.f95293a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f95293a, iC, false);
                if (this.f95296d.g(iA)) {
                    lVar.k(iC);
                    return iA;
                }
            }
            lVar.k(1);
        }
    }

    private double d(l lVar, int i11) {
        long jE = e(lVar, i11);
        return i11 == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    private long e(l lVar, int i11) {
        lVar.readFully(this.f95293a, 0, i11);
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 << 8) | ((long) (this.f95293a[i12] & 255));
        }
        return j11;
    }

    private static String f(l lVar, int i11) {
        if (i11 == 0) {
            return "";
        }
        byte[] bArr = new byte[i11];
        lVar.readFully(bArr, 0, i11);
        while (i11 > 0 && bArr[i11 - 1] == 0) {
            i11--;
        }
        return new String(bArr, 0, i11);
    }

    @Override // nr.c
    public boolean a(l lVar) throws ParserException {
        ts.a.i(this.f95296d);
        while (true) {
            b bVarPeek = this.f95294b.peek();
            if (bVarPeek != null && lVar.getPosition() >= bVarPeek.f95301b) {
                this.f95296d.a(this.f95294b.pop().f95300a);
                return true;
            }
            if (this.f95297e == 0) {
                long jD = this.f95295c.d(lVar, true, false, 4);
                if (jD == -2) {
                    jD = c(lVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f95298f = (int) jD;
                this.f95297e = 1;
            }
            if (this.f95297e == 1) {
                this.f95299g = this.f95295c.d(lVar, false, true, 8);
                this.f95297e = 2;
            }
            int iF = this.f95296d.f(this.f95298f);
            if (iF != 0) {
                if (iF == 1) {
                    long position = lVar.getPosition();
                    this.f95294b.push(new b(this.f95298f, this.f95299g + position));
                    this.f95296d.e(this.f95298f, position, this.f95299g);
                    this.f95297e = 0;
                    return true;
                }
                if (iF == 2) {
                    long j11 = this.f95299g;
                    if (j11 <= 8) {
                        this.f95296d.c(this.f95298f, e(lVar, (int) j11));
                        this.f95297e = 0;
                        return true;
                    }
                    throw ParserException.a("Invalid integer size: " + this.f95299g, null);
                }
                if (iF == 3) {
                    long j12 = this.f95299g;
                    if (j12 <= 2147483647L) {
                        this.f95296d.d(this.f95298f, f(lVar, (int) j12));
                        this.f95297e = 0;
                        return true;
                    }
                    throw ParserException.a("String element size: " + this.f95299g, null);
                }
                if (iF == 4) {
                    this.f95296d.h(this.f95298f, (int) this.f95299g, lVar);
                    this.f95297e = 0;
                    return true;
                }
                if (iF != 5) {
                    throw ParserException.a("Invalid element type " + iF, null);
                }
                long j13 = this.f95299g;
                if (j13 == 4 || j13 == 8) {
                    this.f95296d.b(this.f95298f, d(lVar, (int) j13));
                    this.f95297e = 0;
                    return true;
                }
                throw ParserException.a("Invalid float size: " + this.f95299g, null);
            }
            lVar.k((int) this.f95299g);
            this.f95297e = 0;
        }
    }

    @Override // nr.c
    public void b(nr.b bVar) {
        this.f95296d = bVar;
    }

    @Override // nr.c
    public void reset() {
        this.f95297e = 0;
        this.f95294b.clear();
        this.f95295c.e();
    }
}
