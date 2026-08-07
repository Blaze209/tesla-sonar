package jx;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class m implements hx.a<ArrayList<ArrayList<LatLng>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<LatLng> f84390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<List<LatLng>> f84391b;

    public m(List<LatLng> list, List<List<LatLng>> list2) {
        if (list == null) {
            throw new IllegalArgumentException("Outer boundary coordinates cannot be null");
        }
        this.f84390a = list;
        this.f84391b = list2;
    }

    @Override // hx.c
    public String a() {
        return "Polygon";
    }

    @Override // hx.a
    public List<List<LatLng>> b() {
        return this.f84391b;
    }

    @Override // hx.a
    public List<LatLng> c() {
        return this.f84390a;
    }

    @Override // hx.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List<List<LatLng>> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f84390a);
        List<List<LatLng>> list = this.f84391b;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @NonNull
    public String toString() {
        return "Polygon{\n outer coordinates=" + this.f84390a + ",\n inner coordinates=" + this.f84391b + "\n}\n";
    }
}
