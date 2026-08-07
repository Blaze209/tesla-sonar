package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class r0 extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f45495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f45496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f45497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f45498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SVGLength f45499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SVGLength f45500f;

    public r0(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        double dRelativeOnWidth;
        double dRelativeOnHeight;
        double d11;
        double d12;
        Path path = new Path();
        double dRelativeOnWidth2 = relativeOnWidth(this.f45495a);
        double dRelativeOnHeight2 = relativeOnHeight(this.f45496b);
        double dRelativeOnWidth3 = relativeOnWidth(this.f45497c);
        double dRelativeOnHeight3 = relativeOnHeight(this.f45498d);
        SVGLength sVGLength = this.f45499e;
        if (sVGLength == null && this.f45500f == null) {
            path.addRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), Path.Direction.CW);
            path.close();
        } else {
            if (sVGLength == null) {
                dRelativeOnWidth = relativeOnHeight(this.f45500f);
            } else {
                if (this.f45500f == null) {
                    dRelativeOnWidth = relativeOnWidth(sVGLength);
                } else {
                    dRelativeOnWidth = relativeOnWidth(sVGLength);
                    dRelativeOnHeight = relativeOnHeight(this.f45500f);
                }
                d11 = dRelativeOnWidth3 / 2.0d;
                if (dRelativeOnWidth > d11) {
                    dRelativeOnWidth = d11;
                }
                d12 = dRelativeOnHeight3 / 2.0d;
                if (dRelativeOnHeight > d12) {
                    dRelativeOnHeight = d12;
                }
                path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
            }
            dRelativeOnHeight = dRelativeOnWidth;
            d11 = dRelativeOnWidth3 / 2.0d;
            if (dRelativeOnWidth > d11) {
                dRelativeOnWidth = d11;
            }
            d12 = dRelativeOnHeight3 / 2.0d;
            if (dRelativeOnHeight > d12) {
                dRelativeOnHeight = d12;
            }
            path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
        }
        ArrayList<i0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new i0(g.kCGPathElementMoveToPoint, new m0[]{new m0(dRelativeOnWidth2, dRelativeOnHeight2)}));
        ArrayList<i0> arrayList2 = this.elements;
        g gVar = g.kCGPathElementAddLineToPoint;
        double d13 = dRelativeOnWidth3 + dRelativeOnWidth2;
        arrayList2.add(new i0(gVar, new m0[]{new m0(d13, dRelativeOnHeight2)}));
        double d14 = dRelativeOnHeight2 + dRelativeOnHeight3;
        this.elements.add(new i0(gVar, new m0[]{new m0(d13, d14)}));
        this.elements.add(new i0(gVar, new m0[]{new m0(dRelativeOnWidth2, d14)}));
        this.elements.add(new i0(gVar, new m0[]{new m0(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }

    public void setHeight(Dynamic dynamic) {
        this.f45498d = SVGLength.b(dynamic);
        invalidate();
    }

    public void setRx(Dynamic dynamic) {
        this.f45499e = SVGLength.b(dynamic);
        invalidate();
    }

    public void setRy(Dynamic dynamic) {
        this.f45500f = SVGLength.b(dynamic);
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.f45497c = SVGLength.b(dynamic);
        invalidate();
    }

    public void setX(Dynamic dynamic) {
        this.f45495a = SVGLength.b(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.f45496b = SVGLength.b(dynamic);
        invalidate();
    }
}
