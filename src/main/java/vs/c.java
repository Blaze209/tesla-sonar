package vs;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ts.l0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f119776a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f119777b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l0<float[]> f119778c = new l0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f119779d;

    public static void a(float[] fArr, float[] fArr2) {
        GlUtil.j(fArr);
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
            GlUtil.j(fArr);
        }
    }

    public boolean c(float[] fArr, long j11) {
        float[] fArrJ = this.f119778c.j(j11);
        if (fArrJ == null) {
            return false;
        }
        b(this.f119777b, fArrJ);
        if (!this.f119779d) {
            a(this.f119776a, this.f119777b);
            this.f119779d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f119776a, 0, this.f119777b, 0);
        return true;
    }

    public void d() {
        this.f119778c.c();
        this.f119779d = false;
    }

    public void e(long j11, float[] fArr) {
        this.f119778c.a(j11, fArr);
    }
}
