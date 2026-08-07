package androidx.core.view;

import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f7824a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f7825b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f7826c = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7827d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7828e = 0;

    l0() {
    }

    private void b() {
        this.f7827d = 0;
        this.f7826c = BitmapDescriptorFactory.HUE_RED;
    }

    private float e() {
        long[] jArr;
        long j11;
        int i11 = this.f7827d;
        if (i11 < 2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i12 = this.f7828e;
        int i13 = ((i12 + 20) - (i11 - 1)) % 20;
        long j12 = this.f7825b[i12];
        while (true) {
            jArr = this.f7825b;
            j11 = jArr[i13];
            if (j12 - j11 <= 100) {
                break;
            }
            this.f7827d--;
            i13 = (i13 + 1) % 20;
        }
        int i14 = this.f7827d;
        if (i14 < 2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (i14 == 2) {
            int i15 = (i13 + 1) % 20;
            long j13 = jArr[i15];
            return j11 == j13 ? BitmapDescriptorFactory.HUE_RED : this.f7824a[i15] / (j13 - j11);
        }
        float fAbs = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < this.f7827d - 1; i17++) {
            int i18 = i17 + i13;
            long[] jArr2 = this.f7825b;
            long j14 = jArr2[i18 % 20];
            int i19 = (i18 + 1) % 20;
            if (jArr2[i19] != j14) {
                i16++;
                float f11 = f(fAbs);
                float f12 = this.f7824a[i19] / (this.f7825b[i19] - j14);
                fAbs += (f12 - f11) * Math.abs(f12);
                if (i16 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }

    private static float f(float f11) {
        return (f11 < BitmapDescriptorFactory.HUE_RED ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f11) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f7827d != 0 && eventTime - this.f7825b[this.f7828e] > 40) {
            b();
        }
        int i11 = (this.f7828e + 1) % 20;
        this.f7828e = i11;
        int i12 = this.f7827d;
        if (i12 != 20) {
            this.f7827d = i12 + 1;
        }
        this.f7824a[i11] = motionEvent.getAxisValue(26);
        this.f7825b[this.f7828e] = eventTime;
    }

    void c(int i11, float f11) {
        float fE = e() * i11;
        this.f7826c = fE;
        if (fE < (-Math.abs(f11))) {
            this.f7826c = -Math.abs(f11);
        } else if (this.f7826c > Math.abs(f11)) {
            this.f7826c = Math.abs(f11);
        }
    }

    float d(int i11) {
        return i11 != 26 ? BitmapDescriptorFactory.HUE_RED : this.f7826c;
    }
}
