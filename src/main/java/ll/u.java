package ll;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
class u extends q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f90225l = new u();

    private u() {
    }

    @Override // ll.q
    public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float fHeight;
        float fWidth;
        if (f14 > f13) {
            fWidth = rect.left + ((rect.width() - (i11 * f14)) * 0.5f);
            fHeight = rect.top;
            f13 = f14;
        } else {
            float f15 = rect.left;
            fHeight = ((rect.height() - (i12 * f13)) * 0.5f) + rect.top;
            fWidth = f15;
        }
        matrix.setScale(f13, f13);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "center_crop";
    }
}
