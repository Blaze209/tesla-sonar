package com.swmansion.reanimated;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public class ReactNativeUtils {
    private static Method getCornerRadiiMethod;
    private static Field mBorderRadiusField;

    public static class BorderRadii {
        public float bottomLeft;
        public float bottomRight;
        public float full;
        public float topLeft;
        public float topRight;

        public BorderRadii(float f11, float f12, float f13, float f14, float f15) {
            this.full = Float.isNaN(f11) ? BitmapDescriptorFactory.HUE_RED : f11;
            this.topLeft = Float.isNaN(f12) ? this.full : f12;
            this.topRight = Float.isNaN(f13) ? this.full : f13;
            this.bottomLeft = Float.isNaN(f14) ? this.full : f14;
            this.bottomRight = Float.isNaN(f15) ? this.full : f15;
        }
    }

    public static BorderRadii getBorderRadii(View view) {
        if (view.getBackground() != null) {
            return BorderRadiiDrawableUtils.getBorderRadii(view);
        }
        if (view instanceof com.facebook.react.views.image.h) {
            try {
                if (mBorderRadiusField == null) {
                    Field declaredField = com.facebook.react.views.image.h.class.getDeclaredField("mBorderRadius");
                    mBorderRadiusField = declaredField;
                    declaredField.setAccessible(true);
                }
                float f11 = mBorderRadiusField.getFloat(view);
                if (getCornerRadiiMethod == null) {
                    Method declaredMethod = com.facebook.react.views.image.h.class.getDeclaredMethod("getCornerRadii", float[].class);
                    getCornerRadiiMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (Float.isNaN(f11)) {
                    f11 = BitmapDescriptorFactory.HUE_RED;
                }
                float f12 = f11;
                float[] fArr = new float[4];
                getCornerRadiiMethod.invoke(view, fArr);
                return new BorderRadii(f12, fArr[0], fArr[1], fArr[2], fArr[3]);
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            }
        }
        return new BorderRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }
}
