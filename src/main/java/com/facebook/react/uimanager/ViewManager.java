package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.i0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ViewManager<T extends View, C extends i0> extends BaseJavaModule {
    private static final String TAG = "ViewManager";
    private l1<T> mDelegate;
    private HashMap<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    private l1<T> getOrCreateViewManagerDelegate() {
        l1<T> l1Var = this.mDelegate;
        if (l1Var != null) {
            return l1Var;
        }
        l1<T> delegate = getDelegate();
        this.mDelegate = delegate;
        return delegate;
    }

    private Stack<T> getRecyclableViewStack(int i11, boolean z11) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (z11 && !map.containsKey(Integer.valueOf(i11))) {
            this.mRecyclableViews.put(Integer.valueOf(i11), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i11));
    }

    protected void addEventEmitters(@NonNull v0 v0Var, @NonNull T t11) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    @NonNull
    public T createView(int i11, @NonNull v0 v0Var, k0 k0Var, u0 u0Var, mo.a aVar) {
        T t11 = (T) createViewInstance(i11, v0Var, k0Var, u0Var);
        if (t11 instanceof mo.d) {
            ((mo.d) t11).setOnInterceptTouchEventListener(aVar);
        }
        return t11;
    }

    @NonNull
    protected T createViewInstance(int i11, @NonNull v0 v0Var, k0 k0Var, u0 u0Var) {
        Object objUpdateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(v0Var.c(), true);
        T t11 = (recyclableViewStack == null || recyclableViewStack.empty()) ? (T) createViewInstance(v0Var) : (T) recycleView(v0Var, recyclableViewStack.pop());
        t11.setId(i11);
        addEventEmitters(v0Var, t11);
        if (k0Var != null) {
            updateProperties(t11, k0Var);
        }
        if (u0Var != null && (objUpdateState = updateState(t11, k0Var, u0Var)) != null) {
            updateExtraData(t11, objUpdateState);
        }
        return t11;
    }

    @NonNull
    protected abstract T createViewInstance(@NonNull v0 v0Var);

    protected boolean experimental_isPrefetchingEnabled() {
        return tn.b.g();
    }

    public void experimental_prefetchResource(ReactContext reactContext, int i11, int i12, com.facebook.react.common.mapbuffer.a aVar) {
    }

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    protected l1<T> getDelegate() {
        if (this instanceof r1) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("ViewManager using codegen must override getDelegate method (name: " + getName() + ")."));
        }
        return new m1.c(this);
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return m1.f(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, com.facebook.yoga.p pVar, float f12, com.facebook.yoga.p pVar2, float[] fArr) {
        return 0L;
    }

    protected void onAfterUpdateTransaction(@NonNull T t11) {
    }

    public void onDropViewInstance(@NonNull T t11) {
        View viewPrepareToRecycleView;
        Context context = t11.getContext();
        if (context == null) {
            qk.a.m(TAG, "onDropViewInstance: view [" + t11.getId() + "] has a null context");
            return;
        }
        if (context instanceof v0) {
            v0 v0Var = (v0) context;
            Stack<T> recyclableViewStack = getRecyclableViewStack(v0Var.c(), false);
            if (recyclableViewStack == null || (viewPrepareToRecycleView = prepareToRecycleView(v0Var, t11)) == null) {
                return;
            }
            recyclableViewStack.push(viewPrepareToRecycleView);
            return;
        }
        qk.a.m(TAG, "onDropViewInstance: view [" + t11.getId() + "] has a context that is not a ThemedReactContext: " + context);
    }

    public void onSurfaceStopped(int i11) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i11));
        }
    }

    protected abstract T prepareToRecycleView(@NonNull v0 v0Var, @NonNull T t11);

    @Deprecated
    public void receiveCommand(@NonNull T t11, int i11, ReadableArray readableArray) {
    }

    protected T recycleView(@NonNull v0 v0Var, @NonNull T t11) {
        return t11;
    }

    public void setPadding(T t11, int i11, int i12, int i13, int i14) {
    }

    protected void setupViewRecycling() {
        if (tn.b.j()) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public abstract void updateExtraData(@NonNull T t11, Object obj);

    public void updateProperties(@NonNull T t11, k0 k0Var) {
        l1<T> orCreateViewManagerDelegate = getOrCreateViewManagerDelegate();
        Iterator<Map.Entry<String, Object>> entryIterator = k0Var.f23326a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            orCreateViewManagerDelegate.b(t11, next.getKey(), next.getValue());
        }
        onAfterUpdateTransaction(t11);
    }

    public Object updateState(@NonNull T t11, k0 k0Var, u0 u0Var) {
        return null;
    }

    @NonNull
    public C createShadowNodeInstance(@NonNull ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    public long measure(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, com.facebook.react.common.mapbuffer.a aVar3, float f11, com.facebook.yoga.p pVar, float f12, com.facebook.yoga.p pVar2, float[] fArr) {
        return 0L;
    }

    public void receiveCommand(@NonNull T t11, String str, ReadableArray readableArray) {
        getOrCreateViewManagerDelegate().c(t11, str, readableArray);
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }
}
