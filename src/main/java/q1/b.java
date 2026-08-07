package q1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lq1/n0;", "a", "(Lr2/l;I)Lq1/n0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final n0 a(p020r2.l lVar, int i11) {
        n0 n0Var;
        if (p020r2.o.J()) {
            p020r2.o.S(-1476348564, i11, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)");
        }
        Context context = (Context) lVar.U(AndroidCompositionLocals_androidKt.g());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) lVar.U(m0.a());
        if (overscrollConfiguration != null) {
            lVar.o(1586021609);
            boolean zN = lVar.n(context) | lVar.n(overscrollConfiguration);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(context, overscrollConfiguration);
                lVar.B(objI);
            }
            n0Var = (a) objI;
            lVar.l();
        } else {
            lVar.o(1586120933);
            lVar.l();
            n0Var = k0.f104294a;
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return n0Var;
    }
}
