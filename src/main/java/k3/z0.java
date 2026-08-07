package k3;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lk3/z0;", "", "<init>", "()V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Lk3/j3;", "bitmapConfig", "", "hasAlpha", "Ll3/c;", "colorSpace", "Landroid/graphics/Bitmap;", "b", "(IIIZLl3/c;)Landroid/graphics/Bitmap;", "a", "(Landroid/graphics/Bitmap;)Ll3/c;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f84894a = new z0();

    private z0() {
    }

    public static final l3.c a(Bitmap bitmap) {
        l3.c cVarB;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (cVarB = h0.b(colorSpace)) == null) ? l3.g.f89510a.w() : cVarB;
    }

    public static final Bitmap b(int width, int height, int bitmapConfig, boolean hasAlpha, l3.c colorSpace) {
        return Bitmap.createBitmap((DisplayMetrics) null, width, height, n0.d(bitmapConfig), hasAlpha, h0.a(colorSpace));
    }
}
