package p7;

import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f101407d = s7.q0.N0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f101408e = s7.q0.N0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f101409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f101410c;

    public l0(int i11) {
        s7.a.b(i11 > 0, "maxStars must be a positive integer");
        this.f101409b = i11;
        this.f101410c = -1.0f;
    }

    public static l0 d(Bundle bundle) {
        s7.a.a(bundle.getInt(k0.f101405a, -1) == 2);
        int i11 = bundle.getInt(f101407d, 5);
        float f11 = bundle.getFloat(f101408e, -1.0f);
        return f11 == -1.0f ? new l0(i11) : new l0(i11, f11);
    }

    @Override // p7.k0
    public boolean b() {
        return this.f101410c != -1.0f;
    }

    @Override // p7.k0
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(k0.f101405a, 2);
        bundle.putInt(f101407d, this.f101409b);
        bundle.putFloat(f101408e, this.f101410c);
        return bundle;
    }

    public int e() {
        return this.f101409b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f101409b == l0Var.f101409b && this.f101410c == l0Var.f101410c;
    }

    public float f() {
        return this.f101410c;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f101409b), Float.valueOf(this.f101410c));
    }

    public l0(int i11, float f11) {
        boolean z11 = false;
        s7.a.b(i11 > 0, "maxStars must be a positive integer");
        if (f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= i11) {
            z11 = true;
        }
        s7.a.b(z11, "starRating is out of range [0, maxStars]");
        this.f101409b = i11;
        this.f101410c = f11;
    }
}
