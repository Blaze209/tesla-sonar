package pg0;

import a30.ViewEnvironment;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: pg0.y, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B«\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ_\u0010)\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010,R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010,R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010,R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b@\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b)\u0010F\u001a\u0004\bI\u0010HR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010HR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\bL\u0010F\u001a\u0004\bM\u0010HR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bN\u00109\u001a\u0004\bO\u0010,R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010HR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010.R\u0018\u0010_\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R \u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\b4\u0010c¨\u0006e"}, d2 = {"Lpg0/y;", "La30/b;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "captureOptions", "", "title", "body", "cameraText", "uploadButtonText", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "onCameraCaptureClick", "onUploadClick", "onBack", "onCancel", AnalyticsAttribute.Error, "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "pictographAsset", "", "localAsset", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lii0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Ljava/lang/String;Lwn0/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;I)V", "Landroid/view/View;", "root", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", "Landroid/widget/Button;", "cameraButton", "uploadButton", "Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "idImage", "idImageContainer", "La30/a0;", "viewEnvironment", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Landroid/view/View;La30/a0;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getCaptureOptions", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getTitle", "c", "getBody", DateTokenConverter.CONVERTER_KEY, "getCameraText", "e", "getUploadButtonText", "f", "Lii0/a;", "getNavigationState", "()Lii0/a;", "g", "Lwn0/a;", "getOnCameraCaptureClick", "()Lwn0/a;", "getOnUploadClick", IntegerTokenConverter.CONVERTER_KEY, "getOnBack", "j", "getOnCancel", "k", "getError", "l", "getOnErrorDismissed", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "n", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getPictographAsset", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "o", "I", "getLocalAsset", "p", "Landroid/view/View;", "currentPictographAssetView", "La30/c0;", "q", "La30/c0;", "()La30/c0;", "viewFactory", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChooseCaptureMethodView implements a30.b<ChooseCaptureMethodView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CaptureOptionNativeMobile> captureOptions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String body;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cameraText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uploadButtonText;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ii0.a navigationState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<jn0.h0> onCameraCaptureClick;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<jn0.h0> onUploadClick;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<jn0.h0> onBack;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<jn0.h0> onCancel;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<jn0.h0> onErrorDismissed;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final StepStyles.GovernmentIdStepStyle styles;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final RemoteImage pictographAsset;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final int localAsset;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private View currentPictographAssetView;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a30.c0<ChooseCaptureMethodView> viewFactory;

    /* JADX INFO: renamed from: pg0.y$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, tg0.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102962a = new a();

        a() {
            super(3, tg0.d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidChooseCaptureMethodBinding;", 0);
        }

        public final tg0.d a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return tg0.d.c(p11, viewGroup, z11);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ tg0.d invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return a(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChooseCaptureMethodView(List<? extends CaptureOptionNativeMobile> captureOptions, String title, String body, String cameraText, String uploadButtonText, ii0.a navigationState, wn0.a<jn0.h0> onCameraCaptureClick, wn0.a<jn0.h0> onUploadClick, wn0.a<jn0.h0> onBack, wn0.a<jn0.h0> onCancel, String str, wn0.a<jn0.h0> onErrorDismissed, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, RemoteImage remoteImage, int i11) {
        p013kotlin.jvm.internal.s.k(captureOptions, "captureOptions");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(body, "body");
        p013kotlin.jvm.internal.s.k(cameraText, "cameraText");
        p013kotlin.jvm.internal.s.k(uploadButtonText, "uploadButtonText");
        p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
        p013kotlin.jvm.internal.s.k(onCameraCaptureClick, "onCameraCaptureClick");
        p013kotlin.jvm.internal.s.k(onUploadClick, "onUploadClick");
        p013kotlin.jvm.internal.s.k(onBack, "onBack");
        p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
        p013kotlin.jvm.internal.s.k(onErrorDismissed, "onErrorDismissed");
        this.captureOptions = captureOptions;
        this.title = title;
        this.body = body;
        this.cameraText = cameraText;
        this.uploadButtonText = uploadButtonText;
        this.navigationState = navigationState;
        this.onCameraCaptureClick = onCameraCaptureClick;
        this.onUploadClick = onUploadClick;
        this.onBack = onBack;
        this.onCancel = onCancel;
        this.error = str;
        this.onErrorDismissed = onErrorDismissed;
        this.styles = governmentIdStepStyle;
        this.pictographAsset = remoteImage;
        this.localAsset = i11;
        a30.k.Companion companion = a30.k.INSTANCE;
        this.viewFactory = new a30.z(p013kotlin.jvm.internal.o0.b(ChooseCaptureMethodView.class), a.f102962a, new wn0.l() { // from class: pg0.s
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return ChooseCaptureMethodView.i(this.f102864a, (tg0.d) obj);
            }
        });
    }

    private final void h(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, TextView body, Button cameraButton, Button uploadButton, ThemeableLottieAnimationView idImage, View idImageContainer, ViewEnvironment viewEnvironment) {
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            root.setBackgroundColor(iIntValue);
            ji0.c.a(viewEnvironment, iIntValue);
        }
        Context context = root.getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        Drawable drawableA = wi0.c.a(styles, context);
        if (drawableA != null) {
            root.setBackground(drawableA);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            navigationBar.setControlsColor(headerButtonColorValue.intValue());
        }
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            ui0.e0.n(title, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            ui0.e0.n(body, textStyleValue, null, 2, null);
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            ui0.e.f(cameraButton, buttonPrimaryStyleValue, false, false, 6, null);
        }
        ButtonCancelComponentStyle buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue();
        if (buttonSecondaryStyleValue != null) {
            ui0.e.f(uploadButton, buttonSecondaryStyleValue, false, false, 6, null);
        }
        Integer fillColorValue = styles.getFillColorValue();
        if (fillColorValue != null) {
            idImageContainer.setBackground(new ColorDrawable(fillColorValue.intValue()));
        }
        ui0.g.g(idImage, styles.getStrokeColorValue(), styles.getFillColorValue(), null, new String[]{"#000000", "#190052", "#190051"}, new String[]{"#8751FF", "#AA85FF", "#AA84FF"}, new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a30.k i(final ChooseCaptureMethodView chooseCaptureMethodView, final tg0.d binding) {
        p013kotlin.jvm.internal.s.k(binding, "binding");
        CoordinatorLayout root = binding.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ki0.f.d(root, false, false, false, false, 15, null);
        return new a30.k() { // from class: pg0.t
            @Override // a30.k
            public final void a(Object obj, ViewEnvironment viewEnvironment) {
                ChooseCaptureMethodView.j(binding, chooseCaptureMethodView, (ChooseCaptureMethodView) obj, viewEnvironment);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(tg0.d dVar, ChooseCaptureMethodView chooseCaptureMethodView, final ChooseCaptureMethodView rendering, ViewEnvironment viewEnvironment) {
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        Context context = dVar.getRoot().getContext();
        dVar.f113461i.setText(rendering.title);
        dVar.f113454b.setText(rendering.body);
        if (chooseCaptureMethodView.captureOptions.contains(CaptureOptionNativeMobile.MOBILE_CAMERA)) {
            if (p013kotlin.text.t.y0(chooseCaptureMethodView.cameraText)) {
                dVar.f113455c.setText((CharSequence) null);
                dVar.f113455c.setIcon(j.a.b(context, m4.f102583c));
            } else {
                dVar.f113455c.setText(chooseCaptureMethodView.cameraText);
                dVar.f113455c.setIcon(null);
            }
            dVar.f113455c.setOnClickListener(new View.OnClickListener() { // from class: pg0.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChooseCaptureMethodView.k(this.f102892a, view);
                }
            });
        }
        if (chooseCaptureMethodView.captureOptions.contains(CaptureOptionNativeMobile.UPLOAD)) {
            dVar.f113462j.setText(rendering.uploadButtonText);
            dVar.f113462j.setOnClickListener(new View.OnClickListener() { // from class: pg0.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChooseCaptureMethodView.l(this.f102902a, view);
                }
            });
        }
        ii0.a aVar = rendering.navigationState;
        wn0.a aVar2 = new wn0.a() { // from class: pg0.w
            @Override // wn0.a
            public final Object invoke() {
                return ChooseCaptureMethodView.m(this.f102927a);
            }
        };
        wn0.a aVar3 = new wn0.a() { // from class: pg0.x
            @Override // wn0.a
            public final Object invoke() {
                return ChooseCaptureMethodView.n(this.f102936a);
            }
        };
        Pi2NavigationBar navigationBar = dVar.f113460h;
        p013kotlin.jvm.internal.s.j(navigationBar, "navigationBar");
        CoordinatorLayout root = dVar.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ii0.e.b(aVar, aVar2, aVar3, navigationBar, root);
        CoordinatorLayout root2 = dVar.getRoot();
        p013kotlin.jvm.internal.s.j(root2, "getRoot(...)");
        yh0.z.b(root2, rendering.error, rendering.onErrorDismissed, null, 0, 0, 56, null);
        RemoteImage remoteImage = chooseCaptureMethodView.pictographAsset;
        if (remoteImage == null) {
            dVar.f113456d.setAnimation(chooseCaptureMethodView.localAsset);
        } else if (chooseCaptureMethodView.currentPictographAssetView == null) {
            ConstraintLayout imageViewContainer = dVar.f113458f;
            p013kotlin.jvm.internal.s.j(imageViewContainer, "imageViewContainer");
            chooseCaptureMethodView.currentPictographAssetView = wi0.b.c(remoteImage, imageViewContainer, false, 2, null);
            dVar.f113459g.setVisibility(8);
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = chooseCaptureMethodView.styles;
        if (governmentIdStepStyle != null) {
            CoordinatorLayout root3 = dVar.getRoot();
            p013kotlin.jvm.internal.s.j(root3, "getRoot(...)");
            Pi2NavigationBar navigationBar2 = dVar.f113460h;
            p013kotlin.jvm.internal.s.j(navigationBar2, "navigationBar");
            TextView title = dVar.f113461i;
            p013kotlin.jvm.internal.s.j(title, "title");
            TextView body = dVar.f113454b;
            p013kotlin.jvm.internal.s.j(body, "body");
            MaterialButton cameraButton = dVar.f113455c;
            p013kotlin.jvm.internal.s.j(cameraButton, "cameraButton");
            Button uploadButton = dVar.f113462j;
            p013kotlin.jvm.internal.s.j(uploadButton, "uploadButton");
            ThemeableLottieAnimationView idImage = dVar.f113456d;
            p013kotlin.jvm.internal.s.j(idImage, "idImage");
            View idImageContainer = dVar.f113457e;
            p013kotlin.jvm.internal.s.j(idImageContainer, "idImageContainer");
            chooseCaptureMethodView.h(governmentIdStepStyle, root3, navigationBar2, title, body, cameraButton, uploadButton, idImage, idImageContainer, viewEnvironment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ChooseCaptureMethodView chooseCaptureMethodView, View view) {
        chooseCaptureMethodView.onCameraCaptureClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ChooseCaptureMethodView chooseCaptureMethodView, View view) {
        chooseCaptureMethodView.onUploadClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m(ChooseCaptureMethodView chooseCaptureMethodView) {
        chooseCaptureMethodView.onBack.invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n(ChooseCaptureMethodView chooseCaptureMethodView) {
        chooseCaptureMethodView.onCancel.invoke();
        return jn0.h0.f84049a;
    }

    @Override // a30.b
    public a30.c0<ChooseCaptureMethodView> a() {
        return this.viewFactory;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChooseCaptureMethodView)) {
            return false;
        }
        ChooseCaptureMethodView chooseCaptureMethodView = (ChooseCaptureMethodView) other;
        return p013kotlin.jvm.internal.s.f(this.captureOptions, chooseCaptureMethodView.captureOptions) && p013kotlin.jvm.internal.s.f(this.title, chooseCaptureMethodView.title) && p013kotlin.jvm.internal.s.f(this.body, chooseCaptureMethodView.body) && p013kotlin.jvm.internal.s.f(this.cameraText, chooseCaptureMethodView.cameraText) && p013kotlin.jvm.internal.s.f(this.uploadButtonText, chooseCaptureMethodView.uploadButtonText) && p013kotlin.jvm.internal.s.f(this.navigationState, chooseCaptureMethodView.navigationState) && p013kotlin.jvm.internal.s.f(this.onCameraCaptureClick, chooseCaptureMethodView.onCameraCaptureClick) && p013kotlin.jvm.internal.s.f(this.onUploadClick, chooseCaptureMethodView.onUploadClick) && p013kotlin.jvm.internal.s.f(this.onBack, chooseCaptureMethodView.onBack) && p013kotlin.jvm.internal.s.f(this.onCancel, chooseCaptureMethodView.onCancel) && p013kotlin.jvm.internal.s.f(this.error, chooseCaptureMethodView.error) && p013kotlin.jvm.internal.s.f(this.onErrorDismissed, chooseCaptureMethodView.onErrorDismissed) && p013kotlin.jvm.internal.s.f(this.styles, chooseCaptureMethodView.styles) && p013kotlin.jvm.internal.s.f(this.pictographAsset, chooseCaptureMethodView.pictographAsset) && this.localAsset == chooseCaptureMethodView.localAsset;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.captureOptions.hashCode() * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31) + this.cameraText.hashCode()) * 31) + this.uploadButtonText.hashCode()) * 31) + this.navigationState.hashCode()) * 31) + this.onCameraCaptureClick.hashCode()) * 31) + this.onUploadClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCancel.hashCode()) * 31;
        String str = this.error;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.onErrorDismissed.hashCode()) * 31;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        int iHashCode3 = (iHashCode2 + (governmentIdStepStyle == null ? 0 : governmentIdStepStyle.hashCode())) * 31;
        RemoteImage remoteImage = this.pictographAsset;
        return ((iHashCode3 + (remoteImage != null ? remoteImage.hashCode() : 0)) * 31) + Integer.hashCode(this.localAsset);
    }

    public String toString() {
        return "ChooseCaptureMethodView(captureOptions=" + this.captureOptions + ", title=" + this.title + ", body=" + this.body + ", cameraText=" + this.cameraText + ", uploadButtonText=" + this.uploadButtonText + ", navigationState=" + this.navigationState + ", onCameraCaptureClick=" + this.onCameraCaptureClick + ", onUploadClick=" + this.onUploadClick + ", onBack=" + this.onBack + ", onCancel=" + this.onCancel + ", error=" + this.error + ", onErrorDismissed=" + this.onErrorDismissed + ", styles=" + this.styles + ", pictographAsset=" + this.pictographAsset + ", localAsset=" + this.localAsset + ")";
    }
}
