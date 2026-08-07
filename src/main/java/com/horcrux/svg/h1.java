package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class h1 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    SVGLength f45395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    SVGLength f45396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f45397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    c1 f45398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private w0 f45399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<SVGLength> f45400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<SVGLength> f45401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList<SVGLength> f45402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<SVGLength> f45403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList<SVGLength> f45404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    double f45405p;

    public h1(ReactContext reactContext) {
        super(reactContext);
        this.f45395f = null;
        this.f45396g = null;
        this.f45397h = null;
        this.f45398i = c1.spacing;
        this.f45405p = Double.NaN;
    }

    @Override // com.horcrux.svg.VirtualView
    void clearCache() {
        this.f45405p = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.c0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f11) {
        p(canvas);
        clip(canvas, paint);
        s(canvas, paint);
        n();
        h(canvas, paint, f11);
        m();
    }

    @Override // com.horcrux.svg.c0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        p(canvas);
        return s(canvas, paint);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (this.mPath == null) {
            return;
        }
        super.invalidate();
        v().clearChildCache();
    }

    @Override // com.horcrux.svg.c0
    Path k(Canvas canvas, Paint paint, Region.Op op2) {
        return getPath(canvas, paint);
    }

    @Override // com.horcrux.svg.c0
    void n() {
        l().p(((this instanceof v0) || (this instanceof u0)) ? false : true, this, this.f45341a, this.f45400k, this.f45401l, this.f45403n, this.f45404o, this.f45402m);
    }

    w0 q() {
        w0 w0Var;
        if (this.f45399j == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof h1) && (w0Var = ((h1) parent).f45399j) != null) {
                    this.f45399j = w0Var;
                    return w0Var;
                }
            }
        }
        if (this.f45399j == null) {
            this.f45399j = w0.baseline;
        }
        return this.f45399j;
    }

    String r() {
        String str;
        if (this.f45397h == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof h1) && (str = ((h1) parent).f45397h) != null) {
                    this.f45397h = str;
                    return str;
                }
            }
        }
        return this.f45397h;
    }

    Path s(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        n();
        this.mPath = super.getPath(canvas, paint);
        m();
        return this.mPath;
    }

    public void setBaselineShift(Dynamic dynamic) {
        this.f45397h = SVGLength.c(dynamic);
        invalidate();
    }

    public void setDeltaX(Dynamic dynamic) {
        this.f45403n = SVGLength.a(dynamic);
        invalidate();
    }

    public void setDeltaY(Dynamic dynamic) {
        this.f45404o = SVGLength.a(dynamic);
        invalidate();
    }

    public void setInlineSize(Dynamic dynamic) {
        this.f45395f = SVGLength.b(dynamic);
        invalidate();
    }

    public void setLengthAdjust(String str) {
        this.f45398i = c1.valueOf(str);
        invalidate();
    }

    public void setMethod(String str) {
        this.f45399j = w0.getEnum(str);
        invalidate();
    }

    public void setPositionX(Dynamic dynamic) {
        this.f45400k = SVGLength.a(dynamic);
        invalidate();
    }

    public void setPositionY(Dynamic dynamic) {
        this.f45401l = SVGLength.a(dynamic);
        invalidate();
    }

    public void setRotate(Dynamic dynamic) {
        this.f45402m = SVGLength.a(dynamic);
        invalidate();
    }

    public void setTextLength(Dynamic dynamic) {
        this.f45396g = SVGLength.b(dynamic);
        invalidate();
    }

    public void setVerticalAlign(Dynamic dynamic) {
        String strC = SVGLength.c(dynamic);
        if (strC != null) {
            String strTrim = strC.trim();
            int iLastIndexOf = strTrim.lastIndexOf(32);
            try {
                this.f45399j = w0.getEnum(strTrim.substring(iLastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f45399j = w0.baseline;
            }
            try {
                this.f45397h = strTrim.substring(0, iLastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
                this.f45397h = null;
            }
        } else {
            this.f45399j = w0.baseline;
            this.f45397h = null;
        }
        invalidate();
    }

    double t(Paint paint) {
        if (!Double.isNaN(this.f45405p)) {
            return this.f45405p;
        }
        double dT = 0.0d;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof h1) {
                dT += ((h1) childAt).t(paint);
            }
        }
        this.f45405p = dT;
        return dT;
    }

    h1 u() {
        ArrayList<y> arrayList = l().f45309a;
        ViewParent parent = getParent();
        h1 h1Var = this;
        for (int size = arrayList.size() - 1; size >= 0 && (parent instanceof h1) && arrayList.get(size).f45539j != a1.start && h1Var.f45400k == null; size--) {
            h1Var = (h1) parent;
            parent = h1Var.getParent();
        }
        return h1Var;
    }

    h1 v() {
        ViewParent parent = getParent();
        h1 h1Var = this;
        while (parent instanceof h1) {
            h1Var = (h1) parent;
            parent = h1Var.getParent();
        }
        return h1Var;
    }
}
