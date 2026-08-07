package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class t0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f45504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f45505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f45506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f45507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f45508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f45509k;

    public t0(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.c0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f11) {
        saveDefinition();
    }

    void q(Canvas canvas, Paint paint, float f11, float f12, float f13) {
        if (this.f45508j != null) {
            float f14 = this.f45504f;
            float f15 = this.mScale;
            float f16 = this.f45505g;
            canvas.concat(j1.a(new RectF(f14 * f15, f16 * f15, (f14 + this.f45506h) * f15, (f16 + this.f45507i) * f15), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f12, f13), this.f45508j, this.f45509k));
            super.draw(canvas, paint, f11);
        }
    }

    public void setAlign(String str) {
        this.f45508j = str;
        invalidate();
    }

    public void setMeetOrSlice(int i11) {
        this.f45509k = i11;
        invalidate();
    }

    public void setMinX(float f11) {
        this.f45504f = f11;
        invalidate();
    }

    public void setMinY(float f11) {
        this.f45505g = f11;
        invalidate();
    }

    public void setVbHeight(float f11) {
        this.f45507i = f11;
        invalidate();
    }

    public void setVbWidth(float f11) {
        this.f45506h = f11;
        invalidate();
    }
}
