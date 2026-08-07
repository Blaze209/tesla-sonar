package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class i1 extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f45409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f45410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f45411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SVGLength f45412e;

    public i1(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f11) {
        Canvas canvas2;
        Paint paint2;
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f45408a);
        if (definedTemplate == null) {
            qk.a.I("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f45408a + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f45409b), (float) relativeOnHeight(this.f45410c));
        boolean z11 = definedTemplate instanceof RenderableView;
        if (z11) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int iSaveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof t0) {
            canvas2 = canvas;
            paint2 = paint;
            ((t0) definedTemplate).q(canvas2, paint2, f11, (float) relativeOnWidth(this.f45411d), (float) relativeOnHeight(this.f45412e));
        } else {
            canvas2 = canvas;
            paint2 = paint;
            definedTemplate.draw(canvas2, paint2, f11 * this.mOpacity);
        }
        RectF rectF = new RectF();
        getPath(canvas2, paint2).computeBounds(rectF, true);
        canvas2.getMatrix().mapRect(rectF);
        setClientRect(rectF);
        definedTemplate.restoreCanvas(canvas2, iSaveAndSetupCanvas);
        if (z11) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f45408a);
        if (definedTemplate == null) {
            qk.a.I("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f45408a + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f45409b), (float) relativeOnHeight(this.f45410c));
        path.transform(matrix, path2);
        return path2;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f45408a);
        if (definedTemplate != null) {
            int iHitTest = definedTemplate.hitTest(fArr2);
            if (iHitTest != -1) {
                return (definedTemplate.isResponsible() || iHitTest != definedTemplate.getId()) ? iHitTest : getId();
            }
            return -1;
        }
        qk.a.I("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f45408a + " is not defined.");
        return -1;
    }

    public void setHeight(Dynamic dynamic) {
        this.f45412e = SVGLength.b(dynamic);
        invalidate();
    }

    public void setHref(String str) {
        this.f45408a = str;
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.f45411d = SVGLength.b(dynamic);
        invalidate();
    }

    public void setX(Dynamic dynamic) {
        this.f45409b = SVGLength.b(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.f45410c = SVGLength.b(dynamic);
        invalidate();
    }
}
