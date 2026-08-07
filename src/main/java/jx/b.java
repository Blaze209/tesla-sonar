package jx;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.GroundOverlay;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, String> f84367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<k, Object> f84368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<b> f84369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<e, GroundOverlay> f84370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f84371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<String, o> f84372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f84373g;

    b(HashMap<String, String> map, HashMap<String, o> map2, HashMap<k, Object> map3, HashMap<String, String> map4, ArrayList<b> arrayList, HashMap<e, GroundOverlay> map5, String str) {
        this.f84367a = map;
        this.f84368b = map3;
        this.f84372f = map2;
        this.f84371e = map4;
        this.f84369c = arrayList;
        this.f84370d = map5;
        this.f84373g = str;
    }

    public Iterable<b> a() {
        return this.f84369c;
    }

    HashMap<e, GroundOverlay> b() {
        return this.f84370d;
    }

    public Iterable<k> c() {
        return this.f84368b.keySet();
    }

    HashMap<k, Object> d() {
        return this.f84368b;
    }

    public String e(String str) {
        return this.f84367a.get(str);
    }

    public o f(String str) {
        return this.f84372f.get(str);
    }

    HashMap<String, String> g() {
        return this.f84371e;
    }

    HashMap<String, o> h() {
        return this.f84372f;
    }

    public boolean i() {
        return this.f84369c.size() > 0;
    }

    public boolean j(String str) {
        return this.f84367a.containsKey(str);
    }

    void k(k kVar, Object obj) {
        this.f84368b.put(kVar, obj);
    }

    @NonNull
    public String toString() {
        return "Container{\n properties=" + this.f84367a + ",\n placemarks=" + this.f84368b + ",\n containers=" + this.f84369c + ",\n ground overlays=" + this.f84370d + ",\n style maps=" + this.f84371e + ",\n styles=" + this.f84372f + "\n}\n";
    }
}
