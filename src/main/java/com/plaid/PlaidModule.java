package com.plaid;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.iid.InstanceID;
import com.plaid.gson.PlaidJsonConverter;
import com.plaid.link.Plaid;
import com.plaid.link.PlaidHandler;
import com.plaid.link.SubmissionData;
import com.plaid.link.configuration.LinkLogLevel;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResultHandler;
import com.plaid.link.result.LinkSuccess;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import jn0.m;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = "PlaidAndroid")
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001SB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ#\u0010\"\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0017¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0017¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010.J7\u0010/\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0017¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u001c2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J1\u0010?\u001a\u00020\u001c2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020=H\u0016¢\u0006\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020D8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010MR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010OR\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lcom/plaid/PlaidModule;", "Lcom/plaid/NativePlaidLinkModuleAndroidSpec;", "Lcom/facebook/react/bridge/ActivityEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "token", "", "noLoadingState", "Lcom/plaid/link/configuration/LinkLogLevel;", "logLevel", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "getLinkTokenConfiguration", "(Ljava/lang/String;ZLcom/plaid/link/configuration/LinkLogLevel;)Lcom/plaid/link/configuration/LinkTokenConfiguration;", "Lorg/json/JSONObject;", "obj", "fieldName", "maybeGetStringField", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "maybeGetBooleanField", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", InquiryField.StringField.TYPE, "getLogLevel", "(Ljava/lang/String;)Lcom/plaid/link/configuration/LinkLogLevel;", "getName", "()Ljava/lang/String;", "Ljn0/h0;", "initialize", "()V", "invalidate", "phoneNumber", "dateOfBirth", "submit", "(Ljava/lang/String;Ljava/lang/String;)V", "createPlaidLink", "(Ljava/lang/String;ZLjava/lang/String;)V", "Lcom/facebook/react/bridge/Callback;", "onSuccessCallback", "onExitCallback", "open", "(Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "destroy", "(Lcom/facebook/react/bridge/Promise;)V", "startLinkActivityForResult", "(Ljava/lang/String;ZLjava/lang/String;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "eventName", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(D)V", "Landroid/app/Activity;", "activity", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", AnalyticsAttribute.Intent, "onNewIntent", "(Landroid/content/Intent;)V", "Lcom/plaid/ActivityResultManager;", "mActivityResultManager$delegate", "Lkotlin/Lazy;", "getMActivityResultManager", "()Lcom/plaid/ActivityResultManager;", "mActivityResultManager", "Lcom/plaid/gson/PlaidJsonConverter;", "jsonConverter$delegate", "getJsonConverter", "()Lcom/plaid/gson/PlaidJsonConverter;", "jsonConverter", "Lcom/facebook/react/bridge/Callback;", "Lcom/plaid/link/PlaidHandler;", "plaidHandler", "Lcom/plaid/link/PlaidHandler;", "Companion", "react-native-plaid-link-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlaidModule extends NativePlaidLinkModuleAndroidSpec implements ActivityEventListener {
    private static final String LINK_TOKEN_PREFIX = "link";
    public static final String NAME = "PlaidAndroid";

    /* JADX INFO: renamed from: jsonConverter$delegate, reason: from kotlin metadata */
    private final Lazy jsonConverter;

    /* JADX INFO: renamed from: mActivityResultManager$delegate, reason: from kotlin metadata */
    private final Lazy mActivityResultManager;
    private Callback onExitCallback;
    private Callback onSuccessCallback;
    private PlaidHandler plaidHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.mActivityResultManager = m.b(new wn0.a() { // from class: com.plaid.i
            @Override // wn0.a
            public final Object invoke() {
                return PlaidModule.mActivityResultManager_delegate$lambda$0();
            }
        });
        this.jsonConverter = m.b(new wn0.a() { // from class: com.plaid.j
            @Override // wn0.a
            public final Object invoke() {
                return PlaidModule.jsonConverter_delegate$lambda$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 createPlaidLink$lambda$2(PlaidModule plaidModule, LinkEvent linkEvent) throws JSONException {
        s.k(linkEvent, "linkEvent");
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) plaidModule.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onEvent", GlobalFunctionsKt.convertJsonToMap(new JSONObject(plaidModule.getJsonConverter().convert(linkEvent))));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroy$lambda$5(Promise promise, CountDownLatch countDownLatch) {
        try {
            Plaid.INSTANCE.destroy();
            countDownLatch.countDown();
        } catch (Exception e11) {
            promise.reject("DESTROY_FAILED", "Failed to destroy Plaid", e11);
            countDownLatch.countDown();
        }
    }

    private final PlaidJsonConverter getJsonConverter() {
        return (PlaidJsonConverter) this.jsonConverter.getValue();
    }

    private final LinkTokenConfiguration getLinkTokenConfiguration(String token, boolean noLoadingState, LinkLogLevel logLevel) {
        if (token != null && t.b0(token, LINK_TOKEN_PREFIX, false, 2, null)) {
            return new LinkTokenConfiguration.Builder().token(token).logLevel(logLevel).noLoadingState(noLoadingState).build();
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final LinkLogLevel getLogLevel(String string) {
        switch (string.hashCode()) {
            case 3237038:
                if (string.equals("info")) {
                    return LinkLogLevel.INFO;
                }
                break;
            case 3641990:
                if (string.equals("warn")) {
                    return LinkLogLevel.WARN;
                }
                break;
            case 95458899:
                if (string.equals("debug")) {
                    return LinkLogLevel.DEBUG;
                }
                break;
            case 96784904:
                if (string.equals(AnalyticsAttribute.Error)) {
                    return LinkLogLevel.ERROR;
                }
                break;
        }
        return LinkLogLevel.ASSERT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlaidJsonConverter jsonConverter_delegate$lambda$1() {
        return new PlaidJsonConverter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityResultManager mActivityResultManager_delegate$lambda$0() {
        return new ActivityResultManager();
    }

    private final Boolean maybeGetBooleanField(JSONObject obj, String fieldName) {
        if (obj.has(fieldName)) {
            return Boolean.valueOf(obj.getBoolean(fieldName));
        }
        return null;
    }

    private final String maybeGetStringField(JSONObject obj, String fieldName) {
        if (!obj.has(fieldName) || TextUtils.isEmpty(obj.getString(fieldName))) {
            return null;
        }
        return obj.getString(fieldName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 onActivityResult$lambda$8(PlaidModule plaidModule, LinkSuccess success) throws JSONException {
        s.k(success, "success");
        WritableMap writableMapConvertJsonToMap = GlobalFunctionsKt.convertJsonToMap(new JSONObject(plaidModule.getJsonConverter().convert(success)));
        System.out.print(writableMapConvertJsonToMap);
        Callback callback = plaidModule.onSuccessCallback;
        if (callback != null) {
            callback.invoke(writableMapConvertJsonToMap);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 onActivityResult$lambda$9(PlaidModule plaidModule, LinkExit exit) throws JSONException {
        s.k(exit, "exit");
        WritableMap writableMapConvertJsonToMap = GlobalFunctionsKt.convertJsonToMap(new JSONObject(plaidModule.getJsonConverter().convert(exit)));
        System.out.print(writableMapConvertJsonToMap);
        Callback callback = plaidModule.onExitCallback;
        if (callback != null) {
            callback.invoke(writableMapConvertJsonToMap);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 startLinkActivityForResult$lambda$6(PlaidModule plaidModule, LinkEvent linkEvent) throws JSONException {
        s.k(linkEvent, "linkEvent");
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) plaidModule.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onEvent", GlobalFunctionsKt.convertJsonToMap(new JSONObject(plaidModule.getJsonConverter().convert(linkEvent))));
        return h0.f84049a;
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    public void addListener(String eventName) {
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    @ReactMethod
    public void createPlaidLink(String token, boolean noLoadingState, String logLevel) throws JSONException, LinkException {
        s.k(token, "token");
        s.k(logLevel, "logLevel");
        LinkTokenConfiguration linkTokenConfiguration = getLinkTokenConfiguration(token, noLoadingState, getLogLevel(logLevel));
        if (linkTokenConfiguration == null) {
            throw new LinkException("Unable to open link, please check that your configuration is valid");
        }
        try {
            Plaid.setLinkEventListener(new l() { // from class: com.plaid.g
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return PlaidModule.createPlaidLink$lambda$2(this.f46186a, (LinkEvent) obj);
                }
            });
            Context applicationContext = getReactApplicationContext().getApplicationContext();
            s.i(applicationContext, "null cannot be cast to non-null type android.app.Application");
            this.plaidHandler = Plaid.create((Application) applicationContext, linkTokenConfiguration);
        } catch (JSONException e11) {
            Log.e("PlaidModule", e11.toString());
            throw e11;
        }
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    @ReactMethod
    public void destroy(final Promise promise) {
        s.k(promise, "promise");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.plaid.h
            @Override // java.lang.Runnable
            public final void run() {
                PlaidModule.destroy$lambda$5(promise, countDownLatch);
            }
        });
        try {
            if (countDownLatch.await(5L, TimeUnit.SECONDS)) {
                promise.resolve(null);
            } else {
                promise.reject(InstanceID.ERROR_TIMEOUT, "Timed out waiting for destroy() to complete.");
            }
        } catch (InterruptedException e11) {
            promise.reject("INTERRUPTED", "Thread was interrupted", e11);
        }
    }

    public final ActivityResultManager getMActivityResultManager() {
        return (ActivityResultManager) this.mActivityResultManager.getValue();
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PlaidAndroid";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addActivityEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeActivityEventListener(this);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        s.k(activity, "activity");
        if (getMActivityResultManager().get(Integer.valueOf(requestCode)) != null) {
            getMActivityResultManager().dispatch(requestCode, resultCode, data);
        } else {
            if (new LinkResultHandler(new l() { // from class: com.plaid.e
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return PlaidModule.onActivityResult$lambda$8(this.f46184a, (LinkSuccess) obj);
                }
            }, new l() { // from class: com.plaid.f
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return PlaidModule.onActivityResult$lambda$9(this.f46185a, (LinkExit) obj);
                }
            }).onActivityResult(requestCode, resultCode, data)) {
                return;
            }
            Log.i("PlaidModule", "Result code not handled.");
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        s.k(intent, "intent");
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    @ReactMethod
    public void open(Callback onSuccessCallback, Callback onExitCallback) throws LinkException {
        s.k(onSuccessCallback, "onSuccessCallback");
        s.k(onExitCallback, "onExitCallback");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Current activity is null");
        }
        PlaidHandler plaidHandler = this.plaidHandler;
        if (plaidHandler == null) {
            throw new LinkException("Create must be called before open.");
        }
        this.onSuccessCallback = onSuccessCallback;
        this.onExitCallback = onExitCallback;
        plaidHandler.open(currentActivity);
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    public void removeListeners(double count) {
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    @ReactMethod
    public void startLinkActivityForResult(String token, boolean noLoadingState, String logLevel, Callback onSuccessCallback, Callback onExitCallback) throws JSONException, LinkException {
        s.k(token, "token");
        s.k(logLevel, "logLevel");
        s.k(onSuccessCallback, "onSuccessCallback");
        s.k(onExitCallback, "onExitCallback");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Current activity is null");
        }
        this.onSuccessCallback = onSuccessCallback;
        this.onExitCallback = onExitCallback;
        try {
            Plaid.setLinkEventListener(new l() { // from class: com.plaid.d
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return PlaidModule.startLinkActivityForResult$lambda$6(this.f46183a, (LinkEvent) obj);
                }
            });
            LinkTokenConfiguration linkTokenConfiguration = getLinkTokenConfiguration(token, noLoadingState, getLogLevel(logLevel));
            if (linkTokenConfiguration == null) {
                throw new LinkException("Unable to open link, please check that your configuration is valid");
            }
            Context applicationContext = getReactApplicationContext().getApplicationContext();
            s.i(applicationContext, "null cannot be cast to non-null type android.app.Application");
            Plaid.create((Application) applicationContext, linkTokenConfiguration).open(currentActivity);
        } catch (JSONException e11) {
            Log.e("PlaidModule", e11.toString());
            throw e11;
        }
    }

    @Override // com.plaid.NativePlaidLinkModuleAndroidSpec
    @ReactMethod
    public void submit(String phoneNumber, String dateOfBirth) {
        if (this.plaidHandler != null) {
            SubmissionData submissionData = new SubmissionData(phoneNumber, dateOfBirth);
            PlaidHandler plaidHandler = this.plaidHandler;
            if (plaidHandler != null) {
                plaidHandler.submit(submissionData);
            }
        }
    }
}
