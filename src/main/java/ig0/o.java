package ig0;

import a30.ViewEnvironment;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\b*\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lig0/o;", "La30/k;", "Lig0/r2$d$a;", "Ljg0/a;", "binding", "<init>", "(Ljg0/a;)V", "Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "e", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "La30/a0;", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "textPosition", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;La30/a0;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "rendering", "g", "(Lig0/r2$d$a;La30/a0;)V", "b", "Ljg0/a;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentLoadingAssetView", "a", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o implements a30.k<r2.d.LoadingAnimation> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jg0.a binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private View currentLoadingAssetView;

    /* JADX INFO: renamed from: ig0.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lig0/o$a;", "La30/c0;", "Lig0/r2$d$a;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lig0/r2$d$a;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements a30.c0<r2.d.LoadingAnimation> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ a30.c0<r2.d.LoadingAnimation> f77819a;

        /* JADX INFO: renamed from: ig0.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C1642a extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, jg0.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1642a f77820a = new C1642a();

            C1642a() {
                super(3, jg0.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;", 0);
            }

            public final jg0.a a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return jg0.a.c(p11, viewGroup, z11);
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ jg0.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return a(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: ig0.o$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<jg0.a, o> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f77821a = new b();

            b() {
                super(1, o.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentLoadingBinding;)V", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o invoke(jg0.a p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return new o(p11);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(r2.d.LoadingAnimation initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
            p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
            p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
            return this.f77819a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super r2.d.LoadingAnimation> getType() {
            return this.f77819a.getType();
        }

        private Companion() {
            a30.k.Companion companion = a30.k.INSTANCE;
            this.f77819a = new a30.z(p013kotlin.jvm.internal.o0.b(r2.d.LoadingAnimation.class), C1642a.f77820a, b.f77821a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77822a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f77822a = iArr;
        }
    }

    public o(jg0.a binding) {
        p013kotlin.jvm.internal.s.k(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Integer numF = yh0.s.f(context, qh0.a.f105529n, null, false, 6, null);
        if (numF != null) {
            binding.f83701f.setAnimation(numF.intValue());
            binding.f83701f.x();
        } else {
            ThemeableLottieAnimationView themeableLottieAnimationView = binding.f83701f;
            int color = Color.parseColor("#4600EB");
            Context context2 = binding.getRoot().getContext();
            p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
            themeableLottieAnimationView.F(color, f(this, context2, i.a.f73749z, null, false, 6, null));
        }
        ConstraintLayout constraintLayoutB = binding.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB, "getRoot(...)");
        ki0.f.d(constraintLayoutB, false, false, false, false, 15, null);
    }

    private final void d(StepStyles.DocumentStepStyle styles, ViewEnvironment viewEnvironment, PendingPageTextPosition textPosition) {
        float f11;
        StyleElements.PositionType pendingPageAlignmentValue = styles.getPendingPageAlignmentValue();
        if (pendingPageAlignmentValue == null) {
            pendingPageAlignmentValue = textPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
        }
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.f83702g.getId(), this.binding.f83698c.getId(), this.binding.f83697b.getId()} : new int[]{this.binding.f83697b.getId(), this.binding.f83702g.getId(), this.binding.f83698c.getId()};
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.o(this.binding.f83699d);
        int i11 = b.f77822a[pendingPageAlignmentValue.ordinal()];
        if (i11 == 1) {
            f11 = BitmapDescriptorFactory.HUE_RED;
        } else if (i11 == 2) {
            f11 = 0.5f;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f11 = 1.0f;
        }
        dVar.A(0, 3, 0, 4, iArr, null, 2);
        dVar.e0(p013kotlin.collections.n.j0(iArr), f11);
        dVar.i(this.binding.f83699d);
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
        TextBasedComponentStyle processingTitleStyleValue = styles.getProcessingTitleStyleValue();
        if (processingTitleStyleValue != null) {
            TextView title = this.binding.f83702g;
            p013kotlin.jvm.internal.s.j(title, "title");
            ui0.e0.n(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.f83698c;
            p013kotlin.jvm.internal.s.j(body, "body");
            ui0.e0.n(body, processingTextStyleValue, null, 2, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            this.binding.f83701f.F(Color.parseColor("#4600EB"), fillColorValue.intValue());
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            int iIntValue2 = strokeColorValue.intValue();
            this.binding.f83701f.F(Color.parseColor("#180052"), iIntValue2);
            this.binding.f83701f.F(Color.parseColor("#190052"), iIntValue2);
        }
    }

    private final int e(Context context, int i11, TypedValue typedValue, boolean z11) {
        context.getTheme().resolveAttribute(i11, typedValue, z11);
        return typedValue.data;
    }

    static /* synthetic */ int f(o oVar, Context context, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return oVar.e(context, i11, typedValue, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h(r2.d.LoadingAnimation aVar) {
        aVar.c().invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i(r2.d.LoadingAnimation aVar) {
        aVar.d().invoke();
        return jn0.h0.f84049a;
    }

    @Override // a30.k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(final r2.d.LoadingAnimation rendering, ViewEnvironment viewEnvironment) {
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        jg0.a aVar = this.binding;
        ii0.a aVarB = rendering.getNavigationState();
        wn0.a aVar2 = new wn0.a() { // from class: ig0.m
            @Override // wn0.a
            public final Object invoke() {
                return o.h(rendering);
            }
        };
        wn0.a aVar3 = new wn0.a() { // from class: ig0.n
            @Override // wn0.a
            public final Object invoke() {
                return o.i(rendering);
            }
        };
        Pi2NavigationBar navigationBar = aVar.f83700e;
        p013kotlin.jvm.internal.s.j(navigationBar, "navigationBar");
        ConstraintLayout constraintLayoutB = aVar.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB, "getRoot(...)");
        ii0.e.b(aVarB, aVar2, aVar3, navigationBar, constraintLayoutB);
        String strH = rendering.getTitle();
        if (strH == null || strH.length() == 0) {
            aVar.f83702g.setVisibility(8);
        } else {
            aVar.f83702g.setText(rendering.getTitle());
            TextView title = aVar.f83702g;
            p013kotlin.jvm.internal.s.j(title, "title");
            ki0.s.e(title);
        }
        String strF = rendering.getPrompt();
        if (strF == null || strF.length() == 0) {
            aVar.f83698c.setVisibility(8);
        } else {
            aVar.f83698c.setText(rendering.getPrompt());
        }
        NextStep.Document.AssetConfig.PendingPage pendingPageA = rendering.getAssetConfig();
        RemoteImage loadingPictograph = pendingPageA != null ? pendingPageA.getLoadingPictograph() : null;
        if (loadingPictograph != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = aVar.f83697b;
            p013kotlin.jvm.internal.s.j(animationContainer, "animationContainer");
            this.currentLoadingAssetView = wi0.b.c(loadingPictograph, animationContainer, false, 2, null);
            aVar.f83701f.setVisibility(8);
        }
        StepStyles.DocumentStepStyle documentStepStyleG = rendering.getStyles();
        if (documentStepStyleG != null) {
            d(documentStepStyleG, viewEnvironment, rendering.getPendingPageTextVerticalPosition());
        }
    }
}
