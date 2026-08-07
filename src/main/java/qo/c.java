package qo;

import bo0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "radius", "spread", "a", "(FF)F", "ReactAndroid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final float a(float f11, float f12) {
        float fPow;
        if (f11 < Math.abs(f12)) {
            float f13 = 1;
            fPow = f13 + ((float) Math.pow((f11 / Math.abs(f12)) - f13, 3));
        } else {
            fPow = 1.0f;
        }
        return n.e(f11 + (f12 * fPow), BitmapDescriptorFactory.HUE_RED);
    }
}
