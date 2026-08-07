package com.github.reactnativecommunity.location;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import iq.b;
import iq.c;
import iq.d;
import iq.f;
import java.lang.reflect.Constructor;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = RNLocationModule.NAME)
public class RNLocationModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNLocation";
    private ActivityEventListener activityEventListener;
    private b locationProvider;
    private String locationProviderName;

    class a extends BaseActivityEventListener {
        a() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
            if (RNLocationModule.this.locationProvider instanceof c) {
                ((c) RNLocationModule.this.locationProvider).j(i11, i12, intent);
            }
        }
    }

    public RNLocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        a aVar = new a();
        this.activityEventListener = aVar;
        reactApplicationContext.addActivityEventListener(aVar);
    }

    private b createBaiduLocationProvider() {
        try {
            Constructor<?> declaredConstructor = Class.forName("com.github.reactnativecommunity.location.RNBaiduLocationProvider").getDeclaredConstructor(ReactApplicationContext.class);
            declaredConstructor.setAccessible(true);
            return (b) declaredConstructor.newInstance(getReactApplicationContext());
        } catch (Exception unused) {
            f.b(getReactApplicationContext(), "Cannot initialize BaiduLocationProvider", "500");
            return createStandardLocationProvider();
        }
    }

    private b createDefaultLocationProvider() {
        return f.c() ? createPlayServicesLocationProvider() : createStandardLocationProvider();
    }

    private c createPlayServicesLocationProvider() {
        return new c(getCurrentActivity(), getReactApplicationContext());
    }

    private d createStandardLocationProvider() {
        return new d(getReactApplicationContext());
    }

    @ReactMethod
    public void configure(ReadableMap readableMap, Promise promise) {
        if (readableMap.hasKey("androidProvider")) {
            String string = readableMap.getString("androidProvider");
            String str = this.locationProviderName;
            if (str == null || !str.equals(string)) {
                b bVar = this.locationProvider;
                if (bVar != null) {
                    bVar.b();
                }
                string.getClass();
                switch (string) {
                    case "auto":
                        this.locationProvider = createDefaultLocationProvider();
                        break;
                    case "baidu":
                        this.locationProvider = createBaiduLocationProvider();
                        break;
                    case "playServices":
                        this.locationProvider = createPlayServicesLocationProvider();
                        break;
                    case "standard":
                        this.locationProvider = createStandardLocationProvider();
                        break;
                    default:
                        f.b(getReactApplicationContext(), "androidProvider was passed an unknown value: " + string, "401");
                        break;
                }
                this.locationProviderName = string;
            }
        } else if (this.locationProvider == null) {
            this.locationProvider = createDefaultLocationProvider();
            this.locationProviderName = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        this.locationProvider.c(getCurrentActivity(), readableMap, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void startUpdatingLocation() {
        if (this.locationProvider == null) {
            this.locationProvider = createDefaultLocationProvider();
        }
        this.locationProvider.a();
    }

    @ReactMethod
    public void stopUpdatingLocation() {
        if (this.locationProvider == null) {
            this.locationProvider = createDefaultLocationProvider();
        }
        this.locationProvider.b();
    }
}
