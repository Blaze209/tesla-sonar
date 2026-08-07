package hx;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes5.dex */
public class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LatLng f73687a;

    public g(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("Coordinates cannot be null");
        }
        this.f73687a = latLng;
    }

    @Override // hx.c
    public String a() {
        return "Point";
    }

    @Override // hx.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public LatLng d() {
        return this.f73687a;
    }

    @NonNull
    public String toString() {
        return "Point{\n coordinates=" + this.f73687a + "\n}\n";
    }
}
