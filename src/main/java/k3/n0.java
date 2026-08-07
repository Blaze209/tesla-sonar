package k3;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a:\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0007*\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroid/graphics/Bitmap;", "Lk3/i3;", "c", "(Landroid/graphics/Bitmap;)Lk3/i3;", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Lk3/j3;", "config", "", "hasAlpha", "Ll3/c;", "colorSpace", "a", "(IIIZLl3/c;)Lk3/i3;", "b", "(Lk3/i3;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", DateTokenConverter.CONVERTER_KEY, "(I)Landroid/graphics/Bitmap$Config;", "e", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n0 {
    public static final i3 a(int i11, int i12, int i13, boolean z11, l3.c cVar) {
        Bitmap bitmapCreateBitmap;
        Bitmap.Config configD = d(i13);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = z0.b(i11, i12, i13, z11, cVar);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i11, i12, configD);
            bitmapCreateBitmap.setHasAlpha(z11);
        }
        return new k0(bitmapCreateBitmap);
    }

    public static final Bitmap b(i3 i3Var) {
        if (i3Var instanceof k0) {
            return ((k0) i3Var).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final i3 c(Bitmap bitmap) {
        return new k0(bitmap);
    }

    public static final Bitmap.Config d(int i11) {
        j3.Companion companion = j3.INSTANCE;
        if (j3.i(i11, companion.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (j3.i(i11, companion.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (j3.i(i11, companion.e())) {
            return Bitmap.Config.RGB_565;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26 || !j3.i(i11, companion.c())) {
            return (i12 < 26 || !j3.i(i11, companion.d())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static final int e(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return j3.INSTANCE.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return j3.INSTANCE.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return j3.INSTANCE.b();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i11 < 26 || config != Bitmap.Config.HARDWARE) ? j3.INSTANCE.b() : j3.INSTANCE.d();
        }
        return j3.INSTANCE.c();
    }
}
