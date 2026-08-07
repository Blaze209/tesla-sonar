package com.facebook.react.runtime;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/runtime/y0;", "Lcom/facebook/react/devsupport/z0;", "Lcom/facebook/react/runtime/ReactHostImpl;", "delegate", "<init>", "(Lcom/facebook/react/runtime/ReactHostImpl;)V", "Ljn0/h0;", "g", "()V", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "Lcom/facebook/react/bridge/JavaScriptExecutorFactory;", "getJavaScriptExecutorFactory", "()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;", "", "appKey", "Landroid/view/View;", "b", "(Ljava/lang/String;)Landroid/view/View;", "rootView", "e", "(Landroid/view/View;)V", "s", "a", "(Ljava/lang/String;)V", "Lcom/facebook/react/runtime/ReactHostImpl;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y0 implements com.facebook.react.devsupport.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactHostImpl delegate;

    public y0(ReactHostImpl delegate) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.facebook.react.devsupport.z0
    public void a(String s11) {
        p013kotlin.jvm.internal.s.k(s11, "s");
        this.delegate.a(s11);
    }

    @Override // com.facebook.react.devsupport.z0
    public View b(String appKey) {
        p013kotlin.jvm.internal.s.k(appKey, "appKey");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || this.delegate.I0(appKey)) {
            return null;
        }
        g1 g1VarE = g1.e(currentActivity, appKey, new Bundle());
        p013kotlin.jvm.internal.s.j(g1VarE, "createWithView(...)");
        g1VarE.b(this.delegate);
        g1VarE.start();
        return g1VarE.getView();
    }

    @Override // com.facebook.react.devsupport.z0
    public void e(View rootView) {
        p013kotlin.jvm.internal.s.k(rootView, "rootView");
    }

    @Override // com.facebook.react.devsupport.z0
    public void g() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        ReactContext reactContextH = this.delegate.h();
        if (reactContextH == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextH.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
            return;
        }
        rCTDeviceEventEmitter.emit("toggleElementInspector", null);
    }

    @Override // com.facebook.react.devsupport.z0
    public Activity getCurrentActivity() {
        return this.delegate.q0();
    }

    @Override // com.facebook.react.devsupport.z0
    public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        throw new IllegalStateException("Not implemented for bridgeless mode");
    }
}
