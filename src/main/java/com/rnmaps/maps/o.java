package com.rnmaps.maps;

import android.content.Context;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Dot;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class o extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PolylineOptions f49235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Polyline f49236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<LatLng> f49237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f49239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f49242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Cap f49243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ReadableArray f49244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<PatternItem> f49245k;

    public o(Context context) {
        super(context);
        this.f49243i = new RoundCap();
    }

    private void j() {
        if (this.f49244j == null) {
            Polyline polyline = this.f49236b;
            if (polyline != null) {
                polyline.setPattern(null);
                return;
            }
            return;
        }
        this.f49245k = new ArrayList(this.f49244j.size());
        for (int i11 = 0; i11 < this.f49244j.size(); i11++) {
            float f11 = (float) this.f49244j.getDouble(i11);
            if (i11 % 2 != 0) {
                this.f49245k.add(new Gap(f11));
            } else {
                this.f49245k.add(this.f49243i instanceof RoundCap ? new Dot() : new Dash(f11));
            }
        }
        Polyline polyline2 = this.f49236b;
        if (polyline2 != null) {
            polyline2.setPattern(this.f49245k);
        }
    }

    private PolylineOptions k() {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.addAll(this.f49237c);
        polylineOptions.color(this.f49238d);
        polylineOptions.width(this.f49239e);
        polylineOptions.geodesic(this.f49241g);
        polylineOptions.zIndex(this.f49242h);
        polylineOptions.startCap(this.f49243i);
        polylineOptions.endCap(this.f49243i);
        polylineOptions.pattern(this.f49245k);
        return polylineOptions;
    }

    @Override // com.rnmaps.maps.h
    public Object getFeature() {
        return this.f49236b;
    }

    public PolylineOptions getPolylineOptions() {
        if (this.f49235a == null) {
            this.f49235a = k();
        }
        return this.f49235a;
    }

    @Override // com.rnmaps.maps.h
    public void h(Object obj) {
        ((gx.f.a) obj).e(this.f49236b);
    }

    public void i(Object obj) {
        Polyline polylineD = ((gx.f.a) obj).d(getPolylineOptions());
        this.f49236b = polylineD;
        polylineD.setClickable(this.f49240f);
    }

    public void setColor(int i11) {
        this.f49238d = i11;
        Polyline polyline = this.f49236b;
        if (polyline != null) {
            polyline.setColor(i11);
        }
    }

    public void setCoordinates(ReadableArray readableArray) {
        this.f49237c = new ArrayList(readableArray.size());
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            this.f49237c.add(i11, new LatLng(map.getDouble(OrcaKeys.LATITUDE), map.getDouble(OrcaKeys.LONGITUDE)));
        }
        Polyline polyline = this.f49236b;
        if (polyline != null) {
            polyline.setPoints(this.f49237c);
        }
    }

    public void setGeodesic(boolean z11) {
        this.f49241g = z11;
        Polyline polyline = this.f49236b;
        if (polyline != null) {
            polyline.setGeodesic(z11);
        }
    }

    public void setLineCap(Cap cap) {
        this.f49243i = cap;
        Polyline polyline = this.f49236b;
        if (polyline != null) {
            polyline.setStartCap(cap);
            this.f49236b.setEndCap(cap);
        }
        j();
    }

    public void setLineDashPattern(ReadableArray readableArray) {
        this.f49244j = readableArray;
        j();
    }

    public void setTappable(boolean z11) {
        this.f49240f = z11;
        Polyline polyline = this.f49236b;
        if (polyline != null) {
            polyline.setClickable(z11);
        }
    }

    public void setWidth(float f11) {
        this.f49239e = f11;
        Polyline polyline = this.f49236b;
        if (polyline != null) {
            polyline.setWidth(f11);
        }
    }

    public void setZIndex(float f11) {
        this.f49242h = f11;
        Polyline polyline = this.f49236b;
        if (polyline != null) {
            polyline.setZIndex(f11);
        }
    }
}
