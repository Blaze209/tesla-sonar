package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media3.common.PlaybackException;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class ne {
    public static final ne F;
    private static final String G;
    private static final String H;
    private static final String I;
    private static final String J;
    private static final String K;
    private static final String L;
    private static final String M;
    private static final String N;
    private static final String O;
    private static final String P;
    private static final String Q;
    private static final String R;
    private static final String S;
    private static final String T;
    private static final String U;
    private static final String V;
    private static final String W;
    private static final String X;
    static final String Y;
    private static final String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final String f12008a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final String f12009b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f12010c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f12011d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f12012e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    static final String f12013f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    static final String f12014g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    static final String f12015h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final String f12016i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final String f12017j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final String f12018k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f12019l0;
    public final long A;
    public final long B;
    public final long C;
    public final p7.a1 D;
    public final p7.w0 E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlaybackException f12020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue f12022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p7.j0.e f12023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p7.j0.e f12024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p7.i0 f12026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f12028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p7.r0 f12029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p7.e1 f12031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p7.e0 f12032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f12033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p7.d f12034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r7.e f12035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p7.m f12036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f12037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f12039t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f12040u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f12041v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f12042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12043x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f12044y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p7.e0 f12045z;

    public static class b {
        private long A;
        private long B;
        private long C;
        private p7.a1 D;
        private p7.w0 E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PlaybackException f12046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ue f12048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p7.j0.e f12049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p7.j0.e f12050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f12051f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p7.i0 f12052g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f12053h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f12054i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private p7.r0 f12055j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f12056k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private p7.e1 f12057l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private p7.e0 f12058m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f12059n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private p7.d f12060o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private r7.e f12061p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private p7.m f12062q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f12063r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f12064s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f12065t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f12066u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f12067v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private boolean f12068w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f12069x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f12070y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private p7.e0 f12071z;

        public b(ne neVar) {
            this.f12046a = neVar.f12020a;
            this.f12047b = neVar.f12021b;
            this.f12048c = neVar.f12022c;
            this.f12049d = neVar.f12023d;
            this.f12050e = neVar.f12024e;
            this.f12051f = neVar.f12025f;
            this.f12052g = neVar.f12026g;
            this.f12053h = neVar.f12027h;
            this.f12054i = neVar.f12028i;
            this.f12055j = neVar.f12029j;
            this.f12056k = neVar.f12030k;
            this.f12057l = neVar.f12031l;
            this.f12058m = neVar.f12032m;
            this.f12059n = neVar.f12033n;
            this.f12060o = neVar.f12034o;
            this.f12061p = neVar.f12035p;
            this.f12062q = neVar.f12036q;
            this.f12063r = neVar.f12037r;
            this.f12064s = neVar.f12038s;
            this.f12065t = neVar.f12039t;
            this.f12066u = neVar.f12040u;
            this.f12067v = neVar.f12041v;
            this.f12068w = neVar.f12042w;
            this.f12069x = neVar.f12043x;
            this.f12070y = neVar.f12044y;
            this.f12071z = neVar.f12045z;
            this.A = neVar.A;
            this.B = neVar.B;
            this.C = neVar.C;
            this.D = neVar.D;
            this.E = neVar.E;
        }

        public b A(boolean z11) {
            this.f12054i = z11;
            return this;
        }

        public b B(p7.r0 r0Var) {
            this.f12055j = r0Var;
            return this;
        }

        public b C(int i11) {
            this.f12056k = i11;
            return this;
        }

        public b D(p7.w0 w0Var) {
            this.E = w0Var;
            return this;
        }

        public b E(p7.e1 e1Var) {
            this.f12057l = e1Var;
            return this;
        }

        public b F(float f11) {
            this.f12059n = f11;
            return this;
        }

        public ne a() {
            s7.a.h(this.f12055j.u() || this.f12048c.f12456a.f101397c < this.f12055j.t());
            return new ne(this.f12046a, this.f12047b, this.f12048c, this.f12049d, this.f12050e, this.f12051f, this.f12052g, this.f12053h, this.f12054i, this.f12057l, this.f12055j, this.f12056k, this.f12058m, this.f12059n, this.f12060o, this.f12061p, this.f12062q, this.f12063r, this.f12064s, this.f12065t, this.f12066u, this.f12069x, this.f12070y, this.f12067v, this.f12068w, this.f12071z, this.A, this.B, this.C, this.D, this.E);
        }

        public b b(p7.d dVar) {
            this.f12060o = dVar;
            return this;
        }

        public b c(r7.e eVar) {
            this.f12061p = eVar;
            return this;
        }

        public b d(p7.a1 a1Var) {
            this.D = a1Var;
            return this;
        }

        public b e(p7.m mVar) {
            this.f12062q = mVar;
            return this;
        }

        public b f(boolean z11) {
            this.f12064s = z11;
            return this;
        }

        public b g(int i11) {
            this.f12063r = i11;
            return this;
        }

        public b h(int i11) {
            this.f12051f = i11;
            return this;
        }

        public b i(boolean z11) {
            this.f12068w = z11;
            return this;
        }

        public b j(boolean z11) {
            this.f12067v = z11;
            return this;
        }

        public b k(long j11) {
            this.C = j11;
            return this;
        }

        public b l(int i11) {
            this.f12047b = i11;
            return this;
        }

        public b m(p7.e0 e0Var) {
            this.f12071z = e0Var;
            return this;
        }

        public b n(p7.j0.e eVar) {
            this.f12050e = eVar;
            return this;
        }

        public b o(p7.j0.e eVar) {
            this.f12049d = eVar;
            return this;
        }

        public b p(boolean z11) {
            this.f12065t = z11;
            return this;
        }

        public b q(int i11) {
            this.f12066u = i11;
            return this;
        }

        public b r(p7.i0 i0Var) {
            this.f12052g = i0Var;
            return this;
        }

        public b s(int i11) {
            this.f12070y = i11;
            return this;
        }

        public b t(int i11) {
            this.f12069x = i11;
            return this;
        }

        public b u(PlaybackException playbackException) {
            this.f12046a = playbackException;
            return this;
        }

        public b v(p7.e0 e0Var) {
            this.f12058m = e0Var;
            return this;
        }

        public b w(int i11) {
            this.f12053h = i11;
            return this;
        }

        public b x(long j11) {
            this.A = j11;
            return this;
        }

        public b y(long j11) {
            this.B = j11;
            return this;
        }

        public b z(ue ueVar) {
            this.f12048c = ueVar;
            return this;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f12072c = new c(false, false);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f12073d = s7.q0.N0(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f12074e = s7.q0.N0(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f12075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f12076b;

        public c(boolean z11, boolean z12) {
            this.f12075a = z11;
            this.f12076b = z12;
        }

        public static c a(Bundle bundle) {
            return new c(bundle.getBoolean(f12073d, false), bundle.getBoolean(f12074e, false));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(f12073d, this.f12075a);
            bundle.putBoolean(f12074e, this.f12076b);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f12075a == cVar.f12075a && this.f12076b == cVar.f12076b;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(this.f12075a), Boolean.valueOf(this.f12076b));
        }
    }

    private final class d extends Binder {
        private d() {
        }

        public ne a() {
            return ne.this;
        }
    }

    static {
        ue ueVar = ue.f12445l;
        p7.j0.e eVar = ue.f12444k;
        p7.i0 i0Var = p7.i0.f101376d;
        p7.e1 e1Var = p7.e1.f101328e;
        p7.r0 r0Var = p7.r0.f101451a;
        p7.e0 e0Var = p7.e0.K;
        F = new ne(null, 0, ueVar, eVar, eVar, 0, i0Var, 0, false, e1Var, r0Var, 0, e0Var, 1.0f, p7.d.f101231h, r7.e.f107103d, p7.m.f101411e, 0, false, false, 1, 0, 1, false, false, e0Var, DeviceOrientationRequest.OUTPUT_PERIOD_FAST, 15000L, 3000L, p7.a1.f101183b, p7.w0.F);
        G = s7.q0.N0(1);
        H = s7.q0.N0(2);
        I = s7.q0.N0(3);
        J = s7.q0.N0(4);
        K = s7.q0.N0(5);
        L = s7.q0.N0(6);
        M = s7.q0.N0(7);
        N = s7.q0.N0(8);
        O = s7.q0.N0(9);
        P = s7.q0.N0(10);
        Q = s7.q0.N0(11);
        R = s7.q0.N0(12);
        S = s7.q0.N0(13);
        T = s7.q0.N0(14);
        U = s7.q0.N0(15);
        V = s7.q0.N0(16);
        W = s7.q0.N0(17);
        X = s7.q0.N0(18);
        Y = s7.q0.N0(19);
        Z = s7.q0.N0(20);
        f12008a0 = s7.q0.N0(21);
        f12009b0 = s7.q0.N0(22);
        f12010c0 = s7.q0.N0(23);
        f12011d0 = s7.q0.N0(24);
        f12012e0 = s7.q0.N0(25);
        f12013f0 = s7.q0.N0(26);
        f12014g0 = s7.q0.N0(27);
        f12015h0 = s7.q0.N0(28);
        f12016i0 = s7.q0.N0(29);
        f12017j0 = s7.q0.N0(30);
        f12018k0 = s7.q0.N0(31);
        f12019l0 = s7.q0.N0(32);
    }

    public ne(PlaybackException playbackException, int i11, ue ueVar, p7.j0.e eVar, p7.j0.e eVar2, int i12, p7.i0 i0Var, int i13, boolean z11, p7.e1 e1Var, p7.r0 r0Var, int i14, p7.e0 e0Var, float f11, p7.d dVar, r7.e eVar3, p7.m mVar, int i15, boolean z12, boolean z13, int i16, int i17, int i18, boolean z14, boolean z15, p7.e0 e0Var2, long j11, long j12, long j13, p7.a1 a1Var, p7.w0 w0Var) {
        this.f12020a = playbackException;
        this.f12021b = i11;
        this.f12022c = ueVar;
        this.f12023d = eVar;
        this.f12024e = eVar2;
        this.f12025f = i12;
        this.f12026g = i0Var;
        this.f12027h = i13;
        this.f12028i = z11;
        this.f12031l = e1Var;
        this.f12029j = r0Var;
        this.f12030k = i14;
        this.f12032m = e0Var;
        this.f12033n = f11;
        this.f12034o = dVar;
        this.f12035p = eVar3;
        this.f12036q = mVar;
        this.f12037r = i15;
        this.f12038s = z12;
        this.f12039t = z13;
        this.f12040u = i16;
        this.f12043x = i17;
        this.f12044y = i18;
        this.f12041v = z14;
        this.f12042w = z15;
        this.f12045z = e0Var2;
        this.A = j11;
        this.B = j12;
        this.C = j13;
        this.D = a1Var;
        this.E = w0Var;
    }

    public static ne B(Bundle bundle, int i11) {
        IBinder binder = bundle.getBinder(f12019l0);
        if (binder instanceof d) {
            return ((d) binder).a();
        }
        Bundle bundle2 = bundle.getBundle(X);
        PlaybackException playbackExceptionD = bundle2 == null ? null : PlaybackException.d(bundle2);
        int i12 = bundle.getInt(Z, 0);
        Bundle bundle3 = bundle.getBundle(Y);
        ue ueVarB = bundle3 == null ? ue.f12445l : ue.b(bundle3);
        Bundle bundle4 = bundle.getBundle(f12008a0);
        p7.j0.e eVarC = bundle4 == null ? ue.f12444k : p7.j0.e.c(bundle4);
        Bundle bundle5 = bundle.getBundle(f12009b0);
        p7.j0.e eVarC2 = bundle5 == null ? ue.f12444k : p7.j0.e.c(bundle5);
        int i13 = bundle.getInt(f12010c0, 0);
        Bundle bundle6 = bundle.getBundle(G);
        p7.i0 i0VarA = bundle6 == null ? p7.i0.f101376d : p7.i0.a(bundle6);
        int i14 = bundle.getInt(H, 0);
        boolean z11 = bundle.getBoolean(I, false);
        Bundle bundle7 = bundle.getBundle(J);
        p7.r0 r0VarB = bundle7 == null ? p7.r0.f101451a : p7.r0.b(bundle7);
        int i15 = bundle.getInt(f12018k0, 0);
        Bundle bundle8 = bundle.getBundle(K);
        p7.e1 e1VarA = bundle8 == null ? p7.e1.f101328e : p7.e1.a(bundle8);
        Bundle bundle9 = bundle.getBundle(L);
        p7.e0 e0VarB = bundle9 == null ? p7.e0.K : p7.e0.b(bundle9);
        float f11 = bundle.getFloat(M, 1.0f);
        Bundle bundle10 = bundle.getBundle(N);
        p7.d dVarA = bundle10 == null ? p7.d.f101231h : p7.d.a(bundle10);
        Bundle bundle11 = bundle.getBundle(f12011d0);
        r7.e eVarC3 = bundle11 == null ? r7.e.f107103d : r7.e.c(bundle11);
        Bundle bundle12 = bundle.getBundle(O);
        p7.m mVarA = bundle12 == null ? p7.m.f101411e : p7.m.a(bundle12);
        int i16 = bundle.getInt(P, 0);
        boolean z12 = bundle.getBoolean(Q, false);
        boolean z13 = bundle.getBoolean(R, false);
        int i17 = bundle.getInt(S, 1);
        int i18 = bundle.getInt(T, 0);
        int i19 = bundle.getInt(U, 1);
        boolean z14 = bundle.getBoolean(V, false);
        boolean z15 = bundle.getBoolean(W, false);
        Bundle bundle13 = bundle.getBundle(f12012e0);
        p7.e0 e0VarB2 = bundle13 == null ? p7.e0.K : p7.e0.b(bundle13);
        long j11 = bundle.getLong(f12013f0, i11 < 4 ? 0L : 5000L);
        long j12 = bundle.getLong(f12014g0, i11 < 4 ? 0L : 15000L);
        long j13 = bundle.getLong(f12015h0, i11 >= 4 ? 3000L : 0L);
        Bundle bundle14 = bundle.getBundle(f12017j0);
        p7.a1 a1VarA = bundle14 == null ? p7.a1.f101183b : p7.a1.a(bundle14);
        Bundle bundle15 = bundle.getBundle(f12016i0);
        return new ne(playbackExceptionD, i12, ueVarB, eVarC, eVarC2, i13, i0VarA, i14, z11, e1VarA, r0VarB, i15, e0VarB, f11, dVarA, eVarC3, mVarA, i16, z12, z13, i17, i18, i19, z14, z15, e0VarB2, j11, j12, j13, a1VarA, bundle15 == null ? p7.w0.F : p7.w0.J(bundle15));
    }

    private boolean D(int i11, boolean z11, int i12) {
        return i11 == 3 && z11 && i12 == 0;
    }

    public ne A(p7.j0.b bVar, boolean z11, boolean z12) {
        b bVar2 = new b(this);
        boolean zC = bVar.c(16);
        boolean zC2 = bVar.c(17);
        bVar2.z(this.f12022c.a(zC, zC2));
        bVar2.o(this.f12023d.b(zC, zC2));
        bVar2.n(this.f12024e.b(zC, zC2));
        if (!zC2 && zC && !this.f12029j.u()) {
            bVar2.B(this.f12029j.a(this.f12022c.f12456a.f101397c));
        } else if (z11 || !zC2) {
            bVar2.B(p7.r0.f101451a);
        }
        if (!bVar.c(18)) {
            bVar2.v(p7.e0.K);
        }
        if (!bVar.c(22)) {
            bVar2.F(1.0f);
        }
        if (!bVar.c(21)) {
            bVar2.b(p7.d.f101231h);
        }
        if (!bVar.c(28)) {
            bVar2.c(r7.e.f107103d);
        }
        if (!bVar.c(23)) {
            bVar2.g(0).f(false);
        }
        if (!bVar.c(18)) {
            bVar2.m(p7.e0.K);
        }
        if (z12 || !bVar.c(30)) {
            bVar2.d(p7.a1.f101183b);
        }
        return bVar2.a();
    }

    public p7.y C() {
        if (this.f12029j.u()) {
            return null;
        }
        return this.f12029j.r(this.f12022c.f12456a.f101397c, new p7.r0.d()).f101483c;
    }

    public Bundle E(int i11) {
        Bundle bundle = new Bundle();
        PlaybackException playbackException = this.f12020a;
        if (playbackException != null) {
            bundle.putBundle(X, playbackException.i());
        }
        int i12 = this.f12021b;
        if (i12 != 0) {
            bundle.putInt(Z, i12);
        }
        if (i11 < 3 || !this.f12022c.equals(ue.f12445l)) {
            bundle.putBundle(Y, this.f12022c.c(i11));
        }
        if (i11 < 3 || !ue.f12444k.a(this.f12023d)) {
            bundle.putBundle(f12008a0, this.f12023d.d(i11));
        }
        if (i11 < 3 || !ue.f12444k.a(this.f12024e)) {
            bundle.putBundle(f12009b0, this.f12024e.d(i11));
        }
        int i13 = this.f12025f;
        if (i13 != 0) {
            bundle.putInt(f12010c0, i13);
        }
        if (!this.f12026g.equals(p7.i0.f101376d)) {
            bundle.putBundle(G, this.f12026g.c());
        }
        int i14 = this.f12027h;
        if (i14 != 0) {
            bundle.putInt(H, i14);
        }
        boolean z11 = this.f12028i;
        if (z11) {
            bundle.putBoolean(I, z11);
        }
        if (!this.f12029j.equals(p7.r0.f101451a)) {
            bundle.putBundle(J, this.f12029j.w());
        }
        int i15 = this.f12030k;
        if (i15 != 0) {
            bundle.putInt(f12018k0, i15);
        }
        if (!this.f12031l.equals(p7.e1.f101328e)) {
            bundle.putBundle(K, this.f12031l.b());
        }
        p7.e0 e0Var = this.f12032m;
        p7.e0 e0Var2 = p7.e0.K;
        if (!e0Var.equals(e0Var2)) {
            bundle.putBundle(L, this.f12032m.e());
        }
        float f11 = this.f12033n;
        if (f11 != 1.0f) {
            bundle.putFloat(M, f11);
        }
        if (!this.f12034o.equals(p7.d.f101231h)) {
            bundle.putBundle(N, this.f12034o.d());
        }
        if (!this.f12035p.equals(r7.e.f107103d)) {
            bundle.putBundle(f12011d0, this.f12035p.d());
        }
        if (!this.f12036q.equals(p7.m.f101411e)) {
            bundle.putBundle(O, this.f12036q.b());
        }
        int i16 = this.f12037r;
        if (i16 != 0) {
            bundle.putInt(P, i16);
        }
        boolean z12 = this.f12038s;
        if (z12) {
            bundle.putBoolean(Q, z12);
        }
        boolean z13 = this.f12039t;
        if (z13) {
            bundle.putBoolean(R, z13);
        }
        int i17 = this.f12040u;
        if (i17 != 1) {
            bundle.putInt(S, i17);
        }
        int i18 = this.f12043x;
        if (i18 != 0) {
            bundle.putInt(T, i18);
        }
        int i19 = this.f12044y;
        if (i19 != 1) {
            bundle.putInt(U, i19);
        }
        boolean z14 = this.f12041v;
        if (z14) {
            bundle.putBoolean(V, z14);
        }
        boolean z15 = this.f12042w;
        if (z15) {
            bundle.putBoolean(W, z15);
        }
        if (!this.f12045z.equals(e0Var2)) {
            bundle.putBundle(f12012e0, this.f12045z.e());
        }
        long j11 = i11 < 6 ? 0L : DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        long j12 = this.A;
        if (j12 != j11) {
            bundle.putLong(f12013f0, j12);
        }
        long j13 = i11 < 6 ? 0L : 15000L;
        long j14 = this.B;
        if (j14 != j13) {
            bundle.putLong(f12014g0, j14);
        }
        long j15 = i11 >= 6 ? 3000L : 0L;
        long j16 = this.C;
        if (j16 != j15) {
            bundle.putLong(f12015h0, j16);
        }
        if (!this.D.equals(p7.a1.f101183b)) {
            bundle.putBundle(f12017j0, this.D.g());
        }
        if (!this.E.equals(p7.w0.F)) {
            bundle.putBundle(f12016i0, this.E.K());
        }
        return bundle;
    }

    public Bundle F() {
        Bundle bundle = new Bundle();
        bundle.putBinder(f12019l0, new d());
        return bundle;
    }

    public ne a(p7.d dVar) {
        return new b(this).b(dVar).a();
    }

    public ne b(p7.a1 a1Var) {
        return new b(this).d(a1Var).a();
    }

    public ne c(p7.m mVar) {
        return new b(this).e(mVar).a();
    }

    public ne d(int i11, boolean z11) {
        return new b(this).g(i11).f(z11).a();
    }

    public ne e(boolean z11) {
        return new b(this).i(z11).a();
    }

    public ne f(boolean z11) {
        return new b(this).j(z11).a();
    }

    public ne g(long j11) {
        return new b(this).k(j11).a();
    }

    public ne h(int i11) {
        return new b(this).l(i11).a();
    }

    public ne i(p7.e0 e0Var) {
        return new b(this).m(e0Var).a();
    }

    public ne j(boolean z11, int i11, int i12) {
        return new b(this).p(z11).q(i11).t(i12).j(D(this.f12044y, z11, i12)).a();
    }

    public ne k(p7.i0 i0Var) {
        return new b(this).r(i0Var).a();
    }

    public ne l(int i11, PlaybackException playbackException) {
        return new b(this).u(playbackException).s(i11).j(D(i11, this.f12039t, this.f12043x)).a();
    }

    public ne m(PlaybackException playbackException) {
        return new b(this).u(playbackException).a();
    }

    public ne n(p7.e0 e0Var) {
        return new b(this).v(e0Var).a();
    }

    public ne o(p7.j0.e eVar, p7.j0.e eVar2, int i11) {
        return new b(this).o(eVar).n(eVar2).h(i11).a();
    }

    public ne p(int i11) {
        return new b(this).w(i11).a();
    }

    public ne q(long j11) {
        return new b(this).x(j11).a();
    }

    public ne r(long j11) {
        return new b(this).y(j11).a();
    }

    public ne s(ue ueVar) {
        return new b(this).z(ueVar).a();
    }

    public ne t(boolean z11) {
        return new b(this).A(z11).a();
    }

    public ne u(p7.r0 r0Var) {
        return new b(this).B(r0Var).a();
    }

    public ne v(p7.r0 r0Var, int i11, int i12) {
        b bVarC = new b(this).B(r0Var).C(i12);
        p7.j0.e eVar = this.f12022c.f12456a;
        p7.j0.e eVar2 = new p7.j0.e(eVar.f101395a, i11, eVar.f101398d, eVar.f101399e, eVar.f101400f, eVar.f101401g, eVar.f101402h, eVar.f101403i, eVar.f101404j);
        ue ueVar = this.f12022c;
        return bVarC.z(new ue(eVar2, ueVar.f12457b, ueVar.f12458c, ueVar.f12459d, ueVar.f12460e, ueVar.f12461f, ueVar.f12462g, ueVar.f12463h, ueVar.f12464i, ueVar.f12465j)).a();
    }

    public ne w(p7.r0 r0Var, ue ueVar, int i11) {
        return new b(this).B(r0Var).z(ueVar).C(i11).a();
    }

    public ne x(p7.w0 w0Var) {
        return new b(this).D(w0Var).a();
    }

    public ne y(p7.e1 e1Var) {
        return new b(this).E(e1Var).a();
    }

    public ne z(float f11) {
        return new b(this).F(f11).a();
    }
}
