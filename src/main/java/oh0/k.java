package oh0;

import a30.ViewEnvironment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001c\u0010)¨\u0006+"}, d2 = {"Loh0/k;", "La30/b;", "", "titleText", "messageText", "positiveButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lkotlin/Function0;", "Ljn0/h0;", "onPositiveButtonClick", "negativeButtonText", "onNegativeButtonClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lwn0/a;Ljava/lang/String;Lwn0/a;)V", "Lph0/b;", "binding", "l", "(Lph0/b;)V", "rendering", "La30/a0;", "viewEnvironment", "p", "(Lph0/b;Loh0/k;La30/a0;)V", "", "isWrappingButtons", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lph0/b;Z)V", "a", "Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "e", "Lwn0/a;", "f", "g", "La30/c0;", "h", "La30/c0;", "()La30/c0;", "viewFactory", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements a30.b<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String titleText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String messageText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String positiveButtonText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StepStyle styles;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> onPositiveButtonClick;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String negativeButtonText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> onNegativeButtonClick;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a30.c0<k> viewFactory;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"oh0/k$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Ljn0/h0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BottomSheetBehavior<FrameLayout> f97415a;

        a(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            this.f97415a = bottomSheetBehavior;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(BottomSheetBehavior bottomSheetBehavior) {
            bottomSheetBehavior.Y0(3);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            p013kotlin.jvm.internal.s.k(view, "view");
            final BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f97415a;
            view.postDelayed(new Runnable() { // from class: oh0.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.a.b(bottomSheetBehavior);
                }
            }, 100L);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            p013kotlin.jvm.internal.s.k(view, "view");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, ph0.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f97416a = new b();

        b() {
            super(3, ph0.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2RequestPermissionRationaleBinding;", 0);
        }

        public final ph0.b a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return ph0.b.c(p11, viewGroup, z11);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ ph0.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return a(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public k(String titleText, String messageText, String positiveButtonText, StepStyle stepStyle, wn0.a<jn0.h0> onPositiveButtonClick, String negativeButtonText, wn0.a<jn0.h0> onNegativeButtonClick) {
        p013kotlin.jvm.internal.s.k(titleText, "titleText");
        p013kotlin.jvm.internal.s.k(messageText, "messageText");
        p013kotlin.jvm.internal.s.k(positiveButtonText, "positiveButtonText");
        p013kotlin.jvm.internal.s.k(onPositiveButtonClick, "onPositiveButtonClick");
        p013kotlin.jvm.internal.s.k(negativeButtonText, "negativeButtonText");
        p013kotlin.jvm.internal.s.k(onNegativeButtonClick, "onNegativeButtonClick");
        this.titleText = titleText;
        this.messageText = messageText;
        this.positiveButtonText = positiveButtonText;
        this.styles = stepStyle;
        this.onPositiveButtonClick = onPositiveButtonClick;
        this.negativeButtonText = negativeButtonText;
        this.onNegativeButtonClick = onNegativeButtonClick;
        a30.k.Companion companion = a30.k.INSTANCE;
        this.viewFactory = new a30.z(p013kotlin.jvm.internal.o0.b(k.class), b.f97416a, new wn0.l() { // from class: oh0.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return k.u(this.f97333a, (ph0.b) obj);
            }
        });
    }

    private final void k(StepStyle styles, ph0.b binding, boolean isWrappingButtons) {
        ButtonCancelComponentStyle buttonSecondaryStyleValue;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        FrameLayout bottomSheet = binding.f102984b;
        p013kotlin.jvm.internal.s.j(bottomSheet, "bottomSheet");
        ConstraintLayout bottomSheetContent = binding.f102985c;
        p013kotlin.jvm.internal.s.j(bottomSheetContent, "bottomSheetContent");
        ui0.c.c(bottomSheet, styles, bottomSheetContent, null, 4, null);
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = binding.f102991i;
            p013kotlin.jvm.internal.s.j(title, "title");
            ui0.e0.n(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView message = binding.f102987e;
            p013kotlin.jvm.internal.s.j(message, "message");
            ui0.e0.n(message, textStyleValue, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) != null) {
            Button positiveButton = binding.f102989g;
            p013kotlin.jvm.internal.s.j(positiveButton, "positiveButton");
            ui0.e.f(positiveButton, buttonPrimaryStyleValue, false, !isWrappingButtons, 2, null);
        }
        if (styles == null || (buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue()) == null) {
            return;
        }
        Button negativeButton = binding.f102988f;
        p013kotlin.jvm.internal.s.j(negativeButton, "negativeButton");
        ui0.e.f(negativeButton, buttonSecondaryStyleValue, false, !isWrappingButtons, 2, null);
    }

    private final void l(ph0.b binding) {
        int iD;
        Integer backgroundColorValue;
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(binding.f102984b);
        p013kotlin.jvm.internal.s.j(bottomSheetBehaviorQ0, "from(...)");
        wn0.a aVar = new wn0.a() { // from class: oh0.g
            @Override // wn0.a
            public final Object invoke() {
                return k.m(this.f97395a);
            }
        };
        FrameLayout bottomSheet = binding.f102984b;
        p013kotlin.jvm.internal.s.j(bottomSheet, "bottomSheet");
        ki0.b.b(bottomSheetBehaviorQ0, aVar, bottomSheet, null, binding.f102990h);
        binding.getRoot().addOnAttachStateChangeListener(new a(bottomSheetBehaviorQ0));
        binding.f102984b.setOnClickListener(new View.OnClickListener() { // from class: oh0.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.n(view);
            }
        });
        binding.f102990h.setOnClickListener(new View.OnClickListener() { // from class: oh0.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.o(bottomSheetBehaviorQ0, view);
            }
        });
        StepStyle stepStyle = this.styles;
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = binding.getRoot().getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            iD = yh0.s.d(context, zs.c.f128599w, null, false, 6, null);
        } else {
            iD = backgroundColorValue.intValue();
        }
        binding.getRoot().setTag(lh0.g.f90035a, Integer.valueOf(iD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m(k kVar) {
        kVar.onNegativeButtonClick.invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.Y0(5);
    }

    private final void p(final ph0.b binding, final k rendering, ViewEnvironment viewEnvironment) {
        if (this.titleText.length() > 0) {
            TextView title = binding.f102991i;
            p013kotlin.jvm.internal.s.j(title, "title");
            pi0.g.d(title, this.titleText);
        } else {
            binding.f102991i.setVisibility(8);
        }
        TextView message = binding.f102987e;
        p013kotlin.jvm.internal.s.j(message, "message");
        pi0.g.d(message, this.messageText);
        binding.f102989g.setText(rendering.positiveButtonText);
        binding.f102989g.setOnClickListener(new View.OnClickListener() { // from class: oh0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.r(this.f97343a, view);
            }
        });
        binding.f102988f.setText(rendering.negativeButtonText);
        binding.f102988f.setOnClickListener(new View.OnClickListener() { // from class: oh0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.s(this.f97376a, view);
            }
        });
        FrameLayout bottomSheet = binding.f102984b;
        p013kotlin.jvm.internal.s.j(bottomSheet, "bottomSheet");
        a30.e.c(bottomSheet, new wn0.a() { // from class: oh0.e
            @Override // wn0.a
            public final Object invoke() {
                return k.t(this.f97377a);
            }
        });
        Button negativeButton = binding.f102988f;
        p013kotlin.jvm.internal.s.j(negativeButton, "negativeButton");
        ki0.s.b(negativeButton, new wn0.a() { // from class: oh0.f
            @Override // wn0.a
            public final Object invoke() {
                return k.q(binding, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 q(ph0.b bVar, k kVar) {
        boolean z11 = true;
        if (bVar.f102988f.getLineCount() > 1 || bVar.f102989g.getLineCount() > 1) {
            Button negativeButton = bVar.f102988f;
            p013kotlin.jvm.internal.s.j(negativeButton, "negativeButton");
            ViewGroup.LayoutParams layoutParams = negativeButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = bVar.f102986d.getWidth();
            negativeButton.setLayoutParams(layoutParams);
            Button positiveButton = bVar.f102989g;
            p013kotlin.jvm.internal.s.j(positiveButton, "positiveButton");
            ViewGroup.LayoutParams layoutParams2 = positiveButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = bVar.f102986d.getWidth();
            positiveButton.setLayoutParams(layoutParams2);
            bVar.f102986d.setReferencedIds(new int[]{bVar.f102989g.getId(), bVar.f102988f.getId()});
        } else {
            z11 = false;
        }
        kVar.k(kVar.styles, bVar, z11);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(k kVar, View view) {
        kVar.onPositiveButtonClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(k kVar, View view) {
        kVar.onNegativeButtonClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 t(k kVar) {
        kVar.onNegativeButtonClick.invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a30.k u(final k kVar, final ph0.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        kVar.l(it);
        return new a30.k() { // from class: oh0.b
            @Override // a30.k
            public final void a(Object obj, ViewEnvironment viewEnvironment) {
                k.v(this.f97338b, it, (k) obj, viewEnvironment);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(k kVar, ph0.b bVar, k rendering, ViewEnvironment viewEnvironment) {
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        p013kotlin.jvm.internal.s.h(bVar);
        kVar.p(bVar, rendering, viewEnvironment);
    }

    @Override // a30.b
    public a30.c0<k> a() {
        return this.viewFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(View view) {
    }
}
