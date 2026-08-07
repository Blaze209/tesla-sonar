package com.swmansion.reanimated;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.facebook.react.uimanager.r0;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes7.dex */
public class NativeMethodsHelper {
    private static void computeBoundingBox(View view, int[] iArr) {
        RectF rectF = new RectF();
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, rectF);
        iArr[0] = Math.round(rectF.left);
        iArr[1] = Math.round(rectF.top);
        iArr[2] = Math.round(rectF.right - rectF.left);
        iArr[3] = Math.round(rectF.bottom - rectF.top);
    }

    private static com.facebook.react.views.scroll.g findScrollView(com.facebook.react.views.swiperefresh.a aVar) {
        for (int i11 = 0; i11 < aVar.getChildCount(); i11++) {
            if (aVar.getChildAt(i11) instanceof com.facebook.react.views.scroll.g) {
                return (com.facebook.react.views.scroll.g) aVar.getChildAt(i11);
            }
        }
        return null;
    }

    private static void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public static float[] measure(View view) {
        View view2 = (View) r0.a(view);
        if (view2 == null || view == null) {
            float[] fArr = new float[6];
            fArr[0] = -1234567.0f;
            return fArr;
        }
        int[] iArr = new int[4];
        computeBoundingBox(view2, iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        computeBoundingBox(view, iArr);
        iArr[0] = iArr[0] - i11;
        iArr[1] = iArr[1] - i12;
        float[] fArr2 = new float[6];
        fArr2[0] = w.f(view.getLeft());
        fArr2[1] = w.f(view.getTop());
        for (int i13 = 2; i13 < 6; i13++) {
            fArr2[i13] = w.f(iArr[i13 - 2]);
        }
        return fArr2;
    }

    public static void scrollTo(final View view, double d11, double d12, boolean z11) {
        final int iRound = Math.round(w.g(d11));
        final int iRound2 = Math.round(w.g(d12));
        boolean z12 = view instanceof com.facebook.react.views.scroll.f;
        if (!z12) {
            if (view instanceof com.facebook.react.views.swiperefresh.a) {
                view = findScrollView((com.facebook.react.views.swiperefresh.a) view);
            }
            if (!(view instanceof com.facebook.react.views.scroll.g)) {
                Log.w("REANIMATED", "NativeMethodsHelper: Unhandled scroll view type - allowed only {ReactScrollView, ReactHorizontalScrollView}");
                return;
            }
        }
        if (!z11) {
            view.scrollTo(iRound, iRound2);
        } else if (z12) {
            view.post(new Runnable() { // from class: com.swmansion.reanimated.a
                @Override // java.lang.Runnable
                public final void run() {
                    ((com.facebook.react.views.scroll.f) view).smoothScrollTo(iRound, iRound2);
                }
            });
        } else {
            view.post(new Runnable() { // from class: com.swmansion.reanimated.b
                @Override // java.lang.Runnable
                public final void run() {
                    ((com.facebook.react.views.scroll.g) view).smoothScrollTo(iRound, iRound2);
                }
            });
        }
    }
}
