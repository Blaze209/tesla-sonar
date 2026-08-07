package at;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class h implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f14982a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f14983b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f14984c = new Matrix();

    @NonNull
    public Matrix a(float f11, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.f14982a);
        matrix2.getValues(this.f14983b);
        for (int i11 = 0; i11 < 9; i11++) {
            float[] fArr = this.f14983b;
            float f12 = fArr[i11];
            float f13 = this.f14982a[i11];
            fArr[i11] = f13 + ((f12 - f13) * f11);
        }
        this.f14984c.setValues(this.f14983b);
        return this.f14984c;
    }
}
