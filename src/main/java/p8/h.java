package p8;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.o1;
import androidx.media3.exoplayer.source.f0;
import androidx.media3.exoplayer.source.g0;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n8.s;
import p7.u;
import p8.i;
import s7.q0;
import s7.t;
import z7.b0;

/* JADX INFO: loaded from: classes3.dex */
public class h<T extends i> implements s, g0, Loader.b<e>, Loader.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f101882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u[] f101883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f101884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T f101885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g0.a<h<T>> f101886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.s.a f101887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f101888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Loader f101889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f101890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<p8.a> f101891k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<p8.a> f101892l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f0 f101893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f0[] f101894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c f101895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private e f101896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private u f101897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b<T> f101898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f101899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f101900t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f101901u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p8.a f101902v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f101903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f101904x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f101905y;

    public interface b<T extends i> {
        void b(h<T> hVar);
    }

    public h(int i11, int[] iArr, u[] uVarArr, T t11, g0.a<h<T>> aVar, s8.b bVar, long j11, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.drm.h.a aVar2, androidx.media3.exoplayer.upstream.b bVar2, androidx.media3.exoplayer.source.s.a aVar3, boolean z11, t8.b bVar3) {
        this.f101881a = i11;
        int i12 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f101882b = iArr;
        this.f101883c = uVarArr == null ? new u[0] : uVarArr;
        this.f101885e = t11;
        this.f101886f = aVar;
        this.f101887g = aVar3;
        this.f101888h = bVar2;
        this.f101903w = z11;
        this.f101889i = bVar3 != null ? new Loader(bVar3) : new Loader("ChunkSampleStream");
        this.f101890j = new g();
        ArrayList<p8.a> arrayList = new ArrayList<>();
        this.f101891k = arrayList;
        this.f101892l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f101894n = new f0[length];
        this.f101884d = new boolean[length];
        int i13 = length + 1;
        int[] iArr2 = new int[i13];
        f0[] f0VarArr = new f0[i13];
        f0 f0VarL = f0.l(bVar, iVar, aVar2);
        this.f101893m = f0VarL;
        iArr2[0] = i11;
        f0VarArr[0] = f0VarL;
        while (i12 < length) {
            f0 f0VarM = f0.m(bVar);
            this.f101894n[i12] = f0VarM;
            int i14 = i12 + 1;
            f0VarArr[i14] = f0VarM;
            iArr2[i14] = this.f101882b[i12];
            i12 = i14;
        }
        this.f101895o = new c(iArr2, f0VarArr);
        this.f101899s = j11;
        this.f101900t = j11;
    }

    private void C(int i11) {
        int iMin = Math.min(R(i11, 0), this.f101901u);
        if (iMin > 0) {
            q0.q1(this.f101891k, 0, iMin);
            this.f101901u -= iMin;
        }
    }

    private void D(int i11) {
        s7.a.h(!this.f101889i.j());
        int size = this.f101891k.size();
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (!I(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        long j11 = H().f101877h;
        p8.a aVarE = E(i11);
        if (this.f101891k.isEmpty()) {
            this.f101899s = this.f101900t;
        }
        this.f101905y = false;
        this.f101887g.y(this.f101881a, aVarE.f101876g, j11);
    }

    private p8.a E(int i11) {
        p8.a aVar = this.f101891k.get(i11);
        ArrayList<p8.a> arrayList = this.f101891k;
        q0.q1(arrayList, i11, arrayList.size());
        this.f101901u = Math.max(this.f101901u, this.f101891k.size());
        int i12 = 0;
        this.f101893m.w(aVar.i(0));
        while (true) {
            f0[] f0VarArr = this.f101894n;
            if (i12 >= f0VarArr.length) {
                return aVar;
            }
            f0 f0Var = f0VarArr[i12];
            i12++;
            f0Var.w(aVar.i(i12));
        }
    }

    private p8.a H() {
        ArrayList<p8.a> arrayList = this.f101891k;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean I(int i11) {
        int iF;
        p8.a aVar = this.f101891k.get(i11);
        if (this.f101893m.F() > aVar.i(0)) {
            return true;
        }
        int i12 = 0;
        do {
            f0[] f0VarArr = this.f101894n;
            if (i12 >= f0VarArr.length) {
                return false;
            }
            iF = f0VarArr[i12].F();
            i12++;
        } while (iF <= aVar.i(i12));
        return true;
    }

    private boolean J(e eVar) {
        return eVar instanceof p8.a;
    }

    private void L() {
        int iR = R(this.f101893m.F(), this.f101901u - 1);
        while (true) {
            int i11 = this.f101901u;
            if (i11 > iR) {
                return;
            }
            this.f101901u = i11 + 1;
            M(i11);
        }
    }

    private void M(int i11) {
        p8.a aVar = this.f101891k.get(i11);
        u uVar = aVar.f101873d;
        if (!uVar.equals(this.f101897q)) {
            this.f101887g.j(this.f101881a, uVar, aVar.f101874e, aVar.f101875f, aVar.f101876g);
        }
        this.f101897q = uVar;
    }

    private int R(int i11, int i12) {
        do {
            i12++;
            if (i12 >= this.f101891k.size()) {
                return this.f101891k.size() - 1;
            }
        } while (this.f101891k.get(i12).i(0) <= i11);
        return i12 - 1;
    }

    private void U() {
        this.f101893m.X();
        for (f0 f0Var : this.f101894n) {
            f0Var.X();
        }
    }

    public boolean B() {
        try {
            return this.f101904x;
        } finally {
            this.f101904x = false;
        }
    }

    public void F(long j11) {
        s7.a.h(!this.f101889i.j());
        if (K() || j11 == -9223372036854775807L || this.f101891k.isEmpty()) {
            return;
        }
        p8.a aVarH = H();
        long j12 = aVarH.f101841l;
        if (j12 == -9223372036854775807L) {
            j12 = aVarH.f101877h;
        }
        if (j12 <= j11) {
            return;
        }
        long jC = this.f101893m.C();
        if (jC <= j11) {
            return;
        }
        this.f101893m.u(Math.max(j11, this.f101893m.D() + 1));
        for (f0 f0Var : this.f101894n) {
            f0Var.u(Math.max(j11, f0Var.D() + 1));
        }
        this.f101887g.y(this.f101881a, j11, jC);
    }

    public T G() {
        return this.f101885e;
    }

    boolean K() {
        return this.f101899s != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void s(e eVar, long j11, long j12, boolean z11) {
        this.f101896p = null;
        this.f101902v = null;
        n8.i iVar = new n8.i(eVar.f101870a, eVar.f101871b, eVar.f(), eVar.e(), j11, j12, eVar.c());
        this.f101888h.a(eVar.f101870a);
        this.f101887g.m(iVar, eVar.f101872c, this.f101881a, eVar.f101873d, eVar.f101874e, eVar.f101875f, eVar.f101876g, eVar.f101877h);
        if (z11) {
            return;
        }
        if (K()) {
            U();
        } else if (J(eVar)) {
            E(this.f101891k.size() - 1);
            if (this.f101891k.isEmpty()) {
                this.f101899s = this.f101900t;
            }
        }
        this.f101886f.j(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void v(e eVar, long j11, long j12) {
        this.f101896p = null;
        this.f101885e.c(eVar);
        n8.i iVar = new n8.i(eVar.f101870a, eVar.f101871b, eVar.f(), eVar.e(), j11, j12, eVar.c());
        this.f101888h.a(eVar.f101870a);
        this.f101887g.p(iVar, eVar.f101872c, this.f101881a, eVar.f101873d, eVar.f101874e, eVar.f101875f, eVar.f101876g, eVar.f101877h);
        this.f101886f.j(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public Loader.c p(e eVar, long j11, long j12, IOException iOException, int i11) {
        Loader.c cVarH;
        long jC = eVar.c();
        boolean zJ = J(eVar);
        int size = this.f101891k.size() - 1;
        boolean z11 = (jC != 0 && zJ && I(size)) ? false : true;
        n8.i iVar = new n8.i(eVar.f101870a, eVar.f101871b, eVar.f(), eVar.e(), j11, j12, jC);
        androidx.media3.exoplayer.upstream.b.c cVar = new androidx.media3.exoplayer.upstream.b.c(iVar, new n8.j(eVar.f101872c, this.f101881a, eVar.f101873d, eVar.f101874e, eVar.f101875f, q0.O1(eVar.f101876g), q0.O1(eVar.f101877h)), iOException, i11);
        if (!this.f101885e.i(eVar, z11, cVar, this.f101888h)) {
            cVarH = null;
        } else if (z11) {
            cVarH = Loader.f11137f;
            if (zJ) {
                s7.a.h(E(size) == eVar);
                if (this.f101891k.isEmpty()) {
                    this.f101899s = this.f101900t;
                }
            }
        } else {
            t.i("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            cVarH = null;
        }
        if (cVarH == null) {
            long jD = this.f101888h.d(cVar);
            cVarH = jD != -9223372036854775807L ? Loader.h(false, jD) : Loader.f11138g;
        }
        boolean zC = cVarH.c();
        this.f101887g.r(iVar, eVar.f101872c, this.f101881a, eVar.f101873d, eVar.f101874e, eVar.f101875f, eVar.f101876g, eVar.f101877h, iOException, !zC);
        if (!zC) {
            this.f101896p = null;
            this.f101888h.a(eVar.f101870a);
            this.f101886f.j(this);
        }
        return cVarH;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void q(e eVar, long j11, long j12, int i11) {
        this.f101887g.v(i11 == 0 ? new n8.i(eVar.f101870a, eVar.f101871b, j11) : new n8.i(eVar.f101870a, eVar.f101871b, eVar.f(), eVar.e(), j11, j12, eVar.c()), eVar.f101872c, this.f101881a, eVar.f101873d, eVar.f101874e, eVar.f101875f, eVar.f101876g, eVar.f101877h, i11);
    }

    public void S() {
        T(null);
    }

    public void T(b<T> bVar) {
        this.f101898r = bVar;
        this.f101893m.T();
        for (f0 f0Var : this.f101894n) {
            f0Var.T();
        }
        this.f101889i.m(this);
    }

    public void V(long j11) throws Throwable {
        p8.a aVar;
        boolean zB0;
        this.f101900t = j11;
        int i11 = 0;
        this.f101903w = false;
        if (K()) {
            this.f101899s = j11;
            return;
        }
        int i12 = 0;
        while (true) {
            if (i12 < this.f101891k.size()) {
                aVar = this.f101891k.get(i12);
                long j12 = aVar.f101876g;
                if (j12 == j11 && aVar.f101840k == -9223372036854775807L) {
                    break;
                } else if (j12 <= j11) {
                    i12++;
                }
            }
            aVar = null;
            break;
        }
        if (aVar != null) {
            zB0 = this.f101893m.a0(aVar.i(0));
        } else {
            long jF = f();
            zB0 = this.f101893m.b0(j11, jF == Long.MIN_VALUE || j11 < jF);
        }
        if (zB0) {
            this.f101901u = R(this.f101893m.F(), 0);
            f0[] f0VarArr = this.f101894n;
            int length = f0VarArr.length;
            while (i11 < length) {
                f0VarArr[i11].b0(j11, true);
                i11++;
            }
            return;
        }
        this.f101899s = j11;
        this.f101905y = false;
        this.f101891k.clear();
        this.f101901u = 0;
        if (!this.f101889i.j()) {
            this.f101889i.g();
            U();
            return;
        }
        this.f101893m.s();
        f0[] f0VarArr2 = this.f101894n;
        int length2 = f0VarArr2.length;
        while (i11 < length2) {
            f0VarArr2[i11].s();
            i11++;
        }
        this.f101889i.f();
    }

    public h<T>.a W(long j11, int i11) throws Throwable {
        for (int i12 = 0; i12 < this.f101894n.length; i12++) {
            if (this.f101882b[i12] == i11) {
                s7.a.h(!this.f101884d[i12]);
                this.f101884d[i12] = true;
                this.f101894n[i12].b0(j11, true);
                return new a(this, this.f101894n[i12], i12);
            }
        }
        throw new IllegalStateException();
    }

    @Override // n8.s
    public void a() throws IOException {
        this.f101889i.a();
        this.f101893m.P();
        if (this.f101889i.j()) {
            return;
        }
        this.f101885e.a();
    }

    @Override // n8.s
    public int b(long j11) throws Throwable {
        if (K()) {
            return 0;
        }
        int iH = this.f101893m.H(j11, this.f101905y);
        p8.a aVar = this.f101902v;
        if (aVar != null) {
            iH = Math.min(iH, aVar.i(0) - this.f101893m.F());
        }
        this.f101893m.g0(iH);
        L();
        return iH;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public boolean c() {
        return this.f101889i.j();
    }

    @Override // androidx.media3.exoplayer.source.g0
    public long d() {
        if (this.f101905y) {
            return Long.MIN_VALUE;
        }
        if (K()) {
            return this.f101899s;
        }
        long jMax = this.f101900t;
        p8.a aVarH = H();
        if (!aVarH.h()) {
            if (this.f101891k.size() > 1) {
                ArrayList<p8.a> arrayList = this.f101891k;
                aVarH = arrayList.get(arrayList.size() - 2);
            } else {
                aVarH = null;
            }
        }
        if (aVarH != null) {
            jMax = Math.max(jMax, aVarH.f101877h);
        }
        return Math.max(jMax, this.f101893m.C());
    }

    @Override // androidx.media3.exoplayer.source.g0
    public void e(long j11) {
        if (this.f101889i.i() || K()) {
            return;
        }
        if (!this.f101889i.j()) {
            int iF = this.f101885e.f(j11, this.f101892l);
            if (iF < this.f101891k.size()) {
                D(iF);
                return;
            }
            return;
        }
        e eVar = (e) s7.a.f(this.f101896p);
        if (!(J(eVar) && I(this.f101891k.size() - 1)) && this.f101885e.d(j11, eVar, this.f101892l)) {
            this.f101889i.f();
            if (J(eVar)) {
                this.f101902v = (p8.a) eVar;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.g0
    public long f() {
        if (K()) {
            return this.f101899s;
        }
        if (this.f101905y) {
            return Long.MIN_VALUE;
        }
        return H().f101877h;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.f
    public void i() {
        this.f101893m.V();
        for (f0 f0Var : this.f101894n) {
            f0Var.V();
        }
        this.f101885e.release();
        b<T> bVar = this.f101898r;
        if (bVar != null) {
            bVar.b(this);
        }
    }

    @Override // n8.s
    public boolean isReady() {
        return !K() && this.f101893m.N(this.f101905y);
    }

    @Override // n8.s
    public int j(z7.u uVar, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (K()) {
            return -3;
        }
        p8.a aVar = this.f101902v;
        if (aVar != null && aVar.i(0) <= this.f101893m.F()) {
            return -3;
        }
        L();
        return this.f101893m.U(uVar, decoderInputBuffer, i11, this.f101905y);
    }

    @Override // androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        List<p8.a> list;
        long j11;
        if (this.f101905y || this.f101889i.j() || this.f101889i.i()) {
            return false;
        }
        boolean zK = K();
        if (zK) {
            list = Collections.EMPTY_LIST;
            j11 = this.f101899s;
        } else {
            list = this.f101892l;
            j11 = H().f101877h;
        }
        this.f101885e.h(o1Var, j11, list, this.f101890j);
        g gVar = this.f101890j;
        boolean z11 = gVar.f101880b;
        e eVar = gVar.f101879a;
        gVar.a();
        if (z11) {
            this.f101899s = -9223372036854775807L;
            this.f101905y = true;
            return true;
        }
        if (eVar == null) {
            return false;
        }
        this.f101896p = eVar;
        if (J(eVar)) {
            p8.a aVar = (p8.a) eVar;
            if (zK) {
                long j12 = aVar.f101876g;
                long j13 = this.f101899s;
                if (j12 < j13) {
                    this.f101893m.d0(j13);
                    for (f0 f0Var : this.f101894n) {
                        f0Var.d0(this.f101899s);
                    }
                    if (this.f101903w) {
                        u uVar = aVar.f101873d;
                        this.f101904x = !p7.g0.a(uVar.f101544o, uVar.f101540k);
                    }
                }
                this.f101903w = false;
                this.f101899s = -9223372036854775807L;
            }
            aVar.k(this.f101895o);
            this.f101891k.add(aVar);
        } else if (eVar instanceof l) {
            ((l) eVar).g(this.f101895o);
        }
        this.f101889i.n(eVar, this, this.f101888h.b(eVar.f101872c));
        return true;
    }

    public long m(long j11, b0 b0Var) {
        return this.f101885e.m(j11, b0Var);
    }

    public void o(long j11, boolean z11) {
        if (K()) {
            return;
        }
        int iA = this.f101893m.A();
        this.f101893m.r(j11, z11, true);
        int iA2 = this.f101893m.A();
        if (iA2 > iA) {
            long jB = this.f101893m.B();
            int i11 = 0;
            while (true) {
                f0[] f0VarArr = this.f101894n;
                if (i11 >= f0VarArr.length) {
                    break;
                }
                f0VarArr[i11].r(jB, z11, this.f101884d[i11]);
                i11++;
            }
        }
        C(iA2);
    }

    public final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h<T> f101906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f0 f101907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f101908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f101909d;

        public a(h<T> hVar, f0 f0Var, int i11) {
            this.f101906a = hVar;
            this.f101907b = f0Var;
            this.f101908c = i11;
        }

        private void c() {
            if (this.f101909d) {
                return;
            }
            h.this.f101887g.j(h.this.f101882b[this.f101908c], h.this.f101883c[this.f101908c], 0, null, h.this.f101900t);
            this.f101909d = true;
        }

        @Override // n8.s
        public int b(long j11) throws Throwable {
            if (h.this.K()) {
                return 0;
            }
            int iH = this.f101907b.H(j11, h.this.f101905y);
            if (h.this.f101902v != null) {
                iH = Math.min(iH, h.this.f101902v.i(this.f101908c + 1) - this.f101907b.F());
            }
            this.f101907b.g0(iH);
            if (iH > 0) {
                c();
            }
            return iH;
        }

        public void d() {
            s7.a.h(h.this.f101884d[this.f101908c]);
            h.this.f101884d[this.f101908c] = false;
        }

        @Override // n8.s
        public boolean isReady() {
            return !h.this.K() && this.f101907b.N(h.this.f101905y);
        }

        @Override // n8.s
        public int j(z7.u uVar, DecoderInputBuffer decoderInputBuffer, int i11) {
            if (h.this.K()) {
                return -3;
            }
            if (h.this.f101902v != null && h.this.f101902v.i(this.f101908c + 1) <= this.f101907b.F()) {
                return -3;
            }
            c();
            return this.f101907b.U(uVar, decoderInputBuffer, i11, h.this.f101905y);
        }

        @Override // n8.s
        public void a() {
        }
    }
}
