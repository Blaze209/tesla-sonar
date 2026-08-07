package g50;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.x;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e4.i;
import i40.k;
import jn0.h0;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.l;
import p020r2.o;
import p020r2.y2;
import p022s40.Function1;
import v1.g0;
import w4.h;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f67344a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<g0, l, Integer, h0> f67345b = z2.c.c(-1966495693, false, C1380a.f67347c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q<w1.c, l, Integer, h0> f67346c = z2.c.c(1291129067, false, b.f67348c);

    /* JADX INFO: renamed from: g50.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C1380a extends u implements q<g0, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1380a f67347c = new C1380a();

        C1380a() {
            super(3);
        }

        public final void a(g0 FinancialConnectionsButton, l lVar, int i11) {
            s.k(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1966495693, i11, -1, "com.stripe.android.financialconnections.features.networkingsavetolinkverification.ComposableSingletons$NetworkingSaveToLinkVerificationScreenKt.lambda-1.<anonymous> (NetworkingSaveToLinkVerificationScreen.kt:153)");
            }
            v2.b(i.c(k.Y, lVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, l lVar, Integer num) {
            a(g0Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw1/c;", "Ljn0/h0;", "a", "(Lw1/c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements q<w1.c, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f67348c = new b();

        b() {
            super(3);
        }

        public final void a(w1.c item, l lVar, int i11) {
            s.k(item, "$this$item");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1291129067, i11, -1, "com.stripe.android.financialconnections.features.networkingsavetolinkverification.ComposableSingletons$NetworkingSaveToLinkVerificationScreenKt.lambda-2.<anonymous> (NetworkingSaveToLinkVerificationScreen.kt:136)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarH = x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            d3.c cVarE = d3.c.INSTANCE.e();
            lVar.H(733328855);
            i0 i0VarJ = g.j(cVarE, false, lVar, 6);
            lVar.H(-1323940314);
            int iA = j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarH);
            if (lVar.w() == null) {
                j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            l lVarA = d4.a(lVar);
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
            Function1.g(x.q(companion, h.g(24)), BitmapDescriptorFactory.HUE_RED, null, lVar, 6, 6);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(w1.c cVar, l lVar, Integer num) {
            a(cVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public final q<g0, l, Integer, h0> a() {
        return f67345b;
    }

    public final q<w1.c, l, Integer, h0> b() {
        return f67346c;
    }
}
