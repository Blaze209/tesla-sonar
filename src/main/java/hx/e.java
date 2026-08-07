package hx;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class e implements c<List<LatLng>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<LatLng> f73684a;

    public e(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("Coordinates cannot be null");
        }
        this.f73684a = list;
    }

    @Override // hx.c
    public String a() {
        return "LineString";
    }

    @Override // hx.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List<LatLng> d() {
        return this.f73684a;
    }

    @NonNull
    public String toString() {
        return "LineString{\n coordinates=" + this.f73684a + "\n}\n";
    }
}
