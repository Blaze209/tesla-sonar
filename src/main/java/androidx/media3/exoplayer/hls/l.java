package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.o1;
import androidx.media3.exoplayer.source.f0;
import androidx.media3.exoplayer.source.g0;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.upstream.Loader;
import com.google.common.collect.x;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k9.m;
import n8.y;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p7.n;
import p7.t0;
import p7.u;
import r8.z;
import s7.c0;
import s7.q0;
import s7.t;
import w8.j0;
import w8.o0;
import w8.r;
import z7.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Loader.b<p8.e>, Loader.f, g0, r, f0.d {
    private static final Set<Integer> Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private u F;
    private u G;
    private boolean H;
    private y I;
    private Set<t0> J;
    private int[] K;
    private int L;
    private boolean M;
    private boolean[] N;
    private boolean[] O;
    private long P;
    private long Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private n W;
    private e X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f10033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.hls.c f10034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s8.b f10035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f10036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f10037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.h.a f10038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f10039i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s.a f10041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f10042l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList<e> f10044n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<e> f10045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f10046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f10047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Handler f10048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList<h> f10049s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map<String, n> f10050t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p8.e f10051u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d[] f10052v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Set<Integer> f10054x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private SparseIntArray f10055y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private o0 f10056z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Loader f10040j = new Loader("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.media3.exoplayer.hls.c.b f10043m = new androidx.media3.exoplayer.hls.c.b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f10053w = new int[0];

    public interface b extends g0.a<l> {
        void a();

        void p(Uri uri);
    }

    private static class c implements o0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final u f10057g = new u.b().y0("application/id3").P();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final u f10058h = new u.b().y0("application/x-emsg").P();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h9.b f10059a = new h9.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f10060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final u f10061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private u f10062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f10063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f10064f;

        public c(o0 o0Var, int i11) {
            this.f10060b = o0Var;
            if (i11 == 1) {
                this.f10061c = f10057g;
            } else {
                if (i11 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i11);
                }
                this.f10061c = f10058h;
            }
            this.f10063e = new byte[0];
            this.f10064f = 0;
        }

        private boolean h(h9.a aVar) {
            u uVarH = aVar.H();
            return uVarH != null && Objects.equals(this.f10061c.f101544o, uVarH.f101544o);
        }

        private void i(int i11) {
            byte[] bArr = this.f10063e;
            if (bArr.length < i11) {
                this.f10063e = Arrays.copyOf(bArr, i11 + (i11 / 2));
            }
        }

        private c0 j(int i11, int i12) {
            int i13 = this.f10064f - i12;
            c0 c0Var = new c0(Arrays.copyOfRange(this.f10063e, i13 - i11, i13));
            byte[] bArr = this.f10063e;
            System.arraycopy(bArr, i13, bArr, 0, i12);
            this.f10064f = i12;
            return c0Var;
        }

        @Override // w8.o0
        public void a(c0 c0Var, int i11, int i12) {
            i(this.f10064f + i11);
            c0Var.q(this.f10063e, this.f10064f, i11);
            this.f10064f += i11;
        }

        @Override // w8.o0
        public void b(long j11, int i11, int i12, int i13, o0.a aVar) {
            s7.a.f(this.f10062d);
            c0 c0VarJ = j(i12, i13);
            if (!Objects.equals(this.f10062d.f101544o, this.f10061c.f101544o)) {
                if (!"application/x-emsg".equals(this.f10062d.f101544o)) {
                    t.i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f10062d.f101544o);
                    return;
                }
                h9.a aVarC = this.f10059a.c(c0VarJ);
                if (!h(aVarC)) {
                    t.i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f10061c.f101544o, aVarC.H()));
                    return;
                }
                c0VarJ = new c0((byte[]) s7.a.f(aVarC.C()));
            }
            int iA = c0VarJ.a();
            this.f10060b.f(c0VarJ, iA);
            this.f10060b.b(j11, i11, iA, 0, aVar);
        }

        @Override // w8.o0
        public int c(p7.j jVar, int i11, boolean z11, int i12) throws EOFException {
            i(this.f10064f + i11);
            int i13 = jVar.read(this.f10063e, this.f10064f, i11);
            if (i13 != -1) {
                this.f10064f += i13;
                return i13;
            }
            if (z11) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // w8.o0
        public void g(u uVar) {
            this.f10062d = uVar;
            this.f10060b.g(this.f10061c);
        }
    }

    private static final class d extends f0 {
        private final Map<String, n> H;
        private n I;

        private p7.f0 j0(p7.f0 f0Var) {
            if (f0Var == null) {
                return null;
            }
            int iE = f0Var.e();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= iE) {
                    i12 = -1;
                    break;
                }
                p7.f0.a aVarD = f0Var.d(i12);
                if ((aVarD instanceof m) && "com.apple.streaming.transportStreamTimestamp".equals(((m) aVarD).f85436b)) {
                    break;
                }
                i12++;
            }
            if (i12 == -1) {
                return f0Var;
            }
            if (iE == 1) {
                return null;
            }
            p7.f0.a[] aVarArr = new p7.f0.a[iE - 1];
            while (i11 < iE) {
                if (i11 != i12) {
                    aVarArr[i11 < i12 ? i11 : i11 - 1] = f0Var.d(i11);
                }
                i11++;
            }
            return new p7.f0(aVarArr);
        }

        @Override // androidx.media3.exoplayer.source.f0, w8.o0
        public void b(long j11, int i11, int i12, int i13, o0.a aVar) {
            super.b(j11, i11, i12, i13, aVar);
        }

        public void k0(n nVar) {
            this.I = nVar;
            L();
        }

        public void l0(e eVar) {
            h0(eVar.f9981k);
        }

        @Override // androidx.media3.exoplayer.source.f0
        public u z(u uVar) {
            n nVar;
            n nVar2 = this.I;
            if (nVar2 == null) {
                nVar2 = uVar.f101548s;
            }
            if (nVar2 != null && (nVar = this.H.get(nVar2.f101432c)) != null) {
                nVar2 = nVar;
            }
            p7.f0 f0VarJ0 = j0(uVar.f101541l);
            if (nVar2 != uVar.f101548s || f0VarJ0 != uVar.f101541l) {
                uVar = uVar.b().c0(nVar2).r0(f0VarJ0).P();
            }
            return super.z(uVar);
        }

        private d(s8.b bVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.drm.h.a aVar, Map<String, n> map) {
            super(bVar, iVar, aVar);
            this.H = map;
        }
    }

    public l(String str, int i11, b bVar, androidx.media3.exoplayer.hls.c cVar, Map<String, n> map, s8.b bVar2, long j11, u uVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.drm.h.a aVar, androidx.media3.exoplayer.upstream.b bVar3, s.a aVar2, int i12) {
        this.f10031a = str;
        this.f10032b = i11;
        this.f10033c = bVar;
        this.f10034d = cVar;
        this.f10050t = map;
        this.f10035e = bVar2;
        this.f10036f = uVar;
        this.f10037g = iVar;
        this.f10038h = aVar;
        this.f10039i = bVar3;
        this.f10041k = aVar2;
        this.f10042l = i12;
        Set<Integer> set = Y;
        this.f10054x = new HashSet(set.size());
        this.f10055y = new SparseIntArray(set.size());
        this.f10052v = new d[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList<e> arrayList = new ArrayList<>();
        this.f10044n = arrayList;
        this.f10045o = Collections.unmodifiableList(arrayList);
        this.f10049s = new ArrayList<>();
        this.f10046p = new Runnable() { // from class: androidx.media3.exoplayer.hls.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f10029a.W();
            }
        };
        this.f10047q = new Runnable() { // from class: androidx.media3.exoplayer.hls.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f10030a.g0();
            }
        };
        this.f10048r = q0.C();
        this.P = j11;
        this.Q = j11;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    private void B() {
        u uVar;
        int length = this.f10052v.length;
        int i11 = -2;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int i14 = 2;
            if (i13 >= length) {
                break;
            }
            String str = ((u) s7.a.j(this.f10052v[i13].I())).f101544o;
            if (!p7.g0.t(str)) {
                i14 = p7.g0.o(str) ? 1 : p7.g0.s(str) ? 3 : -2;
            }
            if (O(i14) > O(i11)) {
                i12 = i13;
                i11 = i14;
            } else if (i14 == i11 && i12 != -1) {
                i12 = -1;
            }
            i13++;
        }
        t0 t0VarL = this.f10034d.l();
        int i15 = t0VarL.f101499a;
        this.L = -1;
        this.K = new int[length];
        for (int i16 = 0; i16 < length; i16++) {
            this.K[i16] = i16;
        }
        t0[] t0VarArr = new t0[length];
        int i17 = 0;
        while (i17 < length) {
            u uVar2 = (u) s7.a.j(this.f10052v[i17].I());
            if (i17 == i12) {
                u[] uVarArr = new u[i15];
                for (int i18 = 0; i18 < i15; i18++) {
                    u uVarC = t0VarL.c(i18);
                    if (i11 == 1 && (uVar = this.f10036f) != null) {
                        uVarC = uVarC.m(uVar);
                    }
                    uVarArr[i18] = i15 == 1 ? uVar2.m(uVarC) : H(uVarC, uVar2, true);
                }
                t0VarArr[i17] = new t0(this.f10031a, uVarArr);
                this.L = i17;
            } else {
                u uVar3 = (i11 == 2 && p7.g0.o(uVar2.f101544o)) ? this.f10036f : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f10031a);
                sb2.append(":muxed:");
                sb2.append(i17 < i12 ? i17 : i17 - 1);
                t0VarArr[i17] = new t0(sb2.toString(), H(uVar3, uVar2, false));
            }
            i17++;
        }
        this.I = G(t0VarArr);
        s7.a.h(this.J == null);
        this.J = Collections.EMPTY_SET;
    }

    private boolean C(int i11) {
        for (int i12 = i11; i12 < this.f10044n.size(); i12++) {
            if (this.f10044n.get(i12).x()) {
                return false;
            }
        }
        e eVar = this.f10044n.get(i11);
        for (int i13 = 0; i13 < this.f10052v.length; i13++) {
            if (this.f10052v[i13].F() > eVar.n(i13)) {
                return false;
            }
        }
        return true;
    }

    private static w8.n E(int i11, int i12) {
        t.i("HlsSampleStreamWrapper", "Unmapped track with id " + i11 + " of type " + i12);
        return new w8.n();
    }

    private f0 F(int i11, int i12) {
        int length = this.f10052v.length;
        boolean z11 = true;
        if (i12 != 1 && i12 != 2) {
            z11 = false;
        }
        d dVar = new d(this.f10035e, this.f10037g, this.f10038h, this.f10050t);
        dVar.d0(this.P);
        if (z11) {
            dVar.k0(this.W);
        }
        dVar.c0(this.V);
        e eVar = this.X;
        if (eVar != null) {
            dVar.l0(eVar);
        }
        dVar.f0(this);
        int i13 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f10053w, i13);
        this.f10053w = iArrCopyOf;
        iArrCopyOf[length] = i11;
        this.f10052v = (d[]) q0.f1(this.f10052v, dVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.O, i13);
        this.O = zArrCopyOf;
        zArrCopyOf[length] = z11;
        this.M |= z11;
        this.f10054x.add(Integer.valueOf(i12));
        this.f10055y.append(i12, length);
        if (O(i12) > O(this.A)) {
            this.B = length;
            this.A = i12;
        }
        this.N = Arrays.copyOf(this.N, i13);
        return dVar;
    }

    private y G(t0[] t0VarArr) {
        for (int i11 = 0; i11 < t0VarArr.length; i11++) {
            t0 t0Var = t0VarArr[i11];
            u[] uVarArr = new u[t0Var.f101499a];
            for (int i12 = 0; i12 < t0Var.f101499a; i12++) {
                u uVarC = t0Var.c(i12);
                uVarArr[i12] = uVarC.c(this.f10037g.e(uVarC));
            }
            t0VarArr[i11] = new t0(t0Var.f101500b, uVarArr);
        }
        return new y(t0VarArr);
    }

    private static u H(u uVar, u uVar2, boolean z11) {
        String strD;
        String strG;
        if (uVar == null) {
            return uVar2;
        }
        int iK = p7.g0.k(uVar2.f101544o);
        if (q0.X(uVar.f101540k, iK) == 1) {
            strD = q0.Y(uVar.f101540k, iK);
            strG = p7.g0.g(strD);
        } else {
            strD = p7.g0.d(uVar.f101540k, uVar2.f101544o);
            strG = uVar2.f101544o;
        }
        u.b bVarU = uVar2.b().j0(uVar.f101530a).l0(uVar.f101531b).m0(uVar.f101532c).n0(uVar.f101533d).A0(uVar.f101534e).w0(uVar.f101535f).S(z11 ? uVar.f101537h : -1).t0(z11 ? uVar.f101538i : -1).U(strD);
        if (iK == 2) {
            bVarU.F0(uVar.f101551v).h0(uVar.f101552w).f0(uVar.f101555z);
        }
        if (strG != null) {
            bVarU.y0(strG);
        }
        int i11 = uVar.G;
        if (i11 != -1 && iK == 1) {
            bVarU.T(i11);
        }
        p7.f0 f0VarB = uVar.f101541l;
        if (f0VarB != null) {
            p7.f0 f0Var = uVar2.f101541l;
            if (f0Var != null) {
                f0VarB = f0Var.b(f0VarB);
            }
            bVarU.r0(f0VarB);
        }
        return bVarU.P();
    }

    private void I(int i11) {
        s7.a.h(!this.f10040j.j());
        while (true) {
            if (i11 >= this.f10044n.size()) {
                i11 = -1;
                break;
            } else if (C(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        long j11 = M().f101877h;
        e eVarJ = J(i11);
        if (this.f10044n.isEmpty()) {
            this.Q = this.P;
        } else {
            ((e) com.google.common.collect.c0.d(this.f10044n)).q();
        }
        this.T = false;
        this.f10041k.y(this.A, eVarJ.f101876g, j11);
    }

    private e J(int i11) {
        e eVar = this.f10044n.get(i11);
        ArrayList<e> arrayList = this.f10044n;
        q0.q1(arrayList, i11, arrayList.size());
        for (int i12 = 0; i12 < this.f10052v.length; i12++) {
            this.f10052v[i12].w(eVar.n(i12));
        }
        return eVar;
    }

    private boolean K(e eVar) {
        int i11 = eVar.f9981k;
        int length = this.f10052v.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.N[i12] && this.f10052v[i12].S() == i11) {
                return false;
            }
        }
        return true;
    }

    private static boolean L(u uVar, u uVar2) {
        String str = uVar.f101544o;
        String str2 = uVar2.f101544o;
        int iK = p7.g0.k(str);
        if (iK != 3) {
            return iK == p7.g0.k(str2);
        }
        if (Objects.equals(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || uVar.L == uVar2.L;
        }
        return false;
    }

    private e M() {
        ArrayList<e> arrayList = this.f10044n;
        return arrayList.get(arrayList.size() - 1);
    }

    private o0 N(int i11, int i12) {
        s7.a.a(Y.contains(Integer.valueOf(i12)));
        int i13 = this.f10055y.get(i12, -1);
        if (i13 == -1) {
            return null;
        }
        if (this.f10054x.add(Integer.valueOf(i12))) {
            this.f10053w[i13] = i11;
        }
        return this.f10053w[i13] == i11 ? this.f10052v[i13] : E(i11, i12);
    }

    private static int O(int i11) {
        if (i11 == 1) {
            return 2;
        }
        if (i11 != 2) {
            return i11 != 3 ? 0 : 1;
        }
        return 3;
    }

    private void P(e eVar) {
        this.X = eVar;
        this.F = eVar.f101873d;
        this.Q = -9223372036854775807L;
        this.f10044n.add(eVar);
        x.a aVarK = x.k();
        for (d dVar : this.f10052v) {
            aVarK.a(Integer.valueOf(dVar.J()));
        }
        eVar.p(this, aVarK.k());
        for (d dVar2 : this.f10052v) {
            dVar2.l0(eVar);
            if (eVar.x()) {
                dVar2.i0();
            }
        }
    }

    private static boolean Q(p8.e eVar) {
        return eVar instanceof e;
    }

    private boolean R() {
        return this.Q != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @RequiresNonNull({"trackGroups"})
    private void U() {
        int i11 = this.I.f93615a;
        int[] iArr = new int[i11];
        this.K = iArr;
        Arrays.fill(iArr, -1);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = 0;
            while (true) {
                d[] dVarArr = this.f10052v;
                if (i13 >= dVarArr.length) {
                    break;
                }
                if (L((u) s7.a.j(dVarArr[i13].I()), this.I.b(i12).c(0))) {
                    this.K[i12] = i13;
                    break;
                }
                i13++;
            }
        }
        Iterator<h> it = this.f10049s.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    private void V(e eVar) {
        if (this.f10044n.isEmpty()) {
            return;
        }
        if (!M().r()) {
            I(this.f10044n.size() - 1);
        }
        if (eVar.f9984n && eVar.x()) {
            for (int size = this.f10044n.size() - 1; size >= 0; size--) {
                long j11 = this.f10044n.get(size).f101876g;
                long j12 = eVar.f101876g;
                if (j11 < j12) {
                    return;
                }
                if (j11 == j12 && C(size)) {
                    I(size);
                    eVar.j();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        if (!this.H && this.K == null && this.C) {
            for (d dVar : this.f10052v) {
                if (dVar.I() == null) {
                    return;
                }
            }
            if (this.I != null) {
                U();
                return;
            }
            B();
            p0();
            this.f10033c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        this.C = true;
        W();
    }

    private void k0() {
        for (d dVar : this.f10052v) {
            dVar.Y(this.R);
        }
        this.R = false;
    }

    private boolean l0(long j11, e eVar) throws Throwable {
        boolean zB0;
        int length = this.f10052v.length;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= length) {
                return true;
            }
            d dVar = this.f10052v[i11];
            if (eVar != null) {
                zB0 = dVar.a0(eVar.n(i11));
            } else {
                long jF = f();
                if (jF != Long.MIN_VALUE && j11 >= jF) {
                    z11 = false;
                }
                zB0 = dVar.b0(j11, z11);
            }
            if (!zB0 && (this.O[i11] || !this.M)) {
                return false;
            }
            i11++;
        }
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    private void p0() {
        this.D = true;
    }

    private void u0(n8.s[] sVarArr) {
        this.f10049s.clear();
        for (n8.s sVar : sVarArr) {
            if (sVar != null) {
                this.f10049s.add((h) sVar);
            }
        }
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    private void z() {
        s7.a.h(this.D);
        s7.a.f(this.I);
        s7.a.f(this.J);
    }

    public int A(int i11) {
        z();
        s7.a.f(this.K);
        int i12 = this.K[i11];
        if (i12 == -1) {
            return this.J.contains(this.I.b(i11)) ? -3 : -2;
        }
        boolean[] zArr = this.N;
        if (zArr[i12]) {
            return -2;
        }
        zArr[i12] = true;
        return i12;
    }

    public void D() {
        if (this.D) {
            return;
        }
        l(new o1.b().f(this.P).d());
    }

    public boolean S(int i11) {
        return !R() && this.f10052v[i11].N(this.T);
    }

    public boolean T() {
        return this.A == 2;
    }

    public void X() {
        this.f10040j.a();
        this.f10034d.r();
    }

    public void Y(int i11) {
        X();
        this.f10052v[i11].P();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void s(p8.e eVar, long j11, long j12, boolean z11) {
        this.f10051u = null;
        n8.i iVar = new n8.i(eVar.f101870a, eVar.f101871b, eVar.f(), eVar.e(), j11, j12, eVar.c());
        this.f10039i.a(eVar.f101870a);
        this.f10041k.m(iVar, eVar.f101872c, this.f10032b, eVar.f101873d, eVar.f101874e, eVar.f101875f, eVar.f101876g, eVar.f101877h);
        if (z11) {
            return;
        }
        if (R() || this.E == 0) {
            k0();
        }
        if (this.E > 0) {
            this.f10033c.j(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.f0.d
    public void a(u uVar) {
        this.f10048r.post(this.f10046p);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void v(p8.e eVar, long j11, long j12) {
        this.f10051u = null;
        this.f10034d.t(eVar);
        n8.i iVar = new n8.i(eVar.f101870a, eVar.f101871b, eVar.f(), eVar.e(), j11, j12, eVar.c());
        this.f10039i.a(eVar.f101870a);
        this.f10041k.p(iVar, eVar.f101872c, this.f10032b, eVar.f101873d, eVar.f101874e, eVar.f101875f, eVar.f101876g, eVar.f101877h);
        if (this.D) {
            this.f10033c.j(this);
        } else {
            l(new o1.b().f(this.P).d());
        }
    }

    @Override // w8.r
    public o0 b(int i11, int i12) {
        o0 o0VarF;
        if (!Y.contains(Integer.valueOf(i12))) {
            int i13 = 0;
            while (true) {
                o0[] o0VarArr = this.f10052v;
                if (i13 >= o0VarArr.length) {
                    o0VarF = null;
                    break;
                }
                if (this.f10053w[i13] == i11) {
                    o0VarF = o0VarArr[i13];
                    break;
                }
                i13++;
            }
        } else {
            o0VarF = N(i11, i12);
        }
        if (o0VarF == null) {
            if (this.U) {
                return E(i11, i12);
            }
            o0VarF = F(i11, i12);
        }
        if (i12 != 5) {
            return o0VarF;
        }
        if (this.f10056z == null) {
            this.f10056z = new c(o0VarF, this.f10042l);
        }
        return this.f10056z;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public Loader.c p(p8.e eVar, long j11, long j12, IOException iOException, int i11) {
        Loader.c cVarH;
        int i12;
        boolean zQ = Q(eVar);
        if (zQ && !((e) eVar).r() && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i12 = ((HttpDataSource$InvalidResponseCodeException) iOException).f9128d) == 410 || i12 == 404)) {
            return Loader.f11135d;
        }
        long jC = eVar.c();
        n8.i iVar = new n8.i(eVar.f101870a, eVar.f101871b, eVar.f(), eVar.e(), j11, j12, jC);
        androidx.media3.exoplayer.upstream.b.c cVar = new androidx.media3.exoplayer.upstream.b.c(iVar, new n8.j(eVar.f101872c, this.f10032b, eVar.f101873d, eVar.f101874e, eVar.f101875f, q0.O1(eVar.f101876g), q0.O1(eVar.f101877h)), iOException, i11);
        androidx.media3.exoplayer.upstream.b.C0205b c0205bC = this.f10039i.c(z.c(this.f10034d.m()), cVar);
        boolean zQ2 = (c0205bC == null || c0205bC.f11160a != 2) ? false : this.f10034d.q(eVar, c0205bC.f11161b);
        if (zQ2) {
            if (zQ && jC == 0) {
                ArrayList<e> arrayList = this.f10044n;
                s7.a.h(arrayList.remove(arrayList.size() - 1) == eVar);
                if (this.f10044n.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((e) com.google.common.collect.c0.d(this.f10044n)).q();
                }
            }
            cVarH = Loader.f11137f;
        } else {
            long jD = this.f10039i.d(cVar);
            cVarH = jD != -9223372036854775807L ? Loader.h(false, jD) : Loader.f11138g;
        }
        Loader.c cVar2 = cVarH;
        boolean zC = cVar2.c();
        this.f10041k.r(iVar, eVar.f101872c, this.f10032b, eVar.f101873d, eVar.f101874e, eVar.f101875f, eVar.f101876g, eVar.f101877h, iOException, !zC);
        if (!zC) {
            this.f10051u = null;
            this.f10039i.a(eVar.f101870a);
        }
        if (zQ2) {
            if (!this.D) {
                l(new o1.b().f(this.P).d());
                return cVar2;
            }
            this.f10033c.j(this);
        }
        return cVar2;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public boolean c() {
        return this.f10040j.j();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void q(p8.e eVar, long j11, long j12, int i11) {
        this.f10041k.v(i11 == 0 ? new n8.i(eVar.f101870a, eVar.f101871b, j11) : new n8.i(eVar.f101870a, eVar.f101871b, eVar.f(), eVar.e(), j11, j12, eVar.c()), eVar.f101872c, this.f10032b, eVar.f101873d, eVar.f101874e, eVar.f101875f, eVar.f101876g, eVar.f101877h, i11);
    }

    @Override // androidx.media3.exoplayer.source.g0
    public long d() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.Q;
        }
        long jMax = this.P;
        e eVarM = M();
        if (!eVarM.h()) {
            if (this.f10044n.size() > 1) {
                ArrayList<e> arrayList = this.f10044n;
                eVarM = arrayList.get(arrayList.size() - 2);
            } else {
                eVarM = null;
            }
        }
        if (eVarM != null) {
            jMax = Math.max(jMax, eVarM.f101877h);
        }
        if (this.C) {
            for (d dVar : this.f10052v) {
                jMax = Math.max(jMax, dVar.C());
            }
        }
        return jMax;
    }

    public void d0() {
        this.f10054x.clear();
    }

    @Override // androidx.media3.exoplayer.source.g0
    public void e(long j11) {
        if (this.f10040j.i() || R()) {
            return;
        }
        if (this.f10040j.j()) {
            s7.a.f(this.f10051u);
            if (this.f10034d.z(j11, this.f10051u, this.f10045o)) {
                this.f10040j.f();
                return;
            }
            return;
        }
        int size = this.f10045o.size();
        while (size > 0 && this.f10034d.d(this.f10045o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f10045o.size()) {
            I(size);
        }
        int i11 = this.f10034d.i(j11, this.f10045o);
        if (i11 < this.f10044n.size()) {
            I(i11);
        }
    }

    public boolean e0(Uri uri, androidx.media3.exoplayer.upstream.b.c cVar, boolean z11) {
        androidx.media3.exoplayer.upstream.b.C0205b c0205bC;
        if (this.f10034d.s(uri)) {
            return this.f10034d.u(uri, (z11 || (c0205bC = this.f10039i.c(z.c(this.f10034d.m()), cVar)) == null || c0205bC.f11160a != 2) ? -9223372036854775807L : c0205bC.f11161b);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public long f() {
        if (R()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return M().f101877h;
    }

    public void f0() {
        if (this.f10044n.isEmpty()) {
            return;
        }
        final e eVar = (e) com.google.common.collect.c0.d(this.f10044n);
        int iD = this.f10034d.d(eVar);
        if (iD == 1) {
            if (eVar.r()) {
                return;
            }
            eVar.w(this.f10034d.j(eVar));
        } else if (iD == 0) {
            this.f10048r.post(new Runnable() { // from class: androidx.media3.exoplayer.hls.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10027a.f10033c.p(eVar.f9983m);
                }
            });
        } else if (iD == 2 && !this.T && this.f10040j.j()) {
            this.f10040j.f();
        }
    }

    public void h0(t0[] t0VarArr, int i11, int... iArr) {
        this.I = G(t0VarArr);
        this.J = new HashSet();
        for (int i12 : iArr) {
            this.J.add(this.I.b(i12));
        }
        this.L = i11;
        Handler handler = this.f10048r;
        final b bVar = this.f10033c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: f8.g
            @Override // java.lang.Runnable
            public final void run() {
                bVar.a();
            }
        });
        p0();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.f
    public void i() {
        for (d dVar : this.f10052v) {
            dVar.V();
        }
    }

    public int i0(int i11, z7.u uVar, DecoderInputBuffer decoderInputBuffer, int i12) {
        if (R()) {
            return -3;
        }
        int i13 = 0;
        if (!this.f10044n.isEmpty()) {
            int i14 = 0;
            while (i14 < this.f10044n.size() - 1 && K(this.f10044n.get(i14))) {
                i14++;
            }
            q0.q1(this.f10044n, 0, i14);
            e eVar = this.f10044n.get(0);
            u uVar2 = eVar.f101873d;
            if (!uVar2.equals(this.G)) {
                this.f10041k.j(this.f10032b, uVar2, eVar.f101874e, eVar.f101875f, eVar.f101876g);
            }
            this.G = uVar2;
        }
        if (!this.f10044n.isEmpty() && !this.f10044n.get(0).r()) {
            return -3;
        }
        int iU = this.f10052v[i11].U(uVar, decoderInputBuffer, i12, this.T);
        if (iU == -5) {
            u uVarM = (u) s7.a.f(uVar.f127112b);
            if (i11 == this.B) {
                int iE = ru.f.e(this.f10052v[i11].S());
                while (i13 < this.f10044n.size() && this.f10044n.get(i13).f9981k != iE) {
                    i13++;
                }
                uVarM = uVarM.m(i13 < this.f10044n.size() ? this.f10044n.get(i13).f101873d : (u) s7.a.f(this.F));
            }
            uVar.f127112b = uVarM;
        }
        return iU;
    }

    @Override // w8.r
    public void j() {
        this.U = true;
        this.f10048r.post(this.f10047q);
    }

    public void j0() {
        if (this.D) {
            for (d dVar : this.f10052v) {
                dVar.T();
            }
        }
        this.f10034d.v();
        this.f10040j.m(this);
        this.f10048r.removeCallbacksAndMessages(null);
        this.H = true;
        this.f10049s.clear();
    }

    public y k() {
        z();
        return this.I;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        List<e> list;
        long j11;
        long j12;
        if (this.T || this.f10040j.j() || this.f10040j.i()) {
            return false;
        }
        if (R()) {
            List<e> list2 = Collections.EMPTY_LIST;
            long j13 = this.Q;
            for (d dVar : this.f10052v) {
                dVar.d0(this.Q);
            }
            list = list2;
            j11 = j13;
            j12 = j11;
        } else {
            List<e> list3 = this.f10045o;
            e eVarM = M();
            long jO = (eVarM.h() && eVarM.r()) ? eVarM.o() : Math.max(this.P, eVarM.f101876g);
            long jMax = this.P;
            if (this.C) {
                for (d dVar2 : this.f10052v) {
                    jMax = Math.max(jMax, dVar2.D());
                }
            }
            list = list3;
            j11 = jO;
            j12 = jMax;
        }
        this.f10043m.a();
        this.f10034d.f(o1Var, j11, j12, list, this.D || !list.isEmpty(), this.f10043m);
        androidx.media3.exoplayer.hls.c.b bVar = this.f10043m;
        boolean z11 = bVar.f9969b;
        p8.e eVar = bVar.f9968a;
        Uri uri = bVar.f9970c;
        if (z11) {
            this.Q = -9223372036854775807L;
            this.T = true;
            return true;
        }
        if (eVar == null) {
            if (uri != null) {
                this.f10033c.p(uri);
            }
            return false;
        }
        if (Q(eVar)) {
            e eVar2 = (e) eVar;
            V(eVar2);
            P(eVar2);
        }
        this.f10051u = eVar;
        this.f10040j.n(eVar, this, this.f10039i.b(eVar.f101872c));
        return true;
    }

    public long m(long j11, b0 b0Var) {
        return this.f10034d.c(j11, b0Var);
    }

    public boolean m0(long j11, boolean z11) {
        e eVar;
        this.P = j11;
        if (R()) {
            this.Q = j11;
            return true;
        }
        if (!this.f10034d.n()) {
            eVar = null;
            break;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f10044n.size()) {
                eVar = null;
                break;
            }
            eVar = this.f10044n.get(i11);
            if (eVar.f101876g == j11) {
                break;
            }
            i11++;
        }
        if (this.C && !z11 && !this.f10044n.isEmpty() && l0(j11, eVar)) {
            return false;
        }
        this.Q = j11;
        this.T = false;
        this.f10044n.clear();
        if (this.f10040j.j()) {
            if (this.C) {
                for (d dVar : this.f10052v) {
                    dVar.s();
                }
            }
            this.f10040j.f();
        } else {
            this.f10040j.g();
            k0();
        }
        return true;
    }

    public void n() throws ParserException {
        X();
        if (this.T && !this.D) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0114  */
    public boolean n0(r8.t[] tVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j11, boolean z11) {
        boolean z12;
        z();
        int i11 = this.E;
        int i12 = 0;
        for (int i13 = 0; i13 < tVarArr.length; i13++) {
            h hVar = (h) sVarArr[i13];
            if (hVar != null && (tVarArr[i13] == null || !zArr[i13])) {
                this.E--;
                hVar.e();
                sVarArr[i13] = null;
            }
        }
        boolean z13 = z11 || (!this.S ? j11 == this.P : i11 != 0);
        r8.t tVarM = this.f10034d.m();
        boolean z14 = z13;
        r8.t tVar = tVarM;
        for (int i14 = 0; i14 < tVarArr.length; i14++) {
            r8.t tVar2 = tVarArr[i14];
            if (tVar2 != null) {
                int iD = this.I.d(tVar2.e());
                if (iD == this.L) {
                    this.f10034d.y(tVar2);
                    tVar = tVar2;
                }
                if (sVarArr[i14] == null) {
                    this.E++;
                    h hVar2 = new h(this, iD);
                    sVarArr[i14] = hVar2;
                    zArr2[i14] = true;
                    if (this.K != null) {
                        hVar2.c();
                        if (!z14) {
                            d dVar = this.f10052v[this.K[iD]];
                            z14 = (dVar.F() == 0 || dVar.b0(j11, true)) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.E == 0) {
            this.f10034d.v();
            this.G = null;
            this.R = true;
            this.f10044n.clear();
            if (this.f10040j.j()) {
                if (this.C) {
                    d[] dVarArr = this.f10052v;
                    int length = dVarArr.length;
                    while (i12 < length) {
                        dVarArr[i12].s();
                        i12++;
                    }
                }
                this.f10040j.f();
            } else {
                k0();
            }
        } else {
            if (this.f10044n.isEmpty() || Objects.equals(tVar, tVarM)) {
                z12 = z11;
            } else {
                if (!this.S) {
                    long j12 = j11 < 0 ? -j11 : 0L;
                    e eVarM = M();
                    r8.t tVar3 = tVar;
                    tVar3.m(j11, j12, -9223372036854775807L, this.f10045o, this.f10034d.a(eVarM, j11));
                    if (tVar3.p() == this.f10034d.l().d(eVarM.f101873d)) {
                        z12 = z11;
                    }
                }
                this.R = true;
                z12 = true;
                z14 = true;
            }
            if (z14) {
                m0(j11, z12);
                while (i12 < sVarArr.length) {
                    if (sVarArr[i12] != null) {
                        zArr2[i12] = true;
                    }
                    i12++;
                }
            }
        }
        u0(sVarArr);
        this.S = true;
        return z14;
    }

    public void o(long j11, boolean z11) {
        if (!this.C || R()) {
            return;
        }
        int length = this.f10052v.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f10052v[i11].r(j11, z11, this.N[i11]);
        }
    }

    public void o0(n nVar) {
        if (Objects.equals(this.W, nVar)) {
            return;
        }
        this.W = nVar;
        int i11 = 0;
        while (true) {
            d[] dVarArr = this.f10052v;
            if (i11 >= dVarArr.length) {
                return;
            }
            if (this.O[i11]) {
                dVarArr[i11].k0(nVar);
            }
            i11++;
        }
    }

    public void q0(boolean z11) {
        this.f10034d.x(z11);
    }

    public void r0(long j11) {
        if (this.V != j11) {
            this.V = j11;
            for (d dVar : this.f10052v) {
                dVar.c0(j11);
            }
        }
    }

    public int s0(int i11, long j11) throws Throwable {
        if (R()) {
            return 0;
        }
        d dVar = this.f10052v[i11];
        int iH = dVar.H(j11, this.T);
        e eVar = (e) com.google.common.collect.c0.e(this.f10044n, null);
        if (eVar != null && !eVar.r()) {
            iH = Math.min(iH, eVar.n(i11) - dVar.F());
        }
        dVar.g0(iH);
        return iH;
    }

    public void t0(int i11) {
        z();
        s7.a.f(this.K);
        int i12 = this.K[i11];
        s7.a.h(this.N[i12]);
        this.N[i12] = false;
    }

    @Override // w8.r
    public void t(j0 j0Var) {
    }
}
