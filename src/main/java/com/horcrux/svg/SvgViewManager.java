package com.horcrux.svg;

import android.graphics.Rect;
import android.util.SparseArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.l1;
import com.facebook.react.views.view.ReactViewManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import vo.g2;
import vo.h2;

/* JADX INFO: loaded from: classes6.dex */
class SvgViewManager extends ReactViewManager implements h2<SvgView> {
    public static final String REACT_CLASS = "RNSVGSvgViewAndroid";
    private final l1<SvgView> mDelegate = new g2(this);
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45290a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f45290a = iArr;
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45290a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45290a[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static SvgView getSvgViewByTag(int i11) {
        return mTagToSvgView.get(i11);
    }

    static void runWhenViewIsAvailable(int i11, Runnable runnable) {
        mTagToRunnable.put(i11, runnable);
    }

    static void setSvgView(int i11, SvgView svgView) {
        mTagToSvgView.put(i11, svgView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i11);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i11);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.i
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.view.e createViewInstance(com.facebook.react.uimanager.v0 v0Var) {
        return new SvgView(v0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(com.facebook.react.views.view.e eVar) {
        super.onDropViewInstance(eVar);
        mTagToSvgView.remove(eVar.getId());
    }

    @Override // vo.h2
    public void setAccessible(SvgView svgView, boolean z11) {
        super.setAccessible((com.facebook.react.views.view.e) svgView, z11);
    }

    @Override // vo.h2
    @no.a(name = "align")
    public void setAlign(SvgView svgView, String str) {
        svgView.setAlign(str);
    }

    @Override // vo.h2
    public void setBackfaceVisibility(SvgView svgView, String str) {
        super.setBackfaceVisibility((com.facebook.react.views.view.e) svgView, str);
    }

    @Override // vo.h2
    @no.a(name = "bbHeight")
    public void setBbHeight(SvgView svgView, Dynamic dynamic) {
        svgView.setBbHeight(dynamic);
    }

    @Override // vo.h2
    @no.a(name = "bbWidth")
    public void setBbWidth(SvgView svgView, Dynamic dynamic) {
        svgView.setBbWidth(dynamic);
    }

    @Override // vo.h2
    public void setBorderBlockColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 9, num);
    }

    @Override // vo.h2
    public void setBorderBlockEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 10, num);
    }

    @Override // vo.h2
    public void setBorderBlockStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 11, num);
    }

    @Override // vo.h2
    public void setBorderBottomColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 4, num);
    }

    @Override // vo.h2
    public void setBorderBottomEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 8, dynamic);
    }

    @Override // vo.h2
    public void setBorderBottomLeftRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 4, dynamic);
    }

    @Override // vo.h2
    public void setBorderBottomRightRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 3, dynamic);
    }

    @Override // vo.h2
    public void setBorderBottomStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 7, dynamic);
    }

    @Override // vo.h2
    public void setBorderColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 0, num);
    }

    @Override // vo.h2
    public void setBorderEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 6, num);
    }

    @Override // vo.h2
    public void setBorderEndEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 9, dynamic);
    }

    @Override // vo.h2
    public void setBorderEndStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 10, dynamic);
    }

    @Override // vo.h2
    public void setBorderLeftColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 1, num);
    }

    @Override // vo.h2
    public void setBorderRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 0, dynamic);
    }

    @Override // vo.h2
    public void setBorderRightColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 2, num);
    }

    @Override // vo.h2
    public void setBorderStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 5, num);
    }

    @Override // vo.h2
    public void setBorderStartEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 11, dynamic);
    }

    @Override // vo.h2
    public void setBorderStartStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 12, dynamic);
    }

    @Override // vo.h2
    public void setBorderStyle(SvgView svgView, String str) {
        super.setBorderStyle((com.facebook.react.views.view.e) svgView, str);
    }

    @Override // vo.h2
    public void setBorderTopColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 3, num);
    }

    @Override // vo.h2
    public void setBorderTopEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 6, dynamic);
    }

    @Override // vo.h2
    public void setBorderTopLeftRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 1, dynamic);
    }

    @Override // vo.h2
    public void setBorderTopRightRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 2, dynamic);
    }

    @Override // vo.h2
    public void setBorderTopStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 5, dynamic);
    }

    @Override // vo.h2
    @no.a(customType = "Color", name = "color")
    public void setColor(SvgView svgView, Integer num) {
        svgView.setCurrentColor(num);
    }

    @Override // vo.h2
    public void setFocusable(SvgView svgView, boolean z11) {
        super.setFocusable((com.facebook.react.views.view.e) svgView, z11);
    }

    @Override // vo.h2
    public void setHasTVPreferredFocus(SvgView svgView, boolean z11) {
        super.setTVPreferredFocus(svgView, z11);
    }

    @Override // vo.h2
    public void setHitSlop(SvgView svgView, Dynamic dynamic) {
        int i11 = a.f45290a[dynamic.getType().ordinal()];
        if (i11 == 1) {
            ReadableMap readableMapAsMap = dynamic.asMap();
            svgView.setHitSlopRect(new Rect(readableMapAsMap.hasKey("left") ? (int) com.facebook.react.uimanager.w.g(readableMapAsMap.getDouble("left")) : 0, readableMapAsMap.hasKey("top") ? (int) com.facebook.react.uimanager.w.g(readableMapAsMap.getDouble("top")) : 0, readableMapAsMap.hasKey("right") ? (int) com.facebook.react.uimanager.w.g(readableMapAsMap.getDouble("right")) : 0, readableMapAsMap.hasKey("bottom") ? (int) com.facebook.react.uimanager.w.g(readableMapAsMap.getDouble("bottom")) : 0));
        } else {
            if (i11 == 2) {
                int iG = (int) com.facebook.react.uimanager.w.g(dynamic.asDouble());
                svgView.setHitSlopRect(new Rect(iG, iG, iG, iG));
                return;
            }
            if (i11 != 3) {
                qk.a.I("ReactNative", "Invalid type for 'hitSlop' value " + dynamic.getType());
            }
            svgView.setHitSlopRect(null);
        }
    }

    @Override // vo.h2
    @no.a(name = "meetOrSlice")
    public void setMeetOrSlice(SvgView svgView, int i11) {
        svgView.setMeetOrSlice(i11);
    }

    @Override // vo.h2
    @no.a(name = "minX")
    public void setMinX(SvgView svgView, float f11) {
        svgView.setMinX(f11);
    }

    @Override // vo.h2
    @no.a(name = "minY")
    public void setMinY(SvgView svgView, float f11) {
        svgView.setMinY(f11);
    }

    @Override // vo.h2
    public void setNativeBackgroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeBackground(svgView, readableMap);
    }

    @Override // vo.h2
    public void setNativeForegroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeForeground(svgView, readableMap);
    }

    @Override // vo.h2
    public void setNeedsOffscreenAlphaCompositing(SvgView svgView, boolean z11) {
        super.setNeedsOffscreenAlphaCompositing((com.facebook.react.views.view.e) svgView, z11);
    }

    @Override // vo.h2
    public void setNextFocusDown(SvgView svgView, int i11) {
        super.nextFocusDown(svgView, i11);
    }

    @Override // vo.h2
    public void setNextFocusForward(SvgView svgView, int i11) {
        super.nextFocusForward(svgView, i11);
    }

    @Override // vo.h2
    public void setNextFocusLeft(SvgView svgView, int i11) {
        super.nextFocusLeft(svgView, i11);
    }

    @Override // vo.h2
    public void setNextFocusRight(SvgView svgView, int i11) {
        super.nextFocusRight(svgView, i11);
    }

    @Override // vo.h2
    public void setNextFocusUp(SvgView svgView, int i11) {
        super.nextFocusUp(svgView, i11);
    }

    @Override // vo.h2
    @no.a(name = "pointerEvents")
    public void setPointerEvents(SvgView svgView, String str) {
        try {
            Class<? super Object> superclass = svgView.getClass().getSuperclass();
            if (superclass != null) {
                Method declaredMethod = superclass.getDeclaredMethod("setPointerEvents", com.facebook.react.uimanager.x.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(svgView, com.facebook.react.uimanager.x.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
            e11.printStackTrace();
        }
    }

    @Override // vo.h2
    public void setRemoveClippedSubviews(SvgView svgView, boolean z11) {
        super.setRemoveClippedSubviews(svgView, z11);
    }

    @Override // vo.h2
    @no.a(name = "vbHeight")
    public void setVbHeight(SvgView svgView, float f11) {
        svgView.setVbHeight(f11);
    }

    @Override // vo.h2
    @no.a(name = "vbWidth")
    public void setVbWidth(SvgView svgView, float f11) {
        svgView.setVbWidth(f11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(com.facebook.react.views.view.e eVar, Object obj) {
        super.updateExtraData(eVar, obj);
        eVar.invalidate();
    }
}
