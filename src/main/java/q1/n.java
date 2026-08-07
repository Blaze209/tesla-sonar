package q1;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Lr2/l;I)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {
    public static final boolean a(p020r2.l lVar, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(-882615028, i11, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z11 = (((Configuration) lVar.U(AndroidCompositionLocals_androidKt.f())).uiMode & 48) == 32;
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return z11;
    }
}
