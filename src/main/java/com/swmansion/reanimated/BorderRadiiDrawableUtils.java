package com.swmansion.reanimated;

import android.graphics.Rect;
import android.view.View;
import com.facebook.react.uimanager.LengthPercentage;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes7.dex */
public class BorderRadiiDrawableUtils {
    public static ReactNativeUtils.BorderRadii getBorderRadii(View view) {
        return new ReactNativeUtils.BorderRadii(getRadiusForCorner(view, so.d.BORDER_RADIUS, BitmapDescriptorFactory.HUE_RED), getRadiusForCorner(view, so.d.BORDER_TOP_LEFT_RADIUS, Float.NaN), getRadiusForCorner(view, so.d.BORDER_TOP_RIGHT_RADIUS, Float.NaN), getRadiusForCorner(view, so.d.BORDER_BOTTOM_LEFT_RADIUS, Float.NaN), getRadiusForCorner(view, so.d.BORDER_BOTTOM_RIGHT_RADIUS, Float.NaN));
    }

    private static float getRadiusForCorner(View view, so.d dVar, float f11) {
        LengthPercentage lengthPercentageJ = com.facebook.react.uimanager.a.j(view, dVar);
        if (lengthPercentageJ == null) {
            return f11;
        }
        Rect bounds = view.getBackground().getBounds();
        return lengthPercentageJ.c(bounds.width(), bounds.height()).c().getHorizontal();
    }
}
