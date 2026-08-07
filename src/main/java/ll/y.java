package ll;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
class y extends q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f90229l = new y();

    private y() {
    }

    @Override // ll.q
    public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float fMin = Math.min(f13, f14);
        float fWidth = rect.left + (rect.width() - (i11 * fMin));
        float fHeight = rect.top + (rect.height() - (i12 * fMin));
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "fit_end";
    }
}
