package sg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsCompat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pg0.IdConfig;
import ui0.e0;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lsg0/g;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Ljn0/h0;", "h", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lsg0/h;", "viewModel", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lsg0/h;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;)V", "o", "a", "Landroid/view/ViewGroup;", "Ltg0/c;", "b", "Ltg0/c;", "binding", "", "value", "c", "Z", "g", "(Z)V", "isShowing", DateTokenConverter.CONVERTER_KEY, "setup", "Landroid/view/View;", "e", "Landroid/view/View;", "currentAssetIllustrationView", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private tg0.c binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isShowing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean setup;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private View currentAssetIllustrationView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111150a;

        static {
            int[] iArr = new int[IdConfig.e.values().length];
            try {
                iArr[IdConfig.e.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.e.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.e.BarcodePdf417.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f111150a = iArr;
        }
    }

    public g(ViewGroup contentView) {
        s.k(contentView, "contentView");
        this.contentView = contentView;
    }

    private final void g(boolean z11) {
        this.isShowing = z11;
        o();
    }

    private final void h() {
        tg0.c cVar = this.binding;
        if (cVar == null || this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(cVar.f113443c);
        s.j(bottomSheetBehaviorQ0, "from(...)");
        wn0.a aVar = new wn0.a() { // from class: sg0.d
            @Override // wn0.a
            public final Object invoke() {
                return g.i(this.f111142a);
            }
        };
        FrameLayout bottomSheet = cVar.f113443c;
        s.j(bottomSheet, "bottomSheet");
        ki0.b.b(bottomSheetBehaviorQ0, aVar, bottomSheet, cVar.f113444d, cVar.f113450j);
        cVar.f113450j.setOnClickListener(new View.OnClickListener() { // from class: sg0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.j(bottomSheetBehaviorQ0, view);
            }
        });
        cVar.f113445e.setOnClickListener(new View.OnClickListener() { // from class: sg0.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.k(bottomSheetBehaviorQ0, view);
            }
        });
        bottomSheetBehaviorQ0.a1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(g gVar) {
        gVar.g(false);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.Y0(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.Y0(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m(tg0.c cVar, WindowInsetsCompat insets) {
        s.k(insets, "insets");
        k5.e eVarG = insets.g(WindowInsetsCompat.n.h());
        s.j(eVarG, "getInsetsIgnoringVisibility(...)");
        Space bottomInset = cVar.f113442b;
        s.j(bottomInset, "bottomInset");
        ViewGroup.LayoutParams layoutParams = bottomInset.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = eVarG.f84927d;
        bottomInset.setLayoutParams(layoutParams);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.Y0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 p(tg0.c cVar) {
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(cVar.f113443c);
        s.j(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.Y0(5);
        FrameLayout root = cVar.getRoot();
        s.j(root, "getRoot(...)");
        a30.e.c(root, null);
        return h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0135  */
    public final void l(StepStyles.GovernmentIdStepStyle styles, CaptureTipsViewModel viewModel, NextStep.GovernmentId.AssetConfig.CapturePage assetConfig) {
        RemoteImage idFrontHelpModalPictograph;
        int i11;
        StyleElements.SizeSet modalPaddingValue;
        Double dp2;
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle;
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        s.k(viewModel, "viewModel");
        final tg0.c cVarC = this.binding;
        if (cVarC == null) {
            cVarC = tg0.c.c(LayoutInflater.from(this.contentView.getContext()), this.contentView, true);
            s.j(cVarC, "inflate(...)");
        }
        this.binding = cVarC;
        h();
        g(true);
        TextView title = cVarC.f113452l;
        s.j(title, "title");
        pi0.g.d(title, viewModel.getTitle());
        TextView prompt = cVarC.f113449i;
        s.j(prompt, "prompt");
        pi0.g.d(prompt, viewModel.getPrompt());
        TextView tips = cVarC.f113451k;
        s.j(tips, "tips");
        pi0.g.d(tips, viewModel.getTips());
        cVarC.f113445e.setText(viewModel.getButtonText());
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(cVarC.f113443c);
        s.j(bottomSheetBehaviorQ0, "from(...)");
        if (styles != null && (titleStyle = styles.getTitleStyle()) != null && (base5 = titleStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
            TextView title2 = cVarC.f113452l;
            s.j(title2, "title");
            e0.n(title2, base6, null, 2, null);
        }
        if (styles != null && (textStyle = styles.getTextStyle()) != null && (base3 = textStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextView prompt2 = cVarC.f113449i;
            s.j(prompt2, "prompt");
            e0.n(prompt2, base4, null, 2, null);
            TextView tips2 = cVarC.f113451k;
            s.j(tips2, "tips");
            e0.n(tips2, base4, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyle = styles.getButtonPrimaryStyle()) != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            Button captureButton = cVarC.f113445e;
            s.j(captureButton, "captureButton");
            ui0.e.f(captureButton, base2, false, false, 6, null);
        }
        LinearLayout bottomSheetContent = cVarC.f113444d;
        s.j(bottomSheetContent, "bottomSheetContent");
        ui0.c.c(bottomSheetContent, styles, null, null, 6, null);
        if (styles != null && (modalPaddingValue = styles.getModalPaddingValue()) != null) {
            Button captureButton2 = cVarC.f113445e;
            s.j(captureButton2, "captureButton");
            ViewGroup.LayoutParams layoutParams = captureButton2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            StyleElements.Size top = modalPaddingValue.getTop();
            if (top != null && (dp2 = top.getDp()) != null) {
                marginLayoutParams.topMargin = (int) yh0.h.a(dp2.doubleValue());
            }
            captureButton2.setLayoutParams(marginLayoutParams);
        }
        IdConfig.e side = viewModel.getSide();
        int[] iArr = a.f111150a;
        int i12 = iArr[side.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (assetConfig != null) {
                        idFrontHelpModalPictograph = assetConfig.getIdFrontHelpModalPictograph();
                    } else {
                        idFrontHelpModalPictograph = null;
                    }
                } else if (assetConfig != null) {
                    idFrontHelpModalPictograph = assetConfig.getBarcodeHelpModalPictograph();
                } else {
                    idFrontHelpModalPictograph = null;
                }
            } else if (assetConfig != null) {
                idFrontHelpModalPictograph = assetConfig.getIdBackHelpModalPictograph();
            } else {
                idFrontHelpModalPictograph = null;
            }
        } else if (assetConfig != null) {
            idFrontHelpModalPictograph = assetConfig.getIdFrontHelpModalPictograph();
        } else {
            idFrontHelpModalPictograph = null;
        }
        if (idFrontHelpModalPictograph == null) {
            int i13 = iArr[viewModel.getSide().ordinal()];
            if (i13 == 1) {
                i11 = qh0.d.f105546c;
            } else if (i13 != 2) {
                i11 = i13 != 3 ? qh0.d.f105546c : qh0.d.f105545b;
            } else {
                i11 = qh0.d.f105544a;
            }
            cVarC.f113447g.setAnimation(i11);
            int i14 = iArr[viewModel.getSide().ordinal()];
            if (i14 == 2) {
                ThemeableLottieAnimationView illustration = cVarC.f113447g;
                s.j(illustration, "illustration");
                ui0.g.g(illustration, styles != null ? styles.getCaptureHintIconStrokeColor() : null, styles != null ? styles.getCaptureHintIconFillColor() : null, null, new String[]{"#000000", "#190051"}, new String[]{"#AA84FF"}, new String[0]);
            } else if (i14 != 3) {
                ThemeableLottieAnimationView illustration2 = cVarC.f113447g;
                s.j(illustration2, "illustration");
                ui0.g.g(illustration2, styles != null ? styles.getCaptureHintIconStrokeColor() : null, styles != null ? styles.getCaptureHintIconFillColor() : null, null, new String[]{"#000000"}, new String[]{"#8751FF"}, new String[0]);
            } else {
                ThemeableLottieAnimationView illustration3 = cVarC.f113447g;
                s.j(illustration3, "illustration");
                ui0.g.g(illustration3, styles != null ? styles.getCaptureHintIconStrokeColor() : null, styles != null ? styles.getCaptureHintIconFillColor() : null, null, new String[]{"#190051"}, new String[]{"#AA84FF", "#AA85FF"}, new String[0]);
            }
        } else if (this.currentAssetIllustrationView == null) {
            ConstraintLayout illustrationContainer = cVarC.f113448h;
            s.j(illustrationContainer, "illustrationContainer");
            this.currentAssetIllustrationView = wi0.b.c(idFrontHelpModalPictograph, illustrationContainer, false, 2, null);
            cVarC.f113447g.setVisibility(8);
        }
        Space bottomInset = cVarC.f113442b;
        s.j(bottomInset, "bottomInset");
        ki0.f.g(bottomInset, new l() { // from class: sg0.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g.m(cVarC, (WindowInsetsCompat) obj);
            }
        });
        cVarC.getRoot().postDelayed(new Runnable() { // from class: sg0.b
            @Override // java.lang.Runnable
            public final void run() {
                g.n(bottomSheetBehaviorQ0);
            }
        }, 200L);
    }

    public final void o() {
        final tg0.c cVar = this.binding;
        if (cVar == null) {
            return;
        }
        if (this.isShowing) {
            FrameLayout root = cVar.getRoot();
            s.j(root, "getRoot(...)");
            a30.e.c(root, new wn0.a() { // from class: sg0.c
                @Override // wn0.a
                public final Object invoke() {
                    return g.p(cVar);
                }
            });
        } else {
            FrameLayout root2 = cVar.getRoot();
            s.j(root2, "getRoot(...)");
            a30.e.c(root2, null);
        }
    }
}
