package ll;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
class v extends q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f90226l = new v();

    private v() {
    }

    @Override // ll.q
    public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float fMin = Math.min(Math.min(f13, f14), 1.0f);
        float fWidth = rect.left + ((rect.width() - (i11 * fMin)) * 0.5f);
        float fHeight = rect.top + ((rect.height() - (i12 * fMin)) * 0.5f);
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "center_inside";
    }
}
