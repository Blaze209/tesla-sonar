package p015o1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p019p1.b0;
import p019p1.z;
import w4.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "splinePositions", "splineTimes", "", "nbSamples", "Ljn0/h0;", "b", "([F[FI)V", "T", "Lw4/d;", "density", "Lp1/z;", "c", "(Lw4/d;)Lp1/z;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class x {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(float[] fArr, float[] fArr2, int i11) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f21 = BitmapDescriptorFactory.HUE_RED;
        int i12 = 0;
        float f22 = 0.0f;
        while (true) {
            float f23 = 1.0f;
            if (i12 >= i11) {
                fArr2[i11] = 1.0f;
                fArr[i11] = 1.0f;
                return;
            }
            float f24 = i12 / i11;
            float f25 = 1.0f;
            while (true) {
                f11 = ((f25 - f21) / 2.0f) + f21;
                f12 = f23 - f11;
                f13 = f11 * 3.0f * f12;
                f14 = f11 * f11 * f11;
                float f26 = (((f12 * 0.175f) + (f11 * 0.35000002f)) * f13) + f14;
                f15 = f23;
                if (Math.abs(f26 - f24) < 1.0E-5d) {
                    break;
                }
                if (f26 > f24) {
                    f25 = f11;
                } else {
                    f21 = f11;
                }
                f23 = f15;
            }
            float f27 = 0.5f;
            fArr[i12] = (f13 * ((f12 * 0.5f) + f11)) + f14;
            float f28 = f15;
            while (true) {
                f16 = ((f28 - f22) / 2.0f) + f22;
                f17 = f15 - f16;
                f18 = f16 * 3.0f * f17;
                f19 = f16 * f16 * f16;
                float f29 = (((f17 * f27) + f16) * f18) + f19;
                float f31 = f24;
                if (Math.abs(f29 - f24) >= 1.0E-5d) {
                    if (f29 > f31) {
                        f28 = f16;
                    } else {
                        f22 = f16;
                    }
                    f24 = f31;
                    f27 = 0.5f;
                }
            }
            fArr2[i12] = (f18 * ((f17 * 0.175f) + (f16 * 0.35000002f))) + f19;
            i12++;
        }
    }

    public static final <T> z<T> c(d dVar) {
        return b0.b(new y(dVar));
    }
}
