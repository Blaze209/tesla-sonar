package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class v0 extends h1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f45519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private f1 f45520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e1 f45521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SVGLength f45522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d1 f45523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private g1 f45524v;

    public v0(ReactContext reactContext) {
        super(reactContext);
        this.f45523u = d1.align;
        this.f45524v = g1.exact;
    }

    @Override // com.horcrux.svg.h1, com.horcrux.svg.c0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f11) {
        h(canvas, paint, f11);
    }

    @Override // com.horcrux.svg.h1, com.horcrux.svg.c0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return s(canvas, paint);
    }

    @Override // com.horcrux.svg.c0
    void m() {
    }

    @Override // com.horcrux.svg.h1, com.horcrux.svg.c0
    void n() {
    }

    public void setHref(String str) {
        this.f45519q = str;
        invalidate();
    }

    @Override // com.horcrux.svg.h1
    public void setMethod(String str) {
        this.f45523u = d1.valueOf(str);
        invalidate();
    }

    public void setSharp(String str) {
        this.f45521s = e1.valueOf(str);
        invalidate();
    }

    public void setSide(String str) {
        this.f45520r = f1.valueOf(str);
        invalidate();
    }

    public void setSpacing(String str) {
        this.f45524v = g1.valueOf(str);
        invalidate();
    }

    public void setStartOffset(Dynamic dynamic) {
        this.f45522t = SVGLength.b(dynamic);
        invalidate();
    }

    e1 w() {
        return this.f45521s;
    }

    f1 x() {
        return this.f45520r;
    }

    SVGLength y() {
        return this.f45522t;
    }

    Path z(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f45519q);
        if (definedTemplate instanceof RenderableView) {
            return ((RenderableView) definedTemplate).getPath(canvas, paint);
        }
        return null;
    }
}
