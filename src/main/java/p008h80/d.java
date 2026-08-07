package p008h80;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e4.e;
import e4.i;
import jn0.h0;
import n70.x;
import p009i2.C4670d1;
import p009i2.C4671g;
import p009i2.e1;
import p009i2.j1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import v1.g0;
import w4.h;
import w80.n;
import wn0.p;
import wn0.q;
import z2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "isRootScreen", "Lkotlin/Function0;", "Ljn0/h0;", "onButtonClick", "a", "(ZLwn0/a;Lr2/l;I)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements q<g0, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f71013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f71014d;

        /* JADX INFO: renamed from: h80.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class C1492a extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f71015c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1492a(boolean z11) {
                super(2);
                this.f71015c = z11;
            }

            public final void a(l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(782248533, i11, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar.<anonymous>.<anonymous> (AddressOptionsAppBar.kt:29)");
                }
                e1.a(e.c(this.f71015c ? n70.u.f93486r : n70.u.f93475g, lVar, 0), i.c(this.f71015c ? x.F : n.f121502c, lVar, 0), null, f90.n.n(j1.f74525a, lVar, j1.f74526b).getAppBarIcon(), lVar, 8, 4);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.a<h0> aVar, boolean z11) {
            super(3);
            this.f71013c = aVar;
            this.f71014d = z11;
        }

        public final void a(g0 TopAppBar, l lVar, int i11) {
            s.k(TopAppBar, "$this$TopAppBar");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(663677113, i11, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar.<anonymous> (AddressOptionsAppBar.kt:26)");
            }
            C4670d1.a(this.f71013c, null, false, null, c.b(lVar, 782248533, true, new C1492a(this.f71014d)), lVar, 24576, 14);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f71016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f71017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71018e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, wn0.a<h0> aVar, int i11) {
            super(2);
            this.f71016c = z11;
            this.f71017d = aVar;
            this.f71018e = i11;
        }

        public final void a(l lVar, int i11) {
            d.a(this.f71016c, this.f71017d, lVar, k2.a(this.f71018e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(boolean z11, wn0.a<h0> onButtonClick, l lVar, int i11) {
        int i12;
        s.k(onButtonClick, "onButtonClick");
        l lVarV = lVar.v(-111772214);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.K(onButtonClick) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-111772214, i12, -1, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar (AddressOptionsAppBar.kt:20)");
            }
            C4671g.b(androidx.compose.foundation.layout.x.h(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), j1.f74525a.a(lVarV, j1.f74526b).n(), 0L, h.g(0), null, c.b(lVarV, 663677113, true, new a(onButtonClick, z11)), lVarV, 199686, 20);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(z11, onButtonClick, i11));
        }
    }
}
