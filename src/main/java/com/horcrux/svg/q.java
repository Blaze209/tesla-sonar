package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class q extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FilterRegion f45484b;

    public q(ReactContext reactContext) {
        super(reactContext);
        this.f45484b = new FilterRegion();
    }

    protected static Bitmap j(HashMap<String, Bitmap> map, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? map.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    public Bitmap h(HashMap<String, Bitmap> map, Bitmap bitmap) {
        return null;
    }

    public String i() {
        return this.f45483a;
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
    }

    public void setHeight(Dynamic dynamic) {
        this.f45484b.setHeight(dynamic);
        invalidate();
    }

    public void setResult(String str) {
        this.f45483a = str;
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.f45484b.setWidth(dynamic);
        invalidate();
    }

    public void setX(Dynamic dynamic) {
        this.f45484b.setX(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.f45484b.setY(dynamic);
        invalidate();
    }
}
