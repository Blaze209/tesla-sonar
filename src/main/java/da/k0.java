package da;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements w8.p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final w8.u f60069v = new w8.u() { // from class: da.j0
        @Override // w8.u
        public final w8.p[] d() {
            return k0.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f60071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f60072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<s7.i0> f60073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s7.c0 f60074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseIntArray f60075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l0.c f60076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t9.q.a f60077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray<l0> f60078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f60079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SparseBooleanArray f60080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final i0 f60081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private h0 f60082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private w8.r f60083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f60084o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f60085p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f60086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f60087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private l0 f60088s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f60089t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f60090u;

    public k0(int i11, t9.q.a aVar) {
        this(1, i11, aVar, new s7.i0(0L), new j(0), 112800);
    }

    private boolean A(int i11) {
        return this.f60070a == 2 || this.f60085p || !this.f60080k.get(i11, false);
    }

    public static /* synthetic */ w8.p[] b() {
        return new w8.p[]{new k0(1, t9.q.a.f112982a)};
    }

    static /* synthetic */ int m(k0 k0Var) {
        int i11 = k0Var.f60084o;
        k0Var.f60084o = i11 + 1;
        return i11;
    }

    private boolean w(w8.q qVar) {
        byte[] bArrF = this.f60074e.f();
        if (9400 - this.f60074e.g() < 188) {
            int iA = this.f60074e.a();
            if (iA > 0) {
                System.arraycopy(bArrF, this.f60074e.g(), bArrF, 0, iA);
            }
            this.f60074e.Z(bArrF, iA);
        }
        while (this.f60074e.a() < 188) {
            int iJ = this.f60074e.j();
            int i11 = qVar.read(bArrF, iJ, 9400 - iJ);
            if (i11 == -1) {
                return false;
            }
            this.f60074e.a0(iJ + i11);
        }
        return true;
    }

    private int x() throws ParserException {
        int iG = this.f60074e.g();
        int iJ = this.f60074e.j();
        int iA = m0.a(this.f60074e.f(), iG, iJ);
        this.f60074e.b0(iA);
        int i11 = iA + 188;
        if (i11 <= iJ) {
            this.f60089t = 0;
            return i11;
        }
        int i12 = this.f60089t + (iA - iG);
        this.f60089t = i12;
        if (this.f60070a != 2 || i12 <= 376) {
            return i11;
        }
        throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void y(long j11) {
        if (this.f60086q) {
            return;
        }
        this.f60086q = true;
        if (this.f60081l.b() == -9223372036854775807L) {
            this.f60083n.t(new w8.j0.b(this.f60081l.b()));
            return;
        }
        h0 h0Var = new h0(this.f60081l.c(), this.f60081l.b(), j11, this.f60090u, this.f60072c);
        this.f60082m = h0Var;
        this.f60083n.t(h0Var.b());
    }

    private void z() {
        this.f60079j.clear();
        this.f60078i.clear();
        SparseArray<l0> sparseArrayA = this.f60076g.a();
        int size = sparseArrayA.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f60078i.put(sparseArrayA.keyAt(i11), sparseArrayA.valueAt(i11));
        }
        this.f60078i.put(0, new e0(new a()));
        this.f60088s = null;
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        h0 h0Var;
        s7.a.h(this.f60070a != 2);
        int size = this.f60073d.size();
        for (int i11 = 0; i11 < size; i11++) {
            s7.i0 i0Var = this.f60073d.get(i11);
            boolean z11 = i0Var.f() == -9223372036854775807L;
            if (!z11) {
                long jD = i0Var.d();
                z11 = (jD == -9223372036854775807L || jD == 0 || jD == j12) ? false : true;
            }
            if (z11) {
                i0Var.i(j12);
            }
        }
        if (j12 != 0 && (h0Var = this.f60082m) != null) {
            h0Var.h(j12);
        }
        this.f60074e.X(0);
        this.f60075f.clear();
        for (int i12 = 0; i12 < this.f60078i.size(); i12++) {
            this.f60078i.valueAt(i12).a();
        }
        this.f60089t = 0;
    }

    @Override // w8.p
    public void e(w8.r rVar) {
        if ((this.f60071b & 1) == 0) {
            rVar = new t9.r(rVar, this.f60077h);
        }
        this.f60083n = rVar;
    }

    @Override // w8.p
    public int h(w8.q qVar, w8.i0 i0Var) throws ParserException {
        int i11;
        long length = qVar.getLength();
        boolean z11 = this.f60070a == 2;
        if (this.f60085p) {
            if (length != -1 && !z11 && !this.f60081l.d()) {
                return this.f60081l.e(qVar, i0Var, this.f60090u);
            }
            y(length);
            if (this.f60087r) {
                this.f60087r = false;
                a(0L, 0L);
                if (qVar.getPosition() != 0) {
                    i0Var.f121323a = 0L;
                    return 1;
                }
            }
            h0 h0Var = this.f60082m;
            if (h0Var != null && h0Var.d()) {
                return this.f60082m.c(qVar, i0Var);
            }
        }
        if (!w(qVar)) {
            for (int i12 = 0; i12 < this.f60078i.size(); i12++) {
                l0 l0VarValueAt = this.f60078i.valueAt(i12);
                if (l0VarValueAt instanceof y) {
                    y yVar = (y) l0VarValueAt;
                    if (yVar.d(z11)) {
                        yVar.b(new s7.c0(), 1);
                    }
                }
            }
            return -1;
        }
        int iX = x();
        int iJ = this.f60074e.j();
        if (iX > iJ) {
            return 0;
        }
        int iV = this.f60074e.v();
        if ((8388608 & iV) != 0) {
            this.f60074e.b0(iX);
            return 0;
        }
        int i13 = (4194304 & iV) != 0 ? 1 : 0;
        int i14 = (2096896 & iV) >> 8;
        boolean z12 = (iV & 32) != 0;
        l0 l0Var = (iV & 16) != 0 ? this.f60078i.get(i14) : null;
        if (l0Var == null) {
            this.f60074e.b0(iX);
            return 0;
        }
        if (this.f60070a != 2) {
            int i15 = iV & 15;
            i11 = 0;
            int i16 = this.f60075f.get(i14, i15 - 1);
            this.f60075f.put(i14, i15);
            if (i16 == i15) {
                this.f60074e.b0(iX);
                return 0;
            }
            if (i15 != ((i16 + 1) & 15)) {
                l0Var.a();
            }
        } else {
            i11 = 0;
        }
        if (z12) {
            int iM = this.f60074e.M();
            i13 |= (this.f60074e.M() & 64) != 0 ? 2 : i11;
            this.f60074e.c0(iM - 1);
        }
        boolean z13 = this.f60085p;
        if (A(i14)) {
            this.f60074e.a0(iX);
            l0Var.b(this.f60074e, i13);
            this.f60074e.a0(iJ);
        }
        if (this.f60070a != 2 && !z13 && this.f60085p && length != -1) {
            this.f60087r = true;
        }
        this.f60074e.b0(iX);
        return i11;
    }

    @Override // w8.p
    public boolean l(w8.q qVar) {
        byte[] bArrF = this.f60074e.f();
        qVar.e(bArrF, 0, 940);
        for (int i11 = 0; i11 < 188; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= 5) {
                    qVar.k(i11);
                    return true;
                }
                if (bArrF[(i12 * 188) + i11] != 71) {
                    break;
                }
                i12++;
            }
        }
        return false;
    }

    public k0(int i11, int i12, t9.q.a aVar, s7.i0 i0Var, l0.c cVar, int i13) {
        this.f60076g = (l0.c) s7.a.f(cVar);
        this.f60072c = i13;
        this.f60070a = i11;
        this.f60071b = i12;
        this.f60077h = aVar;
        if (i11 == 1 || i11 == 2) {
            this.f60073d = Collections.singletonList(i0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f60073d = arrayList;
            arrayList.add(i0Var);
        }
        this.f60074e = new s7.c0(new byte[9400], 0);
        this.f60079j = new SparseBooleanArray();
        this.f60080k = new SparseBooleanArray();
        this.f60078i = new SparseArray<>();
        this.f60075f = new SparseIntArray();
        this.f60081l = new i0(i13);
        this.f60083n = w8.r.I1;
        this.f60090u = -1;
        z();
    }

    @Override // w8.p
    public void release() {
    }

    private class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s7.b0 f60091a = new s7.b0(new byte[4]);

        public a() {
        }

        @Override // da.d0
        public void b(s7.c0 c0Var) {
            if (c0Var.M() == 0 && (c0Var.M() & 128) != 0) {
                c0Var.c0(6);
                int iA = c0Var.a() / 4;
                for (int i11 = 0; i11 < iA; i11++) {
                    c0Var.p(this.f60091a, 4);
                    int iH = this.f60091a.h(16);
                    this.f60091a.r(3);
                    if (iH == 0) {
                        this.f60091a.r(13);
                    } else {
                        int iH2 = this.f60091a.h(13);
                        if (k0.this.f60078i.get(iH2) == null) {
                            k0.this.f60078i.put(iH2, new e0(k0.this.new b(iH2)));
                            k0.m(k0.this);
                        }
                    }
                }
                if (k0.this.f60070a != 2) {
                    k0.this.f60078i.remove(0);
                }
            }
        }

        @Override // da.d0
        public void c(s7.i0 i0Var, w8.r rVar, l0.d dVar) {
        }
    }

    private class b implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s7.b0 f60093a = new s7.b0(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<l0> f60094b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f60095c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f60096d;

        public b(int i11) {
            this.f60096d = i11;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        private l0.b a(s7.c0 c0Var, int i11) {
            int i12;
            int iG = c0Var.g();
            int i13 = iG + i11;
            int i14 = -1;
            String str = null;
            ArrayList arrayList = null;
            int iM = 0;
            while (c0Var.g() < i13) {
                int iM2 = c0Var.M();
                int iG2 = c0Var.g() + c0Var.M();
                if (iG2 > i13) {
                    break;
                }
                if (iM2 == 5) {
                    long jO = c0Var.O();
                    if (jO == 1094921523) {
                        i14 = 129;
                    } else if (jO == 1161904947) {
                        i14 = 135;
                    } else if (jO == 1094921524) {
                        i14 = 172;
                    } else if (jO == 1212503619) {
                        i14 = 36;
                    }
                } else if (iM2 == 106) {
                    i14 = 129;
                } else if (iM2 == 122) {
                    i14 = 135;
                } else if (iM2 == 127) {
                    int iM3 = c0Var.M();
                    if (iM3 == 21) {
                        i14 = 172;
                    } else if (iM3 == 14) {
                        i14 = 136;
                    } else if (iM3 == 33) {
                        i14 = 139;
                    }
                } else {
                    if (iM2 == 123) {
                        i12 = 138;
                    } else if (iM2 == 10) {
                        String strTrim = c0Var.J(3).trim();
                        iM = c0Var.M();
                        str = strTrim;
                    } else if (iM2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (c0Var.g() < iG2) {
                            String strTrim2 = c0Var.J(3).trim();
                            int iM4 = c0Var.M();
                            byte[] bArr = new byte[4];
                            c0Var.q(bArr, 0, 4);
                            arrayList2.add(new l0.a(strTrim2, iM4, bArr));
                        }
                        arrayList = arrayList2;
                        i14 = 89;
                    } else if (iM2 == 111) {
                        i12 = EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    }
                    i14 = i12;
                }
                c0Var.c0(iG2 - c0Var.g());
            }
            c0Var.b0(i13);
            return new l0.b(i14, str, iM, arrayList, Arrays.copyOfRange(c0Var.f(), iG, i13));
        }

        @Override // da.d0
        public void b(s7.c0 c0Var) {
            s7.i0 i0Var;
            if (c0Var.M() != 2) {
                return;
            }
            if (k0.this.f60070a == 1 || k0.this.f60070a == 2 || k0.this.f60084o == 1) {
                i0Var = (s7.i0) k0.this.f60073d.get(0);
            } else {
                i0Var = new s7.i0(((s7.i0) k0.this.f60073d.get(0)).d());
                k0.this.f60073d.add(i0Var);
            }
            if ((c0Var.M() & 128) == 0) {
                return;
            }
            c0Var.c0(1);
            int iU = c0Var.U();
            int i11 = 3;
            c0Var.c0(3);
            c0Var.p(this.f60093a, 2);
            this.f60093a.r(3);
            int i12 = 13;
            k0.this.f60090u = this.f60093a.h(13);
            c0Var.p(this.f60093a, 2);
            int i13 = 4;
            this.f60093a.r(4);
            c0Var.c0(this.f60093a.h(12));
            if (k0.this.f60070a == 2 && k0.this.f60088s == null) {
                l0.b bVar = new l0.b(21, null, 0, null, q0.f110459f);
                k0 k0Var = k0.this;
                k0Var.f60088s = k0Var.f60076g.b(21, bVar);
                if (k0.this.f60088s != null) {
                    k0.this.f60088s.c(i0Var, k0.this.f60083n, new l0.d(iU, 21, PKIFailureInfo.certRevoked));
                }
            }
            this.f60094b.clear();
            this.f60095c.clear();
            int iA = c0Var.a();
            while (iA > 0) {
                c0Var.p(this.f60093a, 5);
                int iH = this.f60093a.h(8);
                this.f60093a.r(i11);
                int iH2 = this.f60093a.h(i12);
                this.f60093a.r(i13);
                int iH3 = this.f60093a.h(12);
                l0.b bVarA = a(c0Var, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarA.f60108a;
                }
                iA -= iH3 + 5;
                int i14 = k0.this.f60070a == 2 ? iH : iH2;
                if (!k0.this.f60079j.get(i14)) {
                    l0 l0VarB = (k0.this.f60070a == 2 && iH == 21) ? k0.this.f60088s : k0.this.f60076g.b(iH, bVarA);
                    if (k0.this.f60070a != 2 || iH2 < this.f60095c.get(i14, PKIFailureInfo.certRevoked)) {
                        this.f60095c.put(i14, iH2);
                        this.f60094b.put(i14, l0VarB);
                    }
                }
                i11 = 3;
                i13 = 4;
                i12 = 13;
            }
            int size = this.f60095c.size();
            for (int i15 = 0; i15 < size; i15++) {
                int iKeyAt = this.f60095c.keyAt(i15);
                int iValueAt = this.f60095c.valueAt(i15);
                k0.this.f60079j.put(iKeyAt, true);
                k0.this.f60080k.put(iValueAt, true);
                l0 l0VarValueAt = this.f60094b.valueAt(i15);
                if (l0VarValueAt != null) {
                    if (l0VarValueAt != k0.this.f60088s) {
                        l0VarValueAt.c(i0Var, k0.this.f60083n, new l0.d(iU, iKeyAt, PKIFailureInfo.certRevoked));
                    }
                    k0.this.f60078i.put(iValueAt, l0VarValueAt);
                }
            }
            if (k0.this.f60070a == 2) {
                if (k0.this.f60085p) {
                    return;
                }
                k0.this.f60083n.j();
                k0.this.f60084o = 0;
                k0.this.f60085p = true;
                return;
            }
            k0.this.f60078i.remove(this.f60096d);
            k0 k0Var2 = k0.this;
            k0Var2.f60084o = k0Var2.f60070a == 1 ? 0 : k0.this.f60084o - 1;
            if (k0.this.f60084o == 0) {
                k0.this.f60083n.j();
                k0.this.f60085p = true;
            }
        }

        @Override // da.d0
        public void c(s7.i0 i0Var, w8.r rVar, l0.d dVar) {
        }
    }
}
