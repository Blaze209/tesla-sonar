package com.tesla.TeslaV4.reactnative.module;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/HermesReactNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Dynamic;", "vin", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "getVehicleOnlineState", "(Lcom/facebook/react/bridge/Dynamic;Lcom/facebook/react/bridge/Promise;)V", "connectIfNeeded", "()V", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HermesReactNativeModule extends ReactContextBaseJavaModule {
    private static final String TAG = "HermesModule";
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a(TAG);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HermesReactNativeModule(ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    @ReactMethod
    public final void connectIfNeeded() {
        if (com.tesla.features.a.a().getHasSignedOapiTransportAndConnectHermesOnDemand()) {
            fb0.m mVarA = fb0.m.INSTANCE.a();
            if (mVarA != null) {
                mVarA.c0();
            } else {
                logger.j("connectIfNeeded called but HermesTransport not yet initialized");
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void getVehicleOnlineState(Dynamic vin, Promise promise) {
        p013kotlin.jvm.internal.s.k(vin, "vin");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        try {
            String lowerCase = kb0.g.f85866a.j(vin.asString()).name().toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            promise.resolve(lowerCase);
        } catch (Exception unused) {
            String lowerCase2 = "UNKNOWN".toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
            promise.resolve(lowerCase2);
        }
    }
}
