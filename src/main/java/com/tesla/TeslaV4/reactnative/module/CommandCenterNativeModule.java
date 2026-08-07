package com.tesla.TeslaV4.reactnative.module;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.tesla.logging.TeslaLog;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/CommandCenterNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "request", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "sendCommand", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommandCenterNativeModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandCenterNativeModule(ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendCommand$lambda$1(long j11, ic0.e eVar, Promise promise, ic0.g response) {
        p013kotlin.jvm.internal.s.k(response, "response");
        long jCurrentTimeMillis = System.currentTimeMillis();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("result", ic0.g.f77514x.encodeByteString(ic0.g.b(response, null, null, null, null, null, 0, null, jCurrentTimeMillis, 0L, (int) (j11 - eVar.getJsBridgeStartTimestamp()), 0, (int) (jCurrentTimeMillis - j11), 0, 0, 0, false, null, null, null, null, null, null, null, 8385919, null)).a());
        TeslaLog.INSTANCE.i("CommandCenterNativeModule sendCommand", writableNativeMap.toString());
        promise.resolve(writableNativeMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CommandCenter";
    }

    @ReactMethod
    public final void sendCommand(String request, final Promise promise) {
        p013kotlin.jvm.internal.s.k(request, "request");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ic0.e eVarB = ic0.e.b(ic0.e.f77490w.decode(ie0.n.a(request)), null, null, null, null, null, false, false, null, null, 0L, false, false, false, false, false, false, 0L, 0L, jCurrentTimeMillis, 0, null, null, 3932159, null);
        cb0.a aVar = cb0.a.f19019a;
        p013kotlin.jvm.internal.s.h(applicationContext);
        final ic0.e eVarA = aVar.a(applicationContext, eVarB);
        eb0.f.INSTANCE.a(applicationContext).a(eVarA, new ce0.d() { // from class: com.tesla.TeslaV4.reactnative.module.a
            @Override // ce0.d
            public final void a(ic0.g gVar) {
                CommandCenterNativeModule.sendCommand$lambda$1(jCurrentTimeMillis, eVarA, promise, gVar);
            }
        });
    }
}
