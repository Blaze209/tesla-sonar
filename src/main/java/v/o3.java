package v;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class o3 implements c0.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f117145a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.z f117146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f117147c;

    o3(w.z zVar, int i11) {
        this.f117146b = zVar;
        this.f117147c = i11;
    }

    @Override // c0.c0
    public int a() {
        int i11;
        synchronized (this.f117145a) {
            i11 = this.f117147c;
        }
        return i11;
    }

    @Override // c0.c0
    @NonNull
    public Range<Integer> b() {
        return (Range) this.f117146b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    public boolean c() {
        Range range = (Range) this.f117146b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
    }

    void d(int i11) {
        synchronized (this.f117145a) {
            this.f117147c = i11;
        }
    }
}
