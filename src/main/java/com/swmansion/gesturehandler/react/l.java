package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.v0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.gesturehandler.core.GestureHandler;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0002\u001e\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0016\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010)¨\u0006,"}, d2 = {"Lcom/swmansion/gesturehandler/react/l;", "", "Lcom/facebook/react/bridge/ReactContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/ViewGroup;", "wrappedView", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Landroid/view/ViewGroup;)V", "Ljn0/h0;", "k", "()V", "j", IntegerTokenConverter.CONVERTER_KEY, "Landroid/view/MotionEvent;", "event", "", "e", "(Landroid/view/MotionEvent;)Z", "", "viewTag", "blockNativeResponder", "g", "(IZ)V", "Landroid/view/View;", "view", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)V", "a", "Lcom/facebook/react/bridge/ReactContext;", "Ly90/g;", "b", "Ly90/g;", "orchestrator", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "c", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "jsGestureHandler", "Landroid/view/ViewGroup;", "f", "()Landroid/view/ViewGroup;", "rootView", "Z", "shouldIntercept", "passingTouch", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactContext context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y90.g orchestrator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final GestureHandler jsGestureHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup rootView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean shouldIntercept;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean passingTouch;

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/swmansion/gesturehandler/react/l$a;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "viewGroup", "b", "(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;", "", "MIN_ALPHA_FOR_TOUCH", Gender.FEMALE, "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewGroup b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent parent = viewGroup;
            while (parent != null && !(parent instanceof q0)) {
                parent = parent.getParent();
            }
            if (parent != null) {
                return (ViewGroup) parent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/swmansion/gesturehandler/react/l$b;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "", "handlerTag", "<init>", "(Lcom/swmansion/gesturehandler/react/l;I)V", "Landroid/view/MotionEvent;", "event", "Ljn0/h0;", "U0", "(Landroid/view/MotionEvent;)V", "sourceEvent", "l0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "m0", "j0", "()V", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class b extends GestureHandler {
        public b(int i11) {
            I0(i11);
        }

        private final void U0(MotionEvent event) {
            y90.g orchestrator;
            if (getState() == 0 && (!l.this.shouldIntercept || (orchestrator = getOrchestrator()) == null || !orchestrator.v())) {
                p();
                l.this.shouldIntercept = false;
            }
            if (event.getActionMasked() == 1 || event.getActionMasked() == 10) {
                B();
            }
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        protected void j0() {
            l.this.shouldIntercept = true;
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            motionEventObtain.setAction(3);
            if (l.this.getRootView() instanceof q0) {
                q0 q0Var = (q0) l.this.getRootView();
                ViewGroup rootView = l.this.getRootView();
                s.h(motionEventObtain);
                q0Var.a(rootView, motionEventObtain);
            }
            motionEventObtain.recycle();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        protected void l0(MotionEvent event, MotionEvent sourceEvent) {
            s.k(event, "event");
            s.k(sourceEvent, "sourceEvent");
            U0(event);
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler
        protected void m0(MotionEvent event, MotionEvent sourceEvent) {
            s.k(event, "event");
            s.k(sourceEvent, "sourceEvent");
            U0(event);
        }
    }

    public l(ReactContext context, ViewGroup wrappedView) {
        s.k(context, "context");
        s.k(wrappedView, "wrappedView");
        this.context = context;
        UiThreadUtil.assertOnUiThread();
        int id2 = wrappedView.getId();
        NativeModule nativeModule = context.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        s.h(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        j registry = rNGestureHandlerModule.getRegistry();
        ViewGroup viewGroupB = INSTANCE.b(wrappedView);
        this.rootView = viewGroupB;
        Log.i("ReactNative", "[GESTURE HANDLER] Initialize gesture handler for root view " + viewGroupB);
        y90.g gVar = new y90.g(wrappedView, registry, new p());
        gVar.F(0.1f);
        this.orchestrator = gVar;
        b bVar = new b(-id2);
        this.jsGestureHandler = bVar;
        registry.j(bVar);
        registry.c(bVar.getTag(), id2, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(l lVar) {
        lVar.k();
    }

    private final void k() {
        GestureHandler gestureHandler = this.jsGestureHandler;
        if (gestureHandler == null || gestureHandler.getState() != 2) {
            return;
        }
        gestureHandler.k();
        gestureHandler.B();
    }

    public final void d(View view) {
        s.k(view, "view");
        y90.g gVar = this.orchestrator;
        if (gVar != null) {
            gVar.f(view);
        }
    }

    public final boolean e(MotionEvent event) {
        s.k(event, "event");
        this.passingTouch = true;
        y90.g gVar = this.orchestrator;
        s.h(gVar);
        gVar.B(event);
        this.passingTouch = false;
        return this.shouldIntercept;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ViewGroup getRootView() {
        return this.rootView;
    }

    public final void g(int viewTag, boolean blockNativeResponder) {
        if (blockNativeResponder) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.h(this.f55425a);
                }
            });
        }
    }

    public final void i() {
        if (this.orchestrator == null || this.passingTouch) {
            return;
        }
        k();
    }

    public final void j() {
        Log.i("ReactNative", "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.rootView);
        ReactContext reactContext = this.context;
        s.i(reactContext, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((v0) reactContext).b().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        s.h(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        j registry = rNGestureHandlerModule.getRegistry();
        GestureHandler gestureHandler = this.jsGestureHandler;
        s.h(gestureHandler);
        registry.g(gestureHandler.getTag());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
