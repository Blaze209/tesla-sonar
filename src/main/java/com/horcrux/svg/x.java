package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class x extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, Bitmap> f45525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w f45526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w f45527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FilterRegion f45528d;

    public x(ReactContext reactContext) {
        super(reactContext);
        this.f45525a = new HashMap<>();
        this.f45528d = new FilterRegion();
    }

    public Bitmap h(Bitmap bitmap, Bitmap bitmap2, RectF rectF) {
        this.f45525a.clear();
        this.f45525a.put("SourceGraphic", bitmap);
        this.f45525a.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmap));
        this.f45525a.put("BackgroundImage", bitmap2);
        this.f45525a.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(bitmap2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect cropRect = this.f45528d.getCropRect(this, this.f45526b, rectF);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof q) {
                q qVar = (q) childAt;
                bitmapCreateBitmap.eraseColor(0);
                FilterRegion filterRegion = qVar.f45484b;
                w wVar = this.f45527c;
                Rect cropRect2 = filterRegion.getCropRect(qVar, wVar, wVar == w.USER_SPACE_ON_USE ? new RectF(cropRect) : rectF);
                canvas.drawBitmap(qVar.h(this.f45525a, bitmap), cropRect2, cropRect2, (Paint) null);
                bitmap = bitmapCreateBitmap.copy(Bitmap.Config.ARGB_8888, true);
                String strI = qVar.i();
                if (strI != null) {
                    this.f45525a.put(strI, bitmap);
                }
            } else {
                Log.e("RNSVG", "Invalid `Filter` child: Filter children can only be `Fe...` components");
            }
        }
        bitmapCreateBitmap.eraseColor(0);
        canvas.drawBitmap(bitmap, cropRect, cropRect, (Paint) null);
        return bitmapCreateBitmap;
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        SvgView svgView;
        if (this.mName == null || (svgView = getSvgView()) == null) {
            return;
        }
        svgView.defineFilter(this, this.mName);
    }

    public void setFilterUnits(String str) {
        this.f45526b = w.getEnum(str);
        invalidate();
    }

    public void setHeight(Dynamic dynamic) {
        this.f45528d.setHeight(dynamic);
        invalidate();
    }

    public void setPrimitiveUnits(String str) {
        this.f45527c = w.getEnum(str);
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.f45528d.setWidth(dynamic);
        invalidate();
    }

    public void setX(Dynamic dynamic) {
        this.f45528d.setX(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.f45528d.setY(dynamic);
        invalidate();
    }
}
