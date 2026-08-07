package com.reactnativemodpow;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.math.BigInteger;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/reactnativemodpow/ModpowModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "modPow", "values", "Lcom/facebook/react/bridge/ReadableMap;", "react-native-modpow_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ModpowModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModpowModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Modpow";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String modPow(ReadableMap values) {
        s.k(values, "values");
        String string = new BigInteger(values.getString("target"), 16).modPow(new BigInteger(values.getString("value"), 16), new BigInteger(values.getString("modifier"), 16)).toString(16);
        s.j(string, "toString(...)");
        return string;
    }
}
