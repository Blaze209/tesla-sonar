package com.p005reactnativeavoidsoftinput;

import android.annotation.SuppressLint;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.v0;
import com.facebook.react.views.view.e;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jn0.h0;
import k00.a;
import k00.b;
import k00.d;
import l00.c;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b'\u0010%J\u0017\u0010(\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b(\u0010%J\u0017\u0010)\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b)\u0010%J\u001f\u0010,\u001a\u00020\f2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\f2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b.\u0010-J'\u00100\u001a\u00020\f2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u001fH\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00105R\u0014\u00109\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/reactnativeavoidsoftinput/q;", "Lcom/facebook/react/views/view/e;", "Ll00/c;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "", "offset", "Ljn0/h0;", "k", "(I)V", Snapshot.HEIGHT, "l", "m", "n", "onAttachedToWindow", "()V", "onDetachedFromWindow", "j", "", "avoidOffset", "setAvoidOffset", "(F)V", "", "easing", "setEasing", "(Ljava/lang/String;)V", "", "enabled", "setIsEnabled", "(Z)V", "delay", "setHideAnimationDelay", "(Ljava/lang/Integer;)V", "duration", "setHideAnimationDuration", "setShowAnimationDelay", "setShowAnimationDuration", "from", "to", "e", "(II)V", "b", "isOrientationChanged", "c", "(IIZ)V", "a", "Lcom/facebook/react/uimanager/v0;", "Lcom/reactnativeavoidsoftinput/h;", "Lcom/reactnativeavoidsoftinput/h;", "managerInstance", "getManager", "()Lcom/reactnativeavoidsoftinput/h;", "manager", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class q extends e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private h managerInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v0 reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    private final EventDispatcher getEventDispatcher() {
        return View.d(this.reactContext, this);
    }

    private final h getManager() {
        synchronized (this) {
            h hVar = this.managerInstance;
            if (hVar != null) {
                return hVar;
            }
            ReactApplicationContext reactApplicationContextB = this.reactContext.b();
            s.j(reactApplicationContextB, "getReactApplicationContext(...)");
            h hVar2 = new h(reactApplicationContextB);
            hVar2.H(true);
            hVar2.T(this);
            hVar2.R(new l() { // from class: com.reactnativeavoidsoftinput.p
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return q.i(this.f48446a, ((Integer) obj).intValue());
                }
            });
            hVar2.S(this);
            this.managerInstance = hVar2;
            return hVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(q qVar, int i11) {
        qVar.k(i11);
        return h0.f84049a;
    }

    private final void k(int offset) {
        EventDispatcher eventDispatcher = getEventDispatcher();
        if (eventDispatcher != null) {
            eventDispatcher.h(new a(View.i(this.reactContext), getId(), offset));
        }
    }

    private final void l(int height) {
        EventDispatcher eventDispatcher = getEventDispatcher();
        if (eventDispatcher != null) {
            eventDispatcher.h(new b(View.i(this.reactContext), getId(), height));
        }
    }

    private final void m(int height) {
        EventDispatcher eventDispatcher = getEventDispatcher();
        if (eventDispatcher != null) {
            eventDispatcher.h(new k00.c(View.i(this.reactContext), getId(), height));
        }
    }

    private final void n(int height) {
        EventDispatcher eventDispatcher = getEventDispatcher();
        if (eventDispatcher != null) {
            eventDispatcher.h(new d(View.i(this.reactContext), getId(), height));
        }
    }

    @Override // l00.c
    public void b(int from, int to2) {
        m(View.c(0));
    }

    @Override // l00.c
    public void c(int from, int to2, boolean isOrientationChanged) {
        l(View.c(to2));
    }

    @Override // l00.c
    public void e(int from, int to2) {
        n(View.c(to2));
    }

    public final void j() {
        getManager().m();
        this.managerInstance = null;
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getManager().v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    public final void setAvoidOffset(float avoidOffset) {
        getManager().D(avoidOffset);
    }

    public final void setEasing(String easing) {
        getManager().E(easing);
    }

    public final void setHideAnimationDelay(Integer delay) {
        getManager().F(delay);
    }

    public final void setHideAnimationDuration(Integer duration) {
        getManager().G(duration);
    }

    public final void setIsEnabled(boolean enabled) {
        getManager().H(enabled);
    }

    public final void setShowAnimationDelay(Integer delay) {
        getManager().X(delay);
    }

    public final void setShowAnimationDuration(Integer duration) {
        getManager().Y(duration);
    }
}
