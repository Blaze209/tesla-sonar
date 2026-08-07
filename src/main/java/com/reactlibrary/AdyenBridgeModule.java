package com.reactlibrary;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.fragment.app.u;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.action.Threeds2ChallengeAction;
import com.adyen.checkout.components.core.action.Threeds2FingerprintAction;
import com.adyen.threeds2.ThreeDS2Service;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import me.Environment;
import org.json.JSONException;
import org.json.JSONObject;
import te.EncryptedCard;

/* JADX INFO: loaded from: classes6.dex */
public class AdyenBridgeModule extends ReactContextBaseJavaModule implements Runnable {
    private String currentAction;
    private u currentActivity;
    private final ReactApplicationContext reactContext;
    private dd.a threedsComponent;

    public AdyenBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap convertJsonToMap(JSONObject jSONObject) throws JSONException {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                writableNativeMap.putMap(next, convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof Boolean) {
                writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeMap.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeMap.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeMap.putString(next, (String) obj);
            } else {
                writableNativeMap.putString(next, obj.toString());
            }
        }
        return writableNativeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postEvent(String str, WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(AnalyticsAttribute.Error, str);
        writableNativeMap.putMap("data", writableMap);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(this.currentAction, writableNativeMap);
    }

    @ReactMethod
    public void encryptCardAdyen(String str, String str2, String str3, String str4, String str5, Callback callback) {
        EncryptedCard encryptedCardA = te.a.f113237a.a(new te.c.a().e(str).d(str2, str3).c(str4).a(), str5);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(InquiryField.FloatField.TYPE2, encryptedCardA.getEncryptedCardNumber());
        writableMapCreateMap.putString("expiryMonth", encryptedCardA.getEncryptedExpiryMonth());
        writableMapCreateMap.putString("expiryYear", encryptedCardA.getEncryptedExpiryYear());
        writableMapCreateMap.putString("securityCode", encryptedCardA.getEncryptedSecurityCode());
        callback.invoke(writableMapCreateMap);
    }

    @ReactMethod
    public void getAdyen3DSSdkVersion(Callback callback) {
        callback.invoke(ThreeDS2Service.INSTANCE.getSDKVersion());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AdyenBridge";
    }

    @ReactMethod
    public void handle3DSChallenge(String str, String str2, Callback callback) {
        try {
            if (this.currentActivity == null) {
                this.currentAction = "nullActivity";
                postEvent("Cannot handle 3ds challenge. CurrentActivity is null", null);
                return;
            }
            Threeds2ChallengeAction threeds2ChallengeAction = new Threeds2ChallengeAction();
            threeds2ChallengeAction.setToken(str);
            threeds2ChallengeAction.setPaymentData(str2);
            threeds2ChallengeAction.setType(Threeds2ChallengeAction.ACTION_TYPE);
            this.currentAction = Threeds2ChallengeAction.ACTION_TYPE;
            this.threedsComponent.h(threeds2ChallengeAction, this.currentActivity);
        } catch (Exception e11) {
            postEvent(e11.getMessage(), null);
        }
    }

    @ReactMethod
    public void handle3DSFingerprint(String str, String str2, Callback callback) {
        try {
            if (this.currentActivity == null) {
                this.currentAction = "nullActivity";
                postEvent("Cannot handle 3ds Fingerprint. CurrentActivity is null", null);
                return;
            }
            Threeds2FingerprintAction threeds2FingerprintAction = new Threeds2FingerprintAction();
            threeds2FingerprintAction.setToken(str);
            threeds2FingerprintAction.setPaymentData(str2);
            threeds2FingerprintAction.setType(Threeds2FingerprintAction.ACTION_TYPE);
            this.currentAction = Threeds2FingerprintAction.ACTION_TYPE;
            this.threedsComponent.h(threeds2FingerprintAction, this.currentActivity);
        } catch (Exception e11) {
            postEvent(e11.getMessage(), null);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    @ReactMethod
    public void start3dsComponent(String str, String str2, String str3, Callback callback) {
        try {
            u uVar = (u) getCurrentActivity();
            this.currentActivity = uVar;
            if (uVar != null) {
                UiThreadUtil.runOnUiThread(new a(str, str2, str3));
            } else {
                this.currentAction = "nullActivity";
                postEvent("Failed to start 3DS component. CurrentActivity is null", null);
            }
        } catch (Exception e11) {
            postEvent(e11.getMessage(), null);
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f48376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f48377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f48378c;

        a(String str, String str2, String str3) {
            this.f48376a = str;
            this.f48377b = str2;
            this.f48378c = str3;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"RestrictedApi"})
        public void run() {
            try {
                Environment environmentA = this.f48376a.equals("stage") ? Environment.f91841d : g.a(this.f48377b);
                new hd.b.a(AdyenBridgeModule.this.reactContext, environmentA, this.f48378c).a();
                C0763a c0763a = new C0763a();
                AdyenBridgeModule.this.threedsComponent = (dd.a) dd.a.f60449v.c(AdyenBridgeModule.this.currentActivity, new dd.b.a(AdyenBridgeModule.this.reactContext, environmentA, this.f48378c).a(), c0763a, "3ds2");
            } catch (Exception e11) {
                AdyenBridgeModule.this.postEvent(e11.getMessage(), null);
            }
        }

        /* JADX INFO: renamed from: com.reactlibrary.AdyenBridgeModule$a$a, reason: collision with other inner class name */
        class C0763a implements be.a {
            C0763a() {
            }

            @Override // be.a
            public void a(@NonNull ActionComponentData actionComponentData) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                JSONObject details = actionComponentData.getDetails();
                writableNativeMap.putString("paymentData", actionComponentData.getPaymentData());
                try {
                    writableNativeMap.putMap("details", AdyenBridgeModule.this.convertJsonToMap(details));
                    AdyenBridgeModule.this.postEvent(null, writableNativeMap);
                } catch (JSONException unused) {
                    AdyenBridgeModule.this.postEvent("unexpected data from Adyen3DS component", null);
                }
            }

            @Override // be.a
            public void b(@NonNull be.g gVar) {
                AdyenBridgeModule.this.postEvent(gVar.a(), null);
            }

            @Override // be.a
            public void c(@NonNull String str, @NonNull me.d dVar) {
            }
        }
    }
}
