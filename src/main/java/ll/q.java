package ll;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q implements s {
    @Override // ll.s
    public Matrix a(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12) {
        b(matrix, rect, i11, i12, f11, f12, rect.width() / i11, rect.height() / i12);
        return matrix;
    }

    public abstract void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14);
}
