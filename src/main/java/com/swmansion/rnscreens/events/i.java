package com.swmansion.rnscreens.events;

import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.rnscreens.a0;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\bJ%\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/swmansion/rnscreens/events/i;", "", "Lcom/swmansion/rnscreens/t;", AnalyticsContext.Screen, "<init>", "(Lcom/swmansion/rnscreens/t;)V", "Ljn0/h0;", "dispatchOnWillAppear", "()Ljn0/h0;", "dispatchOnAppear", "dispatchOnWillDisappear", "dispatchOnDisappear", "dispatchOnDismissed", "", ReactProgressBarViewManager.PROP_PROGRESS, "", "isExitAnimation", "isGoingForward", "dispatchTransitionProgress", "(FZZ)V", "Lcom/swmansion/rnscreens/t;", "getScreen", "()Lcom/swmansion/rnscreens/t;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getReactEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "reactEventDispatcher", "", "getReactSurfaceId", "()I", "reactSurfaceId", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {
    private final com.swmansion.rnscreens.t screen;

    public i(com.swmansion.rnscreens.t screen) {
        p013kotlin.jvm.internal.s.k(screen, "screen");
        this.screen = screen;
    }

    public final h0 dispatchOnAppear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.h(new f(getReactSurfaceId(), this.screen.getId()));
        return h0.f84049a;
    }

    public final h0 dispatchOnDisappear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.h(new g(getReactSurfaceId(), this.screen.getId()));
        return h0.f84049a;
    }

    public final h0 dispatchOnDismissed() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.h(new h(getReactSurfaceId(), this.screen.getId()));
        return h0.f84049a;
    }

    public final h0 dispatchOnWillAppear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.h(new k(getReactSurfaceId(), this.screen.getId()));
        return h0.f84049a;
    }

    public final h0 dispatchOnWillDisappear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.h(new l(getReactSurfaceId(), this.screen.getId()));
        return h0.f84049a;
    }

    public final void dispatchTransitionProgress(float progress, boolean isExitAnimation, boolean isGoingForward) {
        float fM = bo0.n.m(progress, BitmapDescriptorFactory.HUE_RED, 1.0f);
        short coalescingKey = a0.INSTANCE.getCoalescingKey(fM);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.h(new j(getReactSurfaceId(), this.screen.getId(), fM, isExitAnimation, isGoingForward, coalescingKey));
        }
    }

    public final EventDispatcher getReactEventDispatcher() {
        return this.screen.getReactEventDispatcher();
    }

    public final int getReactSurfaceId() {
        return b1.f(this.screen);
    }

    public final com.swmansion.rnscreens.t getScreen() {
        return this.screen;
    }
}
