package p010i90;

import e4.i;
import jn0.h0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import r90.f;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Li90/c1;", "controller", "Ljn0/h0;", "a", "(Li90/c1;Lr2/l;I)V", "", "checked", "", AnnotatedPrivateKey.LABEL, "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e1 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Z)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<Boolean, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c1 f76481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3<Boolean> f76482d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c1 c1Var, y3<Boolean> y3Var) {
            super(1);
            this.f76481c = c1Var;
            this.f76482d = y3Var;
        }

        public final void a(boolean z11) {
            this.f76481c.w(!e1.b(this.f76482d));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Boolean bool) {
            a(bool.booleanValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c1 f76483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f76484d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c1 c1Var, int i11) {
            super(2);
            this.f76483c = c1Var;
            this.f76484d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            e1.a(this.f76483c, lVar, k2.a(this.f76484d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(c1 controller, p020r2.l lVar, int i11) {
        s.k(controller, "controller");
        p020r2.l lVarV = lVar.v(2120438239);
        if (o.J()) {
            o.S(2120438239, i11, -1, "com.stripe.android.uicore.elements.SameAsShippingElementUI (SameAsShippingElementUI.kt:14)");
        }
        y3 y3VarA = f.a(controller.v(), lVarV, 8);
        l.a(null, "SAME_AS_SHIPPING_CHECKBOX_TEST_TAG", b(y3VarA), i.c(c(f.a(controller.getLabel(), lVarV, 8)), lVarV, 0), true, new a(controller, y3VarA), lVarV, 24624, 1);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(controller, i11));
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
