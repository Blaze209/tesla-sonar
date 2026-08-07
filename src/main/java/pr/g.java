package pr;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.u0;
import com.plaid.internal.EnumC4419g;
import hr.b0;
import hr.v;
import hr.y;
import hr.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import ts.d0;
import ts.m0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class g implements hr.k {
    public static final hr.p I = new hr.p() { // from class: pr.e
        @Override // hr.p
        public final hr.k[] d() {
            return g.b();
        }
    };
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final u0 K = new u0.b().g0("application/x-emsg").G();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private hr.m E;
    private b0[] F;
    private b0[] G;
    private boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f103797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<u0> f103798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray<b> f103799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f103800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0 f103801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d0 f103802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f103803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d0 f103804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m0 f103805j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final wr.c f103806k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d0 f103807l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayDeque<pr.a.C2199a> f103808m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque<a> f103809n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b0 f103810o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f103811p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f103812q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f103813r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f103814s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private d0 f103815t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f103816u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f103817v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f103818w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f103819x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f103820y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private b f103821z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f103822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f103824c;

        public a(long j11, boolean z11, int i11) {
            this.f103822a = j11;
            this.f103823b = z11;
            this.f103824c = i11;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f103825a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public r f103828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f103829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f103830f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f103831g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f103832h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f103833i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f103836l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f103826b = new q();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d0 f103827c = new d0();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final d0 f103834j = new d0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final d0 f103835k = new d0();

        public b(b0 b0Var, r rVar, c cVar) {
            this.f103825a = b0Var;
            this.f103828d = rVar;
            this.f103829e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i11;
            if (this.f103836l) {
                i11 = this.f103826b.f103906k[this.f103830f] ? 1 : 0;
            } else {
                i11 = this.f103828d.f103920g[this.f103830f];
            }
            return g() != null ? i11 | 1073741824 : i11;
        }

        public long d() {
            return !this.f103836l ? this.f103828d.f103916c[this.f103830f] : this.f103826b.f103902g[this.f103832h];
        }

        public long e() {
            return !this.f103836l ? this.f103828d.f103919f[this.f103830f] : this.f103826b.c(this.f103830f);
        }

        public int f() {
            return !this.f103836l ? this.f103828d.f103917d[this.f103830f] : this.f103826b.f103904i[this.f103830f];
        }

        public p g() {
            if (!this.f103836l) {
                return null;
            }
            int i11 = ((c) p0.j(this.f103826b.f103896a)).f103785a;
            p pVarA = this.f103826b.f103909n;
            if (pVarA == null) {
                pVarA = this.f103828d.f103914a.a(i11);
            }
            if (pVarA == null || !pVarA.f103891a) {
                return null;
            }
            return pVarA;
        }

        public boolean h() {
            this.f103830f++;
            if (!this.f103836l) {
                return false;
            }
            int i11 = this.f103831g + 1;
            this.f103831g = i11;
            int[] iArr = this.f103826b.f103903h;
            int i12 = this.f103832h;
            if (i11 != iArr[i12]) {
                return true;
            }
            this.f103832h = i12 + 1;
            this.f103831g = 0;
            return false;
        }

        public int i(int i11, int i12) {
            d0 d0Var;
            p pVarG = g();
            if (pVarG == null) {
                return 0;
            }
            int length = pVarG.f103894d;
            if (length != 0) {
                d0Var = this.f103826b.f103910o;
            } else {
                byte[] bArr = (byte[]) p0.j(pVarG.f103895e);
                this.f103835k.S(bArr, bArr.length);
                d0 d0Var2 = this.f103835k;
                length = bArr.length;
                d0Var = d0Var2;
            }
            boolean zG = this.f103826b.g(this.f103830f);
            boolean z11 = zG || i12 != 0;
            this.f103834j.e()[0] = (byte) ((z11 ? 128 : 0) | length);
            this.f103834j.U(0);
            this.f103825a.f(this.f103834j, 1, 1);
            this.f103825a.f(d0Var, length, 1);
            if (!z11) {
                return length + 1;
            }
            if (!zG) {
                this.f103827c.Q(8);
                byte[] bArrE = this.f103827c.e();
                bArrE[0] = 0;
                bArrE[1] = 1;
                bArrE[2] = (byte) ((i12 >> 8) & 255);
                bArrE[3] = (byte) (i12 & 255);
                bArrE[4] = (byte) ((i11 >> 24) & 255);
                bArrE[5] = (byte) ((i11 >> 16) & 255);
                bArrE[6] = (byte) ((i11 >> 8) & 255);
                bArrE[7] = (byte) (i11 & 255);
                this.f103825a.f(this.f103827c, 8, 1);
                return length + 9;
            }
            d0 d0Var3 = this.f103826b.f103910o;
            int iN = d0Var3.N();
            d0Var3.V(-2);
            int i13 = (iN * 6) + 2;
            if (i12 != 0) {
                this.f103827c.Q(i13);
                byte[] bArrE2 = this.f103827c.e();
                d0Var3.l(bArrE2, 0, i13);
                int i14 = (((bArrE2[2] & 255) << 8) | (bArrE2[3] & 255)) + i12;
                bArrE2[2] = (byte) ((i14 >> 8) & 255);
                bArrE2[3] = (byte) (i14 & 255);
                d0Var3 = this.f103827c;
            }
            this.f103825a.f(d0Var3, i13, 1);
            return length + 1 + i13;
        }

        public void j(r rVar, c cVar) {
            this.f103828d = rVar;
            this.f103829e = cVar;
            this.f103825a.b(rVar.f103914a.f103885f);
            k();
        }

        public void k() {
            this.f103826b.f();
            this.f103830f = 0;
            this.f103832h = 0;
            this.f103831g = 0;
            this.f103833i = 0;
            this.f103836l = false;
        }

        public void l(long j11) {
            int i11 = this.f103830f;
            while (true) {
                q qVar = this.f103826b;
                if (i11 >= qVar.f103901f || qVar.c(i11) > j11) {
                    return;
                }
                if (this.f103826b.f103906k[i11]) {
                    this.f103833i = i11;
                }
                i11++;
            }
        }

        public void m() {
            p pVarG = g();
            if (pVarG == null) {
                return;
            }
            d0 d0Var = this.f103826b.f103910o;
            int i11 = pVarG.f103894d;
            if (i11 != 0) {
                d0Var.V(i11);
            }
            if (this.f103826b.g(this.f103830f)) {
                d0Var.V(d0Var.N() * 6);
            }
        }

        public void n(com.google.android.exoplayer2.drm.h hVar) {
            p pVarA = this.f103828d.f103914a.a(((c) p0.j(this.f103826b.f103896a)).f103785a);
            this.f103825a.b(this.f103828d.f103914a.f103885f.b().O(hVar.b(pVarA != null ? pVarA.f103892b : null)).G());
        }
    }

    public g() {
        this(0);
    }

    private static Pair<Long, hr.c> A(d0 d0Var, long j11) throws ParserException {
        long jM;
        long jM2;
        d0Var.U(8);
        int iC = pr.a.c(d0Var.q());
        d0Var.V(4);
        long J2 = d0Var.J();
        if (iC == 0) {
            jM = d0Var.J();
            jM2 = d0Var.J();
        } else {
            jM = d0Var.M();
            jM2 = d0Var.M();
        }
        long j12 = j11 + jM2;
        long jM0 = p0.M0(jM, 1000000L, J2);
        d0Var.V(2);
        int iN = d0Var.N();
        int[] iArr = new int[iN];
        long[] jArr = new long[iN];
        long[] jArr2 = new long[iN];
        long[] jArr3 = new long[iN];
        long j13 = j12;
        long jM1 = jM0;
        int i11 = 0;
        while (i11 < iN) {
            int iQ = d0Var.q();
            if ((Integer.MIN_VALUE & iQ) != 0) {
                throw ParserException.a("Unhandled indirect reference", null);
            }
            long J3 = d0Var.J();
            iArr[i11] = iQ & Integer.MAX_VALUE;
            jArr[i11] = j13;
            jArr3[i11] = jM1;
            jM += J3;
            long[] jArr4 = jArr3;
            jM1 = p0.M0(jM, 1000000L, J2);
            jArr2[i11] = jM1 - jArr4[i11];
            d0Var.V(4);
            j13 += (long) iArr[i11];
            i11++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jM0), new hr.c(iArr, jArr, jArr2, jArr3));
    }

    private static long B(d0 d0Var) {
        d0Var.U(8);
        return pr.a.c(d0Var.q()) == 1 ? d0Var.M() : d0Var.J();
    }

    private static b C(d0 d0Var, SparseArray<b> sparseArray, boolean z11) {
        d0Var.U(8);
        int iB = pr.a.b(d0Var.q());
        b bVarValueAt = z11 ? sparseArray.valueAt(0) : sparseArray.get(d0Var.q());
        if (bVarValueAt == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jM = d0Var.M();
            q qVar = bVarValueAt.f103826b;
            qVar.f103898c = jM;
            qVar.f103899d = jM;
        }
        c cVar = bVarValueAt.f103829e;
        bVarValueAt.f103826b.f103896a = new c((iB & 2) != 0 ? d0Var.q() - 1 : cVar.f103785a, (iB & 8) != 0 ? d0Var.q() : cVar.f103786b, (iB & 16) != 0 ? d0Var.q() : cVar.f103787c, (iB & 32) != 0 ? d0Var.q() : cVar.f103788d);
        return bVarValueAt;
    }

    private static void D(pr.a.C2199a c2199a, SparseArray<b> sparseArray, boolean z11, int i11, byte[] bArr) throws ParserException {
        b bVarC = C(((pr.a.b) ts.a.e(c2199a.g(1952868452))).f103750b, sparseArray, z11);
        if (bVarC == null) {
            return;
        }
        q qVar = bVarC.f103826b;
        long j11 = qVar.f103912q;
        boolean z12 = qVar.f103913r;
        bVarC.k();
        bVarC.f103836l = true;
        pr.a.b bVarG = c2199a.g(1952867444);
        if (bVarG == null || (i11 & 2) != 0) {
            qVar.f103912q = j11;
            qVar.f103913r = z12;
        } else {
            qVar.f103912q = B(bVarG.f103750b);
            qVar.f103913r = true;
        }
        G(c2199a, bVarC, i11);
        p pVarA = bVarC.f103828d.f103914a.a(((c) ts.a.e(qVar.f103896a)).f103785a);
        pr.a.b bVarG2 = c2199a.g(1935763834);
        if (bVarG2 != null) {
            w((p) ts.a.e(pVarA), bVarG2.f103750b, qVar);
        }
        pr.a.b bVarG3 = c2199a.g(1935763823);
        if (bVarG3 != null) {
            v(bVarG3.f103750b, qVar);
        }
        pr.a.b bVarG4 = c2199a.g(1936027235);
        if (bVarG4 != null) {
            z(bVarG4.f103750b, qVar);
        }
        x(c2199a, pVarA != null ? pVarA.f103892b : null, qVar);
        int size = c2199a.f103748c.size();
        for (int i12 = 0; i12 < size; i12++) {
            pr.a.b bVar = c2199a.f103748c.get(i12);
            if (bVar.f103746a == 1970628964) {
                H(bVar.f103750b, qVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> E(d0 d0Var) {
        d0Var.U(12);
        return Pair.create(Integer.valueOf(d0Var.q()), new c(d0Var.q() - 1, d0Var.q(), d0Var.q(), d0Var.q()));
    }

    private static int F(b bVar, int i11, int i12, d0 d0Var, int i13) throws ParserException {
        int iQ;
        d0Var.U(8);
        int iB = pr.a.b(d0Var.q());
        o oVar = bVar.f103828d.f103914a;
        q qVar = bVar.f103826b;
        c cVar = (c) p0.j(qVar.f103896a);
        qVar.f103903h[i11] = d0Var.L();
        long[] jArr = qVar.f103902g;
        long j11 = qVar.f103898c;
        jArr[i11] = j11;
        if ((iB & 1) != 0) {
            jArr[i11] = j11 + ((long) d0Var.q());
        }
        boolean z11 = (iB & 4) != 0;
        int iQ2 = cVar.f103788d;
        if (z11) {
            iQ2 = d0Var.q();
        }
        boolean z12 = (iB & 256) != 0;
        boolean z13 = (iB & 512) != 0;
        boolean z14 = (iB & 1024) != 0;
        boolean z15 = (iB & 2048) != 0;
        long j12 = l(oVar) ? ((long[]) p0.j(oVar.f103888i))[0] : 0L;
        int[] iArr = qVar.f103904i;
        long[] jArr2 = qVar.f103905j;
        boolean[] zArr = qVar.f103906k;
        boolean z16 = z15;
        boolean z17 = oVar.f103881b == 2 && (i12 & 1) != 0;
        int i14 = i13 + qVar.f103903h[i11];
        boolean z18 = z11;
        long j13 = oVar.f103882c;
        long j14 = qVar.f103912q;
        int i15 = i13;
        while (i15 < i14) {
            int iC = c(z12 ? d0Var.q() : cVar.f103786b);
            int iC2 = c(z13 ? d0Var.q() : cVar.f103787c);
            if (z14) {
                iQ = d0Var.q();
            } else {
                iQ = (i15 == 0 && z18) ? iQ2 : cVar.f103788d;
            }
            int i16 = i15;
            long jM0 = p0.M0((((long) (z16 ? d0Var.q() : 0)) + j14) - j12, 1000000L, j13);
            jArr2[i16] = jM0;
            if (!qVar.f103913r) {
                jArr2[i16] = jM0 + bVar.f103828d.f103921h;
            }
            iArr[i16] = iC2;
            zArr[i16] = ((iQ >> 16) & 1) == 0 && (!z17 || i16 == 0);
            j14 += (long) iC;
            i15 = i16 + 1;
            i14 = i14;
            z17 = z17;
        }
        int i17 = i14;
        qVar.f103912q = j14;
        return i17;
    }

    private static void G(pr.a.C2199a c2199a, b bVar, int i11) throws ParserException {
        List<pr.a.b> list = c2199a.f103748c;
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            pr.a.b bVar2 = list.get(i14);
            if (bVar2.f103746a == 1953658222) {
                d0 d0Var = bVar2.f103750b;
                d0Var.U(12);
                int iL = d0Var.L();
                if (iL > 0) {
                    i13 += iL;
                    i12++;
                }
            }
        }
        bVar.f103832h = 0;
        bVar.f103831g = 0;
        bVar.f103830f = 0;
        bVar.f103826b.e(i12, i13);
        int i15 = 0;
        int iF = 0;
        for (int i16 = 0; i16 < size; i16++) {
            pr.a.b bVar3 = list.get(i16);
            if (bVar3.f103746a == 1953658222) {
                iF = F(bVar, i15, i11, bVar3.f103750b, iF);
                i15++;
            }
        }
    }

    private static void H(d0 d0Var, q qVar, byte[] bArr) throws ParserException {
        d0Var.U(8);
        d0Var.l(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            y(d0Var, 16, qVar);
        }
    }

    private void I(long j11) throws ParserException {
        while (!this.f103808m.isEmpty() && this.f103808m.peek().f103747b == j11) {
            n(this.f103808m.pop());
        }
        d();
    }

    private boolean J(hr.l lVar) throws ParserException {
        if (this.f103814s == 0) {
            if (!lVar.c(this.f103807l.e(), 0, 8, true)) {
                return false;
            }
            this.f103814s = 8;
            this.f103807l.U(0);
            this.f103813r = this.f103807l.J();
            this.f103812q = this.f103807l.q();
        }
        long j11 = this.f103813r;
        if (j11 == 1) {
            lVar.readFully(this.f103807l.e(), 8, 8);
            this.f103814s += 8;
            this.f103813r = this.f103807l.M();
        } else if (j11 == 0) {
            long length = lVar.getLength();
            if (length == -1 && !this.f103808m.isEmpty()) {
                length = this.f103808m.peek().f103747b;
            }
            if (length != -1) {
                this.f103813r = (length - lVar.getPosition()) + ((long) this.f103814s);
            }
        }
        if (this.f103813r < this.f103814s) {
            throw ParserException.c("Atom size less than header length (unsupported).");
        }
        long position = lVar.getPosition() - ((long) this.f103814s);
        int i11 = this.f103812q;
        if ((i11 == 1836019558 || i11 == 1835295092) && !this.H) {
            this.E.p(new z.b(this.f103819x, position));
            this.H = true;
        }
        if (this.f103812q == 1836019558) {
            int size = this.f103799d.size();
            for (int i12 = 0; i12 < size; i12++) {
                q qVar = this.f103799d.valueAt(i12).f103826b;
                qVar.f103897b = position;
                qVar.f103899d = position;
                qVar.f103898c = position;
            }
        }
        int i13 = this.f103812q;
        if (i13 == 1835295092) {
            this.f103821z = null;
            this.f103816u = position + this.f103813r;
            this.f103811p = 2;
            return true;
        }
        if (N(i13)) {
            long position2 = (lVar.getPosition() + this.f103813r) - 8;
            this.f103808m.push(new pr.a.C2199a(this.f103812q, position2));
            if (this.f103813r == this.f103814s) {
                I(position2);
            } else {
                d();
            }
        } else if (O(this.f103812q)) {
            if (this.f103814s != 8) {
                throw ParserException.c("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f103813r > 2147483647L) {
                throw ParserException.c("Leaf atom with length > 2147483647 (unsupported).");
            }
            d0 d0Var = new d0((int) this.f103813r);
            System.arraycopy(this.f103807l.e(), 0, d0Var.e(), 0, 8);
            this.f103815t = d0Var;
            this.f103811p = 1;
        } else {
            if (this.f103813r > 2147483647L) {
                throw ParserException.c("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f103815t = null;
            this.f103811p = 1;
        }
        return true;
    }

    private void K(hr.l lVar) throws ParserException {
        int i11 = ((int) this.f103813r) - this.f103814s;
        d0 d0Var = this.f103815t;
        if (d0Var != null) {
            lVar.readFully(d0Var.e(), 8, i11);
            p(new pr.a.b(this.f103812q, d0Var), lVar.getPosition());
        } else {
            lVar.k(i11);
        }
        I(lVar.getPosition());
    }

    private void L(hr.l lVar) throws ParserException {
        int size = this.f103799d.size();
        long j11 = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = this.f103799d.valueAt(i11).f103826b;
            if (qVar.f103911p) {
                long j12 = qVar.f103899d;
                if (j12 < j11) {
                    bVarValueAt = this.f103799d.valueAt(i11);
                    j11 = j12;
                }
            }
        }
        if (bVarValueAt == null) {
            this.f103811p = 3;
            return;
        }
        int position = (int) (j11 - lVar.getPosition());
        if (position < 0) {
            throw ParserException.a("Offset to encryption data was negative.", null);
        }
        lVar.k(position);
        bVarValueAt.f103826b.a(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean M(hr.l lVar) throws ParserException {
        boolean z11;
        int iA;
        b bVarJ = this.f103821z;
        Throwable th2 = null;
        if (bVarJ == null) {
            bVarJ = j(this.f103799d);
            if (bVarJ == null) {
                int position = (int) (this.f103816u - lVar.getPosition());
                if (position < 0) {
                    throw ParserException.a("Offset to end of mdat was negative.", null);
                }
                lVar.k(position);
                d();
                return false;
            }
            int iD = (int) (bVarJ.d() - lVar.getPosition());
            if (iD < 0) {
                u.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iD = 0;
            }
            lVar.k(iD);
            this.f103821z = bVarJ;
        }
        int i11 = 4;
        int i12 = 1;
        if (this.f103811p == 3) {
            int iF = bVarJ.f();
            this.A = iF;
            if (bVarJ.f103830f < bVarJ.f103833i) {
                lVar.k(iF);
                bVarJ.m();
                if (!bVarJ.h()) {
                    this.f103821z = null;
                }
                this.f103811p = 3;
                return true;
            }
            if (bVarJ.f103828d.f103914a.f103886g == 1) {
                this.A = iF - 8;
                lVar.k(8);
            }
            if ("audio/ac4".equals(bVarJ.f103828d.f103914a.f103885f.f40712l)) {
                this.B = bVarJ.i(this.A, 7);
                dr.c.a(this.A, this.f103804i);
                bVarJ.f103825a.d(this.f103804i, 7);
                this.B += 7;
            } else {
                this.B = bVarJ.i(this.A, 0);
            }
            this.A += this.B;
            this.f103811p = 4;
            this.C = 0;
        }
        o oVar = bVarJ.f103828d.f103914a;
        b0 b0Var = bVarJ.f103825a;
        long jE = bVarJ.e();
        m0 m0Var = this.f103805j;
        if (m0Var != null) {
            jE = m0Var.a(jE);
        }
        if (oVar.f103889j == 0) {
            z11 = 1;
            while (true) {
                int i13 = this.B;
                int i14 = this.A;
                if (i13 >= i14) {
                    break;
                }
                this.B += b0Var.a(lVar, i14 - i13, false);
            }
        } else {
            byte[] bArrE = this.f103801f.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i15 = oVar.f103889j;
            int i16 = i15 + 1;
            int i17 = 4 - i15;
            while (this.B < this.A) {
                int i18 = this.C;
                if (i18 == 0) {
                    lVar.readFully(bArrE, i17, i16);
                    this.f103801f.U(0);
                    int iQ = this.f103801f.q();
                    if (iQ < i12) {
                        throw ParserException.a("Invalid NAL length", th2);
                    }
                    this.C = iQ - 1;
                    this.f103800e.U(0);
                    b0Var.d(this.f103800e, i11);
                    b0Var.d(this.f103801f, i12);
                    this.D = (this.G.length <= 0 || !ts.z.g(oVar.f103885f.f40712l, bArrE[i11])) ? 0 : i12;
                    this.B += 5;
                    this.A += i17;
                } else {
                    if (this.D) {
                        this.f103802g.Q(i18);
                        lVar.readFully(this.f103802g.e(), 0, this.C);
                        b0Var.d(this.f103802g, this.C);
                        iA = this.C;
                        int iQ2 = ts.z.q(this.f103802g.e(), this.f103802g.g());
                        this.f103802g.U("video/hevc".equals(oVar.f103885f.f40712l) ? 1 : 0);
                        this.f103802g.T(iQ2);
                        hr.b.a(jE, this.f103802g, this.G);
                    } else {
                        iA = b0Var.a(lVar, i18, false);
                    }
                    this.B += iA;
                    this.C -= iA;
                    i12 = i12;
                    th2 = null;
                    i11 = 4;
                }
            }
            z11 = i12;
        }
        int iC = bVarJ.c();
        p pVarG = bVarJ.g();
        b0Var.e(jE, iC, this.A, 0, pVarG != null ? pVarG.f103893c : null);
        s(jE);
        if (!bVarJ.h()) {
            this.f103821z = null;
        }
        this.f103811p = 3;
        return z11;
    }

    private static boolean N(int i11) {
        return i11 == 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1836019558 || i11 == 1953653094 || i11 == 1836475768 || i11 == 1701082227;
    }

    private static boolean O(int i11) {
        return i11 == 1751411826 || i11 == 1835296868 || i11 == 1836476516 || i11 == 1936286840 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1668576371 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1937011571 || i11 == 1952867444 || i11 == 1952868452 || i11 == 1953196132 || i11 == 1953654136 || i11 == 1953658222 || i11 == 1886614376 || i11 == 1935763834 || i11 == 1935763823 || i11 == 1936027235 || i11 == 1970628964 || i11 == 1935828848 || i11 == 1936158820 || i11 == 1701606260 || i11 == 1835362404 || i11 == 1701671783;
    }

    public static /* synthetic */ hr.k[] b() {
        return new hr.k[]{new g()};
    }

    private static int c(int i11) throws ParserException {
        if (i11 >= 0) {
            return i11;
        }
        throw ParserException.a("Unexpected negative value: " + i11, null);
    }

    private void d() {
        this.f103811p = 0;
        this.f103814s = 0;
    }

    private c f(SparseArray<c> sparseArray, int i11) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (c) ts.a.e(sparseArray.get(i11));
    }

    private static com.google.android.exoplayer2.drm.h g(List<pr.a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            pr.a.b bVar = list.get(i11);
            if (bVar.f103746a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrE = bVar.f103750b.e();
                UUID uuidF = l.f(bArrE);
                if (uuidF == null) {
                    u.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new com.google.android.exoplayer2.drm.h.b(uuidF, "video/mp4", bArrE));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.google.android.exoplayer2.drm.h(arrayList);
    }

    private static b j(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j11 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            b bVarValueAt = sparseArray.valueAt(i11);
            if ((bVarValueAt.f103836l || bVarValueAt.f103830f != bVarValueAt.f103828d.f103915b) && (!bVarValueAt.f103836l || bVarValueAt.f103832h != bVarValueAt.f103826b.f103900e)) {
                long jD = bVarValueAt.d();
                if (jD < j11) {
                    bVar = bVarValueAt;
                    j11 = jD;
                }
            }
        }
        return bVar;
    }

    private void k() {
        int i11;
        b0[] b0VarArr = new b0[2];
        this.F = b0VarArr;
        b0 b0Var = this.f103810o;
        int i12 = 0;
        if (b0Var != null) {
            b0VarArr[0] = b0Var;
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i13 = 100;
        if ((this.f103796a & 4) != 0) {
            b0VarArr[i11] = this.E.b(100, 5);
            i13 = 101;
            i11++;
        }
        b0[] b0VarArr2 = (b0[]) p0.H0(this.F, i11);
        this.F = b0VarArr2;
        for (b0 b0Var2 : b0VarArr2) {
            b0Var2.b(K);
        }
        this.G = new b0[this.f103798c.size()];
        while (i12 < this.G.length) {
            b0 b0VarB = this.E.b(i13, 3);
            b0VarB.b(this.f103798c.get(i12));
            this.G[i12] = b0VarB;
            i12++;
            i13++;
        }
    }

    private static boolean l(o oVar) {
        long[] jArr;
        long[] jArr2 = oVar.f103887h;
        if (jArr2 != null && jArr2.length == 1 && (jArr = oVar.f103888i) != null) {
            long j11 = jArr2[0];
            if (j11 == 0 || p0.M0(j11 + jArr[0], 1000000L, oVar.f103883d) >= oVar.f103884e) {
                return true;
            }
        }
        return false;
    }

    private void n(pr.a.C2199a c2199a) throws ParserException {
        int i11 = c2199a.f103746a;
        if (i11 == 1836019574) {
            r(c2199a);
        } else if (i11 == 1836019558) {
            q(c2199a);
        } else {
            if (this.f103808m.isEmpty()) {
                return;
            }
            this.f103808m.peek().d(c2199a);
        }
    }

    private void o(d0 d0Var) {
        String str;
        String str2;
        long jM0;
        long jM1;
        long J2;
        long jA;
        if (this.F.length == 0) {
            return;
        }
        d0Var.U(8);
        int iC = pr.a.c(d0Var.q());
        if (iC == 0) {
            str = (String) ts.a.e(d0Var.B());
            str2 = (String) ts.a.e(d0Var.B());
            long J3 = d0Var.J();
            jM0 = p0.M0(d0Var.J(), 1000000L, J3);
            long j11 = this.f103820y;
            long j12 = j11 != -9223372036854775807L ? j11 + jM0 : -9223372036854775807L;
            jM1 = p0.M0(d0Var.J(), 1000L, J3);
            J2 = d0Var.J();
            jA = j12;
        } else {
            if (iC != 1) {
                u.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iC);
                return;
            }
            long J4 = d0Var.J();
            jA = p0.M0(d0Var.M(), 1000000L, J4);
            long jM2 = p0.M0(d0Var.J(), 1000L, J4);
            long J5 = d0Var.J();
            str = (String) ts.a.e(d0Var.B());
            str2 = (String) ts.a.e(d0Var.B());
            jM1 = jM2;
            J2 = J5;
            jM0 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[d0Var.a()];
        d0Var.l(bArr, 0, d0Var.a());
        d0 d0Var2 = new d0(this.f103806k.a(new wr.a(str3, str4, jM1, J2, bArr)));
        int iA = d0Var2.a();
        for (b0 b0Var : this.F) {
            d0Var2.U(0);
            b0Var.d(d0Var2, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f103809n.addLast(new a(jM0, true, iA));
            this.f103817v += iA;
            return;
        }
        if (!this.f103809n.isEmpty()) {
            this.f103809n.addLast(new a(jA, false, iA));
            this.f103817v += iA;
            return;
        }
        m0 m0Var = this.f103805j;
        if (m0Var != null && !m0Var.f()) {
            this.f103809n.addLast(new a(jA, false, iA));
            this.f103817v += iA;
            return;
        }
        m0 m0Var2 = this.f103805j;
        if (m0Var2 != null) {
            jA = m0Var2.a(jA);
        }
        long j13 = jA;
        for (b0 b0Var2 : this.F) {
            b0Var2.e(j13, 1, iA, 0, null);
        }
    }

    private void p(pr.a.b bVar, long j11) throws ParserException {
        if (!this.f103808m.isEmpty()) {
            this.f103808m.peek().e(bVar);
            return;
        }
        int i11 = bVar.f103746a;
        if (i11 != 1936286840) {
            if (i11 == 1701671783) {
                o(bVar.f103750b);
            }
        } else {
            Pair<Long, hr.c> pairA = A(bVar.f103750b, j11);
            this.f103820y = ((Long) pairA.first).longValue();
            this.E.p((z) pairA.second);
            this.H = true;
        }
    }

    private void q(pr.a.C2199a c2199a) throws ParserException {
        u(c2199a, this.f103799d, this.f103797b != null, this.f103796a, this.f103803h);
        com.google.android.exoplayer2.drm.h hVarG = g(c2199a.f103748c);
        if (hVarG != null) {
            int size = this.f103799d.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f103799d.valueAt(i11).n(hVarG);
            }
        }
        if (this.f103818w != -9223372036854775807L) {
            int size2 = this.f103799d.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f103799d.valueAt(i12).l(this.f103818w);
            }
            this.f103818w = -9223372036854775807L;
        }
    }

    private void r(pr.a.C2199a c2199a) {
        int i11 = 0;
        ts.a.h(this.f103797b == null, "Unexpected moov box.");
        com.google.android.exoplayer2.drm.h hVarG = g(c2199a.f103748c);
        pr.a.C2199a c2199a2 = (pr.a.C2199a) ts.a.e(c2199a.f(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c2199a2.f103748c.size();
        long jT = -9223372036854775807L;
        for (int i12 = 0; i12 < size; i12++) {
            pr.a.b bVar = c2199a2.f103748c.get(i12);
            int i13 = bVar.f103746a;
            if (i13 == 1953654136) {
                Pair<Integer, c> pairE = E(bVar.f103750b);
                sparseArray.put(((Integer) pairE.first).intValue(), (c) pairE.second);
            } else if (i13 == 1835362404) {
                jT = t(bVar.f103750b);
            }
        }
        List<r> listB = pr.b.B(c2199a, new v(), jT, hVarG, (this.f103796a & 16) != 0, false, new ou.h() { // from class: pr.f
            @Override // ou.h
            public final Object apply(Object obj) {
                return this.f103795a.m((o) obj);
            }
        });
        int size2 = listB.size();
        if (this.f103799d.size() != 0) {
            ts.a.g(this.f103799d.size() == size2);
            while (i11 < size2) {
                r rVar = listB.get(i11);
                o oVar = rVar.f103914a;
                this.f103799d.get(oVar.f103880a).j(rVar, f(sparseArray, oVar.f103880a));
                i11++;
            }
            return;
        }
        while (i11 < size2) {
            r rVar2 = listB.get(i11);
            o oVar2 = rVar2.f103914a;
            this.f103799d.put(oVar2.f103880a, new b(this.E.b(i11, oVar2.f103881b), rVar2, f(sparseArray, oVar2.f103880a)));
            this.f103819x = Math.max(this.f103819x, oVar2.f103884e);
            i11++;
        }
        this.E.j();
    }

    private void s(long j11) {
        while (!this.f103809n.isEmpty()) {
            a aVarRemoveFirst = this.f103809n.removeFirst();
            this.f103817v -= aVarRemoveFirst.f103824c;
            long jA = aVarRemoveFirst.f103822a;
            if (aVarRemoveFirst.f103823b) {
                jA += j11;
            }
            m0 m0Var = this.f103805j;
            if (m0Var != null) {
                jA = m0Var.a(jA);
            }
            long j12 = jA;
            for (b0 b0Var : this.F) {
                b0Var.e(j12, 1, aVarRemoveFirst.f103824c, this.f103817v, null);
            }
        }
    }

    private static long t(d0 d0Var) {
        d0Var.U(8);
        return pr.a.c(d0Var.q()) == 0 ? d0Var.J() : d0Var.M();
    }

    private static void u(pr.a.C2199a c2199a, SparseArray<b> sparseArray, boolean z11, int i11, byte[] bArr) throws ParserException {
        int size = c2199a.f103749d.size();
        for (int i12 = 0; i12 < size; i12++) {
            pr.a.C2199a c2199a2 = c2199a.f103749d.get(i12);
            if (c2199a2.f103746a == 1953653094) {
                D(c2199a2, sparseArray, z11, i11, bArr);
            }
        }
    }

    private static void v(d0 d0Var, q qVar) throws ParserException {
        d0Var.U(8);
        int iQ = d0Var.q();
        if ((pr.a.b(iQ) & 1) == 1) {
            d0Var.V(8);
        }
        int iL = d0Var.L();
        if (iL == 1) {
            qVar.f103899d += pr.a.c(iQ) == 0 ? d0Var.J() : d0Var.M();
        } else {
            throw ParserException.a("Unexpected saio entry count: " + iL, null);
        }
    }

    private static void w(p pVar, d0 d0Var, q qVar) throws ParserException {
        int i11;
        int i12 = pVar.f103894d;
        d0Var.U(8);
        if ((pr.a.b(d0Var.q()) & 1) == 1) {
            d0Var.V(8);
        }
        int iH = d0Var.H();
        int iL = d0Var.L();
        if (iL > qVar.f103901f) {
            throw ParserException.a("Saiz sample count " + iL + " is greater than fragment sample count" + qVar.f103901f, null);
        }
        if (iH == 0) {
            boolean[] zArr = qVar.f103908m;
            i11 = 0;
            for (int i13 = 0; i13 < iL; i13++) {
                int iH2 = d0Var.H();
                i11 += iH2;
                zArr[i13] = iH2 > i12;
            }
        } else {
            i11 = iH * iL;
            Arrays.fill(qVar.f103908m, 0, iL, iH > i12);
        }
        Arrays.fill(qVar.f103908m, iL, qVar.f103901f, false);
        if (i11 > 0) {
            qVar.d(i11);
        }
    }

    private static void x(pr.a.C2199a c2199a, String str, q qVar) throws ParserException {
        byte[] bArr = null;
        d0 d0Var = null;
        d0 d0Var2 = null;
        for (int i11 = 0; i11 < c2199a.f103748c.size(); i11++) {
            pr.a.b bVar = c2199a.f103748c.get(i11);
            d0 d0Var3 = bVar.f103750b;
            int i12 = bVar.f103746a;
            if (i12 == 1935828848) {
                d0Var3.U(12);
                if (d0Var3.q() == 1936025959) {
                    d0Var = d0Var3;
                }
            } else if (i12 == 1936158820) {
                d0Var3.U(12);
                if (d0Var3.q() == 1936025959) {
                    d0Var2 = d0Var3;
                }
            }
        }
        if (d0Var == null || d0Var2 == null) {
            return;
        }
        d0Var.U(8);
        int iC = pr.a.c(d0Var.q());
        d0Var.V(4);
        if (iC == 1) {
            d0Var.V(4);
        }
        if (d0Var.q() != 1) {
            throw ParserException.c("Entry count in sbgp != 1 (unsupported).");
        }
        d0Var2.U(8);
        int iC2 = pr.a.c(d0Var2.q());
        d0Var2.V(4);
        if (iC2 == 1) {
            if (d0Var2.J() == 0) {
                throw ParserException.c("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC2 >= 2) {
            d0Var2.V(4);
        }
        if (d0Var2.J() != 1) {
            throw ParserException.c("Entry count in sgpd != 1 (unsupported).");
        }
        d0Var2.V(1);
        int iH = d0Var2.H();
        int i13 = (iH & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
        int i14 = iH & 15;
        boolean z11 = d0Var2.H() == 1;
        if (z11) {
            int iH2 = d0Var2.H();
            byte[] bArr2 = new byte[16];
            d0Var2.l(bArr2, 0, 16);
            if (iH2 == 0) {
                int iH3 = d0Var2.H();
                bArr = new byte[iH3];
                d0Var2.l(bArr, 0, iH3);
            }
            qVar.f103907l = true;
            qVar.f103909n = new p(z11, str, iH2, bArr2, i13, i14, bArr);
        }
    }

    private static void y(d0 d0Var, int i11, q qVar) throws ParserException {
        d0Var.U(i11 + 8);
        int iB = pr.a.b(d0Var.q());
        if ((iB & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z11 = (iB & 2) != 0;
        int iL = d0Var.L();
        if (iL == 0) {
            Arrays.fill(qVar.f103908m, 0, qVar.f103901f, false);
            return;
        }
        if (iL == qVar.f103901f) {
            Arrays.fill(qVar.f103908m, 0, iL, z11);
            qVar.d(d0Var.a());
            qVar.b(d0Var);
        } else {
            throw ParserException.a("Senc sample count " + iL + " is different from fragment sample count" + qVar.f103901f, null);
        }
    }

    private static void z(d0 d0Var, q qVar) throws ParserException {
        y(d0Var, 0, qVar);
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        int size = this.f103799d.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f103799d.valueAt(i11).k();
        }
        this.f103809n.clear();
        this.f103817v = 0;
        this.f103818w = j12;
        this.f103808m.clear();
        d();
    }

    @Override // hr.k
    public void e(hr.m mVar) {
        this.E = mVar;
        d();
        k();
        o oVar = this.f103797b;
        if (oVar != null) {
            this.f103799d.put(0, new b(mVar.b(0, oVar.f103881b), new r(this.f103797b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.j();
        }
    }

    @Override // hr.k
    public boolean h(hr.l lVar) {
        return n.b(lVar);
    }

    @Override // hr.k
    public int i(hr.l lVar, y yVar) throws ParserException {
        while (true) {
            int i11 = this.f103811p;
            if (i11 != 0) {
                if (i11 == 1) {
                    K(lVar);
                } else if (i11 == 2) {
                    L(lVar);
                } else if (M(lVar)) {
                    return 0;
                }
            } else if (!J(lVar)) {
                return -1;
            }
        }
    }

    public g(int i11) {
        this(i11, null);
    }

    public g(int i11, m0 m0Var) {
        this(i11, m0Var, null, Collections.EMPTY_LIST);
    }

    public g(int i11, m0 m0Var, o oVar, List<u0> list) {
        this(i11, m0Var, oVar, list, null);
    }

    public g(int i11, m0 m0Var, o oVar, List<u0> list, b0 b0Var) {
        this.f103796a = i11;
        this.f103805j = m0Var;
        this.f103797b = oVar;
        this.f103798c = Collections.unmodifiableList(list);
        this.f103810o = b0Var;
        this.f103806k = new wr.c();
        this.f103807l = new d0(16);
        this.f103800e = new d0(ts.z.f115086a);
        this.f103801f = new d0(5);
        this.f103802g = new d0();
        byte[] bArr = new byte[16];
        this.f103803h = bArr;
        this.f103804i = new d0(bArr);
        this.f103808m = new ArrayDeque<>();
        this.f103809n = new ArrayDeque<>();
        this.f103799d = new SparseArray<>();
        this.f103819x = -9223372036854775807L;
        this.f103818w = -9223372036854775807L;
        this.f103820y = -9223372036854775807L;
        this.E = hr.m.D1;
        this.F = new b0[0];
        this.G = new b0[0];
    }

    @Override // hr.k
    public void release() {
    }

    protected o m(o oVar) {
        return oVar;
    }
}
