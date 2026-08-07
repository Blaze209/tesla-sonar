package q9;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p7.f0;
import s7.c0;
import s7.i0;
import s7.q0;
import w8.b0;
import w8.j0;
import w8.n0;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
public class h implements w8.p {

    @Deprecated
    public static final w8.u P = new w8.u() { // from class: q9.f
        @Override // w8.u
        public final w8.p[] d() {
            return h.b();
        }
    };
    private static final byte[] Q = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final p7.u R = new p7.u.b().y0("application/x-emsg").P();
    private long A;
    private long B;
    private long C;
    private b D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private w8.r J;
    private o0[] K;
    private o0[] L;
    private boolean M;
    private boolean N;
    private long O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t9.q.a f104985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f104986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f104987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<p7.u> f104988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<b> f104989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0 f104990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0 f104991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f104992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f104993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c0 f104994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i0 f104995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final h9.c f104996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c0 f104997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque<t7.e.b> f104998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayDeque<a> f104999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final t7.k f105000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o0 f105001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final w8.h f105002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.common.collect.x<n0> f105003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f105004t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f105005u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f105006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f105007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c0 f105008x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f105009y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f105010z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f105011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f105012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f105013c;

        public a(long j11, boolean z11, int i11) {
            this.f105011a = j11;
            this.f105012b = z11;
            this.f105013c = i11;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o0 f105014a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public w f105017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f105018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f105019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f105020g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f105021h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f105022i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final p7.u f105023j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f105026m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f105015b = new v();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c0 f105016c = new c0();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final c0 f105024k = new c0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final c0 f105025l = new c0();

        public b(o0 o0Var, w wVar, c cVar, p7.u uVar) {
            this.f105014a = o0Var;
            this.f105017d = wVar;
            this.f105018e = cVar;
            this.f105023j = uVar;
            j(wVar, cVar);
        }

        public int c() {
            int i11;
            if (this.f105026m) {
                i11 = this.f105015b.f105102k[this.f105019f] ? 1 : 0;
            } else {
                i11 = this.f105017d.f105116g[this.f105019f];
            }
            return g() != null ? i11 | 1073741824 : i11;
        }

        public long d() {
            return !this.f105026m ? this.f105017d.f105112c[this.f105019f] : this.f105015b.f105098g[this.f105021h];
        }

        public long e() {
            return !this.f105026m ? this.f105017d.f105115f[this.f105019f] : this.f105015b.c(this.f105019f);
        }

        public int f() {
            return !this.f105026m ? this.f105017d.f105113d[this.f105019f] : this.f105015b.f105100i[this.f105019f];
        }

        public u g() {
            if (!this.f105026m) {
                return null;
            }
            int i11 = ((c) q0.l(this.f105015b.f105092a)).f104972a;
            u uVarB = this.f105015b.f105105n;
            if (uVarB == null) {
                uVarB = this.f105017d.f105110a.b(i11);
            }
            if (uVarB == null || !uVarB.f105087a) {
                return null;
            }
            return uVarB;
        }

        public boolean h() {
            this.f105019f++;
            if (!this.f105026m) {
                return false;
            }
            int i11 = this.f105020g + 1;
            this.f105020g = i11;
            int[] iArr = this.f105015b.f105099h;
            int i12 = this.f105021h;
            if (i11 != iArr[i12]) {
                return true;
            }
            this.f105021h = i12 + 1;
            this.f105020g = 0;
            return false;
        }

        public int i(int i11, int i12) {
            c0 c0Var;
            u uVarG = g();
            if (uVarG == null) {
                return 0;
            }
            int length = uVarG.f105090d;
            if (length != 0) {
                c0Var = this.f105015b.f105106o;
            } else {
                byte[] bArr = (byte[]) q0.l(uVarG.f105091e);
                this.f105025l.Z(bArr, bArr.length);
                c0 c0Var2 = this.f105025l;
                length = bArr.length;
                c0Var = c0Var2;
            }
            boolean zG = this.f105015b.g(this.f105019f);
            boolean z11 = zG || i12 != 0;
            this.f105024k.f()[0] = (byte) ((z11 ? 128 : 0) | length);
            this.f105024k.b0(0);
            this.f105014a.a(this.f105024k, 1, 1);
            this.f105014a.a(c0Var, length, 1);
            if (!z11) {
                return length + 1;
            }
            if (!zG) {
                this.f105016c.X(8);
                byte[] bArrF = this.f105016c.f();
                bArrF[0] = 0;
                bArrF[1] = 1;
                bArrF[2] = (byte) ((i12 >> 8) & 255);
                bArrF[3] = (byte) (i12 & 255);
                bArrF[4] = (byte) ((i11 >> 24) & 255);
                bArrF[5] = (byte) ((i11 >> 16) & 255);
                bArrF[6] = (byte) ((i11 >> 8) & 255);
                bArrF[7] = (byte) (i11 & 255);
                this.f105014a.a(this.f105016c, 8, 1);
                return length + 9;
            }
            c0 c0Var3 = this.f105015b.f105106o;
            int iU = c0Var3.U();
            c0Var3.c0(-2);
            int i13 = (iU * 6) + 2;
            if (i12 != 0) {
                this.f105016c.X(i13);
                byte[] bArrF2 = this.f105016c.f();
                c0Var3.q(bArrF2, 0, i13);
                int i14 = (((bArrF2[2] & 255) << 8) | (bArrF2[3] & 255)) + i12;
                bArrF2[2] = (byte) ((i14 >> 8) & 255);
                bArrF2[3] = (byte) (i14 & 255);
                c0Var3 = this.f105016c;
            }
            this.f105014a.a(c0Var3, i13, 1);
            return length + 1 + i13;
        }

        public void j(w wVar, c cVar) {
            this.f105017d = wVar;
            this.f105018e = cVar;
            this.f105014a.g(this.f105023j);
            k();
        }

        public void k() {
            this.f105015b.f();
            this.f105019f = 0;
            this.f105021h = 0;
            this.f105020g = 0;
            this.f105022i = 0;
            this.f105026m = false;
        }

        public void l(long j11) {
            int i11 = this.f105019f;
            while (true) {
                v vVar = this.f105015b;
                if (i11 >= vVar.f105097f || vVar.c(i11) > j11) {
                    return;
                }
                if (this.f105015b.f105102k[i11]) {
                    this.f105022i = i11;
                }
                i11++;
            }
        }

        public void m() {
            u uVarG = g();
            if (uVarG == null) {
                return;
            }
            c0 c0Var = this.f105015b.f105106o;
            int i11 = uVarG.f105090d;
            if (i11 != 0) {
                c0Var.c0(i11);
            }
            if (this.f105015b.g(this.f105019f)) {
                c0Var.c0(c0Var.U() * 6);
            }
        }

        public void n(p7.n nVar) {
            u uVarB = this.f105017d.f105110a.b(((c) q0.l(this.f105015b.f105092a)).f104972a);
            this.f105014a.g(this.f105023j.b().c0(nVar.c(uVarB != null ? uVarB.f105088b : null)).P());
        }
    }

    public h(t9.q.a aVar, int i11) {
        this(aVar, i11, null, null, com.google.common.collect.x.r(), null);
    }

    private static long A(c0 c0Var) {
        c0Var.b0(8);
        return q9.b.q(c0Var.v()) == 0 ? c0Var.O() : c0Var.T();
    }

    private static void B(t7.e.b bVar, SparseArray<b> sparseArray, boolean z11, int i11, byte[] bArr) throws ParserException {
        int size = bVar.f112703d.size();
        for (int i12 = 0; i12 < size; i12++) {
            t7.e.b bVar2 = bVar.f112703d.get(i12);
            if (bVar2.f112700a == 1953653094) {
                K(bVar2, sparseArray, z11, i11, bArr);
            }
        }
    }

    private static void C(c0 c0Var, v vVar) throws ParserException {
        c0Var.b0(8);
        int iV = c0Var.v();
        if ((q9.b.p(iV) & 1) == 1) {
            c0Var.c0(8);
        }
        int iQ = c0Var.Q();
        if (iQ == 1) {
            vVar.f105095d += q9.b.q(iV) == 0 ? c0Var.O() : c0Var.T();
        } else {
            throw ParserException.a("Unexpected saio entry count: " + iQ, null);
        }
    }

    private static void D(u uVar, c0 c0Var, v vVar) throws ParserException {
        int i11;
        int i12 = uVar.f105090d;
        c0Var.b0(8);
        if ((q9.b.p(c0Var.v()) & 1) == 1) {
            c0Var.c0(8);
        }
        int iM = c0Var.M();
        int iQ = c0Var.Q();
        if (iQ > vVar.f105097f) {
            throw ParserException.a("Saiz sample count " + iQ + " is greater than fragment sample count" + vVar.f105097f, null);
        }
        if (iM == 0) {
            boolean[] zArr = vVar.f105104m;
            i11 = 0;
            for (int i13 = 0; i13 < iQ; i13++) {
                int iM2 = c0Var.M();
                i11 += iM2;
                zArr[i13] = iM2 > i12;
            }
        } else {
            i11 = iM * iQ;
            Arrays.fill(vVar.f105104m, 0, iQ, iM > i12);
        }
        Arrays.fill(vVar.f105104m, iQ, vVar.f105097f, false);
        if (i11 > 0) {
            vVar.d(i11);
        }
    }

    private static void E(t7.e.b bVar, String str, v vVar) throws ParserException {
        byte[] bArr = null;
        c0 c0Var = null;
        c0 c0Var2 = null;
        for (int i11 = 0; i11 < bVar.f112702c.size(); i11++) {
            t7.e.c cVar = bVar.f112702c.get(i11);
            c0 c0Var3 = cVar.f112704b;
            int i12 = cVar.f112700a;
            if (i12 == 1935828848) {
                c0Var3.b0(12);
                if (c0Var3.v() == 1936025959) {
                    c0Var = c0Var3;
                }
            } else if (i12 == 1936158820) {
                c0Var3.b0(12);
                if (c0Var3.v() == 1936025959) {
                    c0Var2 = c0Var3;
                }
            }
        }
        if (c0Var == null || c0Var2 == null) {
            return;
        }
        c0Var.b0(8);
        int iQ = q9.b.q(c0Var.v());
        c0Var.c0(4);
        if (iQ == 1) {
            c0Var.c0(4);
        }
        if (c0Var.v() != 1) {
            throw ParserException.d("Entry count in sbgp != 1 (unsupported).");
        }
        c0Var2.b0(8);
        int iQ2 = q9.b.q(c0Var2.v());
        c0Var2.c0(4);
        if (iQ2 == 1) {
            if (c0Var2.O() == 0) {
                throw ParserException.d("Variable length description in sgpd found (unsupported)");
            }
        } else if (iQ2 >= 2) {
            c0Var2.c0(4);
        }
        if (c0Var2.O() != 1) {
            throw ParserException.d("Entry count in sgpd != 1 (unsupported).");
        }
        c0Var2.c0(1);
        int iM = c0Var2.M();
        int i13 = (iM & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
        int i14 = iM & 15;
        boolean z11 = c0Var2.M() == 1;
        if (z11) {
            int iM2 = c0Var2.M();
            byte[] bArr2 = new byte[16];
            c0Var2.q(bArr2, 0, 16);
            if (iM2 == 0) {
                int iM3 = c0Var2.M();
                bArr = new byte[iM3];
                c0Var2.q(bArr, 0, iM3);
            }
            vVar.f105103l = true;
            vVar.f105105n = new u(z11, str, iM2, bArr2, i13, i14, bArr);
        }
    }

    private static void F(c0 c0Var, int i11, v vVar) throws ParserException {
        c0Var.b0(i11 + 8);
        int iP = q9.b.p(c0Var.v());
        if ((iP & 1) != 0) {
            throw ParserException.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z11 = (iP & 2) != 0;
        int iQ = c0Var.Q();
        if (iQ == 0) {
            Arrays.fill(vVar.f105104m, 0, vVar.f105097f, false);
            return;
        }
        if (iQ == vVar.f105097f) {
            Arrays.fill(vVar.f105104m, 0, iQ, z11);
            vVar.d(c0Var.a());
            vVar.a(c0Var);
        } else {
            throw ParserException.a("Senc sample count " + iQ + " is different from fragment sample count" + vVar.f105097f, null);
        }
    }

    private static void G(c0 c0Var, v vVar) throws ParserException {
        F(c0Var, 0, vVar);
    }

    private static Pair<Long, w8.g> H(c0 c0Var, long j11) throws ParserException {
        long jT;
        long jT2;
        c0Var.b0(8);
        int iQ = q9.b.q(c0Var.v());
        c0Var.c0(4);
        long jO = c0Var.O();
        if (iQ == 0) {
            jT = c0Var.O();
            jT2 = c0Var.O();
        } else {
            jT = c0Var.T();
            jT2 = c0Var.T();
        }
        long j12 = j11 + jT2;
        long jS1 = q0.s1(jT, 1000000L, jO);
        c0Var.c0(2);
        int iU = c0Var.U();
        int[] iArr = new int[iU];
        long[] jArr = new long[iU];
        long[] jArr2 = new long[iU];
        long[] jArr3 = new long[iU];
        long j13 = j12;
        long jS2 = jS1;
        int i11 = 0;
        while (i11 < iU) {
            int iV = c0Var.v();
            if ((Integer.MIN_VALUE & iV) != 0) {
                throw ParserException.a("Unhandled indirect reference", null);
            }
            long jO2 = c0Var.O();
            iArr[i11] = iV & Integer.MAX_VALUE;
            jArr[i11] = j13;
            jArr3[i11] = jS2;
            jT += jO2;
            long[] jArr4 = jArr3;
            jS2 = q0.s1(jT, 1000000L, jO);
            jArr2[i11] = jS2 - jArr4[i11];
            c0Var.c0(4);
            j13 += (long) iArr[i11];
            i11++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jS1), new w8.g(iArr, jArr, jArr2, jArr3));
    }

    private static long I(c0 c0Var) {
        c0Var.b0(8);
        return q9.b.q(c0Var.v()) == 1 ? c0Var.T() : c0Var.O();
    }

    private static b J(c0 c0Var, SparseArray<b> sparseArray, boolean z11) {
        c0Var.b0(8);
        int iP = q9.b.p(c0Var.v());
        b bVarValueAt = z11 ? sparseArray.valueAt(0) : sparseArray.get(c0Var.v());
        if (bVarValueAt == null) {
            return null;
        }
        if ((iP & 1) != 0) {
            long jT = c0Var.T();
            v vVar = bVarValueAt.f105015b;
            vVar.f105094c = jT;
            vVar.f105095d = jT;
        }
        c cVar = bVarValueAt.f105018e;
        bVarValueAt.f105015b.f105092a = new c((iP & 2) != 0 ? c0Var.v() - 1 : cVar.f104972a, (iP & 8) != 0 ? c0Var.v() : cVar.f104973b, (iP & 16) != 0 ? c0Var.v() : cVar.f104974c, (iP & 32) != 0 ? c0Var.v() : cVar.f104975d);
        return bVarValueAt;
    }

    private static void K(t7.e.b bVar, SparseArray<b> sparseArray, boolean z11, int i11, byte[] bArr) throws ParserException {
        b bVarJ = J(((t7.e.c) s7.a.f(bVar.e(1952868452))).f112704b, sparseArray, z11);
        if (bVarJ == null) {
            return;
        }
        v vVar = bVarJ.f105015b;
        long j11 = vVar.f105108q;
        boolean z12 = vVar.f105109r;
        bVarJ.k();
        bVarJ.f105026m = true;
        t7.e.c cVarE = bVar.e(1952867444);
        if (cVarE == null || (i11 & 2) != 0) {
            vVar.f105108q = j11;
            vVar.f105109r = z12;
        } else {
            vVar.f105108q = I(cVarE.f112704b);
            vVar.f105109r = true;
        }
        N(bVar, bVarJ, i11);
        u uVarB = bVarJ.f105017d.f105110a.b(((c) s7.a.f(vVar.f105092a)).f104972a);
        t7.e.c cVarE2 = bVar.e(1935763834);
        if (cVarE2 != null) {
            D((u) s7.a.f(uVarB), cVarE2.f112704b, vVar);
        }
        t7.e.c cVarE3 = bVar.e(1935763823);
        if (cVarE3 != null) {
            C(cVarE3.f112704b, vVar);
        }
        t7.e.c cVarE4 = bVar.e(1936027235);
        if (cVarE4 != null) {
            G(cVarE4.f112704b, vVar);
        }
        E(bVar, uVarB != null ? uVarB.f105088b : null, vVar);
        int size = bVar.f112702c.size();
        for (int i12 = 0; i12 < size; i12++) {
            t7.e.c cVar = bVar.f112702c.get(i12);
            if (cVar.f112700a == 1970628964) {
                O(cVar.f112704b, vVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> L(c0 c0Var) {
        c0Var.b0(12);
        return Pair.create(Integer.valueOf(c0Var.v()), new c(c0Var.v() - 1, c0Var.v(), c0Var.v(), c0Var.v()));
    }

    private static int M(b bVar, int i11, int i12, c0 c0Var, int i13) throws ParserException {
        int iV;
        c0Var.b0(8);
        int iP = q9.b.p(c0Var.v());
        t tVar = bVar.f105017d.f105110a;
        v vVar = bVar.f105015b;
        c cVar = (c) q0.l(vVar.f105092a);
        vVar.f105099h[i11] = c0Var.Q();
        long[] jArr = vVar.f105098g;
        long j11 = vVar.f105094c;
        jArr[i11] = j11;
        if ((iP & 1) != 0) {
            jArr[i11] = j11 + ((long) c0Var.v());
        }
        boolean z11 = (iP & 4) != 0;
        int iV2 = cVar.f104975d;
        if (z11) {
            iV2 = c0Var.v();
        }
        boolean z12 = (iP & 256) != 0;
        boolean z13 = (iP & 512) != 0;
        boolean z14 = (iP & 1024) != 0;
        boolean z15 = (iP & 2048) != 0;
        long j12 = r(tVar) ? ((long[]) q0.l(tVar.f105084j))[0] : 0L;
        int[] iArr = vVar.f105100i;
        long[] jArr2 = vVar.f105101j;
        boolean[] zArr = vVar.f105102k;
        boolean z16 = z15;
        boolean z17 = tVar.f105076b == 2 && (i12 & 1) != 0;
        int i14 = i13 + vVar.f105099h[i11];
        boolean z18 = z11;
        long j13 = tVar.f105077c;
        long j14 = vVar.f105108q;
        int i15 = i13;
        while (i15 < i14) {
            int iF = f(z12 ? c0Var.v() : cVar.f104973b);
            int iF2 = f(z13 ? c0Var.v() : cVar.f104974c);
            if (z14) {
                iV = c0Var.v();
            } else {
                iV = (i15 == 0 && z18) ? iV2 : cVar.f104975d;
            }
            int i16 = i15;
            long jS1 = q0.s1((((long) (z16 ? c0Var.v() : 0)) + j14) - j12, 1000000L, j13);
            jArr2[i16] = jS1;
            if (!vVar.f105109r) {
                jArr2[i16] = jS1 + bVar.f105017d.f105117h;
            }
            iArr[i16] = iF2;
            zArr[i16] = ((iV >> 16) & 1) == 0 && (!z17 || i16 == 0);
            j14 += (long) iF;
            i15 = i16 + 1;
            i14 = i14;
            z17 = z17;
        }
        int i17 = i14;
        vVar.f105108q = j14;
        return i17;
    }

    private static void N(t7.e.b bVar, b bVar2, int i11) throws ParserException {
        List<t7.e.c> list = bVar.f112702c;
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            t7.e.c cVar = list.get(i14);
            if (cVar.f112700a == 1953658222) {
                c0 c0Var = cVar.f112704b;
                c0Var.b0(12);
                int iQ = c0Var.Q();
                if (iQ > 0) {
                    i13 += iQ;
                    i12++;
                }
            }
        }
        bVar2.f105021h = 0;
        bVar2.f105020g = 0;
        bVar2.f105019f = 0;
        bVar2.f105015b.e(i12, i13);
        int i15 = 0;
        int iM = 0;
        for (int i16 = 0; i16 < size; i16++) {
            t7.e.c cVar2 = list.get(i16);
            if (cVar2.f112700a == 1953658222) {
                iM = M(bVar2, i15, i11, cVar2.f112704b, iM);
                i15++;
            }
        }
    }

    private static void O(c0 c0Var, v vVar, byte[] bArr) throws ParserException {
        c0Var.b0(8);
        c0Var.q(bArr, 0, 16);
        if (Arrays.equals(bArr, Q)) {
            F(c0Var, 16, vVar);
        }
    }

    private void P(long j11) throws ParserException {
        while (!this.f104998n.isEmpty() && this.f104998n.peek().f112701b == j11) {
            u(this.f104998n.pop());
        }
        k();
    }

    private boolean Q(w8.q qVar) throws ParserException {
        if (this.f105007w == 0) {
            if (!qVar.c(this.f104997m.f(), 0, 8, true)) {
                return false;
            }
            this.f105007w = 8;
            this.f104997m.b0(0);
            this.f105006v = this.f104997m.O();
            this.f105005u = this.f104997m.v();
        }
        long j11 = this.f105006v;
        if (j11 == 1) {
            qVar.readFully(this.f104997m.f(), 8, 8);
            this.f105007w += 8;
            this.f105006v = this.f104997m.T();
        } else if (j11 == 0) {
            long length = qVar.getLength();
            if (length == -1 && !this.f104998n.isEmpty()) {
                length = this.f104998n.peek().f112701b;
            }
            if (length != -1) {
                this.f105006v = (length - qVar.getPosition()) + ((long) this.f105007w);
            }
        }
        long j12 = this.f105006v;
        int i11 = this.f105007w;
        if (j12 < i11) {
            throw ParserException.d("Atom size less than header length (unsupported).");
        }
        if (this.O != -1) {
            if (this.f105005u == 1936286840) {
                this.f104994j.X((int) j12);
                System.arraycopy(this.f104997m.f(), 0, this.f104994j.f(), 0, 8);
                qVar.readFully(this.f104994j.f(), 8, (int) (this.f105006v - ((long) this.f105007w)));
                this.f105002r.a((w8.g) H(new t7.e.c(1936286840, this.f104994j).f112704b, qVar.h()).second);
            } else {
                qVar.m((int) (j12 - ((long) i11)), true);
            }
            k();
            return true;
        }
        long position = qVar.getPosition() - ((long) this.f105007w);
        int i12 = this.f105005u;
        if ((i12 == 1836019558 || i12 == 1835295092) && !this.M) {
            this.J.t(new j0.b(this.B, position));
            this.M = true;
        }
        if (this.f105005u == 1836019558) {
            int size = this.f104989e.size();
            for (int i13 = 0; i13 < size; i13++) {
                v vVar = this.f104989e.valueAt(i13).f105015b;
                vVar.f105093b = position;
                vVar.f105095d = position;
                vVar.f105094c = position;
            }
        }
        int i14 = this.f105005u;
        if (i14 == 1835295092) {
            this.D = null;
            this.f105009y = position + this.f105006v;
            this.f105004t = 2;
            return true;
        }
        if (U(i14)) {
            long position2 = qVar.getPosition();
            long j13 = this.f105006v;
            long j14 = (position2 + j13) - 8;
            if (j13 != this.f105007w && this.f105005u == 1835365473) {
                s(qVar);
            }
            this.f104998n.push(new t7.e.b(this.f105005u, j14));
            if (this.f105006v == this.f105007w) {
                P(j14);
            } else {
                k();
            }
        } else if (V(this.f105005u)) {
            if (this.f105007w != 8) {
                throw ParserException.d("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f105006v > 2147483647L) {
                throw ParserException.d("Leaf atom with length > 2147483647 (unsupported).");
            }
            c0 c0Var = new c0((int) this.f105006v);
            System.arraycopy(this.f104997m.f(), 0, c0Var.f(), 0, 8);
            this.f105008x = c0Var;
            this.f105004t = 1;
        } else {
            if (this.f105006v > 2147483647L) {
                throw ParserException.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f105008x = null;
            this.f105004t = 1;
        }
        return true;
    }

    private void R(w8.q qVar) throws ParserException {
        int i11 = (int) (this.f105006v - ((long) this.f105007w));
        c0 c0Var = this.f105008x;
        if (c0Var != null) {
            qVar.readFully(c0Var.f(), 8, i11);
            w(new t7.e.c(this.f105005u, c0Var), qVar);
        } else {
            qVar.k(i11);
        }
        P(qVar.getPosition());
    }

    private void S(w8.q qVar) throws ParserException {
        int size = this.f104989e.size();
        long j11 = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i11 = 0; i11 < size; i11++) {
            v vVar = this.f104989e.valueAt(i11).f105015b;
            if (vVar.f105107p) {
                long j12 = vVar.f105095d;
                if (j12 < j11) {
                    bVarValueAt = this.f104989e.valueAt(i11);
                    j11 = j12;
                }
            }
        }
        if (bVarValueAt == null) {
            this.f105004t = 3;
            return;
        }
        int position = (int) (j11 - qVar.getPosition());
        if (position < 0) {
            throw ParserException.a("Offset to encryption data was negative.", null);
        }
        qVar.k(position);
        bVarValueAt.f105015b.b(qVar);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    private boolean T(w8.q qVar) throws ParserException {
        int iE;
        int iO;
        b bVarO = this.D;
        if (bVarO == null) {
            bVarO = o(this.f104989e);
            if (bVarO == null) {
                int position = (int) (this.f105009y - qVar.getPosition());
                if (position < 0) {
                    throw ParserException.a("Offset to end of mdat was negative.", null);
                }
                qVar.k(position);
                k();
                return false;
            }
            int iD = (int) (bVarO.d() - qVar.getPosition());
            if (iD < 0) {
                s7.t.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iD = 0;
            }
            qVar.k(iD);
            this.D = bVarO;
        }
        if (this.f105004t == 3) {
            this.E = bVarO.f();
            this.H = !d(bVarO.f105017d.f105110a.f105081g);
            if (bVarO.f105019f < bVarO.f105022i) {
                qVar.k(this.E);
                bVarO.m();
                if (!bVarO.h()) {
                    this.D = null;
                }
                this.f105004t = 3;
                return true;
            }
            if (bVarO.f105017d.f105110a.f105082h == 1) {
                this.E -= 8;
                qVar.k(8);
            }
            if ("audio/ac4".equals(bVarO.f105017d.f105110a.f105081g.f101544o)) {
                this.F = bVarO.i(this.E, 7);
                w8.c.b(this.E, this.f104994j);
                bVarO.f105014a.f(this.f104994j, 7);
                this.F += 7;
            } else {
                this.F = bVarO.i(this.E, 0);
            }
            this.E += this.F;
            this.f105004t = 4;
            this.G = 0;
        }
        t tVar = bVarO.f105017d.f105110a;
        o0 o0Var = bVarO.f105014a;
        long jE = bVarO.e();
        i0 i0Var = this.f104995k;
        if (i0Var != null) {
            jE = i0Var.a(jE);
        }
        if (tVar.f105085k == 0) {
            while (true) {
                int i11 = this.F;
                int i12 = this.E;
                if (i11 >= i12) {
                    break;
                }
                this.F += o0Var.e(qVar, i12 - i11, false);
            }
        } else {
            byte[] bArrF = this.f104991g.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i13 = 4 - tVar.f105085k;
            while (this.F < this.E) {
                int i14 = this.G;
                if (i14 == 0) {
                    if (this.L.length > 0 || !this.H) {
                        iO = t7.h.o(tVar.f105081g);
                        if (tVar.f105085k + iO > this.E - this.F) {
                            iO = 0;
                        }
                    } else {
                        iO = 0;
                    }
                    qVar.readFully(bArrF, i13, tVar.f105085k + iO);
                    this.f104991g.b0(0);
                    int iV = this.f104991g.v();
                    if (iV < 0) {
                        throw ParserException.a("Invalid NAL length", null);
                    }
                    this.G = iV - iO;
                    this.f104990f.b0(0);
                    o0Var.f(this.f104990f, 4);
                    this.F += 4;
                    this.E += i13;
                    this.I = this.L.length > 0 && iO > 0 && t7.h.n(tVar.f105081g, bArrF[4]);
                    o0Var.f(this.f104991g, iO);
                    this.F += iO;
                    if (iO > 0 && !this.H && t7.h.k(bArrF, 4, iO, tVar.f105081g)) {
                        this.H = true;
                    }
                } else {
                    if (this.I) {
                        this.f104992h.X(i14);
                        qVar.readFully(this.f104992h.f(), 0, this.G);
                        o0Var.f(this.f104992h, this.G);
                        iE = this.G;
                        int iL = t7.h.L(this.f104992h.f(), this.f104992h.j());
                        this.f104992h.b0(0);
                        this.f104992h.a0(iL);
                        if (tVar.f105081g.f101546q != -1) {
                            int iF = this.f105000p.f();
                            int i15 = tVar.f105081g.f101546q;
                            if (iF != i15) {
                                this.f105000p.g(i15);
                            }
                        } else if (this.f105000p.f() != 0) {
                            this.f105000p.g(0);
                        }
                        this.f105000p.a(jE, this.f104992h);
                        if ((bVarO.c() & 4) != 0) {
                            this.f105000p.d();
                        }
                    } else {
                        iE = o0Var.e(qVar, i14, false);
                    }
                    this.F += iE;
                    this.G -= iE;
                }
            }
        }
        int iC = bVarO.c();
        if (!this.H) {
            iC |= 67108864;
        }
        int i16 = iC;
        u uVarG = bVarO.g();
        o0Var.b(jE, i16, this.E, 0, uVarG != null ? uVarG.f105089c : null);
        z(jE);
        if (!bVarO.h()) {
            this.D = null;
        }
        this.f105004t = 3;
        return true;
    }

    private static boolean U(int i11) {
        return i11 == 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1836019558 || i11 == 1953653094 || i11 == 1836475768 || i11 == 1701082227 || i11 == 1835365473;
    }

    private static boolean V(int i11) {
        return i11 == 1751411826 || i11 == 1835296868 || i11 == 1836476516 || i11 == 1936286840 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1668576371 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1937011571 || i11 == 1952867444 || i11 == 1952868452 || i11 == 1953196132 || i11 == 1953654136 || i11 == 1953658222 || i11 == 1886614376 || i11 == 1935763834 || i11 == 1935763823 || i11 == 1936027235 || i11 == 1970628964 || i11 == 1935828848 || i11 == 1936158820 || i11 == 1701606260 || i11 == 1835362404 || i11 == 1701671783 || i11 == 1969517665 || i11 == 1801812339 || i11 == 1768715124;
    }

    public static /* synthetic */ w8.p[] b() {
        return new w8.p[]{new h(t9.q.a.f112982a, 32)};
    }

    private boolean d(p7.u uVar) {
        if (Objects.equals(uVar.f101544o, "video/avc")) {
            return (this.f104986b & 64) != 0;
        }
        return Objects.equals(uVar.f101544o, "video/hevc") && (this.f104986b & 128) != 0;
    }

    private static int f(int i11) throws ParserException {
        if (i11 >= 0) {
            return i11;
        }
        throw ParserException.a("Unexpected negative value: " + i11, null);
    }

    public static int g(int i11) {
        int i12 = (i11 & 1) != 0 ? 64 : 0;
        return (i11 & 2) != 0 ? i12 | 128 : i12;
    }

    private void k() {
        this.f105004t = 0;
        this.f105007w = 0;
    }

    private c m(SparseArray<c> sparseArray, int i11) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (c) s7.a.f(sparseArray.get(i11));
    }

    private static p7.n n(List<t7.e.c> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            t7.e.c cVar = list.get(i11);
            if (cVar.f112700a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrF = cVar.f112704b.f();
                UUID uuidF = p.f(bArrF);
                if (uuidF == null) {
                    s7.t.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new p7.n.b(uuidF, "video/mp4", bArrF));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new p7.n(arrayList);
    }

    private static b o(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j11 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            b bVarValueAt = sparseArray.valueAt(i11);
            if ((bVarValueAt.f105026m || bVarValueAt.f105019f != bVarValueAt.f105017d.f105111b) && (!bVarValueAt.f105026m || bVarValueAt.f105021h != bVarValueAt.f105015b.f105096e)) {
                long jD = bVarValueAt.d();
                if (jD < j11) {
                    bVar = bVarValueAt;
                    j11 = jD;
                }
            }
        }
        return bVar;
    }

    private void q() {
        int i11;
        o0[] o0VarArr = new o0[2];
        this.K = o0VarArr;
        o0 o0Var = this.f105001q;
        int i12 = 0;
        if (o0Var != null) {
            o0VarArr[0] = o0Var;
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i13 = 100;
        if ((this.f104986b & 4) != 0) {
            o0VarArr[i11] = this.J.b(100, 5);
            i13 = 101;
            i11++;
        }
        o0[] o0VarArr2 = (o0[]) q0.h1(this.K, i11);
        this.K = o0VarArr2;
        for (o0 o0Var2 : o0VarArr2) {
            o0Var2.g(R);
        }
        this.L = new o0[this.f104988d.size()];
        while (i12 < this.L.length) {
            o0 o0VarB = this.J.b(i13, 3);
            o0VarB.g(this.f104988d.get(i12));
            this.L[i12] = o0VarB;
            i12++;
            i13++;
        }
    }

    private static boolean r(t tVar) {
        long[] jArr = tVar.f105083i;
        if (jArr != null && jArr.length == 1 && tVar.f105084j != null) {
            long j11 = jArr[0];
            if (j11 == 0 || q0.s1(j11, 1000000L, tVar.f105078d) + q0.s1(tVar.f105084j[0], 1000000L, tVar.f105077c) >= tVar.f105079e) {
                return true;
            }
        }
        return false;
    }

    private void s(w8.q qVar) {
        this.f104994j.X(8);
        qVar.e(this.f104994j.f(), 0, 8);
        q9.b.g(this.f104994j);
        qVar.k(this.f104994j.g());
        qVar.g();
    }

    private void u(t7.e.b bVar) throws ParserException {
        int i11 = bVar.f112700a;
        if (i11 == 1836019574) {
            y(bVar);
        } else if (i11 == 1836019558) {
            x(bVar);
        } else {
            if (this.f104998n.isEmpty()) {
                return;
            }
            this.f104998n.peek().b(bVar);
        }
    }

    private void v(c0 c0Var) {
        String str;
        String str2;
        long jS1;
        long jS2;
        long jO;
        long jA;
        if (this.K.length == 0) {
            return;
        }
        c0Var.b0(8);
        int iQ = q9.b.q(c0Var.v());
        if (iQ == 0) {
            str = (String) s7.a.f(c0Var.G());
            str2 = (String) s7.a.f(c0Var.G());
            long jO2 = c0Var.O();
            jS1 = q0.s1(c0Var.O(), 1000000L, jO2);
            long j11 = this.C;
            long j12 = j11 != -9223372036854775807L ? j11 + jS1 : -9223372036854775807L;
            jS2 = q0.s1(c0Var.O(), 1000L, jO2);
            jO = c0Var.O();
            jA = j12;
        } else {
            if (iQ != 1) {
                s7.t.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iQ);
                return;
            }
            long jO3 = c0Var.O();
            jA = q0.s1(c0Var.T(), 1000000L, jO3);
            long jS3 = q0.s1(c0Var.O(), 1000L, jO3);
            long jO4 = c0Var.O();
            str = (String) s7.a.f(c0Var.G());
            str2 = (String) s7.a.f(c0Var.G());
            jS2 = jS3;
            jO = jO4;
            jS1 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[c0Var.a()];
        c0Var.q(bArr, 0, c0Var.a());
        c0 c0Var2 = new c0(this.f104996l.a(new h9.a(str3, str4, jS2, jO, bArr)));
        int iA = c0Var2.a();
        for (o0 o0Var : this.K) {
            c0Var2.b0(0);
            o0Var.f(c0Var2, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f104999o.addLast(new a(jS1, true, iA));
            this.f105010z += iA;
            return;
        }
        if (!this.f104999o.isEmpty()) {
            this.f104999o.addLast(new a(jA, false, iA));
            this.f105010z += iA;
            return;
        }
        i0 i0Var = this.f104995k;
        if (i0Var != null && !i0Var.g()) {
            this.f104999o.addLast(new a(jA, false, iA));
            this.f105010z += iA;
            return;
        }
        i0 i0Var2 = this.f104995k;
        if (i0Var2 != null) {
            jA = i0Var2.a(jA);
        }
        long j13 = jA;
        for (o0 o0Var2 : this.K) {
            o0Var2.b(j13, 1, iA, 0, null);
        }
    }

    private void w(t7.e.c cVar, w8.q qVar) throws ParserException {
        if (!this.f104998n.isEmpty()) {
            this.f104998n.peek().c(cVar);
            return;
        }
        int i11 = cVar.f112700a;
        if (i11 != 1936286840) {
            if (i11 == 1701671783) {
                v(cVar.f112704b);
                return;
            }
            return;
        }
        Pair<Long, w8.g> pairH = H(cVar.f112704b, qVar.getPosition());
        this.f105002r.a((w8.g) pairH.second);
        if (!this.M) {
            this.C = ((Long) pairH.first).longValue();
            this.J.t((j0) pairH.second);
            this.M = true;
        } else {
            if ((this.f104986b & 256) == 0 || this.N || this.f105002r.c() <= 1) {
                return;
            }
            this.O = qVar.getPosition();
        }
    }

    private void x(t7.e.b bVar) throws ParserException {
        B(bVar, this.f104989e, this.f104987c != null, this.f104986b, this.f104993i);
        p7.n nVarN = n(bVar.f112702c);
        if (nVarN != null) {
            int size = this.f104989e.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f104989e.valueAt(i11).n(nVarN);
            }
        }
        if (this.A != -9223372036854775807L) {
            int size2 = this.f104989e.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f104989e.valueAt(i12).l(this.A);
            }
            this.A = -9223372036854775807L;
        }
    }

    private void y(t7.e.b bVar) {
        int i11 = 0;
        s7.a.i(this.f104987c == null, "Unexpected moov box.");
        p7.n nVarN = n(bVar.f112702c);
        t7.e.b bVar2 = (t7.e.b) s7.a.f(bVar.d(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = bVar2.f112702c.size();
        long jA = -9223372036854775807L;
        for (int i12 = 0; i12 < size; i12++) {
            t7.e.c cVar = bVar2.f112702c.get(i12);
            int i13 = cVar.f112700a;
            if (i13 == 1953654136) {
                Pair<Integer, c> pairL = L(cVar.f112704b);
                sparseArray.put(((Integer) pairL.first).intValue(), (c) pairL.second);
            } else if (i13 == 1835362404) {
                jA = A(cVar.f112704b);
            }
        }
        t7.e.b bVarD = bVar.d(1835365473);
        f0 f0VarI = null;
        f0 f0VarU = bVarD != null ? q9.b.u(bVarD) : null;
        b0 b0Var = new b0();
        t7.e.c cVarE = bVar.e(1969517665);
        if (cVarE != null) {
            f0VarI = q9.b.I(cVarE);
            b0Var.c(f0VarI);
        }
        f0 f0Var = f0VarI;
        f0 f0Var2 = new f0(q9.b.w(((t7.e.c) s7.a.f(bVar.e(1836476516))).f112704b));
        List<w> listH = q9.b.H(bVar, b0Var, jA, nVarN, (this.f104986b & 16) != 0, false, new ou.h() { // from class: q9.e
            @Override // ou.h
            public final Object apply(Object obj) {
                return this.f104983a.t((t) obj);
            }
        });
        int size2 = listH.size();
        if (this.f104989e.size() != 0) {
            s7.a.h(this.f104989e.size() == size2);
            while (i11 < size2) {
                w wVar = listH.get(i11);
                t tVar = wVar.f105110a;
                this.f104989e.get(tVar.f105075a).j(wVar, m(sparseArray, tVar.f105075a));
                i11++;
            }
            return;
        }
        String strA = k.a(listH);
        while (i11 < size2) {
            w wVar2 = listH.get(i11);
            t tVar2 = wVar2.f105110a;
            o0 o0VarB = this.J.b(i11, tVar2.f105076b);
            o0VarB.d(tVar2.f105079e);
            p7.u.b bVarB = tVar2.f105081g.b();
            bVarB.W(strA);
            j.l(tVar2.f105076b, b0Var, bVarB);
            j.m(tVar2.f105076b, f0VarU, bVarB, tVar2.f105081g.f101541l, f0Var, f0Var2);
            this.f104989e.put(tVar2.f105075a, new b(o0VarB, wVar2, m(sparseArray, tVar2.f105075a), bVarB.P()));
            this.B = Math.max(this.B, tVar2.f105079e);
            i11++;
            b0Var = b0Var;
        }
        this.J.j();
    }

    private void z(long j11) {
        while (!this.f104999o.isEmpty()) {
            a aVarRemoveFirst = this.f104999o.removeFirst();
            this.f105010z -= aVarRemoveFirst.f105013c;
            long jA = aVarRemoveFirst.f105011a;
            if (aVarRemoveFirst.f105012b) {
                jA += j11;
            }
            i0 i0Var = this.f104995k;
            if (i0Var != null) {
                jA = i0Var.a(jA);
            }
            long j12 = jA;
            for (o0 o0Var : this.K) {
                o0Var.b(j12, 1, aVarRemoveFirst.f105013c, this.f105010z, null);
            }
        }
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        int size = this.f104989e.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f104989e.valueAt(i11).k();
        }
        this.f104999o.clear();
        this.f105010z = 0;
        this.f105000p.b();
        this.A = j12;
        this.f104998n.clear();
        k();
    }

    @Override // w8.p
    public void e(w8.r rVar) {
        if ((this.f104986b & 32) == 0) {
            rVar = new t9.r(rVar, this.f104985a);
        }
        this.J = rVar;
        k();
        q();
        t tVar = this.f104987c;
        if (tVar != null) {
            p7.u.b bVarB = tVar.f105081g.b();
            bVarB.W(k.b(this.f104987c.f105081g));
            this.f104989e.put(0, new b(this.J.b(0, this.f104987c.f105076b), new w(this.f104987c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0), bVarB.P()));
            this.J.j();
        }
    }

    @Override // w8.p
    public int h(w8.q qVar, w8.i0 i0Var) throws ParserException {
        while (true) {
            int i11 = this.f105004t;
            if (i11 != 0) {
                if (i11 == 1) {
                    R(qVar);
                } else if (i11 == 2) {
                    S(qVar);
                } else if (T(qVar)) {
                    return 0;
                }
            } else if (!Q(qVar)) {
                long j11 = this.O;
                if (j11 == -1) {
                    this.f105000p.d();
                    return -1;
                }
                i0Var.f121323a = j11;
                this.O = -1L;
                this.J.t(this.f105002r.b());
                this.N = true;
                return 1;
            }
        }
    }

    @Override // w8.p
    public boolean l(w8.q qVar) {
        n0 n0VarB = s.b(qVar);
        this.f105003s = n0VarB != null ? com.google.common.collect.x.s(n0VarB) : com.google.common.collect.x.r();
        return n0VarB == null;
    }

    @Override // w8.p
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.google.common.collect.x<n0> j() {
        return this.f105003s;
    }

    public h(t9.q.a aVar, int i11, i0 i0Var, t tVar, List<p7.u> list, o0 o0Var) {
        this.f104985a = aVar;
        this.f104986b = i11;
        this.f104995k = i0Var;
        this.f104987c = tVar;
        this.f104988d = Collections.unmodifiableList(list);
        this.f105001q = o0Var;
        this.f104996l = new h9.c();
        this.f104997m = new c0(16);
        this.f104990f = new c0(t7.h.f112710a);
        this.f104991g = new c0(6);
        this.f104992h = new c0();
        byte[] bArr = new byte[16];
        this.f104993i = bArr;
        this.f104994j = new c0(bArr);
        this.f104998n = new ArrayDeque<>();
        this.f104999o = new ArrayDeque<>();
        this.f104989e = new SparseArray<>();
        this.f105003s = com.google.common.collect.x.r();
        this.B = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.J = w8.r.I1;
        this.K = new o0[0];
        this.L = new o0[0];
        this.f105000p = new t7.k(new t7.k.b() { // from class: q9.g
            @Override // t7.k.b
            public final void a(long j11, c0 c0Var) {
                w8.f.a(j11, c0Var, this.f104984a.L);
            }
        });
        this.f105002r = new w8.h();
        this.O = -1L;
    }

    @Override // w8.p
    public void release() {
    }

    protected t t(t tVar) {
        return tVar;
    }
}
