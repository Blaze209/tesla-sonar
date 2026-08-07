package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f23129a = "com.facebook.react.uimanager.b1";

    public static float[] a(Context context) {
        EditText editText = new EditText(context);
        return new float[]{w.f(ViewCompat.F(editText)), w.f(ViewCompat.E(editText)), w.f(editText.getPaddingTop()), w.f(editText.getPaddingBottom())};
    }

    public static EventDispatcher b(ReactContext reactContext, int i11) {
        Object objB;
        if (reactContext.isBridgeless()) {
            if (reactContext instanceof v0) {
                objB = reactContext;
                objB = ((v0) reactContext).b();
            }
            objB = reactContext;
            return ((com.facebook.react.uimanager.events.h) objB).getEventDispatcher();
        }
        UIManager uIManagerH = h(reactContext, i11, false);
        if (uIManagerH == null) {
            ReactSoftExceptionLogger.logSoftException(f23129a, new ReactNoCrashSoftException("Unable to find UIManager for UIManagerType " + i11));
            return null;
        }
        EventDispatcher eventDispatcher = uIManagerH.getEventDispatcher();
        if (eventDispatcher == null) {
            ReactSoftExceptionLogger.logSoftException(f23129a, new IllegalStateException("Cannot get EventDispatcher for UIManagerType " + i11));
        }
        return eventDispatcher;
    }

    public static EventDispatcher c(ReactContext reactContext, int i11) {
        EventDispatcher eventDispatcherB = b(reactContext, oo.a.a(i11));
        if (eventDispatcherB == null) {
            ReactSoftExceptionLogger.logSoftException(f23129a, new IllegalStateException("Cannot get EventDispatcher for reactTag " + i11));
        }
        return eventDispatcherB;
    }

    public static ReactContext d(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    public static int e(Context context) {
        if (context instanceof v0) {
            return ((v0) context).c();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int f(View view) {
        if (view instanceof g0) {
            g0 g0Var = (g0) view;
            if (g0Var.getUIManagerType() == 2) {
                return g0Var.getRootViewTag();
            }
            return -1;
        }
        int id2 = view.getId();
        if (oo.a.a(id2) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof v0) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int iE = e(context);
        if (iE == -1) {
            ReactSoftExceptionLogger.logSoftException(f23129a, new IllegalStateException("Fabric View [" + id2 + "] does not have SurfaceId associated with it"));
        }
        return iE;
    }

    public static UIManager g(ReactContext reactContext, int i11) {
        return h(reactContext, i11, true);
    }

    private static UIManager h(ReactContext reactContext, int i11, boolean z11) {
        if (reactContext.isBridgeless()) {
            UIManager fabricUIManager = reactContext.getFabricUIManager();
            if (fabricUIManager != null) {
                return fabricUIManager;
            }
            ReactSoftExceptionLogger.logSoftException(f23129a, new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet."));
            return null;
        }
        if (!reactContext.hasCatalystInstance()) {
            ReactSoftExceptionLogger.logSoftException(f23129a, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        }
        if (!reactContext.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException(f23129a, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
            if (z11) {
                return null;
            }
        }
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        try {
            return i11 == 2 ? reactContext.getFabricUIManager() : (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        } catch (IllegalArgumentException unused) {
            ReactSoftExceptionLogger.logSoftException(f23129a, new ReactNoCrashSoftException("Cannot get UIManager for UIManagerType: " + i11));
            return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        }
    }

    public static UIManager i(ReactContext reactContext, int i11) {
        return g(reactContext, oo.a.a(i11));
    }
}
