package com.rnmaps.maps;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes6.dex */
public class x extends com.facebook.react.views.view.e {
    public x(Context context) {
        super(context);
        setWillNotDraw(true);
        setVisibility(0);
        setAlpha(BitmapDescriptorFactory.HUE_RED);
        setRemoveClippedSubviews(false);
        setClipBounds(new Rect(0, 0, 0, 0));
        setOverflow("hidden");
    }

    @Override // com.facebook.react.views.view.e, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }
}
