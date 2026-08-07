package z80;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p020r2.w2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz80/l2;", "element", "Ljn0/h0;", "a", "(Lz80/l2;Lr2/l;I)V", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class m2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<g4.y, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f127626c = new a();

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
        final /* synthetic */ StaticTextElement f127627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f127628d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(StaticTextElement staticTextElement, int i11) {
            super(2);
            this.f127627c = staticTextElement;
            this.f127628d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            m2.a(this.f127627c, lVar, p020r2.k2.a(this.f127628d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final void a(StaticTextElement element, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(element, "element");
        p020r2.l lVarV = lVar.v(466172544);
        if (p020r2.o.J()) {
            p020r2.o.S(466172544, i11, -1, "com.stripe.android.ui.core.elements.StaticTextElementUI (StaticTextElementUI.kt:15)");
        }
        p010i90.f0.a(e4.i.c(element.getStringResId(), lVarV, 0), g4.o.c(androidx.compose.foundation.layout.t.k(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, w4.h.g(8), 1, null), true, a.f127626c), lVarV, 0, 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(element, i11));
        }
    }
}
