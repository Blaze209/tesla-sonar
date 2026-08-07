package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class h extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f45384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f45385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f45386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SVGLength f45387d;

    public h(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f45384a);
        double dRelativeOnHeight = relativeOnHeight(this.f45385b);
        double dRelativeOnWidth2 = relativeOnWidth(this.f45386c);
        double dRelativeOnHeight2 = relativeOnHeight(this.f45387d);
        double d11 = dRelativeOnWidth - dRelativeOnWidth2;
        double d12 = dRelativeOnHeight - dRelativeOnHeight2;
        double d13 = dRelativeOnWidth + dRelativeOnWidth2;
        double d14 = dRelativeOnHeight + dRelativeOnHeight2;
        path.addOval(new RectF((float) d11, (float) d12, (float) d13, (float) d14), Path.Direction.CW);
        ArrayList<i0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new i0(g.kCGPathElementMoveToPoint, new m0[]{new m0(dRelativeOnWidth, d12)}));
        ArrayList<i0> arrayList2 = this.elements;
        g gVar = g.kCGPathElementAddLineToPoint;
        arrayList2.add(new i0(gVar, new m0[]{new m0(dRelativeOnWidth, d12), new m0(d13, dRelativeOnHeight)}));
        this.elements.add(new i0(gVar, new m0[]{new m0(d13, dRelativeOnHeight), new m0(dRelativeOnWidth, d14)}));
        this.elements.add(new i0(gVar, new m0[]{new m0(dRelativeOnWidth, d14), new m0(d11, dRelativeOnHeight)}));
        this.elements.add(new i0(gVar, new m0[]{new m0(d11, dRelativeOnHeight), new m0(dRelativeOnWidth, d12)}));
        return path;
    }

    public void setCx(Dynamic dynamic) {
        this.f45384a = SVGLength.b(dynamic);
        invalidate();
    }

    public void setCy(Dynamic dynamic) {
        this.f45385b = SVGLength.b(dynamic);
        invalidate();
    }

    public void setRx(Dynamic dynamic) {
        this.f45386c = SVGLength.b(dynamic);
        invalidate();
    }

    public void setRy(Dynamic dynamic) {
        this.f45387d = SVGLength.b(dynamic);
        invalidate();
    }
}
