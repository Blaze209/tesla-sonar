package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.ViewCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\b%&'#()*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ9\u0010\u0015\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$¨\u0006,"}, d2 = {"Landroidx/fragment/app/f;", "Landroidx/fragment/app/a1;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/a1$d;", "operations", "Ljn0/h0;", "K", "(Ljava/util/List;)V", "Landroidx/fragment/app/f$b;", "animationInfos", Gender.FEMALE, "Landroidx/fragment/app/f$h;", "transitionInfos", "", "isPop", "firstOut", "lastIn", "H", "(Ljava/util/List;ZLandroidx/fragment/app/a1$d;Landroidx/fragment/app/a1$d;)V", "Landroidx/collection/a;", "", "Landroid/view/View;", "", "names", "J", "(Landroidx/collection/a;Ljava/util/Collection;)V", "", "namedViews", "view", "I", "(Ljava/util/Map;Landroid/view/View;)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Z)V", "a", "b", "c", "e", "f", "g", "h", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends a1 {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/f$a;", "Landroidx/fragment/app/a1$b;", "Landroidx/fragment/app/f$b;", "animationInfo", "<init>", "(Landroidx/fragment/app/f$b;)V", "Landroid/view/ViewGroup;", "container", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/ViewGroup;)V", "c", "Landroidx/fragment/app/f$b;", "h", "()Landroidx/fragment/app/f$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class a extends a1.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final b animationInfo;

        /* JADX INFO: renamed from: androidx.fragment.app.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"androidx/fragment/app/f$a$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Ljn0/h0;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AnimationAnimationListenerC0169a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a1.d f8503a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f8504b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f8505c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f8506d;

            AnimationAnimationListenerC0169a(a1.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f8503a = dVar;
                this.f8504b = viewGroup;
                this.f8505c = view;
                this.f8506d = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(ViewGroup container, View view, a this$0) {
                p013kotlin.jvm.internal.s.k(container, "$container");
                p013kotlin.jvm.internal.s.k(this$0, "this$0");
                container.endViewTransition(view);
                this$0.getAnimationInfo().getOperation().e(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                p013kotlin.jvm.internal.s.k(animation, "animation");
                final ViewGroup viewGroup = this.f8504b;
                final View view = this.f8505c;
                final a aVar = this.f8506d;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.a.AnimationAnimationListenerC0169a.b(viewGroup, view, aVar);
                    }
                });
                if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f8503a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                p013kotlin.jvm.internal.s.k(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                p013kotlin.jvm.internal.s.k(animation, "animation");
                if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f8503a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b animationInfo) {
            p013kotlin.jvm.internal.s.k(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        @Override // androidx.fragment.app.a1.b
        public void c(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
            a1.d operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().e(this);
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.a1.b
        public void d(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
            if (this.animationInfo.b()) {
                this.animationInfo.getOperation().e(this);
                return;
            }
            Context context = container.getContext();
            a1.d operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            b bVar = this.animationInfo;
            p013kotlin.jvm.internal.s.j(context, "context");
            v.a aVarC = bVar.c(context);
            if (aVarC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarC.f8685a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.getFinalState() != a1.d.b.REMOVED) {
                view.startAnimation(animation);
                this.animationInfo.getOperation().e(this);
                return;
            }
            container.startViewTransition(view);
            v.b bVar2 = new v.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0169a(operation, container, view, this));
            view.startAnimation(bVar2);
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Animation from operation " + operation + " has started.");
            }
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b getAnimationInfo() {
            return this.animationInfo;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/f$b;", "Landroidx/fragment/app/f$f;", "Landroidx/fragment/app/a1$d;", "operation", "", "isPop", "<init>", "(Landroidx/fragment/app/a1$d;Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/fragment/app/v$a;", "c", "(Landroid/content/Context;)Landroidx/fragment/app/v$a;", "b", "Z", "isAnimLoaded", DateTokenConverter.CONVERTER_KEY, "Landroidx/fragment/app/v$a;", "animation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b extends C0170f {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isPop;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isAnimLoaded;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private v.a animation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a1.d operation, boolean z11) {
            super(operation);
            p013kotlin.jvm.internal.s.k(operation, "operation");
            this.isPop = z11;
        }

        public final v.a c(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            v.a aVarB = v.b(context, getOperation().getFragment(), getOperation().getFinalState() == a1.d.b.VISIBLE, this.isPop);
            this.animation = aVarB;
            this.isAnimLoaded = true;
            return aVarB;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/fragment/app/f$c;", "Landroidx/fragment/app/a1$b;", "Landroidx/fragment/app/f$b;", "animatorInfo", "<init>", "(Landroidx/fragment/app/f$b;)V", "Landroid/view/ViewGroup;", "container", "Ljn0/h0;", "f", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/b;", "backEvent", "e", "(Landroidx/activity/b;Landroid/view/ViewGroup;)V", DateTokenConverter.CONVERTER_KEY, "c", "Landroidx/fragment/app/f$b;", "h", "()Landroidx/fragment/app/f$b;", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "animator", "", "b", "()Z", "isSeekingSupported", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c extends a1.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final b animatorInfo;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private AnimatorSet animator;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/app/f$c$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "anim", "Ljn0/h0;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewGroup f8512a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f8513b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f8514c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a1.d f8515d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f8516e;

            a(ViewGroup viewGroup, View view, boolean z11, a1.d dVar, c cVar) {
                this.f8512a = viewGroup;
                this.f8513b = view;
                this.f8514c = z11;
                this.f8515d = dVar;
                this.f8516e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator anim) {
                p013kotlin.jvm.internal.s.k(anim, "anim");
                this.f8512a.endViewTransition(this.f8513b);
                if (this.f8514c) {
                    a1.d.b finalState = this.f8515d.getFinalState();
                    View viewToAnimate = this.f8513b;
                    p013kotlin.jvm.internal.s.j(viewToAnimate, "viewToAnimate");
                    finalState.applyState(viewToAnimate, this.f8512a);
                }
                this.f8516e.getAnimatorInfo().getOperation().e(this.f8516e);
                if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f8515d + " has ended.");
                }
            }
        }

        public c(b animatorInfo) {
            p013kotlin.jvm.internal.s.k(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        @Override // androidx.fragment.app.a1.b
        /* JADX INFO: renamed from: b */
        public boolean getIsSeekingSupported() {
            return true;
        }

        @Override // androidx.fragment.app.a1.b
        public void c(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            a1.d operation = this.animatorInfo.getOperation();
            if (!operation.getIsSeeking()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                e.f8518a.a(animatorSet);
            }
            if (FragmentManager.O0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(operation);
                sb2.append(" has been canceled");
                sb2.append(operation.getIsSeeking() ? " with seeking." : ".");
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        @Override // androidx.fragment.app.a1.b
        public void d(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
            a1.d operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.a1.b
        public void e(androidx.p002activity.b backEvent, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(backEvent, "backEvent");
            p013kotlin.jvm.internal.s.k(container, "container");
            a1.d operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().mTransitioning) {
                return;
            }
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long jA = d.f8517a.a(animatorSet);
            long progress = (long) (backEvent.getProgress() * jA);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == jA) {
                progress = jA - 1;
            }
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + operation);
            }
            e.f8518a.b(animatorSet, progress);
        }

        @Override // androidx.fragment.app.a1.b
        public void f(ViewGroup container) {
            c cVar;
            p013kotlin.jvm.internal.s.k(container, "container");
            if (this.animatorInfo.b()) {
                return;
            }
            Context context = container.getContext();
            b bVar = this.animatorInfo;
            p013kotlin.jvm.internal.s.j(context, "context");
            v.a aVarC = bVar.c(context);
            this.animator = aVarC != null ? aVarC.f8686b : null;
            a1.d operation = this.animatorInfo.getOperation();
            Fragment fragment = operation.getFragment();
            boolean z11 = operation.getFinalState() == a1.d.b.GONE;
            View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(container, view, z11, operation, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b getAnimatorInfo() {
            return this.animatorInfo;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/f$d;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f8517a = new d();

        private d() {
        }

        public final long a(AnimatorSet animatorSet) {
            p013kotlin.jvm.internal.s.k(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/f$e;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "Ljn0/h0;", "a", "(Landroid/animation/AnimatorSet;)V", "", "time", "b", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f8518a = new e();

        private e() {
        }

        public final void a(AnimatorSet animatorSet) {
            p013kotlin.jvm.internal.s.k(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long time) {
            p013kotlin.jvm.internal.s.k(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(time);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/fragment/app/f$f;", "", "Landroidx/fragment/app/a1$d;", "operation", "<init>", "(Landroidx/fragment/app/a1$d;)V", "a", "Landroidx/fragment/app/a1$d;", "()Landroidx/fragment/app/a1$d;", "", "b", "()Z", "isVisibilityUnchanged", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class C0170f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a1.d operation;

        public C0170f(a1.d operation) {
            p013kotlin.jvm.internal.s.k(operation, "operation");
            this.operation = operation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a1.d getOperation() {
            return this.operation;
        }

        public final boolean b() {
            View view = this.operation.getFragment().mView;
            a1.d.b bVarA = view != null ? a1.d.b.INSTANCE.a(view) : null;
            a1.d.b finalState = this.operation.getFinalState();
            if (bVarA == finalState) {
                return true;
            }
            a1.d.b bVar = a1.d.b.VISIBLE;
            return (bVarA == bVar || finalState == bVar) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020#2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010,J\u0017\u00102\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b9\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010ER'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b)\u0010I\u001a\u0004\bP\u0010KR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010I\u001a\u0004\bQ\u0010KR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b\u0019\u0010TR\u001d\u0010\\\u001a\u00020U8\u0006¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010[\u001a\u0004\bX\u0010YR$\u0010a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010TR\u0011\u0010e\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bd\u0010T¨\u0006f"}, d2 = {"Landroidx/fragment/app/f$g;", "Landroidx/fragment/app/a1$b;", "", "Landroidx/fragment/app/f$h;", "transitionInfos", "Landroidx/fragment/app/a1$d;", "firstOut", "lastIn", "Landroidx/fragment/app/u0;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "Landroidx/collection/a;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/a1$d;Landroidx/fragment/app/a1$d;Landroidx/fragment/app/u0;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/a;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/a;Landroidx/collection/a;Z)V", "Landroid/view/ViewGroup;", "container", "Lkotlin/Pair;", "o", "(Landroid/view/ViewGroup;Landroidx/fragment/app/a1$d;Landroidx/fragment/app/a1$d;)Lkotlin/Pair;", "enteringViews", "Lkotlin/Function0;", "Ljn0/h0;", "executeTransition", "B", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lwn0/a;)V", "transitioningViews", "view", "n", "(Ljava/util/ArrayList;Landroid/view/View;)V", "f", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/b;", "backEvent", "e", "(Landroidx/activity/b;Landroid/view/ViewGroup;)V", DateTokenConverter.CONVERTER_KEY, "c", "Ljava/util/List;", "w", "()Ljava/util/List;", "Landroidx/fragment/app/a1$d;", "t", "()Landroidx/fragment/app/a1$d;", "u", "g", "Landroidx/fragment/app/u0;", "v", "()Landroidx/fragment/app/u0;", "h", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/ArrayList;", "getSharedElementFirstOutViews", "()Ljava/util/ArrayList;", "j", "getSharedElementLastInViews", "k", "Landroidx/collection/a;", "getSharedElementNameMapping", "()Landroidx/collection/a;", "l", "getEnteringNames", "m", "getExitingNames", "getFirstOutViews", "getLastInViews", "p", "Z", "()Z", "Lq5/e;", "q", "Lq5/e;", "getTransitionSignal", "()Lq5/e;", "getTransitionSignal$annotations", "()V", "transitionSignal", "r", "s", "C", "(Ljava/lang/Object;)V", "controller", "b", "isSeekingSupported", "x", "transitioning", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class g extends a1.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<h> transitionInfos;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final a1.d firstOut;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final a1.d lastIn;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final u0 transitionImpl;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Object sharedElementTransition;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<View> sharedElementFirstOutViews;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<View> sharedElementLastInViews;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final androidx.collection.a<String, String> sharedElementNameMapping;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<String> enteringNames;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<String> exitingNames;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final androidx.collection.a<String, View> firstOutViews;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final androidx.collection.a<String, View> lastInViews;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final boolean isPop;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final q5.e transitionSignal;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private Object controller;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ViewGroup f8536d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f8537e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f8536d = viewGroup;
                this.f8537e = obj;
            }

            public final void b() {
                g.this.getTransitionImpl().e(this.f8536d, this.f8537e);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ViewGroup f8539d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f8540e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p013kotlin.jvm.internal.n0<wn0.a<jn0.h0>> f8541f;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "c", "()V"}, k = 3, mv = {1, 8, 0})
            static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ g f8542c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Object f8543d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ ViewGroup f8544e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f8542c = gVar;
                    this.f8543d = obj;
                    this.f8544e = viewGroup;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void e(g this$0, ViewGroup container) {
                    p013kotlin.jvm.internal.s.k(this$0, "this$0");
                    p013kotlin.jvm.internal.s.k(container, "$container");
                    Iterator<T> it = this$0.w().iterator();
                    while (it.hasNext()) {
                        a1.d operation = ((h) it.next()).getOperation();
                        View view = operation.getFragment().getView();
                        if (view != null) {
                            operation.getFinalState().applyState(view, container);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void f(g this$0) {
                    p013kotlin.jvm.internal.s.k(this$0, "this$0");
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "Transition for all operations has completed");
                    }
                    Iterator<T> it = this$0.w().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).getOperation().e(this$0);
                    }
                }

                public final void c() {
                    List<h> listW = this.f8542c.w();
                    if (!(listW instanceof Collection) || !listW.isEmpty()) {
                        Iterator<T> it = listW.iterator();
                        while (it.hasNext()) {
                            if (!((h) it.next()).getOperation().getIsSeeking()) {
                                if (FragmentManager.O0(2)) {
                                    Log.v("FragmentManager", "Completing animating immediately");
                                }
                                q5.e eVar = new q5.e();
                                u0 transitionImpl = this.f8542c.getTransitionImpl();
                                Fragment fragment = this.f8542c.w().get(0).getOperation().getFragment();
                                Object obj = this.f8543d;
                                final g gVar = this.f8542c;
                                transitionImpl.w(fragment, obj, eVar, new Runnable() { // from class: androidx.fragment.app.n
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        f.g.b.a.f(gVar);
                                    }
                                });
                                eVar.a();
                                return;
                            }
                        }
                    }
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    u0 transitionImpl2 = this.f8542c.getTransitionImpl();
                    Object controller = this.f8542c.getController();
                    p013kotlin.jvm.internal.s.h(controller);
                    final g gVar2 = this.f8542c;
                    final ViewGroup viewGroup = this.f8544e;
                    transitionImpl2.d(controller, new Runnable() { // from class: androidx.fragment.app.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.g.b.a.e(gVar2, viewGroup);
                        }
                    });
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                    c();
                    return jn0.h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ViewGroup viewGroup, Object obj, p013kotlin.jvm.internal.n0<wn0.a<jn0.h0>> n0Var) {
                super(0);
                this.f8539d = viewGroup;
                this.f8540e = obj;
                this.f8541f = n0Var;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.f$g$b$a] */
            public final void b() {
                g gVar = g.this;
                gVar.C(gVar.getTransitionImpl().j(this.f8539d, this.f8540e));
                boolean z11 = g.this.getController() != null;
                Object obj = this.f8540e;
                ViewGroup viewGroup = this.f8539d;
                if (!z11) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + CoreConstants.DOT).toString());
                }
                this.f8541f.f86529a = new a(g.this, obj, viewGroup);
                if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + g.this.getFirstOut() + " to " + g.this.getLastIn());
                }
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        public g(List<h> transitionInfos, a1.d dVar, a1.d dVar2, u0 transitionImpl, Object obj, ArrayList<View> sharedElementFirstOutViews, ArrayList<View> sharedElementLastInViews, androidx.collection.a<String, String> sharedElementNameMapping, ArrayList<String> enteringNames, ArrayList<String> exitingNames, androidx.collection.a<String, View> firstOutViews, androidx.collection.a<String, View> lastInViews, boolean z11) {
            p013kotlin.jvm.internal.s.k(transitionInfos, "transitionInfos");
            p013kotlin.jvm.internal.s.k(transitionImpl, "transitionImpl");
            p013kotlin.jvm.internal.s.k(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            p013kotlin.jvm.internal.s.k(sharedElementLastInViews, "sharedElementLastInViews");
            p013kotlin.jvm.internal.s.k(sharedElementNameMapping, "sharedElementNameMapping");
            p013kotlin.jvm.internal.s.k(enteringNames, "enteringNames");
            p013kotlin.jvm.internal.s.k(exitingNames, "exitingNames");
            p013kotlin.jvm.internal.s.k(firstOutViews, "firstOutViews");
            p013kotlin.jvm.internal.s.k(lastInViews, "lastInViews");
            this.transitionInfos = transitionInfos;
            this.firstOut = dVar;
            this.lastIn = dVar2;
            this.transitionImpl = transitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = sharedElementFirstOutViews;
            this.sharedElementLastInViews = sharedElementLastInViews;
            this.sharedElementNameMapping = sharedElementNameMapping;
            this.enteringNames = enteringNames;
            this.exitingNames = exitingNames;
            this.firstOutViews = firstOutViews;
            this.lastInViews = lastInViews;
            this.isPop = z11;
            this.transitionSignal = new q5.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(a1.d operation, g this$0) {
            p013kotlin.jvm.internal.s.k(operation, "$operation");
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        private final void B(ArrayList<View> enteringViews, ViewGroup container, wn0.a<jn0.h0> executeTransition) {
            s0.e(enteringViews, 4);
            ArrayList<String> arrayListQ = this.transitionImpl.q(this.sharedElementLastInViews);
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                for (View sharedElementFirstOutViews : this.sharedElementFirstOutViews) {
                    p013kotlin.jvm.internal.s.j(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view + " Name: " + ViewCompat.J(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                for (View sharedElementLastInViews : this.sharedElementLastInViews) {
                    p013kotlin.jvm.internal.s.j(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + ViewCompat.J(view2));
                }
            }
            executeTransition.invoke();
            this.transitionImpl.y(container, this.sharedElementFirstOutViews, this.sharedElementLastInViews, arrayListQ, this.sharedElementNameMapping);
            s0.e(enteringViews, 0);
            this.transitionImpl.A(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        private final void n(ArrayList<View> transitioningViews, View view) {
            if (!(view instanceof ViewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (androidx.core.view.r0.c(viewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View child = viewGroup.getChildAt(i11);
                if (child.getVisibility() == 0) {
                    p013kotlin.jvm.internal.s.j(child, "child");
                    n(transitioningViews, child);
                }
            }
        }

        private final Pair<ArrayList<View>, Object> o(ViewGroup container, final a1.d lastIn, final a1.d firstOut) {
            lastIn = lastIn;
            View view = new View(container.getContext());
            final Rect rect = new Rect();
            Iterator<h> it = this.transitionInfos.iterator();
            boolean z11 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().g() && firstOut != null && lastIn != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    s0.a(lastIn.getFragment(), firstOut.getFragment(), this.isPop, this.firstOutViews, true);
                    androidx.core.view.d0.a(container, new Runnable() { // from class: androidx.fragment.app.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.g.p(lastIn, firstOut, this);
                        }
                    });
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        String str = this.exitingNames.get(0);
                        p013kotlin.jvm.internal.s.j(str, "exitingNames[0]");
                        view2 = this.firstOutViews.get(str);
                        this.transitionImpl.v(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        String str2 = this.enteringNames.get(0);
                        p013kotlin.jvm.internal.s.j(str2, "enteringNames[0]");
                        final View view3 = this.lastInViews.get(str2);
                        if (view3 != null) {
                            final u0 u0Var = this.transitionImpl;
                            androidx.core.view.d0.a(container, new Runnable() { // from class: androidx.fragment.app.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    f.g.q(u0Var, view3, rect);
                                }
                            });
                            z11 = true;
                        }
                    }
                    this.transitionImpl.z(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    u0 u0Var2 = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    u0Var2.s(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<h> it2 = this.transitionInfos.iterator();
            Object objP = null;
            Object objP2 = null;
            while (it2.hasNext()) {
                h next = it2.next();
                a1.d operation = next.getOperation();
                z11 = z11;
                Object objH = this.transitionImpl.h(next.getTransition());
                if (objH != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    Iterator<h> it3 = it2;
                    View view4 = operation.getFragment().mView;
                    p013kotlin.jvm.internal.s.j(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.sharedElementTransition != null && (operation == firstOut || operation == lastIn)) {
                        if (operation == firstOut) {
                            arrayList2.removeAll(p013kotlin.collections.v.r1(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(p013kotlin.collections.v.r1(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.a(objH, view);
                    } else {
                        this.transitionImpl.b(objH, arrayList2);
                        this.transitionImpl.s(objH, objH, arrayList2, null, null, null, null);
                        if (operation.getFinalState() == a1.d.b.GONE) {
                            operation.q(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation.getFragment().mView);
                            this.transitionImpl.r(objH, operation.getFragment().mView, arrayList3);
                            androidx.core.view.d0.a(container, new Runnable() { // from class: androidx.fragment.app.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    f.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (operation.getFinalState() == a1.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z11) {
                            this.transitionImpl.u(objH, rect);
                        }
                        if (FragmentManager.O0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            for (View transitioningViews : arrayList2) {
                                p013kotlin.jvm.internal.s.j(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + transitioningViews);
                            }
                        }
                    } else {
                        this.transitionImpl.v(objH, view2);
                        if (FragmentManager.O0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            for (View transitioningViews2 : arrayList2) {
                                p013kotlin.jvm.internal.s.j(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + transitioningViews2);
                            }
                        }
                    }
                    if (next.getIsOverlapAllowed()) {
                        objP = this.transitionImpl.p(objP, objH, null);
                    } else {
                        objP2 = this.transitionImpl.p(objP2, objH, null);
                    }
                    it2 = it3;
                }
            }
            Object objO = this.transitionImpl.o(objP, objP2, this.sharedElementTransition);
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objO);
            }
            return new Pair<>(arrayList, objO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(a1.d dVar, a1.d dVar2, g this$0) {
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            s0.a(dVar.getFragment(), dVar2.getFragment(), this$0.isPop, this$0.lastInViews, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(u0 impl, View view, Rect lastInEpicenterRect) {
            p013kotlin.jvm.internal.s.k(impl, "$impl");
            p013kotlin.jvm.internal.s.k(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.k(view, lastInEpicenterRect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(ArrayList transitioningViews) {
            p013kotlin.jvm.internal.s.k(transitioningViews, "$transitioningViews");
            s0.e(transitioningViews, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(a1.d operation, g this$0) {
            p013kotlin.jvm.internal.s.k(operation, "$operation");
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(p013kotlin.jvm.internal.n0 seekCancelLambda) {
            p013kotlin.jvm.internal.s.k(seekCancelLambda, "$seekCancelLambda");
            wn0.a aVar = (wn0.a) seekCancelLambda.f86529a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void C(Object obj) {
            this.controller = obj;
        }

        @Override // androidx.fragment.app.a1.b
        /* JADX INFO: renamed from: b */
        public boolean getIsSeekingSupported() {
            if (!this.transitionImpl.m()) {
                return false;
            }
            List<h> list = this.transitionInfos;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.getTransition() == null || !this.transitionImpl.n(hVar.getTransition())) {
                        return false;
                    }
                }
            }
            Object obj = this.sharedElementTransition;
            return obj == null || this.transitionImpl.n(obj);
        }

        @Override // androidx.fragment.app.a1.b
        public void c(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
            this.transitionSignal.a();
        }

        @Override // androidx.fragment.app.a1.b
        public void d(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
            if (!container.isLaidOut()) {
                for (h hVar : this.transitionInfos) {
                    a1.d operation = hVar.getOperation();
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation);
                    }
                    hVar.getOperation().e(this);
                }
                return;
            }
            Object obj = this.controller;
            if (obj != null) {
                u0 u0Var = this.transitionImpl;
                p013kotlin.jvm.internal.s.h(obj);
                u0Var.c(obj);
                if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.firstOut + " to " + this.lastIn);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> pairO = o(container, this.lastIn, this.firstOut);
            ArrayList<View> arrayListA = pairO.a();
            Object objB = pairO.b();
            List<h> list = this.transitionInfos;
            ArrayList<a1.d> arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).getOperation());
            }
            for (final a1.d dVar : arrayList) {
                this.transitionImpl.w(dVar.getFragment(), objB, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.g.y(dVar, this);
                    }
                });
            }
            B(arrayListA, container, new a(container, objB));
            if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.firstOut + " to " + this.lastIn);
            }
        }

        @Override // androidx.fragment.app.a1.b
        public void e(androidx.p002activity.b backEvent, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(backEvent, "backEvent");
            p013kotlin.jvm.internal.s.k(container, "container");
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.t(obj, backEvent.getProgress());
            }
        }

        @Override // androidx.fragment.app.a1.b
        public void f(ViewGroup container) {
            p013kotlin.jvm.internal.s.k(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    a1.d operation = ((h) it.next()).getOperation();
                    if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            if (x() && this.sharedElementTransition != null && !getIsSeekingSupported()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (getIsSeekingSupported() && x()) {
                final p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
                Pair<ArrayList<View>, Object> pairO = o(container, this.lastIn, this.firstOut);
                ArrayList<View> arrayListA = pairO.a();
                Object objB = pairO.b();
                List<h> list = this.transitionInfos;
                ArrayList<a1.d> arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((h) it2.next()).getOperation());
                }
                for (final a1.d dVar : arrayList) {
                    this.transitionImpl.x(dVar.getFragment(), objB, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.g.z(n0Var);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.g.A(dVar, this);
                        }
                    });
                }
                B(arrayListA, container, new b(container, objB, n0Var));
            }
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final Object getController() {
            return this.controller;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final a1.d getFirstOut() {
            return this.firstOut;
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final a1.d getLastIn() {
            return this.lastIn;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final u0 getTransitionImpl() {
            return this.transitionImpl;
        }

        public final List<h> w() {
            return this.transitionInfos;
        }

        public final boolean x() {
            List<h> list = this.transitionInfos;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).getOperation().getFragment().mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/f$h;", "Landroidx/fragment/app/f$f;", "Landroidx/fragment/app/a1$d;", "operation", "", "isPop", "providesSharedElementTransition", "<init>", "(Landroidx/fragment/app/a1$d;ZZ)V", "", "transition", "Landroidx/fragment/app/u0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Landroidx/fragment/app/u0;", "g", "()Z", "b", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "c", "Z", "h", "isOverlapAllowed", "e", "sharedElementTransition", "()Landroidx/fragment/app/u0;", "handlingImpl", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class h extends C0170f {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Object transition;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isOverlapAllowed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Object sharedElementTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a1.d operation, boolean z11, boolean z12) {
            Object returnTransition;
            super(operation);
            p013kotlin.jvm.internal.s.k(operation, "operation");
            a1.d.b finalState = operation.getFinalState();
            a1.d.b bVar = a1.d.b.VISIBLE;
            if (finalState == bVar) {
                Fragment fragment = operation.getFragment();
                returnTransition = z11 ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z11 ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            this.isOverlapAllowed = operation.getFinalState() == bVar ? z11 ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap() : true;
            this.sharedElementTransition = z12 ? z11 ? operation.getFragment().getSharedElementReturnTransition() : operation.getFragment().getSharedElementEnterTransition() : null;
        }

        private final u0 d(Object transition) {
            if (transition == null) {
                return null;
            }
            u0 u0Var = s0.PLATFORM_IMPL;
            if (u0Var != null && u0Var.g(transition)) {
                return u0Var;
            }
            u0 u0Var2 = s0.SUPPORT_IMPL;
            if (u0Var2 != null && u0Var2.g(transition)) {
                return u0Var2;
            }
            throw new IllegalArgumentException("Transition " + transition + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final u0 c() {
            u0 u0VarD = d(this.transition);
            u0 u0VarD2 = d(this.sharedElementTransition);
            if (u0VarD == null || u0VarD2 == null || u0VarD == u0VarD2) {
                return u0VarD == null ? u0VarD2 : u0VarD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Object getTransition() {
            return this.transition;
        }

        public final boolean g() {
            return this.sharedElementTransition != null;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsOverlapAllowed() {
            return this.isOverlapAllowed;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "entry", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.l<Map.Entry<String, View>, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Collection<String> f8548c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Collection<String> collection) {
            super(1);
            this.f8548c = collection;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry<String, View> entry) {
            p013kotlin.jvm.internal.s.k(entry, "entry");
            return Boolean.valueOf(p013kotlin.collections.v.g0(this.f8548c, ViewCompat.J(entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ViewGroup container) {
        super(container);
        p013kotlin.jvm.internal.s.k(container, "container");
    }

    @SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
    private final void F(List<b> animationInfos) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = animationInfos.iterator();
        while (it.hasNext()) {
            p013kotlin.collections.v.E(arrayList2, ((b) it.next()).getOperation().f());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z11 = false;
        for (b bVar : animationInfos) {
            Context context = getContainer().getContext();
            a1.d operation = bVar.getOperation();
            p013kotlin.jvm.internal.s.j(context, "context");
            v.a aVarC = bVar.c(context);
            if (aVarC != null) {
                if (aVarC.f8686b == null) {
                    arrayList.add(bVar);
                } else {
                    Fragment fragment = operation.getFragment();
                    if (operation.f().isEmpty()) {
                        if (operation.getFinalState() == a1.d.b.GONE) {
                            operation.q(false);
                        }
                        operation.b(new c(bVar));
                        z11 = true;
                    } else if (FragmentManager.O0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            a1.d operation2 = bVar2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (zIsEmpty) {
                if (!z11) {
                    operation2.b(new a(bVar2));
                } else if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.O0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(f this$0, a1.d operation) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(operation, "$operation");
        this$0.c(operation);
    }

    private final void H(List<h> transitionInfos, boolean isPop, a1.d firstOut, a1.d lastIn) {
        ArrayList arrayList;
        Iterator it;
        u0 u0Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        int i11;
        String strB;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : transitionInfos) {
            if (!((h) obj2).b()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList<h> arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (((h) obj3).c() != null) {
                arrayList5.add(obj3);
            }
        }
        u0 u0Var2 = null;
        Object obj4 = null;
        for (h hVar : arrayList5) {
            u0 u0VarC = hVar.c();
            if (u0Var2 != null && u0VarC != u0Var2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.getOperation().getFragment() + " returned Transition " + hVar.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            u0Var2 = u0VarC;
        }
        if (u0Var2 == null) {
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        androidx.collection.a aVar = new androidx.collection.a();
        ArrayList<String> arrayList8 = new ArrayList<>();
        ArrayList<String> arrayList9 = new ArrayList<>();
        androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
        androidx.collection.a<String, View> aVar3 = new androidx.collection.a<>();
        ArrayList<String> sharedElementTargetNames = arrayList8;
        Iterator it2 = arrayList5.iterator();
        ArrayList<String> sharedElementSourceNames = arrayList9;
        while (it2.hasNext()) {
            h hVar2 = (h) it2.next();
            if (!hVar2.g() || firstOut == null || lastIn == null) {
                arrayList = arrayList5;
                it = it2;
                u0Var = u0Var2;
                arrayList2 = arrayList6;
                arrayList3 = arrayList7;
            } else {
                Object objB = u0Var2.B(u0Var2.h(hVar2.getSharedElementTransition()));
                sharedElementSourceNames = lastIn.getFragment().getSharedElementSourceNames();
                p013kotlin.jvm.internal.s.j(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = firstOut.getFragment().getSharedElementSourceNames();
                p013kotlin.jvm.internal.s.j(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames2 = firstOut.getFragment().getSharedElementTargetNames();
                p013kotlin.jvm.internal.s.j(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames2.size();
                arrayList = arrayList5;
                it = it2;
                int i12 = 0;
                while (i12 < size) {
                    u0 u0Var3 = u0Var2;
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i12));
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i12));
                    }
                    i12++;
                    u0Var2 = u0Var3;
                }
                u0Var = u0Var2;
                sharedElementTargetNames = lastIn.getFragment().getSharedElementTargetNames();
                p013kotlin.jvm.internal.s.j(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                Pair pairA = !isPop ? jn0.x.a(firstOut.getFragment().getExitTransitionCallback(), lastIn.getFragment().getEnterTransitionCallback()) : jn0.x.a(firstOut.getFragment().getEnterTransitionCallback(), lastIn.getFragment().getExitTransitionCallback());
                SharedElementCallback sharedElementCallback = (SharedElementCallback) pairA.a();
                SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pairA.b();
                int size2 = sharedElementSourceNames.size();
                int i13 = 0;
                while (true) {
                    arrayList2 = arrayList6;
                    if (i13 >= size2) {
                        break;
                    }
                    ArrayList arrayList10 = arrayList7;
                    String str = sharedElementSourceNames.get(i13);
                    p013kotlin.jvm.internal.s.j(str, "exitingNames[i]");
                    String str2 = sharedElementTargetNames.get(i13);
                    p013kotlin.jvm.internal.s.j(str2, "enteringNames[i]");
                    aVar.put(str, str2);
                    i13++;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList10;
                }
                arrayList3 = arrayList7;
                int i14 = 2;
                if (FragmentManager.O0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    Iterator<String> it3 = sharedElementTargetNames.iterator();
                    while (true) {
                        i11 = i14;
                        if (!it3.hasNext()) {
                            break;
                        }
                        Iterator<String> it4 = it3;
                        Log.v("FragmentManager", "Name: " + it3.next());
                        objB = objB;
                        i14 = i11;
                        it3 = it4;
                    }
                    obj = objB;
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator<String> it5 = sharedElementSourceNames.iterator(); it5.hasNext(); it5 = it5) {
                        Log.v("FragmentManager", "Name: " + it5.next());
                    }
                } else {
                    obj = objB;
                    i11 = 2;
                }
                View view = firstOut.getFragment().mView;
                p013kotlin.jvm.internal.s.j(view, "firstOut.fragment.mView");
                I(aVar2, view);
                aVar2.q(sharedElementSourceNames);
                if (sharedElementCallback != null) {
                    if (FragmentManager.O0(i11)) {
                        Log.v("FragmentManager", "Executing exit callback for operation " + firstOut);
                    }
                    sharedElementCallback.d(sharedElementSourceNames, aVar2);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i15 = size3 - 1;
                            String str3 = sharedElementSourceNames.get(size3);
                            p013kotlin.jvm.internal.s.j(str3, "exitingNames[i]");
                            String str4 = str3;
                            View view2 = aVar2.get(str4);
                            if (view2 == null) {
                                aVar.remove(str4);
                            } else if (!p013kotlin.jvm.internal.s.f(str4, ViewCompat.J(view2))) {
                                aVar.put(ViewCompat.J(view2), (String) aVar.remove(str4));
                            }
                            if (i15 < 0) {
                                break;
                            } else {
                                size3 = i15;
                            }
                        }
                    }
                } else {
                    aVar.q(aVar2.keySet());
                }
                View view3 = lastIn.getFragment().mView;
                p013kotlin.jvm.internal.s.j(view3, "lastIn.fragment.mView");
                I(aVar3, view3);
                aVar3.q(sharedElementTargetNames);
                aVar3.q(aVar.values());
                if (sharedElementCallback2 != null) {
                    if (FragmentManager.O0(i11)) {
                        Log.v("FragmentManager", "Executing enter callback for operation " + lastIn);
                    }
                    sharedElementCallback2.d(sharedElementTargetNames, aVar3);
                    int size4 = sharedElementTargetNames.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i16 = size4 - 1;
                            String str5 = sharedElementTargetNames.get(size4);
                            p013kotlin.jvm.internal.s.j(str5, "enteringNames[i]");
                            String str6 = str5;
                            View view4 = aVar3.get(str6);
                            if (view4 == null) {
                                String strB2 = s0.b(aVar, str6);
                                if (strB2 != null) {
                                    aVar.remove(strB2);
                                }
                            } else if (!p013kotlin.jvm.internal.s.f(str6, ViewCompat.J(view4)) && (strB = s0.b(aVar, str6)) != null) {
                                aVar.put(strB, ViewCompat.J(view4));
                            }
                            if (i16 < 0) {
                                break;
                            } else {
                                size4 = i16;
                            }
                        }
                    }
                } else {
                    s0.d(aVar, aVar3);
                }
                Collection<String> collectionKeySet = aVar.keySet();
                p013kotlin.jvm.internal.s.j(collectionKeySet, "sharedElementNameMapping.keys");
                J(aVar2, collectionKeySet);
                Collection<String> collectionValues = aVar.values();
                p013kotlin.jvm.internal.s.j(collectionValues, "sharedElementNameMapping.values");
                J(aVar3, collectionValues);
                if (aVar.isEmpty()) {
                    Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + firstOut + " and " + lastIn + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList5 = arrayList;
                    it2 = it;
                    u0Var2 = u0Var;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                    obj4 = null;
                } else {
                    obj4 = obj;
                }
            }
            arrayList5 = arrayList;
            it2 = it;
            u0Var2 = u0Var;
            arrayList6 = arrayList2;
            arrayList7 = arrayList3;
        }
        ArrayList arrayList11 = arrayList5;
        u0 u0Var4 = u0Var2;
        ArrayList arrayList12 = arrayList6;
        ArrayList arrayList13 = arrayList7;
        if (obj4 == null) {
            if (arrayList11.isEmpty()) {
                return;
            }
            Iterator it6 = arrayList11.iterator();
            while (it6.hasNext()) {
                if (((h) it6.next()).getTransition() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList11, firstOut, lastIn, u0Var4, obj4, arrayList12, arrayList13, aVar, sharedElementTargetNames, sharedElementSourceNames, aVar2, aVar3, isPop);
        Iterator it7 = arrayList11.iterator();
        while (it7.hasNext()) {
            ((h) it7.next()).getOperation().b(gVar);
        }
    }

    private final void I(Map<String, View> namedViews, View view) {
        String strJ = ViewCompat.J(view);
        if (strJ != null) {
            namedViews.put(strJ, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View child = viewGroup.getChildAt(i11);
                if (child.getVisibility() == 0) {
                    p013kotlin.jvm.internal.s.j(child, "child");
                    I(namedViews, child);
                }
            }
        }
    }

    private final void J(androidx.collection.a<String, View> aVar, Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = aVar.entrySet();
        p013kotlin.jvm.internal.s.j(entries, "entries");
        p013kotlin.collections.v.Q(entries, new i(collection));
    }

    private final void K(List<? extends a1.d> operations) {
        Fragment fragment = ((a1.d) p013kotlin.collections.v.A0(operations)).getFragment();
        for (a1.d dVar : operations) {
            dVar.getFragment().mAnimationInfo.f8367c = fragment.mAnimationInfo.f8367c;
            dVar.getFragment().mAnimationInfo.f8368d = fragment.mAnimationInfo.f8368d;
            dVar.getFragment().mAnimationInfo.f8369e = fragment.mAnimationInfo.f8369e;
            dVar.getFragment().mAnimationInfo.f8370f = fragment.mAnimationInfo.f8370f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    @Override // androidx.fragment.app.a1
    public void d(List<? extends a1.d> operations, boolean isPop) {
        a1.d dVar;
        Object next;
        p013kotlin.jvm.internal.s.k(operations, "operations");
        Iterator<T> it = operations.iterator();
        while (true) {
            dVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            a1.d dVar2 = (a1.d) next;
            a1.d.b.Companion companion = a1.d.b.INSTANCE;
            View view = dVar2.getFragment().mView;
            p013kotlin.jvm.internal.s.j(view, "operation.fragment.mView");
            a1.d.b bVarA = companion.a(view);
            a1.d.b bVar = a1.d.b.VISIBLE;
            if (bVarA == bVar && dVar2.getFinalState() != bVar) {
                break;
            }
        }
        a1.d dVar3 = (a1.d) next;
        ListIterator<? extends a1.d> listIterator = operations.listIterator(operations.size());
        while (listIterator.hasPrevious()) {
            a1.d dVarPrevious = listIterator.previous();
            a1.d dVar4 = dVarPrevious;
            a1.d.b.Companion companion2 = a1.d.b.INSTANCE;
            View view2 = dVar4.getFragment().mView;
            p013kotlin.jvm.internal.s.j(view2, "operation.fragment.mView");
            a1.d.b bVarA2 = companion2.a(view2);
            a1.d.b bVar2 = a1.d.b.VISIBLE;
            if (bVarA2 != bVar2 && dVar4.getFinalState() == bVar2) {
                dVar = dVarPrevious;
                break;
            }
        }
        a1.d dVar5 = dVar;
        if (FragmentManager.O0(2)) {
            Log.v("FragmentManager", "Executing operations from " + dVar3 + " to " + dVar5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        K(operations);
        for (final a1.d dVar6 : operations) {
            arrayList.add(new b(dVar6, isPop));
            boolean z11 = false;
            if (isPop) {
                if (dVar6 == dVar3) {
                    z11 = true;
                }
            } else if (dVar6 == dVar5) {
                z11 = true;
            }
            arrayList2.add(new h(dVar6, isPop, z11));
            dVar6.a(new Runnable() { // from class: androidx.fragment.app.d
                @Override // java.lang.Runnable
                public final void run() {
                    f.G(this.f8495a, dVar6);
                }
            });
        }
        H(arrayList2, isPop, dVar3, dVar5);
        F(arrayList);
    }
}
