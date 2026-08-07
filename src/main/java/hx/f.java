package hx;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f73685a = "MultiGeometry";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<c> f73686b;

    public f(List<? extends c> list) {
        if (list == null) {
            throw new IllegalArgumentException("Geometries cannot be null");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends c> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f73686b = arrayList;
    }

    @Override // hx.c
    public String a() {
        return this.f73685a;
    }

    @Override // hx.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List<c> d() {
        return this.f73686b;
    }

    @NonNull
    public String toString() {
        String str = this.f73685a.equals("MultiPoint") ? "LineStrings=" : "Geometries=";
        if (this.f73685a.equals("MultiLineString")) {
            str = "points=";
        }
        if (this.f73685a.equals("MultiPolygon")) {
            str = "Polygons=";
        }
        StringBuilder sb2 = new StringBuilder(a());
        sb2.append("{");
        sb2.append("\n " + str);
        sb2.append(d());
        sb2.append("\n}\n");
        return sb2.toString();
    }
}
