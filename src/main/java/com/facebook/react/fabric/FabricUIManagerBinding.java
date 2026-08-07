package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.uimanager.w;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@in.a
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0003J8\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0012\u0010\u0003J(\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0086 ¢\u0006\u0004\b\u0019\u0010\u001aJh\u0010%\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0086 ¢\u0006\u0004\b%\u0010&J(\u0010*\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\"H\u0086 ¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0086 ¢\u0006\u0004\b.\u0010/J\u0018\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u001bH\u0086 ¢\u0006\u0004\b1\u00102JX\u00103\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0086 ¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b5\u0010\u0003J\u0010\u00106\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b6\u0010\u0003J\u0018\u00107\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\b7\u0010-J5\u0010:\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u00108\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u00109\u001a\u00020\u000e¢\u0006\u0004\b:\u0010\u0011J\r\u0010;\u001a\u00020\u0004¢\u0006\u0004\b;\u0010\u0003¨\u0006="}, d2 = {"Lcom/facebook/react/fabric/FabricUIManagerBinding;", "Lcom/facebook/jni/HybridClassBase;", "<init>", "()V", "Ljn0/h0;", "initHybrid", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/bridge/RuntimeScheduler;", "runtimeScheduler", "Lcom/facebook/react/fabric/FabricUIManager;", "uiManager", "Lcom/facebook/react/fabric/events/EventBeatManager;", "eventBeatManager", "Lcom/facebook/react/fabric/ComponentFactory;", "componentsRegistry", "installFabricUIManager", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/bridge/RuntimeScheduler;Lcom/facebook/react/fabric/FabricUIManager;Lcom/facebook/react/fabric/events/EventBeatManager;Lcom/facebook/react/fabric/ComponentFactory;)V", "uninstallFabricUIManager", "", "surfaceId", "", "moduleName", "Lcom/facebook/react/bridge/NativeMap;", "initialProps", "startSurface", "(ILjava/lang/String;Lcom/facebook/react/bridge/NativeMap;)V", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "offsetX", "offsetY", "", "isRTL", "doLeftAndRightSwapInRTL", "startSurfaceWithConstraints", "(ILjava/lang/String;Lcom/facebook/react/bridge/NativeMap;FFFFFFZZ)V", "Lcom/facebook/react/fabric/SurfaceHandlerBinding;", "surfaceHandler", "isMountable", "startSurfaceWithSurfaceHandler", "(ILcom/facebook/react/fabric/SurfaceHandlerBinding;Z)V", "stopSurface", "(I)V", "stopSurfaceWithSurfaceHandler", "(Lcom/facebook/react/fabric/SurfaceHandlerBinding;)V", "pointScaleFactor", "setPixelDensity", "(F)V", "setConstraints", "(IFFFFFFZZ)V", "driveCxxAnimations", "drainPreallocateViewsQueue", "reportMount", "fabricUIManager", "componentFactory", "register", "unregister", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"MissingNativeLoadLibrary"})
public final class FabricUIManagerBinding extends HybridClassBase {
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/fabric/FabricUIManagerBinding$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    public FabricUIManagerBinding() {
        initHybrid();
    }

    private final native void initHybrid();

    private final native void installFabricUIManager(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager uiManager, EventBeatManager eventBeatManager, ComponentFactory componentsRegistry);

    private final native void uninstallFabricUIManager();

    public final native void drainPreallocateViewsQueue();

    public final native void driveCxxAnimations();

    public final void register(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager fabricUIManager, EventBeatManager eventBeatManager, ComponentFactory componentFactory) {
        s.k(runtimeExecutor, "runtimeExecutor");
        s.k(runtimeScheduler, "runtimeScheduler");
        s.k(fabricUIManager, "fabricUIManager");
        s.k(eventBeatManager, "eventBeatManager");
        s.k(componentFactory, "componentFactory");
        fabricUIManager.setBinding(this);
        installFabricUIManager(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, componentFactory);
        setPixelDensity(w.c());
    }

    public final native void reportMount(int surfaceId);

    public final native void setConstraints(int surfaceId, float minWidth, float maxWidth, float minHeight, float maxHeight, float offsetX, float offsetY, boolean isRTL, boolean doLeftAndRightSwapInRTL);

    public final native void setPixelDensity(float pointScaleFactor);

    public final native void startSurface(int surfaceId, String moduleName, NativeMap initialProps);

    public final native void startSurfaceWithConstraints(int surfaceId, String moduleName, NativeMap initialProps, float minWidth, float maxWidth, float minHeight, float maxHeight, float offsetX, float offsetY, boolean isRTL, boolean doLeftAndRightSwapInRTL);

    public final native void startSurfaceWithSurfaceHandler(int surfaceId, SurfaceHandlerBinding surfaceHandler, boolean isMountable);

    public final native void stopSurface(int surfaceId);

    public final native void stopSurfaceWithSurfaceHandler(SurfaceHandlerBinding surfaceHandler);

    public final void unregister() {
        uninstallFabricUIManager();
    }
}
