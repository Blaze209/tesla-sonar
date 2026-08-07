package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class p extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f45480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    SVGLength f45481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    SVGLength f45482e;

    public p(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.q
    public Bitmap h(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapJ = q.j(map, bitmap, this.f45480c);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        SVGLength sVGLength = this.f45481d;
        float fRelativeOnWidth = sVGLength != null ? (float) relativeOnWidth(sVGLength) : 0.0f;
        SVGLength sVGLength2 = this.f45482e;
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fRelativeOnWidth, sVGLength2 != null ? (float) relativeOnHeight(sVGLength2) : 0.0f);
        getSvgView().getCtm().mapRect(rectF);
        float fWidth = rectF.left;
        if (fWidth >= BitmapDescriptorFactory.HUE_RED) {
            fWidth = rectF.width();
        }
        float fHeight = rectF.top;
        if (fHeight >= BitmapDescriptorFactory.HUE_RED) {
            fHeight = rectF.height();
        }
        canvas.drawBitmap(bitmapJ, fWidth, fHeight, (Paint) null);
        return bitmapCreateBitmap;
    }

    public void setDx(Dynamic dynamic) {
        this.f45481d = SVGLength.b(dynamic);
        invalidate();
    }

    public void setDy(Dynamic dynamic) {
        this.f45482e = SVGLength.b(dynamic);
        invalidate();
    }

    public void setIn1(String str) {
        this.f45480c = str;
        invalidate();
    }
}
