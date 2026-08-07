package p023w50;

import androidx.compose.ui.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j90.StripeBottomSheetLayoutInfo;
import j90.e;
import j90.f;
import j90.g;
import jn0.h0;
import k3.p1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.q1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import w4.h;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lj90/g;", "state", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "Ljn0/h0;", "onDismissed", "content", "a", "(Lj90/g;Landroidx/compose/ui/d;Lwn0/a;Lwn0/p;Lr2/l;II)V", "Lp50/b;", "bottomSheetNavigator", "b", "(Lp50/b;Lwn0/p;Lr2/l;I)V", "Lj90/d;", "c", "(Lr2/l;I)Lj90/d;", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: w50.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C2581a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f120846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f120847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f120848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f120849f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f120850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f120851h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2581a(g gVar, d dVar, wn0.a<h0> aVar, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f120846c = gVar;
            this.f120847d = dVar;
            this.f120848e = aVar;
            this.f120849f = pVar;
            this.f120850g = i11;
            this.f120851h = i12;
        }

        public final void a(l lVar, int i11) {
            a.a(this.f120846c, this.f120847d, this.f120848e, this.f120849f, lVar, k2.a(this.f120850g | 1), this.f120851h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p50.b f120852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f120853d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f120854e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p50.b bVar, p<? super l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f120852c = bVar;
            this.f120853d = pVar;
            this.f120854e = i11;
        }

        public final void a(l lVar, int i11) {
            a.b(this.f120852c, this.f120853d, lVar, k2.a(this.f120854e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(g state, d dVar, wn0.a<h0> onDismissed, p<? super l, ? super Integer, h0> content, l lVar, int i11, int i12) {
        int i13;
        g gVar;
        wn0.a<h0> aVar;
        p<? super l, ? super Integer, h0> pVar;
        d dVar2;
        s.k(state, "state");
        s.k(onDismissed, "onDismissed");
        s.k(content, "content");
        l lVarV = lVar.v(-1750317962);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.n(dVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & 896) == 0) {
            i13 |= lVarV.K(onDismissed) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i13 |= lVarV.K(content) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && lVarV.b()) {
            lVarV.j();
            pVar = content;
            aVar = onDismissed;
            dVar2 = dVar;
            gVar = state;
        } else {
            if (i14 != 0) {
                dVar = d.INSTANCE;
            }
            d dVar3 = dVar;
            if (o.J()) {
                o.S(-1750317962, i13, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsBottomSheetLayout (BottomSheet.kt:20)");
            }
            StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfoC = c(lVarV, 0);
            int i15 = g.f83152e | (i13 & 14) | (StripeBottomSheetLayoutInfo.f83137d << 3);
            int i16 = i13 << 3;
            f.a(state, stripeBottomSheetLayoutInfoC, dVar3, onDismissed, content, lVarV, i15 | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 0);
            gVar = state;
            aVar = onDismissed;
            pVar = content;
            if (o.J()) {
                o.R();
            }
            dVar2 = dVar3;
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new C2581a(gVar, dVar2, aVar, pVar, i11, i12));
        }
    }

    public static final void b(p50.b bottomSheetNavigator, p<? super l, ? super Integer, h0> content, l lVar, int i11) {
        int i12;
        s.k(bottomSheetNavigator, "bottomSheetNavigator");
        s.k(content, "content");
        l lVarV = lVar.v(-287974409);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(bottomSheetNavigator) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.K(content) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-287974409, i12, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsModalBottomSheetLayout (BottomSheet.kt:36)");
            }
            StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfoC = c(lVarV, 0);
            p50.a.a(bottomSheetNavigator, null, stripeBottomSheetLayoutInfoC.getSheetShape(), BitmapDescriptorFactory.HUE_RED, stripeBottomSheetLayoutInfoC.getSheetBackgroundColor(), 0L, stripeBottomSheetLayoutInfoC.getScrimColor(), content, lVarV, q1.f74975e | (i12 & 14) | ((i12 << 18) & 29360128), 42);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(bottomSheetNavigator, content, i11));
        }
    }

    private static final StripeBottomSheetLayoutInfo c(l lVar, int i11) {
        lVar.H(1404296655);
        if (o.J()) {
            o.S(1404296655, i11, -1, "com.stripe.android.financialconnections.ui.components.rememberFinancialConnectionsBottomSheetLayoutInfo (BottomSheet.kt:49)");
        }
        StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfoA = e.a(h.g(20), p026y50.d.f125064a.a(lVar, 6).getBackgroundSurface(), p1.p(p026y50.a.s(), 0.32f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), lVar, 390, 0);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return stripeBottomSheetLayoutInfoA;
    }
}
