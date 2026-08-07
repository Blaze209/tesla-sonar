package o9;

import androidx.media3.common.ParserException;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import w8.q;

/* JADX INFO: loaded from: classes3.dex */
final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f96887a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<b> f96888b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f96889c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o9.b f96890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f96891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f96892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f96893g;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f96894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f96895b;

        private b(int i11, long j11) {
            this.f96894a = i11;
            this.f96895b = j11;
        }
    }

    @RequiresNonNull({"processor"})
    private long c(q qVar) {
        qVar.g();
        while (true) {
            qVar.e(this.f96887a, 0, 4);
            int iC = g.c(this.f96887a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f96887a, iC, false);
                if (this.f96890d.g(iA)) {
                    qVar.k(iC);
                    return iA;
                }
            }
            qVar.k(1);
        }
    }

    private double d(q qVar, int i11) {
        long jE = e(qVar, i11);
        return i11 == 4 ? Float.intBitsToFloat((int) jE) : Double.longBitsToDouble(jE);
    }

    private long e(q qVar, int i11) {
        qVar.readFully(this.f96887a, 0, i11);
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 << 8) | ((long) (this.f96887a[i12] & 255));
        }
        return j11;
    }

    private static String f(q qVar, int i11) {
        if (i11 == 0) {
            return "";
        }
        byte[] bArr = new byte[i11];
        qVar.readFully(bArr, 0, i11);
        while (i11 > 0 && bArr[i11 - 1] == 0) {
            i11--;
        }
        return new String(bArr, 0, i11);
    }

    @Override // o9.c
    public boolean a(q qVar) throws ParserException {
        s7.a.j(this.f96890d);
        while (true) {
            b bVarPeek = this.f96888b.peek();
            if (bVarPeek != null && qVar.getPosition() >= bVarPeek.f96895b) {
                this.f96890d.a(this.f96888b.pop().f96894a);
                return true;
            }
            if (this.f96891e == 0) {
                long jD = this.f96889c.d(qVar, true, false, 4);
                if (jD == -2) {
                    jD = c(qVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f96892f = (int) jD;
                this.f96891e = 1;
            }
            if (this.f96891e == 1) {
                this.f96893g = this.f96889c.d(qVar, false, true, 8);
                this.f96891e = 2;
            }
            int iF = this.f96890d.f(this.f96892f);
            if (iF != 0) {
                if (iF == 1) {
                    long position = qVar.getPosition();
                    this.f96888b.push(new b(this.f96892f, this.f96893g + position));
                    this.f96890d.e(this.f96892f, position, this.f96893g);
                    this.f96891e = 0;
                    return true;
                }
                if (iF == 2) {
                    long j11 = this.f96893g;
                    if (j11 <= 8) {
                        this.f96890d.c(this.f96892f, e(qVar, (int) j11));
                        this.f96891e = 0;
                        return true;
                    }
                    throw ParserException.a("Invalid integer size: " + this.f96893g, null);
                }
                if (iF == 3) {
                    long j12 = this.f96893g;
                    if (j12 <= 2147483647L) {
                        this.f96890d.d(this.f96892f, f(qVar, (int) j12));
                        this.f96891e = 0;
                        return true;
                    }
                    throw ParserException.a("String element size: " + this.f96893g, null);
                }
                if (iF == 4) {
                    this.f96890d.h(this.f96892f, (int) this.f96893g, qVar);
                    this.f96891e = 0;
                    return true;
                }
                if (iF != 5) {
                    throw ParserException.a("Invalid element type " + iF, null);
                }
                long j13 = this.f96893g;
                if (j13 == 4 || j13 == 8) {
                    this.f96890d.b(this.f96892f, d(qVar, (int) j13));
                    this.f96891e = 0;
                    return true;
                }
                throw ParserException.a("Invalid float size: " + this.f96893g, null);
            }
            qVar.k((int) this.f96893g);
            this.f96891e = 0;
        }
    }

    @Override // o9.c
    public void b(o9.b bVar) {
        this.f96890d = bVar;
    }

    @Override // o9.c
    public void reset() {
        this.f96891e = 0;
        this.f96888b.clear();
        this.f96889c.e();
    }
}
