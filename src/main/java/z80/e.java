package z80;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i4.SpanStyle;
import java.util.Map;
import p013kotlin.Metadata;
import p020r2.w2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "enabled", "Lz80/f;", "element", "Ljn0/h0;", "a", "(ZLz80/f;Lr2/l;I)V", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AfterpayClearpayHeaderElement f127439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f127440d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AfterpayClearpayHeaderElement afterpayClearpayHeaderElement, Context context) {
            super(0);
            this.f127439c = afterpayClearpayHeaderElement;
            this.f127440d = context;
        }

        public final void b() {
            this.f127440d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f127439c.f())));
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f127441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AfterpayClearpayHeaderElement f127442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f127443e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, AfterpayClearpayHeaderElement afterpayClearpayHeaderElement, int i11) {
            super(2);
            this.f127441c = z11;
            this.f127442d = afterpayClearpayHeaderElement;
            this.f127443e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            e.a(this.f127441c, this.f127442d, lVar, p020r2.k2.a(this.f127443e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final void a(boolean z11, AfterpayClearpayHeaderElement element, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(element, "element");
        p020r2.l lVarV = lVar.v(1959271317);
        if (p020r2.o.J()) {
            p020r2.o.S(1959271317, i11, -1, "com.stripe.android.ui.core.elements.AfterpayClearpayElementUI (AfterpayClearpayElementUI.kt:27)");
        }
        Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
        Resources resources = context.getResources();
        p013kotlin.jvm.internal.s.j(resources, "getResources(...)");
        String strV = p013kotlin.text.t.V(element.g(resources), "<img/>", "<img src=\"afterpay\"/>", false, 4, null);
        AfterpayClearpayHeaderElement.Companion companion = AfterpayClearpayHeaderElement.INSTANCE;
        int i12 = companion.a() ? w80.k.f121472c : w80.k.f121471b;
        int i13 = companion.a() ? w80.n.Y : w80.n.M;
        p009i2.j1 j1Var = p009i2.j1.f74525a;
        int i14 = p009i2.j1.f74526b;
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a("afterpay", new q90.b.Drawable(i12, i13, f90.n.s(j1Var.a(lVarV, i14).n()) ? null : k3.q1.Companion.b(k3.q1.INSTANCE, k3.p1.INSTANCE.k(), 0, 2, null))));
        float f11 = 4;
        q90.c.b(strV, androidx.compose.foundation.layout.t.l(androidx.compose.ui.d.INSTANCE, w4.h.g(f11), w4.h.g(8), w4.h.g(f11), w4.h.g(f11)), mapF, f90.n.n(j1Var, lVarV, i14).getSubtitle(), j1Var.c(lVarV, i14).getH6(), z11, new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null), i4.x.INSTANCE.b(), new a(element, context), lVarV, (q90.b.Drawable.f105124d << 6) | 1572912 | ((i11 << 15) & 458752), 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(z11, element, i11));
        }
    }
}
