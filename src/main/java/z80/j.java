package z80;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p020r2.w2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz80/k;", "element", "Ljn0/h0;", "a", "(Lz80/k;Lr2/l;I)V", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AuBecsDebitMandateTextElement f127557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f127558d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AuBecsDebitMandateTextElement auBecsDebitMandateTextElement, int i11) {
            super(2);
            this.f127557c = auBecsDebitMandateTextElement;
            this.f127558d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            j.a(this.f127557c, lVar, p020r2.k2.a(this.f127558d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final void a(AuBecsDebitMandateTextElement element, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(element, "element");
        p020r2.l lVarV = lVar.v(-839067707);
        if (p020r2.o.J()) {
            p020r2.o.S(-839067707, i11, -1, "com.stripe.android.ui.core.elements.AuBecsDebitMandateElementUI (AuBecsDebitMandateElementUI.kt:17)");
        }
        int i12 = f30.d0.L;
        String merchantName = element.getMerchantName();
        if (merchantName == null) {
            merchantName = "";
        }
        String strD = e4.i.d(i12, new Object[]{merchantName}, lVarV, 64);
        p009i2.j1 j1Var = p009i2.j1.f74525a;
        int i13 = p009i2.j1.f74526b;
        q90.c.b(strD, androidx.compose.foundation.layout.t.k(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, w4.h.g(8), 1, null), null, f90.n.n(j1Var, lVarV, i13).getSubtitle(), j1Var.c(lVarV, i13).getBody2(), false, null, 0, null, lVarV, 48, 484);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(element, i11));
        }
    }
}
