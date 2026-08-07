package androidx.media3.session;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
final class le extends o.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakReference<s8> f11931n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f<IBinder> f11932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set<t7.g> f11933p = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.common.collect.v<p7.t0, String> f11934q = com.google.common.collect.v.u();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f11935r;

    static final class a implements t7.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f11936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11937b;

        public a(n nVar, int i11) {
            this.f11936a = nVar;
            this.f11937b = i11;
        }

        @Override // androidx.media3.session.t7.f
        public void B(int i11, ga.g<?> gVar) {
            this.f11936a.J1(i11, gVar.g());
        }

        @Override // androidx.media3.session.t7.f
        public void C(int i11, p7.j0.b bVar) {
            this.f11936a.H0(i11, bVar.h());
        }

        public IBinder G() {
            return this.f11936a.asBinder();
        }

        @Override // androidx.media3.session.t7.f
        public void c(int i11) {
            xe.a(this.f11936a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            return Objects.equals(G(), ((a) obj).G());
        }

        @Override // androidx.media3.session.t7.f
        public void g(int i11, ue ueVar, boolean z11, boolean z12, int i12) {
            this.f11936a.t2(i11, ueVar.a(z11, z12).c(i12));
        }

        public int hashCode() {
            return u5.c.b(G());
        }

        @Override // androidx.media3.session.t7.f
        public void l(int i11, se seVar, Bundle bundle) {
            this.f11936a.J0(i11, seVar.b(), bundle);
        }

        @Override // androidx.media3.session.t7.f
        public void m(int i11, ne neVar, p7.j0.b bVar, boolean z11, boolean z12) {
            s7.a.h(this.f11937b != 0);
            boolean z13 = z11 || !bVar.c(17);
            boolean z14 = z12 || !bVar.c(30);
            if (this.f11937b < 2) {
                this.f11936a.K2(i11, neVar.A(bVar, z11, true).E(this.f11937b), z13);
            } else {
                ne neVarA = neVar.A(bVar, z11, z12);
                this.f11936a.x2(i11, this.f11936a instanceof o6 ? neVarA.F() : neVarA.E(this.f11937b), new ne.c(z13, z14).b());
            }
        }

        @Override // androidx.media3.session.t7.f
        public void o(int i11, ga.v vVar) {
            this.f11936a.w0(i11, vVar.b());
        }

        @Override // androidx.media3.session.t7.f
        public void w(int i11) {
            this.f11936a.w(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
        void a(oe oeVar, t7.g gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface c {
        void a(oe oeVar, t7.g gVar, List<p7.y> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface d {
        void a(oe oeVar, t7.i iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface e<T, K extends s8> {
        T a(K k11, t7.g gVar, int i11);
    }

    public le(s8 s8Var) {
        this.f11931n = new WeakReference<>(s8Var);
        this.f11932o = new f<>(s8Var);
    }

    private <K extends s8> void A4(n nVar, int i11, int i12, e<com.google.common.util.concurrent.s<Void>, K> eVar) {
        t7.g gVarK = this.f11932o.k(nVar.asBinder());
        if (gVarK != null) {
            B4(gVarK, i11, i12, eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void B3(s8 s8Var, t7.g gVar, int i11, com.google.common.util.concurrent.s sVar) {
        ga.v vVar;
        int i12;
        try {
            vVar = (ga.v) s7.a.g((ga.v) sVar.get(), "SessionResult must not be null");
        } catch (InterruptedException e11) {
            e = e11;
            s7.t.j("MediaSessionStub", "Session operation failed", e);
            if (e.getCause() instanceof UnsupportedOperationException) {
                i12 = -6;
            } else {
                i12 = -1;
            }
            vVar = new ga.v(i12);
        } catch (CancellationException e12) {
            s7.t.j("MediaSessionStub", "Session operation cancelled", e12);
            vVar = new ga.v(1);
        } catch (ExecutionException e13) {
            e = e13;
            s7.t.j("MediaSessionStub", "Session operation failed", e);
            if (e.getCause() instanceof UnsupportedOperationException) {
                i12 = -6;
            } else {
                i12 = -1;
            }
            vVar = new ga.v(i12);
        }
        J4(s8Var, gVar, i11, vVar);
    }

    private <K extends s8> void B4(final t7.g gVar, final int i11, final int i12, final e<com.google.common.util.concurrent.s<Void>, K> eVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final s8 s8Var = this.f11931n.get();
            if (s8Var != null && !s8Var.u0()) {
                s7.q0.m1(s8Var.X(), new Runnable() { // from class: androidx.media3.session.sd
                    @Override // java.lang.Runnable
                    public final void run() {
                        le.M3(this.f12336a, gVar, i12, s8Var, i11, eVar);
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    private static void H4(t7.g gVar, int i11, ga.g<?> gVar2) {
        try {
            ((t7.f) s7.a.j(gVar.c())).B(i11, gVar2);
        } catch (RemoteException e11) {
            s7.t.j("MediaSessionStub", "Failed to send result to browser " + gVar, e11);
        }
    }

    private static <V, K extends i7> e<com.google.common.util.concurrent.s<Void>, K> I4(final e<com.google.common.util.concurrent.s<ga.g<V>>, K> eVar) {
        return new e() { // from class: androidx.media3.session.wd
            @Override // androidx.media3.session.le.e
            public final Object a(s8 s8Var, t7.g gVar, int i11) {
                return le.w4((i7) s8Var, gVar, i11, eVar, new s7.n() { // from class: androidx.media3.session.zd
                    @Override // s7.n
                    public final void accept(Object obj) {
                        le.a3(gVar, i11, (com.google.common.util.concurrent.s) obj);
                    }
                });
            }
        };
    }

    private static void J4(s8 s8Var, t7.g gVar, int i11, ga.v vVar) {
        try {
            ((t7.f) s7.a.j(gVar.c())).o(i11, vVar);
            s8Var.T0();
        } catch (RemoteException e11) {
            s7.t.j("MediaSessionStub", "Failed to send result to controller " + gVar, e11);
        }
    }

    private static <K extends s8> e<com.google.common.util.concurrent.s<Void>, K> K4(final b bVar) {
        return new e() { // from class: androidx.media3.session.qd
            @Override // androidx.media3.session.le.e
            public final Object a(s8 s8Var, t7.g gVar, int i11) {
                return le.h4(bVar, s8Var, gVar, i11);
            }
        };
    }

    private static <K extends s8> e<com.google.common.util.concurrent.s<Void>, K> L4(final s7.n<oe> nVar) {
        return K4(new b() { // from class: androidx.media3.session.vd
            @Override // androidx.media3.session.le.b
            public final void a(oe oeVar, t7.g gVar) {
                nVar.accept(oeVar);
            }
        });
    }

    public static /* synthetic */ void M3(le leVar, final t7.g gVar, int i11, final s8 s8Var, final int i12, final e eVar) {
        if (!leVar.f11932o.q(gVar, i11)) {
            J4(s8Var, gVar, i12, new ga.v(-4));
            return;
        }
        int iF0 = s8Var.F0(gVar, i11);
        if (iF0 != 0) {
            J4(s8Var, gVar, i12, new ga.v(iF0));
        } else if (i11 != 27) {
            leVar.f11932o.f(gVar, i11, new f.a() { // from class: androidx.media3.session.ce
                @Override // androidx.media3.session.f.a
                public final com.google.common.util.concurrent.s run() {
                    return le.w3(eVar, s8Var, gVar, i12);
                }
            });
        } else {
            s8Var.K(gVar, new Runnable() { // from class: androidx.media3.session.be
                @Override // java.lang.Runnable
                public final void run() {
                    eVar.a(s8Var, gVar, i12);
                }
            }).run();
            leVar.f11932o.f(gVar, i11, new f.a() { // from class: ga.p
                @Override // androidx.media3.session.f.a
                public final com.google.common.util.concurrent.s run() {
                    return com.google.common.util.concurrent.m.e();
                }
            });
        }
    }

    private static <K extends s8> e<com.google.common.util.concurrent.s<Void>, K> M4(final e<com.google.common.util.concurrent.s<ga.v>, K> eVar) {
        return new e() { // from class: androidx.media3.session.xd
            @Override // androidx.media3.session.le.e
            public final Object a(s8 s8Var, t7.g gVar, int i11) {
                return le.w4(s8Var, gVar, i11, eVar, new s7.n() { // from class: androidx.media3.session.fe
                    @Override // s7.n
                    public final void accept(Object obj) {
                        le.B3(s8Var, gVar, i11, (com.google.common.util.concurrent.s) obj);
                    }
                });
            }
        };
    }

    private p7.w0 O4(p7.w0 w0Var) {
        if (w0Var.D.isEmpty()) {
            return w0Var;
        }
        p7.w0.c cVarH = w0Var.I().H();
        com.google.common.collect.d1<p7.u0> it = w0Var.D.values().iterator();
        while (it.hasNext()) {
            p7.u0 next = it.next();
            p7.t0 t0Var = this.f11934q.t().get(next.f101584a.f101500b);
            if (t0Var == null || next.f101584a.f101499a != t0Var.f101499a) {
                cVarH.F(next);
            } else {
                cVarH.F(new p7.u0(t0Var, next.f101585b));
            }
        }
        return cVarH.G();
    }

    public static /* synthetic */ void P3(le leVar, t7.g gVar, s8 s8Var, n nVar) throws Throwable {
        n nVar2;
        p7.j0.b bVar;
        leVar.getClass();
        boolean z11 = false;
        try {
            leVar.f11933p.remove(gVar);
            if (s8Var.u0()) {
                xe.a(nVar);
                return;
            }
            IBinder iBinderG = ((a) s7.a.j((a) gVar.c())).G();
            t7.e eVarY0 = s8Var.y0(gVar);
            if (!eVarY0.f12380a && !gVar.h()) {
                xe.a(nVar);
                return;
            }
            if (!eVarY0.f12380a) {
                eVarY0 = t7.e.a(te.f12414b, p7.j0.b.f101382b);
            }
            if (leVar.f11932o.p(gVar)) {
                s7.t.i("MediaSessionStub", "Controller " + gVar + " has sent connection request multiple times");
            }
            leVar.f11932o.e(iBinderG, gVar, eVarY0.f12381b, eVarY0.f12382c);
            re reVarN = leVar.f11932o.n(gVar);
            if (reVarN == null) {
                s7.t.i("MediaSessionStub", "Ignoring connection request from unknown controller info");
                xe.a(nVar);
                return;
            }
            oe oeVarK0 = s8Var.k0();
            ne neVarJ0 = s8Var.j0();
            PlaybackException playbackExceptionI0 = s8Var.i0();
            if (playbackExceptionI0 == null) {
                bVar = eVarY0.f12382c;
            } else {
                leVar.f11932o.v(gVar, playbackExceptionI0, eVarY0.f12382c);
                neVarJ0 = s8.Q(neVarJ0, playbackExceptionI0);
                bVar = (p7.j0.b) s7.a.f(s8.P(eVarY0.f12382c));
            }
            p7.j0.b bVar2 = bVar;
            ne neVarR4 = leVar.r4(neVarJ0);
            MediaSession.Token tokenH0 = s8Var.h0();
            PendingIntent pendingIntentL0 = eVarY0.f12386g;
            if (pendingIntentL0 == null) {
                pendingIntentL0 = s8Var.l0();
            }
            com.google.common.collect.x<androidx.media3.session.a> xVarB0 = eVarY0.f12383d;
            if (xVarB0 == null) {
                xVarB0 = s8Var.b0();
            }
            com.google.common.collect.x<androidx.media3.session.a> xVarF0 = eVarY0.f12384e;
            if (xVarF0 == null) {
                xVarF0 = s8Var.f0();
            }
            com.google.common.collect.x<androidx.media3.session.a> xVarZ = s8Var.Z();
            te teVar = eVarY0.f12381b;
            p7.j0.b bVarN = oeVarK0.N();
            Bundle bundleC = s8Var.n0().c();
            Bundle bundleM0 = eVarY0.f12385f;
            if (bundleM0 == null) {
                bundleM0 = s8Var.m0();
            }
            nVar2 = nVar;
            try {
                k kVar = new k(1008000300, 5, leVar, pendingIntentL0, xVarB0, xVarF0, xVarZ, teVar, bVar2, bVarN, bundleC, bundleM0, neVarR4, tokenH0);
                if (s8Var.u0()) {
                    xe.a(nVar2);
                    return;
                }
                try {
                    nVar2.P(reVarN.c(), nVar2 instanceof o6 ? kVar.f() : kVar.e(gVar.e()));
                    z11 = true;
                } catch (RemoteException unused) {
                }
                if (z11) {
                    s8Var.H0(gVar);
                }
                if (z11) {
                    return;
                }
                xe.a(nVar2);
            } catch (Throwable th2) {
                th = th2;
                if (!z11) {
                    xe.a(nVar2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            nVar2 = nVar;
        }
    }

    public static /* synthetic */ void S2(le leVar, t7.g gVar, se seVar, s8 s8Var, int i11, int i12, e eVar) {
        if (leVar.f11932o.p(gVar)) {
            if (seVar != null) {
                if (!leVar.f11932o.s(gVar, seVar)) {
                    J4(s8Var, gVar, i11, new ga.v(-4));
                    return;
                }
            } else if (!leVar.f11932o.r(gVar, i12)) {
                J4(s8Var, gVar, i11, new ga.v(-4));
                return;
            }
            eVar.a(s8Var, gVar, i11);
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.s W3(List list, int i11, long j11, s8 s8Var, t7.g gVar, int i12) {
        int iR = i11 == -1 ? s8Var.k0().R() : i11;
        if (i11 == -1) {
            j11 = s8Var.k0().D();
        }
        return s8Var.I0(gVar, list, iR, j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a3(t7.g gVar, int i11, com.google.common.util.concurrent.s sVar) {
        ga.g gVarC;
        try {
            gVarC = (ga.g) s7.a.g((ga.g) sVar.get(), "LibraryResult must not be null");
        } catch (InterruptedException e11) {
            e = e11;
            s7.t.j("MediaSessionStub", "Library operation failed", e);
            gVarC = ga.g.c(-1);
        } catch (CancellationException e12) {
            s7.t.j("MediaSessionStub", "Library operation cancelled", e12);
            gVarC = ga.g.c(1);
        } catch (ExecutionException e13) {
            e = e13;
            s7.t.j("MediaSessionStub", "Library operation failed", e);
            gVarC = ga.g.c(-1);
        }
        H4(gVar, i11, gVarC);
    }

    public static /* synthetic */ void e3(s8 s8Var, d dVar, t7.i iVar) {
        if (s8Var.u0()) {
            return;
        }
        dVar.a(s8Var.k0(), iVar);
    }

    public static /* synthetic */ com.google.common.util.concurrent.s h4(b bVar, s8 s8Var, t7.g gVar, int i11) {
        if (s8Var.u0()) {
            return com.google.common.util.concurrent.m.e();
        }
        bVar.a(s8Var.k0(), gVar);
        J4(s8Var, gVar, i11, new ga.v(0));
        return com.google.common.util.concurrent.m.e();
    }

    public static /* synthetic */ void i4(le leVar, t7.g gVar, oe oeVar) {
        s8 s8Var = leVar.f11931n.get();
        if (s8Var == null || s8Var.u0()) {
            return;
        }
        s8Var.q0(gVar, false);
    }

    public static /* synthetic */ com.google.common.util.concurrent.s j3(e eVar, final d dVar, final s8 s8Var, final t7.g gVar, int i11) {
        return s8Var.u0() ? com.google.common.util.concurrent.m.d(new ga.v(-100)) : s7.q0.M1((com.google.common.util.concurrent.s) eVar.a(s8Var, gVar, i11), new com.google.common.util.concurrent.f() { // from class: androidx.media3.session.ae
            @Override // com.google.common.util.concurrent.f
            public final com.google.common.util.concurrent.s apply(Object obj) {
                s8 s8Var2 = s8Var;
                return s7.q0.n1(s8Var2.X(), s8Var2.K(gVar, new Runnable() { // from class: androidx.media3.session.he
                    @Override // java.lang.Runnable
                    public final void run() {
                        le.e3(s8Var2, dVar, iVar);
                    }
                }), new ga.v(0));
            }
        });
    }

    public static /* synthetic */ void l4(s8 s8Var, c cVar, t7.g gVar, List list) {
        if (s8Var.u0()) {
            return;
        }
        cVar.a(s8Var.k0(), gVar, list);
    }

    public static /* synthetic */ void m4(s8 s8Var, com.google.common.util.concurrent.a0 a0Var, s7.n nVar, com.google.common.util.concurrent.s sVar) {
        if (s8Var.u0()) {
            a0Var.M(null);
            return;
        }
        try {
            nVar.accept(sVar);
            a0Var.M(null);
        } catch (Throwable th2) {
            a0Var.N(th2);
        }
    }

    private <K extends s8> void o4(n nVar, int i11, int i12, e<com.google.common.util.concurrent.s<Void>, K> eVar) {
        p4(nVar, i11, null, i12, eVar);
    }

    private <K extends s8> void p4(n nVar, final int i11, final se seVar, final int i12, final e<com.google.common.util.concurrent.s<Void>, K> eVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final s8 s8Var = this.f11931n.get();
            if (s8Var != null && !s8Var.u0()) {
                final t7.g gVarK = this.f11932o.k(nVar.asBinder());
                if (gVarK == null) {
                    return;
                }
                s7.q0.m1(s8Var.X(), new Runnable() { // from class: androidx.media3.session.rd
                    @Override // java.lang.Runnable
                    public final void run() {
                        le.S2(this.f12207a, gVarK, seVar, s8Var, i11, i12, eVar);
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    private <K extends s8> void q4(n nVar, int i11, se seVar, e<com.google.common.util.concurrent.s<Void>, K> eVar) {
        p4(nVar, i11, seVar, 0, eVar);
    }

    public static /* synthetic */ void r3(le leVar, int i11, oe oeVar, t7.g gVar, List list) {
        leVar.getClass();
        if (list.size() == 1) {
            oeVar.J0(leVar.x4(gVar, oeVar, i11), (p7.y) list.get(0));
        } else {
            oeVar.z0(leVar.x4(gVar, oeVar, i11), leVar.x4(gVar, oeVar, i11 + 1), list);
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.s s3(e eVar, final c cVar, final s8 s8Var, final t7.g gVar, int i11) {
        return s8Var.u0() ? com.google.common.util.concurrent.m.d(new ga.v(-100)) : s7.q0.M1((com.google.common.util.concurrent.s) eVar.a(s8Var, gVar, i11), new com.google.common.util.concurrent.f() { // from class: androidx.media3.session.ee
            @Override // com.google.common.util.concurrent.f
            public final com.google.common.util.concurrent.s apply(Object obj) {
                s8 s8Var2 = s8Var;
                t7.g gVar2 = gVar;
                return s7.q0.n1(s8Var2.X(), s8Var2.K(gVar2, new Runnable() { // from class: androidx.media3.session.ie
                    @Override // java.lang.Runnable
                    public final void run() {
                        le.l4(s8Var2, cVar, gVar2, list);
                    }
                }), new ga.v(0));
            }
        });
    }

    private String s4(p7.t0 t0Var) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f11935r;
        this.f11935r = i11 + 1;
        sb2.append(s7.q0.N0(i11));
        sb2.append("-");
        sb2.append(t0Var.f101500b);
        return sb2.toString();
    }

    private static <K extends s8> e<com.google.common.util.concurrent.s<ga.v>, K> u4(final e<com.google.common.util.concurrent.s<List<p7.y>>, K> eVar, final c cVar) {
        return new e() { // from class: androidx.media3.session.yd
            @Override // androidx.media3.session.le.e
            public final Object a(s8 s8Var, t7.g gVar, int i11) {
                return le.s3(eVar, cVar, s8Var, gVar, i11);
            }
        };
    }

    private static <K extends s8> e<com.google.common.util.concurrent.s<ga.v>, K> v4(final e<com.google.common.util.concurrent.s<t7.i>, K> eVar, final d dVar) {
        return new e() { // from class: androidx.media3.session.ud
            @Override // androidx.media3.session.le.e
            public final Object a(s8 s8Var, t7.g gVar, int i11) {
                return le.j3(eVar, dVar, s8Var, gVar, i11);
            }
        };
    }

    public static /* synthetic */ com.google.common.util.concurrent.s w3(e eVar, s8 s8Var, t7.g gVar, int i11) {
        return (com.google.common.util.concurrent.s) eVar.a(s8Var, gVar, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T, K extends s8> com.google.common.util.concurrent.s<Void> w4(final K k11, t7.g gVar, int i11, e<com.google.common.util.concurrent.s<T>, K> eVar, final s7.n<com.google.common.util.concurrent.s<T>> nVar) {
        if (k11.u0()) {
            return com.google.common.util.concurrent.m.e();
        }
        final com.google.common.util.concurrent.s<T> sVarA = eVar.a(k11, gVar, i11);
        final com.google.common.util.concurrent.a0 a0VarQ = com.google.common.util.concurrent.a0.Q();
        sVarA.b(new Runnable() { // from class: androidx.media3.session.ge
            @Override // java.lang.Runnable
            public final void run() {
                le.m4(k11, a0VarQ, nVar, sVarA);
            }
        }, com.google.common.util.concurrent.w.b());
        return a0VarQ;
    }

    private int x4(t7.g gVar, oe oeVar, int i11) {
        return (oeVar.c0(17) && !this.f11932o.q(gVar, 17) && this.f11932o.q(gVar, 16)) ? i11 + oeVar.R() : i11;
    }

    @Override // androidx.media3.session.o
    public void A0(n nVar, int i11, final int i12) {
        if (nVar == null) {
            return;
        }
        if (i12 == 2 || i12 == 0 || i12 == 1) {
            A4(nVar, i11, 15, L4(new s7.n() { // from class: androidx.media3.session.sc
                @Override // s7.n
                public final void accept(Object obj) {
                    ((oe) obj).i(i12);
                }
            }));
        }
    }

    @Override // androidx.media3.session.o
    public void B2(n nVar, int i11, final int i12) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 34, L4(new s7.n() { // from class: androidx.media3.session.hc
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).Z(i12);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void C0(n nVar, int i11, Bundle bundle) {
        if (nVar == null || bundle == null) {
            return;
        }
        try {
            final p7.i0 i0VarA = p7.i0.a(bundle);
            A4(nVar, i11, 13, L4(new s7.n() { // from class: androidx.media3.session.ac
                @Override // s7.n
                public final void accept(Object obj) {
                    ((oe) obj).j(i0VarA);
                }
            }));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void C1(n nVar, int i11, Bundle bundle, final boolean z11) {
        if (nVar == null || bundle == null) {
            return;
        }
        try {
            final p7.d dVarA = p7.d.a(bundle);
            A4(nVar, i11, 35, L4(new s7.n() { // from class: androidx.media3.session.tc
                @Override // s7.n
                public final void accept(Object obj) {
                    ((oe) obj).o0(dVarA, z11);
                }
            }));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void C2(n nVar, int i11) {
        t7.g gVarK;
        if (nVar == null || (gVarK = this.f11932o.k(nVar.asBinder())) == null) {
            return;
        }
        D4(gVarK, i11);
    }

    public void C4() {
        for (t7.g gVar : this.f11932o.j()) {
            this.f11932o.t(gVar);
            t7.f fVarC = gVar.c();
            if (fVarC != null) {
                fVarC.c(0);
            }
        }
        Iterator<t7.g> it = this.f11933p.iterator();
        while (it.hasNext()) {
            t7.f fVarC2 = it.next().c();
            if (fVarC2 != null) {
                fVarC2.c(0);
            }
        }
        this.f11933p.clear();
        this.f11931n.clear();
    }

    @Override // androidx.media3.session.o
    public void D0(n nVar, int i11, final int i12, final int i13, final int i14) {
        if (nVar == null || i12 < 0 || i13 < i12 || i14 < 0) {
            return;
        }
        A4(nVar, i11, 20, L4(new s7.n() { // from class: androidx.media3.session.kc
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).M0(i12, i13, i14);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void D1(n nVar, int i11, final int i12) {
        if (nVar == null || i12 < 0) {
            return;
        }
        A4(nVar, i11, 25, L4(new s7.n() { // from class: androidx.media3.session.md
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).O0(i12);
            }
        }));
    }

    public void D4(t7.g gVar, int i11) {
        B4(gVar, i11, 11, L4(new s7.n() { // from class: androidx.media3.session.xb
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).U();
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void E(n nVar, int i11) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 26, L4(new s7.n() { // from class: androidx.media3.session.ub
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).f0();
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void E1(n nVar, int i11, IBinder iBinder, final boolean z11) {
        if (nVar == null || iBinder == null) {
            return;
        }
        try {
            final com.google.common.collect.x xVarD = s7.i.d(new ga.e(), p7.g.a(iBinder));
            A4(nVar, i11, 20, M4(v4(new e() { // from class: androidx.media3.session.de
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i12) {
                    List list = xVarD;
                    boolean z12 = z11;
                    return s8Var.I0(gVar, list, z12 ? -1 : s8Var.k0().R(), z12 ? -9223372036854775807L : s8Var.k0().D());
                }
            }, new je())));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
        }
    }

    public void E4(t7.g gVar, int i11) {
        B4(gVar, i11, 12, L4(new s7.n() { // from class: androidx.media3.session.oc
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).C();
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void F(n nVar, int i11) {
        t7.g gVarK;
        if (nVar == null || (gVarK = this.f11932o.k(nVar.asBinder())) == null) {
            return;
        }
        y4(gVarK, i11);
    }

    @Override // androidx.media3.session.o
    public void F0(n nVar, int i11, Bundle bundle) {
        if (nVar == null || bundle == null) {
            return;
        }
        try {
            final p7.e0 e0VarB = p7.e0.b(bundle);
            A4(nVar, i11, 19, L4(new s7.n() { // from class: androidx.media3.session.hd
                @Override // s7.n
                public final void accept(Object obj) {
                    ((oe) obj).j0(e0VarB);
                }
            }));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void F1(n nVar, int i11) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 6, L4(new s7.n() { // from class: androidx.media3.session.jc
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).x0();
            }
        }));
    }

    public void F4(t7.g gVar, int i11) {
        B4(gVar, i11, 9, L4(new s7.n() { // from class: androidx.media3.session.pc
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).K();
            }
        }));
    }

    public void G4(t7.g gVar, int i11) {
        B4(gVar, i11, 7, L4(new s7.n() { // from class: androidx.media3.session.dc
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).F();
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void H1(n nVar, int i11) {
        t7.g gVarK;
        if (nVar == null || (gVarK = this.f11932o.k(nVar.asBinder())) == null) {
            return;
        }
        F4(gVarK, i11);
    }

    @Override // androidx.media3.session.o
    public void I2(n nVar, int i11) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 26, L4(new s7.n() { // from class: androidx.media3.session.xc
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).y0();
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void K0(n nVar, int i11, final String str, final int i12, final int i13, Bundle bundle) {
        final q6 q6VarA;
        if (nVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            s7.t.i("MediaSessionStub", "getChildren(): Ignoring empty parentId");
            return;
        }
        if (i12 < 0) {
            s7.t.i("MediaSessionStub", "getChildren(): Ignoring negative page");
            return;
        }
        if (i13 < 1) {
            s7.t.i("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
            return;
        }
        if (bundle == null) {
            q6VarA = null;
        } else {
            try {
                q6VarA = q6.a(bundle);
            } catch (RuntimeException e11) {
                s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e11);
                return;
            }
        }
        o4(nVar, i11, 50003, I4(new e() { // from class: androidx.media3.session.hb
            @Override // androidx.media3.session.le.e
            public final Object a(s8 s8Var, t7.g gVar, int i14) {
                return ((i7) s8Var).X0(gVar, str, i12, i13, q6VarA);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void L0(n nVar) {
        if (nVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            s8 s8Var = this.f11931n.get();
            if (s8Var != null && !s8Var.u0()) {
                final t7.g gVarK = this.f11932o.k(nVar.asBinder());
                if (gVarK != null) {
                    s7.q0.m1(s8Var.X(), new Runnable() { // from class: androidx.media3.session.ic
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f11791a.f11932o.h(gVarK);
                        }
                    });
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.o
    public void M0(n nVar, int i11, final int i12, final int i13) {
        if (nVar == null || i12 < 0 || i13 < i12) {
            return;
        }
        A4(nVar, i11, 20, K4(new b() { // from class: androidx.media3.session.fb
            @Override // androidx.media3.session.le.b
            public final void a(oe oeVar, t7.g gVar) {
                le leVar = this.f11678a;
                oeVar.a0(leVar.x4(gVar, oeVar, i12), leVar.x4(gVar, oeVar, i13));
            }
        }));
    }

    public void N4(t7.g gVar, int i11) {
        B4(gVar, i11, 3, L4(new s7.n() { // from class: androidx.media3.session.cd
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).stop();
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void O(n nVar, int i11, Bundle bundle) {
        final q6 q6VarA;
        if (nVar == null) {
            return;
        }
        if (bundle == null) {
            q6VarA = null;
        } else {
            try {
                q6VarA = q6.a(bundle);
            } catch (RuntimeException e11) {
                s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e11);
                return;
            }
        }
        o4(nVar, i11, 50000, I4(new e() { // from class: androidx.media3.session.ed
            @Override // androidx.media3.session.le.e
            public final Object a(s8 s8Var, t7.g gVar, int i12) {
                return ((i7) s8Var).Z0(gVar, q6VarA);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void O1(n nVar, int i11, Bundle bundle) {
        if (nVar == null || bundle == null) {
            return;
        }
        try {
            g gVarA = g.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = gVarA.f11695d;
            }
            try {
                ha.n.b bVar = new ha.n.b(gVarA.f11694c, callingPid, callingUid);
                s8 s8Var = this.f11931n.get();
                boolean z11 = s8Var != null && ha.n.a(s8Var.a0()).b(bVar);
                int i12 = gVarA.f11692a;
                int i13 = gVarA.f11693b;
                n4(nVar, new t7.g(bVar, i12, i13, z11, new a(nVar, i13), gVarA.f11696e, gVarA.f11697f));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void Q2(n nVar, int i11, Bundle bundle) {
        if (nVar == null || bundle == null) {
            return;
        }
        try {
            final p7.w0 w0VarJ = p7.w0.J(bundle);
            A4(nVar, i11, 29, L4(new s7.n() { // from class: androidx.media3.session.qb
                @Override // s7.n
                public final void accept(Object obj) {
                    ((oe) obj).C0(this.f12168a.O4(w0VarJ));
                }
            }));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void R1(n nVar, int i11) {
        t7.g gVarK;
        if (nVar == null || (gVarK = this.f11932o.k(nVar.asBinder())) == null) {
            return;
        }
        G4(gVarK, i11);
    }

    @Override // androidx.media3.session.o
    public void T0(n nVar, int i11, Bundle bundle, final boolean z11) {
        if (nVar == null || bundle == null) {
            return;
        }
        try {
            final p7.y yVarB = p7.y.b(bundle);
            A4(nVar, i11, 31, M4(v4(new e() { // from class: androidx.media3.session.cc
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i12) {
                    p7.y yVar = yVarB;
                    boolean z12 = z11;
                    return s8Var.I0(gVar, com.google.common.collect.x.s(yVar), z12 ? -1 : s8Var.k0().R(), z12 ? -9223372036854775807L : s8Var.k0().D());
                }
            }, new je())));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void U0(n nVar, int i11) {
        t7.g gVarK;
        if (nVar == null || (gVarK = this.f11932o.k(nVar.asBinder())) == null) {
            return;
        }
        N4(gVarK, i11);
    }

    @Override // androidx.media3.session.o
    public void U1(n nVar, int i11) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 4, L4(new s7.n() { // from class: androidx.media3.session.id
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).E();
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void V0(n nVar, int i11, final String str, Bundle bundle) {
        if (nVar == null || str == null || bundle == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            s7.t.i("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
            return;
        }
        try {
            final p7.k0 k0VarA = p7.k0.a(bundle);
            o4(nVar, i11, 40010, M4(new e() { // from class: androidx.media3.session.qc
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i12) {
                    return s8Var.J0(gVar, str, k0VarA);
                }
            }));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for Rating", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void V1(n nVar, int i11, final String str, Bundle bundle) {
        final q6 q6VarA;
        if (nVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            s7.t.i("MediaSessionStub", "subscribe(): Ignoring empty parentId");
            return;
        }
        if (bundle == null) {
            q6VarA = null;
        } else {
            try {
                q6VarA = q6.a(bundle);
            } catch (RuntimeException e11) {
                s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e11);
                return;
            }
        }
        o4(nVar, i11, 50001, I4(new e() { // from class: androidx.media3.session.kd
            @Override // androidx.media3.session.le.e
            public final Object a(s8 s8Var, t7.g gVar, int i12) {
                return ((i7) s8Var).c1(gVar, str, q6VarA);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void X1(n nVar, int i11, Bundle bundle) {
        if (nVar == null || bundle == null) {
            return;
        }
        try {
            final p7.k0 k0VarA = p7.k0.a(bundle);
            o4(nVar, i11, 40010, M4(new e() { // from class: androidx.media3.session.ke
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i12) {
                    return s8Var.K0(gVar, k0VarA);
                }
            }));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for Rating", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void Y0(n nVar, int i11) {
        t7.g gVarK;
        if (nVar == null || (gVarK = this.f11932o.k(nVar.asBinder())) == null) {
            return;
        }
        E4(gVarK, i11);
    }

    @Override // androidx.media3.session.o
    public void a0(n nVar, int i11, final String str, final int i12, final int i13, Bundle bundle) {
        final q6 q6VarA;
        if (nVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            s7.t.i("MediaSessionStub", "getSearchResult(): Ignoring empty query");
            return;
        }
        if (i12 < 0) {
            s7.t.i("MediaSessionStub", "getSearchResult(): Ignoring negative page");
            return;
        }
        if (i13 < 1) {
            s7.t.i("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
            return;
        }
        if (bundle == null) {
            q6VarA = null;
        } else {
            try {
                q6VarA = q6.a(bundle);
            } catch (RuntimeException e11) {
                s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e11);
                return;
            }
        }
        o4(nVar, i11, 50006, I4(new e() { // from class: androidx.media3.session.zc
            @Override // androidx.media3.session.le.e
            public final Object a(s8 s8Var, t7.g gVar, int i14) {
                return ((i7) s8Var).a1(gVar, str, i12, i13, q6VarA);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void a1(n nVar, int i11, final int i12, final int i13, IBinder iBinder) {
        if (nVar == null || iBinder == null || i12 < 0 || i13 < i12) {
            return;
        }
        try {
            final com.google.common.collect.x xVarD = s7.i.d(new ga.e(), p7.g.a(iBinder));
            A4(nVar, i11, 20, M4(u4(new e() { // from class: androidx.media3.session.jb
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i14) {
                    return s8Var.x0(gVar, xVarD);
                }
            }, new c() { // from class: androidx.media3.session.kb
                @Override // androidx.media3.session.le.c
                public final void a(oe oeVar, t7.g gVar, List list) {
                    le leVar = this.f11887a;
                    oeVar.z0(leVar.x4(gVar, oeVar, i12), leVar.x4(gVar, oeVar, i13), list);
                }
            })));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void a2(n nVar, int i11, Bundle bundle) {
        if (nVar == null || bundle == null) {
            return;
        }
        try {
            ga.v vVarA = ga.v.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                re reVarO = this.f11932o.o(nVar.asBinder());
                if (reVarO == null) {
                    return;
                }
                reVarO.e(i11, vVarA);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void b0(n nVar, int i11, IBinder iBinder) {
        E1(nVar, i11, iBinder, true);
    }

    @Override // androidx.media3.session.o
    public void b1(n nVar, int i11) {
        t7.g gVarK;
        if (nVar == null || (gVarK = this.f11932o.k(nVar.asBinder())) == null) {
            return;
        }
        z4(gVarK, i11);
    }

    @Override // androidx.media3.session.o
    public void c1(n nVar, int i11, final boolean z11) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 1, L4(new s7.n() { // from class: androidx.media3.session.mb
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).G(z11);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void c2(n nVar, int i11, IBinder iBinder) {
        if (nVar == null || iBinder == null) {
            return;
        }
        try {
            final com.google.common.collect.x xVarD = s7.i.d(new ga.e(), p7.g.a(iBinder));
            A4(nVar, i11, 20, M4(u4(new e() { // from class: androidx.media3.session.uc
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i12) {
                    return s8Var.x0(gVar, xVarD);
                }
            }, new c() { // from class: androidx.media3.session.vc
                @Override // androidx.media3.session.le.c
                public final void a(oe oeVar, t7.g gVar, List list) {
                    oeVar.N0(list);
                }
            })));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void d2(n nVar, int i11, final int i12, Bundle bundle) {
        if (nVar == null || bundle == null || i12 < 0) {
            return;
        }
        try {
            final p7.y yVarB = p7.y.b(bundle);
            A4(nVar, i11, 20, M4(u4(new e() { // from class: androidx.media3.session.rb
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i13) {
                    return s8Var.x0(gVar, com.google.common.collect.x.s(yVarB));
                }
            }, new c() { // from class: androidx.media3.session.sb
                @Override // androidx.media3.session.le.c
                public final void a(oe oeVar, t7.g gVar, List list) {
                    oeVar.K0(this.f12333a.x4(gVar, oeVar, i12), list);
                }
            })));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void e2(n nVar, int i11, final int i12, final int i13) {
        if (nVar == null || i12 < 0) {
            return;
        }
        A4(nVar, i11, 33, L4(new s7.n() { // from class: androidx.media3.session.rc
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).I0(i12, i13);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void f0(n nVar, int i11, Bundle bundle) {
        if (nVar == null || bundle == null) {
            return;
        }
        try {
            final p7.y yVarB = p7.y.b(bundle);
            A4(nVar, i11, 20, M4(u4(new e() { // from class: androidx.media3.session.wc
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i12) {
                    return s8Var.x0(gVar, com.google.common.collect.x.s(yVarB));
                }
            }, new c() { // from class: androidx.media3.session.yc
                @Override // androidx.media3.session.le.c
                public final void a(oe oeVar, t7.g gVar, List list) {
                    oeVar.N0(list);
                }
            })));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void f2(n nVar, int i11, final boolean z11) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 26, L4(new s7.n() { // from class: androidx.media3.session.yb
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).d0(z11);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void g0(n nVar, int i11, final String str, Bundle bundle) {
        final q6 q6VarA;
        if (nVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            s7.t.i("MediaSessionStub", "search(): Ignoring empty query");
            return;
        }
        if (bundle == null) {
            q6VarA = null;
        } else {
            try {
                q6VarA = q6.a(bundle);
            } catch (RuntimeException e11) {
                s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e11);
                return;
            }
        }
        o4(nVar, i11, 50005, I4(new e() { // from class: androidx.media3.session.pd
            @Override // androidx.media3.session.le.e
            public final Object a(s8 s8Var, t7.g gVar, int i12) {
                return ((i7) s8Var).b1(gVar, str, q6VarA);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void g2(n nVar, int i11, final String str) {
        if (nVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            s7.t.i("MediaSessionStub", "getItem(): Ignoring empty mediaId");
        } else {
            o4(nVar, i11, 50004, I4(new e() { // from class: androidx.media3.session.nc
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i12) {
                    return ((i7) s8Var).Y0(gVar, str);
                }
            }));
        }
    }

    @Override // androidx.media3.session.o
    public void i0(n nVar, int i11, final int i12) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 34, L4(new s7.n() { // from class: androidx.media3.session.bc
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).B0(i12);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void i1(n nVar, int i11, final boolean z11, final int i12) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 34, L4(new s7.n() { // from class: androidx.media3.session.gd
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).u0(z11, i12);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void i2(n nVar, int i11, final int i12) {
        if (nVar == null || i12 < 0) {
            return;
        }
        A4(nVar, i11, 10, K4(new b() { // from class: androidx.media3.session.lb
            @Override // androidx.media3.session.le.b
            public final void a(oe oeVar, t7.g gVar) {
                oeVar.l0(this.f11924a.x4(gVar, oeVar, i12));
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void j1(n nVar, int i11, Bundle bundle, final Bundle bundle2) {
        if (nVar == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            final se seVarA = se.a(bundle);
            q4(nVar, i11, seVarA, M4(new e() { // from class: androidx.media3.session.zb
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i12) {
                    return s8Var.z0(gVar, seVarA, bundle2);
                }
            }));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void j2(n nVar, int i11, final int i12, final long j11) {
        if (nVar == null || i12 < 0) {
            return;
        }
        A4(nVar, i11, 10, K4(new b() { // from class: androidx.media3.session.ob
            @Override // androidx.media3.session.le.b
            public final void a(oe oeVar, t7.g gVar) {
                oeVar.M(this.f12098a.x4(gVar, oeVar, i12), j11);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void k0(n nVar, int i11, Bundle bundle, final long j11) {
        if (nVar == null || bundle == null) {
            return;
        }
        try {
            final p7.y yVarB = p7.y.b(bundle);
            A4(nVar, i11, 31, M4(v4(new e() { // from class: androidx.media3.session.jd
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i12) {
                    return s8Var.I0(gVar, com.google.common.collect.x.s(yVarB), 0, j11);
                }
            }, new je())));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void k1(n nVar, int i11, IBinder iBinder, final int i12, final long j11) {
        if (nVar == null || iBinder == null) {
            return;
        }
        if (i12 == -1 || i12 >= 0) {
            try {
                final com.google.common.collect.x xVarD = s7.i.d(new ga.e(), p7.g.a(iBinder));
                A4(nVar, i11, 20, M4(v4(new e() { // from class: androidx.media3.session.lc
                    @Override // androidx.media3.session.le.e
                    public final Object a(s8 s8Var, t7.g gVar, int i13) {
                        return le.W3(xVarD, i12, j11, s8Var, gVar, i13);
                    }
                }, new je())));
            } catch (RuntimeException e11) {
                s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
            }
        }
    }

    @Override // androidx.media3.session.o
    public void l0(n nVar, int i11, final int i12) {
        if (nVar == null || i12 < 0) {
            return;
        }
        A4(nVar, i11, 20, K4(new b() { // from class: androidx.media3.session.td
            @Override // androidx.media3.session.le.b
            public final void a(oe oeVar, t7.g gVar) {
                oeVar.A0(this.f12412a.x4(gVar, oeVar, i12));
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void m0(n nVar, int i11) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 8, L4(new s7.n() { // from class: androidx.media3.session.tb
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).b0();
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void n0(n nVar, int i11, final long j11) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 5, L4(new s7.n() { // from class: androidx.media3.session.nd
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).seekTo(j11);
            }
        }));
    }

    public void n4(final n nVar, final t7.g gVar) {
        if (nVar == null || gVar == null) {
            xe.a(nVar);
            return;
        }
        final s8 s8Var = this.f11931n.get();
        if (s8Var == null || s8Var.u0()) {
            xe.a(nVar);
        } else {
            this.f11933p.add(gVar);
            s7.q0.m1(s8Var.X(), new Runnable() { // from class: androidx.media3.session.mc
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    le.P3(this.f11978a, gVar, s8Var, nVar);
                }
            });
        }
    }

    @Override // androidx.media3.session.o
    public void o2(n nVar, int i11, final Surface surface) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 27, L4(new s7.n() { // from class: androidx.media3.session.dd
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).X(surface);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void p1(n nVar, int i11, final String str) {
        if (nVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            s7.t.i("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
        } else {
            o4(nVar, i11, 50002, I4(new e() { // from class: androidx.media3.session.gb
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i12) {
                    return ((i7) s8Var).d1(gVar, str);
                }
            }));
        }
    }

    @Override // androidx.media3.session.o
    public void p2(n nVar, int i11, final int i12, IBinder iBinder) {
        if (nVar == null || iBinder == null || i12 < 0) {
            return;
        }
        try {
            final com.google.common.collect.x xVarD = s7.i.d(new ga.e(), p7.g.a(iBinder));
            A4(nVar, i11, 20, M4(u4(new e() { // from class: androidx.media3.session.ec
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i13) {
                    return s8Var.x0(gVar, xVarD);
                }
            }, new c() { // from class: androidx.media3.session.fc
                @Override // androidx.media3.session.le.c
                public final void a(oe oeVar, t7.g gVar, List list) {
                    oeVar.K0(this.f11681a.x4(gVar, oeVar, i12), list);
                }
            })));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void q0(n nVar, int i11, final float f11) {
        if (nVar == null || f11 < BitmapDescriptorFactory.HUE_RED || f11 > 1.0f) {
            return;
        }
        A4(nVar, i11, 24, L4(new s7.n() { // from class: androidx.media3.session.ad
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).k(f11);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void r0(n nVar, int i11, final int i12, final int i13) {
        if (nVar == null || i12 < 0 || i13 < 0) {
            return;
        }
        A4(nVar, i11, 20, L4(new s7.n() { // from class: androidx.media3.session.ld
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).r0(i12, i13);
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void r2(n nVar, int i11) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 2, L4(new s7.n() { // from class: androidx.media3.session.fd
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).b();
            }
        }));
    }

    ne r4(ne neVar) {
        com.google.common.collect.x<p7.a1.a> xVarB = neVar.D.b();
        com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
        com.google.common.collect.v.a aVarR = com.google.common.collect.v.r();
        for (int i11 = 0; i11 < xVarB.size(); i11++) {
            p7.a1.a aVar = xVarB.get(i11);
            p7.t0 t0VarC = aVar.c();
            String strS4 = this.f11934q.get(t0VarC);
            if (strS4 == null) {
                strS4 = s4(t0VarC);
            }
            aVarR.f(t0VarC, strS4);
            aVarK.a(aVar.a(strS4));
        }
        this.f11934q = aVarR.c();
        ne neVarB = neVar.b(new p7.a1(aVarK.k()));
        if (neVarB.E.D.isEmpty()) {
            return neVarB;
        }
        p7.w0.c cVarH = neVarB.E.I().H();
        com.google.common.collect.d1<p7.u0> it = neVarB.E.D.values().iterator();
        while (it.hasNext()) {
            p7.u0 next = it.next();
            p7.t0 t0Var = next.f101584a;
            String str = this.f11934q.get(t0Var);
            if (str != null) {
                cVarH.F(new p7.u0(t0Var.a(str), next.f101585b));
            } else {
                cVarH.F(next);
            }
        }
        return neVarB.x(cVarH.G());
    }

    @Override // androidx.media3.session.o
    public void s1(n nVar, int i11) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 20, L4(new s7.n() { // from class: androidx.media3.session.od
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).v0();
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void t0(n nVar, int i11, final float f11) {
        if (nVar == null || f11 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        A4(nVar, i11, 13, L4(new s7.n() { // from class: androidx.media3.session.nb
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).l(f11);
            }
        }));
    }

    public f<IBinder> t4() {
        return this.f11932o;
    }

    @Override // androidx.media3.session.o
    public void u0(n nVar, int i11, final int i12, Bundle bundle) {
        if (nVar == null || bundle == null || i12 < 0) {
            return;
        }
        try {
            final p7.y yVarB = p7.y.b(bundle);
            A4(nVar, i11, 20, M4(u4(new e() { // from class: androidx.media3.session.vb
                @Override // androidx.media3.session.le.e
                public final Object a(s8 s8Var, t7.g gVar, int i13) {
                    return s8Var.x0(gVar, com.google.common.collect.x.s(yVarB));
                }
            }, new c() { // from class: androidx.media3.session.wb
                @Override // androidx.media3.session.le.c
                public final void a(oe oeVar, t7.g gVar, List list) {
                    le.r3(this.f12577a, i12, oeVar, gVar, list);
                }
            })));
        } catch (RuntimeException e11) {
            s7.t.j("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e11);
        }
    }

    @Override // androidx.media3.session.o
    public void v1(n nVar, int i11, Bundle bundle) {
        T0(nVar, i11, bundle, true);
    }

    @Override // androidx.media3.session.o
    public void y1(final n nVar, int i11) {
        if (nVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            s8 s8Var = this.f11931n.get();
            if (s8Var != null && !s8Var.u0()) {
                s7.q0.m1(s8Var.X(), new Runnable() { // from class: androidx.media3.session.ib
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11789a.f11932o.u(nVar.asBinder());
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public void y4(t7.g gVar, int i11) {
        B4(gVar, i11, 1, L4(new s7.n() { // from class: androidx.media3.session.pb
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).d();
            }
        }));
    }

    @Override // androidx.media3.session.o
    public void z1(n nVar, int i11, final boolean z11) {
        if (nVar == null) {
            return;
        }
        A4(nVar, i11, 14, L4(new s7.n() { // from class: androidx.media3.session.bd
            @Override // s7.n
            public final void accept(Object obj) {
                ((oe) obj).u(z11);
            }
        }));
    }

    public void z4(final t7.g gVar, int i11) {
        B4(gVar, i11, 1, L4(new s7.n() { // from class: androidx.media3.session.gc
            @Override // s7.n
            public final void accept(Object obj) {
                le.i4(this.f11719a, gVar, (oe) obj);
            }
        }));
    }
}
