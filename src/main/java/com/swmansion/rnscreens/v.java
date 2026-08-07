package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\nJ\u000f\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\u0010J7\u0010'\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\u0010J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\u0010J\u0017\u00101\u001a\u00020\u00182\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\u0006\u00103\u001a\u00020\"¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u00103\u001a\u00020\"H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u0010\u0010J\u0015\u00109\u001a\u00020/2\u0006\u00103\u001a\u00020\"¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00182\u0006\u00103\u001a\u00020\"¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0011H\u0004¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\b¢\u0006\u0004\b?\u0010\u0010J\r\u0010@\u001a\u00020\b¢\u0006\u0004\b@\u0010\u0010J\r\u0010A\u001a\u00020\b¢\u0006\u0004\bA\u0010\u0010J\u0019\u0010B\u001a\u00020 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\bH\u0014¢\u0006\u0004\bD\u0010\u0010J\u000f\u0010E\u001a\u00020\bH\u0014¢\u0006\u0004\bE\u0010\u0010J\u001f\u0010H\u001a\u00020\b2\u0006\u0010F\u001a\u00020\"2\u0006\u0010G\u001a\u00020\"H\u0014¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\bH\u0004¢\u0006\u0004\bJ\u0010\u0010J\r\u0010K\u001a\u00020\b¢\u0006\u0004\bK\u0010\u0010J\u000f\u0010L\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010\u0010J\u000f\u0010M\u001a\u00020\bH\u0014¢\u0006\u0004\bM\u0010\u0010R$\u0010P\u001a\u0012\u0012\u0004\u0012\u00020\u00180Nj\b\u0012\u0004\u0012\u00020\u0018`O8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010RR\u0016\u0010S\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u0016\u0010V\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010Z\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0011\u0010\\\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0011\u0010`\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0016\u0010c\u001a\u0004\u0018\u00010/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006d"}, d2 = {"Lcom/swmansion/rnscreens/v;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroidx/fragment/app/FragmentManager;", "fm", "Ljn0/h0;", "setFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "Lcom/facebook/react/x0;", "rootView", "findFragmentManagerForReactRootView", "(Lcom/facebook/react/x0;)Landroidx/fragment/app/FragmentManager;", "setupFragmentManager", "()V", "Landroidx/fragment/app/r0;", "transaction", "Landroidx/fragment/app/Fragment;", "fragment", "attachScreen", "(Landroidx/fragment/app/r0;Landroidx/fragment/app/Fragment;)V", "detachScreen", "Lcom/swmansion/rnscreens/b0;", "screenFragmentWrapper", "Lcom/swmansion/rnscreens/t$a;", "getActivityState", "(Lcom/swmansion/rnscreens/b0;)Lcom/swmansion/rnscreens/t$a;", "fragmentManager", "removeMyFragments", "onScreenChanged", "", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/View;", "view", "removeView", "(Landroid/view/View;)V", "requestLayout", "onChildUpdate", "Lcom/swmansion/rnscreens/t;", AnalyticsContext.Screen, "adapt", "(Lcom/swmansion/rnscreens/t;)Lcom/swmansion/rnscreens/b0;", "index", "addScreen", "(Lcom/swmansion/rnscreens/t;I)V", "removeScreenAt", "(I)V", "removeAllScreens", "getScreenAt", "(I)Lcom/swmansion/rnscreens/t;", "getScreenFragmentWrapperAt", "(I)Lcom/swmansion/rnscreens/b0;", "createTransaction", "()Landroidx/fragment/app/r0;", "attachBelowTop", "detachBelowTop", "notifyTopDetached", "hasScreen", "(Lcom/swmansion/rnscreens/b0;)Z", "onAttachedToWindow", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "performUpdatesNow", "performUpdates", "onUpdate", "notifyContainerUpdate", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "screenWrappers", "Ljava/util/ArrayList;", "Landroidx/fragment/app/FragmentManager;", "isAttached", "Z", "needsUpdate", "isLayoutEnqueued", "Landroid/view/Choreographer$FrameCallback;", "layoutCallback", "Landroid/view/Choreographer$FrameCallback;", "parentScreenWrapper", "Lcom/swmansion/rnscreens/b0;", "isNested", "()Z", "getScreenCount", "()I", "screenCount", "getTopScreen", "()Lcom/swmansion/rnscreens/t;", "topScreen", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class v extends ViewGroup {
    protected FragmentManager fragmentManager;
    private boolean isAttached;
    private boolean isLayoutEnqueued;
    private final Choreographer.FrameCallback layoutCallback;
    private boolean needsUpdate;
    private b0 parentScreenWrapper;
    protected final ArrayList<b0> screenWrappers;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/swmansion/rnscreens/v$a", "Landroid/view/Choreographer$FrameCallback;", "", "frameTimeNanos", "Ljn0/h0;", "doFrame", "(J)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Choreographer.FrameCallback {
        a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            v.this.isLayoutEnqueued = false;
            v vVar = v.this;
            vVar.measure(View.MeasureSpec.makeMeasureSpec(vVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(v.this.getHeight(), 1073741824));
            v vVar2 = v.this;
            vVar2.layout(vVar2.getLeft(), v.this.getTop(), v.this.getRight(), v.this.getBottom());
        }
    }

    public v(Context context) {
        super(context);
        this.screenWrappers = new ArrayList<>();
        this.layoutCallback = new a();
    }

    private final void attachScreen(androidx.fragment.app.r0 transaction, Fragment fragment) {
        transaction.b(getId(), fragment);
    }

    private final void detachScreen(androidx.fragment.app.r0 transaction, Fragment fragment) {
        transaction.n(fragment);
    }

    private final FragmentManager findFragmentManagerForReactRootView(com.facebook.react.x0 rootView) {
        boolean z11;
        Context context = rootView.getContext();
        while (true) {
            z11 = context instanceof androidx.fragment.app.u;
            if (z11 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z11) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity");
        }
        androidx.fragment.app.u uVar = (androidx.fragment.app.u) context;
        if (!uVar.getSupportFragmentManager().A0().isEmpty()) {
            try {
                return FragmentManager.m0(rootView).getChildFragmentManager();
            } catch (IllegalStateException unused) {
                return uVar.getSupportFragmentManager();
            }
        }
        FragmentManager supportFragmentManager = uVar.getSupportFragmentManager();
        p013kotlin.jvm.internal.s.h(supportFragmentManager);
        return supportFragmentManager;
    }

    private final t.a getActivityState(b0 screenFragmentWrapper) {
        return screenFragmentWrapper.getScreen().getActivityState();
    }

    private final void onScreenChanged() {
        this.needsUpdate = true;
        Context context = getContext();
        p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((com.facebook.react.uimanager.v0) context).b().runOnUiQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f55520a.performUpdates();
            }
        });
    }

    private final void removeMyFragments(FragmentManager fragmentManager) {
        androidx.fragment.app.r0 r0VarR = fragmentManager.r();
        p013kotlin.jvm.internal.s.j(r0VarR, "beginTransaction(...)");
        boolean z11 = false;
        for (Fragment fragment : fragmentManager.A0()) {
            if ((fragment instanceof a0) && ((a0) fragment).getScreen().getContainer() == this) {
                r0VarR.n(fragment);
                z11 = true;
            }
        }
        if (z11) {
            r0VarR.j();
        }
    }

    private final void setFragmentManager(FragmentManager fm2) {
        this.fragmentManager = fm2;
        performUpdatesNow();
    }

    private final void setupFragmentManager() {
        boolean z11;
        jn0.h0 h0Var;
        ViewParent parent = this;
        while (true) {
            z11 = parent instanceof com.facebook.react.x0;
            if (z11 || (parent instanceof com.swmansion.rnscreens.gamma.common.b) || parent.getParent() == null) {
                break;
            } else {
                parent = parent.getParent();
            }
        }
        if (parent instanceof t) {
            b0 fragmentWrapper = ((t) parent).getFragmentWrapper();
            if (fragmentWrapper != null) {
                this.parentScreenWrapper = fragmentWrapper;
                fragmentWrapper.addChildScreenContainer(this);
                FragmentManager childFragmentManager = fragmentWrapper.getFragment().getChildFragmentManager();
                p013kotlin.jvm.internal.s.j(childFragmentManager, "getChildFragmentManager(...)");
                setFragmentManager(childFragmentManager);
                h0Var = jn0.h0.f84049a;
            } else {
                h0Var = null;
            }
            if (h0Var == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached");
            }
            return;
        }
        if (!(parent instanceof com.swmansion.rnscreens.gamma.common.b)) {
            if (!z11) {
                throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
            }
            setFragmentManager(findFragmentManagerForReactRootView((com.facebook.react.x0) parent));
            return;
        }
        Fragment associatedFragment = ((com.swmansion.rnscreens.gamma.common.b) parent).getAssociatedFragment();
        if (associatedFragment != null) {
            FragmentManager childFragmentManager2 = associatedFragment.getChildFragmentManager();
            p013kotlin.jvm.internal.s.j(childFragmentManager2, "getChildFragmentManager(...)");
            setFragmentManager(childFragmentManager2);
        } else {
            throw new IllegalStateException(("[RNScreens] Parent " + parent + " returned nullish fragment").toString());
        }
    }

    protected b0 adapt(t screen) {
        p013kotlin.jvm.internal.s.k(screen, "screen");
        return new a0(screen);
    }

    public final void addScreen(t screen, int index) {
        p013kotlin.jvm.internal.s.k(screen, "screen");
        b0 b0VarAdapt = adapt(screen);
        screen.setFragmentWrapper(b0VarAdapt);
        this.screenWrappers.add(index, b0VarAdapt);
        screen.setContainer(this);
        onScreenChanged();
    }

    public final void attachBelowTop() {
        if (this.screenWrappers.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.r0 r0VarCreateTransaction = createTransaction();
        t topScreen = getTopScreen();
        p013kotlin.jvm.internal.s.i(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        Fragment fragment = topScreen.getFragment();
        p013kotlin.jvm.internal.s.i(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        detachScreen(r0VarCreateTransaction, fragment);
        ArrayList<b0> arrayList = this.screenWrappers;
        attachScreen(r0VarCreateTransaction, arrayList.get(arrayList.size() - 2).getFragment());
        Fragment fragment2 = topScreen.getFragment();
        p013kotlin.jvm.internal.s.i(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        attachScreen(r0VarCreateTransaction, fragment2);
        r0VarCreateTransaction.j();
    }

    protected final androidx.fragment.app.r0 createTransaction() {
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction");
        }
        androidx.fragment.app.r0 r0VarX = fragmentManager.r().x(true);
        p013kotlin.jvm.internal.s.j(r0VarX, "setReorderingAllowed(...)");
        return r0VarX;
    }

    public final void detachBelowTop() {
        if (this.screenWrappers.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.r0 r0VarCreateTransaction = createTransaction();
        ArrayList<b0> arrayList = this.screenWrappers;
        detachScreen(r0VarCreateTransaction, arrayList.get(arrayList.size() - 2).getFragment());
        r0VarCreateTransaction.j();
    }

    public final t getScreenAt(int index) {
        return this.screenWrappers.get(index).getScreen();
    }

    public final int getScreenCount() {
        return this.screenWrappers.size();
    }

    public final b0 getScreenFragmentWrapperAt(int index) {
        b0 b0Var = this.screenWrappers.get(index);
        p013kotlin.jvm.internal.s.j(b0Var, "get(...)");
        return b0Var;
    }

    public t getTopScreen() {
        Object next;
        Iterator<T> it = this.screenWrappers.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (getActivityState((b0) next) != t.a.ON_TOP);
        b0 b0Var = (b0) next;
        if (b0Var != null) {
            return b0Var.getScreen();
        }
        return null;
    }

    public boolean hasScreen(b0 screenFragmentWrapper) {
        return p013kotlin.collections.v.g0(this.screenWrappers, screenFragmentWrapper);
    }

    public final boolean isNested() {
        return this.parentScreenWrapper != null;
    }

    protected void notifyContainerUpdate() {
        b0 fragmentWrapper;
        t topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.onContainerUpdate();
    }

    public final void notifyTopDetached() {
        t topScreen = getTopScreen();
        p013kotlin.jvm.internal.s.i(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        if (getContext() instanceof ReactContext) {
            int iE = com.facebook.react.uimanager.b1.e(getContext());
            Context context = getContext();
            p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherC = com.facebook.react.uimanager.b1.c((ReactContext) context, topScreen.getId());
            if (eventDispatcherC != null) {
                eventDispatcherC.h(new com.swmansion.rnscreens.events.h(iE, topScreen.getId()));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttached = true;
        setupFragmentManager();
    }

    public final void onChildUpdate() {
        performUpdatesNow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager != null && !fragmentManager.N0()) {
            removeMyFragments(fragmentManager);
            fragmentManager.j0();
        }
        b0 b0Var = this.parentScreenWrapper;
        if (b0Var != null) {
            b0Var.removeChildScreenContainer(this);
        }
        this.parentScreenWrapper = null;
        super.onDetachedFromWindow();
        this.isAttached = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            } else {
                removeViewAt(childCount);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).measure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void onUpdate() {
        androidx.fragment.app.r0 r0VarCreateTransaction = createTransaction();
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager == null) {
            throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
        }
        HashSet hashSet = new HashSet(fragmentManager.A0());
        Iterator<b0> it = this.screenWrappers.iterator();
        p013kotlin.jvm.internal.s.j(it, "iterator(...)");
        while (it.hasNext()) {
            b0 next = it.next();
            p013kotlin.jvm.internal.s.j(next, "next(...)");
            b0 b0Var = next;
            if (getActivityState(b0Var) == t.a.INACTIVE && b0Var.getFragment().isAdded()) {
                detachScreen(r0VarCreateTransaction, b0Var.getFragment());
            }
            hashSet.remove(b0Var.getFragment());
        }
        boolean z11 = false;
        if (!hashSet.isEmpty()) {
            for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                if ((fragment instanceof a0) && ((a0) fragment).getScreen().getContainer() == null) {
                    detachScreen(r0VarCreateTransaction, fragment);
                }
            }
        }
        boolean z12 = getTopScreen() == null;
        ArrayList arrayList = new ArrayList();
        Iterator<b0> it2 = this.screenWrappers.iterator();
        p013kotlin.jvm.internal.s.j(it2, "iterator(...)");
        while (it2.hasNext()) {
            b0 next2 = it2.next();
            p013kotlin.jvm.internal.s.j(next2, "next(...)");
            b0 b0Var2 = next2;
            t.a activityState = getActivityState(b0Var2);
            t.a aVar = t.a.INACTIVE;
            if (activityState != aVar && !b0Var2.getFragment().isAdded()) {
                attachScreen(r0VarCreateTransaction, b0Var2.getFragment());
                z11 = true;
            } else if (activityState != aVar && z11) {
                detachScreen(r0VarCreateTransaction, b0Var2.getFragment());
                arrayList.add(b0Var2);
            }
            b0Var2.getScreen().setTransitioning(z12);
        }
        Iterator it3 = arrayList.iterator();
        p013kotlin.jvm.internal.s.j(it3, "iterator(...)");
        while (it3.hasNext()) {
            Object next3 = it3.next();
            p013kotlin.jvm.internal.s.j(next3, "next(...)");
            attachScreen(r0VarCreateTransaction, ((b0) next3).getFragment());
        }
        r0VarCreateTransaction.j();
    }

    public final void performUpdates() {
        FragmentManager fragmentManager;
        if (this.needsUpdate && this.isAttached && (fragmentManager = this.fragmentManager) != null) {
            if (fragmentManager == null || !fragmentManager.N0()) {
                this.needsUpdate = false;
                onUpdate();
                notifyContainerUpdate();
            }
        }
    }

    protected final void performUpdatesNow() {
        this.needsUpdate = true;
        performUpdates();
    }

    public void removeAllScreens() {
        Iterator<b0> it = this.screenWrappers.iterator();
        p013kotlin.jvm.internal.s.j(it, "iterator(...)");
        while (it.hasNext()) {
            b0 next = it.next();
            p013kotlin.jvm.internal.s.j(next, "next(...)");
            next.getScreen().setContainer(null);
        }
        this.screenWrappers.clear();
        onScreenChanged();
    }

    public void removeScreenAt(int index) {
        this.screenWrappers.get(index).getScreen().setContainer(null);
        this.screenWrappers.remove(index);
        onScreenChanged();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.isLayoutEnqueued || this.layoutCallback == null) {
            return;
        }
        this.isLayoutEnqueued = true;
        com.facebook.react.modules.core.b.INSTANCE.a().k(com.facebook.react.modules.core.b.a.NATIVE_ANIMATED_MODULE, this.layoutCallback);
    }
}
