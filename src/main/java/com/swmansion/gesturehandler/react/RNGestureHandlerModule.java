package com.swmansion.gesturehandler.react;

import android.util.Log;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.x0;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec;
import com.swmansion.gesturehandler.core.GestureHandler;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@xn.a(name = "RNGestureHandlerModule")
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001JB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eH\u0017¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*H\u0017¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0017¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000fH\u0017¢\u0006\u0004\b0\u0010/J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020*H\u0017¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u0010/J\u0015\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0019¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0019¢\u0006\u0004\b:\u00109R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00190F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;", "Lcom/swmansion/gesturehandler/NativeRNGestureHandlerModuleSpec;", "Lw90/a;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "T", "", "handlerName", "", "handlerTag", "Lcom/facebook/react/bridge/ReadableMap;", "config", "Ljn0/h0;", "createGestureHandlerHelper", "(Ljava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V", "updateGestureHandlerHelper", "(ILcom/facebook/react/bridge/ReadableMap;)V", "", "jsiPtr", "decorateRuntime", "(J)V", "viewTag", "Lcom/swmansion/gesturehandler/react/l;", "findRootHelperForViewAncestor", "(I)Lcom/swmansion/gesturehandler/react/l;", "getName", "()Ljava/lang/String;", "", "handlerTagDouble", "createGestureHandler", "(Ljava/lang/String;DLcom/facebook/react/bridge/ReadableMap;)V", "viewTagDouble", "actionTypeDouble", "attachGestureHandler", "(DDD)V", "updateGestureHandler", "(DLcom/facebook/react/bridge/ReadableMap;)V", "dropGestureHandler", "(D)V", "", "blockNativeResponder", "handleSetJSResponder", "(DZ)V", "handleClearJSResponder", "()V", "flushOperations", "newState", "setGestureHandlerState", "(II)V", "install", "()Z", "invalidate", "root", "registerRootHelper", "(Lcom/swmansion/gesturehandler/react/l;)V", "unregisterRootHelper", "Lcom/swmansion/gesturehandler/react/j;", "registry", "Lcom/swmansion/gesturehandler/react/j;", "getRegistry", "()Lcom/swmansion/gesturehandler/react/j;", "Lcom/swmansion/gesturehandler/react/e;", "eventDispatcher", "Lcom/swmansion/gesturehandler/react/e;", "Lcom/swmansion/gesturehandler/react/g;", "interactionManager", "Lcom/swmansion/gesturehandler/react/g;", "", "roots", "Ljava/util/List;", "Companion", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNGestureHandlerModule extends NativeRNGestureHandlerModuleSpec implements w90.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String NAME = "RNGestureHandlerModule";
    private final e eventDispatcher;
    private final g interactionManager;
    private final j registry;
    private final List<l> roots;

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.registry = new j();
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        s.j(reactApplicationContext2, "getReactApplicationContext(...)");
        this.eventDispatcher = new e(reactApplicationContext2);
        this.interactionManager = new g();
        this.roots = new ArrayList();
    }

    private final <T extends GestureHandler> void createGestureHandlerHelper(String handlerName, int handlerTag, ReadableMap config) {
        if (this.registry.h(handlerTag) != null) {
            throw new IllegalStateException("Handler with tag " + handlerTag + " already exists. Please ensure that no Gesture instance is used across multiple GestureDetectors.");
        }
        GestureHandler.b<GestureHandler> bVarB = f.f55414a.b(handlerName);
        if (bVarB == null) {
            throw new JSApplicationIllegalArgumentException("Invalid handler name " + handlerName);
        }
        GestureHandler gestureHandlerB = bVarB.b(getReactApplicationContext(), handlerTag);
        gestureHandlerB.E0(this.eventDispatcher);
        this.registry.j(gestureHandlerB);
        this.interactionManager.e(gestureHandlerB, config);
        bVarB.f(gestureHandlerB, config);
    }

    private final native void decorateRuntime(long jsiPtr);

    private final l findRootHelperForViewAncestor(int viewTag) {
        l lVar;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        int iResolveRootTagFromReactTag = a.b(reactApplicationContext).resolveRootTagFromReactTag(viewTag);
        Object obj = null;
        if (iResolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.roots) {
            try {
                for (Object obj2 : this.roots) {
                    l lVar2 = (l) obj2;
                    if ((lVar2.getRootView() instanceof x0) && ((x0) lVar2.getRootView()).getRootViewTag() == iResolveRootTagFromReactTag) {
                        obj = obj2;
                        break;
                    }
                }
                lVar = (l) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$1(RNGestureHandlerModule rNGestureHandlerModule) {
        try {
            SoLoader.t("gesturehandler");
            JavaScriptContextHolder javaScriptContextHolder = rNGestureHandlerModule.getReactApplicationContext().getJavaScriptContextHolder();
            s.h(javaScriptContextHolder);
            rNGestureHandlerModule.decorateRuntime(javaScriptContextHolder.get());
        } catch (Exception unused) {
            Log.w("[RNGestureHandler]", "Could not install JSI bindings.");
        }
    }

    private final <T extends GestureHandler> void updateGestureHandlerHelper(int handlerTag, ReadableMap config) {
        GestureHandler.b<GestureHandler> bVarA;
        GestureHandler gestureHandlerH = this.registry.h(handlerTag);
        if (gestureHandlerH == null || (bVarA = f.f55414a.a(gestureHandlerH)) == null) {
            return;
        }
        this.interactionManager.g(handlerTag);
        this.interactionManager.e(gestureHandlerH, config);
        bVarA.f(gestureHandlerH, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void attachGestureHandler(double handlerTagDouble, double viewTagDouble, double actionTypeDouble) {
        int i11 = (int) handlerTagDouble;
        if (this.registry.c(i11, (int) viewTagDouble, (int) actionTypeDouble)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i11 + " does not exists");
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void createGestureHandler(String handlerName, double handlerTagDouble, ReadableMap config) {
        s.k(handlerName, "handlerName");
        s.k(config, "config");
        createGestureHandlerHelper(handlerName, (int) handlerTagDouble, config);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void dropGestureHandler(double handlerTagDouble) {
        int i11 = (int) handlerTagDouble;
        this.interactionManager.g(i11);
        this.registry.g(i11);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void flushOperations() {
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerModule";
    }

    public final j getRegistry() {
        return this.registry;
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleClearJSResponder() {
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleSetJSResponder(double viewTagDouble, boolean blockNativeResponder) {
        int i11 = (int) viewTagDouble;
        l lVarFindRootHelperForViewAncestor = findRootHelperForViewAncestor(i11);
        if (lVarFindRootHelperForViewAncestor != null) {
            lVarFindRootHelperForViewAncestor.g(i11, blockNativeResponder);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        getReactApplicationContext().runOnJSQueueThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.h
            @Override // java.lang.Runnable
            public final void run() {
                RNGestureHandlerModule.install$lambda$1(this.f55420a);
            }
        });
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.registry.f();
        this.interactionManager.h();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                try {
                    this.roots.size();
                    this.roots.get(0).j();
                    this.roots.size();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            h0 h0Var = h0.f84049a;
        }
        super.invalidate();
    }

    public final void registerRootHelper(l root) {
        s.k(root, "root");
        synchronized (this.roots) {
            this.roots.contains(root);
            this.roots.add(root);
        }
    }

    @Override // w90.a
    public void setGestureHandlerState(int handlerTag, int newState) {
        GestureHandler gestureHandlerH = this.registry.h(handlerTag);
        if (gestureHandlerH != null) {
            if (newState == 1) {
                gestureHandlerH.D();
                return;
            }
            if (newState == 2) {
                gestureHandlerH.p();
                return;
            }
            if (newState == 3) {
                gestureHandlerH.q();
            } else if (newState == 4) {
                gestureHandlerH.l(true);
            } else {
                if (newState != 5) {
                    return;
                }
                gestureHandlerH.B();
            }
        }
    }

    public final void unregisterRootHelper(l root) {
        s.k(root, "root");
        synchronized (this.roots) {
            this.roots.remove(root);
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void updateGestureHandler(double handlerTagDouble, ReadableMap config) {
        s.k(config, "config");
        updateGestureHandlerHelper((int) handlerTagDouble, config);
    }
}
