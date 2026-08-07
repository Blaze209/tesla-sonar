package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class f extends e {
    public f(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.e, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f11) {
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
