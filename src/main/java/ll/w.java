package ll;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
class w extends q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f90227l = new w();

    private w() {
    }

    @Override // ll.q
    public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float fMin = Math.min(f13, f14);
        float f15 = rect.left;
        float fHeight = rect.top + (rect.height() - (i12 * fMin));
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (f15 + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "fit_bottom_start";
    }
}
