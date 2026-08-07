package w40;

import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.x;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.n;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import p009i2.v2;
import p011ja.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import p022s40.m;
import p023w50.Function0;
import v1.i;
import v1.i0;
import v50.g;
import w4.h;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a;\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lja/k;", "backStackEntry", "Ljn0/h0;", "a", "(Lja/k;Lr2/l;I)V", "Lv50/g;", "description", "", "loading", "Lkotlin/Function0;", "onExit", "onCancel", "c", "(Lv50/g;ZLwn0/a;Lwn0/a;Lr2/l;I)V", "Lw40/c;", "state", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.a implements wn0.a<h0> {
        a(Object obj) {
            super(0, obj, w40.d.class, "onCloseConfirm", "onCloseConfirm()Lkotlinx/coroutines/Job;", 8);
        }

        public final void b() {
            ((w40.d) this.receiver).v();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: w40.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C2576b extends p implements wn0.a<h0> {
        C2576b(Object obj) {
            super(0, obj, w40.d.class, "onCloseDismiss", "onCloseDismiss()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            o();
            return h0.f84049a;
        }

        public final void o() {
            ((w40.d) this.receiver).w();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements wn0.p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f120766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f120767d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k kVar, int i11) {
            super(2);
            this.f120766c = kVar;
            this.f120767d = i11;
        }

        public final void a(l lVar, int i11) {
            b.a(this.f120766c, lVar, k2.a(this.f120767d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/i;", "Ljn0/h0;", "a", "(Lv1/i;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements q<i, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f120768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f120769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f120770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f120771f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g gVar, boolean z11, wn0.a<h0> aVar, wn0.a<h0> aVar2) {
            super(3);
            this.f120768c = gVar;
            this.f120769d = z11;
            this.f120770e = aVar;
            this.f120771f = aVar2;
        }

        public final void a(i Layout, l lVar, int i11) {
            s.k(Layout, "$this$Layout");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(83429272, i11, -1, "com.stripe.android.financialconnections.features.exit.ExitModalContent.<anonymous> (ExitModal.kt:62)");
            }
            m.c(e4.e.c(i40.i.f75840f, lVar, 0), null, null, null, e4.i.c(i40.k.A, lVar, 0), lVar, 8, 14);
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            i0.a(x.q(companion, h.g(16)), lVar, 6);
            String strC = e4.i.c(i40.k.A, lVar, 0);
            p026y50.d dVar = p026y50.d.f125064a;
            v2.b(strC, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar.b(lVar, 6).getHeadingLarge(), lVar, 0, 0, 65534);
            float f11 = 8;
            i0.a(x.q(companion, h.g(f11)), lVar, 6);
            v2.b(this.f120768c.i2(lVar, 0).toString(), null, dVar.a(lVar, 6).getTextDefault(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar.b(lVar, 6).getBodyMedium(), lVar, 0, 0, 65530);
            i0.a(x.q(companion, h.g(24)), lVar, 6);
            androidx.compose.ui.d dVarH = x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean z11 = !this.f120769d;
            wn0.a<h0> aVar = this.f120770e;
            w40.a aVar2 = w40.a.f120755a;
            Function0.a(aVar, dVarH, null, null, z11, false, aVar2.a(), lVar, 1572912, 44);
            i0.a(x.q(companion, h.g(f11)), lVar, 6);
            androidx.compose.ui.d dVarH2 = x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean z12 = this.f120769d;
            Function0.a(this.f120771f, dVarH2, w50.f.b.f120923a, null, !z12, z12, aVar2.b(), lVar, 1573296, 8);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(i iVar, l lVar, Integer num) {
            a(iVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends u implements wn0.p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f120772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f120773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f120774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f120775f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f120776g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g gVar, boolean z11, wn0.a<h0> aVar, wn0.a<h0> aVar2, int i11) {
            super(2);
            this.f120772c = gVar;
            this.f120773d = z11;
            this.f120774e = aVar;
            this.f120775f = aVar2;
            this.f120776g = i11;
        }

        public final void a(l lVar, int i11) {
            b.c(this.f120772c, this.f120773d, this.f120774e, this.f120775f, lVar, k2.a(this.f120776g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(k backStackEntry, l lVar, int i11) {
        s.k(backStackEntry, "backStackEntry");
        l lVarV = lVar.v(386579450);
        if (o.J()) {
            o.S(386579450, i11, -1, "com.stripe.android.financialconnections.features.exit.ExitModal (ExitModal.kt:30)");
        }
        lVarV.H(1481344674);
        ViewModelProvider.Factory factoryA = w40.d.INSTANCE.a(s50.b.b(lVarV, 0).w().getActivityRetainedComponent(), backStackEntry.c());
        lVarV.H(1729797275);
        f1 f1VarA = n7.a.f93383a.a(lVarV, 6);
        if (f1VarA == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        c1 c1VarC = n7.c.c(w40.d.class, f1VarA, null, factoryA, f1VarA instanceof n ? ((n) f1VarA).getDefaultViewModelCreationExtras() : CreationExtras.a.f8924b, lVarV, 36936, 0);
        lVarV.T();
        lVarV.T();
        w40.d dVar = (w40.d) ((s50.i) c1VarC);
        y3 y3VarA = r90.f.a(dVar.h(), lVarV, 8);
        ExitState.Payload payloadA = b(y3VarA).d().a();
        if (payloadA != null) {
            c(payloadA.getDescription(), b(y3VarA).getClosing(), new a(dVar), new C2576b(dVar), lVarV, 0);
        }
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(backStackEntry, i11));
        }
    }

    private static final ExitState b(y3<ExitState> y3Var) {
        return y3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(g gVar, boolean z11, wn0.a<h0> aVar, wn0.a<h0> aVar2, l lVar, int i11) {
        int i12;
        l lVar2;
        l lVarV = lVar.v(863506792);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(gVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.p(z11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.K(aVar) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= lVarV.K(aVar2) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (o.J()) {
                o.S(863506792, i12, -1, "com.stripe.android.financialconnections.features.exit.ExitModalContent (ExitModal.kt:52)");
            }
            float f11 = 24;
            lVar2 = lVarV;
            p026y50.f.b(null, t.d(h.g(f11), h.g(0), h.g(f11), h.g(f11)), true, false, false, null, false, null, null, z2.c.b(lVarV, 83429272, true, new d(gVar, z11, aVar2, aVar)), lVar2, 805306752, 505);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new e(gVar, z11, aVar, aVar2, i11));
        }
    }
}
