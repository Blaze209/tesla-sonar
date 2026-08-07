package com.tesla.TeslaV4.reactnative.module;

import android.os.LocaleList;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/LocationNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableMap;", "locationMap", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "reverseGeocodeAsync", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "getCountryCodeUsingPhoneLocation", "(Lcom/facebook/react/bridge/Promise;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocationNativeModule extends ReactContextBaseJavaModule {

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/tesla/TeslaV4/reactnative/module/LocationNativeModule$a", "Lzc0/b;", "Lcom/facebook/react/bridge/WritableArray;", "results", "Ljn0/h0;", "b", "(Lcom/facebook/react/bridge/WritableArray;)V", "Ljava/lang/Error;", "Lkotlin/Error;", AnalyticsAttribute.Error, "a", "(Ljava/lang/Error;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements zc0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f55643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WritableNativeArray f55644b;

        a(Promise promise, WritableNativeArray writableNativeArray) {
            this.f55643a = promise;
            this.f55644b = writableNativeArray;
        }

        @Override // zc0.b
        public void a(Error error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            LocationNativeModule.reverseGeocodeAsync$errorTelemetry(error);
            this.f55643a.resolve(this.f55644b);
        }

        @Override // zc0.b
        public void b(WritableArray results) {
            p013kotlin.jvm.internal.s.k(results, "results");
            this.f55643a.resolve(results);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationNativeModule(ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reverseGeocodeAsync$errorTelemetry(Throwable th2) {
        Pair pairA = jn0.x.a("type", "mobile-app-location-telemetry");
        Pair pairA2 = jn0.x.a("v", 1);
        String localizedMessage = th2.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        ud0.a.b(v0.o(pairA, pairA2, jn0.x.a(AnalyticsAttribute.Error, localizedMessage)), true, null, 4, null);
    }

    @ReactMethod
    public final void getCountryCodeUsingPhoneLocation(Promise promise) {
        p013kotlin.jvm.internal.s.k(promise, "promise");
        ie0.k kVar = ie0.k.f77594a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
        String strA = kVar.a(reactApplicationContext);
        String str = null;
        if (strA == null || p013kotlin.text.t.y0(strA)) {
            strA = null;
        }
        if (strA != null) {
            String upperCase = strA.toUpperCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
            promise.resolve(upperCase);
            return;
        }
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        p013kotlin.jvm.internal.s.j(reactApplicationContext2, "getReactApplicationContext(...)");
        String strB = kVar.b(reactApplicationContext2);
        if (strB != null && !p013kotlin.text.t.y0(strB)) {
            str = strB;
        }
        if (str != null) {
            String upperCase2 = str.toUpperCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(upperCase2, "toUpperCase(...)");
            promise.resolve(upperCase2);
            return;
        }
        LocaleList locales = getReactApplicationContext().getResources().getConfiguration().getLocales();
        if (locales.isEmpty()) {
            promise.resolve("");
            return;
        }
        String country = locales.get(0).getCountry();
        p013kotlin.jvm.internal.s.j(country, "getCountry(...)");
        String upperCase3 = country.toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase3, "toUpperCase(...)");
        promise.resolve(upperCase3);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "LocationModule";
    }

    @ReactMethod
    public final void reverseGeocodeAsync(ReadableMap locationMap, Promise promise) {
        p013kotlin.jvm.internal.s.k(locationMap, "locationMap");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        try {
            double d11 = locationMap.getDouble(OrcaKeys.LATITUDE);
            double d12 = locationMap.getDouble(OrcaKeys.LONGITUDE);
            zc0.a.Companion companion = zc0.a.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            p013kotlin.jvm.internal.s.j(reactApplicationContext, "getReactApplicationContext(...)");
            companion.a(reactApplicationContext).c(d11, d12, Locale.getDefault().toString(), new a(promise, writableNativeArray));
        } catch (Exception e11) {
            reverseGeocodeAsync$errorTelemetry(e11);
            promise.resolve(writableNativeArray);
        }
    }
}
