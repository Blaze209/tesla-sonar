package h0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RectF f70143a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static float a(float f11, float f12, float f13, float f14) {
        float f15 = (f11 * f13) + (f12 * f14);
        float f16 = (f11 * f14) - (f12 * f13);
        double dSqrt = Math.sqrt((f11 * f11) + (f12 * f12)) * Math.sqrt((f13 * f13) + (f14 * f14));
        return (float) Math.toDegrees(Math.atan2(((double) f16) / dSqrt, ((double) f15) / dSqrt));
    }

    @NonNull
    public static Matrix b(@NonNull Rect rect) {
        return c(new RectF(rect));
    }

    @NonNull
    public static Matrix c(@NonNull RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f70143a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    @NonNull
    public static Matrix d(@NonNull RectF rectF, @NonNull RectF rectF2, int i11) {
        return e(rectF, rectF2, i11, false);
    }

    @NonNull
    public static Matrix e(@NonNull RectF rectF, @NonNull RectF rectF2, int i11, boolean z11) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f70143a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i11);
        if (z11) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(c(rectF2));
        return matrix;
    }

    @NonNull
    public static Size f(@NonNull Rect rect, int i11) {
        return q(m(rect), i11);
    }

    public static int g(@NonNull Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return w((int) Math.round(Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
    }

    public static boolean h(@NonNull Rect rect, @NonNull Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean i(int i11) {
        if (i11 == 90 || i11 == 270) {
            return true;
        }
        if (i11 == 0 || i11 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i11);
    }

    public static boolean j(@NonNull Size size, @NonNull Size size2) {
        return k(size, false, size2, false);
    }

    public static boolean k(@NonNull Size size, boolean z11, @NonNull Size size2, boolean z12) {
        float width;
        float width2;
        float width3;
        float f11;
        if (z11) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z12) {
            width3 = size2.getWidth() / size2.getHeight();
            f11 = width3;
        } else {
            float width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            f11 = width4;
        }
        return width >= width3 && f11 >= width2;
    }

    public static boolean l(@NonNull Matrix matrix) {
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
        matrix.mapVectors(fArr);
        return a(fArr[0], fArr[1], fArr[2], fArr[3]) > BitmapDescriptorFactory.HUE_RED;
    }

    @NonNull
    public static Size m(@NonNull Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    @NonNull
    public static String n(@NonNull Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    @NonNull
    public static Size o(@NonNull Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    @NonNull
    public static RectF p(@NonNull RectF rectF, int i11) {
        u5.h.b(i11 % 90 == 0, "Invalid rotation degrees: " + i11);
        return i(w(i11)) ? new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rectF.height(), rectF.width()) : rectF;
    }

    @NonNull
    public static Size q(@NonNull Size size, int i11) {
        u5.h.b(i11 % 90 == 0, "Invalid rotation degrees: " + i11);
        return i(w(i11)) ? o(size) : size;
    }

    @NonNull
    public static Rect r(@NonNull Size size) {
        return s(size, 0, 0);
    }

    @NonNull
    public static Rect s(@NonNull Size size, int i11, int i12) {
        return new Rect(i11, i12, size.getWidth() + i11, size.getHeight() + i12);
    }

    @NonNull
    public static RectF t(@NonNull Size size) {
        return u(size, 0, 0);
    }

    @NonNull
    public static RectF u(@NonNull Size size, int i11, int i12) {
        return new RectF(i11, i12, i11 + size.getWidth(), i12 + size.getHeight());
    }

    @NonNull
    public static Matrix v(@NonNull Matrix matrix, @NonNull Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static int w(int i11) {
        return ((i11 % 360) + 360) % 360;
    }
}
