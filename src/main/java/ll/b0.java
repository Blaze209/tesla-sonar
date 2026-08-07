package ll;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
class b0 extends q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f90098l = new b0();

    private b0() {
    }

    @Override // ll.q
    public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float f15 = rect.left;
        float f16 = rect.top;
        matrix.setScale(f13, f14);
        matrix.postTranslate((int) (f15 + 0.5f), (int) (f16 + 0.5f));
    }

    public String toString() {
        return "fit_xy";
    }
}
