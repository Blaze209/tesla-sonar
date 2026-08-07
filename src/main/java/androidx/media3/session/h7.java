package androidx.media3.session;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
class h7 extends eb {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final t7.f f11738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i7 f11739n;

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements t7.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ha.n.b f11741b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f11740a = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<d> f11742c = new ArrayList();

        public b(ha.n.b bVar) {
            this.f11741b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H(t7.g gVar, String str, Bundle bundle, ha.g.l<List<ha.e.h>> lVar) {
            synchronized (this.f11740a) {
                this.f11742c.add(new d(gVar, gVar.g(), str, bundle, lVar));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return Objects.equals(this.f11741b, ((b) obj).f11741b);
            }
            return false;
        }

        public int hashCode() {
            return u5.c.b(this.f11741b);
        }
    }

    private final class c implements t7.f {
        private c() {
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t7.g f11745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ha.n.b f11746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f11747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f11748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ha.g.l<List<ha.e.h>> f11749e;

        public d(t7.g gVar, ha.n.b bVar, String str, Bundle bundle, ha.g.l<List<ha.e.h>> lVar) {
            this.f11745a = gVar;
            this.f11746b = bVar;
            this.f11747c = str;
            this.f11748d = bundle;
            this.f11749e = lVar;
        }
    }

    public h7(i7 i7Var) {
        super(i7Var);
        this.f11739n = i7Var;
        this.f11738m = new c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void A(com.google.common.util.concurrent.s sVar, ha.g.l lVar) {
        try {
            lVar.g((ha.e.h) sVar.get());
        } catch (InterruptedException | CancellationException | ExecutionException e11) {
            s7.t.j("MLSLegacyStub", "Library operation failed", e11);
            lVar.g(null);
        }
    }

    public static /* synthetic */ void B(h7 h7Var, t7.g gVar, ha.g.l lVar, String str, Bundle bundle) {
        if (!h7Var.v().r(gVar, 50005)) {
            lVar.g(null);
            return;
        }
        ((b) s7.a.j(gVar.c())).H(gVar, str, bundle, lVar);
        U(h7Var.f11739n.b1(gVar, str, LegacyConversions.u(h7Var.f11739n.a0(), bundle)));
    }

    public static /* synthetic */ void C(h7 h7Var, AtomicInteger atomicInteger, com.google.common.collect.x xVar, List list, com.google.common.util.concurrent.a0 a0Var) {
        h7Var.getClass();
        if (atomicInteger.incrementAndGet() == xVar.size()) {
            h7Var.T(list, xVar, a0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    public static /* synthetic */ void D(h7 h7Var, t7.g gVar, ha.g.l lVar, Bundle bundle, String str) {
        t7.g gVar2;
        String str2;
        if (!h7Var.v().r(gVar, 50003)) {
            lVar.g(null);
            return;
        }
        if (bundle != null) {
            bundle.setClassLoader(h7Var.f11739n.a0().getClassLoader());
            try {
                int i11 = bundle.getInt("android.media.browse.extra.PAGE");
                int i12 = bundle.getInt("android.media.browse.extra.PAGE_SIZE");
                if (i11 < 0 || i12 <= 0) {
                    gVar2 = gVar;
                    str2 = str;
                } else {
                    try {
                        gVar2 = gVar;
                        str2 = str;
                        try {
                            X(lVar, s7.q0.M1(h7Var.f11739n.X0(gVar, str, i11, i12, LegacyConversions.u(h7Var.f11739n.a0(), bundle)), h7Var.Q()));
                            return;
                        } catch (BadParcelableException unused) {
                        }
                    } catch (BadParcelableException unused2) {
                        gVar2 = gVar;
                        str2 = str;
                    }
                }
            } catch (BadParcelableException unused3) {
            }
        } else {
            gVar2 = gVar;
            str2 = str;
        }
        X(lVar, s7.q0.M1(h7Var.f11739n.X0(gVar2, str2, 0, Integer.MAX_VALUE, null), h7Var.Q()));
    }

    public static /* synthetic */ void E(com.google.common.util.concurrent.a0 a0Var, List list) {
        if (a0Var.isCancelled()) {
            O(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void F(com.google.common.util.concurrent.s sVar, ha.g.l lVar) {
        try {
            lVar.g(((ga.v) s7.a.g((ga.v) sVar.get(), "SessionResult must not be null")).f67785b);
        } catch (InterruptedException | CancellationException | ExecutionException e11) {
            s7.t.j("MLSLegacyStub", "Custom action failed", e11);
            lVar.f(null);
        }
    }

    public static /* synthetic */ void G(com.google.common.util.concurrent.a0 a0Var, com.google.common.util.concurrent.s sVar) {
        if (a0Var.isCancelled()) {
            sVar.cancel(false);
        }
    }

    public static /* synthetic */ void H(h7 h7Var, t7.g gVar, ha.g.l lVar, String str) {
        if (h7Var.v().r(gVar, 50004)) {
            W(lVar, s7.q0.M1(h7Var.f11739n.Y0(gVar, str), h7Var.P()));
        } else {
            lVar.g(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.google.common.util.concurrent.s I(h7 h7Var, ga.g gVar) {
        V v11;
        h7Var.getClass();
        s7.a.g(gVar, "LibraryResult must not be null");
        final com.google.common.util.concurrent.a0 a0VarQ = com.google.common.util.concurrent.a0.Q();
        if (gVar.f67683a != 0 || (v11 = gVar.f67685c) == 0) {
            a0VarQ.M(null);
            return a0VarQ;
        }
        final p7.y yVar = (p7.y) v11;
        p7.e0 e0Var = yVar.f101685e;
        if (e0Var.f101286k == null) {
            a0VarQ.M(LegacyConversions.d(yVar, null));
            return a0VarQ;
        }
        final com.google.common.util.concurrent.s<Bitmap> sVarA = h7Var.f11739n.Y().a(e0Var.f101286k);
        a0VarQ.b(new Runnable() { // from class: androidx.media3.session.u6
            @Override // java.lang.Runnable
            public final void run() {
                h7.G(a0VarQ, sVarA);
            }
        }, com.google.common.util.concurrent.w.b());
        sVarA.b(new Runnable() { // from class: androidx.media3.session.v6
            @Override // java.lang.Runnable
            public final void run() {
                h7.L(sVarA, a0VarQ, yVar);
            }
        }, com.google.common.util.concurrent.w.b());
        return a0VarQ;
    }

    public static /* synthetic */ void J(h7 h7Var, String str, t7.g gVar, ha.g.l lVar, Bundle bundle) {
        h7Var.getClass();
        se seVar = new se(str, Bundle.EMPTY);
        if (h7Var.v().s(gVar, seVar)) {
            V(lVar, h7Var.f11739n.z0(gVar, seVar, bundle));
        } else {
            lVar.f(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.google.common.util.concurrent.s K(final h7 h7Var, ga.g gVar) {
        V v11;
        h7Var.getClass();
        s7.a.g(gVar, "LibraryResult must not be null");
        final com.google.common.util.concurrent.a0 a0VarQ = com.google.common.util.concurrent.a0.Q();
        if (gVar.f67683a != 0 || (v11 = gVar.f67685c) == 0) {
            a0VarQ.M(null);
            return a0VarQ;
        }
        final com.google.common.collect.x xVar = (com.google.common.collect.x) v11;
        if (xVar.isEmpty()) {
            a0VarQ.M(new ArrayList());
            return a0VarQ;
        }
        final ArrayList arrayList = new ArrayList();
        a0VarQ.b(new Runnable() { // from class: androidx.media3.session.w6
            @Override // java.lang.Runnable
            public final void run() {
                h7.E(a0VarQ, arrayList);
            }
        }, com.google.common.util.concurrent.w.b());
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        Runnable runnable = new Runnable() { // from class: androidx.media3.session.x6
            @Override // java.lang.Runnable
            public final void run() {
                h7.C(this.f12611a, atomicInteger, xVar, arrayList, a0VarQ);
            }
        };
        for (int i11 = 0; i11 < xVar.size(); i11++) {
            p7.e0 e0Var = ((p7.y) xVar.get(i11)).f101685e;
            if (e0Var.f101286k == null) {
                arrayList.add(null);
                runnable.run();
            } else {
                com.google.common.util.concurrent.s<Bitmap> sVarA = h7Var.f11739n.Y().a(e0Var.f101286k);
                arrayList.add(sVarA);
                sVarA.b(runnable, com.google.common.util.concurrent.w.b());
            }
        }
        return a0VarQ;
    }

    public static /* synthetic */ void L(com.google.common.util.concurrent.s sVar, com.google.common.util.concurrent.a0 a0Var, p7.y yVar) {
        Bitmap bitmap;
        try {
            bitmap = (Bitmap) com.google.common.util.concurrent.m.b(sVar);
        } catch (CancellationException | ExecutionException e11) {
            s7.t.c("MLSLegacyStub", "failed to get bitmap", e11);
            bitmap = null;
        }
        a0Var.M(LegacyConversions.d(yVar, bitmap));
    }

    public static /* synthetic */ void M(com.google.common.util.concurrent.s sVar, ha.g.l lVar) {
        try {
            List list = (List) sVar.get();
            lVar.g(list == null ? null : me.j(list, 262144));
        } catch (InterruptedException | CancellationException | ExecutionException e11) {
            s7.t.j("MLSLegacyStub", "Library operation failed", e11);
            lVar.g(null);
        }
    }

    public static /* synthetic */ void N(h7 h7Var, AtomicReference atomicReference, t7.g gVar, q6 q6Var, s7.m mVar) {
        atomicReference.set(h7Var.f11739n.Z0(gVar, q6Var));
        mVar.f();
    }

    private static <T> void O(List<com.google.common.util.concurrent.s<T>> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11) != null) {
                list.get(i11).cancel(false);
            }
        }
    }

    private com.google.common.util.concurrent.f<ga.g<p7.y>, ha.e.h> P() {
        return new com.google.common.util.concurrent.f() { // from class: androidx.media3.session.s6
            @Override // com.google.common.util.concurrent.f
            public final com.google.common.util.concurrent.s apply(Object obj) {
                return h7.I(this.f12270a, (ga.g) obj);
            }
        };
    }

    private com.google.common.util.concurrent.f<ga.g<com.google.common.collect.x<p7.y>>, List<ha.e.h>> Q() {
        return new com.google.common.util.concurrent.f() { // from class: androidx.media3.session.f7
            @Override // com.google.common.util.concurrent.f
            public final com.google.common.util.concurrent.s apply(Object obj) {
                return h7.K(this.f11673a, (ga.g) obj);
            }
        };
    }

    private t7.g S() {
        return v().k(d());
    }

    private void T(List<com.google.common.util.concurrent.s<Bitmap>> list, List<p7.y> list2, com.google.common.util.concurrent.a0<List<ha.e.h>> a0Var) {
        Bitmap bitmap;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            com.google.common.util.concurrent.s<Bitmap> sVar = list.get(i11);
            if (sVar != null) {
                try {
                    bitmap = (Bitmap) com.google.common.util.concurrent.m.b(sVar);
                } catch (CancellationException | ExecutionException e11) {
                    s7.t.c("MLSLegacyStub", "Failed to get bitmap", e11);
                    bitmap = null;
                }
            } else {
                bitmap = null;
            }
            arrayList.add(LegacyConversions.d(list2.get(i11), bitmap));
        }
        a0Var.M(arrayList);
    }

    private static <T> void U(Future<T> future) {
    }

    private static void V(final ha.g.l<Bundle> lVar, final com.google.common.util.concurrent.s<ga.v> sVar) {
        sVar.b(new Runnable() { // from class: androidx.media3.session.t6
            @Override // java.lang.Runnable
            public final void run() {
                h7.F(sVar, lVar);
            }
        }, com.google.common.util.concurrent.w.b());
    }

    private static void W(final ha.g.l<ha.e.h> lVar, final com.google.common.util.concurrent.s<ha.e.h> sVar) {
        sVar.b(new Runnable() { // from class: androidx.media3.session.e7
            @Override // java.lang.Runnable
            public final void run() {
                h7.A(sVar, lVar);
            }
        }, com.google.common.util.concurrent.w.b());
    }

    private static void X(final ha.g.l<List<ha.e.h>> lVar, final com.google.common.util.concurrent.s<List<ha.e.h>> sVar) {
        sVar.b(new Runnable() { // from class: androidx.media3.session.g7
            @Override // java.lang.Runnable
            public final void run() {
                h7.M(sVar, lVar);
            }
        }, com.google.common.util.concurrent.w.b());
    }

    public static /* synthetic */ void y(h7 h7Var, t7.g gVar, Bundle bundle, String str) {
        if (h7Var.v().r(gVar, 50001)) {
            U(h7Var.f11739n.c1(gVar, str, LegacyConversions.u(h7Var.f11739n.a0(), bundle)));
        }
    }

    public static /* synthetic */ void z(h7 h7Var, t7.g gVar, String str) {
        if (h7Var.v().r(gVar, 50002)) {
            U(h7Var.f11739n.d1(gVar, str));
        }
    }

    public t7.f R() {
        return this.f11738m;
    }

    @Override // ha.g
    public void f(final String str, final Bundle bundle, final ha.g.l<Bundle> lVar) {
        final t7.g gVarS = S();
        if (gVarS == null) {
            lVar.f(null);
        } else {
            lVar.a();
            s7.q0.m1(this.f11739n.X(), new Runnable() { // from class: androidx.media3.session.z6
                @Override // java.lang.Runnable
                public final void run() {
                    h7.J(this.f12665a, str, gVarS, lVar, bundle);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.session.eb, ha.g
    public ha.g.e g(String str, int i11, Bundle bundle) {
        final t7.g gVarS;
        ga.g gVar;
        if (super.g(str, i11, bundle) == null || (gVarS = S()) == null || !v().r(gVarS, 50000)) {
            return null;
        }
        final q6 q6VarU = LegacyConversions.u(this.f11739n.a0(), bundle);
        final AtomicReference atomicReference = new AtomicReference();
        final s7.m mVar = new s7.m();
        s7.q0.m1(this.f11739n.X(), new Runnable() { // from class: androidx.media3.session.r6
            @Override // java.lang.Runnable
            public final void run() {
                h7.N(this.f12187a, atomicReference, gVarS, q6VarU, mVar);
            }
        });
        try {
            mVar.a();
            gVar = (ga.g) s7.a.g((ga.g) ((com.google.common.util.concurrent.s) atomicReference.get()).get(), "LibraryResult must not be null");
        } catch (InterruptedException | CancellationException | ExecutionException e11) {
            s7.t.e("MLSLegacyStub", "Couldn't get a result from onGetLibraryRoot", e11);
            gVar = null;
        }
        if (gVar == null || gVar.f67683a != 0 || gVar.f67685c == 0) {
            if (gVar == null || gVar.f67683a == 0) {
                return me.f11983a;
            }
            return null;
        }
        q6 q6Var = gVar.f67687e;
        Bundle bundleX = q6Var != null ? LegacyConversions.X(q6Var) : new Bundle();
        ((Bundle) s7.a.f(bundleX)).putBoolean("android.media.browse.SEARCH_SUPPORTED", v().r(gVarS, 50005));
        com.google.common.collect.x<androidx.media3.session.a> xVarZ = this.f11739n.Z();
        if (!xVarZ.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (int i12 = 0; i12 < xVarZ.size(); i12++) {
                androidx.media3.session.a aVar = xVarZ.get(i12);
                se seVar = aVar.f11456a;
                if (seVar != null && seVar.f12347a == 0) {
                    arrayList.add(LegacyConversions.g(aVar));
                }
            }
            if (!arrayList.isEmpty()) {
                bundleX.putParcelableArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ROOT_LIST", arrayList);
            }
        }
        return new ha.g.e(((p7.y) gVar.f67685c).f101681a, bundleX);
    }

    @Override // androidx.media3.session.eb, ha.g
    public void h(String str, ha.g.l<List<ha.e.h>> lVar) {
        i(str, lVar, null);
    }

    @Override // ha.g
    public void i(final String str, final ha.g.l<List<ha.e.h>> lVar, final Bundle bundle) {
        final t7.g gVarS = S();
        if (gVarS == null) {
            lVar.g(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            lVar.a();
            s7.q0.m1(this.f11739n.X(), new Runnable() { // from class: androidx.media3.session.a7
                @Override // java.lang.Runnable
                public final void run() {
                    h7.D(this.f11488a, gVarS, lVar, bundle, str);
                }
            });
            return;
        }
        s7.t.i("MLSLegacyStub", "onLoadChildren(): Ignoring empty parentId from " + gVarS);
        lVar.g(null);
    }

    @Override // ha.g
    public void j(final String str, final ha.g.l<ha.e.h> lVar) {
        final t7.g gVarS = S();
        if (gVarS == null) {
            lVar.g(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            lVar.a();
            s7.q0.m1(this.f11739n.X(), new Runnable() { // from class: androidx.media3.session.b7
                @Override // java.lang.Runnable
                public final void run() {
                    h7.H(this.f11525a, gVarS, lVar, str);
                }
            });
            return;
        }
        s7.t.i("MLSLegacyStub", "Ignoring empty itemId from " + gVarS);
        lVar.g(null);
    }

    @Override // ha.g
    public void k(final String str, final Bundle bundle, final ha.g.l<List<ha.e.h>> lVar) {
        final t7.g gVarS = S();
        if (gVarS == null) {
            lVar.g(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if (gVarS.c() instanceof b) {
                lVar.a();
                s7.q0.m1(this.f11739n.X(), new Runnable() { // from class: androidx.media3.session.c7
                    @Override // java.lang.Runnable
                    public final void run() {
                        h7.B(this.f11567a, gVarS, lVar, str, bundle);
                    }
                });
                return;
            }
            return;
        }
        s7.t.i("MLSLegacyStub", "Ignoring empty query from " + gVarS);
        lVar.g(null);
    }

    @Override // ha.g
    @SuppressLint({"RestrictedApi"})
    public void l(final String str, final Bundle bundle) {
        final t7.g gVarS = S();
        if (gVarS == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            s7.q0.m1(this.f11739n.X(), new Runnable() { // from class: androidx.media3.session.y6
                @Override // java.lang.Runnable
                public final void run() {
                    h7.y(this.f12635a, gVarS, bundle, str);
                }
            });
            return;
        }
        s7.t.i("MLSLegacyStub", "onSubscribe(): Ignoring empty id from " + gVarS);
    }

    @Override // ha.g
    @SuppressLint({"RestrictedApi"})
    public void m(final String str) {
        final t7.g gVarS = S();
        if (gVarS == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            s7.q0.m1(this.f11739n.X(), new Runnable() { // from class: androidx.media3.session.d7
                @Override // java.lang.Runnable
                public final void run() {
                    h7.z(this.f11604a, gVarS, str);
                }
            });
            return;
        }
        s7.t.i("MLSLegacyStub", "onUnsubscribe(): Ignoring empty id from " + gVarS);
    }

    @Override // androidx.media3.session.eb
    public t7.g u(ha.n.b bVar, Bundle bundle) {
        return new t7.g(bVar, 0, 0, w().b(bVar), new b(bVar), bundle, LegacyConversions.f0(bundle));
    }
}
