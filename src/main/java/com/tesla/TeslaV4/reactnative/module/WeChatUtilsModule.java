package com.tesla.TeslaV4.reactnative.module;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tesla.logging.TeslaLog;

/* JADX INFO: loaded from: classes7.dex */
public class WeChatUtilsModule extends ReactContextBaseJavaModule implements IWXAPIEventHandler {
    private static final String INVOKE_FAILED = "WeChat API invoke returns false.";
    private static final String NOT_REGISTERED = "registerApp required.";
    private IWXAPI api;
    private String appId;

    public WeChatUtilsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.api = null;
    }

    private void logInfo(String str) {
        TeslaLog.INSTANCE.i("WeChatUtilsModule", str);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WeChatUtilsModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
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

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        if (this.api != null) {
            this.api = null;
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        logInfo("onReq");
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
        String strValueOf;
        logInfo("onResp");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("errCode", baseResp.errCode);
        writableMapCreateMap.putString("errStr", baseResp.errStr);
        writableMapCreateMap.putString("openId", baseResp.openId);
        writableMapCreateMap.putString("transaction", baseResp.transaction);
        if (baseResp.getType() == 19) {
            String str = ((WXLaunchMiniProgram.Resp) baseResp).extMsg;
            strValueOf = "WXLaunchMiniProgramReq.Resp";
            writableMapCreateMap.putString("type", "WXLaunchMiniProgramReq.Resp");
            writableMapCreateMap.putString("extraData", str);
            writableMapCreateMap.putString("extMsg", str);
        } else {
            strValueOf = String.valueOf(baseResp.getType());
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(strValueOf, writableMapCreateMap);
    }

    @ReactMethod
    public void openWXMiniProgram(String str, String str2, String str3, Callback callback) {
        if (this.api == null) {
            callback.invoke(NOT_REGISTERED);
            return;
        }
        logInfo(String.format("openWXMiniProgram params %s, %s, %s", str, str2, str3));
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = str;
        req.path = str2;
        req.miniprogramType = 0;
        callback.invoke(this.api.sendReq(req) ? null : INVOKE_FAILED);
    }

    @ReactMethod
    public void registerApp(String str, String str2, Callback callback) {
        logInfo(String.format("registerApp start appId: %s", str));
        this.appId = str;
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(getReactApplicationContext().getBaseContext(), str, true);
        this.api = iwxapiCreateWXAPI;
        callback.invoke(null, Boolean.valueOf(iwxapiCreateWXAPI.registerApp(str)));
    }
}
