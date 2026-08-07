package j90;

import androidx.compose.ui.platform.z0;
import o4.q0;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.n3;
import p020r2.o;
import p020r2.y3;
import v1.m0;
import v1.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lj90/b;", "a", "(Lr2/l;I)Lj90/b;", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {
    public static final b a(l lVar, int i11) {
        lVar.H(1251392408);
        if (o.J()) {
            o.S(1251392408, i11, -1, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetKeyboardHandler (StripeBottomSheetKeyboardHandler.kt:33)");
        }
        y3 y3VarO = n3.o(Boolean.valueOf(s0.b(m0.INSTANCE, lVar, 8).b((w4.d) lVar.U(z0.g())) > 0), lVar, 0);
        q0 q0Var = (q0) lVar.U(z0.r());
        lVar.H(726699408);
        Object objI = lVar.I();
        if (objI == l.INSTANCE.a()) {
            objI = new b(q0Var, y3VarO);
            lVar.B(objI);
        }
        b bVar = (b) objI;
        lVar.T();
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return bVar;
    }
}
