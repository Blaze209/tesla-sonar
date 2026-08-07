package com.swmansion.gesturehandler.react;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.GestureHandler;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u000f\u001a\u00020\t\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\t\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ'\u0010\u0014\u001a\u00020\t\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\t\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010!\u001a\u00020\t\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J1\u0010#\u001a\u00020\t\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u0010J!\u0010$\u001a\u00020\t\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010'¨\u0006)"}, d2 = {"Lcom/swmansion/gesturehandler/react/e;", "Ly90/l;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "T", "handler", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/swmansion/gesturehandler/core/GestureHandler;)V", "", "newState", "oldState", "e", "(Lcom/swmansion/gesturehandler/core/GestureHandler;II)V", "f", "Lcom/facebook/react/uimanager/events/d;", "event", "j", "(Lcom/facebook/react/uimanager/events/d;)V", "Lcom/swmansion/gesturehandler/react/d;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/swmansion/gesturehandler/react/d;)V", "h", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "data", "g", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Landroid/view/MotionEvent;", "c", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Landroid/view/MotionEvent;)V", "a", "b", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lx90/i;", "Lx90/i;", "reanimatedEventDispatcher", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements y90.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactApplicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x90.i reanimatedEventDispatcher;

    public e(ReactApplicationContext reactApplicationContext) {
        s.k(reactApplicationContext, "reactApplicationContext");
        this.reactApplicationContext = reactApplicationContext;
        this.reanimatedEventDispatcher = new x90.i();
    }

    private final <T extends GestureHandler> void d(T handler) throws Exception {
        GestureHandler.b<GestureHandler> bVarA;
        if (handler.getTag() < 0 || handler.getState() != 4 || (bVarA = f.f55414a.a(handler)) == null) {
            return;
        }
        int actionType = handler.getActionType();
        if (actionType == 1) {
            j(d.Companion.c(d.INSTANCE, handler, bVarA.c(handler), false, 4, null));
            return;
        }
        if (actionType == 2) {
            i(d.INSTANCE.b(handler, bVarA.c(handler), true));
        } else if (actionType == 3) {
            h(d.Companion.c(d.INSTANCE, handler, bVarA.c(handler), false, 4, null));
        } else {
            if (actionType != 4) {
                return;
            }
            g("onGestureHandlerEvent", d.INSTANCE.a(bVarA.c(handler)));
        }
    }

    private final <T extends GestureHandler> void e(T handler, int newState, int oldState) throws Exception {
        GestureHandler.b<GestureHandler> bVarA;
        if (handler.getTag() >= 0 && (bVarA = f.f55414a.a(handler)) != null) {
            int actionType = handler.getActionType();
            if (actionType == 1) {
                j(n.INSTANCE.b(handler, newState, oldState, bVarA.c(handler)));
                return;
            }
            if (actionType == 2 || actionType == 3) {
                h(n.INSTANCE.b(handler, newState, oldState, bVarA.c(handler)));
            } else {
                if (actionType != 4) {
                    return;
                }
                g("onGestureHandlerStateChange", n.INSTANCE.a(bVarA.c(handler), newState, oldState));
            }
        }
    }

    private final <T extends GestureHandler> void f(T handler) throws Exception {
        if (handler.getTag() < 0) {
            return;
        }
        if (handler.getState() == 2 || handler.getState() == 4 || handler.getState() == 0 || handler.getView() != null) {
            int actionType = handler.getActionType();
            if (actionType == 1) {
                j(o.INSTANCE.b(handler));
            } else {
                if (actionType != 4) {
                    return;
                }
                g("onGestureHandlerEvent", o.INSTANCE.a(handler));
            }
        }
    }

    private final void g(String eventName, WritableMap data) {
        a.a(this.reactApplicationContext).emit(eventName, data);
    }

    private final <T extends com.facebook.react.uimanager.events.d<T>> void h(T event) throws Exception {
        x90.h.a(this.reactApplicationContext, event);
    }

    private final void i(d event) throws Exception {
        x90.h.a(this.reactApplicationContext, event);
    }

    private final <T extends com.facebook.react.uimanager.events.d<T>> void j(T event) throws Exception {
        h(event);
    }

    @Override // y90.l
    public <T extends GestureHandler> void a(T handler, int newState, int oldState) throws Exception {
        s.k(handler, "handler");
        e(handler, newState, oldState);
    }

    @Override // y90.l
    public <T extends GestureHandler> void b(T handler) throws Exception {
        s.k(handler, "handler");
        f(handler);
    }

    @Override // y90.l
    public <T extends GestureHandler> void c(T handler, MotionEvent event) throws Exception {
        s.k(handler, "handler");
        s.k(event, "event");
        d(handler);
    }
}
