package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ezvcard.property.Gender;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\b\u0003\n\u0002\b\u0012*\u00028;\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001KB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u001aH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0014¢\u0006\u0004\b#\u0010\"J=\u0010%\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f¢\u0006\u0004\b%\u0010&J/\u0010*\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\b\b\u0002\u0010)\u001a\u00020\f¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00100R\u0016\u00107\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00103R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\bR\u001c\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u000bR\u0014\u0010D\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010F¨\u0006L"}, d2 = {"Lcom/swmansion/rnscreens/y;", "Lcom/facebook/react/views/view/e;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "Lcom/swmansion/rnscreens/t;", "requireScreenParent", "()Lcom/swmansion/rnscreens/t;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "requireSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "", "state", "sheetTopInStableState", "(I)I", "", "slideOffset", "sheetTopWhileDragging", "(F)I", "", "changed", "left", "top", "right", "bottom", "Ljn0/h0;", "onLayout", "(ZIIII)V", "behavior", "registerWithSheetBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "unregisterWithSheetBehavior", "onAttachedToWindow", "()V", "onDetachedFromWindow", "containerHeight", "onParentLayout", "(ZIIIII)V", "footerHeight", "sheetTop", "bottomInset", "layoutFooterOnYAxis", "(IIII)V", "Lcom/facebook/react/bridge/ReactContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "lastContainerHeight", "I", "lastStableSheetState", "isAnimationControlledByKeyboard", "Z", "lastSlideOffset", Gender.FEMALE, "lastBottomInset", "isCallbackRegistered", "com/swmansion/rnscreens/y$c", "insetsAnimation", "Lcom/swmansion/rnscreens/y$c;", "com/swmansion/rnscreens/y$b", "footerCallback", "Lcom/swmansion/rnscreens/y$b;", "getScreenParent", "screenParent", "getSheetBehavior", "sheetBehavior", "getHasReceivedInitialLayoutFromParent", "()Z", "hasReceivedInitialLayoutFromParent", "getReactHeight", "()I", "reactHeight", "getReactWidth", "reactWidth", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class y extends com.facebook.react.views.view.e {
    public static final String TAG = "ScreenFooter";
    private b footerCallback;
    private final c insetsAnimation;
    private boolean isAnimationControlledByKeyboard;
    private boolean isCallbackRegistered;
    private int lastBottomInset;
    private int lastContainerHeight;
    private float lastSlideOffset;
    private int lastStableSheetState;
    private final ReactContext reactContext;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/swmansion/rnscreens/y$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "Ljn0/h0;", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends BottomSheetBehavior.g {
        b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(View bottomSheet, float slideOffset) {
            p013kotlin.jvm.internal.s.k(bottomSheet, "bottomSheet");
            y.this.lastSlideOffset = Math.max(slideOffset, BitmapDescriptorFactory.HUE_RED);
            if (y.this.isAnimationControlledByKeyboard) {
                return;
            }
            y yVar = y.this;
            int i11 = yVar.lastContainerHeight;
            int reactHeight = y.this.getReactHeight();
            y yVar2 = y.this;
            yVar.layoutFooterOnYAxis(i11, reactHeight, yVar2.sheetTopWhileDragging(yVar2.lastSlideOffset), y.this.lastBottomInset);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(View bottomSheet, int newState) {
            p013kotlin.jvm.internal.s.k(bottomSheet, "bottomSheet");
            if (com.swmansion.rnscreens.bottomsheet.i.INSTANCE.isStateStable(newState)) {
                if (newState == 3 || newState == 4 || newState == 6) {
                    y yVar = y.this;
                    yVar.layoutFooterOnYAxis(yVar.lastContainerHeight, y.this.getReactHeight(), y.this.sheetTopInStableState(newState), y.this.lastBottomInset);
                }
                y.this.lastStableSheetState = newState;
            }
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/swmansion/rnscreens/y$c", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "Landroidx/core/view/WindowInsetsAnimationCompat;", "animation", "Landroidx/core/view/WindowInsetsAnimationCompat$a;", "bounds", "onStart", "(Landroidx/core/view/WindowInsetsAnimationCompat;Landroidx/core/view/WindowInsetsAnimationCompat$a;)Landroidx/core/view/WindowInsetsAnimationCompat$a;", "Landroidx/core/view/WindowInsetsCompat;", "insets", "", "runningAnimations", "onProgress", "(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;", "Ljn0/h0;", "onEnd", "(Landroidx/core/view/WindowInsetsAnimationCompat;)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends WindowInsetsAnimationCompat.Callback {
        c() {
            super(0);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
        public void onEnd(WindowInsetsAnimationCompat animation) {
            p013kotlin.jvm.internal.s.k(animation, "animation");
            y.this.isAnimationControlledByKeyboard = false;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
        public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnimations) {
            p013kotlin.jvm.internal.s.k(insets, "insets");
            p013kotlin.jvm.internal.s.k(runningAnimations, "runningAnimations");
            y.this.lastBottomInset = insets.f(WindowInsetsCompat.n.c()).f84927d - insets.f(WindowInsetsCompat.n.f()).f84927d;
            y yVar = y.this;
            int i11 = yVar.lastContainerHeight;
            int reactHeight = y.this.getReactHeight();
            y yVar2 = y.this;
            yVar.layoutFooterOnYAxis(i11, reactHeight, yVar2.sheetTopWhileDragging(yVar2.lastSlideOffset), y.this.lastBottomInset);
            return insets;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
        public WindowInsetsAnimationCompat.a onStart(WindowInsetsAnimationCompat animation, WindowInsetsAnimationCompat.a bounds) {
            p013kotlin.jvm.internal.s.k(animation, "animation");
            p013kotlin.jvm.internal.s.k(bounds, "bounds");
            y.this.isAnimationControlledByKeyboard = true;
            WindowInsetsAnimationCompat.a aVarOnStart = super.onStart(animation, bounds);
            p013kotlin.jvm.internal.s.j(aVarOnStart, "onStart(...)");
            return aVarOnStart;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ReactContext reactContext) {
        super(reactContext);
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.lastStableSheetState = 5;
        c cVar = new c();
        this.insetsAnimation = cVar;
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Context detached from activity while creating ScreenFooter");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        p013kotlin.jvm.internal.s.j(decorView, "getDecorView(...)");
        ViewCompat.L0(decorView, cVar);
        this.footerCallback = new b();
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        return this.lastContainerHeight > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getReactHeight() {
        return getMeasuredHeight();
    }

    private final int getReactWidth() {
        return getMeasuredWidth();
    }

    private final t getScreenParent() {
        ViewParent parent = getParent();
        if (parent instanceof t) {
            return (t) parent;
        }
        return null;
    }

    private final BottomSheetBehavior<t> getSheetBehavior() {
        return requireScreenParent().getSheetBehavior();
    }

    public static /* synthetic */ void layoutFooterOnYAxis$default(y yVar, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        yVar.layoutFooterOnYAxis(i11, i12, i13, i14);
    }

    private final t requireScreenParent() {
        t screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final BottomSheetBehavior<t> requireSheetBehavior() {
        BottomSheetBehavior<t> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            return sheetBehavior;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int sheetTopInStableState(int state) {
        BottomSheetBehavior<t> bottomSheetBehaviorRequireSheetBehavior = requireSheetBehavior();
        if (state == 3) {
            return bottomSheetBehaviorRequireSheetBehavior.s0();
        }
        if (state == 4) {
            return this.lastContainerHeight - bottomSheetBehaviorRequireSheetBehavior.v0();
        }
        if (state == 5) {
            return this.lastContainerHeight;
        }
        if (state == 6) {
            return (int) (this.lastContainerHeight * (1 - bottomSheetBehaviorRequireSheetBehavior.t0()));
        }
        throw new IllegalArgumentException("[RNScreens] use of stable-state method for unstable state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int sheetTopWhileDragging(float slideOffset) {
        t screenParent = getScreenParent();
        return screenParent != null ? screenParent.getTop() : (int) mt.a.d(sheetTopInStableState(4), sheetTopInStableState(3), slideOffset);
    }

    public final ReactContext getReactContext() {
        return this.reactContext;
    }

    public final void layoutFooterOnYAxis(int containerHeight, int footerHeight, int sheetTop, int bottomInset) {
        int iMax = ((containerHeight - footerHeight) - sheetTop) - Math.max(bottomInset, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(iMax, 0));
        setBottom(getTop() + reactHeight);
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<t> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            registerWithSheetBehavior(sheetBehavior);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<t> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            unregisterWithSheetBehavior(sheetBehavior);
        }
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (getHasReceivedInitialLayoutFromParent()) {
            layoutFooterOnYAxis(this.lastContainerHeight, bottom - top, sheetTopInStableState(requireSheetBehavior().w0()), this.lastBottomInset);
        }
    }

    public final void onParentLayout(boolean changed, int left, int top, int right, int bottom, int containerHeight) {
        this.lastContainerHeight = containerHeight;
        layoutFooterOnYAxis$default(this, containerHeight, getReactHeight(), sheetTopInStableState(requireSheetBehavior().w0()), 0, 8, null);
    }

    public final void registerWithSheetBehavior(BottomSheetBehavior<t> behavior) {
        p013kotlin.jvm.internal.s.k(behavior, "behavior");
        if (this.isCallbackRegistered) {
            return;
        }
        behavior.c0(this.footerCallback);
        this.isCallbackRegistered = true;
    }

    public final void unregisterWithSheetBehavior(BottomSheetBehavior<t> behavior) {
        p013kotlin.jvm.internal.s.k(behavior, "behavior");
        if (this.isCallbackRegistered) {
            behavior.G0(this.footerCallback);
            this.isCallbackRegistered = false;
        }
    }
}
