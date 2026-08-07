package com.worklets;

import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
@xn.a(name = WorkletsModule.NAME)
public class WorkletsModule extends WorkletsSpec {
    public static final String NAME = "Worklets";
    private final WeakReference<ReactApplicationContext> weakReactContext;

    static {
        System.loadLibrary("rnworklets");
    }

    WorkletsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.weakReactContext = new WeakReference<>(reactApplicationContext);
    }

    public static native boolean nativeInstall(long j11, CallInvokerHolder callInvokerHolder);

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override // com.worklets.WorkletsSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        try {
            ReactApplicationContext reactApplicationContext = this.weakReactContext.get();
            if (reactApplicationContext != null) {
                return nativeInstall(reactApplicationContext.getJavaScriptContextHolder().get(), reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder());
            }
            Log.e(NAME, "React Application Context was null!");
            return false;
        } catch (Exception e11) {
            Log.e(NAME, "Failed to initialize react-native-worklets-core!", e11);
            return false;
        }
    }
}
