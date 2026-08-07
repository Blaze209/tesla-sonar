package com.swmansion.rnscreens;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0007J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010+J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\u0007J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u0007J\u000f\u00101\u001a\u00020\bH\u0000¢\u0006\u0004\b0\u0010\u0007J\u000f\u00103\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u0010\u0007J\u0019\u00106\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J+\u0010<\u001a\u00020\u00192\u0006\u00109\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010:2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b<\u0010=J!\u0010?\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u00192\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b?\u0010@J)\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u000eH\u0016¢\u0006\u0004\bE\u0010FJ)\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u000eH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bJ\u0010\u0007J\u000f\u0010K\u001a\u00020\bH\u0016¢\u0006\u0004\bK\u0010\u0007J\u0017\u0010L\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\bL\u0010\u0018J\u001f\u0010N\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00109\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0012H\u0016¢\u0006\u0004\bP\u0010\u0014J\u000f\u0010Q\u001a\u00020\bH\u0016¢\u0006\u0004\bQ\u0010\u0007R\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010UR\u0016\u0010V\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR$\u0010\\\u001a\u0004\u0018\u00010[8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR0\u0010c\u001a\u0010\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\b\u0018\u00010b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0016\u0010j\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010l\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR$\u0010n\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010\"\"\u0004\bq\u0010rR\u0014\u0010v\u001a\u00020s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006w"}, d2 = {"Lcom/swmansion/rnscreens/t0;", "Lcom/swmansion/rnscreens/a0;", "Lcom/swmansion/rnscreens/u0;", "Lcom/swmansion/rnscreens/t;", "screenView", "<init>", "(Lcom/swmansion/rnscreens/t;)V", "()V", "Ljn0/h0;", "notifyViewAppearTransitionEnd", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "createBottomSheetBehaviour", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", AnalyticsContext.Screen, "", "resolveBackgroundColor", "(Lcom/swmansion/rnscreens/t;)Ljava/lang/Integer;", "attachShapeToScreen", "", "shouldShowSearchBar", "()Z", "Landroid/view/Menu;", "menu", "updateToolbarMenu", "(Landroid/view/Menu;)V", "Landroid/view/View;", "findLastFocusedChild", "()Landroid/view/View;", "forceCreation", "Lcom/swmansion/rnscreens/bottomsheet/e;", "requireDimmingDelegate", "(Z)Lcom/swmansion/rnscreens/bottomsheet/e;", "Lcom/swmansion/rnscreens/bottomsheet/h;", "requireSheetDelegate", "()Lcom/swmansion/rnscreens/bottomsheet/h;", "isTranslucent", "removeToolbar", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "hidden", "setToolbarShadowHidden", "(Z)V", "translucent", "setToolbarTranslucent", "onContainerUpdate", "onViewAnimationEnd", "dismissSelf$react_native_screens_release", "dismissSelf", "onSheetCornerRadiusChange$react_native_screens_release", "onSheetCornerRadiusChange", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "transit", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "(IZI)Landroid/view/animation/Animation;", "Landroid/animation/Animator;", "onCreateAnimator", "(IZI)Landroid/animation/Animator;", "onStart", "onStop", "onPrepareOptionsMenu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "canNavigateBack", "dismissFromContainer", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroidx/appcompat/widget/Toolbar;", "isToolbarShadowHidden", "Z", "isToolbarTranslucent", "lastFocusedChild", "Landroid/view/View;", "Lcom/swmansion/rnscreens/c;", "searchView", "Lcom/swmansion/rnscreens/c;", "getSearchView", "()Lcom/swmansion/rnscreens/c;", "setSearchView", "(Lcom/swmansion/rnscreens/c;)V", "Lkotlin/Function1;", "onSearchViewCreate", "Lwn0/l;", "getOnSearchViewCreate", "()Lwn0/l;", "setOnSearchViewCreate", "(Lwn0/l;)V", "Lcom/swmansion/rnscreens/stack/views/e;", "coordinatorLayout", "Lcom/swmansion/rnscreens/stack/views/e;", "dimmingDelegate", "Lcom/swmansion/rnscreens/bottomsheet/e;", "sheetDelegate", "Lcom/swmansion/rnscreens/bottomsheet/h;", "getSheetDelegate$react_native_screens_release", "setSheetDelegate$react_native_screens_release", "(Lcom/swmansion/rnscreens/bottomsheet/h;)V", "Lcom/swmansion/rnscreens/m0;", "getScreenStack", "()Lcom/swmansion/rnscreens/m0;", "screenStack", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t0 extends a0 implements u0 {
    private AppBarLayout appBarLayout;
    private com.swmansion.rnscreens.stack.views.e coordinatorLayout;
    private com.swmansion.rnscreens.bottomsheet.e dimmingDelegate;
    private boolean isToolbarShadowHidden;
    private boolean isToolbarTranslucent;
    private View lastFocusedChild;
    private wn0.l<? super c, jn0.h0> onSearchViewCreate;
    private c searchView;
    private com.swmansion.rnscreens.bottomsheet.h sheetDelegate;
    private Toolbar toolbar;

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/t0$a", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "Landroidx/core/view/WindowInsetsCompat;", "insets", "", "Landroidx/core/view/WindowInsetsAnimationCompat;", "runningAnimations", "onProgress", "(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends WindowInsetsAnimationCompat.Callback {
        a() {
            super(0);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
        public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnimations) {
            p013kotlin.jvm.internal.s.k(insets, "insets");
            p013kotlin.jvm.internal.s.k(runningAnimations, "runningAnimations");
            return insets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ValidFragment"})
    public t0(t screenView) {
        super(screenView);
        p013kotlin.jvm.internal.s.k(screenView, "screenView");
    }

    private final void attachShapeToScreen(t screen) {
        float fMax = Math.max(com.facebook.react.uimanager.w.h(screen.getSheetCornerRadius()), BitmapDescriptorFactory.HUE_RED);
        st.k.b bVar = new st.k.b();
        bVar.B(0, fMax);
        bVar.G(0, fMax);
        st.k kVarM = bVar.m();
        p013kotlin.jvm.internal.s.j(kVarM, "build(...)");
        st.g gVar = new st.g(kVarM);
        Integer numResolveBackgroundColor = resolveBackgroundColor(screen);
        gVar.setTint(numResolveBackgroundColor != null ? numResolveBackgroundColor.intValue() : 0);
        screen.setBackground(gVar);
    }

    private final BottomSheetBehavior<t> createBottomSheetBehaviour() {
        return new BottomSheetBehavior<>();
    }

    private final View findLastFocusedChild() {
        View screen = getScreen();
        while (screen != null) {
            if (screen.isFocused()) {
                return screen;
            }
            screen = screen instanceof ViewGroup ? ((ViewGroup) screen).getFocusedChild() : null;
        }
        return null;
    }

    private final m0 getScreenStack() {
        v container = getScreen().getContainer();
        if (container instanceof m0) {
            return (m0) container;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
    }

    private final void notifyViewAppearTransitionEnd() {
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof m0) {
            ((m0) parent).onViewAppearTransitionEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateAnimator$lambda$10$lambda$9(com.swmansion.rnscreens.bottomsheet.e eVar, ValueAnimator anim) {
        p013kotlin.jvm.internal.s.k(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f11 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f11 != null) {
            eVar.getDimmingView().setAlpha(f11.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float onCreateAnimator$lambda$11(t0 t0Var, Number number) {
        return t0Var.getScreen().getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float onCreateAnimator$lambda$12(Number number) {
        return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateAnimator$lambda$15$lambda$14(t0 t0Var, ValueAnimator anim) {
        p013kotlin.jvm.internal.s.k(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f11 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f11 != null) {
            t0Var.getScreen().setTranslationY(f11.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateAnimator$lambda$19$lambda$18(com.swmansion.rnscreens.bottomsheet.e eVar, ValueAnimator anim) {
        p013kotlin.jvm.internal.s.k(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f11 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f11 != null) {
            eVar.getDimmingView().setAlpha(f11.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateAnimator$lambda$22$lambda$21(t0 t0Var, ValueAnimator anim) {
        p013kotlin.jvm.internal.s.k(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f11 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f11 != null) {
            t0Var.getScreen().setTranslationY(f11.floatValue());
        }
    }

    private final com.swmansion.rnscreens.bottomsheet.e requireDimmingDelegate(boolean forceCreation) {
        com.swmansion.rnscreens.bottomsheet.e eVar = this.dimmingDelegate;
        if (eVar == null || forceCreation) {
            if (eVar != null) {
                eVar.invalidate(getScreen().getSheetBehavior());
            }
            this.dimmingDelegate = new com.swmansion.rnscreens.bottomsheet.e(getScreen().getReactContext(), getScreen());
        }
        com.swmansion.rnscreens.bottomsheet.e eVar2 = this.dimmingDelegate;
        p013kotlin.jvm.internal.s.h(eVar2);
        return eVar2;
    }

    static /* synthetic */ com.swmansion.rnscreens.bottomsheet.e requireDimmingDelegate$default(t0 t0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return t0Var.requireDimmingDelegate(z11);
    }

    private final com.swmansion.rnscreens.bottomsheet.h requireSheetDelegate() {
        if (this.sheetDelegate == null) {
            this.sheetDelegate = new com.swmansion.rnscreens.bottomsheet.h(getScreen());
        }
        com.swmansion.rnscreens.bottomsheet.h hVar = this.sheetDelegate;
        p013kotlin.jvm.internal.s.h(hVar);
        return hVar;
    }

    private final Integer resolveBackgroundColor(t screen) {
        Integer numValueOf;
        ColorStateList colorStateListI;
        Drawable background = screen.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            numValueOf = Integer.valueOf(colorDrawable.getColor());
        } else {
            Drawable background2 = screen.getBackground();
            st.g gVar = background2 instanceof st.g ? (st.g) background2 : null;
            numValueOf = (gVar == null || (colorStateListI = gVar.I()) == null) ? null : Integer.valueOf(colorStateListI.getDefaultColor());
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        w contentWrapper = screen.getContentWrapper();
        if (contentWrapper == null) {
            return null;
        }
        return com.swmansion.rnscreens.utils.k.resolveBackgroundColor(contentWrapper);
    }

    private final boolean shouldShowSearchBar() {
        w0 headerConfig = getScreen().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig != null && configSubviewsCount > 0) {
            for (int i11 = 0; i11 < configSubviewsCount; i11++) {
                if (headerConfig.getConfigSubview(i11).getType() == y0.a.SEARCH_BAR) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void updateToolbarMenu(Menu menu) {
        menu.clear();
        if (shouldShowSearchBar()) {
            Context context = getContext();
            if (this.searchView == null && context != null) {
                c cVar = new c(context, this);
                this.searchView = cVar;
                wn0.l<? super c, jn0.h0> lVar = this.onSearchViewCreate;
                if (lVar != null) {
                    lVar.invoke(cVar);
                }
            }
            MenuItem menuItemAdd = menu.add("");
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setActionView(this.searchView);
        }
    }

    @Override // com.swmansion.rnscreens.u0
    public boolean canNavigateBack() {
        v container = getScreen().getContainer();
        if (!(container instanceof m0)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        if (!p013kotlin.jvm.internal.s.f(((m0) container).getRootScreen(), getScreen())) {
            return true;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof t0) {
            return ((t0) parentFragment).canNavigateBack();
        }
        return false;
    }

    @Override // com.swmansion.rnscreens.u0
    public void dismissFromContainer() {
        getScreenStack().dismiss(this);
    }

    public final void dismissSelf$react_native_screens_release() {
        if (isRemoving() && isDetached()) {
            return;
        }
        com.facebook.react.uimanager.v0 reactContext = getScreen().getReactContext();
        int iE = com.facebook.react.uimanager.b1.e(reactContext);
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.b1.c(reactContext, getScreen().getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new com.swmansion.rnscreens.events.h(iE, getScreen().getId()));
        }
    }

    public final wn0.l<c, jn0.h0> getOnSearchViewCreate() {
        return this.onSearchViewCreate;
    }

    public final c getSearchView() {
        return this.searchView;
    }

    /* JADX INFO: renamed from: getSheetDelegate$react_native_screens_release, reason: from getter */
    public final com.swmansion.rnscreens.bottomsheet.h getSheetDelegate() {
        return this.sheetDelegate;
    }

    @Override // com.swmansion.rnscreens.a0, com.swmansion.rnscreens.b0
    public boolean isTranslucent() {
        return getScreen().isTranslucent();
    }

    @Override // com.swmansion.rnscreens.a0, com.swmansion.rnscreens.b0
    public void onContainerUpdate() {
        super.onContainerUpdate();
        w0 headerConfig = getScreen().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.onUpdate();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        com.swmansion.rnscreens.stack.views.e eVar = null;
        if (!com.swmansion.rnscreens.bottomsheet.j.usesFormSheetPresentation(getScreen())) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        final com.swmansion.rnscreens.bottomsheet.e eVarRequireDimmingDelegate$default = requireDimmingDelegate$default(this, false, 1, null);
        if (enter) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, eVarRequireDimmingDelegate$default.getMaxAlpha());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.n0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    t0.onCreateAnimator$lambda$10$lambda$9(eVarRequireDimmingDelegate$default, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new da0.a(new wn0.l() { // from class: com.swmansion.rnscreens.o0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Float.valueOf(t0.onCreateAnimator$lambda$11(this.f55512a, (Number) obj));
                }
            }, new wn0.l() { // from class: com.swmansion.rnscreens.p0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return t0.onCreateAnimator$lambda$12((Number) obj);
                }
            }), Float.valueOf(getScreen().getHeight()), Float.valueOf(BitmapDescriptorFactory.HUE_RED));
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.q0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    t0.onCreateAnimator$lambda$15$lambda$14(this.f55513a, valueAnimator);
                }
            });
            AnimatorSet.Builder builderPlay = eVarRequireDimmingDelegate$default.willDimForDetentIndex(getScreen(), getScreen().getSheetInitialDetentIndex()) ? animatorSet.play(valueAnimatorOfObject) : null;
            if (builderPlay != null) {
                builderPlay.with(valueAnimatorOfFloat);
            }
        } else {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(eVarRequireDimmingDelegate$default.getDimmingView().getAlpha(), BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.r0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    t0.onCreateAnimator$lambda$19$lambda$18(eVarRequireDimmingDelegate$default, valueAnimator);
                }
            });
            com.swmansion.rnscreens.stack.views.e eVar2 = this.coordinatorLayout;
            if (eVar2 == null) {
                p013kotlin.jvm.internal.s.B("coordinatorLayout");
            } else {
                eVar = eVar2;
            }
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, eVar.getBottom() - getScreen().getTop());
            valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.s0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    t0.onCreateAnimator$lambda$22$lambda$21(this.f55515a, valueAnimator);
                }
            });
            animatorSet.play(valueAnimatorOfFloat2).with(valueAnimatorOfFloat3);
        }
        animatorSet.addListener(new com.swmansion.rnscreens.events.e(this, new com.swmansion.rnscreens.events.i(getScreen()), enter ? com.swmansion.rnscreens.events.e.a.ENTER : com.swmansion.rnscreens.events.e.a.EXIT));
        return animatorSet;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        p013kotlin.jvm.internal.s.k(menu, "menu");
        p013kotlin.jvm.internal.s.k(inflater, "inflater");
        updateToolbarMenu(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.swmansion.rnscreens.a0, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        CoordinatorLayout.c scrollingViewBehavior;
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        AppBarLayout appBarLayout3;
        p013kotlin.jvm.internal.s.k(inflater, "inflater");
        Context contextRequireContext = requireContext();
        p013kotlin.jvm.internal.s.j(contextRequireContext, "requireContext(...)");
        this.coordinatorLayout = new com.swmansion.rnscreens.stack.views.e(contextRequireContext, this);
        t screen = getScreen();
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        if (com.swmansion.rnscreens.bottomsheet.j.usesFormSheetPresentation(getScreen())) {
            scrollingViewBehavior = createBottomSheetBehaviour();
        } else {
            scrollingViewBehavior = this.isToolbarTranslucent ? null : new AppBarLayout.ScrollingViewBehavior();
        }
        fVar.o(scrollingViewBehavior);
        screen.setLayoutParams(fVar);
        com.swmansion.rnscreens.stack.views.e eVar = this.coordinatorLayout;
        if (eVar == null) {
            p013kotlin.jvm.internal.s.B("coordinatorLayout");
            eVar = null;
        }
        eVar.addView(aa0.c.recycle(getScreen()));
        if (com.swmansion.rnscreens.bottomsheet.j.usesFormSheetPresentation(getScreen())) {
            getScreen().setClipToOutline(true);
            attachShapeToScreen(getScreen());
            getScreen().setElevation(getScreen().getSheetElevation());
            com.swmansion.rnscreens.bottomsheet.h hVarRequireSheetDelegate = requireSheetDelegate();
            BottomSheetBehavior<t> sheetBehavior = getScreen().getSheetBehavior();
            p013kotlin.jvm.internal.s.h(sheetBehavior);
            com.swmansion.rnscreens.bottomsheet.h.configureBottomSheetBehaviour$react_native_screens_release$default(hVarRequireSheetDelegate, sheetBehavior, null, 0, 6, null);
            com.swmansion.rnscreens.bottomsheet.e eVarRequireDimmingDelegate = requireDimmingDelegate(true);
            t screen2 = getScreen();
            com.swmansion.rnscreens.stack.views.e eVar2 = this.coordinatorLayout;
            if (eVar2 == null) {
                p013kotlin.jvm.internal.s.B("coordinatorLayout");
                eVar2 = null;
            }
            eVarRequireDimmingDelegate.onViewHierarchyCreated(screen2, eVar2);
            t screen3 = getScreen();
            BottomSheetBehavior<t> sheetBehavior2 = getScreen().getSheetBehavior();
            p013kotlin.jvm.internal.s.h(sheetBehavior2);
            eVarRequireDimmingDelegate.onBehaviourAttached(screen3, sheetBehavior2);
            v container2 = getScreen().getContainer();
            p013kotlin.jvm.internal.s.h(container2);
            com.swmansion.rnscreens.stack.views.e eVar3 = this.coordinatorLayout;
            if (eVar3 == null) {
                p013kotlin.jvm.internal.s.B("coordinatorLayout");
                eVar3 = null;
            }
            eVar3.measure(View.MeasureSpec.makeMeasureSpec(container2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container2.getHeight(), 1073741824));
            com.swmansion.rnscreens.stack.views.e eVar4 = this.coordinatorLayout;
            if (eVar4 == null) {
                p013kotlin.jvm.internal.s.B("coordinatorLayout");
                eVar4 = null;
            }
            eVar4.layout(0, 0, container2.getWidth(), container2.getHeight());
            ViewCompat.L0(getScreen(), new a());
        } else {
            Context context = getContext();
            if (context != null) {
                appBarLayout = new AppBarLayout(context);
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setLayoutParams(new AppBarLayout.e(-1, -2));
            } else {
                appBarLayout = null;
            }
            this.appBarLayout = appBarLayout;
            com.swmansion.rnscreens.stack.views.e eVar5 = this.coordinatorLayout;
            if (eVar5 == null) {
                p013kotlin.jvm.internal.s.B("coordinatorLayout");
                eVar5 = null;
            }
            eVar5.addView(this.appBarLayout);
            if (this.isToolbarShadowHidden && (appBarLayout3 = this.appBarLayout) != null) {
                appBarLayout3.setTargetElevation(BitmapDescriptorFactory.HUE_RED);
            }
            Toolbar toolbar = this.toolbar;
            if (toolbar != null && (appBarLayout2 = this.appBarLayout) != null) {
                appBarLayout2.addView(aa0.c.recycle(toolbar));
            }
            setHasOptionsMenu(true);
        }
        com.swmansion.rnscreens.stack.views.e eVar6 = this.coordinatorLayout;
        if (eVar6 != null) {
            return eVar6;
        }
        p013kotlin.jvm.internal.s.B("coordinatorLayout");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        w0 headerConfig;
        p013kotlin.jvm.internal.s.k(menu, "menu");
        if (!getScreen().isTranslucent() || ((headerConfig = getScreen().getHeaderConfig()) != null && !headerConfig.getIsHeaderHidden())) {
            updateToolbarMenu(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    public final void onSheetCornerRadiusChange$react_native_screens_release() {
        getScreen().onSheetCornerRadiusChange$react_native_screens_release();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        View view = this.lastFocusedChild;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (com.swmansion.rnscreens.utils.c.INSTANCE.isPlatformAndroidTV(getContext())) {
            this.lastFocusedChild = findLastFocusedChild();
        }
        super.onStop();
    }

    @Override // com.swmansion.rnscreens.a0, com.swmansion.rnscreens.b0
    public void onViewAnimationEnd() {
        super.onViewAnimationEnd();
        notifyViewAppearTransitionEnd();
        getScreen().endRemovalTransition();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        p013kotlin.jvm.internal.s.k(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // com.swmansion.rnscreens.u0
    public void removeToolbar() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null && (toolbar = this.toolbar) != null && toolbar.getParent() == appBarLayout) {
            appBarLayout.removeView(toolbar);
        }
        this.toolbar = null;
    }

    public final void setOnSearchViewCreate(wn0.l<? super c, jn0.h0> lVar) {
        this.onSearchViewCreate = lVar;
    }

    public final void setSearchView(c cVar) {
        this.searchView = cVar;
    }

    public final void setSheetDelegate$react_native_screens_release(com.swmansion.rnscreens.bottomsheet.h hVar) {
        this.sheetDelegate = hVar;
    }

    @Override // com.swmansion.rnscreens.u0
    public void setToolbar(Toolbar toolbar) {
        p013kotlin.jvm.internal.s.k(toolbar, "toolbar");
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.e eVar = new AppBarLayout.e(-1, -2);
        eVar.g(0);
        toolbar.setLayoutParams(eVar);
        this.toolbar = toolbar;
    }

    @Override // com.swmansion.rnscreens.u0
    public void setToolbarShadowHidden(boolean hidden) {
        if (this.isToolbarShadowHidden != hidden) {
            AppBarLayout appBarLayout = this.appBarLayout;
            if (appBarLayout != null) {
                appBarLayout.setElevation(hidden ? BitmapDescriptorFactory.HUE_RED : com.facebook.react.uimanager.w.h(4.0f));
            }
            AppBarLayout appBarLayout2 = this.appBarLayout;
            if (appBarLayout2 != null) {
                appBarLayout2.setStateListAnimator(null);
            }
            this.isToolbarShadowHidden = hidden;
        }
    }

    @Override // com.swmansion.rnscreens.u0
    public void setToolbarTranslucent(boolean translucent) {
        if (this.isToolbarTranslucent != translucent) {
            ViewGroup.LayoutParams layoutParams = getScreen().getLayoutParams();
            p013kotlin.jvm.internal.s.i(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.f) layoutParams).o(translucent ? null : new AppBarLayout.ScrollingViewBehavior());
            this.isToolbarTranslucent = translucent;
        }
    }

    public t0() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }
}
