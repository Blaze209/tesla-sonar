package com.reactlibrary;

import android.os.Bundle;
import com.alipay.sdk.app.PayTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class AlipayBridgeModule extends ReactContextBaseJavaModule {
    private final ArrayList<String> errorList;
    private final ReactApplicationContext reactContext;

    class a implements kg.d.b {
        a() {
        }

        @Override // kg.d.b
        public void a(int i11, String str, Bundle bundle) {
            String string = bundle.getString("alipay_user_agreement_page_sign_response");
            if (string != null) {
                try {
                    "10000".equals(new JSONObject(string).getString("code"));
                } catch (JSONException unused) {
                }
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f48382a;

        b(String str) {
            this.f48382a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> mapPayV2 = new PayTask(AlipayBridgeModule.this.getCurrentActivity()).payV2(this.f48382a, true);
            String str = mapPayV2.get("resultStatus");
            mapPayV2.get("memo");
            AlipayBridgeModule.this.errorList.contains(str);
        }
    }

    public AlipayBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.errorList = new ArrayList<>(Arrays.asList("4000", "5000", "6001", "6002"));
        this.reactContext = reactApplicationContext;
    }

    private WritableMap getWritableMap(Map<String, String> map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            writableMapCreateMap.putString(entry.getKey(), entry.getValue().toString());
        }
        return writableMapCreateMap;
    }

    @ReactMethod
    public void alipay(String str, String str2, Promise promise) {
        if (!str2.contains("alipay.user.agreement.page.sign")) {
            new Thread(new b(str2)).start();
            return;
        }
        kg.d dVar = new kg.d(getCurrentActivity());
        HashMap map = new HashMap();
        map.put("sign_params", str2);
        dVar.f(str, kg.d.a.Deduct, map, new a(), true);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AlipayBridge";
    }
}
