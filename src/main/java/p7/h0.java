package p7;

import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f101353c = s7.q0.N0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f101354b;

    public h0() {
        this.f101354b = -1.0f;
    }

    public static h0 d(Bundle bundle) {
        s7.a.a(bundle.getInt(k0.f101405a, -1) == 1);
        float f11 = bundle.getFloat(f101353c, -1.0f);
        return f11 == -1.0f ? new h0() : new h0(f11);
    }

    @Override // p7.k0
    public boolean b() {
        return this.f101354b != -1.0f;
    }

    @Override // p7.k0
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(k0.f101405a, 1);
        bundle.putFloat(f101353c, this.f101354b);
        return bundle;
    }

    public float e() {
        return this.f101354b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h0) && this.f101354b == ((h0) obj).f101354b;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.f101354b));
    }

    public h0(float f11) {
        s7.a.b(f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f101354b = f11;
    }
}
