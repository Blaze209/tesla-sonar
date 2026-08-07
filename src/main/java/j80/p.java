package j80;

import androidx.compose.foundation.layout.x;
import androidx.compose.ui.platform.s2;
import com.stripe.android.model.PaymentMethod;
import jn0.h0;
import n70.DisplayableSavedPaymentMethod;
import p008h80.b0;
import p008h80.y;
import p013kotlin.Metadata;
import p020r2.k2;
import p020r2.w2;
import v1.g0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln70/g;", "displayableSavedPaymentMethod", "", "isEnabled", "isClickable", "isSelected", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "Lkotlin/Function1;", "Lv1/g0;", "trailingContent", "a", "(Ln70/g;ZZZLandroidx/compose/ui/d;Lwn0/a;Lwn0/q;Lr2/l;II)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.q<g0, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DisplayableSavedPaymentMethod f83086c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
            super(3);
            this.f83086c = displayableSavedPaymentMethod;
        }

        public final void a(g0 PaymentMethodRowButton, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(284170116, i11, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButton.<anonymous> (SavedPaymentMethodRowButton.kt:49)");
            }
            PaymentMethod.Card card = this.f83086c.getPaymentMethod().card;
            String str = card != null ? card.displayBrand : null;
            int iF = b0.f(this.f83086c.getPaymentMethod(), true);
            d3.c cVarE = d3.c.INSTANCE.e();
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.t.i(androidx.compose.ui.d.INSTANCE, w4.h.g(4));
            r rVar = r.f83096a;
            y.b(iF, null, cVarE, i80.e.b(x.v(x.i(dVarI, rVar.a()), rVar.b()), str), lVar, 432);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, p020r2.l lVar, Integer num) {
            a(g0Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DisplayableSavedPaymentMethod f83087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f83088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f83089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f83090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f83091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f83092h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ wn0.q<g0, p020r2.l, Integer, h0> f83093i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f83094j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f83095k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z11, boolean z12, boolean z13, androidx.compose.ui.d dVar, wn0.a<h0> aVar, wn0.q<? super g0, ? super p020r2.l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f83087c = displayableSavedPaymentMethod;
            this.f83088d = z11;
            this.f83089e = z12;
            this.f83090f = z13;
            this.f83091g = dVar;
            this.f83092h = aVar;
            this.f83093i = qVar;
            this.f83094j = i11;
            this.f83095k = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            p.a(this.f83087c, this.f83088d, this.f83089e, this.f83090f, this.f83091g, this.f83092h, this.f83093i, lVar, k2.a(this.f83094j | 1), this.f83095k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z11, boolean z12, boolean z13, androidx.compose.ui.d dVar, wn0.a<h0> aVar, wn0.q<? super g0, ? super p020r2.l, ? super Integer, h0> qVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        boolean z14;
        int i14;
        p013kotlin.jvm.internal.s.k(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
        p020r2.l lVarV = lVar.v(-1517844735);
        if ((i12 & 4) != 0) {
            i13 = i11;
            i14 = i13 & (-897);
            z14 = z11;
        } else {
            i13 = i11;
            z14 = z12;
            i14 = i13;
        }
        androidx.compose.ui.d dVar2 = (i12 & 16) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        wn0.a<h0> aVar2 = (i12 & 32) != 0 ? a.f83085c : aVar;
        wn0.q<? super g0, ? super p020r2.l, ? super Integer, h0> qVar2 = (i12 & 64) != 0 ? null : qVar;
        if (p020r2.o.J()) {
            p020r2.o.S(-1517844735, i14, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButton (SavedPaymentMethodRowButton.kt:34)");
        }
        String strA = p008h80.a.a(p90.a.a(displayableSavedPaymentMethod.a(), lVarV, 8));
        x30.c cVarD = b0.d(displayableSavedPaymentMethod.getPaymentMethod());
        if (cVarD == null) {
            cVarD = displayableSavedPaymentMethod.getDisplayName();
        }
        String str = displayableSavedPaymentMethod.getPaymentMethod().id;
        String strA2 = p90.a.a(cVarD, lVarV, 8);
        wn0.q<? super g0, ? super p020r2.l, ? super Integer, h0> qVar3 = qVar2;
        wn0.a<h0> aVar3 = aVar2;
        androidx.compose.ui.d dVar3 = dVar2;
        boolean z15 = z14;
        m.a(z11, z13, z15, z2.c.b(lVarV, 284170116, true, new b(displayableSavedPaymentMethod)), strA2, null, aVar3, strA, s2.a(dVar2, "saved_payment_method_row_button_" + str), qVar3, lVarV, ((i14 >> 3) & 14) | 199680 | ((i14 >> 6) & 112) | (i14 & 896) | (3670016 & (i14 << 3)) | ((i14 << 9) & 1879048192), 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(displayableSavedPaymentMethod, z11, z15, z13, dVar3, aVar3, qVar3, i13, i12));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f83085c = new a();

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
