package com.facebook.react.modules.network;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.SocketTimeoutException;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\rJ+\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010!\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010 \u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/facebook/react/modules/network/p;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "requestId", "", ReactProgressBarViewManager.PROP_PROGRESS, "total", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/ReactApplicationContext;IJJ)V", "", "data", "e", "(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;JJ)V", "c", "b", "(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;)V", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lcom/facebook/react/bridge/ReactApplicationContext;ILcom/facebook/react/bridge/WritableMap;)V", AnalyticsAttribute.Error, "", "f", "(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/Throwable;)V", "g", "(Lcom/facebook/react/bridge/ReactApplicationContext;I)V", "statusCode", "headers", ImagesContract.URL, "h", "(Lcom/facebook/react/bridge/ReactApplicationContext;IILcom/facebook/react/bridge/WritableMap;Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f22852a = new p();

    private p() {
    }

    public static final void a(ReactApplicationContext reactContext, int requestId, WritableMap data) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(requestId);
            writableArrayCreateArray.pushMap(data);
            h0 h0Var = h0.f84049a;
            reactContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray);
        }
    }

    public static final void b(ReactApplicationContext reactContext, int requestId, String data) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(requestId);
            writableArrayCreateArray.pushString(data);
            h0 h0Var = h0.f84049a;
            reactContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray);
        }
    }

    public static final void c(ReactApplicationContext reactContext, int requestId, long progress, long total) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(requestId);
            writableArrayCreateArray.pushInt((int) progress);
            writableArrayCreateArray.pushInt((int) total);
            h0 h0Var = h0.f84049a;
            reactContext.emitDeviceEvent("didReceiveNetworkDataProgress", writableArrayCreateArray);
        }
    }

    public static final void d(ReactApplicationContext reactContext, int requestId, long progress, long total) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(requestId);
            writableArrayCreateArray.pushInt((int) progress);
            writableArrayCreateArray.pushInt((int) total);
            h0 h0Var = h0.f84049a;
            reactContext.emitDeviceEvent("didSendNetworkData", writableArrayCreateArray);
        }
    }

    public static final void e(ReactApplicationContext reactContext, int requestId, String data, long progress, long total) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(requestId);
            writableArrayCreateArray.pushString(data);
            writableArrayCreateArray.pushInt((int) progress);
            writableArrayCreateArray.pushInt((int) total);
            h0 h0Var = h0.f84049a;
            reactContext.emitDeviceEvent("didReceiveNetworkIncrementalData", writableArrayCreateArray);
        }
    }

    public static final void f(ReactApplicationContext reactContext, int requestId, String error, Throwable e11) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(requestId);
            writableArrayCreateArray.pushString(error);
            if (s.f(e11 != null ? e11.getClass() : null, SocketTimeoutException.class)) {
                writableArrayCreateArray.pushBoolean(true);
            }
            h0 h0Var = h0.f84049a;
            reactContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static final void g(ReactApplicationContext reactContext, int requestId) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(requestId);
            writableArrayCreateArray.pushNull();
            h0 h0Var = h0.f84049a;
            reactContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static final void h(ReactApplicationContext reactContext, int requestId, int statusCode, WritableMap headers, String url) {
        if (reactContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.pushInt(requestId);
            writableArrayCreateArray.pushInt(statusCode);
            writableArrayCreateArray.pushMap(headers);
            writableArrayCreateArray.pushString(url);
            h0 h0Var = h0.f84049a;
            reactContext.emitDeviceEvent("didReceiveNetworkResponse", writableArrayCreateArray);
        }
    }
}
