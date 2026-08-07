package q9;

import androidx.media3.common.ParserException;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p7.f0;
import s7.c0;
import s7.q0;
import w8.b0;
import w8.i0;
import w8.j0;
import w8.k0;
import w8.n0;
import w8.o0;
import w8.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements w8.p, j0 {

    @Deprecated
    public static final w8.u G = new w8.u() { // from class: q9.m
        @Override // w8.u
        public final w8.p[] d() {
            return n.o();
        }
    };
    private a[] A;
    private long[][] B;
    private int C;
    private long D;
    private int E;
    private l9.a F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t9.q.a f105030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f105031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f105032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0 f105033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0 f105034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0 f105035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<t7.e.b> f105036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q f105037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<f0.a> f105038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.common.collect.x<n0> f105039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f105040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f105041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f105042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f105043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c0 f105044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f105045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f105046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f105047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f105048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f105049t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f105050u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f105051v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f105052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f105053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f105054y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private w8.r f105055z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f105056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f105057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o0 f105058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p0 f105059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f105060e;

        public a(t tVar, w wVar, o0 o0Var) {
            this.f105056a = tVar;
            this.f105057b = wVar;
            this.f105058c = o0Var;
            this.f105059d = "audio/true-hd".equals(tVar.f105081g.f101544o) ? new p0() : null;
        }
    }

    @Deprecated
    public n() {
        this(t9.q.a.f112982a, 16);
    }

    private void A(f0 f0Var) {
        t7.c cVarA = j.a(f0Var, "auxiliary.tracks.interleaved");
        if (cVarA == null || cVarA.f112696b[0] != 0) {
            return;
        }
        this.f105054y = this.f105052w + 16;
    }

    private void B(w8.q qVar) {
        this.f105034e.X(8);
        qVar.e(this.f105034e.f(), 0, 8);
        b.g(this.f105034e);
        qVar.k(this.f105034e.g());
        qVar.g();
    }

    private void C(long j11) {
        while (!this.f105036g.isEmpty() && this.f105036g.peek().f112701b == j11) {
            t7.e.b bVarPop = this.f105036g.pop();
            if (bVarPop.f112700a == 1836019574) {
                F(bVarPop);
                this.f105036g.clear();
                if (!this.f105051v) {
                    this.f105040k = 2;
                }
            } else if (!this.f105036g.isEmpty()) {
                this.f105036g.peek().b(bVarPop);
            }
        }
        if (this.f105040k != 2) {
            t();
        }
    }

    private void D() {
        if (this.E != 2 || (this.f105031b & 2) == 0) {
            return;
        }
        o0 o0VarB = this.f105055z.b(0, 4);
        l9.a aVar = this.F;
        o0VarB.g(new p7.u.b().r0(aVar == null ? null : new f0(aVar)).P());
        this.f105055z.j();
        this.f105055z.t(new j0.b(-9223372036854775807L));
    }

    private static int E(c0 c0Var) {
        c0Var.b0(8);
        int iP = p(c0Var.v());
        if (iP != 0) {
            return iP;
        }
        c0Var.c0(4);
        while (c0Var.a() > 0) {
            int iP2 = p(c0Var.v());
            if (iP2 != 0) {
                return iP2;
            }
        }
        return 0;
    }

    private void F(t7.e.b bVar) {
        List<Integer> list;
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        String str;
        ArrayList arrayList;
        t7.e.b bVarD = bVar.d(1835365473);
        List<Integer> arrayList2 = new ArrayList<>();
        if (bVarD != null) {
            f0 f0VarU = b.u(bVarD);
            if (this.f105053x) {
                s7.a.j(f0VarU);
                A(f0VarU);
                arrayList2 = u(f0VarU);
            } else if (N(f0VarU)) {
                this.f105051v = true;
                return;
            }
            f0Var = f0VarU;
            list = arrayList2;
        } else {
            list = arrayList2;
            f0Var = null;
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z11 = this.E == 1;
        b0 b0Var = new b0();
        t7.e.c cVarE = bVar.e(1969517665);
        if (cVarE != null) {
            f0 f0VarI = b.I(cVarE);
            b0Var.c(f0VarI);
            f0Var2 = f0VarI;
        } else {
            f0Var2 = null;
        }
        f0 f0Var4 = new f0(b.w(((t7.e.c) s7.a.f(bVar.e(1836476516))).f112704b));
        List<w> listH = b.H(bVar, b0Var, -9223372036854775807L, null, (this.f105031b & 1) != 0, z11, new ou.h() { // from class: q9.l
            @Override // ou.h
            public final Object apply(Object obj) {
                return n.n((t) obj);
            }
        });
        if (this.f105053x) {
            s7.a.i(list.size() == listH.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(listH.size())));
        }
        String strA = k.a(listH);
        int i11 = 0;
        int i12 = 0;
        long jMax = -9223372036854775807L;
        int size = -1;
        while (i11 < listH.size()) {
            w wVar = listH.get(i11);
            if (wVar.f105111b == 0) {
                b0Var = b0Var;
                str = strA;
                f0Var3 = f0Var;
                arrayList = arrayList3;
            } else {
                t tVar = wVar.f105110a;
                ArrayList arrayList4 = arrayList3;
                int i13 = i12 + 1;
                String str2 = strA;
                a aVar = new a(tVar, wVar, this.f105055z.b(i12, tVar.f105076b));
                f0Var3 = f0Var;
                long j11 = tVar.f105079e;
                if (j11 == -9223372036854775807L) {
                    j11 = wVar.f105117h;
                }
                aVar.f105058c.d(j11);
                jMax = Math.max(jMax, j11);
                int i14 = "audio/true-hd".equals(tVar.f105081g.f101544o) ? wVar.f105114e * 16 : wVar.f105114e + 30;
                p7.u.b bVarB = tVar.f105081g.b();
                bVarB.o0(i14);
                if (tVar.f105076b == 2) {
                    int i15 = tVar.f105081g.f101535f;
                    if ((this.f105031b & 8) != 0) {
                        i15 |= size == -1 ? 1 : 2;
                    }
                    if (this.f105053x) {
                        i15 |= 32768;
                        bVarB.R(list.get(i11).intValue());
                    }
                    bVarB.w0(i15);
                }
                j.l(tVar.f105076b, b0Var, bVarB);
                j.m(tVar.f105076b, f0Var3, bVarB, tVar.f105081g.f101541l, this.f105038i.isEmpty() ? null : new f0(this.f105038i), f0Var2, f0Var4);
                str = str2;
                bVarB.W(str);
                aVar.f105058c.g(bVarB.P());
                if (tVar.f105076b == 2 && size == -1) {
                    size = arrayList4.size();
                }
                arrayList = arrayList4;
                arrayList.add(aVar);
                i12 = i13;
            }
            i11++;
            f0Var = f0Var3;
            arrayList3 = arrayList;
            listH = listH;
            strA = str;
            b0Var = b0Var;
        }
        this.C = size;
        this.D = jMax;
        a[] aVarArr = (a[]) arrayList3.toArray(new a[0]);
        this.A = aVarArr;
        this.B = q(aVarArr);
        this.f105055z.j();
        this.f105055z.t(this);
    }

    private void G(long j11) {
        if (this.f105041l == 1836086884) {
            int i11 = this.f105043n;
            this.F = new l9.a(0L, j11, -9223372036854775807L, j11 + ((long) i11), this.f105042m - ((long) i11));
        }
    }

    private boolean H(w8.q qVar) throws ParserException {
        t7.e.b bVarPeek;
        if (this.f105043n == 0) {
            if (!qVar.c(this.f105035f.f(), 0, 8, true)) {
                D();
                return false;
            }
            this.f105043n = 8;
            this.f105035f.b0(0);
            this.f105042m = this.f105035f.O();
            this.f105041l = this.f105035f.v();
        }
        long j11 = this.f105042m;
        if (j11 == 1) {
            qVar.readFully(this.f105035f.f(), 8, 8);
            this.f105043n += 8;
            this.f105042m = this.f105035f.T();
        } else if (j11 == 0) {
            long length = qVar.getLength();
            if (length == -1 && (bVarPeek = this.f105036g.peek()) != null) {
                length = bVarPeek.f112701b;
            }
            if (length != -1) {
                this.f105042m = (length - qVar.getPosition()) + ((long) this.f105043n);
            }
        }
        if (this.f105042m < this.f105043n) {
            throw ParserException.d("Atom size less than header length (unsupported).");
        }
        if (L(this.f105041l)) {
            long position = qVar.getPosition();
            long j12 = this.f105042m;
            int i11 = this.f105043n;
            long j13 = (position + j12) - ((long) i11);
            if (j12 != i11 && this.f105041l == 1835365473) {
                B(qVar);
            }
            this.f105036g.push(new t7.e.b(this.f105041l, j13));
            if (this.f105042m == this.f105043n) {
                C(j13);
            } else {
                t();
            }
        } else if (M(this.f105041l)) {
            s7.a.h(this.f105043n == 8);
            s7.a.h(this.f105042m <= 2147483647L);
            c0 c0Var = new c0((int) this.f105042m);
            System.arraycopy(this.f105035f.f(), 0, c0Var.f(), 0, 8);
            this.f105044o = c0Var;
            this.f105040k = 1;
        } else {
            G(qVar.getPosition() - ((long) this.f105043n));
            this.f105044o = null;
            this.f105040k = 1;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    private boolean I(w8.q qVar, i0 i0Var) {
        boolean z11;
        long j11 = this.f105042m - ((long) this.f105043n);
        long position = qVar.getPosition() + j11;
        c0 c0Var = this.f105044o;
        if (c0Var == null) {
            if (!this.f105050u && this.f105041l == 1835295092) {
                this.E = 1;
            }
            if (j11 < 262144) {
                qVar.k((int) j11);
            } else {
                i0Var.f121323a = qVar.getPosition() + j11;
                z11 = true;
            }
            C(position);
            if (this.f105051v) {
                this.f105053x = true;
                i0Var.f121323a = this.f105052w;
                this.f105051v = false;
                z11 = true;
            }
            return (z11 || this.f105040k == 2) ? false : true;
        }
        qVar.readFully(c0Var.f(), this.f105043n, (int) j11);
        if (this.f105041l == 1718909296) {
            this.f105050u = true;
            this.E = E(c0Var);
        } else if (!this.f105036g.isEmpty()) {
            this.f105036g.peek().c(new t7.e.c(this.f105041l, c0Var));
        }
        z11 = false;
        C(position);
        if (this.f105051v) {
            this.f105053x = true;
            i0Var.f121323a = this.f105052w;
            this.f105051v = false;
            z11 = true;
        }
        if (z11) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    private int J(w8.q qVar, i0 i0Var) throws ParserException {
        o0.a aVar;
        ?? r11;
        boolean z11;
        int iO;
        long position = qVar.getPosition();
        if (this.f105045p == -1) {
            int iY = y(position);
            this.f105045p = iY;
            if (iY == -1) {
                return -1;
            }
        }
        a aVar2 = this.A[this.f105045p];
        o0 o0Var = aVar2.f105058c;
        int i11 = aVar2.f105060e;
        w wVar = aVar2.f105057b;
        long j11 = wVar.f105112c[i11] + this.f105054y;
        int i12 = wVar.f105113d[i11];
        p0 p0Var = aVar2.f105059d;
        long j12 = (j11 - position) + ((long) this.f105046q);
        if (j12 < 0 || j12 >= 262144) {
            i0Var.f121323a = j11;
            return 1;
        }
        if (aVar2.f105056a.f105082h == 1) {
            j12 += 8;
            i12 -= 8;
        }
        qVar.k((int) j12);
        if (!r(aVar2.f105056a.f105081g)) {
            this.f105049t = true;
        }
        t tVar = aVar2.f105056a;
        if (tVar.f105085k == 0) {
            aVar = null;
            if ("audio/ac4".equals(tVar.f105081g.f101544o)) {
                if (this.f105047r == 0) {
                    w8.c.b(i12, this.f105034e);
                    o0Var.f(this.f105034e, 7);
                    this.f105047r += 7;
                }
                i12 += 7;
            } else if (p0Var != null) {
                p0Var.d(qVar);
            }
            while (true) {
                int i13 = this.f105047r;
                if (i13 >= i12) {
                    break;
                }
                int iE = o0Var.e(qVar, i12 - i13, false);
                this.f105046q += iE;
                this.f105047r += iE;
                this.f105048s -= iE;
            }
        } else {
            byte[] bArrF = this.f105033d.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i14 = 4 - aVar2.f105056a.f105085k;
            i12 += i14;
            while (this.f105047r < i12) {
                int i15 = this.f105048s;
                if (i15 == 0) {
                    t tVar2 = aVar2.f105056a;
                    int i16 = tVar2.f105085k;
                    if (this.f105049t || t7.h.o(tVar2.f105081g) + i16 > aVar2.f105057b.f105113d[i11] - this.f105046q) {
                        iO = 0;
                    } else {
                        iO = t7.h.o(aVar2.f105056a.f105081g);
                        i16 = aVar2.f105056a.f105085k + iO;
                    }
                    qVar.readFully(bArrF, i14, i16);
                    this.f105046q += i16;
                    this.f105033d.b0(0);
                    int iV = this.f105033d.v();
                    if (iV < 0) {
                        throw ParserException.a("Invalid NAL length", null);
                    }
                    this.f105048s = iV - iO;
                    this.f105032c.b0(0);
                    o0Var.f(this.f105032c, 4);
                    this.f105047r += 4;
                    if (iO > 0) {
                        o0Var.f(this.f105033d, iO);
                        this.f105047r += iO;
                        if (t7.h.k(bArrF, 4, iO, aVar2.f105056a.f105081g)) {
                            this.f105049t = true;
                        }
                    }
                } else {
                    int iE2 = o0Var.e(qVar, i15, false);
                    this.f105046q += iE2;
                    this.f105047r += iE2;
                    this.f105048s -= iE2;
                }
            }
            aVar = null;
        }
        int i17 = i12;
        w wVar2 = aVar2.f105057b;
        long j13 = wVar2.f105115f[i11];
        int i18 = wVar2.f105116g[i11];
        if (!this.f105049t) {
            i18 |= 67108864;
        }
        int i19 = i18;
        if (p0Var != null) {
            z11 = false;
            p0Var.c(o0Var, j13, i19, i17, 0, null);
            if (i11 + 1 == aVar2.f105057b.f105111b) {
                r11 = z11;
                p0Var.a(o0Var, aVar);
                r11 = z11;
            }
        } else {
            r11 = 0;
            o0Var.b(j13, i19, i17, 0, null);
        }
        r11 = z11;
        aVar2.f105060e++;
        this.f105045p = -1;
        this.f105046q = r11;
        this.f105047r = r11;
        this.f105048s = r11;
        this.f105049t = r11;
        return r11;
    }

    private int K(w8.q qVar, i0 i0Var) throws ParserException {
        int iC = this.f105037h.c(qVar, i0Var, this.f105038i);
        if (iC == 1 && i0Var.f121323a == 0) {
            t();
        }
        return iC;
    }

    private static boolean L(int i11) {
        return i11 == 1836019574 || i11 == 1953653099 || i11 == 1835297121 || i11 == 1835626086 || i11 == 1937007212 || i11 == 1701082227 || i11 == 1835365473 || i11 == 1635284069;
    }

    private static boolean M(int i11) {
        return i11 == 1835296868 || i11 == 1836476516 || i11 == 1751411826 || i11 == 1937011556 || i11 == 1937011827 || i11 == 1937011571 || i11 == 1668576371 || i11 == 1701606260 || i11 == 1937011555 || i11 == 1937011578 || i11 == 1937013298 || i11 == 1937007471 || i11 == 1668232756 || i11 == 1953196132 || i11 == 1718909296 || i11 == 1969517665 || i11 == 1801812339 || i11 == 1768715124;
    }

    private boolean N(f0 f0Var) {
        t7.c cVarA;
        if (f0Var != null && (this.f105031b & 64) != 0 && (cVarA = j.a(f0Var, "auxiliary.tracks.offset")) != null) {
            long jT = new c0(cVarA.f112696b).T();
            if (jT > 0) {
                this.f105052w = jT;
                return true;
            }
        }
        return false;
    }

    private void O(a aVar, long j11) {
        w wVar = aVar.f105057b;
        int iA = wVar.a(j11);
        if (iA == -1) {
            iA = wVar.b(j11);
        }
        aVar.f105060e = iA;
    }

    public static /* synthetic */ t n(t tVar) {
        return tVar;
    }

    public static /* synthetic */ w8.p[] o() {
        return new w8.p[]{new n(t9.q.a.f112982a, 16)};
    }

    private static int p(int i11) {
        if (i11 != 1751476579) {
            return i11 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] q(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            jArr[i11] = new long[aVarArr[i11].f105057b.f105111b];
            jArr2[i11] = aVarArr[i11].f105057b.f105115f[0];
        }
        long j11 = 0;
        int i12 = 0;
        while (i12 < aVarArr.length) {
            long j12 = Long.MAX_VALUE;
            int i13 = -1;
            for (int i14 = 0; i14 < aVarArr.length; i14++) {
                if (!zArr[i14]) {
                    long j13 = jArr2[i14];
                    if (j13 <= j12) {
                        i13 = i14;
                        j12 = j13;
                    }
                }
            }
            int i15 = iArr[i13];
            long[] jArr3 = jArr[i13];
            jArr3[i15] = j11;
            w wVar = aVarArr[i13].f105057b;
            j11 += (long) wVar.f105113d[i15];
            int i16 = i15 + 1;
            iArr[i13] = i16;
            if (i16 < jArr3.length) {
                jArr2[i13] = wVar.f105115f[i16];
            } else {
                zArr[i13] = true;
                i12++;
            }
        }
        return jArr;
    }

    private boolean r(p7.u uVar) {
        if (Objects.equals(uVar.f101544o, "video/avc")) {
            return (this.f105031b & 32) != 0;
        }
        return Objects.equals(uVar.f101544o, "video/hevc") && (this.f105031b & 128) != 0;
    }

    public static int s(int i11) {
        int i12 = (i11 & 1) != 0 ? 32 : 0;
        return (i11 & 2) != 0 ? i12 | 128 : i12;
    }

    private void t() {
        this.f105040k = 0;
        this.f105043n = 0;
    }

    private List<Integer> u(f0 f0Var) {
        List<Integer> listA = ((t7.c) s7.a.j(j.a(f0Var, "auxiliary.tracks.map"))).a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (int i11 = 0; i11 < listA.size(); i11++) {
            int iIntValue = listA.get(i11).intValue();
            int i12 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i12 = 3;
                    if (iIntValue != 2) {
                        i12 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i12 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i12));
        }
        return arrayList;
    }

    private static int x(w wVar, long j11) {
        int iA = wVar.a(j11);
        return iA == -1 ? wVar.b(j11) : iA;
    }

    private int y(long j11) {
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        boolean z12 = true;
        long j14 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.A;
            if (i13 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i13];
            int i14 = aVar.f105060e;
            w wVar = aVar.f105057b;
            if (i14 != wVar.f105111b) {
                long j15 = wVar.f105112c[i14];
                long j16 = ((long[][]) q0.l(this.B))[i13][i14];
                long j17 = j15 - j11;
                boolean z13 = j17 < 0 || j17 >= 262144;
                if ((!z13 && z12) || (z13 == z12 && j17 < j14)) {
                    z12 = z13;
                    j13 = j16;
                    i12 = i13;
                    j14 = j17;
                }
                if (j16 < j12) {
                    z11 = z13;
                    j12 = j16;
                    i11 = i13;
                }
            }
            i13++;
        }
        return (j12 == Long.MAX_VALUE || !z11 || j13 < j12 + SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE) ? i12 : i11;
    }

    private static long z(w wVar, long j11, long j12) {
        int iX = x(wVar, j11);
        return iX == -1 ? j12 : Math.min(wVar.f105112c[iX], j12);
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        this.f105036g.clear();
        this.f105043n = 0;
        this.f105045p = -1;
        this.f105046q = 0;
        this.f105047r = 0;
        this.f105048s = 0;
        this.f105049t = false;
        if (j11 == 0) {
            if (this.f105040k != 3) {
                t();
                return;
            } else {
                this.f105037h.g();
                this.f105038i.clear();
                return;
            }
        }
        for (a aVar : this.A) {
            O(aVar, j12);
            p0 p0Var = aVar.f105059d;
            if (p0Var != null) {
                p0Var.b();
            }
        }
    }

    @Override // w8.j0
    public j0.a c(long j11) {
        return v(j11, -1);
    }

    @Override // w8.j0
    public boolean d() {
        return true;
    }

    @Override // w8.p
    public void e(w8.r rVar) {
        if ((this.f105031b & 16) == 0) {
            rVar = new t9.r(rVar, this.f105030a);
        }
        this.f105055z = rVar;
    }

    @Override // w8.j0
    public long g() {
        return this.D;
    }

    @Override // w8.p
    public int h(w8.q qVar, i0 i0Var) {
        while (true) {
            int i11 = this.f105040k;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return J(qVar, i0Var);
                    }
                    if (i11 == 3) {
                        return K(qVar, i0Var);
                    }
                    throw new IllegalStateException();
                }
                if (I(qVar, i0Var)) {
                    return 1;
                }
            } else if (!H(qVar)) {
                return -1;
            }
        }
    }

    @Override // w8.p
    public boolean l(w8.q qVar) {
        n0 n0VarD = s.d(qVar, (this.f105031b & 2) != 0);
        this.f105039j = n0VarD != null ? com.google.common.collect.x.s(n0VarD) : com.google.common.collect.x.r();
        return n0VarD == null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080 A[EDGE_INSN: B:43:0x0080->B:37:0x0080 BREAK  A[LOOP:0: B:28:0x0063->B:36:0x007d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007d A[SYNTHETIC] */
    public j0.a v(long j11, int i11) {
        long j12;
        long j13;
        long jZ;
        long j14;
        int i12;
        a[] aVarArr;
        w wVar;
        int iB;
        a[] aVarArr2 = this.A;
        if (aVarArr2.length == 0) {
            return new j0.a(k0.f121335c);
        }
        int i13 = i11 != -1 ? i11 : this.C;
        if (i13 != -1) {
            w wVar2 = aVarArr2[i13].f105057b;
            int iX = x(wVar2, j11);
            if (iX == -1) {
                return new j0.a(k0.f121335c);
            }
            j13 = wVar2.f105115f[iX];
            j12 = wVar2.f105112c[iX];
            if (j13 < j11 && iX < wVar2.f105111b - 1 && (iB = wVar2.b(j11)) != -1 && iB != iX) {
                j14 = wVar2.f105115f[iB];
                jZ = wVar2.f105112c[iB];
            }
            if (i11 == -1) {
                i12 = 0;
                while (true) {
                    aVarArr = this.A;
                    if (i12 < aVarArr.length) {
                        break;
                    }
                    if (i12 != this.C) {
                        wVar = aVarArr[i12].f105057b;
                        long jZ2 = z(wVar, j13, j12);
                        if (j14 != -9223372036854775807L) {
                            jZ = z(wVar, j14, jZ);
                        }
                        j12 = jZ2;
                    }
                    i12++;
                }
            }
            k0 k0Var = new k0(j13, j12);
            return j14 == -9223372036854775807L ? new j0.a(k0Var) : new j0.a(k0Var, new k0(j14, jZ));
        }
        j12 = Long.MAX_VALUE;
        j13 = j11;
        jZ = -1;
        j14 = -9223372036854775807L;
        if (i11 == -1) {
            i12 = 0;
            while (true) {
                aVarArr = this.A;
                if (i12 < aVarArr.length) {
                    break;
                    break;
                }
                if (i12 != this.C) {
                    wVar = aVarArr[i12].f105057b;
                    long jZ3 = z(wVar, j13, j12);
                    if (j14 != -9223372036854775807L) {
                        jZ = z(wVar, j14, jZ);
                    }
                    j12 = jZ3;
                }
                i12++;
            }
        }
        k0 k0Var2 = new k0(j13, j12);
        if (j14 == -9223372036854775807L) {
        }
    }

    @Override // w8.p
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public com.google.common.collect.x<n0> j() {
        return this.f105039j;
    }

    public n(t9.q.a aVar, int i11) {
        this.f105030a = aVar;
        this.f105031b = i11;
        this.f105039j = com.google.common.collect.x.r();
        this.f105040k = (i11 & 4) != 0 ? 3 : 0;
        this.f105037h = new q();
        this.f105038i = new ArrayList();
        this.f105035f = new c0(16);
        this.f105036g = new ArrayDeque<>();
        this.f105032c = new c0(t7.h.f112710a);
        this.f105033d = new c0(6);
        this.f105034e = new c0();
        this.f105045p = -1;
        this.f105055z = w8.r.I1;
        this.A = new a[0];
    }

    @Override // w8.p
    public void release() {
    }
}
