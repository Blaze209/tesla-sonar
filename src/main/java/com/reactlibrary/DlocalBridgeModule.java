package com.reactlibrary;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import jn0.h0;

/* JADX INFO: loaded from: classes6.dex */
public class DlocalBridgeModule extends ReactContextBaseJavaModule {
    DlocalBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static /* synthetic */ h0 a(Promise promise, fk.b bVar) {
        promise.resolve(bVar.getToken());
        return null;
    }

    public static /* synthetic */ h0 b(Promise promise, fk.c cVar) {
        promise.reject(cVar.getDebugMessage(), cVar.toString());
        return null;
    }

    @ReactMethod
    public void createToken(String str, String str2, String str3, int i11, int i12, String str4, String str5, boolean z11, ReadableMap readableMap, final Promise promise) {
        try {
            new ek.a(str4, str5, z11).a(new fk.a(str, str2, str3, i11, i12), new wn0.l() { // from class: com.reactlibrary.e
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return DlocalBridgeModule.a(promise, (fk.b) obj);
                }
            }, new wn0.l() { // from class: com.reactlibrary.f
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return DlocalBridgeModule.b(promise, (fk.c) obj);
                }
            });
        } catch (Exception e11) {
            promise.reject(e11.getMessage(), e11.toString());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DlocalBridge";
    }
}
