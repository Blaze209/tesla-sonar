package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import tf.c0;
import tf.i;
import th0.v0;
import th0.y0;
import yh0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001_B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u00020\r*\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\r*\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u0016*\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\r*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J1\u0010,\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u001f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\u001f2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u001f¢\u0006\u0004\b2\u00103J\u001b\u00105\u001a\u00020\r2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b5\u00106R\u0014\u00109\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010>\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010A\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010CR$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010R\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010I\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR\u0016\u0010\"\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR \u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR \u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010TR\u0018\u0010^\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006`"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Luh0/b;", "rawRes", "Lkotlin/Function0;", "Ljn0/h0;", "onAnimationEnd", "b0", "(Luh0/b;ILwn0/a;)V", "W", "(Luh0/b;Lwn0/a;)V", "Landroid/view/View;", "", "duration", "Landroid/view/ViewPropertyAnimator;", Gender.MALE, "(Landroid/view/View;J)Landroid/view/ViewPropertyAnimator;", "P", "Landroid/widget/ImageView;", "Landroid/graphics/drawable/Drawable;", "drawable", "g0", "(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V", "", "i0", "(Landroid/content/Context;)Z", "previewView", "setPreviewView", "(Landroid/view/View;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "R", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "viewState", "showProgress", "setState", "(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;ZLwn0/a;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "V", "()Z", "onComplete", "S", "(Lwn0/a;)V", "z", "Luh0/b;", "binding", "A", "Lkotlin/Lazy;", "getDrawableLeft", "()Landroid/graphics/drawable/Drawable;", "drawableLeft", "B", "getDrawableRight", "drawableRight", "C", "I", "leftPoseAnimation", "D", "rightPoseAnimation", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "E", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getLeftPoseImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "setLeftPoseImage", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "leftPoseImage", Gender.FEMALE, "getRightPoseImage", "setRightPoseImage", "rightPoseImage", "G", "Landroid/view/View;", "", "H", "Ljava/util/List;", "oneShotOnCompositionLoadedListeners", "oneShotOnAnimationCompleteListeners", "J", "remoteImageView", "K", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "currentViewState", "b", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OldSelfieOverlayView extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final Lazy drawableLeft;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Lazy drawableRight;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final int leftPoseAnimation;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final int rightPoseAnimation;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private RemoteImage leftPoseImage;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private RemoteImage rightPoseImage;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private View previewView;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final List<wn0.a<h0>> oneShotOnCompositionLoadedListeners;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final List<wn0.a<h0>> oneShotOnAnimationCompleteListeners;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private View remoteImageView;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private b currentViewState;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final uh0.b binding;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Ljn0/h0;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            s.k(animation, "animation");
            List listM1 = v.m1(OldSelfieOverlayView.this.oneShotOnAnimationCompleteListeners);
            OldSelfieOverlayView.this.oneShotOnAnimationCompleteListeners.clear();
            Iterator it = listM1.iterator();
            while (it.hasNext()) {
                ((wn0.a) it.next()).invoke();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;", "", "<init>", "(Ljava/lang/String;I)V", "CLEAR", "CENTER", "CENTER_COMPLETE", "LOOK_LEFT_HINT", "LOOK_LEFT", "LOOK_LEFT_COMPLETE", "LOOK_RIGHT_HINT", "LOOK_RIGHT", "LOOK_RIGHT_COMPLETE", "FINALIZING", "COMPLETE_WITH_CAPTURE", "COMPLETE", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        CLEAR,
        CENTER,
        CENTER_COMPLETE,
        LOOK_LEFT_HINT,
        LOOK_LEFT,
        LOOK_LEFT_COMPLETE,
        LOOK_RIGHT_HINT,
        LOOK_RIGHT,
        LOOK_RIGHT_COMPLETE,
        FINALIZING,
        COMPLETE_WITH_CAPTURE,
        COMPLETE;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58363a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.CENTER_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.LOOK_LEFT_HINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.LOOK_LEFT_COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.LOOK_RIGHT_HINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.LOOK_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.LOOK_RIGHT_COMPLETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.FINALIZING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.COMPLETE_WITH_CAPTURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f58363a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OldSelfieOverlayView(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    public static void B(OldSelfieOverlayView oldSelfieOverlayView, i iVar) {
        List listM1 = v.m1(oldSelfieOverlayView.oneShotOnCompositionLoadedListeners);
        oldSelfieOverlayView.oneShotOnCompositionLoadedListeners.clear();
        Iterator it = listM1.iterator();
        while (it.hasNext()) {
            ((wn0.a) it.next()).invoke();
        }
    }

    private final ViewPropertyAnimator M(final View view, long j11) {
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j11).withEndAction(new Runnable() { // from class: xh0.m
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.O(view);
            }
        });
        s.j(viewPropertyAnimatorWithEndAction, "withEndAction(...)");
        return viewPropertyAnimatorWithEndAction;
    }

    static /* synthetic */ ViewPropertyAnimator N(OldSelfieOverlayView oldSelfieOverlayView, View view, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 200;
        }
        return oldSelfieOverlayView.M(view, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(View view) {
        view.setVisibility(4);
    }

    private final ViewPropertyAnimator P(View view, long j11) {
        if (view.getVisibility() != 0) {
            view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            view.setVisibility(0);
        }
        ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(j11);
        s.j(duration, "setDuration(...)");
        return duration;
    }

    static /* synthetic */ ViewPropertyAnimator Q(OldSelfieOverlayView oldSelfieOverlayView, View view, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 200;
        }
        return oldSelfieOverlayView.P(view, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable T(Context context) {
        Integer numF = yh0.s.f(context, qh0.a.f105532q, null, false, 6, null);
        return numF != null ? androidx.core.content.b.getDrawable(context, numF.intValue()) : androidx.core.content.b.getDrawable(context, v0.f114192a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable U(Context context) {
        Integer numF = yh0.s.f(context, qh0.a.f105534s, null, false, 6, null);
        return numF != null ? androidx.core.content.b.getDrawable(context, numF.intValue()) : androidx.core.content.b.getDrawable(context, v0.f114193b);
    }

    private final void W(final uh0.b bVar, final wn0.a<h0> aVar) {
        View blindsView = bVar.f116221b;
        s.j(blindsView, "blindsView");
        P(blindsView, 80L).withEndAction(new Runnable() { // from class: xh0.k
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.X(this.f123569a, bVar, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(OldSelfieOverlayView oldSelfieOverlayView, uh0.b bVar, final wn0.a aVar) {
        View blindsView = bVar.f116221b;
        s.j(blindsView, "blindsView");
        oldSelfieOverlayView.M(blindsView, 80L).withEndAction(new Runnable() { // from class: xh0.b
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.Y(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(wn0.a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 Z(OldSelfieOverlayView oldSelfieOverlayView, wn0.a aVar) {
        oldSelfieOverlayView.b0(oldSelfieOverlayView.binding, y0.f114471a, aVar);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a0(OldSelfieOverlayView oldSelfieOverlayView, wn0.a aVar) {
        oldSelfieOverlayView.b0(oldSelfieOverlayView.binding, y0.f114471a, aVar);
        return h0.f84049a;
    }

    private final void b0(final uh0.b bVar, int i11, final wn0.a<h0> aVar) {
        this.oneShotOnCompositionLoadedListeners.add(new wn0.a() { // from class: xh0.i
            @Override // wn0.a
            public final Object invoke() {
                return OldSelfieOverlayView.c0(bVar, this, aVar);
            }
        });
        bVar.f116223d.setAnimation(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c0(final uh0.b bVar, final OldSelfieOverlayView oldSelfieOverlayView, final wn0.a aVar) {
        bVar.f116223d.setFrame(0);
        ThemeableLottieAnimationView hintAnimation = bVar.f116223d;
        s.j(hintAnimation, "hintAnimation");
        Q(oldSelfieOverlayView, hintAnimation, 0L, 1, null).withEndAction(new Runnable() { // from class: xh0.l
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.d0(this.f123572a, bVar, aVar);
            }
        });
        View hintOverlayView = bVar.f116225f;
        s.j(hintOverlayView, "hintOverlayView");
        Q(oldSelfieOverlayView, hintOverlayView, 0L, 1, null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(final OldSelfieOverlayView oldSelfieOverlayView, final uh0.b bVar, final wn0.a aVar) {
        oldSelfieOverlayView.oneShotOnAnimationCompleteListeners.add(new wn0.a() { // from class: xh0.c
            @Override // wn0.a
            public final Object invoke() {
                return OldSelfieOverlayView.e0(this.f123555a, bVar, aVar);
            }
        });
        bVar.f116223d.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e0(OldSelfieOverlayView oldSelfieOverlayView, uh0.b bVar, final wn0.a aVar) {
        ThemeableLottieAnimationView hintAnimation = bVar.f116223d;
        s.j(hintAnimation, "hintAnimation");
        N(oldSelfieOverlayView, hintAnimation, 0L, 1, null).withEndAction(new Runnable() { // from class: xh0.d
            @Override // java.lang.Runnable
            public final void run() {
                OldSelfieOverlayView.f0(aVar);
            }
        });
        View hintOverlayView = bVar.f116225f;
        s.j(hintOverlayView, "hintOverlayView");
        N(oldSelfieOverlayView, hintOverlayView, 0L, 1, null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(wn0.a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final void g0(final ImageView imageView, Drawable drawable) {
        if (s.f(imageView.getDrawable(), drawable)) {
            return;
        }
        if (drawable == null) {
            N(this, imageView, 0L, 1, null).withEndAction(new Runnable() { // from class: xh0.j
                @Override // java.lang.Runnable
                public final void run() {
                    OldSelfieOverlayView.h0(imageView);
                }
            });
            return;
        }
        imageView.setImageDrawable(drawable);
        imageView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        Q(this, imageView, 0L, 1, null);
    }

    private final Drawable getDrawableLeft() {
        return (Drawable) this.drawableLeft.getValue();
    }

    private final Drawable getDrawableRight() {
        return (Drawable) this.drawableRight.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(ImageView imageView) {
        imageView.setImageDrawable(null);
    }

    private final boolean i0(Context context) {
        return (yh0.s.f(context, qh0.a.f105532q, null, false, 6, null) == null || yh0.s.f(context, qh0.a.f105534s, null, false, 6, null) == null) && this.leftPoseImage == null && this.rightPoseImage == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setState$default(OldSelfieOverlayView oldSelfieOverlayView, b bVar, boolean z11, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        oldSelfieOverlayView.setState(bVar, z11, (wn0.a<h0>) aVar);
    }

    public final void R(StepStyles.SelfieStepStyle styles) {
        s.k(styles, "styles");
        Integer selfieCaptureFeedBoxBorderColorValue = styles.getSelfieCaptureFeedBoxBorderColorValue();
        if (selfieCaptureFeedBoxBorderColorValue != null) {
            this.binding.f116227h.setStrokeColor(selfieCaptureFeedBoxBorderColorValue.intValue());
        }
        Double selfieCaptureFeedBoxBorderWidthValue = styles.getSelfieCaptureFeedBoxBorderWidthValue();
        if (selfieCaptureFeedBoxBorderWidthValue != null) {
            this.binding.f116227h.setStrokeWidth((float) h.a(selfieCaptureFeedBoxBorderWidthValue.doubleValue()));
        }
        Integer selfieCaptureIconStrokeColor = styles.getSelfieCaptureIconStrokeColor();
        if (selfieCaptureIconStrokeColor != null) {
            int iIntValue = selfieCaptureIconStrokeColor.intValue();
            this.binding.f116223d.F(Color.parseColor("#022050"), iIntValue);
            this.binding.f116223d.F(Color.parseColor("#280087"), iIntValue);
        }
        Integer selfieCaptureIconFillColor = styles.getSelfieCaptureIconFillColor();
        if (selfieCaptureIconFillColor != null) {
            int iIntValue2 = selfieCaptureIconFillColor.intValue();
            this.binding.f116223d.F(Color.parseColor("#AA85FF"), iIntValue2);
            this.binding.f116223d.F(Color.parseColor("#8552FF"), iIntValue2);
        }
        Integer selfieCaptureIconBackgroundFillColor = styles.getSelfieCaptureIconBackgroundFillColor();
        if (selfieCaptureIconBackgroundFillColor != null) {
            this.binding.f116223d.F(Color.parseColor("#DBCCFF"), selfieCaptureIconBackgroundFillColor.intValue());
        }
    }

    public final void S(wn0.a<h0> onComplete) {
        s.k(onComplete, "onComplete");
        Pi2CircleMaskView.e(this.binding.f116222c, false, onComplete, 1, null);
    }

    public final boolean V() {
        return this.binding.f116222c.g();
    }

    public final RemoteImage getLeftPoseImage() {
        return this.leftPoseImage;
    }

    public final RemoteImage getRightPoseImage() {
        return this.rightPoseImage;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    public final void setLeftPoseImage(RemoteImage remoteImage) {
        this.leftPoseImage = remoteImage;
    }

    public final void setPreviewView(View previewView) {
        s.k(previewView, "previewView");
        this.previewView = previewView;
    }

    public final void setRightPoseImage(RemoteImage remoteImage) {
        this.rightPoseImage = remoteImage;
    }

    public final void setState(b viewState, boolean showProgress, final wn0.a<h0> onAnimationEnd) {
        s.k(viewState, "viewState");
        if (this.currentViewState == viewState) {
            return;
        }
        this.currentViewState = viewState;
        removeView(this.remoteImageView);
        Context context = getContext();
        s.j(context, "getContext(...)");
        boolean zI0 = i0(context);
        uh0.b bVar = this.binding;
        if (showProgress) {
            bVar.f116227h.setVisibility(0);
        } else {
            bVar.f116227h.setVisibility(8);
        }
        switch (c.f58363a[viewState.ordinal()]) {
            case 1:
                bVar.f116222c.h();
                bVar.f116227h.setProgress(BitmapDescriptorFactory.HUE_RED, onAnimationEnd);
                return;
            case 2:
                Pi2CircleMaskView.e(bVar.f116222c, false, null, 3, null);
                bVar.f116227h.setProgress(BitmapDescriptorFactory.HUE_RED, onAnimationEnd);
                return;
            case 3:
                Pi2CircleMaskView.e(bVar.f116222c, false, null, 3, null);
                Pi2ProgressArcView.setProgress$default(bVar.f116227h, BitmapDescriptorFactory.HUE_RED, null, 2, null);
                W(this.binding, onAnimationEnd);
                return;
            case 4:
                Pi2CircleMaskView.e(bVar.f116222c, false, null, 3, null);
                Pi2ProgressArcView.setProgress$default(bVar.f116227h, BitmapDescriptorFactory.HUE_RED, null, 2, null);
                if (zI0) {
                    b0(this.binding, this.leftPoseAnimation, onAnimationEnd);
                    return;
                } else {
                    if (onAnimationEnd != null) {
                        onAnimationEnd.invoke();
                        return;
                    }
                    return;
                }
            case 5:
                Pi2CircleMaskView.e(bVar.f116222c, false, null, 3, null);
                bVar.f116227h.setProgress(BitmapDescriptorFactory.HUE_RED, onAnimationEnd);
                if (zI0) {
                    return;
                }
                RemoteImage remoteImage = this.leftPoseImage;
                if (remoteImage != null) {
                    this.remoteImageView = wi0.b.b(remoteImage, this, true);
                    return;
                }
                bVar.f116226g.setVisibility(0);
                ImageView hintImage = bVar.f116224e;
                s.j(hintImage, "hintImage");
                g0(hintImage, getDrawableLeft());
                return;
            case 6:
                Pi2CircleMaskView.e(bVar.f116222c, false, null, 3, null);
                Pi2ProgressArcView.setProgress$default(bVar.f116227h, 50.0f, null, 2, null);
                W(this.binding, onAnimationEnd);
                return;
            case 7:
                Pi2CircleMaskView.e(bVar.f116222c, false, null, 3, null);
                Pi2ProgressArcView.setProgress$default(bVar.f116227h, 50.0f, null, 2, null);
                if (zI0) {
                    b0(this.binding, this.rightPoseAnimation, onAnimationEnd);
                    return;
                } else {
                    if (onAnimationEnd != null) {
                        onAnimationEnd.invoke();
                        return;
                    }
                    return;
                }
            case 8:
                Pi2CircleMaskView.e(bVar.f116222c, false, null, 3, null);
                bVar.f116227h.setProgress(50.0f, onAnimationEnd);
                if (zI0) {
                    return;
                }
                RemoteImage remoteImage2 = this.rightPoseImage;
                if (remoteImage2 != null) {
                    this.remoteImageView = wi0.b.b(remoteImage2, this, true);
                    return;
                }
                bVar.f116226g.setVisibility(0);
                ImageView hintImage2 = bVar.f116224e;
                s.j(hintImage2, "hintImage");
                g0(hintImage2, getDrawableRight());
                return;
            case 9:
                Pi2CircleMaskView.e(bVar.f116222c, false, null, 3, null);
                Pi2ProgressArcView.setProgress$default(bVar.f116227h, 100.0f, null, 2, null);
                W(this.binding, onAnimationEnd);
                return;
            case 10:
                Pi2CircleMaskView.e(bVar.f116222c, false, null, 3, null);
                bVar.f116227h.setIndeterminate();
                return;
            case 11:
                Pi2CircleMaskView.e(bVar.f116222c, false, null, 3, null);
                Pi2ProgressArcView.setProgress$default(bVar.f116227h, 100.0f, null, 2, null);
                W(this.binding, new wn0.a() { // from class: xh0.g
                    @Override // wn0.a
                    public final Object invoke() {
                        return OldSelfieOverlayView.Z(this.f123561a, onAnimationEnd);
                    }
                });
                return;
            case 12:
                Pi2CircleMaskView.e(bVar.f116222c, false, null, 3, null);
                bVar.f116227h.setProgress(100.0f, new wn0.a() { // from class: xh0.h
                    @Override // wn0.a
                    public final Object invoke() {
                        return OldSelfieOverlayView.a0(this.f123563a, onAnimationEnd);
                    }
                });
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OldSelfieOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ OldSelfieOverlayView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldSelfieOverlayView(final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        uh0.b bVarB = uh0.b.b(LayoutInflater.from(context), this);
        s.j(bVarB, "inflate(...)");
        this.binding = bVarB;
        this.drawableLeft = m.b(new wn0.a() { // from class: xh0.a
            @Override // wn0.a
            public final Object invoke() {
                return OldSelfieOverlayView.T(context);
            }
        });
        this.drawableRight = m.b(new wn0.a() { // from class: xh0.e
            @Override // wn0.a
            public final Object invoke() {
                return OldSelfieOverlayView.U(context);
            }
        });
        Integer numF = yh0.s.f(context, qh0.a.f105533r, null, false, 6, null);
        this.leftPoseAnimation = numF != null ? numF.intValue() : y0.f114472b;
        Integer numF2 = yh0.s.f(context, qh0.a.f105533r, null, false, 6, null);
        this.rightPoseAnimation = numF2 != null ? numF2.intValue() : y0.f114473c;
        this.oneShotOnCompositionLoadedListeners = new ArrayList();
        this.oneShotOnAnimationCompleteListeners = new ArrayList();
        ThemeableLottieAnimationView themeableLottieAnimationView = bVarB.f116223d;
        themeableLottieAnimationView.j(new c0() { // from class: xh0.f
            @Override // tf.c0
            public final void a(tf.i iVar) {
                OldSelfieOverlayView.B(this.f123560a, iVar);
            }
        });
        themeableLottieAnimationView.i(new a());
        int color = Color.parseColor("#022050");
        Context context2 = bVarB.getRoot().getContext();
        s.j(context2, "getContext(...)");
        themeableLottieAnimationView.F(color, yh0.s.d(context2, zs.c.f128593t, null, false, 6, null));
        int color2 = Color.parseColor("#AA85FF");
        Context context3 = bVarB.getRoot().getContext();
        s.j(context3, "getContext(...)");
        themeableLottieAnimationView.F(color2, yh0.s.d(context3, zs.c.f128595u, null, false, 6, null));
        int color3 = Color.parseColor("#280087");
        Context context4 = bVarB.getRoot().getContext();
        s.j(context4, "getContext(...)");
        themeableLottieAnimationView.F(color3, yh0.s.d(context4, zs.c.f128593t, null, false, 6, null));
        int color4 = Color.parseColor("#8552FF");
        Context context5 = bVarB.getRoot().getContext();
        s.j(context5, "getContext(...)");
        themeableLottieAnimationView.F(color4, yh0.s.d(context5, zs.c.f128595u, null, false, 6, null));
        Context context6 = bVarB.getRoot().getContext();
        s.j(context6, "getContext(...)");
        int iD = yh0.s.d(context6, zs.c.f128595u, null, false, 6, null);
        Context context7 = bVarB.getRoot().getContext();
        s.j(context7, "getContext(...)");
        themeableLottieAnimationView.F(Color.parseColor("#DBCCFF"), k5.d.c(iD, yh0.s.d(context7, zs.c.f128599w, null, false, 6, null), 0.66f));
    }
}
