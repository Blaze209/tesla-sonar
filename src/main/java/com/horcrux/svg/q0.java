package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class q0 extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f45485j = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f45486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f45487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f45488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f45489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SVGLength f45490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SVGLength f45491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ReadableArray f45492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a.b f45493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Matrix f45494i;

    public q0(ReactContext reactContext) {
        super(reactContext);
        this.f45494i = null;
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            a aVar = new a(a.EnumC0711a.RADIAL_GRADIENT, new SVGLength[]{this.f45486a, this.f45487b, this.f45488c, this.f45489d, this.f45490e, this.f45491f}, this.f45493h);
            aVar.e(this.f45492g);
            Matrix matrix = this.f45494i;
            if (matrix != null) {
                aVar.f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f45493h == a.b.USER_SPACE_ON_USE) {
                aVar.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(aVar, this.mName);
        }
    }

    public void setCx(Dynamic dynamic) {
        this.f45490e = SVGLength.b(dynamic);
        invalidate();
    }

    public void setCy(Dynamic dynamic) {
        this.f45491f = SVGLength.b(dynamic);
        invalidate();
    }

    public void setFx(Dynamic dynamic) {
        this.f45486a = SVGLength.b(dynamic);
        invalidate();
    }

    public void setFy(Dynamic dynamic) {
        this.f45487b = SVGLength.b(dynamic);
        invalidate();
    }

    public void setGradient(ReadableArray readableArray) {
        this.f45492g = readableArray;
        invalidate();
    }

    public void setGradientTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f45485j;
            int iC = n0.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f45494i == null) {
                    this.f45494i = new Matrix();
                }
                this.f45494i.setValues(fArr);
            } else if (iC != -1) {
                qk.a.I("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f45494i = null;
        }
        invalidate();
    }

    public void setGradientUnits(int i11) {
        if (i11 == 0) {
            this.f45493h = a.b.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f45493h = a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void setRx(Dynamic dynamic) {
        this.f45488c = SVGLength.b(dynamic);
        invalidate();
    }

    public void setRy(Dynamic dynamic) {
        this.f45489d = SVGLength.b(dynamic);
        invalidate();
    }
}
