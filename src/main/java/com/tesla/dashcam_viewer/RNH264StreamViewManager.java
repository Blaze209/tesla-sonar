package com.tesla.dashcam_viewer;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import java.lang.ref.WeakReference;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/tesla/dashcam_viewer/RNH264StreamViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/tesla/dashcam_viewer/u0;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Ljn0/h0;", "initialize", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/tesla/dashcam_viewer/u0;", "getLatestView", "()Lcom/tesla/dashcam_viewer/u0;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Ljava/lang/ref/WeakReference;", "latestViewRef", "Ljava/lang/ref/WeakReference;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNH264StreamViewManager extends SimpleViewManager<u0> {
    private static WeakReference<u0> latestViewRef;
    private static ReactApplicationContext reactContext;
    public static final RNH264StreamViewManager INSTANCE = new RNH264StreamViewManager();
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("DashcamViewer_RNH264ViewMgr");

    private RNH264StreamViewManager() {
    }

    public final u0 getLatestView() {
        WeakReference<u0> weakReference = latestViewRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNH264StreamViewManager";
    }

    public final void initialize(ReactApplicationContext reactContext2) {
        p013kotlin.jvm.internal.s.k(reactContext2, "reactContext");
        reactContext = reactContext2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public u0 createViewInstance(com.facebook.react.uimanager.v0 reactContext2) {
        p013kotlin.jvm.internal.s.k(reactContext2, "reactContext");
        Context applicationContext = reactContext2.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        u0 u0Var = new u0(applicationContext, null, 0, 6, null);
        logger.j("createViewInstance returning new RNH264HostingView");
        latestViewRef = new WeakReference<>(u0Var);
        return u0Var;
    }
}
