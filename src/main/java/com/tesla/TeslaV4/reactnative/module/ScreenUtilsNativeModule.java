package com.tesla.TeslaV4.reactnative.module;

import android.app.Activity;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tesla.logging.TeslaLog;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/ScreenUtilsNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "getScreenWidth", "()F", "getScreenHeight", "getTopInset", "getBottomInset", "color", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "setNavigationBarColor", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Landroid/util/DisplayMetrics;", "metrics$delegate", "Lkotlin/Lazy;", "getMetrics", "()Landroid/util/DisplayMetrics;", "metrics", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenUtilsNativeModule extends ReactContextBaseJavaModule {

    /* JADX INFO: renamed from: metrics$delegate, reason: from kotlin metadata */
    private final Lazy metrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenUtilsNativeModule(final ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.metrics = jn0.m.b(new wn0.a() { // from class: com.tesla.TeslaV4.reactnative.module.j0
            @Override // wn0.a
            public final Object invoke() {
                return ScreenUtilsNativeModule.metrics_delegate$lambda$0(context);
            }
        });
        _init_$log("getScreenWidth()=" + getScreenWidth());
        _init_$log("getScreenHeight()=" + getScreenHeight());
        _init_$log("getTopInset()=" + getTopInset());
        _init_$log("getBottomInset()=" + getBottomInset());
    }

    private static final void _init_$log(String str) {
        TeslaLog.INSTANCE.i("ScreenUtilsModule", str);
    }

    private final DisplayMetrics getMetrics() {
        Object value = this.metrics.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (DisplayMetrics) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayMetrics metrics_delegate$lambda$0(ReactApplicationContext reactApplicationContext) {
        Object systemService = reactApplicationContext.getSystemService("window");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = reactApplicationContext.getResources().getDisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setNavigationBarColor$lambda$1(ScreenUtilsNativeModule screenUtilsNativeModule, String str, Promise promise) {
        Window window;
        Activity currentActivity = screenUtilsNativeModule.getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null) {
            window.setNavigationBarColor(Color.parseColor(str));
        }
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final float getBottomInset() {
        float systemWindowInsetBottom;
        float f11;
        Window window;
        View decorView;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
        Activity currentActivity = getCurrentActivity();
        WindowInsets rootWindowInsets = (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootWindowInsets();
        if (rootWindowInsets == null) {
            int identifier = reactApplicationContext.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier <= 0 || ViewConfiguration.get(reactApplicationContext).hasPermanentMenuKey()) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            systemWindowInsetBottom = reactApplicationContext.getResources().getDimensionPixelSize(identifier);
            f11 = getMetrics().density;
        } else {
            systemWindowInsetBottom = rootWindowInsets.getSystemWindowInsetBottom();
            f11 = getMetrics().density;
        }
        return systemWindowInsetBottom / f11;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ScreenUtilsModule";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final float getScreenHeight() {
        return getMetrics().heightPixels / getMetrics().density;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final float getScreenWidth() {
        return getMetrics().widthPixels / getMetrics().density;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final float getTopInset() {
        float systemWindowInsetTop;
        float f11;
        Window window;
        View decorView;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
        Activity currentActivity = getCurrentActivity();
        WindowInsets rootWindowInsets = (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootWindowInsets();
        if (rootWindowInsets == null) {
            int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier <= 0) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            systemWindowInsetTop = reactApplicationContext.getResources().getDimensionPixelSize(identifier);
            f11 = getMetrics().density;
        } else {
            systemWindowInsetTop = rootWindowInsets.getSystemWindowInsetTop();
            f11 = getMetrics().density;
        }
        return systemWindowInsetTop / f11;
    }

    @ReactMethod
    public final void setNavigationBarColor(final String color, final Promise promise) {
        p013kotlin.jvm.internal.s.k(color, "color");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        try {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.tesla.TeslaV4.reactnative.module.i0
                @Override // java.lang.Runnable
                public final void run() {
                    ScreenUtilsNativeModule.setNavigationBarColor$lambda$1(this.f55697a, color, promise);
                }
            });
        } catch (IllegalViewOperationException e11) {
            promise.reject(e11);
            jn0.h0 h0Var = jn0.h0.f84049a;
        }
    }
}
