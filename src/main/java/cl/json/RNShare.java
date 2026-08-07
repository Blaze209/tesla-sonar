package cl.json;

import bc.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class RNShare extends ReactContextBaseJavaModule {
    private final a delegate;

    public RNShare(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.delegate = new a(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.delegate.a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNShare";
    }

    @ReactMethod
    public void isBase64File(String str, Promise promise) {
        this.delegate.b(str, promise);
    }

    @ReactMethod
    public void isPackageInstalled(String str, Promise promise) {
        this.delegate.c(str, promise);
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        this.delegate.e(readableMap, promise);
    }

    @ReactMethod
    public void shareSingle(ReadableMap readableMap, Promise promise) {
        this.delegate.f(readableMap, promise);
    }
}
