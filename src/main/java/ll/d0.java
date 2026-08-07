package ll;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
class d0 extends q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f90106l = new d0();

    private d0() {
    }

    @Override // ll.q
    public void b(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float fMax;
        float fMax2;
        if (f14 > f13) {
            float f15 = i11 * f14;
            fMax = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f11 * f15), BitmapDescriptorFactory.HUE_RED), rect.width() - f15);
            fMax2 = rect.top;
            f13 = f14;
        } else {
            fMax = rect.left;
            float f16 = i12 * f13;
            fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f12 * f16), BitmapDescriptorFactory.HUE_RED), rect.height() - f16) + rect.top;
        }
        matrix.setScale(f13, f13);
        matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
    }

    public String toString() {
        return "focus_crop";
    }
}
