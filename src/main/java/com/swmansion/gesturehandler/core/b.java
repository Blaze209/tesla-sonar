package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.gesturehandler.react.p;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0082\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u0003R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/swmansion/gesturehandler/core/b;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "other", "", "Y0", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z", "Landroid/view/View;", "view", "rootView", "Z0", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)Ljava/lang/Boolean;", "Ljn0/h0;", "V0", "handler", "K0", "M0", "L0", "Landroid/view/MotionEvent;", "event", "sourceEvent", "l0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "m0", "o0", "Landroid/os/Handler;", Gender.OTHER, "Landroid/os/Handler;", "Ljava/lang/Runnable;", "P", "Ljava/lang/Runnable;", "finishRunnable", "Lcom/swmansion/gesturehandler/core/k;", "value", "Q", "Lcom/swmansion/gesturehandler/core/k;", "X0", "()Lcom/swmansion/gesturehandler/core/k;", "stylusData", "R", "b", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends GestureHandler {
    private static final p S = new p();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private Runnable finishRunnable = new Runnable() { // from class: y90.j
        @Override // java.lang.Runnable
        public final void run() {
            com.swmansion.gesturehandler.core.b.W0(this.f125306a);
        }
    };

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private StylusData stylusData = new StylusData(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/swmansion/gesturehandler/core/b$b;", "Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "Lcom/swmansion/gesturehandler/core/b;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/b;", "handler", "Lz90/c;", "h", "(Lcom/swmansion/gesturehandler/core/b;)Lz90/c;", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1110b extends GestureHandler.b<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<b> type = b.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name = "HoverGestureHandler";

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        public Class<b> e() {
            return this.type;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            return new b();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public z90.c c(b handler) {
            s.k(handler, "handler");
            return new z90.c(handler);
        }
    }

    private final void V0() {
        int state = getState();
        if (state == 0) {
            q();
        } else if (state == 2) {
            D();
        } else {
            if (state != 4) {
                return;
            }
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(b bVar) {
        bVar.V0();
    }

    private final boolean Y0(GestureHandler other) {
        View view = other.getView();
        while (view != null) {
            if (s.f(view, getView())) {
                return true;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    private final Boolean Z0(View view, View other, View rootView) {
        if (s.f(rootView, other)) {
            return Boolean.TRUE;
        }
        if (s.f(rootView, view)) {
            return Boolean.FALSE;
        }
        if (!(rootView instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) rootView;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            Boolean boolZ0 = Z0(view, other, S.b(viewGroup, i11));
            if (boolZ0 != null) {
                return boolZ0;
            }
        }
        return null;
    }

    static /* synthetic */ Boolean a1(b bVar, View view, View view2, View view3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            view3 = view.getRootView();
        }
        return bVar.Z0(view, view2, view3);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public boolean K0(GestureHandler handler) {
        s.k(handler, "handler");
        if (!(handler instanceof b) || ((b) handler).Y0(this)) {
            return super.K0(handler);
        }
        View view = handler.getView();
        s.h(view);
        View view2 = getView();
        s.h(view2);
        Boolean boolA1 = a1(this, view, view2, null, 4, null);
        s.h(boolA1);
        return boolA1.booleanValue();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public boolean L0(GestureHandler handler) {
        s.k(handler, "handler");
        if (((handler instanceof b) && (Y0(handler) || ((b) handler).Y0(this))) || (handler instanceof com.swmansion.gesturehandler.react.l.b)) {
            return true;
        }
        return super.L0(handler);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public boolean M0(GestureHandler handler) {
        s.k(handler, "handler");
        if ((handler instanceof b) && !Y0(handler) && !((b) handler).Y0(this)) {
            View view = getView();
            s.h(view);
            View view2 = handler.getView();
            s.h(view2);
            Boolean boolA1 = a1(this, view, view2, null, 4, null);
            if (boolA1 != null) {
                return boolA1.booleanValue();
            }
        }
        return super.M0(handler);
    }

    /* JADX INFO: renamed from: X0, reason: from getter */
    public final StylusData getStylusData() {
        return this.stylusData;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        s.k(event, "event");
        s.k(sourceEvent, "sourceEvent");
        if (event.getAction() == 0) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.handler = null;
            return;
        }
        if (event.getAction() != 1 || getIsWithinBounds()) {
            return;
        }
        V0();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void m0(MotionEvent event, MotionEvent sourceEvent) {
        s.k(event, "event");
        s.k(sourceEvent, "sourceEvent");
        if (event.getAction() == 10) {
            if (this.handler == null) {
                this.handler = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.handler;
            s.h(handler);
            handler.postDelayed(this.finishRunnable, 4L);
            return;
        }
        if (!getIsWithinBounds()) {
            V0();
            return;
        }
        if (getState() == 4 && event.getToolType(0) == 2) {
            this.stylusData = StylusData.INSTANCE.a(event);
            return;
        }
        if (getState() == 0) {
            if (event.getAction() == 7 || event.getAction() == 9) {
                p();
                k();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void o0() {
        super.o0();
        this.stylusData = new StylusData(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }
}
