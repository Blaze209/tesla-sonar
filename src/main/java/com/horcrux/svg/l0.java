package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class l0 extends c0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float[] f45443s = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SVGLength f45444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SVGLength f45445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f45446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f45447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a.b f45448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a.b f45449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f45450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f45451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f45452n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f45453o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    String f45454p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f45455q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Matrix f45456r;

    public l0(ReactContext reactContext) {
        super(reactContext);
        this.f45456r = null;
    }

    RectF getViewBox() {
        float f11 = this.f45450l;
        float f12 = this.mScale;
        float f13 = this.f45451m;
        return new RectF(f11 * f12, f13 * f12, (f11 + this.f45452n) * f12, (f13 + this.f45453o) * f12);
    }

    @Override // com.horcrux.svg.c0, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(a.EnumC0711a.PATTERN, new SVGLength[]{this.f45444f, this.f45445g, this.f45446h, this.f45447i}, this.f45448j);
            aVar.d(this.f45449k);
            aVar.g(this);
            Matrix matrix = this.f45456r;
            if (matrix != null) {
                aVar.f(matrix);
            }
            SvgView svgView = getSvgView();
            a.b bVar = this.f45448j;
            a.b bVar2 = a.b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.f45449k == bVar2) {
                aVar.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    public void setAlign(String str) {
        this.f45454p = str;
        invalidate();
    }

    public void setHeight(Dynamic dynamic) {
        this.f45447i = SVGLength.b(dynamic);
        invalidate();
    }

    public void setMeetOrSlice(int i11) {
        this.f45455q = i11;
        invalidate();
    }

    public void setMinX(float f11) {
        this.f45450l = f11;
        invalidate();
    }

    public void setMinY(float f11) {
        this.f45451m = f11;
        invalidate();
    }

    public void setPatternContentUnits(int i11) {
        if (i11 == 0) {
            this.f45449k = a.b.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f45449k = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void setPatternTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f45443s;
            int iC = n0.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f45456r == null) {
                    this.f45456r = new Matrix();
                }
                this.f45456r.setValues(fArr);
            } else if (iC != -1) {
                qk.a.I("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f45456r = null;
        }
        invalidate();
    }

    public void setPatternUnits(int i11) {
        if (i11 == 0) {
            this.f45448j = a.b.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f45448j = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void setVbHeight(float f11) {
        this.f45453o = f11;
        invalidate();
    }

    public void setVbWidth(float f11) {
        this.f45452n = f11;
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.f45446h = SVGLength.b(dynamic);
        invalidate();
    }

    public void setX(Dynamic dynamic) {
        this.f45444f = SVGLength.b(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.f45445g = SVGLength.b(dynamic);
        invalidate();
    }
}
