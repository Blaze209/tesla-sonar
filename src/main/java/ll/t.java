package ll;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
class t extends q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f90224l = new t();

    private t() {
    }

    @Override // ll.q
    public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        matrix.setTranslate((int) (rect.left + ((rect.width() - i11) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i12) * 0.5f) + 0.5f));
    }

    public String toString() {
        return "center";
    }
}
