package com.tesla.TeslaV4.reactnative.module;

import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeArray;
import com.squareup.wire.ProtoAdapter;
import com.tesla.logging.TeslaLog;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/GetTransportsListModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "vin", "commandActionBase64", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "getTransportsList", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetTransportsListModule extends ReactContextBaseJavaModule {
    private static final String TAG = "GetTransportsListModule";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTransportsListModule(ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void getTransportsList(String vin, String commandActionBase64, Promise promise) {
        p013kotlin.jvm.internal.s.k(vin, "vin");
        p013kotlin.jvm.internal.s.k(commandActionBase64, "commandActionBase64");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        try {
            byte[] bArrDecode = Base64.decode(commandActionBase64, 0);
            ProtoAdapter<ic0.c> protoAdapter = ic0.c.f77465y;
            p013kotlin.jvm.internal.s.h(bArrDecode);
            ic0.c cVarDecode = protoAdapter.decode(bArrDecode);
            be0.e eVarA = be0.e.INSTANCE.a();
            List<ic0.q> listA = pb0.b.INSTANCE.a(new pb0.a(eVarA), eVarA).a(vin, cVarDecode);
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                writableNativeArray.pushInt(((ic0.q) it.next()).getValue());
            }
            promise.resolve(writableNativeArray);
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e(TAG, "Failed to get transport list for VIN: " + vin, e11);
            promise.reject("GET_TRANSPORTS_LIST_ERROR", "Failed to get transport list for VIN: " + vin + " - " + e11.getMessage(), e11);
        }
    }
}
