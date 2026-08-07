package ll;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
class c0 extends q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f90099l = new c0();

    private c0() {
    }

    @Override // ll.q
    public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float fWidth = rect.left + ((rect.width() - (i11 * f14)) * 0.5f);
        float f15 = rect.top;
        matrix.setScale(f14, f14);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (f15 + 0.5f));
    }

    public String toString() {
        return "fit_y";
    }
}
