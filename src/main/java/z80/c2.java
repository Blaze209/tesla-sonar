package z80;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p020r2.w2;
import p020r2.y3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f²\u0006\f\u0010\t\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "Lz80/b2;", "element", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "a", "(ZLz80/b2;Landroidx/compose/ui/d;Lr2/l;II)V", "checked", "", AnnotatedPrivateKey.LABEL, "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c2 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Z)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Boolean, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a2 f127401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3<Boolean> f127402d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a2 a2Var, y3<Boolean> y3Var) {
            super(1);
            this.f127401c = a2Var;
            this.f127402d = y3Var;
        }

        public final void a(boolean z11) {
            this.f127401c.w(!c2.b(this.f127402d));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Boolean bool) {
            a(bool.booleanValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f127403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SaveForFutureUseElement f127404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f127405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f127406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f127407g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, SaveForFutureUseElement saveForFutureUseElement, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f127403c = z11;
            this.f127404d = saveForFutureUseElement;
            this.f127405e = dVar;
            this.f127406f = i11;
            this.f127407g = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            c2.a(this.f127403c, this.f127404d, this.f127405e, lVar, p020r2.k2.a(this.f127406f | 1), this.f127407g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final void a(boolean z11, SaveForFutureUseElement element, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(element, "element");
        p020r2.l lVarV = lVar.v(1061070076);
        if ((i12 & 4) != 0) {
            dVar = androidx.compose.ui.d.INSTANCE;
        }
        androidx.compose.ui.d dVar2 = dVar;
        if (p020r2.o.J()) {
            p020r2.o.S(1061070076, i11, -1, "com.stripe.android.ui.core.elements.SaveForFutureUseElementUI (SaveForFutureUseElementUI.kt:18)");
        }
        a2 controller = element.getController();
        y3 y3VarA = r90.f.a(controller.v(), lVarV, 8);
        y3 y3VarA2 = r90.f.a(controller.getLabel(), lVarV, 8);
        p010i90.l.a(dVar2, "SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG", b(y3VarA), ((Context) lVarV.U(AndroidCompositionLocals_androidKt.g())).getResources().getString(c(y3VarA2), element.getMerchantName()), z11, new a(controller, y3VarA), lVarV, ((i11 >> 6) & 14) | 48 | ((i11 << 12) & 57344), 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(z11, element, dVar2, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(y3<Boolean> y3Var) {
        return y3Var.getValue().booleanValue();
    }

    private static final int c(y3<Integer> y3Var) {
        return y3Var.getValue().intValue();
    }
}
