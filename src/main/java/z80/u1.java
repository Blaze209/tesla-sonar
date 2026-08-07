package z80;

import androidx.compose.ui.platform.s2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.TextStyle;
import java.util.Arrays;
import p009i2.v2;
import p013kotlin.Metadata;
import p014n4.FontWeight;
import p020r2.w2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz80/s1;", "element", "Ljn0/h0;", "a", "(Lz80/s1;Lr2/l;I)V", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class u1 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<g4.y, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f127832c = new a();

        a() {
            super(1);
        }

        public final void a(g4.y semantics) {
            p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g4.y yVar) {
            a(yVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MandateTextElement f127833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f127834d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MandateTextElement mandateTextElement, int i11) {
            super(2);
            this.f127833c = mandateTextElement;
            this.f127834d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            u1.a(this.f127833c, lVar, p020r2.k2.a(this.f127834d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final void a(MandateTextElement element, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(element, "element");
        p020r2.l lVarV = lVar.v(1140239160);
        if (p020r2.o.J()) {
            p020r2.o.S(1140239160, i11, -1, "com.stripe.android.ui.core.elements.MandateTextUI (MandateTextUI.kt:23)");
        }
        int stringResId = element.getStringResId();
        String[] strArr = (String[]) element.f().toArray(new String[0]);
        String strD = e4.i.d(stringResId, Arrays.copyOf(strArr, strArr.length), lVarV, 64);
        p009i2.j1 j1Var = p009i2.j1.f74525a;
        int i12 = p009i2.j1.f74526b;
        v2.b(strD, s2.a(g4.o.c(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, element.getTopPadding(), BitmapDescriptorFactory.HUE_RED, w4.h.g(8), 5, null), true, a.f127832c), "mandate_test_tag"), f90.n.n(j1Var, lVarV, i12).getPlaceholderText(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.e(j1Var.c(lVarV, i12).getCaption(), 0L, 0L, FontWeight.INSTANCE.d(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, t4.j.h(t4.j.INSTANCE.f()), null, 0L, null, null, null, null, null, null, 16744443, null), lVarV, 0, 0, 65528);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(element, i11));
        }
    }
}
