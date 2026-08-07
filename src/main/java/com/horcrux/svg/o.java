package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class o extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ReadableArray f45467c;

    public o(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.q
    public Bitmap h(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int size = this.f45467c.size();
        for (int i11 = 0; i11 < size; i11++) {
            String string = this.f45467c.getString(i11);
            Bitmap bitmap2 = string.isEmpty() ? bitmap : map.get(string);
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint());
            }
        }
        return bitmapCreateBitmap;
    }

    public void setNodes(ReadableArray readableArray) {
        this.f45467c = readableArray;
        invalidate();
    }
}
