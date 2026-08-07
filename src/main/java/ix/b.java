package ix;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes5.dex */
public class b extends hx.b implements Observer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LatLngBounds f81940d;

    private void g(m mVar) {
        if (e() && Arrays.asList(mVar.a()).contains(a().a())) {
            setChanged();
            notifyObservers();
        }
    }

    public e h() {
        return null;
    }

    public MarkerOptions i() {
        throw null;
    }

    public j j() {
        return null;
    }

    public PolygonOptions k() {
        throw null;
    }

    public l l() {
        return null;
    }

    public PolylineOptions m() {
        throw null;
    }

    public void n(e eVar) {
        throw new IllegalArgumentException("Line string style cannot be null");
    }

    public void o(j jVar) {
        throw new IllegalArgumentException("Point style cannot be null");
    }

    public void p(l lVar) {
        throw new IllegalArgumentException("Polygon style cannot be null");
    }

    @NonNull
    public String toString() {
        return "Feature{\n bounding box=" + this.f81940d + ",\n geometry=" + a() + ",\n point style=" + ((Object) null) + ",\n line string style=" + ((Object) null) + ",\n polygon style=" + ((Object) null) + ",\n id=" + this.f73680a + ",\n properties=" + c() + "\n}\n";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (observable instanceof m) {
            g((m) observable);
        }
    }
}
