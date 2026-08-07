package d50;

import androidx.compose.foundation.layout.t;
import androidx.compose.ui.platform.s2;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g4.w;
import g4.y;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import p020r2.y2;
import p020r2.y3;
import p023w50.Function0;
import v1.e0;
import v1.g0;
import w1.b0;
import w1.x;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lja/k;", "backStackEntry", "Ljn0/h0;", "e", "(Lja/k;Lr2/l;I)V", "Ld50/c;", "state", "Lkotlin/Function0;", "onContinueClick", "onSkipClicked", DateTokenConverter.CONVERTER_KEY, "(Ld50/c;Lwn0/a;Lwn0/a;Lr2/l;I)V", "c", "(Lr2/l;I)V", "", "loading", "", "secondaryButtonLabel", "b", "(ZILwn0/a;Lwn0/a;Lr2/l;I)V", "", Scopes.EMAIL, "a", "(Ljava/lang/String;Lr2/l;I)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f59561c = new a();

        a() {
            super(1);
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            w.a(semantics, true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: d50.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C1216b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f59562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f59563d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1216b(String str, int i11) {
            super(2);
            this.f59562c = str;
            this.f59563d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.a(this.f59562c, lVar, k2.a(this.f59563d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f59564c = new c();

        c() {
            super(1);
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            w.a(semantics, true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f59565c = new d();

        d() {
            super(1);
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            w.a(semantics, true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f59566c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(wn0.a<h0> aVar) {
            super(0);
            this.f59566c = aVar;
        }

        public final void b() {
            this.f59566c.invoke();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements q<g0, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59567c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i11) {
            super(3);
            this.f59567c = i11;
        }

        public final void a(g0 FinancialConnectionsButton, p020r2.l lVar, int i11) {
            s.k(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1558417036, i11, -1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.Footer.<anonymous>.<anonymous> (NetworkingLinkLoginWarmupScreen.kt:146)");
            }
            v2.b(e4.i.c(this.f59567c, lVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, p020r2.l lVar, Integer num) {
            a(g0Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f59568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f59569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f59570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f59571f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f59572g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z11, int i11, wn0.a<h0> aVar, wn0.a<h0> aVar2, int i12) {
            super(2);
            this.f59568c = z11;
            this.f59569d = i11;
            this.f59570e = aVar;
            this.f59571f = aVar2;
            this.f59572g = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.b(this.f59568c, this.f59569d, this.f59570e, this.f59571f, lVar, k2.a(this.f59572g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59573c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i11) {
            super(2);
            this.f59573c = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.c(lVar, k2.a(this.f59573c | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NetworkingLinkLoginWarmupState f59574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f59575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f59576e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState, wn0.a<h0> aVar, wn0.a<h0> aVar2) {
            super(2);
            this.f59574c = networkingLinkLoginWarmupState;
            this.f59575d = aVar;
            this.f59576e = aVar2;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1983220747, i11, -1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupContent.<anonymous> (NetworkingLinkLoginWarmupScreen.kt:84)");
            }
            b.b((this.f59574c.c() instanceof s50.a.Loading) || this.f59574c.e().a() == null, this.f59574c.g(), this.f59575d, this.f59576e, lVar, 0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/x;", "Ljn0/h0;", "a", "(Lw1/x;)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends u implements wn0.l<x, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NetworkingLinkLoginWarmupState f59577c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/c;", "Ljn0/h0;", "a", "(Lw1/c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements q<w1.c, p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ NetworkingLinkLoginWarmupState f59578c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState) {
                super(3);
                this.f59578c = networkingLinkLoginWarmupState;
            }

            public final void a(w1.c item, p020r2.l lVar, int i11) {
                String email;
                s.k(item, "$this$item");
                if ((i11 & 81) == 16 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(4004632, i11, -1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupContent.<anonymous>.<anonymous> (NetworkingLinkLoginWarmupScreen.kt:81)");
                }
                NetworkingLinkLoginWarmupState.Payload payloadA = this.f59578c.e().a();
                if (payloadA == null || (email = payloadA.getEmail()) == null) {
                    email = "";
                }
                b.a(email, lVar, 0);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(w1.c cVar, p020r2.l lVar, Integer num) {
                a(cVar, lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState) {
            super(1);
            this.f59577c = networkingLinkLoginWarmupState;
        }

        public final void a(x LazyLayout) {
            s.k(LazyLayout, "$this$LazyLayout");
            x.e(LazyLayout, null, null, d50.a.f59556a.a(), 3, null);
            x.e(LazyLayout, null, null, z2.c.c(4004632, true, new a(this.f59577c)), 3, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(x xVar) {
            a(xVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class k extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NetworkingLinkLoginWarmupState f59579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f59580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f59581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f59582f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState, wn0.a<h0> aVar, wn0.a<h0> aVar2, int i11) {
            super(2);
            this.f59579c = networkingLinkLoginWarmupState;
            this.f59580d = aVar;
            this.f59581e = aVar2;
            this.f59582f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.d(this.f59579c, this.f59580d, this.f59581e, lVar, k2.a(this.f59582f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class l extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
        l(Object obj) {
            super(0, obj, d50.d.class, "onSecondaryButtonClicked", "onSecondaryButtonClicked()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            o();
            return h0.f84049a;
        }

        public final void o() {
            ((d50.d) this.receiver).y();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class m extends p013kotlin.jvm.internal.a implements wn0.a<h0> {
        m(Object obj) {
            super(0, obj, d50.d.class, "onContinueClick", "onContinueClick()Lkotlinx/coroutines/Job;", 8);
        }

        public final void b() {
            ((d50.d) this.receiver).x();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class n extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p011ja.k f59583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f59584d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(p011ja.k kVar, int i11) {
            super(2);
            this.f59583c = kVar;
            this.f59584d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.e(this.f59583c, lVar, k2.a(this.f59584d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(String str, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVar2;
        String email = str;
        s.k(email, "email");
        p020r2.l lVarV = lVar.v(-2062236475);
        if ((i11 & 14) == 0) {
            i12 = i11 | (lVarV.n(email) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (o.J()) {
                o.S(-2062236475, i12, -1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.ExistingEmailSection (NetworkingLinkLoginWarmupScreen.kt:155)");
            }
            d3.c.Companion companion = d3.c.INSTANCE;
            d3.c.InterfaceC1212c interfaceC1212cI = companion.i();
            androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
            float f11 = 12;
            androidx.compose.ui.d dVarA = h3.e.a(g4.o.d(androidx.compose.foundation.layout.x.h(companion2, BitmapDescriptorFactory.HUE_RED, 1, null), false, a.f59561c, 1, null), a2.g.c(w4.h.g(f11)));
            float fG = w4.h.g(1);
            p026y50.d dVar = p026y50.d.f125064a;
            androidx.compose.ui.d dVarJ = t.j(q1.e.f(dVarA, fG, dVar.a(lVarV, 6).getBorder(), a2.g.c(w4.h.g(f11))), w4.h.g(16), w4.h.g(f11));
            lVarV.H(693286680);
            i0 i0VarB = e0.b(v1.b.f117444a.f(), interfaceC1212cI, lVarV, 48);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion3 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion3.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarJ);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB, companion3.c());
            d4.b(lVarA, xVarC, companion3.e());
            p<b4.g, Integer, h0> pVarB = companion3.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            d3.c cVarE = companion.e();
            androidx.compose.ui.d dVarC = androidx.compose.foundation.b.c(androidx.compose.foundation.layout.x.q(companion2, w4.h.g(32)), p026y50.a.g(), a2.g.f());
            lVarV.H(733328855);
            i0 i0VarJ = androidx.compose.foundation.layout.g.j(cVarE, false, lVarV, 6);
            lVarV.H(-1323940314);
            int iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            wn0.a<b4.g> aVarA2 = companion3.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA2 = a0.a(dVarC);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarJ, companion3.c());
            d4.b(lVarA2, xVarC2, companion3.e());
            p<b4.g, Integer, h0> pVarB2 = companion3.b();
            if (lVarA2.getInserting() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            v2.b(String.valueOf(Character.toUpperCase(p013kotlin.text.t.p0(email) >= 0 ? email.charAt(0) : '@')), null, p026y50.a.j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar.b(lVarV, 6).getBodySmall(), lVarV, KyberEngine.KyberPolyBytes, 0, 65530);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            v1.i0.a(androidx.compose.foundation.layout.x.q(companion2, w4.h.g(f11)), lVarV, 6);
            lVar2 = lVarV;
            email = str;
            v2.b(email, g0.c(h0Var, companion2, 1.0f, false, 2, null), dVar.a(lVarV, 6).getTextDefault(), 0L, null, null, null, 0L, null, null, 0L, t4.t.INSTANCE.b(), false, 1, 0, null, dVar.b(lVarV, 6).getBodySmall(), lVar2, i12 & 14, 3120, 55288);
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new C1216b(email, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z11, int i11, wn0.a<h0> aVar, wn0.a<h0> aVar2, p020r2.l lVar, int i12) {
        int i13;
        wn0.a<h0> aVar3;
        int i14;
        p020r2.l lVarV = lVar.v(1486039826);
        if ((i12 & 14) == 0) {
            i13 = (lVarV.p(z11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= lVarV.r(i11) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            aVar3 = aVar;
            i13 |= lVarV.K(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar;
        }
        if ((i12 & 7168) == 0) {
            i13 |= lVarV.K(aVar2) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && lVarV.b()) {
            lVarV.j();
            i14 = i11;
        } else {
            if (o.J()) {
                o.S(1486039826, i13, -1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.Footer (NetworkingLinkLoginWarmupScreen.kt:121)");
            }
            lVarV.H(-483455358);
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(companion);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarA, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            Function0.a(aVar3, androidx.compose.foundation.layout.x.h(s2.a(g4.o.d(companion, false, c.f59564c, 1, null), "existing_email-button"), BitmapDescriptorFactory.HUE_RED, 1, null), w50.f.a.f120922a, null, !z11, false, d50.a.f59556a.b(), lVarV, ((i13 >> 6) & 14) | 1769856, 8);
            v1.i0.a(androidx.compose.foundation.layout.x.q(companion, w4.h.g(16)), lVarV, 6);
            boolean z12 = !z11;
            w50.f.b bVar = w50.f.b.f120923a;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(s2.a(g4.o.d(companion, false, d.f59565c, 1, null), "skip-button"), BitmapDescriptorFactory.HUE_RED, 1, null);
            lVarV.H(264474466);
            boolean z13 = (i13 & 7168) == 2048;
            Object objI = lVarV.I();
            if (z13 || objI == p020r2.l.INSTANCE.a()) {
                objI = new e(aVar2);
                lVarV.B(objI);
            }
            lVarV.T();
            i14 = i11;
            Function0.a((wn0.a) objI, dVarH, bVar, null, z12, false, z2.c.b(lVarV, 1558417036, true, new f(i14)), lVarV, 1769856, 8);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(z11, i14, aVar, aVar2, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p020r2.l lVar, int i11) {
        p020r2.l lVar2;
        p020r2.l lVarV = lVar.v(706618988);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (o.J()) {
                o.S(706618988, i11, -1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.HeaderSection (NetworkingLinkLoginWarmupScreen.kt:95)");
            }
            v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(16));
            lVarV.H(-483455358);
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            i0 i0VarA = v1.g.a(fVarN, d3.c.INSTANCE.k(), lVarV, 6);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(companion);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarA, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            p022s40.m.c(e4.e.c(i40.i.f75841g, lVarV, 0), null, null, null, e4.i.c(i40.k.X, lVarV, 0), lVarV, 8, 14);
            String strC = e4.i.c(i40.k.X, lVarV, 0);
            p026y50.d dVar = p026y50.d.f125064a;
            lVar2 = lVarV;
            v2.b(strC, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar.b(lVarV, 6).getHeadingLarge(), lVar2, 0, 0, 65534);
            v2.b(e4.i.c(i40.k.W, lVar2, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar.b(lVar2, 6).getBodyMedium(), lVar2, 0, 0, 65534);
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new h(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState, wn0.a<h0> aVar, wn0.a<h0> aVar2, p020r2.l lVar, int i11) {
        p020r2.l lVarV = lVar.v(41890616);
        if (o.J()) {
            o.S(41890616, i11, -1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupContent (NetworkingLinkLoginWarmupScreen.kt:70)");
        }
        p026y50.f.d(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.h(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), p026y50.d.f125064a.a(lVarV, 6).getBackgroundSurface(), null, 2, null), null, true, false, false, v1.b.f117444a.n(w4.h.g(24)), false, b0.c(0, 0, lVarV, 0, 3), z2.c.b(lVarV, 1983220747, true, new i(networkingLinkLoginWarmupState, aVar, aVar2)), new j(networkingLinkLoginWarmupState), lVarV, 100860288, 90);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new k(networkingLinkLoginWarmupState, aVar, aVar2, i11));
        }
    }

    public static final void e(p011ja.k backStackEntry, p020r2.l lVar, int i11) {
        s.k(backStackEntry, "backStackEntry");
        p020r2.l lVarV = lVar.v(-1742567853);
        if (o.J()) {
            o.S(-1742567853, i11, -1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupScreen (NetworkingLinkLoginWarmupScreen.kt:53)");
        }
        lVarV.H(1481344674);
        ViewModelProvider.Factory factoryA = d50.d.INSTANCE.a(s50.b.b(lVarV, 0).w().getActivityRetainedComponent(), backStackEntry.c());
        lVarV.H(1729797275);
        f1 f1VarA = n7.a.f93383a.a(lVarV, 6);
        if (f1VarA == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        c1 c1VarC = n7.c.c(d50.d.class, f1VarA, null, factoryA, f1VarA instanceof androidx.p003lifecycle.n ? ((androidx.p003lifecycle.n) f1VarA).getDefaultViewModelCreationExtras() : CreationExtras.a.f8924b, lVarV, 36936, 0);
        lVarV.T();
        lVarV.T();
        d50.d dVar = (d50.d) ((s50.i) c1VarC);
        d(f(r90.f.a(dVar.h(), lVarV, 8)), new m(dVar), new l(dVar), lVarV, 8);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new n(backStackEntry, i11));
        }
    }

    private static final NetworkingLinkLoginWarmupState f(y3<NetworkingLinkLoginWarmupState> y3Var) {
        return y3Var.getValue();
    }
}
