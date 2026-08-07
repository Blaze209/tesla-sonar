package k0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.c3;
import androidx.camera.core.internal.utils.ImageUtil;
import c0.a2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m {
    @NonNull
    public static Map<a2, Rect> a(@NonNull Rect rect, boolean z11, @NonNull Rational rational, int i11, int i12, int i13, @NonNull Map<a2, c3> map) {
        u5.h.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<a2, c3> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, entry.getValue().e().getWidth(), entry.getValue().e().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF rectFG = g(rectF2, ImageUtil.g(i11, rational), i12, z11, i13, i11);
        HashMap map3 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, rectFG);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            map3.put((a2) entry2.getKey(), rect2);
        }
        return map3;
    }

    private static RectF b(boolean z11, int i11, RectF rectF, RectF rectF2) {
        boolean z12 = false;
        boolean z13 = i11 == 0 && !z11;
        boolean z14 = i11 == 90 && z11;
        if (z13 || z14) {
            return rectF2;
        }
        boolean z15 = i11 == 0 && z11;
        boolean z16 = i11 == 270 && !z11;
        if (z15 || z16) {
            return c(rectF2, rectF.centerX());
        }
        boolean z17 = i11 == 90 && !z11;
        boolean z18 = i11 == 180 && z11;
        if (z17 || z18) {
            return d(rectF2, rectF.centerY());
        }
        boolean z19 = i11 == 180 && !z11;
        if (i11 == 270 && z11) {
            z12 = true;
        }
        if (z19 || z12) {
            return c(d(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z11 + " rotation " + i11);
    }

    private static RectF c(RectF rectF, float f11) {
        return new RectF(e(rectF.right, f11), rectF.top, e(rectF.left, f11), rectF.bottom);
    }

    private static RectF d(RectF rectF, float f11) {
        return new RectF(rectF.left, f(rectF.bottom, f11), rectF.right, f(rectF.top, f11));
    }

    private static float e(float f11, float f12) {
        return (f12 + f12) - f11;
    }

    private static float f(float f11, float f12) {
        return (f12 + f12) - f11;
    }

    @NonNull
    @SuppressLint({"SwitchIntDef"})
    public static RectF g(@NonNull RectF rectF, @NonNull Rational rational, int i11, boolean z11, int i12, int i13) {
        if (i11 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rational.getNumerator(), rational.getDenominator());
        if (i11 == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i11 == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("Unexpected scale type: " + i11);
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return b(h(z11, i12), i13, rectF, rectF3);
    }

    private static boolean h(boolean z11, int i11) {
        return z11 ^ (i11 == 1);
    }
}
