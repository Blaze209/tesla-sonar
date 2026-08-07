package e4;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/content/res/Resources;", "a", "(Lr2/l;I)Landroid/content/res/Resources;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final Resources a(l lVar, int i11) {
        if (o.J()) {
            o.S(1554054999, i11, -1, "androidx.compose.ui.res.resources (Resources.android.kt:33)");
        }
        lVar.U(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) lVar.U(AndroidCompositionLocals_androidKt.g())).getResources();
        if (o.J()) {
            o.R();
        }
        return resources;
    }
}
