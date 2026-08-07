package com.tesla.module;

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
import com.tesla.module.ScreenUtilsNativeModule;
import jn0.h0;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/tesla/module/ScreenUtilsNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "getScreenWidth", "()I", "getScreenHeight", "getTopInset", "getBottomInset", "color", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "setNavigationBarColor", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Landroid/util/DisplayMetrics;", "metrics$delegate", "Lkotlin/Lazy;", "getMetrics", "()Landroid/util/DisplayMetrics;", "metrics", "tesla_design-system-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenUtilsNativeModule extends ReactContextBaseJavaModule {

    /* JADX INFO: renamed from: metrics$delegate, reason: from kotlin metadata */
    private final Lazy metrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenUtilsNativeModule(final ReactApplicationContext context) {
        super(context);
        s.k(context, "context");
        this.metrics = m.b(new a() { // from class: jd0.b
            @Override // wn0.a
            public final Object invoke() {
                return ScreenUtilsNativeModule.metrics_delegate$lambda$0(context);
            }
        });
    }

    private final DisplayMetrics getMetrics() {
        Object value = this.metrics.getValue();
        s.j(value, "getValue(...)");
        return (DisplayMetrics) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayMetrics metrics_delegate$lambda$0(ReactApplicationContext reactApplicationContext) {
        Object systemService = reactApplicationContext.getSystemService("window");
        s.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = reactApplicationContext.getResources().getDisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setNavigationBarColor$lambda$1(ScreenUtilsNativeModule screenUtilsNativeModule, String str, Promise promise) {
        Window window;
        Activity currentActivity = screenUtilsNativeModule.getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null) {
            window.setNavigationBarColor(Color.parseColor(str));
        }
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final int getBottomInset() {
        Window window;
        View decorView;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        WindowInsets rootWindowInsets = (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootWindowInsets();
        if (rootWindowInsets != null) {
            return yn0.a.d(rootWindowInsets.getSystemWindowInsetBottom() / getMetrics().density);
        }
        int identifier = reactApplicationContext.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier <= 0 || ViewConfiguration.get(reactApplicationContext).hasPermanentMenuKey()) {
            return 0;
        }
        return yn0.a.d(reactApplicationContext.getResources().getDimensionPixelSize(identifier) / getMetrics().density);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ScreenUtils";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final int getScreenHeight() {
        return yn0.a.d(getMetrics().heightPixels / getMetrics().density);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final int getScreenWidth() {
        return yn0.a.d(getMetrics().widthPixels / getMetrics().density);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final int getTopInset() {
        Window window;
        View decorView;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        WindowInsets rootWindowInsets = (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootWindowInsets();
        if (rootWindowInsets != null) {
            return yn0.a.d(rootWindowInsets.getSystemWindowInsetTop() / getMetrics().density);
        }
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return yn0.a.d(reactApplicationContext.getResources().getDimensionPixelSize(identifier) / getMetrics().density);
        }
        return 0;
    }

    @ReactMethod
    public final void setNavigationBarColor(final String color, final Promise promise) {
        s.k(color, "color");
        s.k(promise, "promise");
        try {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: jd0.a
                @Override // java.lang.Runnable
                public final void run() {
                    ScreenUtilsNativeModule.setNavigationBarColor$lambda$1(this.f83608a, color, promise);
                }
            });
        } catch (IllegalViewOperationException e11) {
            promise.reject(e11);
            h0 h0Var = h0.f84049a;
        }
    }
}
