package com.th3rdwave.safeareacontext;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@xn.a(name = SafeAreaViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/th3rdwave/safeareacontext/k;", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/th3rdwave/safeareacontext/k;", "Lcom/th3rdwave/safeareacontext/p;", "createShadowNodeInstance", "()Lcom/th3rdwave/safeareacontext/p;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "mode", "Ljn0/h0;", "setMode", "(Lcom/th3rdwave/safeareacontext/k;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "propList", "setEdges", "(Lcom/th3rdwave/safeareacontext/k;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/views/view/e;", "Lcom/facebook/react/uimanager/k0;", "props", "Lcom/facebook/react/uimanager/u0;", "stateWrapper", "", "updateState", "(Lcom/facebook/react/views/view/e;Lcom/facebook/react/uimanager/k0;Lcom/facebook/react/uimanager/u0;)Ljava/lang/Object;", "Companion", "a", "react-native-safe-area-context_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SafeAreaViewManager extends ReactViewManager {
    public static final String REACT_CLASS = "RNCSafeAreaView";

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<p> getShadowNodeClass() {
        return p.class;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    @no.a(name = "edges")
    public final void setEdges(k view, ReadableMap propList) {
        l lVarValueOf;
        l lVarValueOf2;
        l lVarValueOf3;
        l lVarValueOf4;
        s.k(view, "view");
        if (propList != null) {
            String string = propList.getString("top");
            if (string != null) {
                String upperCase = string.toUpperCase(Locale.ROOT);
                s.j(upperCase, "toUpperCase(...)");
                lVarValueOf = l.valueOf(upperCase);
                if (lVarValueOf == null) {
                    lVarValueOf = l.OFF;
                }
            } else {
                lVarValueOf = l.OFF;
            }
            String string2 = propList.getString("right");
            if (string2 != null) {
                String upperCase2 = string2.toUpperCase(Locale.ROOT);
                s.j(upperCase2, "toUpperCase(...)");
                lVarValueOf2 = l.valueOf(upperCase2);
                if (lVarValueOf2 == null) {
                    lVarValueOf2 = l.OFF;
                }
            } else {
                lVarValueOf2 = l.OFF;
            }
            String string3 = propList.getString("bottom");
            if (string3 != null) {
                String upperCase3 = string3.toUpperCase(Locale.ROOT);
                s.j(upperCase3, "toUpperCase(...)");
                lVarValueOf3 = l.valueOf(upperCase3);
                if (lVarValueOf3 == null) {
                    lVarValueOf3 = l.OFF;
                }
            } else {
                lVarValueOf3 = l.OFF;
            }
            String string4 = propList.getString("left");
            if (string4 != null) {
                String upperCase4 = string4.toUpperCase(Locale.ROOT);
                s.j(upperCase4, "toUpperCase(...)");
                lVarValueOf4 = l.valueOf(upperCase4);
                if (lVarValueOf4 == null) {
                    lVarValueOf4 = l.OFF;
                }
            } else {
                lVarValueOf4 = l.OFF;
            }
            view.setEdges(new SafeAreaViewEdges(lVarValueOf, lVarValueOf2, lVarValueOf3, lVarValueOf4));
        }
    }

    @no.a(name = "mode")
    public final void setMode(k view, String mode) {
        s.k(view, "view");
        if (s.f(mode, "padding")) {
            view.setMode(o.PADDING);
        } else if (s.f(mode, "margin")) {
            view.setMode(o.MARGIN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(com.facebook.react.views.view.e view, k0 props, u0 stateWrapper) {
        s.k(view, "view");
        ((k) view).setStateWrapper(stateWrapper);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public p createShadowNodeInstance() {
        return new p();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public k createViewInstance(v0 context) {
        s.k(context, "context");
        return new k(context);
    }
}
