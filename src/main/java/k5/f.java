package k5;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<u5.d<Rect, Rect>> f84928a = new ThreadLocal<>();

    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    static class b {
        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }

    public static boolean b(Paint paint, k5.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, bVar != null ? c.b.a(bVar) : null);
            return true;
        }
        if (bVar == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeA = c.a(bVar);
        paint.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        return modeA != null;
    }
}
