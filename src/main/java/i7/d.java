package i7;

import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
abstract class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f76075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f76076b;

    protected d(float[] fArr) {
        this.f76075a = fArr;
        this.f76076b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr = this.f76075a;
        int iMin = Math.min((int) ((fArr.length - 1) * f11), fArr.length - 2);
        float f12 = this.f76076b;
        float f13 = (f11 - (iMin * f12)) / f12;
        float[] fArr2 = this.f76075a;
        float f14 = fArr2[iMin];
        return f14 + (f13 * (fArr2[iMin + 1] - f14));
    }
}
