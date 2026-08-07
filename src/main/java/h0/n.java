package h0;

import android.opengl.Matrix;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f70140a = new float[16];

    private static void a(float[] fArr, float f11, float f12) {
        Matrix.translateM(fArr, 0, -f11, -f12, BitmapDescriptorFactory.HUE_RED);
    }

    private static void b(float[] fArr, float f11, float f12) {
        Matrix.translateM(fArr, 0, f11, f12, BitmapDescriptorFactory.HUE_RED);
    }

    public static void c(@NonNull float[] fArr, float f11, float f12, float f13) {
        b(fArr, f12, f13);
        Matrix.rotateM(fArr, 0, f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        a(fArr, f12, f13);
    }

    public static void d(@NonNull float[] fArr, float f11) {
        b(fArr, BitmapDescriptorFactory.HUE_RED, f11);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        a(fArr, BitmapDescriptorFactory.HUE_RED, f11);
    }
}
