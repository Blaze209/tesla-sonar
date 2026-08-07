package com.facebook.react.uimanager;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f23414a = new float[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PointF f23415b = new PointF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f23416c = new float[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Matrix f23417d = new Matrix();

    private enum a {
        SELF,
        CHILD
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f23419b;

        public View a() {
            return this.f23419b;
        }

        public int b() {
            return this.f23418a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).b() == this.f23418a;
        }

        public int hashCode() {
            return Integer.valueOf(this.f23418a).hashCode();
        }

        private b(int i11, View view) {
            this.f23418a = i11;
            this.f23419b = view;
        }
    }

    @SuppressLint({"ResourceType"})
    private static View a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ResourceType"})
    public static List<b> b(float f11, float f12, ViewGroup viewGroup, float[] fArr) {
        UiThreadUtil.assertOnUiThread();
        fArr[0] = f11;
        fArr[1] = f12;
        List<b> arrayList = new ArrayList<>();
        View viewF = f(fArr, viewGroup, arrayList);
        if (viewF != null) {
            int i11 = 0;
            while (viewF != null && viewF.getId() <= 0) {
                viewF = (View) viewF.getParent();
                i11++;
            }
            if (i11 > 0 && i11 <= arrayList.size()) {
                arrayList = arrayList.subList(i11, arrayList.size());
            }
            int iH = h(viewF, fArr[0], fArr[1]);
            if (iH != viewF.getId()) {
                arrayList.add(0, new b(iH, null));
            }
        }
        return arrayList;
    }

    public static int c(float f11, float f12, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        View viewA;
        UiThreadUtil.assertOnUiThread();
        int id2 = viewGroup.getId();
        fArr[0] = f11;
        fArr[1] = f12;
        View viewF = f(fArr, viewGroup, null);
        if (viewF == null || (viewA = a(viewF)) == null) {
            return id2;
        }
        if (iArr != null) {
            iArr[0] = viewA.getId();
        }
        return h(viewA, fArr[0], fArr[1]);
    }

    public static int d(float f11, float f12, ViewGroup viewGroup) {
        return c(f11, f12, viewGroup, f23414a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View e(float[] fArr, View view, EnumSet<a> enumSet, List<b> list) {
        if (enumSet.contains(a.CHILD) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!i(fArr[0], fArr[1], view)) {
                if (view instanceof e0) {
                    if (oo.a.a(view.getId()) == 2 && !j(fArr[0], fArr[1], view)) {
                        return null;
                    }
                    String overflow = ((e0) view).getOverflow();
                    if ("hidden".equals(overflow) || "scroll".equals(overflow)) {
                        return null;
                    }
                }
                if (viewGroup.getClipChildren()) {
                    return null;
                }
            }
            int childCount = viewGroup.getChildCount();
            o0 o0Var = viewGroup instanceof o0 ? (o0) viewGroup : null;
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = viewGroup.getChildAt(o0Var != null ? o0Var.getZIndexMappedChildIndex(i11) : i11);
                PointF pointF = f23415b;
                g(fArr[0], fArr[1], viewGroup, childAt, pointF);
                float f11 = fArr[0];
                float f12 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View viewF = f(fArr, childAt, list);
                if (viewF != null) {
                    return viewF;
                }
                fArr[0] = f11;
                fArr[1] = f12;
            }
        }
        if (enumSet.contains(a.SELF) && i(fArr[0], fArr[1], view)) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View f(float[] fArr, View view, List<b> list) {
        x pointerEvents = view instanceof f0 ? ((f0) view).getPointerEvents() : x.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == x.AUTO) {
                pointerEvents = x.BOX_NONE;
            } else if (pointerEvents == x.BOX_ONLY) {
                pointerEvents = x.NONE;
            }
        }
        if (pointerEvents == x.NONE) {
            return null;
        }
        if (pointerEvents == x.BOX_ONLY) {
            View viewE = e(fArr, view, EnumSet.of(a.SELF), list);
            if (viewE != null && list != null) {
                list.add(new b(view.getId(), view));
            }
            return viewE;
        }
        if (pointerEvents == x.BOX_NONE) {
            View viewE2 = e(fArr, view, EnumSet.of(a.CHILD), list);
            if (viewE2 != null) {
                if (list != null) {
                    list.add(new b(view.getId(), view));
                }
                return viewE2;
            }
            if (!(view instanceof b0) || !i(fArr[0], fArr[1], view) || ((b0) view).reactTagForTouch(fArr[0], fArr[1]) == view.getId()) {
                return null;
            }
            if (list != null) {
                list.add(new b(view.getId(), view));
                return view;
            }
        } else {
            if (pointerEvents != x.AUTO) {
                qk.a.I("ReactNative", "Unknown pointer event type: " + pointerEvents.toString());
            }
            if (!(view instanceof c0) || !i(fArr[0], fArr[1], view) || !((c0) view).interceptsTouchEvent(fArr[0], fArr[1])) {
                View viewE3 = e(fArr, view, EnumSet.of(a.SELF, a.CHILD), list);
                if (viewE3 != null && list != null) {
                    list.add(new b(view.getId(), view));
                }
                return viewE3;
            }
            if (list != null) {
                list.add(new b(view.getId(), view));
            }
        }
        return view;
    }

    private static void g(float f11, float f12, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f11 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f12 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f23416c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f23417d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f13 = fArr[0];
            scrollY = fArr[1];
            scrollX = f13;
        }
        pointF.set(scrollX, scrollY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int h(View view, float f11, float f12) {
        return view instanceof b0 ? ((b0) view).reactTagForTouch(f11, f12) : view.getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean i(float f11, float f12, View view) {
        if (view instanceof mo.c) {
            mo.c cVar = (mo.c) view;
            if (cVar.getHitSlopRect() != null) {
                Rect hitSlopRect = cVar.getHitSlopRect();
                return f11 >= ((float) (-hitSlopRect.left)) && f11 < ((float) (view.getWidth() + hitSlopRect.right)) && f12 >= ((float) (-hitSlopRect.top)) && f12 < ((float) (view.getHeight() + hitSlopRect.bottom));
            }
        }
        return f11 >= BitmapDescriptorFactory.HUE_RED && f11 < ((float) view.getWidth()) && f12 >= BitmapDescriptorFactory.HUE_RED && f12 < ((float) view.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean j(float f11, float f12, View view) {
        if (!(view instanceof e0)) {
            return false;
        }
        Rect overflowInset = ((e0) view).getOverflowInset();
        return f11 >= ((float) overflowInset.left) && f11 < ((float) (view.getWidth() - overflowInset.right)) && f12 >= ((float) overflowInset.top) && f12 < ((float) (view.getHeight() - overflowInset.bottom));
    }
}
