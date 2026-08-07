package ix;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class k implements hx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<? extends List<LatLng>> f81941a;

    @Override // hx.c
    public String a() {
        return i();
    }

    public List<? extends List<LatLng>> e() {
        return this.f81941a;
    }

    @Override // hx.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<? extends List<LatLng>> d() {
        return e();
    }

    @Override // hx.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ArrayList<ArrayList<LatLng>> b() {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        for (int i11 = 1; i11 < e().size(); i11++) {
            arrayList.add((ArrayList) e().get(i11));
        }
        return arrayList;
    }

    @Override // hx.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ArrayList<LatLng> c() {
        return (ArrayList) e().get(0);
    }

    public String i() {
        return "Polygon";
    }

    @NonNull
    public String toString() {
        return "Polygon{\n coordinates=" + this.f81941a + "\n}\n";
    }
}
