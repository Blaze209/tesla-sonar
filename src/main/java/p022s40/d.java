package p022s40;

import androidx.compose.foundation.layout.t;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import k3.h1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.o;
import p020r2.x;
import p020r2.y2;
import p023w50.C4789j;
import q50.TopAppBarState;
import v1.y;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f109831a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<p015o1.e, p020r2.l, Integer, h0> f109832b = z2.c.c(-822699089, false, a.f109846c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p<p020r2.l, Integer, h0> f109833c = z2.c.c(645670521, false, g.f109853c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static q<y, p020r2.l, Integer, h0> f109834d = z2.c.c(1361912381, false, h.f109855c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static p<p020r2.l, Integer, h0> f109835e = z2.c.c(574843338, false, i.f109856c);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p<p020r2.l, Integer, h0> f109836f = z2.c.c(205785441, false, j.f109857c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static q<h1, p020r2.l, Integer, h0> f109837g = z2.c.c(-983776976, false, k.f109859c);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static q<h1, p020r2.l, Integer, h0> f109838h = z2.c.c(1704498329, false, l.f109860c);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static q<y, p020r2.l, Integer, h0> f109839i = z2.c.c(922027301, false, m.f109861c);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static p<p020r2.l, Integer, h0> f109840j = z2.c.c(134958258, false, n.f109862c);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static p<p020r2.l, Integer, h0> f109841k = z2.c.c(-1205081696, false, b.f109847c);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static q<h1, p020r2.l, Integer, h0> f109842l = z2.c.c(-1477221777, false, c.f109849c);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static q<h1, p020r2.l, Integer, h0> f109843m = z2.c.c(347978968, false, C2333d.f109850c);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static q<y, p020r2.l, Integer, h0> f109844n = z2.c.c(-803806876, false, e.f109851c);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static p<p020r2.l, Integer, h0> f109845o = z2.c.c(-811119631, false, f.f109852c);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/e;", "Ljn0/h0;", "a", "(Lo1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements q<p015o1.e, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f109846c = new a();

        a() {
            super(3);
        }

        public final void a(p015o1.e AnimatedVisibility, p020r2.l lVar, int i11) {
            s.k(AnimatedVisibility, "$this$AnimatedVisibility");
            if (o.J()) {
                o.S(-822699089, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-1.<anonymous> (LoadingContent.kt:202)");
            }
            d3.c cVarE = d3.c.INSTANCE.e();
            lVar.H(733328855);
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            i0 i0VarJ = androidx.compose.foundation.layout.g.j(cVarE, false, lVar, 6);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            x xVarC = lVar.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(companion);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarJ, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            Function1.b(null, lVar, 0, 1);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(p015o1.e eVar, p020r2.l lVar, Integer num) {
            a(eVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/h1;", "it", "Ljn0/h0;", "a", "(Lk3/h1;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements q<h1, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f109849c = new c();

        c() {
            super(3);
        }

        public final void a(h1 it, p020r2.l lVar, int i11) {
            s.k(it, "it");
            if ((i11 & 14) == 0) {
                i11 |= lVar.n(it) ? 4 : 2;
            }
            if ((i11 & 91) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1477221777, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-11.<anonymous> (LoadingContent.kt:320)");
            }
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(h3.e.a(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.h(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), w4.h.g(72)), a2.g.c(w4.h.g(16))), it, null, BitmapDescriptorFactory.HUE_RED, 6, null), lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(h1 h1Var, p020r2.l lVar, Integer num) {
            a(h1Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: s40.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/h1;", "it", "Ljn0/h0;", "a", "(Lk3/h1;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C2333d extends u implements q<h1, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2333d f109850c = new C2333d();

        C2333d() {
            super(3);
        }

        public final void a(h1 it, p020r2.l lVar, int i11) {
            s.k(it, "it");
            if ((i11 & 14) == 0) {
                i11 |= lVar.n(it) ? 4 : 2;
            }
            if ((i11 & 91) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(347978968, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-12.<anonymous> (LoadingContent.kt:329)");
            }
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(h3.e.a(androidx.compose.foundation.layout.x.q(androidx.compose.ui.d.INSTANCE, w4.h.g(100)), a2.g.c(w4.h.g(16))), it, null, BitmapDescriptorFactory.HUE_RED, 6, null), lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(h1 h1Var, p020r2.l lVar, Integer num) {
            a(h1Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv1/y;", "it", "Ljn0/h0;", "a", "(Lv1/y;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements q<y, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f109851c = new e();

        e() {
            super(3);
        }

        public final void a(y it, p020r2.l lVar, int i11) {
            s.k(it, "it");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-803806876, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-13.<anonymous> (LoadingContent.kt:315)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            float f11 = 16;
            androidx.compose.ui.d dVarI = t.i(companion, w4.h.g(f11));
            v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(f11));
            lVar.H(-483455358);
            i0 i0VarA = v1.g.a(fVarN, d3.c.INSTANCE.k(), lVar, 6);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            x xVarC = lVar.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarI);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarA, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            d dVar = d.f109831a;
            Function1.f(dVar.c(), lVar, 6);
            Function1.f(dVar.d(), lVar, 6);
            v1.i0.a(v1.i.b(jVar, companion, 1.0f, false, 2, null), lVar, 0);
            Function1.c(true, null, lVar, 6, 2);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(y yVar, p020r2.l lVar, Integer num) {
            a(yVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f109852c = new f();

        f() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-811119631, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-14.<anonymous> (LoadingContent.kt:307)");
            }
            d dVar = d.f109831a;
            C4789j.a(dVar.b(), dVar.e(), lVar, 54);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv1/y;", "it", "Ljn0/h0;", "a", "(Lv1/y;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements q<y, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f109855c = new h();

        h() {
            super(3);
        }

        public final void a(y it, p020r2.l lVar, int i11) {
            s.k(it, "it");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1361912381, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-3.<anonymous> (LoadingContent.kt:252)");
            }
            Function1.a(lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(y yVar, p020r2.l lVar, Integer num) {
            a(yVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f109856c = new i();

        i() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(574843338, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-4.<anonymous> (LoadingContent.kt:244)");
            }
            d dVar = d.f109831a;
            C4789j.a(dVar.f(), dVar.g(), lVar, 54);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/h1;", "it", "Ljn0/h0;", "a", "(Lk3/h1;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends u implements q<h1, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f109859c = new k();

        k() {
            super(3);
        }

        public final void a(h1 it, p020r2.l lVar, int i11) {
            s.k(it, "it");
            if ((i11 & 14) == 0) {
                i11 |= lVar.n(it) ? 4 : 2;
            }
            if ((i11 & 91) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-983776976, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-6.<anonymous> (LoadingContent.kt:278)");
            }
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(h3.e.a(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.h(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), w4.h.g(72)), a2.g.c(w4.h.g(16))), it, null, BitmapDescriptorFactory.HUE_RED, 6, null), lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(h1 h1Var, p020r2.l lVar, Integer num) {
            a(h1Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk3/h1;", "it", "Ljn0/h0;", "a", "(Lk3/h1;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends u implements q<h1, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f109860c = new l();

        l() {
            super(3);
        }

        public final void a(h1 it, p020r2.l lVar, int i11) {
            s.k(it, "it");
            if ((i11 & 14) == 0) {
                i11 |= lVar.n(it) ? 4 : 2;
            }
            if ((i11 & 91) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1704498329, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-7.<anonymous> (LoadingContent.kt:287)");
            }
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.b.b(h3.e.a(androidx.compose.foundation.layout.x.q(androidx.compose.ui.d.INSTANCE, w4.h.g(100)), a2.g.c(w4.h.g(16))), it, null, BitmapDescriptorFactory.HUE_RED, 6, null), lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(h1 h1Var, p020r2.l lVar, Integer num) {
            a(h1Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv1/y;", "it", "Ljn0/h0;", "a", "(Lv1/y;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class m extends u implements q<y, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f109861c = new m();

        m() {
            super(3);
        }

        public final void a(y it, p020r2.l lVar, int i11) {
            s.k(it, "it");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(922027301, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-8.<anonymous> (LoadingContent.kt:273)");
            }
            float f11 = 16;
            androidx.compose.ui.d dVarI = t.i(androidx.compose.ui.d.INSTANCE, w4.h.g(f11));
            v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(f11));
            lVar.H(-483455358);
            i0 i0VarA = v1.g.a(fVarN, d3.c.INSTANCE.k(), lVar, 6);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            x xVarC = lVar.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarI);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarA, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            d dVar = d.f109831a;
            Function1.f(dVar.i(), lVar, 6);
            Function1.f(dVar.j(), lVar, 6);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(y yVar, p020r2.l lVar, Integer num) {
            a(yVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class n extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f109862c = new n();

        n() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(134958258, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-9.<anonymous> (LoadingContent.kt:265)");
            }
            d dVar = d.f109831a;
            C4789j.a(dVar.h(), dVar.k(), lVar, 54);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public final q<p015o1.e, p020r2.l, Integer, h0> a() {
        return f109832b;
    }

    public final p<p020r2.l, Integer, h0> b() {
        return f109841k;
    }

    public final q<h1, p020r2.l, Integer, h0> c() {
        return f109842l;
    }

    public final q<h1, p020r2.l, Integer, h0> d() {
        return f109843m;
    }

    public final q<y, p020r2.l, Integer, h0> e() {
        return f109844n;
    }

    public final p<p020r2.l, Integer, h0> f() {
        return f109833c;
    }

    public final q<y, p020r2.l, Integer, h0> g() {
        return f109834d;
    }

    public final p<p020r2.l, Integer, h0> h() {
        return f109836f;
    }

    public final q<h1, p020r2.l, Integer, h0> i() {
        return f109837g;
    }

    public final q<h1, p020r2.l, Integer, h0> j() {
        return f109838h;
    }

    public final q<y, p020r2.l, Integer, h0> k() {
        return f109839i;
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f109847c = new b();

        b() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1205081696, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-10.<anonymous> (LoadingContent.kt:309)");
            }
            p023w50.o.c(new TopAppBarState(false, false, false, null, false, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), a.f109848c, lVar, 56);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f109848c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }

            public final void b() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f109853c = new g();

        g() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(645670521, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-2.<anonymous> (LoadingContent.kt:246)");
            }
            p023w50.o.c(new TopAppBarState(false, false, false, null, false, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), a.f109854c, lVar, 56);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f109854c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }

            public final void b() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f109857c = new j();

        j() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(205785441, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-5.<anonymous> (LoadingContent.kt:267)");
            }
            p023w50.o.c(new TopAppBarState(false, false, false, null, false, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), a.f109858c, lVar, 56);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f109858c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }

            public final void b() {
            }
        }
    }
}
