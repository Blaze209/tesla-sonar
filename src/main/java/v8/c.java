package v8;

import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import s7.h0;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f118332a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f118333b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0<float[]> f118334c = new h0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f118335d;

    public static void a(float[] fArr, float[] fArr2) {
        GlUtil.o(fArr);
        float f11 = fArr2[10];
        float f12 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f12 * f12));
        float f13 = fArr2[10];
        fArr[0] = f13 / fSqrt;
        float f14 = fArr2[8];
        fArr[2] = f14 / fSqrt;
        fArr[8] = (-f14) / fSqrt;
        fArr[10] = f13 / fSqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f11 = fArr2[0];
        float f12 = -fArr2[1];
        float f13 = -fArr2[2];
        float length = Matrix.length(f11, f12, f13);
        if (length != BitmapDescriptorFactory.HUE_RED) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f11 / length, f12 / length, f13 / length);
        } else {
            GlUtil.o(fArr);
        }
    }

    public boolean c(float[] fArr, long j11) {
        float[] fArrJ = this.f118334c.j(j11);
        if (fArrJ == null) {
            return false;
        }
        b(this.f118333b, fArrJ);
        if (!this.f118335d) {
            a(this.f118332a, this.f118333b);
            this.f118335d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f118332a, 0, this.f118333b, 0);
        return true;
    }

    public void d() {
        this.f118334c.c();
        this.f118335d = false;
    }

    public void e(long j11, float[] fArr) {
        this.f118334c.a(j11, fArr);
    }
}
