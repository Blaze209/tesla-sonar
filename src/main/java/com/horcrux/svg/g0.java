package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class g0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SVGLength f45371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SVGLength f45372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f45373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f45374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f45375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f45376k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f45377l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f45378m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f45379n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f45380o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    String f45381p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f45382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Matrix f45383r;

    public g0(ReactContext reactContext) {
        super(reactContext);
        this.f45383r = new Matrix();
    }

    void q(Canvas canvas, Paint paint, float f11, o0 o0Var, float f12) {
        int iSaveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.f45383r.reset();
        m0 m0Var = o0Var.f45476b;
        this.f45383r.setTranslate((float) m0Var.f45460a, (float) m0Var.f45461b);
        double d11 = DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(this.f45376k) ? -1.0d : Double.parseDouble(this.f45376k);
        if (d11 == -1.0d) {
            d11 = o0Var.f45477c;
        }
        this.f45383r.preRotate(((float) d11) + 180.0f);
        if ("strokeWidth".equals(this.f45375j)) {
            Matrix matrix = this.f45383r;
            float f13 = this.mScale;
            matrix.preScale(f12 / f13, f12 / f13);
        }
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) relativeOnWidth(this.f45373h), (float) relativeOnHeight(this.f45374i));
        if (this.f45381p != null) {
            float f14 = this.f45377l;
            float f15 = this.mScale;
            float f16 = this.f45378m;
            Matrix matrixA = j1.a(new RectF(f14 * f15, f16 * f15, (f14 + this.f45379n) * f15, (f16 + this.f45380o) * f15), rectF, this.f45381p, this.f45382q);
            float[] fArr = new float[9];
            matrixA.getValues(fArr);
            this.f45383r.preScale(fArr[0], fArr[4]);
        }
        this.f45383r.preTranslate((float) (-relativeOnWidth(this.f45371f)), (float) (-relativeOnHeight(this.f45372g)));
        canvas.concat(this.f45383r);
        h(canvas, paint, f11);
        restoreCanvas(canvas, iSaveAndSetupCanvas);
    }

    @Override // com.horcrux.svg.c0, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    public void setAlign(String str) {
        this.f45381p = str;
        invalidate();
    }

    public void setMarkerHeight(Dynamic dynamic) {
        this.f45374i = SVGLength.b(dynamic);
        invalidate();
    }

    public void setMarkerUnits(String str) {
        this.f45375j = str;
        invalidate();
    }

    public void setMarkerWidth(Dynamic dynamic) {
        this.f45373h = SVGLength.b(dynamic);
        invalidate();
    }

    public void setMeetOrSlice(int i11) {
        this.f45382q = i11;
        invalidate();
    }

    public void setMinX(float f11) {
        this.f45377l = f11;
        invalidate();
    }

    public void setMinY(float f11) {
        this.f45378m = f11;
        invalidate();
    }

    public void setOrient(String str) {
        this.f45376k = str;
        invalidate();
    }

    public void setRefX(Dynamic dynamic) {
        this.f45371f = SVGLength.b(dynamic);
        invalidate();
    }

    public void setRefY(Dynamic dynamic) {
        this.f45372g = SVGLength.b(dynamic);
        invalidate();
    }

    public void setVbHeight(float f11) {
        this.f45380o = f11;
        invalidate();
    }

    public void setVbWidth(float f11) {
        this.f45379n = f11;
        invalidate();
    }
}
