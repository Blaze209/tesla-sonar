package androidx.media3.exoplayer.dash;

import a8.o2;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.o1;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.common.collect.z;
import d8.i;
import d8.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p7.g0;
import p7.u;
import p8.l;
import p8.m;
import p8.n;
import p8.o;
import r8.t;
import s7.k0;
import s7.q0;
import s8.k;
import v7.q;
import w8.g;
import z7.b0;

/* JADX INFO: loaded from: classes.dex */
public class d implements androidx.media3.exoplayer.dash.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c8.b f9657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f9658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.datasource.a f9660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f9661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f9662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f.c f9663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s8.e f9664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final b[] f9665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private t f9666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d8.c f9667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f9668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IOException f9669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f9670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f9671p = -9223372036854775807L;

    public static final class a implements androidx.media3.exoplayer.dash.a.InterfaceC0196a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.datasource.a.InterfaceC0192a f9672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p8.f.a f9674c;

        public a(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            this(interfaceC0192a, 1);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0196a
        public u d(u uVar) {
            return this.f9674c.d(uVar);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0196a
        public androidx.media3.exoplayer.dash.a e(k kVar, d8.c cVar, c8.b bVar, int i11, int[] iArr, t tVar, int i12, long j11, boolean z11, List<u> list, f.c cVar2, q qVar, o2 o2Var, s8.e eVar) {
            androidx.media3.datasource.a aVarA = this.f9672a.a();
            if (qVar != null) {
                aVarA.n(qVar);
            }
            return new d(this.f9674c, kVar, cVar, bVar, i11, iArr, tVar, i12, aVarA, j11, this.f9673b, z11, list, cVar2, o2Var, eVar);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0196a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(boolean z11) {
            this.f9674c.b(z11);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0196a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(int i11) {
            this.f9674c.c(i11);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0196a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(t9.q.a aVar) {
            this.f9674c.a(aVar);
            return this;
        }

        public a(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, int i11) {
            this(new p8.d.b(), interfaceC0192a, i11);
        }

        public a(p8.f.a aVar, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, int i11) {
            this.f9674c = aVar;
            this.f9672a = interfaceC0192a;
            this.f9673b = i11;
        }
    }

    protected static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p8.f f9675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f9676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d8.b f9677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c8.e f9678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f9679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f9680f;

        b(long j11, j jVar, d8.b bVar, p8.f fVar, long j12, c8.e eVar) {
            this.f9679e = j11;
            this.f9676b = jVar;
            this.f9677c = bVar;
            this.f9680f = j12;
            this.f9675a = fVar;
            this.f9678d = eVar;
        }

        b b(long j11, j jVar) throws BehindLiveWindowException {
            long jF;
            long jF2;
            c8.e eVarL = this.f9676b.l();
            c8.e eVarL2 = jVar.l();
            if (eVarL == null) {
                return new b(j11, jVar, this.f9677c, this.f9675a, this.f9680f, eVarL);
            }
            if (!eVarL.j()) {
                return new b(j11, jVar, this.f9677c, this.f9675a, this.f9680f, eVarL2);
            }
            long jG = eVarL.g(j11);
            if (jG == 0) {
                return new b(j11, jVar, this.f9677c, this.f9675a, this.f9680f, eVarL2);
            }
            s7.a.j(eVarL2);
            long jH = eVarL.h();
            long jB = eVarL.b(jH);
            long j12 = jG + jH;
            long j13 = j12 - 1;
            long jB2 = eVarL.b(j13) + eVarL.c(j13, j11);
            long jH2 = eVarL2.h();
            long jB3 = eVarL2.b(jH2);
            long j14 = this.f9680f;
            if (jB2 != jB3) {
                if (jB2 < jB3) {
                    throw new BehindLiveWindowException();
                }
                if (jB3 < jB) {
                    jF2 = j14 - (eVarL2.f(jB, j11) - jH);
                } else {
                    jF = eVarL.f(jB3, j11) - jH2;
                }
                return new b(j11, jVar, this.f9677c, this.f9675a, jF2, eVarL2);
            }
            jF = j12 - jH2;
            jF2 = j14 + jF;
            return new b(j11, jVar, this.f9677c, this.f9675a, jF2, eVarL2);
        }

        b c(c8.e eVar) {
            return new b(this.f9679e, this.f9676b, this.f9677c, this.f9675a, this.f9680f, eVar);
        }

        b d(d8.b bVar) {
            return new b(this.f9679e, this.f9676b, bVar, this.f9675a, this.f9680f, this.f9678d);
        }

        public long e(long j11) {
            return ((c8.e) s7.a.j(this.f9678d)).d(this.f9679e, j11) + this.f9680f;
        }

        public long f() {
            return ((c8.e) s7.a.j(this.f9678d)).h() + this.f9680f;
        }

        public long g(long j11) {
            return (e(j11) + ((c8.e) s7.a.j(this.f9678d)).k(this.f9679e, j11)) - 1;
        }

        public long h() {
            return ((c8.e) s7.a.j(this.f9678d)).g(this.f9679e);
        }

        public long i(long j11) {
            return k(j11) + ((c8.e) s7.a.j(this.f9678d)).c(j11 - this.f9680f, this.f9679e);
        }

        public long j(long j11) {
            return ((c8.e) s7.a.j(this.f9678d)).f(j11, this.f9679e) + this.f9680f;
        }

        public long k(long j11) {
            return ((c8.e) s7.a.j(this.f9678d)).b(j11 - this.f9680f);
        }

        public i l(long j11) {
            return ((c8.e) s7.a.j(this.f9678d)).i(j11 - this.f9680f);
        }

        public boolean m(long j11, long j12) {
            return ((c8.e) s7.a.j(this.f9678d)).j() || j12 == -9223372036854775807L || i(j11) <= j12;
        }
    }

    protected static final class c extends p8.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f9681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f9682f;

        public c(b bVar, long j11, long j12, long j13) {
            super(j11, j12);
            this.f9681e = bVar;
            this.f9682f = j13;
        }

        @Override // p8.n
        public long a() {
            c();
            return this.f9681e.i(d());
        }

        @Override // p8.n
        public long b() {
            c();
            return this.f9681e.k(d());
        }
    }

    public d(p8.f.a aVar, k kVar, d8.c cVar, c8.b bVar, int i11, int[] iArr, t tVar, int i12, androidx.media3.datasource.a aVar2, long j11, int i13, boolean z11, List<u> list, f.c cVar2, o2 o2Var, s8.e eVar) {
        this.f9656a = kVar;
        this.f9667l = cVar;
        this.f9657b = bVar;
        this.f9658c = iArr;
        this.f9666k = tVar;
        int i14 = i12;
        this.f9659d = i14;
        this.f9660e = aVar2;
        this.f9668m = i11;
        this.f9661f = j11;
        this.f9662g = i13;
        f.c cVar3 = cVar2;
        this.f9663h = cVar3;
        this.f9664i = eVar;
        long jG = cVar.g(i11);
        ArrayList<j> arrayListO = o();
        this.f9665j = new b[tVar.length()];
        int i15 = 0;
        while (i15 < this.f9665j.length) {
            j jVar = arrayListO.get(tVar.b(i15));
            d8.b bVarJ = bVar.j(jVar.f59830c);
            b[] bVarArr = this.f9665j;
            d8.b bVar2 = bVarJ == null ? jVar.f59830c.get(0) : bVarJ;
            p8.f fVarE = aVar.e(i14, jVar.f59829b, z11, list, cVar3, o2Var);
            long j12 = jG;
            int i16 = i15;
            bVarArr[i16] = new b(j12, jVar, bVar2, fVarE, 0L, jVar.l());
            i15 = i16 + 1;
            i14 = i12;
            jG = j12;
            cVar3 = cVar2;
        }
    }

    private androidx.media3.exoplayer.upstream.b.a j(t tVar, List<d8.b> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = tVar.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (tVar.l(i12, jElapsedRealtime)) {
                i11++;
            }
        }
        int iF = c8.b.f(list);
        return new androidx.media3.exoplayer.upstream.b.a(iF, iF - this.f9657b.g(list), length, i11);
    }

    private long k(long j11, long j12) {
        if (!this.f9667l.f59781d || this.f9665j[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(n(j11), this.f9665j[0].i(this.f9665j[0].g(j11))) - j12);
    }

    private Pair<String, String> l(long j11, i iVar, b bVar) {
        long j12 = j11 + 1;
        if (j12 >= bVar.h()) {
            return null;
        }
        i iVarL = bVar.l(j12);
        String strA = k0.a(iVar.b(bVar.f9677c.f59774a), iVarL.b(bVar.f9677c.f59774a));
        String str = iVarL.f59824a + "-";
        if (iVarL.f59825b != -1) {
            str = str + (iVarL.f59824a + iVarL.f59825b);
        }
        return new Pair<>(strA, str);
    }

    private long n(long j11) {
        d8.c cVar = this.f9667l;
        long j12 = cVar.f59778a;
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j11 - q0.b1(j12 + cVar.d(this.f9668m).f59815b);
    }

    @RequiresNonNull({"manifest", "adaptationSetIndices"})
    private ArrayList<j> o() {
        List<d8.a> list = this.f9667l.d(this.f9668m).f59816c;
        ArrayList<j> arrayList = new ArrayList<>();
        for (int i11 : this.f9658c) {
            arrayList.addAll(list.get(i11).f59770c);
        }
        return arrayList;
    }

    private long p(b bVar, m mVar, long j11, long j12, long j13) {
        return mVar != null ? mVar.g() : q0.s(bVar.j(j11), j12, j13);
    }

    private b s(int i11) {
        b bVar = this.f9665j[i11];
        d8.b bVarJ = this.f9657b.j(bVar.f9676b.f59830c);
        if (bVarJ == null || bVarJ.equals(bVar.f9677c)) {
            return bVar;
        }
        b bVarD = bVar.d(bVarJ);
        this.f9665j[i11] = bVarD;
        return bVarD;
    }

    @Override // p8.i
    public void a() throws IOException {
        IOException iOException = this.f9669n;
        if (iOException != null) {
            throw iOException;
        }
        this.f9656a.a();
    }

    @Override // androidx.media3.exoplayer.dash.a
    public void b(t tVar) {
        this.f9666k = tVar;
    }

    @Override // p8.i
    public void c(p8.e eVar) {
        g gVarD;
        if (eVar instanceof l) {
            int iS = this.f9666k.s(((l) eVar).f101873d);
            b bVar = this.f9665j[iS];
            if (bVar.f9678d == null && (gVarD = ((p8.f) s7.a.j(bVar.f9675a)).d()) != null) {
                this.f9665j[iS] = bVar.c(new c8.g(gVarD, bVar.f9676b.f59831d));
            }
        }
        f.c cVar = this.f9663h;
        if (cVar != null) {
            cVar.j(eVar);
        }
    }

    @Override // p8.i
    public boolean d(long j11, p8.e eVar, List<? extends m> list) {
        if (this.f9669n != null) {
            return false;
        }
        return this.f9666k.q(j11, eVar, list);
    }

    @Override // p8.i
    public int f(long j11, List<? extends m> list) {
        return (this.f9669n != null || this.f9666k.length() < 2) ? list.size() : this.f9666k.o(j11, list);
    }

    @Override // androidx.media3.exoplayer.dash.a
    public void g(d8.c cVar, int i11) {
        try {
            this.f9667l = cVar;
            this.f9668m = i11;
            long jG = cVar.g(i11);
            ArrayList<j> arrayListO = o();
            for (int i12 = 0; i12 < this.f9665j.length; i12++) {
                j jVar = arrayListO.get(this.f9666k.b(i12));
                b[] bVarArr = this.f9665j;
                bVarArr[i12] = bVarArr[i12].b(jG, jVar);
            }
        } catch (BehindLiveWindowException e11) {
            this.f9669n = e11;
        }
    }

    @Override // p8.i
    public void h(o1 o1Var, long j11, List<? extends m> list, p8.g gVar) {
        n[] nVarArr;
        int i11;
        boolean z11;
        int i12;
        d dVar;
        m mVar;
        long j12;
        d dVar2 = this;
        if (dVar2.f9669n != null) {
            return;
        }
        long j13 = o1Var.f10600a;
        long j14 = j11 - j13;
        long jB1 = q0.b1(dVar2.f9667l.f59778a) + q0.b1(dVar2.f9667l.d(dVar2.f9668m).f59815b) + j11;
        f.c cVar = dVar2.f9663h;
        if (cVar == null || !cVar.i(jB1)) {
            long jB2 = q0.b1(q0.p0(dVar2.f9661f));
            long jN = dVar2.n(jB2);
            boolean z12 = true;
            m mVar2 = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = dVar2.f9666k.length();
            n[] nVarArr2 = new n[length];
            int i13 = 0;
            while (i13 < length) {
                b bVar = dVar2.f9665j[i13];
                if (bVar.f9678d == null) {
                    nVarArr2[i13] = n.f101925a;
                    dVar = dVar2;
                    mVar = mVar2;
                    z11 = z12;
                    i12 = length;
                    nVarArr = nVarArr2;
                    i11 = i13;
                } else {
                    nVarArr = nVarArr2;
                    long jE = bVar.e(jB2);
                    boolean z13 = z12;
                    m mVar3 = mVar2;
                    long jG = bVar.g(jB2);
                    i11 = i13;
                    z11 = z13;
                    i12 = length;
                    long jP = dVar2.p(bVar, mVar3, j11, jE, jG);
                    dVar = dVar2;
                    mVar = mVar3;
                    if (jP < jE) {
                        nVarArr[i11] = n.f101925a;
                    } else {
                        long j15 = jN;
                        j12 = j15;
                        nVarArr[i11] = new c(dVar.s(i11), jP, jG, j15);
                    }
                    i13 = i11 + 1;
                    dVar2 = dVar;
                    length = i12;
                    nVarArr2 = nVarArr;
                    z12 = z11;
                    mVar2 = mVar;
                    jN = j12;
                }
                j12 = jN;
                i13 = i11 + 1;
                dVar2 = dVar;
                length = i12;
                nVarArr2 = nVarArr;
                z12 = z11;
                mVar2 = mVar;
                jN = j12;
            }
            d dVar3 = dVar2;
            m mVar4 = mVar2;
            boolean z14 = z12;
            long j16 = jN;
            dVar3.f9666k.m(j13, j14, dVar3.k(jB2, j13), list, nVarArr2);
            int iA = dVar3.f9666k.a();
            s8.f.C2354f c2354fH = dVar3.f9664i == null ? null : new s8.f.C2354f(dVar3.f9664i, DateTokenConverter.CONVERTER_KEY).n(dVar3.f9666k).e(Math.max(0L, j14)).m(o1Var.f10601b).i(dVar3.f9667l.f59781d).g(o1Var.b(dVar3.f9671p)).h(list.isEmpty());
            dVar3.f9671p = SystemClock.elapsedRealtime();
            b bVarS = dVar3.s(iA);
            p8.f fVar = bVarS.f9675a;
            if (fVar != null) {
                j jVar = bVarS.f9676b;
                i iVarN = fVar.e() == null ? jVar.n() : null;
                i iVarM = bVarS.f9678d == null ? jVar.m() : null;
                if (iVarN != null || iVarM != null) {
                    gVar.f101879a = dVar3.q(bVarS, dVar3.f9660e, dVar3.f9666k.f(), dVar3.f9666k.t(), dVar3.f9666k.r(), iVarN, iVarM, c2354fH);
                    return;
                }
            }
            long j17 = bVarS.f9679e;
            d8.c cVar2 = dVar3.f9667l;
            boolean z15 = (cVar2.f59781d && dVar3.f9668m == cVar2.e() + (-1)) ? z14 : false;
            boolean z16 = (z15 && j17 == -9223372036854775807L) ? false : z14;
            if (bVarS.h() == 0) {
                gVar.f101880b = z16;
                return;
            }
            long jE2 = bVarS.e(jB2);
            long jG2 = bVarS.g(jB2);
            if (z15) {
                long jI = bVarS.i(jG2);
                z16 &= jI + (jI - bVarS.k(jG2)) >= j17 ? z14 : false;
            }
            boolean z17 = z16;
            long jP2 = dVar3.p(bVarS, mVar4, j11, jE2, jG2);
            if (jP2 < jE2) {
                dVar3.f9669n = new BehindLiveWindowException();
                return;
            }
            if (jP2 > jG2 || (dVar3.f9670o && jP2 >= jG2)) {
                gVar.f101880b = z17;
                return;
            }
            if (z17 && bVarS.k(jP2) >= j17) {
                gVar.f101880b = z14;
                return;
            }
            int iMin = (int) Math.min(dVar3.f9662g, (jG2 - jP2) + 1);
            if (j17 != -9223372036854775807L) {
                while (iMin > 1 && bVarS.k((((long) iMin) + jP2) - 1) >= j17) {
                    iMin--;
                }
            }
            gVar.f101879a = dVar3.r(bVarS, dVar3.f9660e, dVar3.f9659d, dVar3.f9666k.f(), dVar3.f9666k.t(), dVar3.f9666k.r(), jP2, iMin, list.isEmpty() ? j11 : -9223372036854775807L, j16, c2354fH);
        }
    }

    @Override // p8.i
    public boolean i(p8.e eVar, boolean z11, androidx.media3.exoplayer.upstream.b.c cVar, androidx.media3.exoplayer.upstream.b bVar) {
        androidx.media3.exoplayer.upstream.b.C0205b c0205bC;
        if (!z11) {
            return false;
        }
        f.c cVar2 = this.f9663h;
        if (cVar2 != null && cVar2.k(eVar)) {
            return true;
        }
        if (!this.f9667l.f59781d && (eVar instanceof m)) {
            IOException iOException = cVar.f11164c;
            if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).f9128d == 404) {
                b bVar2 = this.f9665j[this.f9666k.s(eVar.f101873d)];
                long jH = bVar2.h();
                if (jH != -1 && jH != 0) {
                    if (((m) eVar).g() > (bVar2.f() + jH) - 1) {
                        this.f9670o = true;
                        return true;
                    }
                }
            }
        }
        b bVar3 = this.f9665j[this.f9666k.s(eVar.f101873d)];
        d8.b bVarJ = this.f9657b.j(bVar3.f9676b.f59830c);
        if (bVarJ != null && !bVar3.f9677c.equals(bVarJ)) {
            return true;
        }
        androidx.media3.exoplayer.upstream.b.a aVarJ = j(this.f9666k, bVar3.f9676b.f59830c);
        if ((aVarJ.a(2) || aVarJ.a(1)) && (c0205bC = bVar.c(aVarJ, cVar)) != null && aVarJ.a(c0205bC.f11160a)) {
            int i11 = c0205bC.f11160a;
            if (i11 == 2) {
                t tVar = this.f9666k;
                return tVar.n(tVar.s(eVar.f101873d), c0205bC.f11161b);
            }
            if (i11 == 1) {
                this.f9657b.e(bVar3.f9677c, c0205bC.f11161b);
                return true;
            }
        }
        return false;
    }

    @Override // p8.i
    public long m(long j11, b0 b0Var) {
        for (b bVar : this.f9665j) {
            if (bVar.f9678d != null) {
                long jH = bVar.h();
                if (jH != 0) {
                    long j12 = bVar.j(j11);
                    long jK = bVar.k(j12);
                    return b0Var.a(j11, jK, (jK >= j11 || (jH != -1 && j12 >= (bVar.f() + jH) - 1)) ? jK : bVar.k(j12 + 1));
                }
            }
        }
        return j11;
    }

    @RequiresNonNull({"#1.chunkExtractor"})
    protected p8.e q(b bVar, androidx.media3.datasource.a aVar, u uVar, int i11, Object obj, i iVar, i iVar2, s8.f.C2354f c2354f) {
        j jVar = bVar.f9676b;
        if (iVar != null) {
            i iVarA = iVar.a(iVar2, bVar.f9677c.f59774a);
            if (iVarA != null) {
                iVar = iVarA;
            }
        } else {
            iVar = (i) s7.a.f(iVar2);
        }
        v7.j jVarA = c8.f.a(jVar, bVar.f9677c.f59774a, iVar, 0, z.m());
        if (c2354f != null) {
            jVarA = c2354f.l(IntegerTokenConverter.CONVERTER_KEY).a().a(jVarA);
        }
        return new l(aVar, jVarA, uVar, i11, obj, bVar.f9675a);
    }

    protected p8.e r(b bVar, androidx.media3.datasource.a aVar, int i11, u uVar, int i12, Object obj, long j11, int i13, long j12, long j13, s8.f.C2354f c2354f) {
        j jVar = bVar.f9676b;
        long jK = bVar.k(j11);
        i iVarL = bVar.l(j11);
        if (bVar.f9675a == null) {
            long jI = bVar.i(j11);
            v7.j jVarA = c8.f.a(jVar, bVar.f9677c.f59774a, iVarL, bVar.m(j11, j13) ? 0 : 8, z.m());
            if (c2354f != null) {
                c2354f.f(jI - jK);
                Pair<String, String> pairL = l(j11, iVarL, bVar);
                if (pairL != null) {
                    c2354f.j((String) pairL.first).k((String) pairL.second);
                }
                jVarA = c2354f.a().a(jVarA);
            }
            return new o(aVar, jVarA, uVar, i12, obj, jK, jI, j11, i11, uVar);
        }
        int i14 = 1;
        int i15 = 1;
        while (i14 < i13) {
            i iVarA = iVarL.a(bVar.l(((long) i14) + j11), bVar.f9677c.f59774a);
            if (iVarA == null) {
                break;
            }
            i15++;
            i14++;
            iVarL = iVarA;
        }
        long j14 = (((long) i15) + j11) - 1;
        int i16 = i15;
        long jI2 = bVar.i(j14);
        long j15 = bVar.f9679e;
        if (j15 == -9223372036854775807L || j15 > jI2) {
            j15 = -9223372036854775807L;
        }
        v7.j jVarA2 = c8.f.a(jVar, bVar.f9677c.f59774a, iVarL, bVar.m(j14, j13) ? 0 : 8, z.m());
        if (c2354f != null) {
            c2354f.f(jI2 - jK);
            Pair<String, String> pairL2 = l(j11, iVarL, bVar);
            if (pairL2 != null) {
                c2354f.j((String) pairL2.first).k((String) pairL2.second);
            }
            jVarA2 = c2354f.a().a(jVarA2);
        }
        v7.j jVar2 = jVarA2;
        long j16 = -jVar.f59831d;
        if (g0.q(uVar.f101544o)) {
            j16 += jK;
        }
        return new p8.j(aVar, jVar2, uVar, i12, obj, jK, jI2, j12, j15, j11, i16, j16, bVar.f9675a);
    }

    @Override // p8.i
    public void release() {
        for (b bVar : this.f9665j) {
            p8.f fVar = bVar.f9675a;
            if (fVar != null) {
                fVar.release();
            }
        }
    }
}
