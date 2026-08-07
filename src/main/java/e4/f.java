package e4;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.z0;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "id", "Lw4/h;", "a", "(ILr2/l;I)F", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final float a(int i11, l lVar, int i12) {
        if (o.J()) {
            o.S(804324951, i12, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:75)");
        }
        float fG = w4.h.g(((Context) lVar.U(AndroidCompositionLocals_androidKt.g())).getResources().getDimension(i11) / ((w4.d) lVar.U(z0.g())).getDensity());
        if (o.J()) {
            o.R();
        }
        return fG;
    }
}
