package com.tesla.TeslaV4.reactnative.module;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.teslamotors.TeslaApp.MainActivity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/JsLifeCycleNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "isCnUser", "analyticsId", "Ljn0/h0;", "onUserLogin", "(ZLjava/lang/String;)V", "onShakeFeedbackEnabled", "()V", "onLoginSuccess", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsLifeCycleNativeModule extends ReactContextBaseJavaModule {
    private static final String TAG = "JsLifeCycleModule";
    private static final com.tesla.logging.g log = com.tesla.logging.g.INSTANCE.a(TAG);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsLifeCycleNativeModule(ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void onLoginSuccess() {
        log.j("onLoginSuccess");
    }

    @ReactMethod
    public final void onShakeFeedbackEnabled() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            log.j("onShakeFeedbackEnabled");
            ((MainActivity) currentActivity).v();
        }
    }

    @ReactMethod
    public final void onUserLogin(boolean isCnUser, String analyticsId) throws IllegalAccessException, InvocationTargetException {
        log.j("onUserLogin");
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        p013kotlin.jvm.internal.s.i(applicationContext, "null cannot be cast to non-null type android.app.Application");
        com.wix.reactnativenotifications.k.h((Application) applicationContext);
        if (ie0.r.a()) {
            try {
                Method method = Class.forName("com.baidu.android.react.maps.BaiduMapsPackage").getMethod("initialize", Context.class);
                p013kotlin.jvm.internal.s.j(method, "getMethod(...)");
                method.invoke(null, getReactApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                com.tesla.logging.g gVar = log;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("Cannot initialize BaiduMapsPackage");
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
            } catch (NoSuchMethodException unused2) {
                com.tesla.logging.g gVar2 = log;
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVar2.getTag();
                String strG2 = gVar2.g("Cannot find initialize method");
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = v0.f(jn0.x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
            }
        }
        if (analyticsId != null) {
            la0.a.f89740a.b(analyticsId);
        }
    }
}
