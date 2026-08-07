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
class b extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SVGLength f45335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVGLength f45336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVGLength f45337c;

    public b(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f45335a);
        double dRelativeOnHeight = relativeOnHeight(this.f45336b);
        double dRelativeOnOther = relativeOnOther(this.f45337c);
        path.addCircle((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) dRelativeOnOther, Path.Direction.CW);
        ArrayList<i0> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d11 = dRelativeOnHeight - dRelativeOnOther;
        arrayList.add(new i0(g.kCGPathElementMoveToPoint, new m0[]{new m0(dRelativeOnWidth, d11)}));
        ArrayList<i0> arrayList2 = this.elements;
        g gVar = g.kCGPathElementAddLineToPoint;
        double d12 = dRelativeOnWidth + dRelativeOnOther;
        arrayList2.add(new i0(gVar, new m0[]{new m0(dRelativeOnWidth, d11), new m0(d12, dRelativeOnHeight)}));
        double d13 = dRelativeOnHeight + dRelativeOnOther;
        this.elements.add(new i0(gVar, new m0[]{new m0(d12, dRelativeOnHeight), new m0(dRelativeOnWidth, d13)}));
        ArrayList<i0> arrayList3 = this.elements;
        m0 m0Var = new m0(dRelativeOnWidth, d13);
        double d14 = dRelativeOnWidth - dRelativeOnOther;
        arrayList3.add(new i0(gVar, new m0[]{m0Var, new m0(d14, dRelativeOnHeight)}));
        this.elements.add(new i0(gVar, new m0[]{new m0(d14, dRelativeOnHeight), new m0(dRelativeOnWidth, d11)}));
        return path;
    }

    public void setCx(Dynamic dynamic) {
        this.f45335a = SVGLength.b(dynamic);
        invalidate();
    }

    public void setCy(Dynamic dynamic) {
        this.f45336b = SVGLength.b(dynamic);
        invalidate();
    }

    public void setR(Dynamic dynamic) {
        this.f45337c = SVGLength.b(dynamic);
        invalidate();
    }
}
