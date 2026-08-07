package com.horcrux.svg;

import android.annotation.SuppressLint;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class h0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    SVGLength f45388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    SVGLength f45389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    SVGLength f45390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    SVGLength f45391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.horcrux.svg.a.b f45392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.horcrux.svg.a.b f45393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    a f45394l;

    enum a {
        LUMINANCE,
        ALPHA
    }

    public h0(ReactContext reactContext) {
        super(reactContext);
    }

    public a q() {
        return this.f45394l;
    }

    public com.horcrux.svg.a.b r() {
        return this.f45392j;
    }

    @Override // com.horcrux.svg.c0, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMask(this, this.mName);
        }
    }

    public void setHeight(Dynamic dynamic) {
        this.f45391i = SVGLength.b(dynamic);
        invalidate();
    }

    public void setMaskContentUnits(int i11) {
        if (i11 == 0) {
            this.f45393k = com.horcrux.svg.a.b.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f45393k = com.horcrux.svg.a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void setMaskType(int i11) {
        if (i11 == 0) {
            this.f45394l = a.LUMINANCE;
        } else if (i11 == 1) {
            this.f45394l = a.ALPHA;
        }
        invalidate();
    }

    public void setMaskUnits(int i11) {
        if (i11 == 0) {
            this.f45392j = com.horcrux.svg.a.b.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f45392j = com.horcrux.svg.a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.f45390h = SVGLength.b(dynamic);
        invalidate();
    }

    public void setX(Dynamic dynamic) {
        this.f45388f = SVGLength.b(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.f45389g = SVGLength.b(dynamic);
        invalidate();
    }
}
