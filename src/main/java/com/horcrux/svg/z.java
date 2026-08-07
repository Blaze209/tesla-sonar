package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class z extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    SVGLength f45547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    SVGLength f45548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    SVGLength f45549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    SVGLength f45550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Bitmap f45551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Canvas f45552k;

    public z(ReactContext reactContext) {
        super(reactContext);
        this.f45551j = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.f45552k = new Canvas(this.f45551j);
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f45552k);
    }

    @Override // com.horcrux.svg.c0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f11) {
        float fRelativeOnWidth = (float) relativeOnWidth(this.f45547f);
        float fRelativeOnHeight = (float) relativeOnHeight(this.f45548g);
        float fRelativeOnWidth2 = (float) relativeOnWidth(this.f45549h);
        float fRelativeOnHeight2 = (float) relativeOnHeight(this.f45550i);
        canvas.translate(fRelativeOnWidth, fRelativeOnHeight);
        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fRelativeOnWidth2, fRelativeOnHeight2);
        super.draw(canvas, paint, f11);
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        return super.drawChild(this.f45552k, view, j11);
    }

    @Override // com.horcrux.svg.c0
    void h(Canvas canvas, Paint paint, float f11) {
        n();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt instanceof h0)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z11 = virtualView instanceof RenderableView;
                        if (z11) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f11);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                        if (z11) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    childAt.draw(canvas);
                }
            }
        }
        setClientRect(rectF);
        m();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(@NonNull View view, @NonNull View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public void setHeight(Dynamic dynamic) {
        this.f45550i = SVGLength.b(dynamic);
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.f45549h = SVGLength.b(dynamic);
        invalidate();
    }

    public void setX(Dynamic dynamic) {
        this.f45547f = SVGLength.b(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.f45548g = SVGLength.b(dynamic);
        invalidate();
    }
}
