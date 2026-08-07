package com.reactlibrary;

import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* JADX INFO: loaded from: classes6.dex */
public class KcpPayBridgeModule extends ReactContextBaseJavaModule {
    private ReactApplicationContext reactContext;

    KcpPayBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KcpPayBridge";
    }

    @ReactMethod
    public void sendIntent(String str, Promise promise) {
        try {
            Intent uri = Intent.parseUri(str, 1);
            uri.addFlags(268435456);
            String str2 = uri.getPackage();
            if (this.reactContext.getPackageManager().resolveActivity(uri, 0) != null) {
                this.reactContext.startActivity(uri);
                promise.resolve(Boolean.TRUE);
            } else {
                if (str2 == null) {
                    promise.resolve(Boolean.FALSE);
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str2));
                intent.addFlags(268435456);
                this.reactContext.startActivity(intent);
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception unused) {
            promise.resolve(Boolean.FALSE);
        }
    }
}
