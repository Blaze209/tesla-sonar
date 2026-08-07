package p014n4;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln4/o0;", "a", "()Ln4/o0;", "Landroid/graphics/Typeface;", "Ln4/e0$d;", "variationSettings", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "(Landroid/graphics/Typeface;Ln4/e0$d;Landroid/content/Context;)Landroid/graphics/Typeface;", "", "name", "Ln4/f0;", "fontWeight", "b", "(Ljava/lang/String;Ln4/f0;)Ljava/lang/String;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r0 {
    public static final o0 a() {
        return Build.VERSION.SDK_INT >= 28 ? new p0() : new q0();
    }

    public static final String b(String str, FontWeight fontWeight) {
        int iK = fontWeight.k() / 100;
        if (iK >= 0 && iK < 2) {
            return str + "-thin";
        }
        if (2 <= iK && iK < 4) {
            return str + "-light";
        }
        if (iK == 4) {
            return str;
        }
        if (iK == 5) {
            return str + "-medium";
        }
        if ((6 <= iK && iK < 8) || 8 > iK || iK >= 11) {
            return str;
        }
        return str + "-black";
    }

    public static final Typeface c(Typeface typeface, e0.d dVar, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? c1.f92894a.a(typeface, dVar, context) : typeface;
    }
}
