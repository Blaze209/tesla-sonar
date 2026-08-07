package z80;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import p013kotlin.Metadata;
import p020r2.w2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f127361c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f127361c = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.a(lVar, p020r2.k2.a(this.f127361c | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public static final void a(p020r2.l lVar, int i11) {
        p020r2.l lVarV = lVar.v(-172812001);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-172812001, i11, -1, "com.stripe.android.ui.core.elements.AffirmElementUI (AffirmElementUI.kt:17)");
            }
            String strC = e4.i.c(f30.d0.I, lVarV, 0);
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a("affirm", new q90.b.Drawable(w80.k.f121470a, w80.n.L, null, 4, null)));
            p009i2.j1 j1Var = p009i2.j1.f74525a;
            int i12 = p009i2.j1.f74526b;
            q90.c.b(strC, androidx.compose.foundation.layout.t.k(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, w4.h.g(8), 1, null), mapF, f90.n.n(j1Var, lVarV, i12).getSubtitle(), j1Var.c(lVarV, i12).getH6(), false, null, 0, null, lVarV, (q90.b.Drawable.f105124d << 6) | 48, 480);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(i11));
        }
    }
}
