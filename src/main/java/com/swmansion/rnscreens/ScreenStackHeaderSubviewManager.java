package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.l1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@xn.a(name = ScreenStackHeaderSubviewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/y0;", "Lvo/i0;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/swmansion/rnscreens/y0;", "view", "type", "Ljn0/h0;", "setType", "(Lcom/swmansion/rnscreens/y0;Ljava/lang/String;)V", "", "hidesSharedBackground", "setHidesSharedBackground", "(Lcom/swmansion/rnscreens/y0;Z)V", "Lcom/facebook/react/uimanager/k0;", "props", "Lcom/facebook/react/uimanager/u0;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/y0;Lcom/facebook/react/uimanager/k0;Lcom/facebook/react/uimanager/u0;)Ljava/lang/Object;", "Lcom/facebook/react/uimanager/l1;", "getDelegate", "()Lcom/facebook/react/uimanager/l1;", "delegate", "Lcom/facebook/react/uimanager/l1;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenStackHeaderSubviewManager extends ViewGroupManager<y0> implements vo.i0<y0> {
    public static final String REACT_CLASS = "RNSScreenStackHeaderSubview";
    private final l1<y0> delegate = new vo.h0(this);

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1<y0> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public y0 createViewInstance(com.facebook.react.uimanager.v0 context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return new y0(context);
    }

    @Override // vo.i0
    @no.a(name = "hidesSharedBackground")
    public void setHidesSharedBackground(y0 view, boolean hidesSharedBackground) {
        p013kotlin.jvm.internal.s.k(view, "view");
        Log.w("[RNScreens]", "hidesSharedBackground prop is not available on Android");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // vo.i0
    @no.a(name = "type")
    public void setType(y0 view, String type) {
        y0.a aVar;
        p013kotlin.jvm.internal.s.k(view, "view");
        if (type != null) {
            switch (type.hashCode()) {
                case -1364013995:
                    if (type.equals("center")) {
                        aVar = y0.a.CENTER;
                        view.setType(aVar);
                        return;
                    }
                    break;
                case 3015911:
                    if (type.equals("back")) {
                        aVar = y0.a.BACK;
                        view.setType(aVar);
                        return;
                    }
                    break;
                case 3317767:
                    if (type.equals("left")) {
                        aVar = y0.a.LEFT;
                        view.setType(aVar);
                        return;
                    }
                    break;
                case 108511772:
                    if (type.equals("right")) {
                        aVar = y0.a.RIGHT;
                        view.setType(aVar);
                        return;
                    }
                    break;
                case 1778179403:
                    if (type.equals("searchBar")) {
                        aVar = y0.a.SEARCH_BAR;
                        view.setType(aVar);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unknown type " + type);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(y0 view, com.facebook.react.uimanager.k0 props, com.facebook.react.uimanager.u0 stateWrapper) {
        p013kotlin.jvm.internal.s.k(view, "view");
        return super.updateState(view, props, stateWrapper);
    }
}
