package di;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static int a(Context context) {
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        } catch (Throwable th2) {
            g.d(th2);
            return 0;
        }
    }

    public static int b(Context context) {
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Throwable th2) {
            g.d(th2);
            return 0;
        }
    }

    public static int c(Context context) {
        return context.getApplicationContext().getApplicationInfo().targetSdkVersion;
    }

    public static boolean d(Context context) {
        return c(context) >= 35 && Build.VERSION.SDK_INT >= 35;
    }
}
