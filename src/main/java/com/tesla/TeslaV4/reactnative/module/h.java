package com.tesla.TeslaV4.reactnative.module;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.fourthline.adapters.serialization.OrcaKeys;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/h;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/bridge/ReadableMap;", "fromLocationDictionary", "toLocationDictionary", "", "mapType", "", "forceWalkingMode", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "a", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZLcom/facebook/react/bridge/Promise;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f55694a = new h();

    private h() {
    }

    public final void a(Context context, ReadableMap fromLocationDictionary, ReadableMap toLocationDictionary, String mapType, boolean forceWalkingMode, Promise promise) {
        context = context;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(fromLocationDictionary, "fromLocationDictionary");
        p013kotlin.jvm.internal.s.k(toLocationDictionary, "toLocationDictionary");
        p013kotlin.jvm.internal.s.k(mapType, "mapType");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        double d11 = fromLocationDictionary.getDouble(OrcaKeys.LATITUDE);
        double d12 = fromLocationDictionary.getDouble(OrcaKeys.LONGITUDE);
        double d13 = toLocationDictionary.getDouble(OrcaKeys.LATITUDE);
        double d14 = toLocationDictionary.getDouble(OrcaKeys.LONGITUDE);
        l.Companion companion = l.INSTANCE;
        dd0.b bVarB = companion.a().b(d11, d12, d13, d14);
        String string = fromLocationDictionary.getString("name");
        String string2 = toLocationDictionary.getString("name");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        for (dd0.c cVar : companion.a().a()) {
            if (cVar.isSupported(context)) {
                String str = string;
                double d15 = d11;
                if (cVar.a(jn0.x.a(Double.valueOf(d11), Double.valueOf(d12)), jn0.x.a(Double.valueOf(d13), Double.valueOf(d14)), str, string2, bVarB, context)) {
                    writableNativeMap.putString("result", "SUCCESS");
                    promise.resolve(writableNativeMap);
                    return;
                } else {
                    d11 = d15;
                    string = str;
                }
            }
        }
        writableNativeMap.putString("result", "ERROR_UNABLE_TO_LAUNCH");
        promise.resolve(writableNativeMap);
    }
}
