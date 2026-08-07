package com.ijzerenhein.sharedelement;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes6.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    View f45553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    RectF f45554b;

    c() {
    }

    static RectF a(View view) {
        if (view instanceof pl.d) {
            pl.d dVar = (pl.d) view;
            ol.a controller = dVar.getController();
            ml.a hierarchy = dVar.getHierarchy();
            if (controller == null || controller.toString().contains("fetchedImage=0,")) {
                return null;
            }
            RectF rectF = new RectF();
            hierarchy.l(rectF);
            return rectF;
        }
        if (!(view instanceof ImageView)) {
            return new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        }
        Drawable drawable = ((ImageView) view).getDrawable();
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        return new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, intrinsicWidth, intrinsicHeight);
    }
}
