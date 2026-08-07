package th0;

import a30.ViewEnvironment;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lth0/l1;", "La30/k;", "Lth0/d6$d$b;", "Luh0/e;", "binding", "<init>", "(Luh0/e;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Ljn0/h0;", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V", "La30/a0;", "viewEnvironment", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;La30/a0;)V", "rendering", "f", "(Lth0/d6$d$b;La30/a0;)V", "b", "Luh0/e;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentInstructionAssetView", DateTokenConverter.CONVERTER_KEY, "a", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l1 implements a30.k<d6.d.b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uh0.e binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private View currentInstructionAssetView;

    /* JADX INFO: renamed from: th0.l1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lth0/l1$a;", "La30/c0;", "Lth0/d6$d$b;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lth0/d6$d$b;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements a30.c0<d6.d.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ a30.c0<d6.d.b> f113964a;

        /* JADX INFO: renamed from: th0.l1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C2433a extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, uh0.e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2433a f113965a = new C2433a();

            C2433a() {
                super(3, uh0.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;", 0);
            }

            public final uh0.e a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return uh0.e.c(p11, viewGroup, z11);
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ uh0.e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return a(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: th0.l1$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<uh0.e, l1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f113966a = new b();

            b() {
                super(1, l1.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieInstructionsBinding;)V", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l1 invoke(uh0.e p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return new l1(p11);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(d6.d.b initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
            p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
            p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
            return this.f113964a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super d6.d.b> getType() {
            return this.f113964a.getType();
        }

        private Companion() {
            a30.k.Companion companion = a30.k.INSTANCE;
            this.f113964a = new a30.z(p013kotlin.jvm.internal.o0.b(d6.d.b.class), C2433a.f113965a, b.f113966a);
        }
    }

    public l1(uh0.e binding) {
        p013kotlin.jvm.internal.s.k(binding, "binding");
        this.binding = binding;
        ScrollView root = binding.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ki0.f.d(root, false, false, false, false, 15, null);
    }

    private final void e(StepStyles.SelfieStepStyle styles, ViewEnvironment viewEnvironment) {
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textView = this.binding.f116267m;
            textView.setPadding(textView.getPaddingLeft(), 0, this.binding.f116267m.getPaddingRight(), 0);
            TextView textviewSelfieStartTitle = this.binding.f116267m;
            p013kotlin.jvm.internal.s.j(textviewSelfieStartTitle, "textviewSelfieStartTitle");
            ui0.e0.n(textviewSelfieStartTitle, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView2 = this.binding.f116266l;
            textView2.setPadding(textView2.getPaddingLeft(), 0, this.binding.f116266l.getPaddingRight(), 0);
            TextView textviewSelfieStartBody = this.binding.f116266l;
            p013kotlin.jvm.internal.s.j(textviewSelfieStartBody, "textviewSelfieStartBody");
            ui0.e0.n(textviewSelfieStartBody, textStyleValue, null, 2, null);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textView3 = this.binding.f116265k;
            textView3.setPadding(textView3.getPaddingLeft(), 0, this.binding.f116265k.getPaddingRight(), 0);
            TextView textviewSelfieDisclosure = this.binding.f116265k;
            p013kotlin.jvm.internal.s.j(textviewSelfieDisclosure, "textviewSelfieDisclosure");
            ui0.e0.n(textviewSelfieDisclosure, disclaimerStyleValue, null, 2, null);
        }
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            ji0.c.a(viewEnvironment, iIntValue);
        }
        Context context = this.binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Drawable drawableA = wi0.c.a(styles, context);
        if (drawableA != null) {
            this.binding.getRoot().setBackground(drawableA);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f116261g.setControlsColor(headerButtonColorValue.intValue());
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            Button startButton = this.binding.f116264j;
            p013kotlin.jvm.internal.s.j(startButton, "startButton");
            ui0.e.f(startButton, buttonPrimaryStyleValue, false, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(d6.d.b bVar, View view) {
        bVar.f().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h(d6.d.b bVar) {
        bVar.d().invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i(d6.d.b bVar) {
        bVar.e().invoke();
        return jn0.h0.f84049a;
    }

    private final void j(StepStyles.SelfieStepStyle styles) {
        if (styles != null) {
            ThemeableLottieAnimationView instructionAnimation = this.binding.f116259e;
            p013kotlin.jvm.internal.s.j(instructionAnimation, "instructionAnimation");
            ui0.g.c(instructionAnimation, styles.getSelfieStartIconStyle(), new String[]{"#022050"}, new String[]{"#AA85FF"}, new String[]{"#DBCCFF"});
            return;
        }
        ThemeableLottieAnimationView themeableLottieAnimationView = this.binding.f116259e;
        int color = Color.parseColor("#022050");
        Context context = this.binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        themeableLottieAnimationView.F(color, yh0.s.d(context, zs.c.f128593t, null, false, 6, null));
        ThemeableLottieAnimationView themeableLottieAnimationView2 = this.binding.f116259e;
        int color2 = Color.parseColor("#AA85FF");
        Context context2 = this.binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
        themeableLottieAnimationView2.F(color2, yh0.s.d(context2, zs.c.f128595u, null, false, 6, null));
        Context context3 = this.binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context3, "getContext(...)");
        int iD = yh0.s.d(context3, zs.c.f128595u, null, false, 6, null);
        Context context4 = this.binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context4, "getContext(...)");
        this.binding.f116259e.F(Color.parseColor("#DBCCFF"), k5.d.c(iD, yh0.s.d(context4, zs.c.f128599w, null, false, 6, null), 0.66f));
    }

    @Override // a30.k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void a(final d6.d.b rendering, ViewEnvironment viewEnvironment) {
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        uh0.e eVar = this.binding;
        Context context = eVar.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Integer numF = yh0.s.f(context, qh0.a.f105535t, null, false, 6, null);
        if (numF != null) {
            this.binding.f116258d.setImageResource(numF.intValue());
            this.binding.f116258d.setVisibility(0);
        }
        eVar.f116267m.setText(rendering.getTitle());
        eVar.f116266l.setText(rendering.getPrompt());
        ql0.e.b(eVar.f116265k.getContext()).c(eVar.f116265k, rendering.getDisclosure());
        eVar.f116264j.setText(rendering.getStart());
        eVar.f116264j.setOnClickListener(new View.OnClickListener() { // from class: th0.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l1.g(rendering, view);
            }
        });
        ii0.a aVarC = rendering.getNavigationState();
        wn0.a aVar = new wn0.a() { // from class: th0.j1
            @Override // wn0.a
            public final Object invoke() {
                return l1.h(rendering);
            }
        };
        wn0.a aVar2 = new wn0.a() { // from class: th0.k1
            @Override // wn0.a
            public final Object invoke() {
                return l1.i(rendering);
            }
        };
        Pi2NavigationBar navigationBar = eVar.f116261g;
        p013kotlin.jvm.internal.s.j(navigationBar, "navigationBar");
        ScrollView root = eVar.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ii0.e.b(aVarC, aVar, aVar2, navigationBar, root);
        Context context2 = this.binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
        Integer numF2 = yh0.s.f(context2, qh0.a.f105530o, null, false, 6, null);
        if (rendering.getInstructionAsset() != null) {
            if (this.currentInstructionAssetView == null) {
                RemoteImage remoteImageB = rendering.getInstructionAsset();
                ConstraintLayout nestedUiContainer = eVar.f116262h;
                p013kotlin.jvm.internal.s.j(nestedUiContainer, "nestedUiContainer");
                this.currentInstructionAssetView = wi0.b.c(remoteImageB, nestedUiContainer, false, 2, null);
                eVar.f116259e.setVisibility(8);
            }
        } else if (numF2 != null) {
            eVar.f116259e.setAnimation(numF2.intValue());
            eVar.f116259e.x();
        } else {
            j(rendering.getStyles());
        }
        if (rendering.getStyles() != null) {
            e(rendering.getStyles(), viewEnvironment);
        }
    }
}
