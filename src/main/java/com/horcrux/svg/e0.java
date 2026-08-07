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
class e0 extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f45357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f45358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f45359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f45360d;

    public e0(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f45357a);
        double dRelativeOnHeight = relativeOnHeight(this.f45358b);
        double dRelativeOnWidth2 = relativeOnWidth(this.f45359c);
        double dRelativeOnHeight2 = relativeOnHeight(this.f45360d);
        path.moveTo((float) dRelativeOnWidth, (float) dRelativeOnHeight);
        path.lineTo((float) dRelativeOnWidth2, (float) dRelativeOnHeight2);
        ArrayList<i0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new i0(g.kCGPathElementMoveToPoint, new m0[]{new m0(dRelativeOnWidth, dRelativeOnHeight)}));
        this.elements.add(new i0(g.kCGPathElementAddLineToPoint, new m0[]{new m0(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }

    public void setX1(Dynamic dynamic) {
        this.f45357a = SVGLength.b(dynamic);
        invalidate();
    }

    public void setX2(Dynamic dynamic) {
        this.f45359c = SVGLength.b(dynamic);
        invalidate();
    }

    public void setY1(Dynamic dynamic) {
        this.f45358b = SVGLength.b(dynamic);
        invalidate();
    }

    public void setY2(Dynamic dynamic) {
        this.f45360d = SVGLength.b(dynamic);
        invalidate();
    }
}
