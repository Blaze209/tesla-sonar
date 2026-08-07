package com.zoontek.rnlocalize;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import mj0.b;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xn.a;

/* JADX INFO: loaded from: classes8.dex */
@a(name = "RNLocalize")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/zoontek/rnlocalize/RNLocalizeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "getCalendar", "getCountry", "Lcom/facebook/react/bridge/WritableArray;", "getCurrencies", "()Lcom/facebook/react/bridge/WritableArray;", "getLocales", "Lcom/facebook/react/bridge/WritableMap;", "getNumberFormatSettings", "()Lcom/facebook/react/bridge/WritableMap;", "getTemperatureUnit", "getTimeZone", "", "uses24HourClock", "()Z", "usesMetricSystem", "usesAutoDateAndTime", "usesAutoTimeZone", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "openAppLanguageSettings", "(Lcom/facebook/react/bridge/Promise;)V", "react-native-localize_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNLocalizeModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNLocalizeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getCalendar() {
        return b.f92268a.b();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getCountry() {
        b bVar = b.f92268a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        return bVar.c(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final WritableArray getCurrencies() {
        b bVar = b.f92268a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        return bVar.e(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final WritableArray getLocales() {
        b bVar = b.f92268a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        return bVar.h(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNLocalize";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final WritableMap getNumberFormatSettings() {
        b bVar = b.f92268a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        return bVar.j(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getTemperatureUnit() {
        b bVar = b.f92268a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        return bVar.n(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getTimeZone() {
        return b.f92268a.o();
    }

    @ReactMethod
    public final void openAppLanguageSettings(Promise promise) {
        s.k(promise, "promise");
        b bVar = b.f92268a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        bVar.p(reactApplicationContext, promise);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean uses24HourClock() {
        b bVar = b.f92268a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        return bVar.q(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean usesAutoDateAndTime() {
        b bVar = b.f92268a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        return bVar.r(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean usesAutoTimeZone() {
        b bVar = b.f92268a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        return bVar.s(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean usesMetricSystem() {
        b bVar = b.f92268a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        return bVar.t(reactApplicationContext);
    }
}
