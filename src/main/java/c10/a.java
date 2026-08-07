package c10;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "Landroid/graphics/Point;", "b", "(Landroid/content/Context;)Landroid/graphics/Point;", "", "c", "(Landroid/content/Context;)Z", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "react-native-keyboard-controller_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final String a(Context context) {
        ComponentName componentNameUnflattenFromString;
        s.k(context, "<this>");
        String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
        if (string == null || (componentNameUnflattenFromString = ComponentName.unflattenFromString(string)) == null) {
            return null;
        }
        return componentNameUnflattenFromString.getPackageName();
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static final Point b(Context context) {
        s.k(context, "<this>");
        Point point = new Point();
        if (Build.VERSION.SDK_INT < 30) {
            Object systemService = context.getSystemService("window");
            s.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            s.j(defaultDisplay, "getDefaultDisplay(...)");
            defaultDisplay.getRealSize(point);
            return point;
        }
        WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        s.j(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        Rect bounds = currentWindowMetrics.getBounds();
        s.j(bounds, "getBounds(...)");
        point.x = bounds.width();
        point.y = bounds.height();
        return point;
    }

    public static final boolean c(Context context) {
        s.k(context, "<this>");
        if (Build.VERSION.SDK_INT >= 29) {
            Object systemService = context.getSystemService("uimode");
            UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
            if (uiModeManager != null && uiModeManager.getNightMode() == 2) {
                return true;
            }
        }
        return false;
    }
}
