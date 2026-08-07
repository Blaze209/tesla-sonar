package oi0;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "fontName", "Landroid/graphics/Typeface;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class s5 {
    public static final Typeface a(Context context, String fontName) {
        Typeface typefaceH;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(fontName, "fontName");
        String str = fontName + ".ttf";
        ki0.c.Companion companion = ki0.c.INSTANCE;
        if (companion.a().containsKey(str)) {
            typefaceH = companion.a().get(str);
        } else {
            String[] list = context.getAssets().list(OrcaFlavourKeys.FONTS);
            try {
                if (list == null || !p013kotlin.collections.n.e0(list, str)) {
                    Integer numG = yh0.s.g(context, fontName, yh0.t.Font);
                    if (numG != null) {
                        typefaceH = j5.h.h(context, numG.intValue());
                    } else {
                        typefaceH = null;
                    }
                } else {
                    typefaceH = Typeface.createFromAsset(context.getAssets(), OrcaFlavourKeys.FONTS + "/" + str);
                }
            } catch (Exception unused) {
            }
        }
        ki0.c.INSTANCE.a().put(str, typefaceH);
        return typefaceH;
    }
}
