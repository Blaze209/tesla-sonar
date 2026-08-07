package com.facebook.react.runtime;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.adyen.checkout.components.core.Address;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashBridgeNotAllowedSoftException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
@in.a
public class ReactHostImpl implements com.facebook.react.a0 {
    private static final AtomicInteger B = new AtomicInteger(0);
    private ko.c<Void> A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f22926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentFactory f22927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private pn.e f22928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f22929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f22930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<g1> f22931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.facebook.react.h f22932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f22933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f22934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.facebook.react.runtime.a<ko.c<ReactInstance>> f22935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ReactInstance f22936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.facebook.react.runtime.a<com.facebook.react.runtime.b> f22937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference<Activity> f22938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicReference<WeakReference<Activity>> f22939o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.facebook.react.runtime.c f22940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final e1 f22941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f22942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MemoryPressureListener f22943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private co.a f22944t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final List<com.facebook.react.b0> f22945u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List<wn0.a<jn0.h0>> f22946v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ReactHostInspectorTarget f22947w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile boolean f22948x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ko.c<Void> f22949y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ko.c<ReactInstance> f22950z;

    class a implements pn.e.a {
        a() {
        }

        @Override // pn.e.a
        public void onResume() {
            UiThreadUtil.assertOnUiThread();
            if (ReactHostImpl.this.f22947w != null) {
                ReactHostImpl.this.f22947w.sendDebuggerResumeCommand();
            }
        }
    }

    class b implements pn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.devsupport.c0 f22953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ko.d f22954c;

        b(String str, com.facebook.react.devsupport.c0 c0Var, ko.d dVar) {
            this.f22952a = str;
            this.f22953b = c0Var;
            this.f22954c = dVar;
        }

        @Override // pn.a
        public void onError(Exception exc) {
            this.f22954c.c(exc);
        }

        @Override // pn.a
        public void onSuccess() {
            ReactHostImpl.this.t1("loadJSBundleFromMetro()", "Creating BundleLoader");
            this.f22954c.d(JSBundleLoader.createCachedBundleFromNetworkLoader(this.f22952a, this.f22953b.j()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ReactInstance f22956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ReactContext f22957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f22958c;

        private c(ReactInstance reactInstance, ReactContext reactContext, boolean z11) {
            this.f22956a = reactInstance;
            this.f22957b = reactContext;
            this.f22958c = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface d {
        void a(ReactInstance reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface e {
        ReactInstance a(ko.c<ReactInstance> cVar, String str);
    }

    public ReactHostImpl(Context context, f fVar, ComponentFactory componentFactory, boolean z11, boolean z12) {
        this(context, fVar, componentFactory, Executors.newSingleThreadExecutor(), ko.c.f86378j, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ko.c<Void> A0() {
        if (this.f22949y == null) {
            t1("getOrCreateStartTask()", "Schedule");
            if (ln.a.DEBUG) {
                gn.a.b(tn.b.c(), "enableBridgelessArchitecture FeatureFlag must be set to start ReactNative.");
                gn.a.b(tn.b.f(), "enableFabricRenderer FeatureFlag must be set to start ReactNative.");
                gn.a.b(tn.b.r(), "useTurboModules FeatureFlag must be set to start ReactNative.");
            }
            this.f22949y = G1().k(new ko.a() { // from class: com.facebook.react.runtime.j
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23024a.i1(cVar);
                }
            }, this.f22929e);
        }
        return this.f22949y;
    }

    private void A1(Activity activity) {
        this.f22938n.set(activity);
        if (activity != null) {
            this.f22939o.set(new WeakReference<>(activity));
        }
    }

    private void B1(String str, ReactInstance reactInstance) {
        t1(str, "Restarting previously running React Native Surfaces");
        synchronized (this.f22931g) {
            try {
                Iterator<g1> it = this.f22931g.iterator();
                while (it.hasNext()) {
                    reactInstance.B(it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void D1(String str, ReactInstance reactInstance) {
        t1(str, "Stopping all React Native surfaces");
        synchronized (this.f22931g) {
            try {
                for (g1 g1Var : this.f22931g) {
                    reactInstance.C(g1Var);
                    g1Var.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void F1(ReactInstance reactInstance) {
        if (reactInstance != null) {
            if (InspectorFlags.getFuseboxEnabled()) {
                ReactHostInspectorTarget reactHostInspectorTarget = this.f22947w;
                gn.a.b(reactHostInspectorTarget != null && reactHostInspectorTarget.isValid(), "Host inspector target destroyed before instance was unregistered");
            }
            reactInstance.unregisterFromInspector();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ko.c<ReactInstance> G1() {
        return H1(0, 4);
    }

    private ko.c<Boolean> H0() {
        s1("isMetroRunning()");
        final ko.d dVar = new ko.d();
        i().B(new pn.h() { // from class: com.facebook.react.runtime.l0
            @Override // pn.h
            public final void a(boolean z11) {
                this.f23032a.j1(dVar, z11);
            }
        });
        return dVar.a();
    }

    private ko.c<ReactInstance> H1(final int i11, final int i12) {
        if (this.f22950z != null) {
            t1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is reloading. Return reload task.");
            return this.f22950z;
        }
        if (this.A != null) {
            if (i11 < i12) {
                t1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down.Wait for teardown to finish, before trying again (try count = " + i11 + ").");
                return this.A.v(new ko.a() { // from class: com.facebook.react.runtime.l
                    @Override // ko.a
                    public final Object a(ko.c cVar) {
                        return this.f23029a.q1(i11, i12, cVar);
                    }
                }, this.f22929e);
            }
            x1("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down. Not wait for teardown to finish: reached max retries.");
        }
        return y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object J0(String str, d dVar, ko.c cVar) {
        ReactInstance reactInstance = (ReactInstance) cVar.o();
        if (reactInstance == null) {
            x1(str, "Execute: reactInstance is null. Dropping work.");
            return null;
        }
        dVar.a(reactInstance);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void K0(ko.c cVar) {
        if (!cVar.s()) {
            return null;
        }
        E0(cVar.n());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean L0(String str, d dVar, ko.c cVar) {
        ReactInstance reactInstance = (ReactInstance) cVar.o();
        if (reactInstance == null) {
            x1(str, "Execute: reactInstance is null. Dropping work.");
            return Boolean.FALSE;
        }
        dVar.a(reactInstance);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(final WeakReference weakReference, final int i11) {
        this.f22929e.execute(new Runnable() { // from class: com.facebook.react.runtime.o0
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.s(weakReference, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ReactInstance N0(String str, String str2, String str3, ko.c cVar, String str4) {
        ReactInstance reactInstance = (ReactInstance) cVar.o();
        ReactInstance reactInstance2 = this.f22936l;
        String str5 = "Stage: " + str4;
        String str6 = str + " reason: " + str2;
        if (cVar.s()) {
            x1(str3, str + ": ReactInstance task faulted. " + str5 + ". " + ("Fault reason: " + cVar.n().getMessage()) + ". " + str6);
            return reactInstance2;
        }
        if (cVar.q()) {
            x1(str3, str + ": ReactInstance task cancelled. " + str5 + ". " + str6);
            return reactInstance2;
        }
        if (reactInstance == null) {
            x1(str3, str + ": ReactInstance task returned null. " + str5 + ". " + str6);
            return reactInstance2;
        }
        if (reactInstance2 != null && reactInstance != reactInstance2) {
            x1(str3, str + ": Detected two different ReactInstances. Returning old. " + str5 + ". " + str6);
        }
        return reactInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c O0(String str, Exception exc, ko.c cVar) {
        return u0(str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c P0(final String str, final Exception exc) {
        if (this.f22950z == null) {
            return u0(str, exc);
        }
        t1("destroy()", "Reloading React Native. Waiting for reload to finish before destroying React Native.");
        return this.f22950z.k(new ko.a() { // from class: com.facebook.react.runtime.v0
            @Override // ko.a
            public final Object a(ko.c cVar) {
                return this.f23077a.O0(str, exc, cVar);
            }
        }, this.f22929e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0() {
        UiThreadUtil.assertOnUiThread();
        co.a aVar = this.f22944t;
        if (aVar != null) {
            aVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c R0(ko.c cVar) {
        return ((Boolean) cVar.o()).booleanValue() ? r1() : ko.c.m(this.f22926b.getJsBundleLoader());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ JSBundleLoader S0() {
        return this.f22926b.getJsBundleLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c T0(e eVar, String str, ko.c cVar) {
        ReactHostInspectorTarget reactHostInspectorTarget;
        t1("getOrCreateDestroyTask()", "Starting React Native destruction");
        ReactInstance reactInstanceA = eVar.a(cVar, "1: Starting destroy");
        F1(reactInstanceA);
        if (this.f22948x && (reactHostInspectorTarget = this.f22947w) != null) {
            reactHostInspectorTarget.close();
            this.f22947w = null;
        }
        if (this.f22934j) {
            t1("getOrCreateDestroyTask()", "DevSupportManager cleanup");
            this.f22928d.v();
        }
        com.facebook.react.runtime.b bVarC = this.f22937m.c();
        if (bVarC == null) {
            x1("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: " + str);
        }
        t1("getOrCreateDestroyTask()", "Move ReactHost to onHostDestroy()");
        this.f22941q.b(bVarC);
        return ko.c.m(reactInstanceA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c U0(e eVar, ko.c cVar) {
        ReactInstance reactInstanceA = eVar.a(cVar, "2: Stopping surfaces");
        if (reactInstanceA == null) {
            x1("getOrCreateDestroyTask()", "Skipping surface shutdown: ReactInstance null");
            return cVar;
        }
        D1("getOrCreateDestroyTask()", reactInstanceA);
        synchronized (this.f22931g) {
            this.f22931g.clear();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c V0(e eVar, String str, ko.c cVar) {
        eVar.a(cVar, "3: Destroying ReactContext");
        Iterator<wn0.a<jn0.h0>> it = this.f22946v.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        com.facebook.react.runtime.b bVarC = this.f22937m.c();
        if (bVarC == null) {
            x1("getOrCreateDestroyTask()", "ReactContext is null. Destroy reason: " + str);
        }
        t1("getOrCreateDestroyTask()", "Destroying MemoryPressureRouter");
        this.f22932h.b(this.f22925a);
        if (bVarC != null) {
            t1("getOrCreateDestroyTask()", "Resetting ReactContext ref");
            this.f22937m.e();
            t1("getOrCreateDestroyTask()", "Destroying ReactContext");
            bVarC.destroy();
        }
        A1(null);
        yo.c.d().c();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c W0(e eVar, ko.c cVar) {
        ReactInstance reactInstanceA = eVar.a(cVar, "4: Destroying ReactInstance");
        if (reactInstanceA == null) {
            x1("getOrCreateDestroyTask()", "Skipping ReactInstance.destroy(): ReactInstance null");
        } else {
            t1("getOrCreateDestroyTask()", "Resetting ReactInstance ptr");
            this.f22936l = null;
            t1("getOrCreateDestroyTask()", "Destroying ReactInstance");
            reactInstanceA.j();
        }
        t1("getOrCreateDestroyTask()", "Resetting start task ref");
        this.f22949y = null;
        t1("getOrCreateDestroyTask()", "Resetting destroy task ref");
        this.A = null;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void X0(String str, ko.c cVar) {
        if (cVar.s()) {
            y1("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task faulted. Fault reason: " + cVar.n().getMessage() + ". Destroy reason: " + str, cVar.n());
        }
        if (!cVar.q()) {
            return null;
        }
        x1("getOrCreateDestroyTask()", "React destruction failed. ReactInstance task cancelled. Destroy reason: " + str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.facebook.react.runtime.b Y0() {
        t1("getOrCreateReactContext()", "Creating BridgelessReactContext");
        return new com.facebook.react.runtime.b(this.f22925a, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c Z0(ko.c cVar) {
        JSBundleLoader jSBundleLoader = (JSBundleLoader) cVar.o();
        com.facebook.react.runtime.b bVarV0 = v0();
        pn.e eVarI = i();
        bVarV0.setJSExceptionHandler(eVarI);
        t1("getOrCreateReactInstanceTask()", "Creating ReactInstance");
        ReactInstance reactInstance = new ReactInstance(bVarV0, this.f22926b, this.f22927c, eVarI, new QueueThreadExceptionHandler() { // from class: com.facebook.react.runtime.h0
            @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
            public final void handleException(Exception exc) {
                this.f23014a.E0(exc);
            }
        }, this.f22934j, w0());
        this.f22936l = reactInstance;
        MemoryPressureListener memoryPressureListenerH0 = h0(reactInstance);
        this.f22943s = memoryPressureListenerH0;
        this.f22932h.a(memoryPressureListenerH0);
        reactInstance.t();
        t1("getOrCreateReactInstanceTask()", "Loading JS Bundle");
        reactInstance.y(jSBundleLoader);
        t1("getOrCreateReactInstanceTask()", "Calling DevSupportManagerBase.onNewReactContextCreated(reactContext)");
        eVarI.p(bVarV0);
        bVarV0.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.runtime.i0
            @Override // java.lang.Runnable
            public final void run() {
                ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_END, 1);
            }
        });
        return new c(reactInstance, bVarV0, this.f22950z != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ReactInstance a1(ko.c cVar) {
        ReactInstance reactInstance = ((c) cVar.o()).f22956a;
        ReactContext reactContext = ((c) cVar.o()).f22957b;
        boolean z11 = ((c) cVar.o()).f22958c;
        boolean z12 = this.f22941q.a() == LifecycleState.RESUMED;
        if (!z11 || z12) {
            this.f22941q.e(reactContext, k0());
        } else {
            this.f22941q.d(reactContext, k0());
        }
        t1("getOrCreateReactInstanceTask()", "Executing ReactInstanceEventListeners");
        for (com.facebook.react.b0 b0Var : this.f22945u) {
            if (b0Var != null) {
                b0Var.onReactContextInitialized(reactContext);
            }
        }
        return reactInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c b1() {
        t1("getOrCreateReactInstanceTask()", "Start");
        gn.a.b(!this.f22948x, "Cannot start a new ReactInstance on an invalidated ReactHost");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_START, 1);
        ko.c<TContinuationResult> cVarU = p0().u(new ko.a() { // from class: com.facebook.react.runtime.b0
            @Override // ko.a
            public final Object a(ko.c cVar) {
                return this.f22986a.Z0(cVar);
            }
        }, this.f22929e);
        cVarU.u(new ko.a() { // from class: com.facebook.react.runtime.d0
            @Override // ko.a
            public final Object a(ko.c cVar) {
                return this.f22996a.a1(cVar);
            }
        }, this.f22930f);
        return cVarU.u(new ko.a() { // from class: com.facebook.react.runtime.e0
            @Override // ko.a
            public final Object a(ko.c cVar) {
                return ((ReactHostImpl.c) cVar.o()).f22956a;
            }
        }, ko.c.f86377i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c c1(e eVar, String str, ko.c cVar) {
        t1("getOrCreateReloadTask()", "Starting React Native reload");
        ReactInstance reactInstanceA = eVar.a(cVar, "1: Starting reload");
        F1(reactInstanceA);
        com.facebook.react.runtime.b bVarC = this.f22937m.c();
        if (bVarC == null) {
            x1("getOrCreateReloadTask()", "ReactContext is null. Reload reason: " + str);
        }
        if (bVarC != null && this.f22941q.a() == LifecycleState.RESUMED) {
            t1("getOrCreateReloadTask()", "Calling ReactContext.onHostPause()");
            bVarC.onHostPause();
        }
        return ko.c.m(reactInstanceA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c d1(e eVar, ko.c cVar) {
        ReactInstance reactInstanceA = eVar.a(cVar, "2: Surface shutdown");
        if (reactInstanceA == null) {
            x1("getOrCreateReloadTask()", "Skipping surface shutdown: ReactInstance null");
            return cVar;
        }
        D1("getOrCreateReloadTask()", reactInstanceA);
        return cVar;
    }

    private ko.c<Void> e0(String str, final d dVar, Executor executor) {
        final String str2 = "callAfterGetOrCreateReactInstance(" + str + ")";
        if (executor == null) {
            executor = ko.c.f86377i;
        }
        return x0().u(new ko.a() { // from class: com.facebook.react.runtime.t0
            @Override // ko.a
            public final Object a(ko.c cVar) {
                return this.f23068a.J0(str2, dVar, cVar);
            }
        }, executor).h(new ko.a() { // from class: com.facebook.react.runtime.u0
            @Override // ko.a
            public final Object a(ko.c cVar) {
                return this.f23073a.K0(cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c e1(e eVar, ko.c cVar) {
        eVar.a(cVar, "3: Destroying ReactContext");
        Iterator<wn0.a<jn0.h0>> it = this.f22946v.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        if (this.f22943s != null) {
            t1("getOrCreateReloadTask()", "Removing memory pressure listener");
            this.f22932h.d(this.f22943s);
        }
        com.facebook.react.runtime.b bVarC = this.f22937m.c();
        if (bVarC != null) {
            t1("getOrCreateReloadTask()", "Resetting ReactContext ref");
            this.f22937m.e();
            t1("getOrCreateReloadTask()", "Destroying ReactContext");
            bVarC.destroy();
        }
        if (this.f22934j && bVarC != null) {
            t1("getOrCreateReloadTask()", "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)");
            this.f22928d.s(bVarC);
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c f1(e eVar, ko.c cVar) {
        ReactInstance reactInstanceA = eVar.a(cVar, "4: Destroying ReactInstance");
        if (reactInstanceA == null) {
            x1("getOrCreateReloadTask()", "Skipping ReactInstance.destroy(): ReactInstance null");
        } else {
            t1("getOrCreateReloadTask()", "Resetting ReactInstance ptr");
            this.f22936l = null;
            t1("getOrCreateReloadTask()", "Destroying ReactInstance");
            reactInstanceA.j();
        }
        t1("getOrCreateReloadTask()", "Resetting start task ref");
        this.f22949y = null;
        return y0();
    }

    private ko.c<Boolean> g0(String str, final d dVar, Executor executor) {
        final String str2 = "callWithExistingReactInstance(" + str + ")";
        if (executor == null) {
            executor = ko.c.f86377i;
        }
        return this.f22935k.a().u(new ko.a() { // from class: com.facebook.react.runtime.w0
            @Override // ko.a
            public final Object a(ko.c cVar) {
                return this.f23082a.L0(str2, dVar, cVar);
            }
        }, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c g1(e eVar, ko.c cVar) {
        ReactInstance reactInstanceA = eVar.a(cVar, "5: Restarting surfaces");
        if (reactInstanceA == null) {
            x1("getOrCreateReloadTask()", "Skipping surface restart: ReactInstance null");
            return cVar;
        }
        B1("getOrCreateReloadTask()", reactInstanceA);
        return cVar;
    }

    @in.a
    private Map<String, String> getHostMetadata() {
        return com.facebook.react.modules.systeminfo.a.e(this.f22925a);
    }

    private MemoryPressureListener h0(ReactInstance reactInstance) {
        final WeakReference weakReference = new WeakReference(reactInstance);
        return new MemoryPressureListener() { // from class: com.facebook.react.runtime.k0
            @Override // com.facebook.react.bridge.MemoryPressureListener
            public final void handleMemoryPressure(int i11) {
                this.f23027a.M0(weakReference, i11);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c h1(String str, ko.c cVar) {
        if (cVar.s()) {
            y1("getOrCreateReloadTask()", "Error during reload. ReactInstance task faulted. Fault reason: " + cVar.n().getMessage() + ". Reload reason: " + str, cVar.n());
        }
        if (cVar.q()) {
            x1("getOrCreateReloadTask()", "Error during reload. ReactInstance task cancelled. Reload reason: " + str);
        }
        t1("getOrCreateReloadTask()", "Resetting reload task ref");
        this.f22950z = null;
        return cVar;
    }

    private e i0(final String str, final String str2, final String str3) {
        return new e() { // from class: com.facebook.react.runtime.z
            @Override // com.facebook.react.runtime.ReactHostImpl.e
            public final ReactInstance a(ko.c cVar, String str4) {
                return this.f23089a.N0(str, str3, str2, cVar, str4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c i1(final ko.c cVar) {
        if (!cVar.s()) {
            return cVar.t();
        }
        Exception excN = cVar.n();
        if (this.f22934j) {
            this.f22928d.handleException(excN);
        } else {
            this.f22926b.handleInstanceException(excN);
        }
        return u0("getOrCreateStartTask() failure: " + cVar.n().getMessage(), cVar.n()).j(new ko.a() { // from class: com.facebook.react.runtime.y
            @Override // ko.a
            public final Object a(ko.c cVar2) {
                return ko.c.l(cVar.n());
            }
        }).t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j1(ko.d dVar, boolean z11) {
        t1("isMetroRunning()", "Async result = " + z11);
        dVar.d(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k1(String str, int i11, String str2, Callback callback, ReactInstance reactInstance) {
        t1(str, "Execute");
        reactInstance.A(i11, str2);
        ((Callback) gn.a.c(callback)).invoke(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c l1(String str, ko.c cVar) {
        return z0(str);
    }

    @in.a
    private void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        on.a.a(str, inspectorNetworkRequestListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c m1(ko.c cVar) {
        if (!cVar.s()) {
            return cVar;
        }
        Exception excN = cVar.n();
        if (this.f22934j) {
            this.f22928d.handleException(excN);
        } else {
            this.f22926b.handleInstanceException(excN);
        }
        return u0("Reload failed", excN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c n1(final String str) {
        ko.c<Void> cVarT;
        if (this.A != null) {
            t1("reload()", "Waiting for destroy to finish, before reloading React Native.");
            cVarT = this.A.k(new ko.a() { // from class: com.facebook.react.runtime.h
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23012a.l1(str, cVar);
                }
            }, this.f22929e).t();
        } else {
            cVarT = z0(str).t();
        }
        return cVarT.k(new ko.a() { // from class: com.facebook.react.runtime.i
            @Override // ko.a
            public final Object a(ko.c cVar) {
                return this.f23023a.m1(cVar);
            }
        }, this.f22929e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o1(String str, g1 g1Var, ReactInstance reactInstance) {
        t1(str, "Execute");
        reactInstance.B(g1Var);
    }

    private ko.c<JSBundleLoader> p0() {
        s1("getJSBundleLoader()");
        if (this.f22934j && this.f22933i) {
            return H0().v(new ko.a() { // from class: com.facebook.react.runtime.f0
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23003a.R0(cVar);
                }
            }, this.f22929e);
        }
        if (ln.a.DEBUG) {
            qk.a.b("ReactHost", "Packager server access is disabled in this environment");
        }
        return ko.c.c(new Callable() { // from class: com.facebook.react.runtime.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23007a.S0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p1(String str, g1 g1Var, ReactInstance reactInstance) {
        t1(str, "Execute");
        reactInstance.C(g1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ko.c q1(int i11, int i12, ko.c cVar) {
        return H1(i11 + 1, i12);
    }

    private ko.c<JSBundleLoader> r1() {
        s1("loadJSBundleFromMetro()");
        ko.d dVar = new ko.d();
        com.facebook.react.devsupport.c0 c0Var = (com.facebook.react.devsupport.c0) i();
        String strQ = c0Var.e0().q((String) gn.a.c(c0Var.f0()));
        c0Var.C0(strQ, new b(strQ, c0Var, dVar));
        return dVar.a();
    }

    public static /* synthetic */ void s(WeakReference weakReference, int i11) {
        ReactInstance reactInstance = (ReactInstance) weakReference.get();
        if (reactInstance != null) {
            reactInstance.r(i11);
        }
    }

    private void s1(String str) {
        this.f22940p.a("ReactHost{" + this.f22942r + "}." + str);
    }

    @in.a
    private void setPausedInDebuggerMessage(String str) {
        if (str == null) {
            this.f22928d.f();
        } else {
            this.f22928d.a(str, new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t1(String str, String str2) {
        this.f22940p.a("ReactHost{" + this.f22942r + "}." + str + ": " + str2);
    }

    private ko.c<Void> u0(final String str, Exception exc) {
        s1("getOrCreateDestroyTask()");
        y1("getOrCreateDestroyTask()", str, exc);
        final e eVarI0 = i0("Destroy", "getOrCreateDestroyTask()", str);
        if (this.A == null) {
            t1("getOrCreateDestroyTask()", "Resetting createReactInstance task ref");
            this.A = this.f22935k.b().k(new ko.a() { // from class: com.facebook.react.runtime.t
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23065a.T0(eVarI0, str, cVar);
                }
            }, this.f22930f).k(new ko.a() { // from class: com.facebook.react.runtime.u
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23071a.U0(eVarI0, cVar);
                }
            }, this.f22929e).k(new ko.a() { // from class: com.facebook.react.runtime.v
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23074a.V0(eVarI0, str, cVar);
                }
            }, this.f22930f).k(new ko.a() { // from class: com.facebook.react.runtime.w
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23080a.W0(eVarI0, cVar);
                }
            }, this.f22929e).h(new ko.a() { // from class: com.facebook.react.runtime.x
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23085a.X0(str, cVar);
                }
            });
        }
        return this.A;
    }

    private void u1(boolean z11) {
        if (this.f22934j) {
            this.f22928d.m(z11);
        }
    }

    private com.facebook.react.runtime.b v0() {
        return this.f22937m.d(new com.facebook.react.runtime.a.InterfaceC0454a() { // from class: com.facebook.react.runtime.j0
            @Override // com.facebook.react.runtime.a.InterfaceC0454a
            public final Object get() {
                return this.f23025a.Y0();
            }
        });
    }

    private void v1(ReactContext reactContext) {
        this.f22941q.b(reactContext);
        A1(null);
    }

    private ReactHostInspectorTarget w0() {
        if (this.f22947w == null && InspectorFlags.getFuseboxEnabled()) {
            this.f22947w = new ReactHostInspectorTarget(this);
        }
        return this.f22947w;
    }

    private ko.c<ReactInstance> x0() {
        return ko.c.d(new Callable() { // from class: com.facebook.react.runtime.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23026a.G1();
            }
        }, this.f22929e).j(new r());
    }

    private void x1(String str, String str2) {
        y1(str, str2, null);
    }

    private ko.c<ReactInstance> y0() {
        s1("getOrCreateReactInstanceTask()");
        return this.f22935k.d(new com.facebook.react.runtime.a.InterfaceC0454a() { // from class: com.facebook.react.runtime.a0
            @Override // com.facebook.react.runtime.a.InterfaceC0454a
            public final Object get() {
                return this.f22979a.b1();
            }
        });
    }

    private void y1(String str, String str2, Throwable th2) {
        String str3 = "raiseSoftException(" + str + ")";
        t1(str3, str2);
        ReactSoftExceptionLogger.logSoftException("ReactHost", new ReactNoCrashSoftException(str3 + ": " + str2, th2));
    }

    private ko.c<ReactInstance> z0(final String str) {
        s1("getOrCreateReloadTask()");
        x1("getOrCreateReloadTask()", str);
        final e eVarI0 = i0("Reload", "getOrCreateReloadTask()", str);
        if (this.f22950z == null) {
            t1("getOrCreateReloadTask()", "Resetting createReactInstance task ref");
            this.f22950z = this.f22935k.b().k(new ko.a() { // from class: com.facebook.react.runtime.m
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23034a.c1(eVarI0, str, cVar);
                }
            }, this.f22930f).k(new ko.a() { // from class: com.facebook.react.runtime.n
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23038a.d1(eVarI0, cVar);
                }
            }, this.f22929e).k(new ko.a() { // from class: com.facebook.react.runtime.o
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23043a.e1(eVarI0, cVar);
                }
            }, this.f22930f).k(new ko.a() { // from class: com.facebook.react.runtime.p
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23047a.f1(eVarI0, cVar);
                }
            }, this.f22929e).k(new ko.a() { // from class: com.facebook.react.runtime.q
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23054a.g1(eVarI0, cVar);
                }
            }, this.f22929e).k(new ko.a() { // from class: com.facebook.react.runtime.s
                @Override // ko.a
                public final Object a(ko.c cVar) {
                    return this.f23062a.h1(str, cVar);
                }
            }, this.f22929e);
        }
        return this.f22950z;
    }

    public ReactQueueConfiguration B0() {
        ReactInstance reactInstance = this.f22936l;
        if (reactInstance != null) {
            return reactInstance.p();
        }
        return null;
    }

    RuntimeExecutor C0() {
        ReactInstance reactInstance = this.f22936l;
        if (reactInstance != null) {
            return reactInstance.getBufferedRuntimeExecutor();
        }
        x1("getRuntimeExecutor()", "Tried to get runtime executor while instance is not ready");
        return null;
    }

    qn.a<Void> C1(final g1 g1Var) {
        final String str = "startSurface(surfaceId = " + g1Var.m() + ")";
        t1(str, "Schedule");
        d0(g1Var);
        return e0(str, new d() { // from class: com.facebook.react.runtime.c0
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                this.f22990a.o1(str, g1Var, reactInstance);
            }
        }, this.f22929e);
    }

    FabricUIManager D0() {
        ReactInstance reactInstance = this.f22936l;
        if (reactInstance == null) {
            return null;
        }
        return reactInstance.q();
    }

    void E0(Exception exc) {
        String str = "handleHostException(message = \"" + exc.getMessage() + "\")";
        s1(str);
        if (this.f22934j) {
            this.f22928d.handleException(exc);
        } else {
            this.f22926b.handleInstanceException(exc);
        }
        n(str, exc);
    }

    qn.a<Void> E1(final g1 g1Var) {
        final String str = "stopSurface(surfaceId = " + g1Var.m() + ")";
        t1(str, "Schedule");
        j0(g1Var);
        return g0(str, new d() { // from class: com.facebook.react.runtime.n0
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                this.f23040a.p1(str, g1Var, reactInstance);
            }
        }, this.f22929e).t();
    }

    <T extends NativeModule> boolean F0(Class<T> cls) {
        ReactInstance reactInstance = this.f22936l;
        if (reactInstance != null) {
            return reactInstance.s(cls);
        }
        return false;
    }

    boolean G0() {
        return this.f22936l != null;
    }

    boolean I0(String str) {
        synchronized (this.f22931g) {
            try {
                Iterator<g1> it = this.f22931g.iterator();
                while (it.hasNext()) {
                    if (it.next().i().equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.react.a0
    public qn.a<Void> a(final String str) {
        return ko.c.d(new Callable() { // from class: com.facebook.react.runtime.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23005a.n1(str);
            }
        }, this.f22929e).j(new r());
    }

    public void c0(com.facebook.react.b0 b0Var) {
        this.f22945u.add(b0Var);
    }

    void d0(g1 g1Var) {
        s1("attachSurface(surfaceId = " + g1Var.m() + ")");
        synchronized (this.f22931g) {
            this.f22931g.add(g1Var);
        }
    }

    ko.c<Boolean> f0(final String str, final String str2, final NativeArray nativeArray) {
        return g0("callFunctionOnModule(\"" + str + "\", \"" + str2 + "\")", new d() { // from class: com.facebook.react.runtime.q0
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                reactInstance.callFunctionOnModule(str, str2, nativeArray);
            }
        }, null);
    }

    @Override // com.facebook.react.a0
    public ReactContext h() {
        return this.f22937m.c();
    }

    @Override // com.facebook.react.a0
    public pn.e i() {
        return (pn.e) gn.a.c(this.f22928d);
    }

    @Override // com.facebook.react.a0
    public void j(Context context) {
        AppearanceModule appearanceModule;
        ReactContext reactContextH = h();
        if (reactContextH == null || (appearanceModule = (AppearanceModule) reactContextH.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(context);
    }

    void j0(g1 g1Var) {
        s1("detachSurface(surfaceId = " + g1Var.m() + ")");
        synchronized (this.f22931g) {
            this.f22931g.remove(g1Var);
        }
    }

    @Override // com.facebook.react.a0
    public void k(Activity activity) {
        s1("onHostDestroy(activity)");
        if (k0() == activity) {
            u1(false);
            v1(h());
        }
    }

    Activity k0() {
        return this.f22938n.get();
    }

    @Override // com.facebook.react.a0
    public void l(Activity activity) {
        s1("onUserLeaveHint(activity)");
        ReactContext reactContextH = h();
        if (reactContextH != null) {
            reactContextH.onUserLeaveHint(activity);
        }
    }

    co.a l0() {
        return new co.a() { // from class: com.facebook.react.runtime.m0
            @Override // co.a
            public final void g() {
                this.f23037a.Q0();
            }
        };
    }

    @Override // com.facebook.react.a0
    public rn.a m(Context context, String str, Bundle bundle) {
        g1 g1Var = new g1(context, str, bundle);
        h1 h1Var = new h1(context, g1Var);
        h1Var.setShouldLogContentAppeared(true);
        g1Var.c(h1Var);
        g1Var.b(this);
        return g1Var;
    }

    EventDispatcher m0() {
        ReactInstance reactInstance = this.f22936l;
        return reactInstance == null ? com.facebook.react.uimanager.events.b.l() : reactInstance.k();
    }

    @Override // com.facebook.react.a0
    public qn.a<Void> n(final String str, final Exception exc) {
        return ko.c.d(new Callable() { // from class: com.facebook.react.runtime.r0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23059a.P0(str, exc);
            }
        }, this.f22929e).j(new r());
    }

    CallInvokerHolder n0() {
        ReactInstance reactInstance = this.f22936l;
        if (reactInstance != null) {
            return reactInstance.getJSCallInvokerHolder();
        }
        x1("getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready");
        return null;
    }

    @Override // com.facebook.react.a0
    public void o(Activity activity) {
        s1("onHostPause(activity)");
        ReactContext reactContextH = h();
        Activity activityK0 = k0();
        if (activityK0 != null) {
            String simpleName = activityK0.getClass().getSimpleName();
            String simpleName2 = activity == null ? Address.ADDRESS_NULL_PLACEHOLDER : activity.getClass().getSimpleName();
            gn.a.b(activity == activityK0, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + simpleName + " Paused activity: " + simpleName2);
        }
        u1(false);
        this.f22944t = null;
        this.f22941q.c(reactContextH, activityK0);
    }

    JavaScriptContextHolder o0() {
        ReactInstance reactInstance = this.f22936l;
        if (reactInstance != null) {
            return reactInstance.l();
        }
        return null;
    }

    @Override // com.facebook.react.a0
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        String str = "onActivityResult(activity = \"" + activity + "\", requestCode = \"" + i11 + "\", resultCode = \"" + i12 + "\", data = \"" + intent + "\")";
        ReactContext reactContextH = h();
        if (reactContextH != null) {
            reactContextH.onActivityResult(activity, i11, i12, intent);
        } else {
            x1(str, "Tried to access onActivityResult while context is not ready");
        }
    }

    @Override // com.facebook.react.a0
    public boolean onBackPressed() {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactInstance reactInstance = this.f22936l;
        if (reactInstance == null || (deviceEventManagerModule = (DeviceEventManagerModule) reactInstance.m(DeviceEventManagerModule.class)) == null) {
            return false;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    @Override // com.facebook.react.a0
    public void onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        String str = "onNewIntent(intent = \"" + intent + "\")";
        ReactContext reactContextH = h();
        if (reactContextH == null) {
            x1(str, "Tried to access onNewIntent while context is not ready");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) reactContextH.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        reactContextH.onNewIntent(k0(), intent);
    }

    @Override // com.facebook.react.a0
    public void onWindowFocusChange(boolean z11) {
        String str = "onWindowFocusChange(hasFocus = \"" + z11 + "\")";
        ReactContext reactContextH = h();
        if (reactContextH != null) {
            reactContextH.onWindowFocusChange(z11);
        } else {
            x1(str, "Tried to access onWindowFocusChange while context is not ready");
        }
    }

    @Override // com.facebook.react.a0
    public LifecycleState p() {
        return this.f22941q.a();
    }

    @Override // com.facebook.react.a0
    public void q(Activity activity, co.a aVar) {
        this.f22944t = aVar;
        w1(activity);
    }

    Activity q0() {
        WeakReference<Activity> weakReference = this.f22939o.get();
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    <T extends NativeModule> T r0(Class<T> cls) {
        if (cls == UIManagerModule.class) {
            ReactSoftExceptionLogger.logSoftExceptionVerbose("ReactHost", new ReactNoCrashBridgeNotAllowedSoftException("getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"));
        }
        ReactInstance reactInstance = this.f22936l;
        if (reactInstance != null) {
            return (T) reactInstance.m(cls);
        }
        return null;
    }

    NativeModule s0(String str) {
        ReactInstance reactInstance = this.f22936l;
        if (reactInstance != null) {
            return reactInstance.n(str);
        }
        return null;
    }

    @Override // com.facebook.react.a0
    public qn.a<Void> start() {
        return ko.c.d(new Callable() { // from class: com.facebook.react.runtime.s0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23064a.A0();
            }
        }, this.f22929e).j(new r());
    }

    Collection<NativeModule> t0() {
        ReactInstance reactInstance = this.f22936l;
        return reactInstance != null ? reactInstance.o() : new ArrayList();
    }

    public void w1(Activity activity) {
        s1("onHostResume(activity)");
        A1(activity);
        ReactContext reactContextH = h();
        u1(true);
        this.f22941q.d(reactContextH, k0());
    }

    ko.c<Boolean> z1(final int i11, final String str, final Callback callback) {
        final String str2 = "registerSegment(segmentId = \"" + i11 + "\", path = \"" + str + "\")";
        t1(str2, "Schedule");
        return g0(str2, new d() { // from class: com.facebook.react.runtime.p0
            @Override // com.facebook.react.runtime.ReactHostImpl.d
            public final void a(ReactInstance reactInstance) {
                this.f23049a.k1(str2, i11, str, callback, reactInstance);
            }
        }, null);
    }

    public ReactHostImpl(Context context, f fVar, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z11, boolean z12) {
        this(context, fVar, componentFactory, executor, executor2, z11, z12, null);
    }

    public ReactHostImpl(Context context, f fVar, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z11, boolean z12, com.facebook.react.devsupport.f0 f0Var) {
        this.f22931g = new HashSet();
        this.f22935k = new com.facebook.react.runtime.a<>(ko.c.m(null));
        this.f22937m = new com.facebook.react.runtime.a<>();
        this.f22938n = new AtomicReference<>();
        this.f22939o = new AtomicReference<>(new WeakReference(null));
        com.facebook.react.runtime.c cVar = new com.facebook.react.runtime.c(ln.a.DEBUG);
        this.f22940p = cVar;
        this.f22941q = new e1(cVar);
        this.f22942r = B.getAndIncrement();
        this.f22945u = new CopyOnWriteArrayList();
        this.f22946v = new CopyOnWriteArrayList();
        this.f22948x = false;
        this.f22949y = null;
        this.f22950z = null;
        this.A = null;
        this.f22925a = context;
        this.f22926b = fVar;
        this.f22927c = componentFactory;
        this.f22929e = executor;
        this.f22930f = executor2;
        this.f22932h = new com.facebook.react.h(context);
        this.f22933i = z11;
        this.f22934j = z12;
        this.f22928d = (f0Var == null ? new com.facebook.react.devsupport.i() : f0Var).a(context.getApplicationContext(), new y0(this), fVar.getJsMainModulePath(), true, null, null, 2, null, null, null, null, z12);
    }
}
