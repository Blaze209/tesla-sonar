package com.rnmaps.maps;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class n extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PolygonOptions f49225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Polygon f49226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<LatLng> f49227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<List<LatLng>> f49228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f49231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f49233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f49234j;

    public n(Context context) {
        super(context);
    }

    private PolygonOptions j() {
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.addAll(this.f49227c);
        polygonOptions.fillColor(this.f49230f);
        polygonOptions.strokeColor(this.f49229e);
        polygonOptions.strokeWidth(this.f49231g);
        polygonOptions.geodesic(this.f49232h);
        polygonOptions.zIndex(this.f49234j);
        if (this.f49228d != null) {
            for (int i11 = 0; i11 < this.f49228d.size(); i11++) {
                polygonOptions.addHole(this.f49228d.get(i11));
            }
        }
        return polygonOptions;
    }

    @Override // com.rnmaps.maps.h
    public Object getFeature() {
        return this.f49226b;
    }

    public PolygonOptions getPolygonOptions() {
        if (this.f49225a == null) {
            this.f49225a = j();
        }
        return this.f49225a;
    }

    @Override // com.rnmaps.maps.h
    public void h(Object obj) {
        ((gx.e.a) obj).e(this.f49226b);
    }

    public void i(Object obj) {
        Polygon polygonD = ((gx.e.a) obj).d(getPolygonOptions());
        this.f49226b = polygonD;
        polygonD.setClickable(this.f49233i);
    }

    public void setCoordinates(ReadableArray readableArray) {
        this.f49227c = new ArrayList(readableArray.size());
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            this.f49227c.add(i11, new LatLng(map.getDouble(OrcaKeys.LATITUDE), map.getDouble(OrcaKeys.LONGITUDE)));
        }
        Polygon polygon = this.f49226b;
        if (polygon != null) {
            polygon.setPoints(this.f49227c);
        }
    }

    public void setFillColor(int i11) {
        this.f49230f = i11;
        Polygon polygon = this.f49226b;
        if (polygon != null) {
            polygon.setFillColor(i11);
        }
    }

    public void setGeodesic(boolean z11) {
        this.f49232h = z11;
        Polygon polygon = this.f49226b;
        if (polygon != null) {
            polygon.setGeodesic(z11);
        }
    }

    public void setHoles(ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        this.f49228d = new ArrayList(readableArray.size());
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableArray array = readableArray.getArray(i11);
            if (array.size() >= 3) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < array.size(); i12++) {
                    ReadableMap map = array.getMap(i12);
                    arrayList.add(new LatLng(map.getDouble(OrcaKeys.LATITUDE), map.getDouble(OrcaKeys.LONGITUDE)));
                }
                if (arrayList.size() == 3) {
                    arrayList.add((LatLng) arrayList.get(0));
                }
                this.f49228d.add(arrayList);
            }
        }
        Polygon polygon = this.f49226b;
        if (polygon != null) {
            polygon.setHoles(this.f49228d);
        }
    }

    public void setStrokeColor(int i11) {
        this.f49229e = i11;
        Polygon polygon = this.f49226b;
        if (polygon != null) {
            polygon.setStrokeColor(i11);
        }
    }

    public void setStrokeWidth(float f11) {
        this.f49231g = f11;
        Polygon polygon = this.f49226b;
        if (polygon != null) {
            polygon.setStrokeWidth(f11);
        }
    }

    public void setTappable(boolean z11) {
        this.f49233i = z11;
        Polygon polygon = this.f49226b;
        if (polygon != null) {
            polygon.setClickable(z11);
        }
    }

    public void setZIndex(float f11) {
        this.f49234j = f11;
        Polygon polygon = this.f49226b;
        if (polygon != null) {
            polygon.setZIndex(f11);
        }
    }
}
