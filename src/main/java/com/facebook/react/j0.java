package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.b1;
import com.facebook.soloader.SoLoader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class j0 {
    private static final String E = "j0";
    private final v0.a A;
    private List<ViewManager> B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile LifecycleState f22608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f22609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Thread f22610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JavaScriptExecutorFactory f22611e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSBundleLoader f22613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<p0> f22615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final pn.e f22616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f22617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f22618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f22619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final NotThreadSafeBridgeIdleDebugListener f22620n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile ReactContext f22622p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f22623q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private co.a f22624r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Activity f22625s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ReactInstanceManagerInspectorTarget f22626t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final h f22630x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final JSExceptionHandler f22631y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final UIManagerProvider f22632z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<com.facebook.react.uimanager.g0> f22607a = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Collection<String> f22612f = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f22621o = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Collection<b0> f22627u = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile boolean f22628v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile Boolean f22629w = Boolean.FALSE;
    private boolean C = true;
    private volatile boolean D = false;

    class a implements co.a {
        a() {
        }

        @Override // co.a
        public void g() {
            j0.this.P();
        }
    }

    class b implements com.facebook.react.devsupport.z0 {
        b() {
        }

        @Override // com.facebook.react.devsupport.z0
        public void a(String str) {
        }

        @Override // com.facebook.react.devsupport.z0
        public View b(String str) {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                return null;
            }
            x0 x0Var = new x0(currentActivity);
            x0Var.setIsFabric(tn.b.f());
            x0Var.u(j0.this, str, new Bundle());
            return x0Var;
        }

        @Override // com.facebook.react.devsupport.z0
        public void e(View view) {
            if (view instanceof x0) {
                ((x0) view).v();
            }
        }

        @Override // com.facebook.react.devsupport.z0
        public void g() {
            j0.this.y0();
        }

        @Override // com.facebook.react.devsupport.z0
        public Activity getCurrentActivity() {
            return j0.this.f22625s;
        }

        @Override // com.facebook.react.devsupport.z0
        public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
            return j0.this.G();
        }
    }

    class c implements pn.h {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(boolean z11) {
            if (j0.this.D) {
                return;
            }
            if (z11) {
                j0.this.f22616j.C();
            } else if (!j0.this.f22616j.D() || j0.this.C) {
                j0.this.q0();
            } else {
                j0.this.i0();
            }
        }

        @Override // pn.h
        public void a(final boolean z11) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22647a.c(z11);
                }
            });
        }
    }

    class d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f22636a;

        d(View view) {
            this.f22636a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f22636a.removeOnAttachStateChangeListener(this);
            j0.this.f22616j.m(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e implements ReactInstanceManagerInspectorTarget.TargetDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<j0> f22638a;

        class a implements pn.e.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0 f22639a;

            a(j0 j0Var) {
                this.f22639a = j0Var;
            }

            @Override // pn.e.a
            public void onResume() {
                UiThreadUtil.assertOnUiThread();
                if (this.f22639a.f22626t != null) {
                    this.f22639a.f22626t.sendDebuggerResumeCommand();
                }
            }
        }

        public e(j0 j0Var) {
            this.f22638a = new WeakReference<>(j0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            j0 j0Var = this.f22638a.get();
            if (j0Var != null) {
                j0Var.f22616j.C();
            }
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public Map<String, String> getMetadata() {
            j0 j0Var = this.f22638a.get();
            return com.facebook.react.modules.systeminfo.a.e(j0Var != null ? j0Var.f22623q : null);
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void loadNetworkResource(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
            on.a.a(str, inspectorNetworkRequestListener);
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void onReload() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22650a.b();
                }
            });
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void onSetPausedInDebuggerMessage(String str) {
            j0 j0Var = this.f22638a.get();
            if (j0Var == null) {
                return;
            }
            if (str == null) {
                j0Var.f22616j.f();
            } else {
                j0Var.f22616j.a(str, new a(j0Var));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JavaScriptExecutorFactory f22641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSBundleLoader f22642b;

        public f(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.f22641a = (JavaScriptExecutorFactory) gn.a.c(javaScriptExecutorFactory);
            this.f22642b = (JSBundleLoader) gn.a.c(jSBundleLoader);
        }

        public JSBundleLoader a() {
            return this.f22642b;
        }

        public JavaScriptExecutorFactory b() {
            return this.f22641a;
        }
    }

    j0(Context context, Activity activity, co.a aVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List<p0> list, boolean z11, com.facebook.react.devsupport.f0 f0Var, boolean z12, boolean z13, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, JSExceptionHandler jSExceptionHandler, pn.j jVar, boolean z14, pn.b bVar, int i11, int i12, UIManagerProvider uIManagerProvider, Map<String, jo.f> map, v0.a aVar2, jn.i iVar, pn.c cVar, sn.b bVar2, pn.i iVar2) {
        qk.a.b(E, "ReactInstanceManager.ctor()");
        N(context);
        com.facebook.react.uimanager.d.g(context);
        this.f22623q = context;
        this.f22625s = activity;
        this.f22624r = aVar;
        this.f22611e = javaScriptExecutorFactory;
        this.f22613g = jSBundleLoader;
        this.f22614h = str;
        ArrayList arrayList = new ArrayList();
        this.f22615i = arrayList;
        this.f22617k = z11;
        this.f22618l = z12;
        this.f22619m = z13;
        ep.a.c(0L, "ReactInstanceManager.initDevSupportManager");
        pn.e eVarB = f0Var.b(context, x(), str, z11, jVar, bVar, i11, map, iVar, cVar, iVar2);
        this.f22616j = eVarB;
        ep.a.i(0L);
        this.f22620n = notThreadSafeBridgeIdleDebugListener;
        this.f22608b = lifecycleState;
        this.f22630x = new h(context);
        this.f22631y = jSExceptionHandler;
        this.A = aVar2;
        synchronized (arrayList) {
            try {
                al.c.a().b(bl.a.RN_CORE, "RNCore: Use Split Packages");
                arrayList.add(new com.facebook.react.c(this, new a(), z14, i12));
                if (z11) {
                    arrayList.add(new com.facebook.react.e());
                }
                arrayList.addAll(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f22632z = uIManagerProvider;
        com.facebook.react.modules.core.b.i(bVar2 != null ? bVar2 : sn.a.b());
        if (z11) {
            eVarB.z();
        }
        s0();
    }

    private void D(com.facebook.react.uimanager.g0 g0Var, ReactContext reactContext) {
        qk.a.b("ReactNative", "ReactInstanceManager.detachRootViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (g0Var.getState().compareAndSet(1, 0)) {
            int uIManagerType = g0Var.getUIManagerType();
            if (uIManagerType == 2) {
                int rootViewTag = g0Var.getRootViewTag();
                if (rootViewTag != -1) {
                    UIManager uIManagerG = b1.g(reactContext, uIManagerType);
                    if (uIManagerG != null) {
                        uIManagerG.stopSurface(rootViewTag);
                    } else {
                        qk.a.I("ReactNative", "Failed to stop surface, UIManager has already gone away");
                    }
                } else {
                    ReactSoftExceptionLogger.logSoftException(E, new RuntimeException("detachRootViewFromInstance called with ReactRootView with invalid id"));
                }
            } else {
                ((AppRegistry) reactContext.getCatalystInstance().getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(g0Var.getRootViewTag());
            }
            w(g0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JavaScriptExecutorFactory G() {
        return this.f22611e;
    }

    private ReactInstanceManagerInspectorTarget I() {
        if (this.f22626t == null && InspectorFlags.getFuseboxEnabled()) {
            this.f22626t = new ReactInstanceManagerInspectorTarget(new e(this));
        }
        return this.f22626t;
    }

    static void N(Context context) {
        SoLoader.m(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        UiThreadUtil.assertOnUiThread();
        co.a aVar = this.f22624r;
        if (aVar != null) {
            aVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        f fVar = this.f22609c;
        if (fVar != null) {
            u0(fVar);
            this.f22609c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(ReactApplicationContext reactApplicationContext) {
        try {
            v0(reactApplicationContext);
        } catch (Exception e11) {
            this.f22616j.handleException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(f fVar) {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
        synchronized (this.f22629w) {
            while (this.f22629w.booleanValue()) {
                try {
                    this.f22629w.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        this.f22628v = true;
        try {
            Process.setThreadPriority(-4);
            ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
            final ReactApplicationContext reactApplicationContextY = y(fVar.b().create(), fVar.a());
            try {
                this.f22610d = null;
                ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                Runnable runnable = new Runnable() { // from class: com.facebook.react.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22589a.Q();
                    }
                };
                reactApplicationContextY.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22590a.R(reactApplicationContextY);
                    }
                });
                UiThreadUtil.runOnUiThread(runnable);
            } catch (Exception e11) {
                this.f22616j.handleException(e11);
            }
        } catch (Exception e12) {
            this.f22628v = false;
            this.f22610d = null;
            this.f22616j.handleException(e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(b0[] b0VarArr, ReactApplicationContext reactApplicationContext) {
        V();
        for (b0 b0Var : b0VarArr) {
            if (b0Var != null) {
                b0Var.onReactContextInitialized(reactApplicationContext);
            }
        }
    }

    private void U() {
        qk.a.g(E, "ReactInstanceManager.destroy called", new RuntimeException("ReactInstanceManager.destroy called"));
    }

    private synchronized void V() {
        if (this.f22608b == LifecycleState.RESUMED) {
            Y(true);
        }
    }

    private synchronized void W() {
        try {
            ReactContext reactContextE = E();
            if (reactContextE != null) {
                if (this.f22608b == LifecycleState.RESUMED) {
                    reactContextE.onHostPause();
                    this.f22608b = LifecycleState.BEFORE_RESUME;
                }
                if (this.f22608b == LifecycleState.BEFORE_RESUME) {
                    reactContextE.onHostDestroy(this.f22619m);
                }
            }
            this.f22608b = LifecycleState.BEFORE_CREATE;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void X() {
        try {
            ReactContext reactContextE = E();
            if (reactContextE != null) {
                if (this.f22608b == LifecycleState.BEFORE_CREATE) {
                    reactContextE.onHostResume(this.f22625s);
                    reactContextE.onHostPause();
                } else if (this.f22608b == LifecycleState.RESUMED) {
                    reactContextE.onHostPause();
                }
            }
            this.f22608b = LifecycleState.BEFORE_RESUME;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void Y(boolean z11) {
        try {
            ReactContext reactContextE = E();
            if (reactContextE != null && (z11 || this.f22608b == LifecycleState.BEFORE_RESUME || this.f22608b == LifecycleState.BEFORE_CREATE)) {
                reactContextE.onHostResume(this.f22625s);
            }
            this.f22608b = LifecycleState.RESUMED;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ void e(int i11, com.facebook.react.uimanager.g0 g0Var) {
        ep.a.g(0L, "pre_rootView.onAttachedToReactInstance", i11);
        g0Var.b(101);
    }

    public static /* synthetic */ void g() {
        Process.setThreadPriority(0);
        ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        qk.a.b("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        p0(this.f22611e, JSBundleLoader.createCachedBundleFromNetworkLoader(this.f22616j.y(), this.f22616j.j()));
    }

    private void m0(p0 p0Var, i iVar) {
        ep.b.a(0L, "processPackage").b("className", p0Var.getClass().getSimpleName()).c();
        boolean z11 = p0Var instanceof r0;
        if (z11) {
            ((r0) p0Var).b();
        }
        iVar.b(p0Var);
        if (z11) {
            ((r0) p0Var).a();
        }
        ep.b.b(0L).c();
    }

    private NativeModuleRegistry n0(ReactApplicationContext reactApplicationContext, List<p0> list) {
        i iVar = new i(reactApplicationContext);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f22615i) {
            try {
                Iterator<p0> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        p0 next = it.next();
                        ep.a.c(0L, "createAndProcessCustomReactPackage");
                        try {
                            m0(next, iVar);
                            ep.a.i(0L);
                        } catch (Throwable th2) {
                            ep.a.i(0L);
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        ep.a.c(0L, "buildNativeModuleRegistry");
        try {
            return iVar.a();
        } finally {
            ep.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    private void p0(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        qk.a.b("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        f fVar = new f(javaScriptExecutorFactory, jSBundleLoader);
        if (this.f22610d == null) {
            u0(fVar);
        } else {
            this.f22609c = fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        qk.a.b(E, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        al.c.a().b(bl.a.RN_CORE, "RNCore: load from BundleLoader");
        p0(this.f22611e, this.f22613g);
    }

    private void r0() {
        qk.a.b(E, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        al.c.a().b(bl.a.RN_CORE, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.f22617k && this.f22614h != null) {
            this.f22616j.getDevSettings();
            if (!ep.a.j(0L)) {
                if (this.f22613g == null) {
                    this.f22616j.C();
                    return;
                } else {
                    this.f22616j.B(new c());
                    return;
                }
            }
        }
        q0();
    }

    private void s0() {
        Method method;
        try {
            method = j0.class.getMethod("L", Exception.class);
        } catch (NoSuchMethodException e11) {
            qk.a.n("ReactInstanceHolder", "Failed to set cxx error handler function", e11);
            method = null;
        }
        ReactCxxErrorHandler.setHandleErrorFunc(this, method);
    }

    private void u(final com.facebook.react.uimanager.g0 g0Var) {
        final int iAddRootView;
        qk.a.b("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        if (g0Var.getState().compareAndSet(0, 1)) {
            ep.a.c(0L, "attachRootViewToInstance");
            UIManager uIManagerG = b1.g(this.f22622p, g0Var.getUIManagerType());
            if (uIManagerG == null) {
                throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
            }
            Bundle appProperties = g0Var.getAppProperties();
            if (g0Var.getUIManagerType() == 2) {
                iAddRootView = uIManagerG.startSurface(g0Var.getRootViewGroup(), g0Var.getJSModuleName(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), g0Var.getWidthMeasureSpec(), g0Var.getHeightMeasureSpec());
                g0Var.setShouldLogContentAppeared(true);
            } else {
                iAddRootView = uIManagerG.addRootView(g0Var.getRootViewGroup(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties));
                g0Var.setRootViewTag(iAddRootView);
                g0Var.c();
            }
            ep.a.a(0L, "pre_rootView.onAttachedToReactInstance", iAddRootView);
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.c0
                @Override // java.lang.Runnable
                public final void run() {
                    j0.e(iAddRootView, g0Var);
                }
            });
            ep.a.i(0L);
        }
    }

    private void u0(final f fVar) {
        qk.a.b("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        gn.a.b(!this.D, "Cannot create a new React context on an invalidated ReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.f22607a) {
            synchronized (this.f22621o) {
                try {
                    if (this.f22622p != null) {
                        x0(this.f22622p);
                        this.f22622p = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f22610d = new Thread(null, new Runnable() { // from class: com.facebook.react.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f22353a.S(fVar);
            }
        }, "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f22610d.start();
    }

    public static m0 v() {
        return new m0();
    }

    private void v0(final ReactApplicationContext reactApplicationContext) {
        qk.a.b("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        ep.a.c(0L, "setupReactContext");
        synchronized (this.f22607a) {
            try {
                synchronized (this.f22621o) {
                    this.f22622p = (ReactContext) gn.a.c(reactApplicationContext);
                }
                CatalystInstance catalystInstance = (CatalystInstance) gn.a.c(reactApplicationContext.getCatalystInstance());
                catalystInstance.initialize();
                this.f22616j.p(reactApplicationContext);
                this.f22630x.a(catalystInstance);
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
                Iterator<com.facebook.react.uimanager.g0> it = this.f22607a.iterator();
                while (it.hasNext()) {
                    u(it.next());
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final b0[] b0VarArr = (b0[]) this.f22627u.toArray(new b0[this.f22627u.size()]);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f22596a.T(b0VarArr, reactApplicationContext);
            }
        });
        reactApplicationContext.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.h0
            @Override // java.lang.Runnable
            public final void run() {
                j0.g();
            }
        });
        reactApplicationContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.i0
            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(0);
            }
        });
        ep.a.i(0L);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
    }

    private void w(com.facebook.react.uimanager.g0 g0Var) {
        UiThreadUtil.assertOnUiThread();
        g0Var.getState().compareAndSet(1, 0);
        ViewGroup rootViewGroup = g0Var.getRootViewGroup();
        rootViewGroup.removeAllViews();
        rootViewGroup.setId(-1);
    }

    private com.facebook.react.devsupport.z0 x() {
        return new b();
    }

    private void x0(ReactContext reactContext) {
        qk.a.b("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f22608b == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.f22607a) {
            try {
                Iterator<com.facebook.react.uimanager.g0> it = this.f22607a.iterator();
                while (it.hasNext()) {
                    D(it.next(), reactContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f22630x.d(reactContext.getCatalystInstance());
        reactContext.destroy();
        this.f22616j.s(reactContext);
    }

    private ReactApplicationContext y(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        UIManager uIManagerCreateUIManager;
        v0.a aVar;
        qk.a.b("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        BridgeReactContext bridgeReactContext = new BridgeReactContext(this.f22623q);
        JSExceptionHandler jSExceptionHandler = this.f22631y;
        if (jSExceptionHandler == null) {
            jSExceptionHandler = this.f22616j;
        }
        bridgeReactContext.setJSExceptionHandler(jSExceptionHandler);
        CatalystInstanceImpl.Builder inspectorTarget = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(n0(bridgeReactContext, this.f22615i)).setJSBundleLoader(jSBundleLoader).setJSExceptionHandler(jSExceptionHandler).setInspectorTarget(I());
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        ep.a.c(0L, "createCatalystInstance");
        try {
            CatalystInstanceImpl catalystInstanceImplBuild = inspectorTarget.build();
            ep.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            bridgeReactContext.initializeWithInstance(catalystInstanceImplBuild);
            catalystInstanceImplBuild.getRuntimeScheduler();
            if (tn.b.r() && (aVar = this.A) != null) {
                TurboModuleManager turboModuleManager = new TurboModuleManager(catalystInstanceImplBuild.getRuntimeExecutor(), aVar.c(this.f22615i).d(bridgeReactContext).a(), catalystInstanceImplBuild.getJSCallInvokerHolder(), catalystInstanceImplBuild.getNativeMethodCallInvokerHolder());
                catalystInstanceImplBuild.setTurboModuleRegistry(turboModuleManager);
                Iterator<String> it = turboModuleManager.getEagerInitModuleNames().iterator();
                while (it.hasNext()) {
                    turboModuleManager.getModule(it.next());
                }
            }
            UIManagerProvider uIManagerProvider = this.f22632z;
            if (uIManagerProvider != null && (uIManagerCreateUIManager = uIManagerProvider.createUIManager(bridgeReactContext)) != null) {
                catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
                uIManagerCreateUIManager.initialize();
                catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f22620n;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                catalystInstanceImplBuild.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (ep.a.j(0L)) {
                catalystInstanceImplBuild.setGlobalVariable("__RCTProfileIsProfiling", "true");
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            ep.a.c(0L, "runJSBundle");
            catalystInstanceImplBuild.runJSBundle();
            ep.a.i(0L);
            return bridgeReactContext;
        } catch (Throwable th2) {
            ep.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0() {
        ReactContext reactContextE = E();
        if (reactContextE == null || !reactContextE.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException(E, new ReactNoCrashSoftException("Cannot toggleElementInspector, CatalystInstance not available"));
        } else {
            reactContextE.emitDeviceEvent("toggleElementInspector");
        }
    }

    private void z0() {
        ReactCxxErrorHandler.setHandleErrorFunc(null, null);
    }

    public ViewManager A(String str) {
        ViewManager viewManagerCreateViewManager;
        synchronized (this.f22621o) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) E();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                synchronized (this.f22615i) {
                    try {
                        for (p0 p0Var : this.f22615i) {
                            if ((p0Var instanceof z0) && (viewManagerCreateViewManager = ((z0) p0Var).createViewManager(reactApplicationContext, str)) != null) {
                                return viewManagerCreateViewManager;
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return null;
        }
    }

    public void B() {
        ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget;
        UiThreadUtil.assertOnUiThread();
        al.c.a().b(bl.a.RN_CORE, "RNCore: Destroy");
        U();
        if (this.f22629w.booleanValue()) {
            qk.a.m("ReactNative", "ReactInstanceManager.destroy called: bail out, already destroying");
            return;
        }
        this.f22629w = Boolean.TRUE;
        if (this.f22617k) {
            this.f22616j.m(false);
            this.f22616j.v();
        }
        W();
        this.f22630x.b(this.f22623q);
        z0();
        this.f22610d = null;
        synchronized (this.f22607a) {
            try {
                synchronized (this.f22621o) {
                    try {
                        if (this.f22622p != null) {
                            for (com.facebook.react.uimanager.g0 g0Var : this.f22607a) {
                                if (g0Var.getUIManagerType() == 2) {
                                    D(g0Var, this.f22622p);
                                }
                            }
                            this.f22622p.destroy();
                            this.f22622p = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (this.D && (reactInstanceManagerInspectorTarget = this.f22626t) != null) {
            reactInstanceManagerInspectorTarget.close();
            this.f22626t = null;
        }
        this.f22628v = false;
        if (!this.f22619m) {
            this.f22625s = null;
        }
        yo.c.d().c();
        this.f22629w = Boolean.FALSE;
        synchronized (this.f22629w) {
            this.f22629w.notifyAll();
        }
        synchronized (this.f22615i) {
            this.f22612f = null;
        }
        qk.a.b("ReactNative", "ReactInstanceManager has been destroyed");
    }

    @Deprecated
    public void C(com.facebook.react.uimanager.g0 g0Var) {
        ReactContext reactContext;
        UiThreadUtil.assertOnUiThread();
        if (this.f22607a.remove(g0Var) && (reactContext = this.f22622p) != null && reactContext.hasActiveReactInstance()) {
            D(g0Var, reactContext);
        }
    }

    public ReactContext E() {
        ReactContext reactContext;
        synchronized (this.f22621o) {
            reactContext = this.f22622p;
        }
        return reactContext;
    }

    public pn.e F() {
        return this.f22616j;
    }

    public LifecycleState H() {
        return this.f22608b;
    }

    public List<ViewManager> J(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        ep.a.c(0L, "createAllViewManagers");
        try {
            if (this.B == null) {
                synchronized (this.f22615i) {
                    try {
                        if (this.B == null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<p0> it = this.f22615i.iterator();
                            while (it.hasNext()) {
                                arrayList.addAll(it.next().createViewManagers(reactApplicationContext));
                            }
                            this.B = arrayList;
                            ep.a.i(0L);
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
                            return arrayList;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            List<ViewManager> list = this.B;
            ep.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return list;
        } catch (Throwable th3) {
            ep.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            throw th3;
        }
    }

    public Collection<String> K() {
        Collection<String> collection;
        ep.a.c(0L, "ReactInstanceManager.getViewManagerNames");
        try {
            Collection<String> collection2 = this.f22612f;
            if (collection2 != null) {
                ep.a.i(0L);
                return collection2;
            }
            synchronized (this.f22621o) {
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) E();
                if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                    synchronized (this.f22615i) {
                        try {
                            if (this.f22612f == null) {
                                HashSet hashSet = new HashSet();
                                for (p0 p0Var : this.f22615i) {
                                    ep.b.a(0L, "ReactInstanceManager.getViewManagerName").b("Package", p0Var.getClass().getSimpleName()).c();
                                    if (p0Var instanceof z0) {
                                        Collection<String> viewManagerNames = ((z0) p0Var).getViewManagerNames(reactApplicationContext);
                                        if (viewManagerNames != null) {
                                            hashSet.addAll(viewManagerNames);
                                        }
                                    } else {
                                        qk.a.K("ReactNative", "Package %s is not a ViewManagerOnDemandReactPackage, view managers will not be loaded", p0Var.getClass().getSimpleName());
                                    }
                                    ep.a.i(0L);
                                }
                                this.f22612f = hashSet;
                            }
                            collection = this.f22612f;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    ep.a.i(0L);
                    return collection;
                }
                qk.a.I("ReactNative", "Calling getViewManagerNames without active context");
                List list = Collections.EMPTY_LIST;
                ep.a.i(0L);
                return list;
            }
        } catch (Throwable th3) {
            ep.a.i(0L);
            throw th3;
        }
    }

    public void L(Exception exc) {
        this.f22616j.handleException(exc);
    }

    public boolean M() {
        return this.f22628v;
    }

    public void O() {
        qk.a.b("ReactNative", "ReactInstanceManager.invalidate()");
        this.D = true;
        B();
    }

    public void Z(Activity activity, int i11, int i12, Intent intent) {
        ReactContext reactContextE = E();
        if (reactContextE != null) {
            reactContextE.onActivityResult(activity, i11, i12, intent);
        }
    }

    public void a0() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.f22622p;
        if (reactContext == null) {
            qk.a.I(E, "Instance detached from instance manager");
            P();
        } else {
            DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class);
            if (deviceEventManagerModule != null) {
                deviceEventManagerModule.emitHardwareBackPressed();
            }
        }
    }

    public void b0(Context context, Configuration configuration) {
        AppearanceModule appearanceModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextE = E();
        if (reactContextE == null || (appearanceModule = (AppearanceModule) reactContextE.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(context);
    }

    @Deprecated
    public void c0() {
        UiThreadUtil.assertOnUiThread();
        if (this.f22617k) {
            this.f22616j.m(false);
        }
        W();
        if (this.f22619m) {
            return;
        }
        this.f22625s = null;
    }

    public void d0(Activity activity) {
        if (activity == this.f22625s) {
            c0();
        }
    }

    @Deprecated
    public void e0() {
        UiThreadUtil.assertOnUiThread();
        this.f22624r = null;
        if (this.f22617k) {
            this.f22616j.m(false);
        }
        X();
    }

    public void f0(Activity activity) {
        if (this.f22618l) {
            if (this.f22625s == null) {
                qk.a.m(E, "ReactInstanceManager.onHostPause called with null activity, expected:" + this.f22625s.getClass().getSimpleName());
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int length = stackTrace.length;
                for (int i11 = 0; i11 < length; i11++) {
                    qk.a.m(E, stackTrace[i11].toString());
                }
            }
            gn.a.a(this.f22625s != null);
        }
        Activity activity2 = this.f22625s;
        if (activity2 != null) {
            gn.a.b(activity == activity2, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.f22625s.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        }
        e0();
    }

    public void g0(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.f22625s = activity;
        if (this.f22617k) {
            if (activity != null) {
                View decorView = activity.getWindow().getDecorView();
                if (ViewCompat.S(decorView)) {
                    this.f22616j.m(true);
                } else {
                    decorView.addOnAttachStateChangeListener(new d(decorView));
                }
            } else if (!this.f22618l) {
                this.f22616j.m(true);
            }
        }
        Y(false);
    }

    public void h0(Activity activity, co.a aVar) {
        UiThreadUtil.assertOnUiThread();
        this.f22624r = aVar;
        g0(activity);
    }

    public void j0(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextE = E();
        if (reactContextE == null) {
            qk.a.I(E, "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) reactContextE.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        reactContextE.onNewIntent(this.f22625s, intent);
    }

    public void k0(Activity activity) {
        Activity activity2 = this.f22625s;
        if (activity2 == null || activity != activity2) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextE = E();
        if (reactContextE != null) {
            reactContextE.onUserLeaveHint(activity);
        }
    }

    public void l0(boolean z11) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextE = E();
        if (reactContextE != null) {
            reactContextE.onWindowFocusChange(z11);
        }
    }

    public void o0() {
        gn.a.b(this.f22628v, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
        r0();
    }

    public void s(b0 b0Var) {
        this.f22627u.add(b0Var);
    }

    @Deprecated
    public void t(com.facebook.react.uimanager.g0 g0Var) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f22607a) {
            try {
                if (this.f22607a.add(g0Var)) {
                    w(g0Var);
                } else {
                    qk.a.m("ReactNative", "ReactRoot was attached multiple times");
                }
                ReactContext reactContextE = E();
                if (this.f22610d == null && reactContextE != null) {
                    u(g0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void t0(b0 b0Var) {
        this.f22627u.remove(b0Var);
    }

    public void w0() {
        UiThreadUtil.assertOnUiThread();
        this.f22616j.r();
    }

    public void z() {
        qk.a.b(E, "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (this.f22628v) {
            return;
        }
        this.f22628v = true;
        r0();
    }
}
