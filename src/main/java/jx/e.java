package jx;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f84376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GroundOverlayOptions f84377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f84378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LatLngBounds f84379d;

    e(String str, LatLngBounds latLngBounds, float f11, int i11, HashMap<String, String> map, float f12) {
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        this.f84377b = groundOverlayOptions;
        this.f84378c = str;
        this.f84376a = map;
        if (latLngBounds == null) {
            throw new IllegalArgumentException("No LatLonBox given");
        }
        this.f84379d = latLngBounds;
        groundOverlayOptions.positionFromBounds(latLngBounds);
        groundOverlayOptions.bearing(f12);
        groundOverlayOptions.zIndex(f11);
        groundOverlayOptions.visible(i11 != 0);
    }

    GroundOverlayOptions a() {
        return this.f84377b;
    }

    public String b() {
        return this.f84378c;
    }

    public LatLngBounds c() {
        return this.f84379d;
    }

    @NonNull
    public String toString() {
        return "GroundOverlay{\n properties=" + this.f84376a + ",\n image url=" + this.f84378c + ",\n LatLngBox=" + this.f84379d + "\n}\n";
    }
}
