package androidx.transition;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f14076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f14077b = new float[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14078c = 0;

    h0() {
        long[] jArr = new long[20];
        this.f14076a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float c(float f11) {
        return (float) (((double) Math.signum(f11)) * Math.sqrt(Math.abs(f11) * 2.0f));
    }

    public void a(long j11, float f11) {
        int i11 = (this.f14078c + 1) % 20;
        this.f14078c = i11;
        this.f14076a[i11] = j11;
        this.f14077b[i11] = f11;
    }

    float b() {
        float fC;
        int i11 = this.f14078c;
        if (i11 == 0 && this.f14076a[i11] == Long.MIN_VALUE) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        long j11 = this.f14076a[i11];
        int i12 = 0;
        long j12 = j11;
        while (true) {
            long j13 = this.f14076a[i11];
            if (j13 == Long.MIN_VALUE) {
                break;
            }
            float f11 = j11 - j13;
            float fAbs = Math.abs(j13 - j12);
            if (f11 > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i11 == 0) {
                i11 = 20;
            }
            i11--;
            i12++;
            if (i12 >= 20) {
                break;
            }
            j12 = j13;
        }
        if (i12 < 2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (i12 == 2) {
            int i13 = this.f14078c;
            int i14 = i13 == 0 ? 19 : i13 - 1;
            long[] jArr = this.f14076a;
            float f12 = jArr[i13] - jArr[i14];
            if (f12 == BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float[] fArr = this.f14077b;
            fC = (fArr[i13] - fArr[i14]) / f12;
        } else {
            int i15 = this.f14078c;
            int i16 = ((i15 - i12) + 21) % 20;
            int i17 = (i15 + 21) % 20;
            long j14 = this.f14076a[i16];
            float f13 = this.f14077b[i16];
            int i18 = i16 + 1;
            float fC2 = 0.0f;
            for (int i19 = i18 % 20; i19 != i17; i19 = (i19 + 1) % 20) {
                long j15 = this.f14076a[i19];
                float f14 = j15 - j14;
                if (f14 != BitmapDescriptorFactory.HUE_RED) {
                    float f15 = this.f14077b[i19];
                    float f16 = (f15 - f13) / f14;
                    fC2 += (f16 - c(fC2)) * Math.abs(f16);
                    if (i19 == i18) {
                        fC2 *= 0.5f;
                    }
                    f13 = f15;
                    j14 = j15;
                }
            }
            fC = c(fC2);
        }
        return fC * 1000.0f;
    }
}
