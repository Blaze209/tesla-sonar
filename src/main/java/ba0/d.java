package ba0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, d2 = {"getSystemDrawableResource", "Landroid/graphics/drawable/Drawable;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "iconName", "", "react-native-screens_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    public static final Drawable getSystemDrawableResource(Context context, String str) {
        s.k(context, "context");
        if (str == null) {
            return null;
        }
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        if (identifier > 0) {
            return j.a.b(context, identifier);
        }
        int identifier2 = context.getResources().getIdentifier(str, "drawable", "android");
        if (identifier2 > 0) {
            return j.a.b(context, identifier2);
        }
        Log.w(com.swmansion.rnscreens.gamma.tabs.a.TAG, "TabScreen could not resolve drawable resource with the name " + str);
        return null;
    }
}
