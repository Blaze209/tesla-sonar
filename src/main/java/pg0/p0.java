package pg0;

import a30.ViewEnvironment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lpg0/p0;", "La30/k;", "Lpg0/g5$c;", "Ltg0/f;", "binding", "<init>", "(Ltg0/f;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "La30/a0;", "viewEnvironment", "Ljn0/h0;", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;La30/a0;)V", "rendering", "h", "(Lpg0/g5$c;La30/a0;)V", "b", "Ltg0/f;", "", "c", "Z", "shouldHideSeparators", "Landroidx/recyclerview/widget/i;", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/i;", "dividerItemDecoration", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "a", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p0 implements a30.k<g5.c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tg0.f binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldHideSeparators;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final androidx.recyclerview.widget.i dividerItemDecoration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final RecyclerView recyclerView;

    /* JADX INFO: renamed from: pg0.p0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lpg0/p0$a;", "La30/c0;", "Lpg0/g5$c;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lpg0/g5$c;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements a30.c0<g5.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ a30.c0<g5.c> f102836a;

        /* JADX INFO: renamed from: pg0.p0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C2181a extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, tg0.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2181a f102837a = new C2181a();

            C2181a() {
                super(3, tg0.f.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;", 0);
            }

            public final tg0.f a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return tg0.f.c(p11, viewGroup, z11);
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ tg0.f invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return a(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: pg0.p0$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<tg0.f, p0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f102838a = new b();

            b() {
                super(1, p0.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidInstructionsBinding;)V", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p0 invoke(tg0.f p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return new p0(p11);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(g5.c initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
            p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
            p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
            return this.f102836a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super g5.c> getType() {
            return this.f102836a.getType();
        }

        private Companion() {
            a30.k.Companion companion = a30.k.INSTANCE;
            this.f102836a = new a30.z(p013kotlin.jvm.internal.o0.b(g5.c.class), C2181a.f102837a, b.f102838a);
        }
    }

    public p0(tg0.f binding) {
        p013kotlin.jvm.internal.s.k(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        boolean zB = yh0.s.b(context, qh0.a.f105520e, null, false, false, 14, null);
        this.shouldHideSeparators = zB;
        androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i(binding.getRoot().getContext(), 1);
        this.dividerItemDecoration = iVar;
        RecyclerView recyclerView = binding.f113475g;
        recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
        if (!zB) {
            recyclerView.j(iVar);
        }
        p013kotlin.jvm.internal.s.j(recyclerView, "apply(...)");
        this.recyclerView = recyclerView;
        CoordinatorLayout coordinatorLayoutB = binding.getRoot();
        p013kotlin.jvm.internal.s.j(coordinatorLayoutB, "getRoot(...)");
        ki0.f.d(coordinatorLayoutB, false, false, false, false, 15, null);
    }

    private final void f(StepStyles.GovernmentIdStepStyle styles, ViewEnvironment viewEnvironment) {
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
            this.binding.f113474f.setControlsColor(headerButtonColorValue.intValue());
        }
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textviewGovernmentidInstructionsTitle = this.binding.f113478j;
            p013kotlin.jvm.internal.s.j(textviewGovernmentidInstructionsTitle, "textviewGovernmentidInstructionsTitle");
            ui0.e0.n(textviewGovernmentidInstructionsTitle, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textviewGovernmentidInstructionsBody = this.binding.f113476h;
            p013kotlin.jvm.internal.s.j(textviewGovernmentidInstructionsBody, "textviewGovernmentidInstructionsBody");
            ui0.e0.n(textviewGovernmentidInstructionsBody, textStyleValue, null, 2, null);
            TextView textviewGovernmentidInstructionslistheader = this.binding.f113479k;
            p013kotlin.jvm.internal.s.j(textviewGovernmentidInstructionslistheader, "textviewGovernmentidInstructionslistheader");
            ui0.e0.n(textviewGovernmentidInstructionslistheader, textStyleValue, null, 2, null);
        }
        TextBasedComponentStyle disclaimerStyleValue = styles.getDisclaimerStyleValue();
        if (disclaimerStyleValue != null) {
            TextView textviewGovernmentidInstructionsDisclaimer = this.binding.f113477i;
            p013kotlin.jvm.internal.s.j(textviewGovernmentidInstructionsDisclaimer, "textviewGovernmentidInstructionsDisclaimer");
            ui0.e0.n(textviewGovernmentidInstructionsDisclaimer, disclaimerStyleValue, null, 2, null);
        }
        Integer governmentIdSelectOptionBorderColorValue = styles.getGovernmentIdSelectOptionBorderColorValue();
        if (governmentIdSelectOptionBorderColorValue != null) {
            int iIntValue2 = governmentIdSelectOptionBorderColorValue.intValue();
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iIntValue2, iIntValue2});
            gradientDrawable.setSize((int) Math.ceil(yh0.h.a(1.0d)), (int) Math.ceil(yh0.h.a(1.0d)));
            this.dividerItemDecoration.o(gradientDrawable);
            this.binding.f113473e.setBackgroundColor(iIntValue2);
        }
        Double governmentIdOptionBorderWidthValue = styles.getGovernmentIdOptionBorderWidthValue();
        if (governmentIdOptionBorderWidthValue != null) {
            final double dDoubleValue = governmentIdOptionBorderWidthValue.doubleValue();
            GradientDrawable gradientDrawable2 = (GradientDrawable) this.dividerItemDecoration.n();
            if (gradientDrawable2 != null) {
                gradientDrawable2.setSize((int) Math.ceil(yh0.h.a(dDoubleValue)), (int) Math.ceil(yh0.h.a(dDoubleValue)));
            }
            View listDivider = this.binding.f113473e;
            p013kotlin.jvm.internal.s.j(listDivider, "listDivider");
            ki0.s.b(listDivider, new wn0.a() { // from class: pg0.o0
                @Override // wn0.a
                public final Object invoke() {
                    return p0.g(this.f102814a, dDoubleValue);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g(p0 p0Var, double d11) {
        View view = p0Var.binding.f113473e;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (d11 > 0.0d) {
            layoutParams.height = (int) yh0.h.a(d11);
        } else {
            p0Var.binding.f113473e.setVisibility(8);
        }
        view.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i(g5.c cVar, IdConfig idClass) {
        p013kotlin.jvm.internal.s.k(idClass, "idClass");
        cVar.k().invoke(idClass);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j(g5.c cVar) {
        cVar.g().invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 k(g5.c cVar) {
        cVar.h().invoke();
        return jn0.h0.f84049a;
    }

    @Override // a30.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(final g5.c rendering, ViewEnvironment viewEnvironment) {
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        Context context = this.binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Integer numF = yh0.s.f(context, qh0.a.f105518c, null, false, 6, null);
        NextStep.GovernmentId.AssetConfig.SelectPage assetConfig = rendering.getAssetConfig();
        RemoteImage headerPictograph = assetConfig != null ? assetConfig.getHeaderPictograph() : null;
        if (numF != null) {
            this.binding.f113472d.setImageResource(numF.intValue());
            TextView textviewGovernmentidInstructionsTitle = this.binding.f113478j;
            p013kotlin.jvm.internal.s.j(textviewGovernmentidInstructionsTitle, "textviewGovernmentidInstructionsTitle");
            ViewGroup.LayoutParams layoutParams = textviewGovernmentidInstructionsTitle.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            textviewGovernmentidInstructionsTitle.setLayoutParams(marginLayoutParams);
            this.binding.f113471c.setVisibility(8);
            this.binding.f113472d.setVisibility(0);
        } else if (headerPictograph != null) {
            ConstraintLayout governmentidHeaderImageContainer = this.binding.f113471c;
            p013kotlin.jvm.internal.s.j(governmentidHeaderImageContainer, "governmentidHeaderImageContainer");
            wi0.b.c(headerPictograph, governmentidHeaderImageContainer, false, 2, null);
            this.binding.f113471c.setVisibility(0);
            this.binding.f113472d.setVisibility(8);
        } else {
            this.binding.f113471c.setVisibility(8);
            this.binding.f113472d.setVisibility(8);
        }
        this.binding.f113478j.setText(rendering.getTitle());
        TextView textviewGovernmentidInstructionsBody = this.binding.f113476h;
        p013kotlin.jvm.internal.s.j(textviewGovernmentidInstructionsBody, "textviewGovernmentidInstructionsBody");
        q0.b(textviewGovernmentidInstructionsBody, rendering.getPrompt());
        TextView textviewGovernmentidInstructionslistheader = this.binding.f113479k;
        p013kotlin.jvm.internal.s.j(textviewGovernmentidInstructionslistheader, "textviewGovernmentidInstructionslistheader");
        q0.b(textviewGovernmentidInstructionslistheader, rendering.getChooseText());
        TextView textviewGovernmentidInstructionsDisclaimer = this.binding.f113477i;
        p013kotlin.jvm.internal.s.j(textviewGovernmentidInstructionsDisclaimer, "textviewGovernmentidInstructionsDisclaimer");
        q0.b(textviewGovernmentidInstructionsDisclaimer, rendering.getDisclaimer());
        if (!p013kotlin.text.t.y0(rendering.getDisclaimer())) {
            this.binding.f113474f.setAccessibilityTraversalAfter(n4.f102763z0);
        }
        this.binding.f113473e.setVisibility(this.shouldHideSeparators ? 8 : 0);
        RecyclerView.h adapter = this.recyclerView.getAdapter();
        t0 t0Var = adapter instanceof t0 ? (t0) adapter : null;
        if (t0Var == null) {
            Context context2 = this.binding.getRoot().getContext();
            p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
            t0Var = new t0(context2, rendering.d(), rendering.getStyles(), rendering.getAssetConfig(), new wn0.l() { // from class: pg0.l0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return p0.i(rendering, (IdConfig) obj);
                }
            });
        }
        if (this.recyclerView.getAdapter() == null) {
            this.recyclerView.setAdapter(t0Var);
        }
        t0Var.g(rendering.getIsEnabled());
        ii0.a navigationState = rendering.getNavigationState();
        wn0.a aVar = new wn0.a() { // from class: pg0.m0
            @Override // wn0.a
            public final Object invoke() {
                return p0.j(rendering);
            }
        };
        wn0.a aVar2 = new wn0.a() { // from class: pg0.n0
            @Override // wn0.a
            public final Object invoke() {
                return p0.k(rendering);
            }
        };
        Pi2NavigationBar navigationBar = this.binding.f113474f;
        p013kotlin.jvm.internal.s.j(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutB = this.binding.getRoot();
        p013kotlin.jvm.internal.s.j(coordinatorLayoutB, "getRoot(...)");
        ii0.e.b(navigationState, aVar, aVar2, navigationBar, coordinatorLayoutB);
        CoordinatorLayout coordinatorLayoutB2 = this.binding.getRoot();
        p013kotlin.jvm.internal.s.j(coordinatorLayoutB2, "getRoot(...)");
        yh0.z.b(coordinatorLayoutB2, rendering.getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String(), rendering.i(), null, 0, 0, 56, null);
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        if (styles != null) {
            f(styles, viewEnvironment);
        }
    }
}
