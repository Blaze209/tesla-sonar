package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.l1;
import com.facebook.react.uimanager.v0;
import com.facebook.react.uimanager.w;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vo.g;
import vo.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 N2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001OB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001e\u0010\fJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\bH\u0017¢\u0006\u0004\b \u0010\fJ\u001f\u0010\"\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\bH\u0017¢\u0006\u0004\b\"\u0010\fJ\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b#\u0010\fJ!\u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b'\u0010&J!\u0010(\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b(\u0010&J!\u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b)\u0010&J!\u0010*\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b*\u0010&J\u001f\u0010+\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\fJ)\u0010/\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\n2\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b2\u00103J\u001f\u00107\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00022\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000209H\u0014¢\u0006\u0004\b:\u0010;J_\u0010J\u001a\u00020I2\u0006\u0010\u0016\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010?\u001a\u0004\u0018\u00010=2\b\u0010@\u001a\u0004\u0018\u00010=2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020A2\u0006\u0010F\u001a\u00020C2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bJ\u0010KR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lcom/facebook/react/views/switchview/ReactSwitchManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/switchview/a;", "Lcom/facebook/react/views/switchview/d;", "Lvo/h;", "<init>", "()V", "view", "", "value", "Ljn0/h0;", "setValueInternal", "(Lcom/facebook/react/views/switchview/a;Z)V", "", "getName", "()Ljava/lang/String;", "createShadowNodeInstance", "()Lcom/facebook/react/views/switchview/d;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/facebook/react/views/switchview/a;", "", "backgroundColor", "setBackgroundColor", "(Lcom/facebook/react/views/switchview/a;I)V", "disabled", "setDisabled", "enabled", "setEnabled", DebugKt.DEBUG_PROPERTY_VALUE_ON, "setOn", "setValue", "color", "setThumbTintColor", "(Lcom/facebook/react/views/switchview/a;Ljava/lang/Integer;)V", "setThumbColor", "setTrackColorForFalse", "setTrackColorForTrue", "setTrackTintColor", "setNativeValue", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/facebook/react/views/switchview/a;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "reactContext", "addEventEmitters", "(Lcom/facebook/react/uimanager/v0;Lcom/facebook/react/views/switchview/a;)V", "root", "", "extraData", "updateExtraData", "(Lcom/facebook/react/views/switchview/a;Ljava/lang/Object;)V", "Lcom/facebook/react/uimanager/l1;", "getDelegate", "()Lcom/facebook/react/uimanager/l1;", "Landroid/content/Context;", "Lcom/facebook/react/bridge/ReadableMap;", "localData", "props", "state", "", Snapshot.WIDTH, "Lcom/facebook/yoga/p;", "widthMode", Snapshot.HEIGHT, "heightMode", "", "attachmentsPositions", "", "measure", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;[F)J", "delegate", "Lcom/facebook/react/uimanager/l1;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactSwitchManager extends BaseViewManager<a, d> implements h<a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new CompoundButton.OnCheckedChangeListener() { // from class: com.facebook.react.views.switchview.c
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            ReactSwitchManager.ON_CHECKED_CHANGE_LISTENER$lambda$2(compoundButton, z11);
        }
    };
    public static final String REACT_CLASS = "AndroidSwitch";
    private final l1<a> delegate = new g(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ON_CHECKED_CHANGE_LISTENER$lambda$2(CompoundButton compoundButton, boolean z11) {
        Context context = compoundButton.getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int id2 = compoundButton.getId();
        EventDispatcher eventDispatcherC = b1.c(reactContext, id2);
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new b(b1.e(reactContext), id2, z11));
        }
    }

    private final void setValueInternal(a view, boolean value) {
        view.setOnCheckedChangeListener(null);
        view.setOn(value);
        view.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1<a> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<d> getShadowNodeClass() {
        return d.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap localData, ReadableMap props, ReadableMap state, float width, p widthMode, float height, p heightMode, float[] attachmentsPositions) {
        s.k(context, "context");
        s.k(widthMode, "widthMode");
        s.k(heightMode, "heightMode");
        a aVar = new a(context);
        aVar.setShowText(false);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return q.a(w.f(aVar.getMeasuredWidth()), w.f(aVar.getMeasuredHeight()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(a root, Object extraData) {
        s.k(root, "root");
        s.k(extraData, "extraData");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(v0 reactContext, a view) {
        s.k(reactContext, "reactContext");
        s.k(view, "view");
        view.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createShadowNodeInstance() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(v0 context) {
        s.k(context, "context");
        a aVar = new a(context);
        aVar.setShowText(false);
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(a view, String commandId, ReadableArray args) {
        s.k(view, "view");
        s.k(commandId, "commandId");
        if (s.f(commandId, "setNativeValue")) {
            setValueInternal(view, args != null ? args.getBoolean(0) : false);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBackgroundColor(a view, int backgroundColor) {
        s.k(view, "view");
        view.setBackgroundColor(backgroundColor);
    }

    @Override // vo.h
    @no.a(defaultBoolean = false, name = "disabled")
    public void setDisabled(a view, boolean disabled) {
        s.k(view, "view");
        view.setEnabled(!disabled);
    }

    @Override // vo.h
    @no.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(a view, boolean enabled) {
        s.k(view, "view");
        view.setEnabled(enabled);
    }

    @Override // vo.h
    public void setNativeValue(a view, boolean value) {
        s.k(view, "view");
        setValueInternal(view, value);
    }

    @Override // vo.h
    @no.a(name = DebugKt.DEBUG_PROPERTY_VALUE_ON)
    public void setOn(a view, boolean on2) {
        s.k(view, "view");
        setValueInternal(view, on2);
    }

    @Override // vo.h
    @no.a(customType = "Color", name = "thumbColor")
    public void setThumbColor(a view, Integer color) {
        s.k(view, "view");
        view.setThumbColor(color);
    }

    @Override // vo.h
    @no.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(a view, Integer color) {
        s.k(view, "view");
        setThumbColor(view, color);
    }

    @Override // vo.h
    @no.a(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(a view, Integer color) {
        s.k(view, "view");
        view.setTrackColorForFalse(color);
    }

    @Override // vo.h
    @no.a(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(a view, Integer color) {
        s.k(view, "view");
        view.setTrackColorForTrue(color);
    }

    @Override // vo.h
    @no.a(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(a view, Integer color) {
        s.k(view, "view");
        view.setTrackColor(color);
    }

    @Override // vo.h
    @no.a(name = "value")
    public void setValue(a view, boolean value) {
        s.k(view, "view");
        setValueInternal(view, value);
    }
}
