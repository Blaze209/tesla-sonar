package com.tesla.TeslaV4.firebase;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.tesla.TeslaV4.firebase.FirebaseAnalyticsModule;
import com.tesla.domain.model.DataRestrictedCountry;
import dk0.d;
import firebase.common.ReactNativeFirebaseModule;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0010J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/tesla/TeslaV4/firebase/FirebaseAnalyticsModule;", "Lfirebase/common/ReactNativeFirebaseModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "name", "Lcom/facebook/react/bridge/ReadableMap;", "params", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "logEvent", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "enabled", "setAnalyticsCollectionEnabled", "(Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V", "screenName", "logScreenView", "properties", "setUserProperties", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "getIsRestrictedCountry", "(Lcom/facebook/react/bridge/Promise;)V", "Ldk0/d;", "module", "Ldk0/d;", "isDataRestricted", "Z", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseAnalyticsModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Analytics";
    private final boolean isDataRestricted;
    private final d module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseAnalyticsModule(ReactApplicationContext reactContext) {
        super(reactContext, SERVICE_NAME);
        s.k(reactContext, "reactContext");
        this.isDataRestricted = DataRestrictedCountry.INSTANCE.c(getContext());
        this.module = new d(reactContext, SERVICE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logEvent$lambda$0(Promise promise, Task task) {
        s.k(task, "task");
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
            return;
        }
        ReactNativeFirebaseModule.Companion companion = ReactNativeFirebaseModule.INSTANCE;
        Exception exception = task.getException();
        if (exception == null) {
            exception = new Exception();
        }
        companion.a(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logScreenView$lambda$2(Promise promise, Task task) {
        s.k(task, "task");
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
            return;
        }
        ReactNativeFirebaseModule.Companion companion = ReactNativeFirebaseModule.INSTANCE;
        Exception exception = task.getException();
        if (exception == null) {
            exception = new Exception();
        }
        companion.a(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAnalyticsCollectionEnabled$lambda$1(Promise promise, Task task) {
        s.k(task, "task");
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
            return;
        }
        ReactNativeFirebaseModule.Companion companion = ReactNativeFirebaseModule.INSTANCE;
        Exception exception = task.getException();
        if (exception == null) {
            exception = new Exception();
        }
        companion.a(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUserProperties$lambda$3(Promise promise, Task task) {
        s.k(task, "task");
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
            return;
        }
        ReactNativeFirebaseModule.Companion companion = ReactNativeFirebaseModule.INSTANCE;
        Exception exception = task.getException();
        if (exception == null) {
            exception = new Exception();
        }
        companion.a(promise, exception);
    }

    @ReactMethod
    public final void getIsRestrictedCountry(Promise promise) {
        s.k(promise, "promise");
        promise.resolve(Boolean.valueOf(this.module.getIsRestrictedCountry()));
    }

    @Override // firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "FirebaseAnalytics";
    }

    @ReactMethod
    public final void logEvent(String name, ReadableMap params, final Promise promise) {
        s.k(promise, "promise");
        if (this.isDataRestricted) {
            promise.resolve(Boolean.TRUE);
        } else {
            this.module.f(name, Arguments.toBundle(params)).addOnCompleteListener(new OnCompleteListener() { // from class: ma0.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FirebaseAnalyticsModule.logEvent$lambda$0(promise, task);
                }
            });
        }
    }

    @ReactMethod
    public final void logScreenView(String screenName, ReadableMap params, final Promise promise) {
        s.k(promise, "promise");
        if (this.isDataRestricted) {
            promise.resolve(Boolean.TRUE);
        } else {
            this.module.f("screen_view", Arguments.toBundle(params)).addOnCompleteListener(new OnCompleteListener() { // from class: ma0.c
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FirebaseAnalyticsModule.logScreenView$lambda$2(promise, task);
                }
            });
        }
    }

    @ReactMethod
    public final void setAnalyticsCollectionEnabled(Boolean enabled, final Promise promise) {
        s.k(promise, "promise");
        if (this.isDataRestricted) {
            promise.resolve(Boolean.TRUE);
        } else {
            this.module.h(enabled).addOnCompleteListener(new OnCompleteListener() { // from class: ma0.d
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FirebaseAnalyticsModule.setAnalyticsCollectionEnabled$lambda$1(promise, task);
                }
            });
        }
    }

    @ReactMethod
    public final void setUserProperties(ReadableMap properties, final Promise promise) {
        s.k(properties, "properties");
        s.k(promise, "promise");
        if (this.isDataRestricted) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        Bundle bundle = Arguments.toBundle(properties);
        s.i(bundle, "null cannot be cast to non-null type android.os.Bundle");
        this.module.j(bundle).addOnCompleteListener(new OnCompleteListener() { // from class: ma0.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FirebaseAnalyticsModule.setUserProperties$lambda$3(promise, task);
            }
        });
    }
}
