package com.plaid;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.l1;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import vo.m;
import vo.n;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = PLKEmbeddedViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/plaid/PLKEmbeddedViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/plaid/PLKEmbeddedView;", "Lvo/n;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/plaid/PLKEmbeddedView;", "view", "token", "Ljn0/h0;", "setToken", "(Lcom/plaid/PLKEmbeddedView;Ljava/lang/String;)V", "value", "setIOSPresentationStyle", "", "", "getExportedCustomBubblingEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/l1;", "delegate", "Lcom/facebook/react/uimanager/l1;", "Companion", "react-native-plaid-link-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PLKEmbeddedViewManager extends SimpleViewManager<PLKEmbeddedView> implements n<PLKEmbeddedView> {
    public static final String EVENT_NAME = "onEmbeddedEvent";
    public static final String REACT_CLASS = "PLKEmbeddedView";
    private final l1<PLKEmbeddedView> delegate = new m(this);

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return v0.o(x.a(EVENT_NAME, v0.o(x.a("phasedRegistrationNames", v0.o(x.a("bubbled", EVENT_NAME))))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // vo.n
    public void setIOSPresentationStyle(PLKEmbeddedView view, String value) {
        s.k(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public PLKEmbeddedView createViewInstance(com.facebook.react.uimanager.v0 context) {
        s.k(context, "context");
        return new PLKEmbeddedView(context, null, 2, null);
    }

    @Override // vo.n
    @no.a(name = "token")
    public void setToken(PLKEmbeddedView view, String token) {
        s.k(view, "view");
        if (token == null) {
            token = "";
        }
        view.setToken(token);
    }
}
