package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class f0 extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float[] f45363h = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f45364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f45365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f45366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f45367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ReadableArray f45368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a.b f45369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Matrix f45370g;

    public f0(ReactContext reactContext) {
        super(reactContext);
        this.f45370g = null;
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(a.EnumC0711a.LINEAR_GRADIENT, new SVGLength[]{this.f45364a, this.f45365b, this.f45366c, this.f45367d}, this.f45369f);
            aVar.e(this.f45368e);
            Matrix matrix = this.f45370g;
            if (matrix != null) {
                aVar.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f45369f == a.b.USER_SPACE_ON_USE) {
                aVar.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    public void setGradient(ReadableArray readableArray) {
        this.f45368e = readableArray;
        invalidate();
    }

    public void setGradientTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f45363h;
            int iC = n0.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f45370g == null) {
                    this.f45370g = new Matrix();
                }
                this.f45370g.setValues(fArr);
            } else if (iC != -1) {
                qk.a.I("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f45370g = null;
        }
        invalidate();
    }

    public void setGradientUnits(int i11) {
        if (i11 == 0) {
            this.f45369f = a.b.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f45369f = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void setX1(Dynamic dynamic) {
        this.f45364a = SVGLength.b(dynamic);
        invalidate();
    }

    public void setX2(Dynamic dynamic) {
        this.f45366c = SVGLength.b(dynamic);
        invalidate();
    }

    public void setY1(Dynamic dynamic) {
        this.f45365b = SVGLength.b(dynamic);
        invalidate();
    }

    public void setY2(Dynamic dynamic) {
        this.f45367d = SVGLength.b(dynamic);
        invalidate();
    }
}
