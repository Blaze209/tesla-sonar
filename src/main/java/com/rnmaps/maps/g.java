package com.rnmaps.maps;

import android.content.Context;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes6.dex */
public class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CircleOptions f49142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Circle f49143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLng f49144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f49145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f49148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f49149h;

    public g(Context context) {
        super(context);
    }

    private CircleOptions j() {
        CircleOptions circleOptions = new CircleOptions();
        circleOptions.center(this.f49144c);
        circleOptions.radius(this.f49145d);
        circleOptions.fillColor(this.f49147f);
        circleOptions.strokeColor(this.f49146e);
        circleOptions.strokeWidth(this.f49148g);
        circleOptions.zIndex(this.f49149h);
        return circleOptions;
    }

    public CircleOptions getCircleOptions() {
        if (this.f49142a == null) {
            this.f49142a = j();
        }
        return this.f49142a;
    }

    @Override // com.rnmaps.maps.h
    public Object getFeature() {
        return this.f49143b;
    }

    @Override // com.rnmaps.maps.h
    public void h(Object obj) {
        ((gx.a.C1443a) obj).e(this.f49143b);
    }

    public void i(Object obj) {
        this.f49143b = ((gx.a.C1443a) obj).d(getCircleOptions());
    }

    public void setCenter(LatLng latLng) {
        this.f49144c = latLng;
        Circle circle = this.f49143b;
        if (circle != null) {
            circle.setCenter(latLng);
        }
    }

    public void setFillColor(int i11) {
        this.f49147f = i11;
        Circle circle = this.f49143b;
        if (circle != null) {
            circle.setFillColor(i11);
        }
    }

    public void setRadius(double d11) {
        this.f49145d = d11;
        Circle circle = this.f49143b;
        if (circle != null) {
            circle.setRadius(d11);
        }
    }

    public void setStrokeColor(int i11) {
        this.f49146e = i11;
        Circle circle = this.f49143b;
        if (circle != null) {
            circle.setStrokeColor(i11);
        }
    }

    public void setStrokeWidth(float f11) {
        this.f49148g = f11;
        Circle circle = this.f49143b;
        if (circle != null) {
            circle.setStrokeWidth(f11);
        }
    }

    public void setZIndex(float f11) {
        this.f49149h = f11;
        Circle circle = this.f49143b;
        if (circle != null) {
            circle.setZIndex(f11);
        }
    }
}
