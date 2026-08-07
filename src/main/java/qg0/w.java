package qg0;

import a30.ViewEnvironment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\n*\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b\u0015\u0010-¨\u0006/"}, d2 = {"Lqg0/w;", "La30/b;", "", "titleText", "continueButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "onContinueClick", "onBackClick", "onCancelClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lii0/a;Lwn0/a;Lwn0/a;Lwn0/a;)V", "Ltg0/a;", "La30/a0;", "viewEnvironment", "h", "(Ltg0/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;La30/a0;)V", "a", "Ljava/lang/String;", "getTitleText", "()Ljava/lang/String;", "b", "getContinueButtonText", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", DateTokenConverter.CONVERTER_KEY, "Lii0/a;", "getNavigationState", "()Lii0/a;", "e", "Lwn0/a;", "getOnContinueClick", "()Lwn0/a;", "f", "getOnBackClick", "g", "getOnCancelClick", "La30/c0;", "La30/c0;", "()La30/c0;", "viewFactory", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w implements a30.b<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String titleText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String continueButtonText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StepStyles.GovernmentIdStepStyle styles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ii0.a navigationState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onContinueClick;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onBackClick;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onCancelClick;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a30.c0<w> viewFactory;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, tg0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f105489a = new a();

        a() {
            super(3, tg0.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2ErrorBinding;", 0);
        }

        public final tg0.a a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return tg0.a.c(p11, viewGroup, z11);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ tg0.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return a(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public w(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, ii0.a navigationState, wn0.a<h0> onContinueClick, wn0.a<h0> onBackClick, wn0.a<h0> onCancelClick) {
        p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
        p013kotlin.jvm.internal.s.k(onContinueClick, "onContinueClick");
        p013kotlin.jvm.internal.s.k(onBackClick, "onBackClick");
        p013kotlin.jvm.internal.s.k(onCancelClick, "onCancelClick");
        this.titleText = str;
        this.continueButtonText = str2;
        this.styles = governmentIdStepStyle;
        this.navigationState = navigationState;
        this.onContinueClick = onContinueClick;
        this.onBackClick = onBackClick;
        this.onCancelClick = onCancelClick;
        a30.k.Companion companion = a30.k.INSTANCE;
        this.viewFactory = new a30.z(o0.b(w.class), a.f105489a, new wn0.l() { // from class: qg0.q
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return w.i(this.f105473a, (tg0.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a30.k i(final w wVar, final tg0.a binding) {
        p013kotlin.jvm.internal.s.k(binding, "binding");
        CoordinatorLayout root = binding.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ki0.f.d(root, false, false, false, false, 15, null);
        return new a30.k() { // from class: qg0.r
            @Override // a30.k
            public final void a(Object obj, ViewEnvironment viewEnvironment) {
                w.j(binding, wVar, (w) obj, viewEnvironment);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final tg0.a aVar, final w wVar, final w rendering, ViewEnvironment viewEnvironment) {
        StepStyles.GovernmentIdStepImageLocalStyle imageLocalStyle;
        StepStyles.GovernmentIdStepImageLocalStyleContainer illustration;
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        ii0.a aVar2 = rendering.navigationState;
        wn0.a aVar3 = new wn0.a() { // from class: qg0.s
            @Override // wn0.a
            public final Object invoke() {
                return w.k(this.f105476a);
            }
        };
        wn0.a aVar4 = new wn0.a() { // from class: qg0.t
            @Override // wn0.a
            public final Object invoke() {
                return w.l(this.f105477a);
            }
        };
        Pi2NavigationBar navigationBar = aVar.f113413e;
        p013kotlin.jvm.internal.s.j(navigationBar, "navigationBar");
        CoordinatorLayout root = aVar.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ii0.e.b(aVar2, aVar3, aVar4, navigationBar, root);
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = rendering.styles;
        final LocalImageComponentStyle base = (governmentIdStepStyle == null || (imageLocalStyle = governmentIdStepStyle.getImageLocalStyle()) == null || (illustration = imageLocalStyle.getIllustration()) == null) ? null : illustration.getBase();
        aVar.f113412d.setAnimation(yh0.o.f125562i);
        if (base != null) {
            CoordinatorLayout root2 = aVar.getRoot();
            p013kotlin.jvm.internal.s.j(root2, "getRoot(...)");
            ki0.s.b(root2, new wn0.a() { // from class: qg0.u
                @Override // wn0.a
                public final Object invoke() {
                    return w.m(aVar, base);
                }
            });
        }
        aVar.f113414f.setText(rendering.titleText);
        aVar.f113411c.setText(rendering.continueButtonText);
        aVar.f113411c.setOnClickListener(new View.OnClickListener() { // from class: qg0.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.n(this.f105480a, view);
            }
        });
        p013kotlin.jvm.internal.s.h(aVar);
        wVar.h(aVar, rendering.styles, viewEnvironment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(w wVar) {
        wVar.onBackClick.invoke();
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(w wVar) {
        wVar.onCancelClick.invoke();
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m(tg0.a aVar, LocalImageComponentStyle localImageComponentStyle) {
        ThemeableLottieAnimationView illustration = aVar.f113412d;
        p013kotlin.jvm.internal.s.j(illustration, "illustration");
        ui0.g.c(illustration, localImageComponentStyle, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0]);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(w wVar, View view) {
        wVar.onContinueClick.invoke();
    }

    @Override // a30.b
    public a30.c0<w> a() {
        return this.viewFactory;
    }

    public final void h(tg0.a aVar, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, ViewEnvironment viewEnvironment) {
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        if (governmentIdStepStyle == null) {
            return;
        }
        Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            aVar.getRoot().setBackgroundColor(iIntValue);
            ji0.c.a(viewEnvironment, iIntValue);
        }
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle.getTitleStyle();
        if (titleStyle != null && (base3 = titleStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextView title = aVar.f113414f;
            p013kotlin.jvm.internal.s.j(title, "title");
            ui0.e0.n(title, base4, null, 2, null);
        }
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle();
        if (buttonPrimaryStyle == null || (base = buttonPrimaryStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return;
        }
        Button continueButton = aVar.f113411c;
        p013kotlin.jvm.internal.s.j(continueButton, "continueButton");
        ui0.e.f(continueButton, base2, false, false, 6, null);
    }
}
