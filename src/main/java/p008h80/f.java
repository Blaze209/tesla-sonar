package p008h80;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.model.h;
import e4.i;
import f90.PrimaryButtonStyle;
import f90.n;
import jn0.h0;
import k3.p1;
import n70.x;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.j1;
import p009i2.v2;
import p009i2.y;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import v1.g0;
import wn0.p;
import wn0.q;
import x30.d;
import z2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f71029a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<g0, l, Integer, h0> f71030b = c.c(334930206, false, a.f71032c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p<l, Integer, h0> f71031c = c.c(-1877684654, false, b.f71033c);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements q<g0, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f71032c = new a();

        a() {
            super(3);
        }

        public final void a(g0 TextButton, l lVar, int i11) {
            s.k(TextButton, "$this$TextButton");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(334930206, i11, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$EditPaymentMethodKt.lambda-1.<anonymous> (EditPaymentMethod.kt:212)");
            }
            v2.b(i.c(x.f93503a0, lVar, 0), null, p1.p(j1.f74525a.a(lVar, j1.f74526b).d(), ((Number) lVar.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, n.i(f90.l.f64654a.b(), lVar, PrimaryButtonStyle.f64601e), lVar, 0, 0, 65530);
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f71033c = new b();

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh80/m;", "it", "Ljn0/h0;", "a", "(Lh80/m;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<m, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f71034c = new a();

            a() {
                super(1);
            }

            public final void a(m it) {
                s.k(it, "it");
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(m mVar) {
                a(mVar);
                return h0.f84049a;
            }
        }

        b() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1877684654, i11, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$EditPaymentMethodKt.lambda-2.<anonymous> (EditPaymentMethod.kt:316)");
            }
            EditPaymentMethodViewState.b bVar = EditPaymentMethodViewState.b.Idle;
            x30.c cVarB = d.b("Card");
            h hVar = h.CartesBancaires;
            l.f(new EditPaymentMethodViewState(bVar, "4242", cVarB, true, new EditPaymentMethodViewState.CardBrandChoice(hVar), v.p(new EditPaymentMethodViewState.CardBrandChoice(h.Visa), new EditPaymentMethodViewState.CardBrandChoice(hVar)), true, false, null, KyberEngine.KyberPolyBytes, null), a.f71034c, null, lVar, 56, 4);
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

    public final q<g0, l, Integer, h0> a() {
        return f71030b;
    }
}
