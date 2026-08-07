package p7;

import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f101376d = new i0(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f101377e = s7.q0.N0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f101378f = s7.q0.N0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f101379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f101380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f101381c;

    public i0(float f11) {
        this(f11, 1.0f);
    }

    public static i0 a(Bundle bundle) {
        return new i0(bundle.getFloat(f101377e, 1.0f), bundle.getFloat(f101378f, 1.0f));
    }

    public long b(long j11) {
        return j11 * ((long) this.f101381c);
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f101377e, this.f101379a);
        bundle.putFloat(f101378f, this.f101380b);
        return bundle;
    }

    public i0 d(float f11) {
        return new i0(f11, this.f101380b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f101379a == i0Var.f101379a && this.f101380b == i0Var.f101380b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f101379a)) * 31) + Float.floatToRawIntBits(this.f101380b);
    }

    public String toString() {
        return s7.q0.J("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f101379a), Float.valueOf(this.f101380b));
    }

    public i0(float f11, float f12) {
        s7.a.a(f11 > BitmapDescriptorFactory.HUE_RED);
        s7.a.a(f12 > BitmapDescriptorFactory.HUE_RED);
        this.f101379a = f11;
        this.f101380b = f12;
        this.f101381c = Math.round(f11 * 1000.0f);
    }
}
