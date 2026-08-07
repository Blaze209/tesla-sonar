package th0;

import a30.ViewEnvironment;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lth0/c2;", "La30/k;", "Lth0/d6$d$f;", "Luh0/h;", "binding", "<init>", "(Luh0/h;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "La30/a0;", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "textPosition", "Ljn0/h0;", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;La30/a0;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "rendering", "f", "(Lth0/d6$d$f;La30/a0;)V", "b", "Luh0/h;", "Landroid/view/View;", "c", "Landroid/view/View;", "currentLoadingAssetView", DateTokenConverter.CONVERTER_KEY, "a", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c2 implements a30.k<d6.d.f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uh0.h binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private View currentLoadingAssetView;

    /* JADX INFO: renamed from: th0.c2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lth0/c2$a;", "La30/c0;", "Lth0/d6$d$f;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lth0/d6$d$f;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements a30.c0<d6.d.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ a30.c0<d6.d.f> f113596a;

        /* JADX INFO: renamed from: th0.c2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C2423a extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, uh0.h> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2423a f113597a = new C2423a();

            C2423a() {
                super(3, uh0.h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieSubmittingScreenBinding;", 0);
            }

            public final uh0.h a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return uh0.h.c(p11, viewGroup, z11);
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ uh0.h invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return a(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: th0.c2$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<uh0.h, c2> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f113598a = new b();

            b() {
                super(1, c2.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieSubmittingScreenBinding;)V", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c2 invoke(uh0.h p11) {
                p013kotlin.jvm.internal.s.k(p11, "p0");
                return new c2(p11);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(d6.d.f initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
            p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
            p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
            return this.f113596a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super d6.d.f> getType() {
            return this.f113596a.getType();
        }

        private Companion() {
            a30.k.Companion companion = a30.k.INSTANCE;
            this.f113596a = new a30.z(p013kotlin.jvm.internal.o0.b(d6.d.f.class), C2423a.f113597a, b.f113598a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113599a;

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
            f113599a = iArr;
        }
    }

    public c2(final uh0.h binding) {
        p013kotlin.jvm.internal.s.k(binding, "binding");
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Integer numF = yh0.s.f(context, qh0.a.f105529n, null, false, 6, null);
        if (numF != null) {
            binding.f116284f.setAnimation(numF.intValue());
            binding.f116284f.w();
        } else {
            binding.f116284f.l(new ag.e(AnalyticsContext.Scanner, "**"), tf.d0.f113272a, new ig.e() { // from class: th0.z1
                @Override // ig.e
                public final Object a(ig.b bVar) {
                    return c2.d(binding, bVar);
                }
            });
        }
        ConstraintLayout root = binding.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ki0.f.d(root, false, false, false, false, 15, null);
    }

    public static Integer d(uh0.h hVar, ig.b bVar) {
        Context context = hVar.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        return Integer.valueOf(yh0.s.d(context, i.a.f73749z, null, false, 6, null));
    }

    private final void e(StepStyles.SelfieStepStyle styles, ViewEnvironment viewEnvironment, PendingPageTextPosition textPosition) {
        float f11;
        StyleElements.PositionType pendingPageAlignmentValue = styles.getPendingPageAlignmentValue();
        if (pendingPageAlignmentValue == null) {
            pendingPageAlignmentValue = textPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
        }
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.f116285g.getId(), this.binding.f116281c.getId(), this.binding.f116280b.getId()} : new int[]{this.binding.f116280b.getId(), this.binding.f116285g.getId(), this.binding.f116281c.getId()};
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.o(this.binding.f116282d);
        int i11 = b.f113599a[pendingPageAlignmentValue.ordinal()];
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
        dVar.i(this.binding.f116282d);
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
            TextView title = this.binding.f116285g;
            p013kotlin.jvm.internal.s.j(title, "title");
            ui0.e0.n(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.f116281c;
            p013kotlin.jvm.internal.s.j(body, "body");
            ui0.e0.n(body, processingTextStyleValue, null, 2, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            int iIntValue2 = fillColorValue.intValue();
            this.binding.f116284f.F(Color.parseColor("#AA85FF"), iIntValue2);
            this.binding.f116284f.F(Color.parseColor("#4600EB"), iIntValue2);
        }
        Integer strokeColorValue = styles.getStrokeColorValue();
        if (strokeColorValue != null) {
            this.binding.f116284f.F(Color.parseColor("#190052"), strokeColorValue.intValue());
        }
        Integer backgroundColorValue2 = styles.getBackgroundColorValue();
        if (backgroundColorValue2 != null) {
            int iIntValue3 = backgroundColorValue2.intValue();
            this.binding.f116284f.F(Color.parseColor("#FFFFFF"), iIntValue3);
            this.binding.f116284f.F(Color.parseColor("#F1EBFF"), iIntValue3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g(d6.d.f fVar) {
        fVar.d().invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h(d6.d.f fVar) {
        fVar.e().invoke();
        return jn0.h0.f84049a;
    }

    @Override // a30.k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void a(final d6.d.f rendering, ViewEnvironment viewEnvironment) {
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        uh0.h hVar = this.binding;
        ii0.a aVarC = rendering.getNavigationState();
        wn0.a aVar = new wn0.a() { // from class: th0.a2
            @Override // wn0.a
            public final Object invoke() {
                return c2.g(rendering);
            }
        };
        wn0.a aVar2 = new wn0.a() { // from class: th0.b2
            @Override // wn0.a
            public final Object invoke() {
                return c2.h(rendering);
            }
        };
        Pi2NavigationBar navigationBar = hVar.f116283e;
        p013kotlin.jvm.internal.s.j(navigationBar, "navigationBar");
        ConstraintLayout root = hVar.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ii0.e.b(aVarC, aVar, aVar2, navigationBar, root);
        if (rendering.getTitle().length() == 0) {
            hVar.f116285g.setVisibility(8);
        } else {
            hVar.f116285g.setText(rendering.getTitle());
            TextView title = hVar.f116285g;
            p013kotlin.jvm.internal.s.j(title, "title");
            ki0.s.e(title);
        }
        if (rendering.getDescription().length() == 0) {
            hVar.f116281c.setVisibility(8);
        } else {
            hVar.f116281c.setText(rendering.getDescription());
        }
        RemoteImage remoteImageA = rendering.getCustomLoadingAsset();
        if (remoteImageA != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = hVar.f116280b;
            p013kotlin.jvm.internal.s.j(animationContainer, "animationContainer");
            this.currentLoadingAssetView = wi0.b.c(remoteImageA, animationContainer, false, 2, null);
            hVar.f116284f.setVisibility(8);
        }
        StepStyles.SelfieStepStyle selfieStepStyleG = rendering.getStyles();
        if (selfieStepStyleG != null) {
            e(selfieStepStyleG, viewEnvironment, rendering.getPendingPageTextVerticalPosition());
        }
    }
}
