package com.swmansion.rnscreens.stack.views;

import android.content.Context;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.x;
import com.swmansion.rnscreens.bottomsheet.j;
import com.swmansion.rnscreens.p;
import com.swmansion.rnscreens.t0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0019\u0010\r\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/swmansion/rnscreens/stack/views/e;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lcom/facebook/react/uimanager/f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/swmansion/rnscreens/t0;", "fragment", "pointerEventsImpl", "<init>", "(Landroid/content/Context;Lcom/swmansion/rnscreens/t0;Lcom/facebook/react/uimanager/f0;)V", "(Landroid/content/Context;Lcom/swmansion/rnscreens/t0;)V", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "Landroid/view/animation/Animation;", "animation", "Ljn0/h0;", "startAnimation", "(Landroid/view/animation/Animation;)V", "clearFocus", "()V", "", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Lcom/swmansion/rnscreens/t0;", "getFragment$react_native_screens_release", "()Lcom/swmansion/rnscreens/t0;", "Lcom/facebook/react/uimanager/f0;", "Landroid/view/animation/Animation$AnimationListener;", "animationListener", "Landroid/view/animation/Animation$AnimationListener;", "Lcom/facebook/react/uimanager/x;", "getPointerEvents", "()Lcom/facebook/react/uimanager/x;", "pointerEvents", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends CoordinatorLayout implements f0 {
    private final Animation.AnimationListener animationListener;
    private final t0 fragment;
    private final f0 pointerEventsImpl;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/swmansion/rnscreens/stack/views/e$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Ljn0/h0;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            s.k(animation, "animation");
            e.this.getFragment().onViewAnimationEnd();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            s.k(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            s.k(animation, "animation");
            e.this.getFragment().onViewAnimationStart();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, t0 fragment, f0 pointerEventsImpl) {
        super(context);
        s.k(context, "context");
        s.k(fragment, "fragment");
        s.k(pointerEventsImpl, "pointerEventsImpl");
        this.fragment = fragment;
        this.pointerEventsImpl = pointerEventsImpl;
        this.animationListener = new a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        if (getVisibility() != 4) {
            super.clearFocus();
        }
    }

    /* JADX INFO: renamed from: getFragment$react_native_screens_release, reason: from getter */
    public final t0 getFragment() {
        return this.fragment;
    }

    @Override // com.facebook.react.uimanager.f0
    public x getPointerEvents() {
        return this.pointerEventsImpl.getPointerEvents();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(insets);
        s.j(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        super.onLayout(changed, l11, t11, r11, b11);
        if (j.usesFormSheetPresentation(this.fragment.getScreen())) {
            this.fragment.getScreen().onBottomSheetBehaviorDidLayout$react_native_screens_release(changed);
        }
    }

    @Override // android.view.View
    public void startAnimation(Animation animation) {
        s.k(animation, "animation");
        com.swmansion.rnscreens.stack.anim.a aVar = new com.swmansion.rnscreens.stack.anim.a(this.fragment);
        aVar.setDuration(animation.getDuration());
        if ((animation instanceof AnimationSet) && !this.fragment.isRemoving()) {
            AnimationSet animationSet = (AnimationSet) animation;
            animationSet.addAnimation(aVar);
            animationSet.setAnimationListener(this.animationListener);
            super.startAnimation(animationSet);
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(animation);
        animationSet2.addAnimation(aVar);
        animationSet2.setAnimationListener(this.animationListener);
        super.startAnimation(animationSet2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context, t0 fragment) {
        this(context, fragment, new p());
        s.k(context, "context");
        s.k(fragment, "fragment");
    }
}
