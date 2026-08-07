package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class k0 extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Path f45434a;

    public k0(ReactContext reactContext) {
        super(reactContext);
        j0.f45417a = this.mScale;
        this.f45434a = new Path();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return this.f45434a;
    }

    public void setD(String str) {
        this.f45434a = j0.o(str);
        ArrayList<i0> arrayList = j0.f45422f;
        this.elements = arrayList;
        Iterator<i0> it = arrayList.iterator();
        while (it.hasNext()) {
            for (m0 m0Var : it.next().f45407b) {
                double d11 = m0Var.f45460a;
                float f11 = this.mScale;
                m0Var.f45460a = d11 * ((double) f11);
                m0Var.f45461b *= (double) f11;
            }
        }
        invalidate();
    }
}
