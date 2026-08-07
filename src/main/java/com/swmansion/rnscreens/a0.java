package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0013\b\u0016\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0003RSTB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J-\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010*J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u0004J\u001f\u00103\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0016\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u0010\u0016\u001a\u000205H\u0016¢\u0006\u0004\b8\u00107J\u000f\u00109\u001a\u00020\bH\u0016¢\u0006\u0004\b9\u0010\u0004J\u000f\u0010:\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010\u0004J\u000f\u0010;\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010\u0004R(\u0010<\u001a\u00020\u00058\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bA\u0010\u0004\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0007R \u0010C\u001a\b\u0012\u0004\u0012\u0002050B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010HR\u0016\u0010L\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010HR\u0016\u0010M\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010HR\u0014\u0010P\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006U"}, d2 = {"Lcom/swmansion/rnscreens/a0;", "Landroidx/fragment/app/Fragment;", "Lcom/swmansion/rnscreens/b0;", "<init>", "()V", "Lcom/swmansion/rnscreens/t;", "screenView", "(Lcom/swmansion/rnscreens/t;)V", "Ljn0/h0;", "updateWindowTraits", "dispatchOnWillAppear", "dispatchOnAppear", "dispatchOnWillDisappear", "dispatchOnDisappear", "", "animationEnd", "dispatchViewAnimationEvent", "(Z)V", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onContainerUpdate", "isTranslucent", "()Z", "Landroid/app/Activity;", "tryGetActivity", "()Landroid/app/Activity;", "Lcom/facebook/react/bridge/ReactContext;", "tryGetContext", "()Lcom/facebook/react/bridge/ReactContext;", "Lcom/swmansion/rnscreens/a0$b;", "event", "canDispatchLifecycleEvent", "(Lcom/swmansion/rnscreens/a0$b;)Z", "updateLastEventDispatched", "(Lcom/swmansion/rnscreens/a0$b;)V", "fragmentWrapper", "dispatchLifecycleEvent", "(Lcom/swmansion/rnscreens/a0$b;Lcom/swmansion/rnscreens/b0;)V", "dispatchLifecycleEventInChildContainers", "dispatchHeaderBackButtonClickedEvent", "", "alpha", "closing", "dispatchTransitionProgressEvent", "(FZ)V", "Lcom/swmansion/rnscreens/v;", "addChildScreenContainer", "(Lcom/swmansion/rnscreens/v;)V", "removeChildScreenContainer", "onViewAnimationStart", "onViewAnimationEnd", "onDestroy", AnalyticsContext.Screen, "Lcom/swmansion/rnscreens/t;", "getScreen", "()Lcom/swmansion/rnscreens/t;", "setScreen", "getScreen$annotations", "", "childScreenContainers", "Ljava/util/List;", "getChildScreenContainers", "()Ljava/util/List;", "shouldUpdateOnResume", "Z", "transitionProgress", Gender.FEMALE, "canDispatchWillAppear", "canDispatchAppear", "isTransitioning", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment", "Companion", "b", "c", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class a0 extends Fragment implements b0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "ScreenFragment";
    private boolean canDispatchAppear;
    private boolean canDispatchWillAppear;
    private final List<v> childScreenContainers;
    private boolean isTransitioning;
    public t screen;
    private boolean shouldUpdateOnResume;
    private float transitionProgress;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.a0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/swmansion/rnscreens/a0$a;", "", "<init>", "()V", "", ReactProgressBarViewManager.PROP_PROGRESS, "", "getCoalescingKey", "(F)S", "", "TAG", "Ljava/lang/String;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short getCoalescingKey(float progress) {
            int i11;
            if (progress == BitmapDescriptorFactory.HUE_RED) {
                i11 = 1;
            } else {
                i11 = progress == 1.0f ? 2 : 3;
            }
            return (short) i11;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/swmansion/rnscreens/a0$b;", "", "<init>", "(Ljava/lang/String;I)V", "DID_APPEAR", "WILL_APPEAR", "DID_DISAPPEAR", "WILL_DISAPPEAR", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        DID_APPEAR,
        WILL_APPEAR,
        DID_DISAPPEAR,
        WILL_DISAPPEAR;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/swmansion/rnscreens/a0$c;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljn0/h0;", "clearFocus", "()V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            p013kotlin.jvm.internal.s.k(context, "context");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.WILL_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.DID_APPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.WILL_DISAPPEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.DID_DISAPPEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a0() {
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    private final void dispatchOnAppear() {
        dispatchLifecycleEvent(b.DID_APPEAR, this);
        dispatchTransitionProgressEvent(1.0f, false);
    }

    private final void dispatchOnDisappear() {
        dispatchLifecycleEvent(b.DID_DISAPPEAR, this);
        dispatchTransitionProgressEvent(1.0f, true);
    }

    private final void dispatchOnWillAppear() {
        dispatchLifecycleEvent(b.WILL_APPEAR, this);
        dispatchTransitionProgressEvent(BitmapDescriptorFactory.HUE_RED, false);
    }

    private final void dispatchOnWillDisappear() {
        dispatchLifecycleEvent(b.WILL_DISAPPEAR, this);
        dispatchTransitionProgressEvent(BitmapDescriptorFactory.HUE_RED, true);
    }

    private final void dispatchViewAnimationEvent(final boolean animationEnd) {
        this.isTransitioning = !animationEnd;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || ((parentFragment instanceof a0) && !((a0) parentFragment).isTransitioning)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.dispatchViewAnimationEvent$lambda$8(animationEnd, this);
                    }
                });
            } else if (animationEnd) {
                dispatchOnDisappear();
            } else {
                dispatchOnWillDisappear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchViewAnimationEvent$lambda$8(boolean z11, a0 a0Var) {
        if (z11) {
            a0Var.dispatchOnAppear();
        } else {
            a0Var.dispatchOnWillAppear();
        }
    }

    public static /* synthetic */ void getScreen$annotations() {
    }

    private final void updateWindowTraits() {
        androidx.fragment.app.u activity = getActivity();
        if (activity == null) {
            this.shouldUpdateOnResume = true;
        } else {
            c1.INSTANCE.trySetWindowTraits$react_native_screens_release(getScreen(), activity, tryGetContext());
        }
    }

    @Override // com.swmansion.rnscreens.b0
    public void addChildScreenContainer(v container) {
        p013kotlin.jvm.internal.s.k(container, "container");
        getChildScreenContainers().add(container);
    }

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.x
    public boolean canDispatchLifecycleEvent(b event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        int i11 = d.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            return this.canDispatchWillAppear;
        }
        if (i11 == 2) {
            return this.canDispatchAppear;
        }
        if (i11 == 3) {
            return !this.canDispatchWillAppear;
        }
        if (i11 == 4) {
            return !this.canDispatchAppear;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.x
    public void dispatchHeaderBackButtonClickedEvent() {
        Context context = getScreen().getContext();
        p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iE = com.facebook.react.uimanager.b1.e(reactContext);
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.b1.c(reactContext, getScreen().getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new com.swmansion.rnscreens.events.b(iE, getScreen().getId()));
        }
    }

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.x
    public void dispatchLifecycleEvent(b event, b0 fragmentWrapper) {
        com.facebook.react.uimanager.events.d<?> kVar;
        p013kotlin.jvm.internal.s.k(event, "event");
        p013kotlin.jvm.internal.s.k(fragmentWrapper, "fragmentWrapper");
        Fragment fragment = fragmentWrapper.getFragment();
        if (fragment instanceof t0) {
            t0 t0Var = (t0) fragment;
            if (t0Var.canDispatchLifecycleEvent(event)) {
                t screen = t0Var.getScreen();
                fragmentWrapper.updateLastEventDispatched(event);
                int iF = com.facebook.react.uimanager.b1.f(screen);
                int i11 = d.$EnumSwitchMapping$0[event.ordinal()];
                if (i11 == 1) {
                    kVar = new com.swmansion.rnscreens.events.k(iF, screen.getId());
                } else if (i11 == 2) {
                    kVar = new com.swmansion.rnscreens.events.f(iF, screen.getId());
                } else if (i11 == 3) {
                    kVar = new com.swmansion.rnscreens.events.l(iF, screen.getId());
                } else {
                    if (i11 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar = new com.swmansion.rnscreens.events.g(iF, screen.getId());
                }
                Context context = getScreen().getContext();
                p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherC = com.facebook.react.uimanager.b1.c((ReactContext) context, getScreen().getId());
                if (eventDispatcherC != null) {
                    eventDispatcherC.h(kVar);
                }
                fragmentWrapper.dispatchLifecycleEventInChildContainers(event);
            }
        }
    }

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.x
    public void dispatchLifecycleEventInChildContainers(b event) {
        b0 fragmentWrapper;
        p013kotlin.jvm.internal.s.k(event, "event");
        List<v> childScreenContainers = getChildScreenContainers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : childScreenContainers) {
            if (((v) obj).getScreenCount() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t topScreen = ((v) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                dispatchLifecycleEvent(event, fragmentWrapper);
            }
        }
    }

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.x
    public void dispatchTransitionProgressEvent(float alpha, boolean closing) {
        if (!(this instanceof t0) || this.transitionProgress == alpha) {
            return;
        }
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, alpha));
        this.transitionProgress = fMax;
        short coalescingKey = INSTANCE.getCoalescingKey(fMax);
        t0 t0Var = (t0) this;
        v container = t0Var.getScreen().getContainer();
        boolean goingForward = container instanceof m0 ? ((m0) container).getGoingForward() : false;
        Context context = t0Var.getScreen().getContext();
        p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.b1.c(reactContext, t0Var.getScreen().getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new com.swmansion.rnscreens.events.j(com.facebook.react.uimanager.b1.e(reactContext), t0Var.getScreen().getId(), this.transitionProgress, closing, goingForward, coalescingKey));
        }
    }

    @Override // com.swmansion.rnscreens.b0
    public List<v> getChildScreenContainers() {
        return this.childScreenContainers;
    }

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.i
    public Fragment getFragment() {
        return this;
    }

    @Override // com.swmansion.rnscreens.b0
    public t getScreen() {
        t tVar = this.screen;
        if (tVar != null) {
            return tVar;
        }
        p013kotlin.jvm.internal.s.B(AnalyticsContext.Screen);
        return null;
    }

    @Override // com.swmansion.rnscreens.b0
    public boolean isTranslucent() {
        return false;
    }

    @Override // com.swmansion.rnscreens.b0
    public void onContainerUpdate() {
        updateWindowTraits();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        p013kotlin.jvm.internal.s.k(inflater, "inflater");
        getScreen().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        c cVar = new c(context);
        cVar.addView(aa0.c.recycle(getScreen()));
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        v container = getScreen().getContainer();
        if (container == null || !container.hasScreen(getScreen().getFragmentWrapper())) {
            Context context = getScreen().getContext();
            if (context instanceof ReactContext) {
                int iE = com.facebook.react.uimanager.b1.e(context);
                EventDispatcher eventDispatcherC = com.facebook.react.uimanager.b1.c((ReactContext) context, getScreen().getId());
                if (eventDispatcherC != null) {
                    eventDispatcherC.h(new com.swmansion.rnscreens.events.h(iE, getScreen().getId()));
                }
            }
        }
        getChildScreenContainers().clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.shouldUpdateOnResume) {
            this.shouldUpdateOnResume = false;
            c1.INSTANCE.trySetWindowTraits$react_native_screens_release(getScreen(), tryGetActivity(), tryGetContext());
        }
    }

    @Override // com.swmansion.rnscreens.b0
    public void onViewAnimationEnd() {
        dispatchViewAnimationEvent(true);
    }

    @Override // com.swmansion.rnscreens.b0
    public void onViewAnimationStart() {
        dispatchViewAnimationEvent(false);
    }

    @Override // com.swmansion.rnscreens.b0
    public void removeChildScreenContainer(v container) {
        p013kotlin.jvm.internal.s.k(container, "container");
        getChildScreenContainers().remove(container);
    }

    @Override // com.swmansion.rnscreens.b0
    public void setScreen(t tVar) {
        p013kotlin.jvm.internal.s.k(tVar, "<set-?>");
        this.screen = tVar;
    }

    @Override // com.swmansion.rnscreens.b0
    public Activity tryGetActivity() {
        Fragment fragment;
        androidx.fragment.app.u activity;
        androidx.fragment.app.u activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = getScreen().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = getScreen().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof t) && (fragment = ((t) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.b0
    public ReactContext tryGetContext() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        }
        if (getScreen().getContext() instanceof ReactContext) {
            Context context2 = getScreen().getContext();
            p013kotlin.jvm.internal.s.i(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        }
        for (ViewParent container = getScreen().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof t) {
                t tVar = (t) container;
                if (tVar.getContext() instanceof ReactContext) {
                    Context context3 = tVar.getContext();
                    p013kotlin.jvm.internal.s.i(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    return (ReactContext) context3;
                }
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.b0, com.swmansion.rnscreens.x
    public void updateLastEventDispatched(b event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        int i11 = d.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            this.canDispatchWillAppear = false;
            return;
        }
        if (i11 == 2) {
            this.canDispatchAppear = false;
        } else if (i11 == 3) {
            this.canDispatchWillAppear = true;
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.canDispatchAppear = true;
        }
    }

    @SuppressLint({"ValidFragment"})
    public a0(t screenView) {
        p013kotlin.jvm.internal.s.k(screenView, "screenView");
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        setScreen(screenView);
    }
}
