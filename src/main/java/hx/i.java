package hx;

import android.util.Log;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Observable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected MarkerOptions f73711a = new MarkerOptions();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected PolylineOptions f73712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected PolygonOptions f73713c;

    public i() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.f73712b = polylineOptions;
        polylineOptions.clickable(true);
        PolygonOptions polygonOptions = new PolygonOptions();
        this.f73713c = polygonOptions;
        polygonOptions.clickable(true);
    }

    public void b(float f11) {
        this.f73712b.width(f11);
    }

    public void c(float f11, float f12, String str, String str2) {
        if (!str.equals("fraction")) {
            Log.w("Style", "Hotspot xUnits other than \"fraction\" are not supported.");
            f11 = 0.5f;
        }
        if (!str2.equals("fraction")) {
            Log.w("Style", "Hotspot yUnits other than \"fraction\" are not supported.");
            f12 = 1.0f;
        }
        this.f73711a.anchor(f11, f12);
    }

    public void d(float f11) {
        this.f73711a.rotation(f11);
    }

    public void e(int i11) {
        this.f73713c.fillColor(i11);
    }

    public void f(float f11) {
        this.f73713c.strokeWidth(f11);
    }
}
