package com.teslamotors.plugins.securewebview;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.i0;
import androidx.p003lifecycle.j0;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.k;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: loaded from: classes8.dex */
public class SecureWebviewModule extends ReactContextBaseJavaModule {
    static final String ALLOW_PDFS = "allowPDFs";
    static final String BAR_COLOR = "barTintColor";
    static final String CONTROL_COLOR = "controlTintColor";
    private static final String FALLBACK_HEADER_TEXT = "Tesla";
    static final String HEADER = "header";
    static final String IS_FROM_BOTTOM = "isFromBottom";
    private static final String ON_DISMISS_EVENT = "SecureWebviewOnDismiss";
    private static final String ON_LOAD_EVENT = "SecureWebviewOnShow";
    private static final String REACT_CLASS = "TMSecureWebview";
    private static final String TAG = "SecureWebviewModule";
    static final String URL = "url";
    static final int WEBVIEW_DISMISS_CODE = 201;
    private i0<Boolean> dismissLiveData;

    class a implements j0<Boolean> {
        a() {
        }

        @Override // androidx.p003lifecycle.j0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                SecureWebviewModule.this.emitNativeEvent(SecureWebviewModule.ON_DISMISS_EVENT);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SecureWebviewModule.this.observeDismissLiveData();
        }
    }

    private class c implements ActivityEventListener {
        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
            if (i11 == 201) {
                SecureWebviewModule.this.emitNativeEvent(SecureWebviewModule.ON_DISMISS_EVENT);
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }

        private c() {
        }
    }

    public SecureWebviewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.dismissLiveData = new i0<>();
        reactApplicationContext.addActivityEventListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitNativeEvent(String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void observeDismissLiveData() {
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        if (currentActivity instanceof LifecycleOwner) {
            this.dismissLiveData.observe((LifecycleOwner) currentActivity, new a());
        }
    }

    @ReactMethod
    public void dismiss() {
        try {
            if (getCurrentActivity() != null) {
                this.dismissLiveData.setValue(Boolean.TRUE);
            }
        } catch (Exception e11) {
            Log.e(TAG, "Fail to dismiss Webview.", e11);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().runOnUiQueueThread(new b());
    }

    @ReactMethod
    public void show(ReadableMap readableMap) {
        if (readableMap.hasKey("url")) {
            try {
                Activity currentActivity = getCurrentActivity();
                if (currentActivity != null) {
                    Intent intent = new Intent(currentActivity, (Class<?>) SecureWebviewActivity.class);
                    String string = readableMap.hasKey(HEADER) ? readableMap.getString(HEADER) : FALLBACK_HEADER_TEXT;
                    int color = readableMap.hasKey(BAR_COLOR) ? Color.parseColor(readableMap.getString(BAR_COLOR)) : -16777216;
                    int color2 = readableMap.hasKey(CONTROL_COLOR) ? Color.parseColor(readableMap.getString(CONTROL_COLOR)) : -7829368;
                    intent.putExtra(HEADER, string);
                    intent.putExtra("url", readableMap.getString("url"));
                    intent.putExtra(BAR_COLOR, color);
                    intent.putExtra(CONTROL_COLOR, color2);
                    intent.putExtra(ALLOW_PDFS, readableMap.getBoolean(ALLOW_PDFS));
                    boolean z11 = readableMap.hasKey(IS_FROM_BOTTOM) && readableMap.getBoolean(IS_FROM_BOTTOM);
                    currentActivity.startActivityForResult(intent, 201, ActivityOptions.makeCustomAnimation(currentActivity, z11 ? k.f22645a : com.teslamotors.plugins.securewebview.c.f57050a, z11 ? k.f22646b : com.teslamotors.plugins.securewebview.c.f57051b).toBundle());
                    emitNativeEvent(ON_LOAD_EVENT);
                }
            } catch (Exception e11) {
                Log.e(TAG, "Fail to load URL", e11);
            }
        }
    }
}
