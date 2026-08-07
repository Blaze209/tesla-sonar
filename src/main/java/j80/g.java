package j80;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import n70.DisplayableSavedPaymentMethod;
import p013kotlin.Metadata;
import p020r2.k2;
import p020r2.w2;
import v1.g0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lj80/f;", "interactor", "Ljn0/h0;", "a", "(Lj80/f;Lr2/l;I)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.q<g0, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DisplayableSavedPaymentMethod f82923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f82924d;

        /* JADX INFO: renamed from: j80.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln70/g;", "it", "Ljn0/h0;", "a", "(Ln70/g;)V"}, k = 3, mv = {1, 9, 0})
        static final class C1743a extends p013kotlin.jvm.internal.u implements wn0.l<DisplayableSavedPaymentMethod, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f f82925c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1743a(f fVar) {
                super(1);
                this.f82925c = fVar;
            }

            public final void a(DisplayableSavedPaymentMethod it) {
                p013kotlin.jvm.internal.s.k(it, "it");
                this.f82925c.a(f.b.a.f82922a);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
                a(displayableSavedPaymentMethod);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DisplayableSavedPaymentMethod displayableSavedPaymentMethod, f fVar) {
            super(3);
            this.f82923c = displayableSavedPaymentMethod;
            this.f82924d = fVar;
        }

        public final void a(g0 SavedPaymentMethodRowButton, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(788393326, i11, -1, "com.stripe.android.paymentsheet.verticalmode.ManageOneSavedPaymentMethodUI.<anonymous> (ManageOneSavedPaymentMethodUI.kt:21)");
            }
            h.a(this.f82923c, new C1743a(this.f82924d), lVar, 8);
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
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f82926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f82927d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, int i11) {
            super(2);
            this.f82926c = fVar;
            this.f82927d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            g.a(this.f82926c, lVar, k2.a(this.f82927d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(f interactor, p020r2.l lVar, int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(interactor, "interactor");
        p020r2.l lVarV = lVar.v(-1713249349);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(interactor) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1713249349, i12, -1, "com.stripe.android.paymentsheet.verticalmode.ManageOneSavedPaymentMethodUI (ManageOneSavedPaymentMethodUI.kt:9)");
            }
            float fA = e4.f.a(n70.t.f93465e, lVarV, 0);
            DisplayableSavedPaymentMethod paymentMethod = interactor.getState().getPaymentMethod();
            p.a(paymentMethod, true, false, false, androidx.compose.foundation.layout.t.k(androidx.compose.ui.d.INSTANCE, fA, BitmapDescriptorFactory.HUE_RED, 2, null), null, z2.c.b(lVarV, 788393326, true, new a(paymentMethod, interactor)), lVarV, 1575992, 36);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(interactor, i11));
        }
    }
}
