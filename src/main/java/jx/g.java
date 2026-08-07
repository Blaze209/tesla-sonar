package jx;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class g extends hx.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<Double> f84380b;

    public g(ArrayList<LatLng> arrayList, ArrayList<Double> arrayList2) {
        super(arrayList);
        this.f84380b = arrayList2;
    }

    @Override // hx.e
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ArrayList<LatLng> d() {
        return new ArrayList<>(super.d());
    }
}
