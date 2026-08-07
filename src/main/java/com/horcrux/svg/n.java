package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class n extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f45462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f45463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f45464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    s f45465f;

    public n(ReactContext reactContext) {
        super(reactContext);
    }

    private Bitmap k(Context context, Bitmap bitmap) {
        float fMax = Math.max(this.f45463d, this.f45464e) * 2.0f;
        if (fMax <= BitmapDescriptorFactory.HUE_RED) {
            return bitmap;
        }
        float fMin = Math.min(fMax, 25.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(fMin);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateFromBitmap2.destroy();
        renderScriptCreate.destroy();
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    @Override // com.horcrux.svg.q
    public Bitmap h(HashMap<String, Bitmap> map, Bitmap bitmap) {
        return k(getContext(), q.j(map, bitmap, this.f45462c));
    }

    public void setEdgeMode(String str) {
        this.f45465f = s.getEnum(str);
        invalidate();
    }

    public void setIn1(String str) {
        this.f45462c = str;
        invalidate();
    }

    public void setStdDeviationX(float f11) {
        this.f45463d = f11;
        invalidate();
    }

    public void setStdDeviationY(float f11) {
        this.f45464e = f11;
        invalidate();
    }
}
