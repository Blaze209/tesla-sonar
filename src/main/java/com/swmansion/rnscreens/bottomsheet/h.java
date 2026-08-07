package com.swmansion.rnscreens.bottomsheet;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import androidx.fragment.app.Fragment;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.u;
import com.facebook.react.uimanager.v0;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.k;
import com.swmansion.rnscreens.l;
import com.swmansion.rnscreens.m;
import com.swmansion.rnscreens.n;
import com.swmansion.rnscreens.t;
import com.swmansion.rnscreens.t0;
import com.swmansion.rnscreens.v;
import com.swmansion.rnscreens.w;
import com.swmansion.rnscreens.y;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0003HIJB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u000fH\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020(2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00101R$\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R*\u00107\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00104\u0012\u0004\b9\u0010\f\u001a\u0004\b8\u00106R\u0018\u0010;\u001a\u00060:R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u00060=R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006K"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/h;", "Landroidx/lifecycle/u;", "Landroidx/core/view/a0;", "Lcom/swmansion/rnscreens/t;", AnalyticsContext.Screen, "<init>", "(Lcom/swmansion/rnscreens/t;)V", "Landroid/view/View;", "requireDecorView", "()Landroid/view/View;", "Ljn0/h0;", "handleHostFragmentOnStart", "()V", "handleHostFragmentOnResume", "handleHostFragmentOnPause", "", "newState", "onSheetStateChanged", "(I)V", "state", "", "shouldDismissSheetInState", "(I)Z", "tryResolveContainerHeight", "()Ljava/lang/Integer;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$a;", "event", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "Lcom/swmansion/rnscreens/m;", "keyboardState", "selectedDetentIndex", "configureBottomSheetBehaviour$react_native_screens_release", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/swmansion/rnscreens/m;I)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "configureBottomSheetBehaviour", "v", "Landroidx/core/view/WindowInsetsCompat;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Lcom/swmansion/rnscreens/t;", "getScreen", "()Lcom/swmansion/rnscreens/t;", "isKeyboardVisible", "Z", "Lcom/swmansion/rnscreens/m;", "value", "lastStableDetentIndex", "I", "getLastStableDetentIndex", "()I", "lastStableState", "getLastStableState", "getLastStableState$annotations", "Lcom/swmansion/rnscreens/bottomsheet/h$c;", "sheetStateObserver", "Lcom/swmansion/rnscreens/bottomsheet/h$c;", "Lcom/swmansion/rnscreens/bottomsheet/h$b;", "keyboardHandlerCallback", "Lcom/swmansion/rnscreens/bottomsheet/h$b;", "getSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "sheetBehavior", "Lcom/swmansion/rnscreens/t0;", "getStackFragment", "()Lcom/swmansion/rnscreens/t0;", "stackFragment", "Companion", "b", "c", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements u, a0 {
    public static final String TAG = "SheetDelegate";
    private boolean isKeyboardVisible;
    private final b keyboardHandlerCallback;
    private m keyboardState;
    private int lastStableDetentIndex;
    private int lastStableState;
    private final t screen;
    private final c sheetStateObserver;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/h$b;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "<init>", "(Lcom/swmansion/rnscreens/bottomsheet/h;)V", "Landroid/view/View;", "bottomSheet", "", "newState", "Ljn0/h0;", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class b extends BottomSheetBehavior.g {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(View bottomSheet, float slideOffset) {
            s.k(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(View bottomSheet, int newState) {
            s.k(bottomSheet, "bottomSheet");
            if (newState == 4 && WindowInsetsCompat.y(bottomSheet.getRootWindowInsets()).q(WindowInsetsCompat.n.c())) {
                bottomSheet.requestFocus();
                ((InputMethodManager) h.this.getScreen().getReactContext().getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(bottomSheet.getWindowToken(), 0);
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/h$c;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "<init>", "(Lcom/swmansion/rnscreens/bottomsheet/h;)V", "Landroid/view/View;", "bottomSheet", "", "newState", "Ljn0/h0;", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class c extends BottomSheetBehavior.g {
        public c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(View bottomSheet, float slideOffset) {
            s.k(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(View bottomSheet, int newState) {
            s.k(bottomSheet, "bottomSheet");
            h.this.onSheetStateChanged(newState);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.a.values().length];
            try {
                iArr[Lifecycle.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public h(t screen) {
        s.k(screen, "screen");
        this.screen = screen;
        this.keyboardState = l.INSTANCE;
        this.lastStableDetentIndex = screen.getSheetInitialDetentIndex();
        this.lastStableState = i.INSTANCE.sheetStateFromDetentIndex(screen.getSheetInitialDetentIndex(), screen.getSheetDetents().size());
        c cVar = new c();
        this.sheetStateObserver = cVar;
        this.keyboardHandlerCallback = new b();
        screen.getFragment();
        Fragment fragment = screen.getFragment();
        s.h(fragment);
        fragment.getLifecycle().a(this);
        BottomSheetBehavior<t> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalStateException("[RNScreens] Sheet delegate accepts screen with initialized sheet behaviour only.");
        }
        sheetBehavior.c0(cVar);
    }

    public static /* synthetic */ BottomSheetBehavior configureBottomSheetBehaviour$react_native_screens_release$default(h hVar, BottomSheetBehavior bottomSheetBehavior, m mVar, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            mVar = l.INSTANCE;
        }
        if ((i12 & 4) != 0) {
            i11 = hVar.lastStableDetentIndex;
        }
        return hVar.configureBottomSheetBehaviour$react_native_screens_release(bottomSheetBehavior, mVar, i11);
    }

    public static /* synthetic */ void getLastStableState$annotations() {
    }

    private final BottomSheetBehavior<t> getSheetBehavior() {
        return this.screen.getSheetBehavior();
    }

    private final t0 getStackFragment() {
        Fragment fragment = this.screen.getFragment();
        s.i(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
        return (t0) fragment;
    }

    private final void handleHostFragmentOnPause() {
        com.swmansion.rnscreens.j.INSTANCE.removeOnApplyWindowInsetsListener(this);
    }

    private final void handleHostFragmentOnResume() {
        com.swmansion.rnscreens.j.INSTANCE.addOnApplyWindowInsetsListener(this);
    }

    private final void handleHostFragmentOnStart() {
        com.swmansion.rnscreens.j.INSTANCE.registerOnView(requireDecorView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSheetStateChanged(int newState) {
        i iVar = i.INSTANCE;
        boolean zIsStateStable = iVar.isStateStable(newState);
        if (zIsStateStable) {
            this.lastStableState = newState;
            this.lastStableDetentIndex = iVar.detentIndexFromSheetState(newState, this.screen.getSheetDetents().size());
        }
        this.screen.onSheetDetentChanged$react_native_screens_release(this.lastStableDetentIndex, zIsStateStable);
        if (shouldDismissSheetInState(newState)) {
            getStackFragment().dismissSelf$react_native_screens_release();
        }
    }

    private final View requireDecorView() {
        Activity currentActivity = this.screen.getReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Attempt to access activity on detached context");
        }
        View decorView = currentActivity.getWindow().getDecorView();
        s.j(decorView, "getDecorView(...)");
        return decorView;
    }

    private final boolean shouldDismissSheetInState(int state) {
        return state == 5;
    }

    private final Integer tryResolveContainerHeight() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        DisplayMetrics displayMetrics;
        v container = this.screen.getContainer();
        if (container != null) {
            return Integer.valueOf(container.getHeight());
        }
        v0 reactContext = this.screen.getReactContext();
        Resources resources = reactContext.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return Integer.valueOf(displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = reactContext.getSystemService("window");
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null && (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                return Integer.valueOf(bounds.height());
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0157  */
    public final BottomSheetBehavior<t> configureBottomSheetBehaviour$react_native_screens_release(BottomSheetBehavior<t> behavior, m keyboardState, int selectedDetentIndex) {
        Integer numValueOf;
        s.k(behavior, "behavior");
        s.k(keyboardState, "keyboardState");
        Integer numTryResolveContainerHeight = tryResolveContainerHeight();
        if (numTryResolveContainerHeight == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration");
        }
        behavior.Q0(true);
        behavior.L0(true);
        behavior.c0(this.sheetStateObserver);
        y footer = this.screen.getFooter();
        if (footer != null) {
            footer.registerWithSheetBehavior(behavior);
        }
        if (keyboardState instanceof l) {
            int size = this.screen.getSheetDetents().size();
            if (size != 1) {
                if (size == 2) {
                    return a.useTwoDetents(behavior, Integer.valueOf(i.INSTANCE.sheetStateFromDetentIndex(selectedDetentIndex, this.screen.getSheetDetents().size())), Integer.valueOf((int) (this.screen.getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), Integer.valueOf((int) (this.screen.getSheetDetents().get(1).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))));
                }
                if (size == 3) {
                    return a.useThreeDetents(behavior, Integer.valueOf(i.INSTANCE.sheetStateFromDetentIndex(selectedDetentIndex, this.screen.getSheetDetents().size())), Integer.valueOf((int) (this.screen.getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), Float.valueOf((float) (this.screen.getSheetDetents().get(1).doubleValue() / this.screen.getSheetDetents().get(2).doubleValue())), Integer.valueOf((int) ((((double) 1) - this.screen.getSheetDetents().get(2).doubleValue()) * ((double) numTryResolveContainerHeight.intValue()))));
                }
                throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().size() + ". Expected at most 3.");
            }
            if (j.isSheetFitToContents(this.screen)) {
                w contentWrapper = this.screen.getContentWrapper();
                if (contentWrapper != null) {
                    numValueOf = Integer.valueOf(contentWrapper.getHeight());
                    if (!j.isLaidOutOrHasCachedLayout(contentWrapper)) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            } else {
                numValueOf = Integer.valueOf((int) (((Number) p013kotlin.collections.v.o0(this.screen.getSheetDetents())).doubleValue() * ((double) numTryResolveContainerHeight.intValue())));
            }
            a.useSingleDetent$default(behavior, numValueOf, false, 2, null);
            return behavior;
        }
        if (!(keyboardState instanceof n)) {
            if (!(keyboardState instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            behavior.G0(this.keyboardHandlerCallback);
            int size2 = this.screen.getSheetDetents().size();
            if (size2 == 1) {
                return a.useSingleDetent(behavior, Integer.valueOf((int) (((Number) p013kotlin.collections.v.o0(this.screen.getSheetDetents())).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), false);
            }
            if (size2 == 2) {
                return a.useTwoDetents$default(behavior, null, Integer.valueOf((int) (this.screen.getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), Integer.valueOf((int) (this.screen.getSheetDetents().get(1).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), 1, null);
            }
            if (size2 == 3) {
                return a.useThreeDetents$default(behavior, null, Integer.valueOf((int) (this.screen.getSheetDetents().get(0).doubleValue() * ((double) numTryResolveContainerHeight.intValue()))), Float.valueOf((float) (this.screen.getSheetDetents().get(1).doubleValue() / this.screen.getSheetDetents().get(2).doubleValue())), Integer.valueOf((int) ((((double) 1) - this.screen.getSheetDetents().get(2).doubleValue()) * ((double) numTryResolveContainerHeight.intValue()))), 1, null);
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().size() + ". Expected at most 3.");
        }
        int size3 = this.screen.getSheetDetents().size();
        if (size3 == 1) {
            behavior.c0(this.keyboardHandlerCallback);
            return behavior;
        }
        if (size3 == 2) {
            a.useTwoDetents$default(behavior, 3, null, null, 6, null);
            behavior.c0(this.keyboardHandlerCallback);
            return behavior;
        }
        if (size3 == 3) {
            a.useThreeDetents$default(behavior, 3, null, null, null, 14, null);
            behavior.c0(this.keyboardHandlerCallback);
            return behavior;
        }
        throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().size() + ". Expected at most 3.");
    }

    public final int getLastStableDetentIndex() {
        return this.lastStableDetentIndex;
    }

    public final int getLastStableState() {
        return this.lastStableState;
    }

    public final t getScreen() {
        return this.screen;
    }

    @Override // androidx.core.view.a0
    public WindowInsetsCompat onApplyWindowInsets(View v11, WindowInsetsCompat insets) {
        s.k(v11, "v");
        s.k(insets, "insets");
        boolean zQ = insets.q(WindowInsetsCompat.n.c());
        k5.e eVarF = insets.f(WindowInsetsCompat.n.c());
        s.j(eVarF, "getInsets(...)");
        if (zQ) {
            this.isKeyboardVisible = true;
            this.keyboardState = new n(eVarF.f84927d);
            BottomSheetBehavior<t> sheetBehavior = getSheetBehavior();
            if (sheetBehavior != null) {
                configureBottomSheetBehaviour$react_native_screens_release$default(this, sheetBehavior, this.keyboardState, 0, 4, null);
            }
            k5.e eVarF2 = insets.f(WindowInsetsCompat.n.f());
            s.j(eVarF2, "getInsets(...)");
            WindowInsetsCompat windowInsetsCompatA = new WindowInsetsCompat.a(insets).b(WindowInsetsCompat.n.f(), k5.e.c(eVarF2.f84924a, eVarF2.f84925b, eVarF2.f84926c, 0)).a();
            s.j(windowInsetsCompatA, "build(...)");
            return windowInsetsCompatA;
        }
        BottomSheetBehavior<t> sheetBehavior2 = getSheetBehavior();
        if (sheetBehavior2 != null) {
            if (this.isKeyboardVisible) {
                configureBottomSheetBehaviour$react_native_screens_release$default(this, sheetBehavior2, k.INSTANCE, 0, 4, null);
            } else {
                m mVar = this.keyboardState;
                l lVar = l.INSTANCE;
                if (!s.f(mVar, lVar)) {
                    configureBottomSheetBehaviour$react_native_screens_release$default(this, sheetBehavior2, lVar, 0, 4, null);
                }
            }
        }
        this.keyboardState = l.INSTANCE;
        this.isKeyboardVisible = false;
        k5.e eVarF3 = insets.f(WindowInsetsCompat.n.f());
        s.j(eVarF3, "getInsets(...)");
        WindowInsetsCompat windowInsetsCompatA2 = new WindowInsetsCompat.a(insets).b(WindowInsetsCompat.n.f(), k5.e.c(eVarF3.f84924a, eVarF3.f84925b, eVarF3.f84926c, 0)).a();
        s.j(windowInsetsCompatA2, "build(...)");
        return windowInsetsCompatA2;
    }

    @Override // androidx.p003lifecycle.u
    public void onStateChanged(LifecycleOwner source, Lifecycle.a event) {
        s.k(source, "source");
        s.k(event, "event");
        int i11 = d.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            handleHostFragmentOnStart();
        } else if (i11 == 2) {
            handleHostFragmentOnResume();
        } else {
            if (i11 != 3) {
                return;
            }
            handleHostFragmentOnPause();
        }
    }
}
