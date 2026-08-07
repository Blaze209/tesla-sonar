package k5;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: k5.a$a, reason: collision with other inner class name */
    static class C1793a {
        static ColorFilter a(int i11, Object obj) {
            return new BlendModeColorFilter(i11, (BlendMode) obj);
        }
    }

    public static ColorFilter a(int i11, b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objA = c.b.a(bVar);
            if (objA != null) {
                return C1793a.a(i11, objA);
            }
            return null;
        }
        PorterDuff.Mode modeA = c.a(bVar);
        if (modeA != null) {
            return new PorterDuffColorFilter(i11, modeA);
        }
        return null;
    }
}
