package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.JavascriptException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pn.e;

/* JADX INFO: loaded from: classes3.dex */
@xn.a(name = NativeExceptionsManagerSpec.NAME)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/modules/core/ExceptionsManagerModule;", "Lcom/facebook/fbreact/specs/NativeExceptionsManagerSpec;", "Lpn/e;", "devSupportManager", "<init>", "(Lpn/e;)V", "", "message", "Lcom/facebook/react/bridge/ReadableArray;", "stack", "", "idDouble", "Ljn0/h0;", "reportFatalException", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;D)V", "reportSoftException", "Lcom/facebook/react/bridge/ReadableMap;", "data", "reportException", "(Lcom/facebook/react/bridge/ReadableMap;)V", "dismissRedbox", "()V", "Lpn/e;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    private final e devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionsManagerModule(e devSupportManager) {
        super(null);
        s.k(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void dismissRedbox() {
        if (this.devSupportManager.k()) {
            this.devSupportManager.w();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportException(ReadableMap data) {
        s.k(data, "data");
        String string = data.getString("message");
        if (string == null) {
            string = "";
        }
        ReadableArray array = data.getArray("stack");
        if (array == null) {
            array = Arguments.createArray();
        }
        boolean z11 = data.hasKey("isFatal") ? data.getBoolean("isFatal") : false;
        String strA = uo.a.a(data);
        if (z11) {
            s.h(array);
            JavascriptException javascriptException = new JavascriptException(uo.b.a(string, array));
            javascriptException.a(strA);
            throw javascriptException;
        }
        s.h(array);
        qk.a.m("ReactNative", uo.b.a(string, array));
        if (strA != null) {
            qk.a.c("ReactNative", "extraData: %s", strA);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportFatalException(String message, ReadableArray stack, double idDouble) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", message);
        javaOnlyMap.putArray("stack", stack);
        javaOnlyMap.putInt("id", (int) idDouble);
        javaOnlyMap.putBoolean("isFatal", true);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportSoftException(String message, ReadableArray stack, double idDouble) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", message);
        javaOnlyMap.putArray("stack", stack);
        javaOnlyMap.putInt("id", (int) idDouble);
        javaOnlyMap.putBoolean("isFatal", false);
        reportException(javaOnlyMap);
    }
}
