package com.swmansion.reanimated.layoutReanimation;

import android.util.Log;
import android.view.View;
import com.swmansion.rnscreens.a0;
import com.swmansion.rnscreens.m0;
import com.swmansion.rnscreens.t;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class ScreensHelper {
    public static View getTabNavigator(View view) {
        while (view != null) {
            if (isScreenContainer(view)) {
                return view;
            }
            if (!isScreen(view) || !isScreensCoordinatorLayout(view.getParent())) {
                if (!(view.getParent() instanceof View)) {
                    break;
                }
                view = (View) view.getParent();
            } else {
                try {
                    view = (View) view.getClass().getMethod("getContainer", null).invoke(view, null);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                    Log.e("[Reanimated]", e11.getMessage() != null ? e11.getMessage() : "Unable to invoke the getContainer method");
                }
            }
        }
        return null;
    }

    public static View getTopScreenForStack(View view) {
        if (isScreenStack(view)) {
            try {
                return (View) view.getClass().getMethod("getTopScreen", null).invoke(view, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return view;
    }

    private static boolean isInstanceOf(Object obj, String str) {
        return obj != null && obj.getClass().getSimpleName().equals(str);
    }

    public static boolean isScreen(Object obj) {
        return isInstanceOf(obj, t.TAG);
    }

    public static boolean isScreenContainer(Object obj) {
        return isInstanceOf(obj, "ScreenContainer");
    }

    public static boolean isScreenFragment(Object obj) {
        return isInstanceOf(obj, a0.TAG);
    }

    public static boolean isScreenStack(Object obj) {
        return isInstanceOf(obj, m0.TAG);
    }

    public static boolean isScreensCoordinatorLayout(Object obj) {
        return isInstanceOf(obj, "ScreensCoordinatorLayout");
    }

    public static boolean isViewChildOfScreen(View view, View view2) {
        while (view != null) {
            if (view == view2) {
                return true;
            }
            if (!(view.getParent() instanceof View)) {
                return false;
            }
            view = (View) view.getParent();
        }
        return false;
    }
}
