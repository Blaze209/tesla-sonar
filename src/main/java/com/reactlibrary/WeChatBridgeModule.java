package com.reactlibrary;

import android.content.Intent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class WeChatBridgeModule extends ReactContextBaseJavaModule implements IWXAPIEventHandler {
    private static final String INVOKE_FAILED = "WeChat API invoke returns false.";
    private static final String NOT_REGISTERED = "registerApp required.";
    private static final ArrayList<WeChatBridgeModule> modules = new ArrayList<>();
    private IWXAPI api;
    private String appId;

    public WeChatBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.api = null;
    }

    public static void handleIntent(Intent intent) {
        for (WeChatBridgeModule weChatBridgeModule : modules) {
            weChatBridgeModule.api.handleIntent(intent, weChatBridgeModule);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @ReactMethod
    public void getApiVersion(Callback callback) {
        IWXAPI iwxapi = this.api;
        if (iwxapi == null) {
            callback.invoke(NOT_REGISTERED);
        } else {
            callback.invoke(null, Integer.valueOf(iwxapi.getWXAppSupportAPI()));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WeChatBridge";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        modules.add(this);
    }

    @ReactMethod
    public void isWXAppInstalled(Callback callback) {
        IWXAPI iwxapi = this.api;
        if (iwxapi == null) {
            callback.invoke(NOT_REGISTERED);
        } else {
            callback.invoke(null, Boolean.valueOf(iwxapi.isWXAppInstalled()));
        }
    }

    @ReactMethod
    public void isWXAppSupportApi(Callback callback) {
        IWXAPI iwxapi = this.api;
        if (iwxapi == null) {
            callback.invoke(NOT_REGISTERED);
        } else {
            callback.invoke(null, Integer.valueOf(iwxapi.getWXAppSupportAPI()));
        }
    }

    @ReactMethod
    public void jumpMiniProgramPayment(String str, String str2, String str3, Callback callback) {
        if (this.api == null) {
            callback.invoke(NOT_REGISTERED);
            return;
        }
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = str;
        req.path = "/pages/payx/payx?transactionNumber=" + str2;
        req.miniprogramType = str3.equals("stage") ? 2 : 0;
        callback.invoke(this.api.sendReq(req) ? null : INVOKE_FAILED);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        if (this.api != null) {
            this.api = null;
        }
        modules.remove(this);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("openId", baseReq.openId);
        writableMapCreateMap.putString("transaction", baseReq.transaction);
        if (baseReq.getType() == 4) {
            ShowMessageFromWX.Req req = (ShowMessageFromWX.Req) baseReq;
            writableMapCreateMap.putString("type", "SendMessageToWX.Resp");
            writableMapCreateMap.putString("lang", req.lang);
            writableMapCreateMap.putString(PlaceTypes.COUNTRY, req.message.messageExt);
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("WeChat_Req", writableMapCreateMap);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        String str;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("errCode", baseResp.errCode);
        writableMapCreateMap.putString("errStr", baseResp.errStr);
        writableMapCreateMap.putString("openId", baseResp.openId);
        writableMapCreateMap.putString("transaction", baseResp.transaction);
        if (baseResp instanceof SendAuth.Resp) {
            SendAuth.Resp resp = (SendAuth.Resp) baseResp;
            str = "SendAuth.Resp";
            writableMapCreateMap.putString("type", "SendAuth.Resp");
            writableMapCreateMap.putString("code", resp.code);
            writableMapCreateMap.putString("state", resp.state);
            writableMapCreateMap.putString(ImagesContract.URL, resp.url);
            writableMapCreateMap.putString("lang", resp.lang);
            writableMapCreateMap.putString(PlaceTypes.COUNTRY, resp.country);
        } else if (baseResp instanceof SendMessageToWX.Resp) {
            str = "SendMessageToWX.Resp";
            writableMapCreateMap.putString("type", "SendMessageToWX.Resp");
        } else if (baseResp instanceof PayResp) {
            str = "PayReq.Resp";
            writableMapCreateMap.putString("type", "PayReq.Resp");
            writableMapCreateMap.putString("returnKey", ((PayResp) baseResp).returnKey);
        } else if (baseResp.getType() == 19) {
            String str2 = ((WXLaunchMiniProgram.Resp) baseResp).extMsg;
            str = "WXLaunchMiniProgramReq.Resp";
            writableMapCreateMap.putString("type", "WXLaunchMiniProgramReq.Resp");
            writableMapCreateMap.putString("extraData", str2);
            writableMapCreateMap.putString("extMsg", str2);
        } else if (baseResp instanceof ChooseCardFromWXCardPackage.Resp) {
            str = "WXChooseInvoiceResp.Resp";
            writableMapCreateMap.putString("type", "WXChooseInvoiceResp.Resp");
            writableMapCreateMap.putString("cardItemList", ((ChooseCardFromWXCardPackage.Resp) baseResp).cardItemList);
        } else if (baseResp.getType() == 26) {
            str = "WXOpenBusinessViewReq.Resp";
            writableMapCreateMap.putString("type", "WXOpenBusinessViewReq.Resp");
            writableMapCreateMap.putString("extMsg", ((WXOpenBusinessView.Resp) baseResp).extMsg);
        } else {
            str = "";
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMapCreateMap);
    }

    @ReactMethod
    public void openBusinessView(ReadableMap readableMap, Callback callback) {
        if (this.api == null) {
            callback.invoke(NOT_REGISTERED);
            return;
        }
        WXOpenBusinessView.Req req = new WXOpenBusinessView.Req();
        if (readableMap.hasKey("businessType")) {
            req.businessType = readableMap.getString("businessType");
        }
        if (readableMap.hasKey(SearchIntents.EXTRA_QUERY)) {
            req.query = readableMap.getString(SearchIntents.EXTRA_QUERY);
        }
        if (readableMap.hasKey("extInfo")) {
            req.extInfo = readableMap.getString("extInfo");
        }
        callback.invoke(this.api.sendReq(req) ? null : INVOKE_FAILED);
    }

    @ReactMethod
    public void openWXApp(Callback callback) {
        IWXAPI iwxapi = this.api;
        if (iwxapi == null) {
            callback.invoke(NOT_REGISTERED);
        } else {
            callback.invoke(null, Boolean.valueOf(iwxapi.openWXApp()));
        }
    }

    @ReactMethod
    public void pay(ReadableMap readableMap, Callback callback) {
        PayReq payReq = new PayReq();
        if (readableMap.hasKey("partnerId")) {
            payReq.partnerId = readableMap.getString("partnerId");
        }
        if (readableMap.hasKey("prepayId")) {
            payReq.prepayId = readableMap.getString("prepayId");
        }
        if (readableMap.hasKey("nonceStr")) {
            payReq.nonceStr = readableMap.getString("nonceStr");
        }
        if (readableMap.hasKey("timeStamp")) {
            payReq.timeStamp = readableMap.getString("timeStamp");
        }
        if (readableMap.hasKey("sign")) {
            payReq.sign = readableMap.getString("sign");
        }
        if (readableMap.hasKey("package")) {
            payReq.packageValue = readableMap.getString("package");
        }
        if (readableMap.hasKey("extData")) {
            payReq.extData = readableMap.getString("extData");
        }
        payReq.appId = this.appId;
        callback.invoke(this.api.sendReq(payReq) ? null : INVOKE_FAILED);
    }

    @ReactMethod
    public void registerApp(String str, String str2, Callback callback) {
        this.appId = str;
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(getReactApplicationContext().getBaseContext(), str, true);
        this.api = iwxapiCreateWXAPI;
        callback.invoke(null, Boolean.valueOf(iwxapiCreateWXAPI.registerApp(str)));
    }
}
