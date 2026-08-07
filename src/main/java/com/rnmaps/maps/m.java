package com.rnmaps.maps;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes6.dex */
public class m extends h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GroundOverlayOptions f49215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GroundOverlay f49216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLngBounds f49217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f49218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BitmapDescriptor f49219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f49221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f49222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d f49223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private gx.b.a f49224j;

    public m(Context context) {
        super(context);
        this.f49223i = new d(context, getResources(), this);
    }

    private GroundOverlay getGroundOverlay() {
        GroundOverlayOptions groundOverlayOptions;
        GroundOverlay groundOverlay = this.f49216b;
        if (groundOverlay != null) {
            return groundOverlay;
        }
        if (this.f49224j == null || (groundOverlayOptions = getGroundOverlayOptions()) == null) {
            return null;
        }
        return this.f49224j.d(groundOverlayOptions);
    }

    private GroundOverlayOptions j() {
        GroundOverlayOptions groundOverlayOptions = this.f49215a;
        if (groundOverlayOptions != null) {
            return groundOverlayOptions;
        }
        GroundOverlayOptions groundOverlayOptions2 = new GroundOverlayOptions();
        BitmapDescriptor bitmapDescriptor = this.f49219e;
        if (bitmapDescriptor != null) {
            groundOverlayOptions2.image(bitmapDescriptor);
        } else {
            groundOverlayOptions2.image(BitmapDescriptorFactory.defaultMarker());
            groundOverlayOptions2.visible(false);
        }
        groundOverlayOptions2.positionFromBounds(this.f49217c);
        groundOverlayOptions2.zIndex(this.f49221g);
        groundOverlayOptions2.bearing(this.f49218d);
        groundOverlayOptions2.transparency(this.f49222h);
        return groundOverlayOptions2;
    }

    @Override // com.rnmaps.maps.c
    public void f() {
        GroundOverlay groundOverlay = getGroundOverlay();
        this.f49216b = groundOverlay;
        if (groundOverlay != null) {
            groundOverlay.setVisible(true);
            this.f49216b.setImage(this.f49219e);
            this.f49216b.setTransparency(this.f49222h);
            this.f49216b.setClickable(this.f49220f);
        }
    }

    @Override // com.rnmaps.maps.h
    public Object getFeature() {
        return this.f49216b;
    }

    public GroundOverlayOptions getGroundOverlayOptions() {
        if (this.f49215a == null) {
            this.f49215a = j();
        }
        return this.f49215a;
    }

    @Override // com.rnmaps.maps.h
    public void h(Object obj) {
        GroundOverlay groundOverlay = this.f49216b;
        if (groundOverlay != null) {
            ((gx.b.a) obj).e(groundOverlay);
            this.f49216b = null;
            this.f49215a = null;
        }
        this.f49224j = null;
    }

    public void i(Object obj) {
        gx.b.a aVar = (gx.b.a) obj;
        GroundOverlayOptions groundOverlayOptions = getGroundOverlayOptions();
        if (groundOverlayOptions == null) {
            this.f49224j = aVar;
            return;
        }
        GroundOverlay groundOverlayD = aVar.d(groundOverlayOptions);
        this.f49216b = groundOverlayD;
        groundOverlayD.setClickable(this.f49220f);
    }

    public void setBearing(float f11) {
        this.f49218d = f11;
        GroundOverlay groundOverlay = this.f49216b;
        if (groundOverlay != null) {
            groundOverlay.setBearing(f11);
        }
    }

    public void setBounds(ReadableArray readableArray) {
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(readableArray.getArray(0).getDouble(0), readableArray.getArray(0).getDouble(1)), new LatLng(readableArray.getArray(1).getDouble(0), readableArray.getArray(1).getDouble(1)));
        this.f49217c = latLngBounds;
        GroundOverlay groundOverlay = this.f49216b;
        if (groundOverlay != null) {
            groundOverlay.setPositionFromBounds(latLngBounds);
        }
    }

    @Override // com.rnmaps.maps.c
    public void setIconBitmap(Bitmap bitmap) {
    }

    @Override // com.rnmaps.maps.c
    public void setIconBitmapDescriptor(BitmapDescriptor bitmapDescriptor) {
        this.f49219e = bitmapDescriptor;
    }

    public void setImage(String str) {
        this.f49223i.f(str);
    }

    public void setTappable(boolean z11) {
        this.f49220f = z11;
        GroundOverlay groundOverlay = this.f49216b;
        if (groundOverlay != null) {
            groundOverlay.setClickable(z11);
        }
    }

    public void setTransparency(float f11) {
        this.f49222h = f11;
        GroundOverlay groundOverlay = this.f49216b;
        if (groundOverlay != null) {
            groundOverlay.setTransparency(f11);
        }
    }

    public void setZIndex(float f11) {
        this.f49221g = f11;
        GroundOverlay groundOverlay = this.f49216b;
        if (groundOverlay != null) {
            groundOverlay.setZIndex(f11);
        }
    }
}
