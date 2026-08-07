package pg0;

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
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0017\u001a\u00020\u0011*\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lpg0/s1;", "La30/k;", "Lpg0/g5$f;", "Ltg0/j;", "binding", "<init>", "(Ltg0/j;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "La30/a0;", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "textPosition", "Ljn0/h0;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;La30/a0;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "f", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "rendering", "h", "(Lpg0/g5$f;La30/a0;)V", "b", "Ltg0/j;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentLoadingAssetView", DateTokenConverter.CONVERTER_KEY, "a", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s1 implements a30.k<g5.f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tg0.j binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private View currentLoadingAssetView;

    /* JADX INFO: renamed from: pg0.s1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lpg0/s1$a;", "La30/c0;", "Lpg0/g5$f;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lpg0/g5$f;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements a30.c0<g5.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ a30.c0<g5.f> f102870a;

        /* JADX INFO: renamed from: pg0.s1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C2183a extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, tg0.j> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2183a f102871a = new C2183a();

            C2183a() {
                super(3, tg0.j.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSubmittingScreenBinding;", 0);
            }

            public final tg0.j a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return tg0.j.c(p11, viewGroup, z11);
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ tg0.j invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return a(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: pg0.s1$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<tg0.j, s1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f102872a = new b();

            b() {
                super(1, s1.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidSubmittingScreenBinding;)V", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s1 invoke(tg0.j p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return new s1(p11);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(g5.f initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
            p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
            p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
            return this.f102870a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super g5.f> getType() {
            return this.f102870a.getType();
        }

        private Companion() {
            a30.k.Companion companion = a30.k.INSTANCE;
            this.f102870a = new a30.z(p013kotlin.jvm.internal.o0.b(g5.f.class), C2183a.f102871a, b.f102872a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102873a;

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
            f102873a = iArr;
        }
    }

    public s1(final tg0.j binding) {
        p013kotlin.jvm.internal.s.k(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Integer numF = yh0.s.f(context, qh0.a.f105529n, null, false, 6, null);
        if (numF != null) {
            binding.f113528f.setAnimation(numF.intValue());
            binding.f113528f.x();
        } else {
            binding.f113528f.l(new ag.e(AnalyticsContext.Scanner, "**"), tf.d0.f113272a, new ig.e() { // from class: pg0.r1
                @Override // ig.e
                public final Object a(ig.b bVar) {
                    return s1.c(this.f102858a, binding, bVar);
                }
            });
        }
        ConstraintLayout constraintLayoutB = binding.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB, "getRoot(...)");
        ki0.f.d(constraintLayoutB, false, false, false, false, 15, null);
    }

    public static Integer c(s1 s1Var, tg0.j jVar, ig.b bVar) {
        Context context = jVar.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        return Integer.valueOf(g(s1Var, context, i.a.f73749z, null, false, 6, null));
    }

    private final void e(StepStyles.GovernmentIdStepStyle styles, ViewEnvironment viewEnvironment, PendingPageTextPosition textPosition) {
        float f11;
        StyleElements.PositionType pendingPageAlignmentValue = styles.getPendingPageAlignmentValue();
        if (pendingPageAlignmentValue == null) {
            pendingPageAlignmentValue = textPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
        }
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.f113529g.getId(), this.binding.f113525c.getId(), this.binding.f113524b.getId()} : new int[]{this.binding.f113524b.getId(), this.binding.f113529g.getId(), this.binding.f113525c.getId()};
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.o(this.binding.f113526d);
        int i11 = b.f102873a[pendingPageAlignmentValue.ordinal()];
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
        dVar.i(this.binding.f113526d);
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
            TextView title = this.binding.f113529g;
            p013kotlin.jvm.internal.s.j(title, "title");
            ui0.e0.n(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.f113525c;
            p013kotlin.jvm.internal.s.j(body, "body");
            ui0.e0.n(body, processingTextStyleValue, null, 2, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            int iIntValue2 = fillColorValue.intValue();
            this.binding.f113528f.F(Color.parseColor("#AA85FF"), iIntValue2);
            this.binding.f113528f.F(Color.parseColor("#4600EB"), iIntValue2);
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            this.binding.f113528f.F(Color.parseColor("#190052"), strokeColorValue.intValue());
        }
        Integer backgroundColorValue2 = styles.getBackgroundColorValue();
        if (backgroundColorValue2 != null) {
            int iIntValue3 = backgroundColorValue2.intValue();
            this.binding.f113528f.F(Color.parseColor("#FFFFFF"), iIntValue3);
            this.binding.f113528f.F(Color.parseColor("#F1EBFF"), iIntValue3);
        }
    }

    private final int f(Context context, int i11, TypedValue typedValue, boolean z11) {
        context.getTheme().resolveAttribute(i11, typedValue, z11);
        return typedValue.data;
    }

    static /* synthetic */ int g(s1 s1Var, Context context, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return s1Var.f(context, i11, typedValue, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i(g5.f fVar) {
        fVar.d().invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j(g5.f fVar) {
        fVar.e().invoke();
        return jn0.h0.f84049a;
    }

    @Override // a30.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(final g5.f rendering, ViewEnvironment viewEnvironment) {
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        tg0.j jVar = this.binding;
        ii0.a navigationState = rendering.getNavigationState();
        wn0.a aVar = new wn0.a() { // from class: pg0.p1
            @Override // wn0.a
            public final Object invoke() {
                return s1.i(rendering);
            }
        };
        wn0.a aVar2 = new wn0.a() { // from class: pg0.q1
            @Override // wn0.a
            public final Object invoke() {
                return s1.j(rendering);
            }
        };
        Pi2NavigationBar navigationBar = jVar.f113527e;
        p013kotlin.jvm.internal.s.j(navigationBar, "navigationBar");
        ConstraintLayout constraintLayoutB = jVar.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB, "getRoot(...)");
        ii0.e.b(navigationState, aVar, aVar2, navigationBar, constraintLayoutB);
        if (rendering.getTitle().length() == 0) {
            jVar.f113529g.setVisibility(8);
        } else {
            jVar.f113529g.setText(rendering.getTitle());
            TextView title = jVar.f113529g;
            p013kotlin.jvm.internal.s.j(title, "title");
            ki0.s.e(title);
        }
        if (rendering.getDescription().length() == 0) {
            jVar.f113525c.setVisibility(8);
        } else {
            jVar.f113525c.setText(rendering.getDescription());
        }
        NextStep.GovernmentId.AssetConfig.PendingPage assetConfig = rendering.getAssetConfig();
        RemoteImage loadingPictograph = assetConfig != null ? assetConfig.getLoadingPictograph() : null;
        if (loadingPictograph != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = this.binding.f113524b;
            p013kotlin.jvm.internal.s.j(animationContainer, "animationContainer");
            this.currentLoadingAssetView = wi0.b.c(loadingPictograph, animationContainer, false, 2, null);
            jVar.f113528f.setVisibility(8);
        }
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        if (styles != null) {
            e(styles, viewEnvironment, rendering.getPendingPageTextVerticalPosition());
        }
    }
}
