package w4;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lw4/d;", "a", "(Landroid/content/Context;)Lw4/d;", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final d a(Context context) {
        float f11 = context.getResources().getConfiguration().fontScale;
        float f12 = context.getResources().getDisplayMetrics().density;
        x4.a aVarB = x4.b.f122744a.b(f11);
        if (aVarB == null) {
            aVarB = new LinearFontScaleConverter(f11);
        }
        return new DensityWithConverter(f12, f11, aVarB);
    }
}
