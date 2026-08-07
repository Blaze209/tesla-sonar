package gj0;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class e {
    public static Bundle a(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null || (obj.getClass().isArray() && !(obj instanceof Parcelable[]))) {
                arrayList.add(str);
            }
            if (obj instanceof Bundle) {
                bundle.putBundle(str, a((Bundle) obj));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bundle.remove((String) it.next());
        }
        return bundle;
    }

    public boolean b(String str, Bundle bundle, ReactContext reactContext) {
        if (reactContext == null) {
            return false;
        }
        c(str, Arguments.fromBundle(a(bundle)), reactContext);
        return true;
    }

    public boolean c(String str, WritableMap writableMap, ReactContext reactContext) {
        if (reactContext == null) {
            return false;
        }
        if (reactContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            return true;
        }
        reactContext.addLifecycleEventListener(new a(reactContext, str, writableMap));
        return true;
    }

    class a implements LifecycleEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReactContext f69004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f69005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WritableMap f69006c;

        a(ReactContext reactContext, String str, WritableMap writableMap) {
            this.f69004a = reactContext;
            this.f69005b = str;
            this.f69006c = writableMap;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f69004a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(this.f69005b, this.f69006c);
            this.f69004a.removeLifecycleEventListener(this);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }
    }
}
