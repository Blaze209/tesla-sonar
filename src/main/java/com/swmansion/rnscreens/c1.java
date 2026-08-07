package com.swmansion.rnscreens;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\b\u0004*\u0001*\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ#\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0014\u0010\u0003J!\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b \u0010\u0019J!\u0010#\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\"\u0010\u0019J+\u0010%\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b$\u0010\u001eR\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/swmansion/rnscreens/c1;", "", "<init>", "()V", "Lcom/swmansion/rnscreens/t;", AnalyticsContext.Screen, "Lcom/swmansion/rnscreens/t$g;", "trait", "findScreenForTrait", "(Lcom/swmansion/rnscreens/t;Lcom/swmansion/rnscreens/t$g;)Lcom/swmansion/rnscreens/t;", "findParentWithTraitSet", "childScreenWithTraitSet", "", "checkTraitForScreen", "(Lcom/swmansion/rnscreens/t;Lcom/swmansion/rnscreens/t$g;)Z", "Ljn0/h0;", "applyDidSetOrientation$react_native_screens_release", "applyDidSetOrientation", "applyDidSetStatusBarAppearance$react_native_screens_release", "applyDidSetStatusBarAppearance", "applyDidSetNavigationBarAppearance$react_native_screens_release", "applyDidSetNavigationBarAppearance", "Landroid/app/Activity;", "activity", "setOrientation$react_native_screens_release", "(Lcom/swmansion/rnscreens/t;Landroid/app/Activity;)V", "setOrientation", "Lcom/facebook/react/bridge/ReactContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "setStyle$react_native_screens_release", "(Lcom/swmansion/rnscreens/t;Landroid/app/Activity;Lcom/facebook/react/bridge/ReactContext;)V", "setStyle", "setHidden$react_native_screens_release", "setHidden", "setNavigationBarHidden$react_native_screens_release", "setNavigationBarHidden", "trySetWindowTraits$react_native_screens_release", "trySetWindowTraits", "didSetOrientation", "Z", "didSetStatusBarAppearance", "didSetNavigationBarAppearance", "com/swmansion/rnscreens/c1$b", "windowInsetsListener", "Lcom/swmansion/rnscreens/c1$b;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c1 {
    private static boolean didSetNavigationBarAppearance;
    private static boolean didSetOrientation;
    private static boolean didSetStatusBarAppearance;
    public static final c1 INSTANCE = new c1();
    private static b windowInsetsListener = new b();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.g.values().length];
            try {
                iArr[t.g.ORIENTATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.g.STYLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.g.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.g.ANIMATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.g.NAVIGATION_BAR_HIDDEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/swmansion/rnscreens/c1$b", "Landroidx/core/view/a0;", "Landroid/view/View;", "v", "Landroidx/core/view/WindowInsetsCompat;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements androidx.core.view.a0 {
        b() {
        }

        @Override // androidx.core.view.a0
        public WindowInsetsCompat onApplyWindowInsets(View v11, WindowInsetsCompat insets) {
            p013kotlin.jvm.internal.s.k(v11, "v");
            p013kotlin.jvm.internal.s.k(insets, "insets");
            WindowInsetsCompat windowInsetsCompatB0 = ViewCompat.b0(v11, insets);
            p013kotlin.jvm.internal.s.j(windowInsetsCompatB0, "onApplyWindowInsets(...)");
            if (Build.VERSION.SDK_INT < 30) {
                WindowInsetsCompat windowInsetsCompatR = windowInsetsCompatB0.r(windowInsetsCompatB0.k(), 0, windowInsetsCompatB0.l(), windowInsetsCompatB0.j());
                p013kotlin.jvm.internal.s.j(windowInsetsCompatR, "replaceSystemWindowInsets(...)");
                return windowInsetsCompatR;
            }
            k5.e eVarF = windowInsetsCompatB0.f(WindowInsetsCompat.n.g());
            p013kotlin.jvm.internal.s.j(eVarF, "getInsets(...)");
            WindowInsetsCompat windowInsetsCompatA = new WindowInsetsCompat.a().b(WindowInsetsCompat.n.g(), k5.e.c(eVarF.f84924a, 0, eVarF.f84926c, eVarF.f84927d)).a();
            p013kotlin.jvm.internal.s.j(windowInsetsCompatA, "build(...)");
            return windowInsetsCompatA;
        }
    }

    private c1() {
    }

    private final boolean checkTraitForScreen(t screen, t.g trait) {
        int i11 = a.$EnumSwitchMapping$0[trait.ordinal()];
        if (i11 == 1) {
            return screen.getScreenOrientation() != null;
        }
        if (i11 == 2) {
            return screen.getStatusBarStyle() != null;
        }
        if (i11 == 3) {
            return screen.getIsStatusBarHidden() != null;
        }
        if (i11 == 4) {
            return screen.getIsStatusBarAnimated() != null;
        }
        if (i11 == 5) {
            return screen.getIsNavigationBarHidden() != null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final t childScreenWithTraitSet(t screen, t.g trait) {
        b0 fragmentWrapper;
        if (screen == null || (fragmentWrapper = screen.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator<v> it = fragmentWrapper.getChildScreenContainers().iterator();
        while (it.hasNext()) {
            t topScreen = it.next().getTopScreen();
            c1 c1Var = INSTANCE;
            t tVarChildScreenWithTraitSet = c1Var.childScreenWithTraitSet(topScreen, trait);
            if (tVarChildScreenWithTraitSet != null) {
                return tVarChildScreenWithTraitSet;
            }
            if (topScreen != null && c1Var.checkTraitForScreen(topScreen, trait)) {
                return topScreen;
            }
        }
        return null;
    }

    private final t findParentWithTraitSet(t screen, t.g trait) {
        for (ViewParent container = screen.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof t) {
                t tVar = (t) container;
                if (checkTraitForScreen(tVar, trait)) {
                    return tVar;
                }
            }
        }
        return null;
    }

    private final t findScreenForTrait(t screen, t.g trait) {
        t tVarChildScreenWithTraitSet = childScreenWithTraitSet(screen, trait);
        if (tVarChildScreenWithTraitSet != null) {
            return tVarChildScreenWithTraitSet;
        }
        return checkTraitForScreen(screen, trait) ? screen : findParentWithTraitSet(screen, trait);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHidden$lambda$1(boolean z11, WindowInsetsControllerCompat windowInsetsControllerCompat) {
        if (z11) {
            windowInsetsControllerCompat.c(WindowInsetsCompat.n.g());
        } else {
            windowInsetsControllerCompat.i(WindowInsetsCompat.n.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStyle$lambda$0(Activity activity, String str) {
        View decorView = activity.getWindow().getDecorView();
        p013kotlin.jvm.internal.s.j(decorView, "getDecorView(...)");
        new WindowInsetsControllerCompat(activity.getWindow(), decorView).g(p013kotlin.jvm.internal.s.f(str, "dark"));
    }

    public final void applyDidSetNavigationBarAppearance$react_native_screens_release() {
        didSetNavigationBarAppearance = true;
    }

    public final void applyDidSetOrientation$react_native_screens_release() {
        didSetOrientation = true;
    }

    public final void applyDidSetStatusBarAppearance$react_native_screens_release() {
        didSetStatusBarAppearance = true;
    }

    public final void setHidden$react_native_screens_release(t screen, Activity activity) {
        Boolean isStatusBarHidden;
        p013kotlin.jvm.internal.s.k(screen, "screen");
        if (activity == null) {
            return;
        }
        t tVarFindScreenForTrait = findScreenForTrait(screen, t.g.HIDDEN);
        final boolean zBooleanValue = (tVarFindScreenForTrait == null || (isStatusBarHidden = tVarFindScreenForTrait.getIsStatusBarHidden()) == null) ? false : isStatusBarHidden.booleanValue();
        Window window = activity.getWindow();
        final WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.a1
            @Override // java.lang.Runnable
            public final void run() {
                c1.setHidden$lambda$1(zBooleanValue, windowInsetsControllerCompat);
            }
        });
    }

    public final void setNavigationBarHidden$react_native_screens_release(t screen, Activity activity) {
        Boolean isNavigationBarHidden;
        p013kotlin.jvm.internal.s.k(screen, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        t tVarFindScreenForTrait = findScreenForTrait(screen, t.g.NAVIGATION_BAR_HIDDEN);
        if (!((tVarFindScreenForTrait == null || (isNavigationBarHidden = tVarFindScreenForTrait.getIsNavigationBarHidden()) == null) ? false : isNavigationBarHidden.booleanValue())) {
            new WindowInsetsControllerCompat(window, window.getDecorView()).i(WindowInsetsCompat.n.f());
            return;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        windowInsetsControllerCompat.c(WindowInsetsCompat.n.f());
        windowInsetsControllerCompat.h(2);
    }

    public final void setOrientation$react_native_screens_release(t screen, Activity activity) {
        Integer screenOrientation;
        p013kotlin.jvm.internal.s.k(screen, "screen");
        if (activity == null) {
            return;
        }
        t tVarFindScreenForTrait = findScreenForTrait(screen, t.g.ORIENTATION);
        activity.setRequestedOrientation((tVarFindScreenForTrait == null || (screenOrientation = tVarFindScreenForTrait.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
    }

    public final void setStyle$react_native_screens_release(t screen, final Activity activity, ReactContext context) {
        final String statusBarStyle;
        p013kotlin.jvm.internal.s.k(screen, "screen");
        if (activity == null || context == null) {
            return;
        }
        t tVarFindScreenForTrait = findScreenForTrait(screen, t.g.STYLE);
        if (tVarFindScreenForTrait == null || (statusBarStyle = tVarFindScreenForTrait.getStatusBarStyle()) == null) {
            statusBarStyle = "light";
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.b1
            @Override // java.lang.Runnable
            public final void run() {
                c1.setStyle$lambda$0(activity, statusBarStyle);
            }
        });
    }

    public final void trySetWindowTraits$react_native_screens_release(t screen, Activity activity, ReactContext context) {
        p013kotlin.jvm.internal.s.k(screen, "screen");
        if (didSetOrientation) {
            setOrientation$react_native_screens_release(screen, activity);
        }
        if (didSetStatusBarAppearance) {
            setStyle$react_native_screens_release(screen, activity, context);
            setHidden$react_native_screens_release(screen, activity);
        }
        if (didSetNavigationBarAppearance) {
            setNavigationBarHidden$react_native_screens_release(screen, activity);
        }
    }
}
