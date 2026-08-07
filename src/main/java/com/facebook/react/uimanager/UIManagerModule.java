package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = UIManagerModule.NAME)
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = al.c.a().c(bl.a.UI_MANAGER);
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final EventDispatcher mEventDispatcher;
    private final List<f1> mListeners;
    private final e mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final a1 mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners;
    private final p1 mViewManagerRegistry;

    class a implements d {
        a() {
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.d
        public String a(String str) {
            return UIManagerModule.this.resolveCustomDirectEventName(str);
        }
    }

    class b extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f23107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f23108b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, int i11, Object obj) {
            super(reactContext);
            this.f23107a = i11;
            this.f23108b = obj;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.U(this.f23107a, this.f23108b);
        }
    }

    class c extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f23110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f23111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23112c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, int i11, int i12, int i13) {
            super(reactContext);
            this.f23110a = i11;
            this.f23111b = i12;
            this.f23112c = i13;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.Y(this.f23110a, this.f23111b, this.f23112c);
            UIManagerModule.this.mUIImplementation.m(-1);
        }
    }

    public interface d {
        String a(String str);
    }

    private static class e implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i11) {
            if (i11 >= 60) {
                w1.b().c();
            }
        }

        private e() {
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, q1 q1Var, int i11) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        com.facebook.react.uimanager.d.g(reactApplicationContext);
        com.facebook.react.uimanager.events.e eVar = new com.facebook.react.uimanager.events.e(reactApplicationContext);
        this.mEventDispatcher = eVar;
        this.mModuleConstants = createConstants(q1Var);
        this.mCustomDirectEvents = d1.c();
        p1 p1Var = new p1(q1Var);
        this.mViewManagerRegistry = p1Var;
        this.mUIImplementation = new a1(reactApplicationContext, p1Var, eVar, i11);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(q1 q1Var) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        ep.b.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.TRUE).c();
        try {
            return e1.a(q1Var);
        } finally {
            ep.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends View> int addRootView(T t11) {
        return addRootView(t11, null);
    }

    public void addUIBlock(z0 z0Var) {
        this.mUIImplementation.a(z0Var);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @Deprecated
    public void addUIManagerListener(f1 f1Var) {
        this.mListeners.add(f1Var);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.f();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.g(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i11, String str, int i12, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i11 + ", class: " + str + ", props: " + readableMap;
            qk.a.b("ReactNative", str2);
            al.c.a().b(bl.a.UI_MANAGER, str2);
        }
        this.mUIImplementation.j(i11, str, i12, readableMap);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i11, int i12, ReadableArray readableArray) {
        this.mUIImplementation.k(i11, i12, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i11, Dynamic dynamic, ReadableArray readableArray) {
        UIManager uIManagerG = b1.g(getReactApplicationContext(), oo.a.a(i11));
        if (uIManagerG == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            uIManagerG.dispatchCommand(i11, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            uIManagerG.dispatchCommand(i11, dynamic.asString(), readableArray);
        }
    }

    @ReactMethod
    public void findSubviewIn(int i11, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.o(i11, Math.round(w.g(readableArray.getDouble(0))), Math.round(w.g(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        ViewManager viewManagerO = this.mUIImplementation.O(str);
        if (viewManagerO == null) {
            return null;
        }
        return getConstantsForViewManager(viewManagerO, this.mCustomDirectEvents);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(e1.d());
    }

    @Deprecated
    public d getDirectEventNamesResolver() {
        return new a();
    }

    @Override // com.facebook.react.bridge.UIManager
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.p();
    }

    @Deprecated
    public a1 getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public p1 getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        getReactApplicationContext().registerComponentCallbacks(this.mViewManagerRegistry);
        this.mEventDispatcher.a(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.mEventDispatcher.b();
        this.mUIImplementation.B();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        reactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        w1.b().c();
        m1.b();
    }

    public void invalidateNodeLayout(int i11) {
        i0 i0VarN = this.mUIImplementation.N(i11);
        if (i0VarN != null) {
            i0VarN.dirty();
            this.mUIImplementation.m(-1);
        } else {
            qk.a.I("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i11);
        }
    }

    @ReactMethod
    public void manageChildren(int i11, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i11 + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            qk.a.b("ReactNative", str);
            al.c.a().b(bl.a.UI_MANAGER, str);
        }
        this.mUIImplementation.u(i11, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i11, int i12) {
    }

    @ReactMethod
    public void measure(int i11, Callback callback) {
        this.mUIImplementation.v(i11, callback);
    }

    @ReactMethod
    public void measureInWindow(int i11, Callback callback) {
        this.mUIImplementation.w(i11, callback);
    }

    @ReactMethod
    public void measureLayout(int i11, int i12, Callback callback, Callback callback2) {
        this.mUIImplementation.x(i11, i12, callback, callback2);
    }

    public void onBatchComplete() {
        int i11 = this.mBatchId;
        this.mBatchId = i11 + 1;
        ep.b.a(0L, "onBatchCompleteUI").a("BatchId", i11).c();
        Iterator<f1> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().willDispatchViewUpdates(this);
        }
        Iterator<UIManagerListener> it2 = this.mUIManagerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().willDispatchViewUpdates(this);
        }
        try {
            if (this.mUIImplementation.q() > 0) {
                this.mUIImplementation.m(i11);
            }
        } finally {
            ep.a.i(0L);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.C();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.D();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.E();
    }

    public void prependUIBlock(z0 z0Var) {
        this.mUIImplementation.F(z0Var);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.G();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i11, String str, WritableMap writableMap) {
        receiveEvent(-1, i11, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i11) {
        this.mUIImplementation.J(i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Deprecated
    public void removeUIManagerListener(f1 f1Var) {
        this.mListeners.remove(f1Var);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        Map map;
        return (str == null || (map = (Map) this.mCustomDirectEvents.get(str)) == null) ? str : (String) map.get("registrationName");
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i11) {
        return oo.a.d(i11) ? i11 : this.mUIImplementation.M(i11);
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    public View resolveView(int i11) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.r().S().resolveView(i11);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i11, int i12) {
        int iA = oo.a.a(i11);
        if (iA != 2) {
            this.mUIImplementation.P(i11, i12);
            return;
        }
        UIManager uIManagerG = b1.g(getReactApplicationContext(), iA);
        if (uIManagerG != null) {
            uIManagerG.sendAccessibilityEvent(i11, i12);
        }
    }

    @ReactMethod
    public void setChildren(int i11, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i11 + ", children: " + readableArray;
            qk.a.b("ReactNative", str);
            al.c.a().b(bl.a.UI_MANAGER, str);
        }
        this.mUIImplementation.Q(i11, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i11, boolean z11) {
        this.mUIImplementation.R(i11, z11);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z11) {
        this.mUIImplementation.S(z11);
    }

    public void setViewHierarchyUpdateDebugListener(po.a aVar) {
        this.mUIImplementation.T(aVar);
    }

    public void setViewLocalData(int i11, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new b(reactApplicationContext, i11, obj));
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t11, String str, WritableMap writableMap, int i11, int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i11, int i12) {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i11, ReadableMap readableMap) {
        this.mUIImplementation.V(i11, new k0(readableMap));
    }

    public void updateInsetsPadding(int i11, int i12, int i13, int i14, int i15) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.W(i11, i12, i13, i14, i15);
    }

    public void updateNodeSize(int i11, int i12, int i13) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.X(i11, i12, i13);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i11, int i12, int i13, int i14, int i15) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new c(reactApplicationContext, i11, i12, i13));
    }

    @ReactMethod
    public void updateView(int i11, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i11 + ", class: " + str + ", props: " + readableMap;
            qk.a.b("ReactNative", str2);
            al.c.a().b(bl.a.UI_MANAGER, str2);
        }
        this.mUIImplementation.a0(i11, str, readableMap);
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i11, int i12, Callback callback) {
        this.mUIImplementation.c0(i11, i12, callback);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t11, WritableMap writableMap) {
        ep.a.c(0L, "UIManagerModule.addRootView");
        int iA = h0.a();
        this.mUIImplementation.H(t11, iA, new v0(getReactApplicationContext(), t11.getContext(), ((g0) t11).getSurfaceID(), -1));
        ep.a.i(0L);
        return iA;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i11, String str, ReadableArray readableArray) {
        this.mUIImplementation.l(i11, str, readableArray);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i11, int i12, String str, WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i12, str, writableMap);
    }

    public static WritableMap getConstantsForViewManager(ViewManager viewManager, Map<String, Object> map) {
        ep.b.a(0L, "UIManagerModule.getConstantsForViewManager").b("ViewManager", viewManager.getName()).b("Lazy", Boolean.TRUE).c();
        try {
            Map<String, Object> mapC = e1.c(viewManager, null, null, null, map);
            if (mapC != null) {
                return Arguments.makeNativeMap(mapC);
            }
            return null;
        } finally {
            ep.b.b(0L).c();
        }
    }

    public static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        ep.b.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.FALSE).c();
        try {
            return e1.b(list, map, map2);
        } finally {
            ep.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i11) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        com.facebook.react.uimanager.d.g(reactApplicationContext);
        com.facebook.react.uimanager.events.e eVar = new com.facebook.react.uimanager.events.e(reactApplicationContext);
        this.mEventDispatcher = eVar;
        HashMap mapB = jn.c.b();
        this.mCustomDirectEvents = mapB;
        this.mModuleConstants = createConstants(list, null, mapB);
        p1 p1Var = new p1(list);
        this.mViewManagerRegistry = p1Var;
        this.mUIImplementation = new a1(reactApplicationContext, p1Var, eVar, i11);
        reactApplicationContext.addLifecycleEventListener(this);
    }
}
