package pg0;

import a30.ViewEnvironment;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import java.io.File;
import p013kotlin.Metadata;
import rc.ImageRequest;

/* JADX INFO: renamed from: pg0.f5, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJO\u0010'\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010*R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010*R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010*R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b>\u0010*R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010*R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u00107\u001a\u0004\bC\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010KR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010KR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bR\u00107\u001a\u0004\bS\u0010*R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bT\u0010I\u001a\u0004\bU\u0010KR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\u0019\u0010\\R \u0010a\u001a\b\u0012\u0004\u0012\u00020\u00000]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b2\u0010`¨\u0006b"}, d2 = {"Lpg0/f5;", "La30/b;", "Lec/r;", "imageLoader", "", "title", "body", "confirmButtonText", "chooseNewPhotoText", "fileToReviewPath", "fileMimeType", "fileName", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "onUsePhotoClick", "onChooseNewPhotoClick", "onBack", "onCancel", AnalyticsAttribute.Error, "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "", "isAutoClassifying", "<init>", "(Lec/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lii0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Ljava/lang/String;Lwn0/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Z)V", "Landroid/view/View;", "root", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/widget/TextView;", "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "usePhotoButton", "Landroid/widget/Button;", "chooseNewPhotoButton", "La30/a0;", "viewEnvironment", "h", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/widget/Button;La30/a0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lec/r;", "getImageLoader", "()Lec/r;", "b", "Ljava/lang/String;", "getTitle", "c", "getBody", DateTokenConverter.CONVERTER_KEY, "getConfirmButtonText", "e", "getChooseNewPhotoText", "f", "getFileToReviewPath", "g", "getFileMimeType", "getFileName", IntegerTokenConverter.CONVERTER_KEY, "Lii0/a;", "getNavigationState", "()Lii0/a;", "j", "Lwn0/a;", "getOnUsePhotoClick", "()Lwn0/a;", "k", "getOnChooseNewPhotoClick", "l", "getOnBack", "m", "getOnCancel", "n", "getError", "o", "getOnErrorDismissed", "p", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "q", "Z", "()Z", "La30/c0;", "r", "La30/c0;", "()La30/c0;", "viewFactory", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReviewSelectedImageView implements a30.b<ReviewSelectedImageView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ec.r imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String body;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String confirmButtonText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String chooseNewPhotoText;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fileToReviewPath;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fileMimeType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fileName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final ii0.a navigationState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<jn0.h0> onUsePhotoClick;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<jn0.h0> onChooseNewPhotoClick;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<jn0.h0> onBack;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<jn0.h0> onCancel;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<jn0.h0> onErrorDismissed;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final StepStyles.GovernmentIdStepStyle styles;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAutoClassifying;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final a30.c0<ReviewSelectedImageView> viewFactory;

    /* JADX INFO: renamed from: pg0.f5$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, tg0.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102339a = new a();

        a() {
            super(3, tg0.h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidReviewSelectedImageBinding;", 0);
        }

        public final tg0.h a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return tg0.h.c(p11, viewGroup, z11);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ tg0.h invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return a(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public ReviewSelectedImageView(ec.r imageLoader, String title, String body, String confirmButtonText, String chooseNewPhotoText, String fileToReviewPath, String fileMimeType, String str, ii0.a navigationState, wn0.a<jn0.h0> onUsePhotoClick, wn0.a<jn0.h0> onChooseNewPhotoClick, wn0.a<jn0.h0> onBack, wn0.a<jn0.h0> onCancel, String str2, wn0.a<jn0.h0> onErrorDismissed, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, boolean z11) {
        p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(body, "body");
        p013kotlin.jvm.internal.s.k(confirmButtonText, "confirmButtonText");
        p013kotlin.jvm.internal.s.k(chooseNewPhotoText, "chooseNewPhotoText");
        p013kotlin.jvm.internal.s.k(fileToReviewPath, "fileToReviewPath");
        p013kotlin.jvm.internal.s.k(fileMimeType, "fileMimeType");
        p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
        p013kotlin.jvm.internal.s.k(onUsePhotoClick, "onUsePhotoClick");
        p013kotlin.jvm.internal.s.k(onChooseNewPhotoClick, "onChooseNewPhotoClick");
        p013kotlin.jvm.internal.s.k(onBack, "onBack");
        p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
        p013kotlin.jvm.internal.s.k(onErrorDismissed, "onErrorDismissed");
        this.imageLoader = imageLoader;
        this.title = title;
        this.body = body;
        this.confirmButtonText = confirmButtonText;
        this.chooseNewPhotoText = chooseNewPhotoText;
        this.fileToReviewPath = fileToReviewPath;
        this.fileMimeType = fileMimeType;
        this.fileName = str;
        this.navigationState = navigationState;
        this.onUsePhotoClick = onUsePhotoClick;
        this.onChooseNewPhotoClick = onChooseNewPhotoClick;
        this.onBack = onBack;
        this.onCancel = onCancel;
        this.error = str2;
        this.onErrorDismissed = onErrorDismissed;
        this.styles = governmentIdStepStyle;
        this.isAutoClassifying = z11;
        a30.k.Companion companion = a30.k.INSTANCE;
        this.viewFactory = new a30.z(p013kotlin.jvm.internal.o0.b(ReviewSelectedImageView.class), a.f102339a, new wn0.l() { // from class: pg0.z4
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return ReviewSelectedImageView.i(this.f102978a, (tg0.h) obj);
            }
        });
    }

    private final void h(StepStyles.GovernmentIdStepStyle styles, View root, Pi2NavigationBar navigationBar, TextView title, TextView body, ButtonWithLoadingIndicator usePhotoButton, Button chooseNewPhotoButton, ViewEnvironment viewEnvironment) {
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
            ui0.e.d(usePhotoButton, buttonPrimaryStyleValue);
        }
        ButtonCancelComponentStyle buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue();
        if (buttonSecondaryStyleValue != null) {
            ui0.e.f(chooseNewPhotoButton, buttonSecondaryStyleValue, false, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a30.k i(final ReviewSelectedImageView reviewSelectedImageView, final tg0.h binding) {
        p013kotlin.jvm.internal.s.k(binding, "binding");
        CoordinatorLayout root = binding.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ki0.f.d(root, false, false, false, false, 15, null);
        return new a30.k() { // from class: pg0.a5
            @Override // a30.k
            public final void a(Object obj, ViewEnvironment viewEnvironment) {
                ReviewSelectedImageView.j(binding, reviewSelectedImageView, (ReviewSelectedImageView) obj, viewEnvironment);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(tg0.h hVar, final ReviewSelectedImageView reviewSelectedImageView, final ReviewSelectedImageView rendering, ViewEnvironment viewEnvironment) {
        p013kotlin.jvm.internal.s.k(rendering, "rendering");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        hVar.f113512i.setText(rendering.title);
        hVar.f113505b.setText(rendering.body);
        hVar.f113513j.setText(reviewSelectedImageView.confirmButtonText);
        hVar.f113513j.setOnClickListener(new View.OnClickListener() { // from class: pg0.b5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewSelectedImageView.k(this.f102241a, view);
            }
        });
        hVar.f113506c.setText(reviewSelectedImageView.chooseNewPhotoText);
        hVar.f113506c.setOnClickListener(new View.OnClickListener() { // from class: pg0.c5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewSelectedImageView.l(this.f102252a, view);
            }
        });
        File file = new File(reviewSelectedImageView.fileToReviewPath);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(reviewSelectedImageView.fileToReviewPath, options);
        if (p013kotlin.text.t.b0(reviewSelectedImageView.fileMimeType, "image/", false, 2, null)) {
            ImageView imageView = hVar.f113509f;
            p013kotlin.jvm.internal.s.j(imageView, "imageView");
            ec.r rVar = reviewSelectedImageView.imageLoader;
            ImageRequest.a aVarO = rc.i.o(new ImageRequest.a(imageView.getContext()).c(file), imageView);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setSize(options.outWidth, options.outHeight);
            gradientDrawable.setColor(0);
            aVarO.h(ec.u.c(gradientDrawable));
            rVar.b(aVarO.b());
        } else {
            hVar.f113509f.setVisibility(8);
            hVar.f113507d.setVisibility(0);
            hVar.f113508e.setVisibility(0);
            hVar.f113508e.setText(reviewSelectedImageView.fileName);
        }
        ii0.a aVar = rendering.navigationState;
        wn0.a aVar2 = new wn0.a() { // from class: pg0.d5
            @Override // wn0.a
            public final Object invoke() {
                return ReviewSelectedImageView.m(this.f102281a);
            }
        };
        wn0.a aVar3 = new wn0.a() { // from class: pg0.e5
            @Override // wn0.a
            public final Object invoke() {
                return ReviewSelectedImageView.n(this.f102308a);
            }
        };
        Pi2NavigationBar navigationBar = hVar.f113511h;
        p013kotlin.jvm.internal.s.j(navigationBar, "navigationBar");
        CoordinatorLayout root = hVar.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        ii0.e.b(aVar, aVar2, aVar3, navigationBar, root);
        hVar.f113513j.setIsLoading(rendering.isAutoClassifying);
        CoordinatorLayout root2 = hVar.getRoot();
        p013kotlin.jvm.internal.s.j(root2, "getRoot(...)");
        yh0.z.b(root2, rendering.error, rendering.onErrorDismissed, null, 0, 0, 56, null);
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = reviewSelectedImageView.styles;
        if (governmentIdStepStyle != null) {
            CoordinatorLayout root3 = hVar.getRoot();
            p013kotlin.jvm.internal.s.j(root3, "getRoot(...)");
            Pi2NavigationBar navigationBar2 = hVar.f113511h;
            p013kotlin.jvm.internal.s.j(navigationBar2, "navigationBar");
            TextView title = hVar.f113512i;
            p013kotlin.jvm.internal.s.j(title, "title");
            TextView body = hVar.f113505b;
            p013kotlin.jvm.internal.s.j(body, "body");
            ButtonWithLoadingIndicator usePhotoButton = hVar.f113513j;
            p013kotlin.jvm.internal.s.j(usePhotoButton, "usePhotoButton");
            Button chooseNewPhotoButton = hVar.f113506c;
            p013kotlin.jvm.internal.s.j(chooseNewPhotoButton, "chooseNewPhotoButton");
            reviewSelectedImageView.h(governmentIdStepStyle, root3, navigationBar2, title, body, usePhotoButton, chooseNewPhotoButton, viewEnvironment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ReviewSelectedImageView reviewSelectedImageView, View view) {
        reviewSelectedImageView.onUsePhotoClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ReviewSelectedImageView reviewSelectedImageView, View view) {
        reviewSelectedImageView.onChooseNewPhotoClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m(ReviewSelectedImageView reviewSelectedImageView) {
        reviewSelectedImageView.onBack.invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n(ReviewSelectedImageView reviewSelectedImageView) {
        reviewSelectedImageView.onCancel.invoke();
        return jn0.h0.f84049a;
    }

    @Override // a30.b
    public a30.c0<ReviewSelectedImageView> a() {
        return this.viewFactory;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewSelectedImageView)) {
            return false;
        }
        ReviewSelectedImageView reviewSelectedImageView = (ReviewSelectedImageView) other;
        return p013kotlin.jvm.internal.s.f(this.imageLoader, reviewSelectedImageView.imageLoader) && p013kotlin.jvm.internal.s.f(this.title, reviewSelectedImageView.title) && p013kotlin.jvm.internal.s.f(this.body, reviewSelectedImageView.body) && p013kotlin.jvm.internal.s.f(this.confirmButtonText, reviewSelectedImageView.confirmButtonText) && p013kotlin.jvm.internal.s.f(this.chooseNewPhotoText, reviewSelectedImageView.chooseNewPhotoText) && p013kotlin.jvm.internal.s.f(this.fileToReviewPath, reviewSelectedImageView.fileToReviewPath) && p013kotlin.jvm.internal.s.f(this.fileMimeType, reviewSelectedImageView.fileMimeType) && p013kotlin.jvm.internal.s.f(this.fileName, reviewSelectedImageView.fileName) && p013kotlin.jvm.internal.s.f(this.navigationState, reviewSelectedImageView.navigationState) && p013kotlin.jvm.internal.s.f(this.onUsePhotoClick, reviewSelectedImageView.onUsePhotoClick) && p013kotlin.jvm.internal.s.f(this.onChooseNewPhotoClick, reviewSelectedImageView.onChooseNewPhotoClick) && p013kotlin.jvm.internal.s.f(this.onBack, reviewSelectedImageView.onBack) && p013kotlin.jvm.internal.s.f(this.onCancel, reviewSelectedImageView.onCancel) && p013kotlin.jvm.internal.s.f(this.error, reviewSelectedImageView.error) && p013kotlin.jvm.internal.s.f(this.onErrorDismissed, reviewSelectedImageView.onErrorDismissed) && p013kotlin.jvm.internal.s.f(this.styles, reviewSelectedImageView.styles) && this.isAutoClassifying == reviewSelectedImageView.isAutoClassifying;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.imageLoader.hashCode() * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31) + this.confirmButtonText.hashCode()) * 31) + this.chooseNewPhotoText.hashCode()) * 31) + this.fileToReviewPath.hashCode()) * 31) + this.fileMimeType.hashCode()) * 31;
        String str = this.fileName;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.navigationState.hashCode()) * 31) + this.onUsePhotoClick.hashCode()) * 31) + this.onChooseNewPhotoClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCancel.hashCode()) * 31;
        String str2 = this.error;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.onErrorDismissed.hashCode()) * 31;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        return ((iHashCode3 + (governmentIdStepStyle != null ? governmentIdStepStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAutoClassifying);
    }

    public String toString() {
        return "ReviewSelectedImageView(imageLoader=" + this.imageLoader + ", title=" + this.title + ", body=" + this.body + ", confirmButtonText=" + this.confirmButtonText + ", chooseNewPhotoText=" + this.chooseNewPhotoText + ", fileToReviewPath=" + this.fileToReviewPath + ", fileMimeType=" + this.fileMimeType + ", fileName=" + this.fileName + ", navigationState=" + this.navigationState + ", onUsePhotoClick=" + this.onUsePhotoClick + ", onChooseNewPhotoClick=" + this.onChooseNewPhotoClick + ", onBack=" + this.onBack + ", onCancel=" + this.onCancel + ", error=" + this.error + ", onErrorDismissed=" + this.onErrorDismissed + ", styles=" + this.styles + ", isAutoClassifying=" + this.isAutoClassifying + ")";
    }
}
