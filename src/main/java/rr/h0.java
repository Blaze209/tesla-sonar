package rr;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import ts.m0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h0 implements hr.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final hr.p f108792t = new hr.p() { // from class: rr.g0
        @Override // hr.p
        public final hr.k[] d() {
            return h0.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f108793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f108794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<m0> f108795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts.d0 f108796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseIntArray f108797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i0.c f108798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray<i0> f108799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f108800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f108801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f0 f108802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e0 f108803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private hr.m f108804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f108805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f108806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f108807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f108808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private i0 f108809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f108810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f108811s;

    public h0() {
        this(0);
    }

    public static /* synthetic */ hr.k[] b() {
        return new hr.k[]{new h0()};
    }

    static /* synthetic */ int k(h0 h0Var) {
        int i11 = h0Var.f108805m;
        h0Var.f108805m = i11 + 1;
        return i11;
    }

    private boolean u(hr.l lVar) {
        byte[] bArrE = this.f108796d.e();
        if (9400 - this.f108796d.f() < 188) {
            int iA = this.f108796d.a();
            if (iA > 0) {
                System.arraycopy(bArrE, this.f108796d.f(), bArrE, 0, iA);
            }
            this.f108796d.S(bArrE, iA);
        }
        while (this.f108796d.a() < 188) {
            int iG = this.f108796d.g();
            int i11 = lVar.read(bArrE, iG, 9400 - iG);
            if (i11 == -1) {
                return false;
            }
            this.f108796d.T(iG + i11);
        }
        return true;
    }

    private int v() throws ParserException {
        int iF = this.f108796d.f();
        int iG = this.f108796d.g();
        int iA = j0.a(this.f108796d.e(), iF, iG);
        this.f108796d.U(iA);
        int i11 = iA + 188;
        if (i11 <= iG) {
            this.f108810r = 0;
            return i11;
        }
        int i12 = this.f108810r + (iA - iF);
        this.f108810r = i12;
        if (this.f108793a != 2 || i12 <= 376) {
            return i11;
        }
        throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void w(long j11) {
        if (this.f108807o) {
            return;
        }
        this.f108807o = true;
        if (this.f108802j.b() == -9223372036854775807L) {
            this.f108804l.p(new hr.z.b(this.f108802j.b()));
            return;
        }
        e0 e0Var = new e0(this.f108802j.c(), this.f108802j.b(), j11, this.f108811s, this.f108794b);
        this.f108803k = e0Var;
        this.f108804l.p(e0Var.b());
    }

    private void x() {
        this.f108800h.clear();
        this.f108799g.clear();
        SparseArray<i0> sparseArrayA = this.f108798f.a();
        int size = sparseArrayA.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f108799g.put(sparseArrayA.keyAt(i11), sparseArrayA.valueAt(i11));
        }
        this.f108799g.put(0, new c0(new a()));
        this.f108809q = null;
    }

    private boolean y(int i11) {
        return this.f108793a == 2 || this.f108806n || !this.f108801i.get(i11, false);
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        e0 e0Var;
        ts.a.g(this.f108793a != 2);
        int size = this.f108795c.size();
        for (int i11 = 0; i11 < size; i11++) {
            m0 m0Var = this.f108795c.get(i11);
            boolean z11 = m0Var.e() == -9223372036854775807L;
            if (!z11) {
                long jC = m0Var.c();
                z11 = (jC == -9223372036854775807L || jC == 0 || jC == j12) ? false : true;
            }
            if (z11) {
                m0Var.h(j12);
            }
        }
        if (j12 != 0 && (e0Var = this.f108803k) != null) {
            e0Var.h(j12);
        }
        this.f108796d.Q(0);
        this.f108797e.clear();
        for (int i12 = 0; i12 < this.f108799g.size(); i12++) {
            this.f108799g.valueAt(i12).a();
        }
        this.f108810r = 0;
    }

    @Override // hr.k
    public void e(hr.m mVar) {
        this.f108804l = mVar;
    }

    @Override // hr.k
    public boolean h(hr.l lVar) {
        byte[] bArrE = this.f108796d.e();
        lVar.e(bArrE, 0, 940);
        for (int i11 = 0; i11 < 188; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= 5) {
                    lVar.k(i11);
                    return true;
                }
                if (bArrE[(i12 * 188) + i11] != 71) {
                    break;
                }
                i12++;
            }
        }
        return false;
    }

    @Override // hr.k
    public int i(hr.l lVar, hr.y yVar) throws ParserException {
        long j11;
        long length = lVar.getLength();
        if (this.f108806n) {
            if (length != -1 && this.f108793a != 2 && !this.f108802j.d()) {
                return this.f108802j.e(lVar, yVar, this.f108811s);
            }
            w(length);
            if (this.f108808p) {
                this.f108808p = false;
                a(0L, 0L);
                if (lVar.getPosition() != 0) {
                    yVar.f73403a = 0L;
                    return 1;
                }
            }
            e0 e0Var = this.f108803k;
            if (e0Var != null && e0Var.d()) {
                return this.f108803k.c(lVar, yVar);
            }
        }
        if (!u(lVar)) {
            return -1;
        }
        int iV = v();
        int iG = this.f108796d.g();
        if (iV > iG) {
            return 0;
        }
        int iQ = this.f108796d.q();
        if ((8388608 & iQ) != 0) {
            this.f108796d.U(iV);
            return 0;
        }
        int i11 = (4194304 & iQ) != 0 ? 1 : 0;
        int i12 = (2096896 & iQ) >> 8;
        boolean z11 = (iQ & 32) != 0;
        i0 i0Var = (iQ & 16) != 0 ? this.f108799g.get(i12) : null;
        if (i0Var == null) {
            this.f108796d.U(iV);
            return 0;
        }
        if (this.f108793a != 2) {
            int i13 = iQ & 15;
            j11 = -1;
            int i14 = this.f108797e.get(i12, i13 - 1);
            this.f108797e.put(i12, i13);
            if (i14 == i13) {
                this.f108796d.U(iV);
                return 0;
            }
            if (i13 != ((i14 + 1) & 15)) {
                i0Var.a();
            }
        } else {
            j11 = -1;
        }
        if (z11) {
            int iH = this.f108796d.H();
            i11 |= (this.f108796d.H() & 64) != 0 ? 2 : 0;
            this.f108796d.V(iH - 1);
        }
        boolean z12 = this.f108806n;
        if (y(i12)) {
            this.f108796d.T(iV);
            i0Var.b(this.f108796d, i11);
            this.f108796d.T(iG);
        }
        if (this.f108793a != 2 && !z12 && this.f108806n && length != j11) {
            this.f108808p = true;
        }
        this.f108796d.U(iV);
        return 0;
    }

    public h0(int i11) {
        this(1, i11, 112800);
    }

    public h0(int i11, int i12, int i13) {
        this(i11, new m0(0L), new j(i12), i13);
    }

    public h0(int i11, m0 m0Var, i0.c cVar, int i12) {
        this.f108798f = (i0.c) ts.a.e(cVar);
        this.f108794b = i12;
        this.f108793a = i11;
        if (i11 != 1 && i11 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f108795c = arrayList;
            arrayList.add(m0Var);
        } else {
            this.f108795c = Collections.singletonList(m0Var);
        }
        this.f108796d = new ts.d0(new byte[9400], 0);
        this.f108800h = new SparseBooleanArray();
        this.f108801i = new SparseBooleanArray();
        this.f108799g = new SparseArray<>();
        this.f108797e = new SparseIntArray();
        this.f108802j = new f0(i12);
        this.f108804l = hr.m.D1;
        this.f108811s = -1;
        x();
    }

    @Override // hr.k
    public void release() {
    }

    private class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ts.c0 f108812a = new ts.c0(new byte[4]);

        public a() {
        }

        @Override // rr.b0
        public void b(ts.d0 d0Var) {
            if (d0Var.H() == 0 && (d0Var.H() & 128) != 0) {
                d0Var.V(6);
                int iA = d0Var.a() / 4;
                for (int i11 = 0; i11 < iA; i11++) {
                    d0Var.k(this.f108812a, 4);
                    int iH = this.f108812a.h(16);
                    this.f108812a.r(3);
                    if (iH == 0) {
                        this.f108812a.r(13);
                    } else {
                        int iH2 = this.f108812a.h(13);
                        if (h0.this.f108799g.get(iH2) == null) {
                            h0.this.f108799g.put(iH2, new c0(h0.this.new b(iH2)));
                            h0.k(h0.this);
                        }
                    }
                }
                if (h0.this.f108793a != 2) {
                    h0.this.f108799g.remove(0);
                }
            }
        }

        @Override // rr.b0
        public void c(m0 m0Var, hr.m mVar, i0.d dVar) {
        }
    }

    private class b implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ts.c0 f108814a = new ts.c0(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<i0> f108815b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f108816c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f108817d;

        public b(int i11) {
            this.f108817d = i11;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0043  */
        /* JADX WARN: Code duplicated, block: B:24:0x0055  */
        /* JADX WARN: Code duplicated, block: B:27:0x005b  */
        private i0.b a(ts.d0 d0Var, int i11) {
            int iF = d0Var.f();
            int i12 = i11 + iF;
            int i13 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (d0Var.f() < i12) {
                int iH = d0Var.H();
                int iF2 = d0Var.f() + d0Var.H();
                if (iF2 > i12) {
                    break;
                }
                if (iH == 5) {
                    long J = d0Var.J();
                    if (J == 1094921523) {
                        i13 = 129;
                    } else if (J == 1161904947) {
                        i13 = 135;
                    } else if (J == 1094921524) {
                        i13 = 172;
                    } else if (J == 1212503619) {
                        i13 = 36;
                    }
                } else if (iH == 106) {
                    i13 = 129;
                } else if (iH == 122) {
                    i13 = 135;
                } else if (iH == 127) {
                    if (d0Var.H() == 21) {
                        i13 = 172;
                    }
                } else if (iH == 123) {
                    i13 = 138;
                } else if (iH == 10) {
                    strTrim = d0Var.E(3).trim();
                } else if (iH == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (d0Var.f() < iF2) {
                        String strTrim2 = d0Var.E(3).trim();
                        int iH2 = d0Var.H();
                        byte[] bArr = new byte[4];
                        d0Var.l(bArr, 0, 4);
                        arrayList2.add(new i0.a(strTrim2, iH2, bArr));
                    }
                    arrayList = arrayList2;
                    i13 = 89;
                } else if (iH == 111) {
                    i13 = EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                }
                d0Var.V(iF2 - d0Var.f());
            }
            d0Var.U(i12);
            return new i0.b(i13, strTrim, arrayList, Arrays.copyOfRange(d0Var.e(), iF, i12));
        }

        @Override // rr.b0
        public void b(ts.d0 d0Var) {
            m0 m0Var;
            if (d0Var.H() != 2) {
                return;
            }
            if (h0.this.f108793a == 1 || h0.this.f108793a == 2 || h0.this.f108805m == 1) {
                m0Var = (m0) h0.this.f108795c.get(0);
            } else {
                m0Var = new m0(((m0) h0.this.f108795c.get(0)).c());
                h0.this.f108795c.add(m0Var);
            }
            if ((d0Var.H() & 128) == 0) {
                return;
            }
            d0Var.V(1);
            int iN = d0Var.N();
            int i11 = 3;
            d0Var.V(3);
            d0Var.k(this.f108814a, 2);
            this.f108814a.r(3);
            int i12 = 13;
            h0.this.f108811s = this.f108814a.h(13);
            d0Var.k(this.f108814a, 2);
            int i13 = 4;
            this.f108814a.r(4);
            d0Var.V(this.f108814a.h(12));
            if (h0.this.f108793a == 2 && h0.this.f108809q == null) {
                i0.b bVar = new i0.b(21, null, null, p0.f115045f);
                h0 h0Var = h0.this;
                h0Var.f108809q = h0Var.f108798f.b(21, bVar);
                if (h0.this.f108809q != null) {
                    h0.this.f108809q.c(m0Var, h0.this.f108804l, new i0.d(iN, 21, PKIFailureInfo.certRevoked));
                }
            }
            this.f108815b.clear();
            this.f108816c.clear();
            int iA = d0Var.a();
            while (iA > 0) {
                d0Var.k(this.f108814a, 5);
                int iH = this.f108814a.h(8);
                this.f108814a.r(i11);
                int iH2 = this.f108814a.h(i12);
                this.f108814a.r(i13);
                int iH3 = this.f108814a.h(12);
                i0.b bVarA = a(d0Var, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarA.f108844a;
                }
                iA -= iH3 + 5;
                int i14 = h0.this.f108793a == 2 ? iH : iH2;
                if (!h0.this.f108800h.get(i14)) {
                    i0 i0VarB = (h0.this.f108793a == 2 && iH == 21) ? h0.this.f108809q : h0.this.f108798f.b(iH, bVarA);
                    if (h0.this.f108793a != 2 || iH2 < this.f108816c.get(i14, PKIFailureInfo.certRevoked)) {
                        this.f108816c.put(i14, iH2);
                        this.f108815b.put(i14, i0VarB);
                    }
                }
                i11 = 3;
                i13 = 4;
                i12 = 13;
            }
            int size = this.f108816c.size();
            for (int i15 = 0; i15 < size; i15++) {
                int iKeyAt = this.f108816c.keyAt(i15);
                int iValueAt = this.f108816c.valueAt(i15);
                h0.this.f108800h.put(iKeyAt, true);
                h0.this.f108801i.put(iValueAt, true);
                i0 i0VarValueAt = this.f108815b.valueAt(i15);
                if (i0VarValueAt != null) {
                    if (i0VarValueAt != h0.this.f108809q) {
                        i0VarValueAt.c(m0Var, h0.this.f108804l, new i0.d(iN, iKeyAt, PKIFailureInfo.certRevoked));
                    }
                    h0.this.f108799g.put(iValueAt, i0VarValueAt);
                }
            }
            if (h0.this.f108793a == 2) {
                if (h0.this.f108806n) {
                    return;
                }
                h0.this.f108804l.j();
                h0.this.f108805m = 0;
                h0.this.f108806n = true;
                return;
            }
            h0.this.f108799g.remove(this.f108817d);
            h0 h0Var2 = h0.this;
            h0Var2.f108805m = h0Var2.f108793a == 1 ? 0 : h0.this.f108805m - 1;
            if (h0.this.f108805m == 0) {
                h0.this.f108804l.j();
                h0.this.f108806n = true;
            }
        }

        @Override // rr.b0
        public void c(m0 m0Var, hr.m mVar, i0.d dVar) {
        }
    }
}
