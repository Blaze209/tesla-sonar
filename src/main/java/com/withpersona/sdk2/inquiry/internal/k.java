package com.withpersona.sdk2.inquiry.internal;

import a30.ViewEnvironment;
import a30.c0;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import bh0.n2;
import bh0.o2;
import bh0.p2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import tf.d0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\b*\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k;", "La30/k;", "Lcom/withpersona/sdk2/inquiry/internal/m$d$b;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "animationResId", "Ljn0/h0;", "k", "(I)V", "rendering", "La30/a0;", "viewEnvironment", "l", "(Lcom/withpersona/sdk2/inquiry/internal/m$d$b;La30/a0;)V", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/airbnb/lottie/LottieAnimationView;", "c", "Lcom/airbnb/lottie/LottieAnimationView;", "pendingAnimation", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "customAnimation", "e", "currentAnimationRes", "f", "a", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements a30.k<m.d.b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LottieAnimationView pendingAnimation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer customAnimation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Integer currentAnimationRes;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$a;", "La30/c0;", "Lcom/withpersona/sdk2/inquiry/internal/m$d$b;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/internal/m$d$b;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements c0<m.d.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ c0<m.d.b> f57790a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C1178a extends p013kotlin.jvm.internal.p implements wn0.l<View, k> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1178a f57791a = new C1178a();

            C1178a() {
                super(1, k.class, "<init>", "<init>(Landroid/view/View;)V", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k invoke(View p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return new k(p11);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(m.d.b initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
            p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
            p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
            return this.f57790a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super m.d.b> getType() {
            return this.f57790a.getType();
        }

        private Companion() {
            a30.k.Companion companion = a30.k.INSTANCE;
            this.f57790a = new a30.m(o0.b(m.d.b.class), o2.f17328g, C1178a.f57791a);
        }
    }

    public k(View view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        this.view = view;
        View viewFindViewById = view.findViewById(n2.f17305a);
        p013kotlin.jvm.internal.s.j(viewFindViewById, "findViewById(...)");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        this.pendingAnimation = lottieAnimationView;
        Context context = view.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Integer numF = yh0.s.f(context, qh0.a.f105529n, null, false, 6, null);
        this.customAnimation = numF;
        if (numF != null) {
            k(numF.intValue());
            lottieAnimationView.x();
        } else {
            lottieAnimationView.l(new ag.e("**"), d0.f113273b, new ig.e() { // from class: bh0.x
                @Override // ig.e
                public final Object a(ig.b bVar) {
                    return com.withpersona.sdk2.inquiry.internal.k.g(this.f17399a, bVar);
                }
            });
            lottieAnimationView.l(new ag.e("**"), d0.f113272a, new ig.e() { // from class: bh0.y
                @Override // ig.e
                public final Object a(ig.b bVar) {
                    return com.withpersona.sdk2.inquiry.internal.k.h(this.f17404a, bVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer g(k kVar, ig.b bVar) {
        Context context = kVar.view.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        return Integer.valueOf(j(kVar, context, zs.c.f128593t, null, false, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer h(k kVar, ig.b bVar) {
        Context context = kVar.view.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        return Integer.valueOf(j(kVar, context, i.a.f73749z, null, false, 6, null));
    }

    private final int i(Context context, int i11, TypedValue typedValue, boolean z11) {
        context.getTheme().resolveAttribute(i11, typedValue, z11);
        return typedValue.data;
    }

    static /* synthetic */ int j(k kVar, Context context, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return kVar.i(context, i11, typedValue, z11);
    }

    private final void k(int animationResId) {
        Integer num = this.currentAnimationRes;
        if (num != null && num.intValue() == animationResId) {
            return;
        }
        this.currentAnimationRes = Integer.valueOf(animationResId);
        this.pendingAnimation.m();
        this.pendingAnimation.setMinFrame(0);
        this.pendingAnimation.setAnimation(animationResId);
        this.pendingAnimation.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m(m.d.b bVar) {
        bVar.a().invoke();
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer n(int i11, ig.b bVar) {
        return Integer.valueOf(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer o(int i11, ig.b bVar) {
        return Integer.valueOf(i11);
    }

    @Override // a30.k
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void a(final m.d.b rendering, ViewEnvironment viewEnvironment) {
        k kVar;
        int iJ;
        Integer backgroundColorValue;
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        if (rendering.getUseBasicSpinner() && this.customAnimation == null) {
            k(p2.f17333a);
            this.pendingAnimation.setScaleX(0.5f);
            this.pendingAnimation.setScaleY(0.5f);
        }
        if (rendering.getUseBasicSpinner()) {
            Context context = this.view.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            Integer numF = yh0.s.f(context, qh0.a.f105528m, null, false, 6, null);
            if (numF != null) {
                this.view.setBackground(androidx.core.content.b.getDrawable(this.view.getContext(), numF.intValue()));
            }
        }
        StepStyle stepStyleB = rendering.getStyles();
        if (stepStyleB == null || (backgroundColorValue = stepStyleB.getBackgroundColorValue()) == null) {
            Context context2 = this.view.getContext();
            p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
            kVar = this;
            iJ = j(kVar, context2, R.attr.colorBackground, null, false, 6, null);
        } else {
            iJ = backgroundColorValue.intValue();
            kVar = this;
        }
        ji0.c.a(viewEnvironment, iJ);
        StepStyle stepStyleB2 = rendering.getStyles();
        if (stepStyleB2 != null) {
            Integer backgroundColorValue2 = stepStyleB2.getBackgroundColorValue();
            if (backgroundColorValue2 != null) {
                kVar.view.setBackgroundColor(backgroundColorValue2.intValue());
            }
            Context context3 = kVar.view.getContext();
            p013kotlin.jvm.internal.s.j(context3, "getContext(...)");
            Drawable drawableA = wi0.c.a(stepStyleB2, context3);
            if (drawableA != null) {
                kVar.view.setBackground(drawableA);
            }
            if (kVar.customAnimation == null) {
                Integer fillColorValue = stepStyleB2.getFillColorValue();
                if (fillColorValue != null) {
                    final int iIntValue = fillColorValue.intValue();
                    kVar.pendingAnimation.l(new ag.e("**"), d0.f113272a, new ig.e() { // from class: bh0.u
                        @Override // ig.e
                        public final Object a(ig.b bVar) {
                            return com.withpersona.sdk2.inquiry.internal.k.n(iIntValue, bVar);
                        }
                    });
                }
                Integer strokeColorValue = stepStyleB2.getStrokeColorValue();
                if (strokeColorValue != null) {
                    final int iIntValue2 = strokeColorValue.intValue();
                    kVar.pendingAnimation.l(new ag.e("**"), d0.f113273b, new ig.e() { // from class: bh0.v
                        @Override // ig.e
                        public final Object a(ig.b bVar) {
                            return com.withpersona.sdk2.inquiry.internal.k.o(iIntValue2, bVar);
                        }
                    });
                }
            }
        }
        a30.e.c(kVar.view, new wn0.a() { // from class: bh0.w
            @Override // wn0.a
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.internal.k.m(rendering);
            }
        });
    }
}
