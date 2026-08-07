package com.reactlibrary;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class GooglePayBridgeModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int START_GOOGLE_PAY_REQUEST_CODE = 991;
    private List<Object> googlePayOptions;
    private Map<String, Object> googlePayPaymentData;
    private Callback onPaymentAbortCallback;
    private Callback onPaymentResponseCallback;
    private PaymentsClient paymentsClient;
    private final ReactApplicationContext reactContext;

    public GooglePayBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public static /* synthetic */ void a(Promise promise, Exception exc) {
        promise.resolve(Boolean.FALSE);
        Log.d("isReadyToPay failed in failure", String.valueOf(exc));
    }

    public static /* synthetic */ void b(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
            Log.d("isReadyToPay succeeded", "true");
        } else {
            promise.resolve(Boolean.FALSE);
            Log.d("isReadyToPay failed", String.valueOf(task.getException()));
        }
    }

    private void cleanupCallbacks() {
        this.onPaymentResponseCallback = null;
        this.onPaymentAbortCallback = null;
    }

    private Task<PaymentData> getLoadPaymentDataTask() {
        JSONObject jSONObjectJ = l.j(this.googlePayPaymentData, this.googlePayOptions);
        if (jSONObjectJ == null) {
            cleanupCallbacks();
            return null;
        }
        PaymentDataRequest paymentDataRequestFromJson = PaymentDataRequest.fromJson(jSONObjectJ.toString());
        PaymentsClient paymentsClient = this.paymentsClient;
        if (paymentsClient != null) {
            return paymentsClient.loadPaymentData(paymentDataRequestFromJson);
        }
        this.onPaymentAbortCallback.invoke(AnalyticsAttribute.Error, "GooglePayBridge: paymentsClient is null");
        cleanupCallbacks();
        return null;
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "GooglePayBridge";
    }

    @ReactMethod
    public void isGooglePaySetup(String str, final Promise promise) {
        JSONObject jSONObjectI = l.i(this.googlePayOptions);
        if (jSONObjectI == null) {
            promise.resolve(Boolean.FALSE);
            cleanupCallbacks();
        } else {
            IsReadyToPayRequest isReadyToPayRequestFromJson = IsReadyToPayRequest.fromJson(jSONObjectI.toString());
            PaymentsClient paymentsClientA = l.a(str.equals("stage") ? 3 : 1, this.reactContext);
            this.paymentsClient = paymentsClientA;
            paymentsClientA.isReadyToPay(isReadyToPayRequestFromJson).addOnCompleteListener(new OnCompleteListener() { // from class: com.reactlibrary.h
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    GooglePayBridgeModule.b(promise, task);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.reactlibrary.i
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    GooglePayBridgeModule.a(promise, exc);
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        if (i11 != START_GOOGLE_PAY_REQUEST_CODE) {
            cleanupCallbacks();
            return;
        }
        if (i12 == 0) {
            this.onPaymentAbortCallback.invoke("event", "User cancelled Google Pay payment");
            cleanupCallbacks();
            return;
        }
        if (i12 != -1 || intent == null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(StatusResponse.RESULT_CODE, String.valueOf(i12));
            writableNativeMap.putString("isIntentNull", String.valueOf(intent == null));
            this.onPaymentAbortCallback.invoke(AnalyticsAttribute.Error, "GooglePayBridge: Payment failed", writableNativeMap);
            cleanupCallbacks();
            return;
        }
        if (intent.getExtras() == null) {
            this.onPaymentAbortCallback.invoke(AnalyticsAttribute.Error, "GooglePayBridge: bundle is null");
            cleanupCallbacks();
            return;
        }
        PaymentData fromIntent = PaymentData.getFromIntent(intent);
        if (fromIntent == null) {
            this.onPaymentAbortCallback.invoke(AnalyticsAttribute.Error, "GooglePayBridge: paymentData is null");
            cleanupCallbacks();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(fromIntent.toJson()).getJSONObject("paymentMethodData");
            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
            JSONObject jSONObjectOptJSONObject = jSONObject.getJSONObject("info").optJSONObject("billingAddress");
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString("googlePayToken", jSONObject2.getString("token"));
            writableNativeMap2.putString("billingAddress", jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : "{}");
            this.onPaymentResponseCallback.invoke(writableNativeMap2);
        } catch (JSONException e11) {
            this.onPaymentAbortCallback.invoke(AnalyticsAttribute.Error, "GooglePayBridge: " + e11.getMessage());
            cleanupCallbacks();
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void startGooglePayActivity(ReadableMap readableMap, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.googlePayPaymentData = readableMap.toHashMap();
        this.googlePayOptions = readableArray.toArrayList();
        this.onPaymentResponseCallback = callback;
        this.onPaymentAbortCallback = callback2;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            this.onPaymentAbortCallback.invoke(AnalyticsAttribute.Error, "GooglePayBridge: Current activity is null");
            cleanupCallbacks();
            return;
        }
        Task<PaymentData> loadPaymentDataTask = getLoadPaymentDataTask();
        if (loadPaymentDataTask != null) {
            AutoResolveHelper.resolveTask(loadPaymentDataTask, currentActivity, START_GOOGLE_PAY_REQUEST_CODE);
        } else {
            this.onPaymentAbortCallback.invoke(AnalyticsAttribute.Error, "GooglePayBridge: Payment data task is null");
            cleanupCallbacks();
        }
    }
}
