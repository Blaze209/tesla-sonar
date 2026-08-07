package com.swmansion.rnscreens.bottomsheet;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import bo0.n;
import com.facebook.react.uimanager.v0;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.t;
import com.swmansion.rnscreens.t0;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0000X\u0080D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/e;", "", "Lcom/facebook/react/uimanager/v0;", "reactContext", "Lcom/swmansion/rnscreens/t;", AnalyticsContext.Screen, "<init>", "(Lcom/facebook/react/uimanager/v0;Lcom/swmansion/rnscreens/t;)V", "Lcom/swmansion/rnscreens/bottomsheet/b;", "createDimmingView", "(Lcom/swmansion/rnscreens/t;)Lcom/swmansion/rnscreens/bottomsheet/b;", "", "forceCreation", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "requireBottomSheetCallback", "(Lcom/swmansion/rnscreens/t;Z)Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/ViewGroup;", "root", "Ljn0/h0;", "onViewHierarchyCreated", "(Lcom/swmansion/rnscreens/t;Landroid/view/ViewGroup;)V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "onBehaviourAttached", "(Lcom/swmansion/rnscreens/t;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "", "index", "willDimForDetentIndex", "(Lcom/swmansion/rnscreens/t;I)Z", "invalidate", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "Lcom/facebook/react/uimanager/v0;", "getReactContext", "()Lcom/facebook/react/uimanager/v0;", "dimmingView", "Lcom/swmansion/rnscreens/bottomsheet/b;", "getDimmingView$react_native_screens_release", "()Lcom/swmansion/rnscreens/bottomsheet/b;", "", "maxAlpha", Gender.FEMALE, "getMaxAlpha$react_native_screens_release", "()F", "dimmingViewCallback", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {
    private final b dimmingView;
    private BottomSheetBehavior.g dimmingViewCallback;
    private final float maxAlpha;
    private final v0 reactContext;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/e$a;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Lcom/swmansion/rnscreens/t;", AnalyticsContext.Screen, "Landroid/view/View;", "viewToAnimate", "", "maxAlpha", "<init>", "(Lcom/swmansion/rnscreens/t;Landroid/view/View;F)V", "", "index", "computeOffsetFromDetentIndex", "(I)F", "bottomSheet", "newState", "Ljn0/h0;", "onStateChanged", "(Landroid/view/View;I)V", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "Lcom/swmansion/rnscreens/t;", "getScreen", "()Lcom/swmansion/rnscreens/t;", "Landroid/view/View;", "getViewToAnimate", "()Landroid/view/View;", Gender.FEMALE, "getMaxAlpha", "()F", "largestUndimmedOffset", "firstDimmedOffset", "intervalLength", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animator", "Landroid/animation/ValueAnimator;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class a extends BottomSheetBehavior.g {
        private final ValueAnimator animator;
        private float firstDimmedOffset;
        private float intervalLength;
        private float largestUndimmedOffset;
        private final float maxAlpha;
        private final t screen;
        private final View viewToAnimate;

        public a(t screen, View viewToAnimate, float f11) {
            s.k(screen, "screen");
            s.k(viewToAnimate, "viewToAnimate");
            this.screen = screen;
            this.viewToAnimate = viewToAnimate;
            this.maxAlpha = f11;
            this.largestUndimmedOffset = computeOffsetFromDetentIndex(screen.getSheetLargestUndimmedDetentIndex());
            float fComputeOffsetFromDetentIndex = computeOffsetFromDetentIndex(n.n(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().size() - 1));
            this.firstDimmedOffset = fComputeOffsetFromDetentIndex;
            this.intervalLength = fComputeOffsetFromDetentIndex - this.largestUndimmedOffset;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, f11);
            valueAnimatorOfFloat.setDuration(1L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.bottomsheet.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    e.a.animator$lambda$1$lambda$0(this.f55488a, valueAnimator);
                }
            });
            this.animator = valueAnimatorOfFloat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void animator$lambda$1$lambda$0(a aVar, ValueAnimator it) {
            s.k(it, "it");
            View view = aVar.viewToAnimate;
            Object animatedValue = it.getAnimatedValue();
            s.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
        }

        private final float computeOffsetFromDetentIndex(int index) {
            int size = this.screen.getSheetDetents().size();
            if (size == 1) {
                return (index == -1 || index != 0) ? -1.0f : 1.0f;
            }
            if (size == 2) {
                if (index == -1) {
                    return -1.0f;
                }
                if (index != 0) {
                    return index != 1 ? -1.0f : 1.0f;
                }
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (size != 3 || index == -1) {
                return -1.0f;
            }
            if (index == 0) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (index != 1) {
                return index != 2 ? -1.0f : 1.0f;
            }
            BottomSheetBehavior<t> sheetBehavior = this.screen.getSheetBehavior();
            s.h(sheetBehavior);
            return sheetBehavior.t0();
        }

        public final float getMaxAlpha() {
            return this.maxAlpha;
        }

        public final t getScreen() {
            return this.screen;
        }

        public final View getViewToAnimate() {
            return this.viewToAnimate;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(View bottomSheet, float slideOffset) {
            s.k(bottomSheet, "bottomSheet");
            float f11 = this.largestUndimmedOffset;
            if (f11 >= slideOffset || slideOffset >= this.firstDimmedOffset) {
                return;
            }
            this.animator.setCurrentFraction((slideOffset - f11) / this.intervalLength);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(View bottomSheet, int newState) {
            s.k(bottomSheet, "bottomSheet");
            if (newState == 1 || newState == 2) {
                this.largestUndimmedOffset = computeOffsetFromDetentIndex(this.screen.getSheetLargestUndimmedDetentIndex());
                float fComputeOffsetFromDetentIndex = computeOffsetFromDetentIndex(n.n(this.screen.getSheetLargestUndimmedDetentIndex() + 1, 0, this.screen.getSheetDetents().size() - 1));
                this.firstDimmedOffset = fComputeOffsetFromDetentIndex;
                this.intervalLength = fComputeOffsetFromDetentIndex - this.largestUndimmedOffset;
            }
        }
    }

    public e(v0 reactContext, t screen) {
        s.k(reactContext, "reactContext");
        s.k(screen, "screen");
        this.reactContext = reactContext;
        this.dimmingView = createDimmingView(screen);
        this.maxAlpha = 0.3f;
    }

    private final b createDimmingView(final t screen) {
        b bVar = new b(this.reactContext, this.maxAlpha);
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        bVar.setOnClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.bottomsheet.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.createDimmingView$lambda$2$lambda$1(screen, view);
            }
        });
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDimmingView$lambda$2$lambda$1(t tVar, View view) {
        if (tVar.getSheetClosesOnTouchOutside()) {
            Fragment fragment = tVar.getFragment();
            s.i(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
            ((t0) fragment).dismissSelf$react_native_screens_release();
        }
    }

    private final BottomSheetBehavior.g requireBottomSheetCallback(t screen, boolean forceCreation) {
        if (this.dimmingViewCallback == null || forceCreation) {
            this.dimmingViewCallback = new a(screen, this.dimmingView, this.maxAlpha);
        }
        BottomSheetBehavior.g gVar = this.dimmingViewCallback;
        s.h(gVar);
        return gVar;
    }

    static /* synthetic */ BottomSheetBehavior.g requireBottomSheetCallback$default(e eVar, t tVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return eVar.requireBottomSheetCallback(tVar, z11);
    }

    /* JADX INFO: renamed from: getDimmingView$react_native_screens_release, reason: from getter */
    public final b getDimmingView() {
        return this.dimmingView;
    }

    /* JADX INFO: renamed from: getMaxAlpha$react_native_screens_release, reason: from getter */
    public final float getMaxAlpha() {
        return this.maxAlpha;
    }

    public final v0 getReactContext() {
        return this.reactContext;
    }

    public final void invalidate(BottomSheetBehavior<t> behavior) {
        BottomSheetBehavior.g gVar = this.dimmingViewCallback;
        if (gVar == null || behavior == null) {
            return;
        }
        behavior.G0(gVar);
    }

    public final void onBehaviourAttached(t screen, BottomSheetBehavior<t> behavior) {
        s.k(screen, "screen");
        s.k(behavior, "behavior");
        behavior.c0(requireBottomSheetCallback(screen, true));
    }

    public final void onViewHierarchyCreated(t screen, ViewGroup root) {
        s.k(screen, "screen");
        s.k(root, "root");
        root.addView(this.dimmingView, 0);
        if (willDimForDetentIndex(screen, screen.getSheetInitialDetentIndex())) {
            this.dimmingView.setAlpha(this.maxAlpha);
        } else {
            this.dimmingView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public final boolean willDimForDetentIndex(t screen, int index) {
        s.k(screen, "screen");
        return index > screen.getSheetLargestUndimmedDetentIndex();
    }
}
