package aj0;

import a30.ViewEnvironment;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JK\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\b0\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001f\u0010$\u001a\r\u0012\t\u0012\u00070 ¢\u0006\u0002\b!0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R,\u0010*\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\b\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.¨\u00060"}, d2 = {"Laj0/v1;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "styles", "Ljn0/h0;", "g", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "La30/a0;", "viewEnvironment", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;La30/a0;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "component", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "config", "Lkotlin/Function2;", "", "Landroid/graphics/Bitmap;", "onComplete", "p", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;La30/a0;Lwn0/p;)V", "h", "()Z", "a", "Landroid/view/ViewGroup;", "Lkotlin/Lazy;", "Lbj0/b;", "Lkotlin/jvm/internal/EnhancedNullability;", "b", "Lkotlin/Lazy;", "lazyBinding", "c", "Z", "setup", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "currentOnCompleteListener", IntegerTokenConverter.CONVERTER_KEY, "()Lbj0/b;", "getBinding$delegate", "(Laj0/v1;)Ljava/lang/Object;", "binding", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy<bj0.b> lazyBinding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean setup;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private wn0.p<? super Boolean, ? super Bitmap, jn0.h0> currentOnCompleteListener;

    public v1(ViewGroup contentView) {
        p013kotlin.jvm.internal.s.k(contentView, "contentView");
        this.contentView = contentView;
        this.lazyBinding = jn0.m.b(new wn0.a() { // from class: aj0.p1
            @Override // wn0.a
            public final Object invoke() {
                return v1.j(this.f1558a);
            }
        });
    }

    private final void g(ESignature.ESignatureComponentStyle styles) {
        TextBasedComponentStyle dialogTitleStyle = styles.getDialogTitleStyle();
        if (dialogTitleStyle != null) {
            TextView signatureLabel = i().f17504j;
            p013kotlin.jvm.internal.s.j(signatureLabel, "signatureLabel");
            ui0.e0.n(signatureLabel, dialogTitleStyle, null, 2, null);
        }
        TextBasedComponentStyle dialogTextStyle = styles.getDialogTextStyle();
        if (dialogTextStyle != null) {
            TextView signatureDescription = i().f17503i;
            p013kotlin.jvm.internal.s.j(signatureDescription, "signatureDescription");
            ui0.e0.n(signatureDescription, dialogTextStyle, null, 2, null);
        }
        Integer baseBackgroundColorValue = styles.getInputTextStyle().getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            i().f17502h.setCardBackgroundColor(baseBackgroundColorValue.intValue());
        }
        Double borderRadiusValue = styles.getInputTextStyle().getBorderRadiusValue();
        if (borderRadiusValue != null) {
            i().f17502h.setRadius((float) Math.ceil(yh0.h.a(borderRadiusValue.doubleValue())));
        }
        Double borderWidthValue = styles.getInputTextStyle().getBorderWidthValue();
        if (borderWidthValue != null) {
            i().f17502h.setStrokeWidth((int) Math.ceil(yh0.h.a(borderWidthValue.doubleValue())));
        }
        Integer baseBorderColorValue = styles.getInputTextStyle().getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            i().f17502h.setStrokeColor(baseBorderColorValue.intValue());
        }
        ButtonSubmitComponentStyle submitButtonStyle = styles.getSubmitButtonStyle();
        if (submitButtonStyle != null) {
            Button saveButton = i().f17500f;
            p013kotlin.jvm.internal.s.j(saveButton, "saveButton");
            ui0.e.f(saveButton, submitButtonStyle, false, false, 6, null);
        }
        ButtonCancelComponentStyle clearSignatureButtonStyle = styles.getClearSignatureButtonStyle();
        if (clearSignatureButtonStyle != null) {
            Button clearButton = i().f17497c;
            p013kotlin.jvm.internal.s.j(clearButton, "clearButton");
            ui0.e.f(clearButton, clearSignatureButtonStyle, false, false, 6, null);
        }
    }

    private final bj0.b i() {
        return this.lazyBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bj0.b j(v1 v1Var) {
        return bj0.b.c(LayoutInflater.from(v1Var.contentView.getContext()), v1Var.contentView, true);
    }

    private final void k(StepStyles.UiStepStyle stepStyles, ViewEnvironment viewEnvironment) {
        if (this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(i().f17496b);
        p013kotlin.jvm.internal.s.j(bottomSheetBehaviorQ0, "from(...)");
        wn0.a aVar = new wn0.a() { // from class: aj0.r1
            @Override // wn0.a
            public final Object invoke() {
                return v1.l(this.f1609a);
            }
        };
        FrameLayout bottomSheet = i().f17496b;
        p013kotlin.jvm.internal.s.j(bottomSheet, "bottomSheet");
        ki0.b.b(bottomSheetBehaviorQ0, aVar, bottomSheet, i().f17505k, i().f17501g);
        bottomSheetBehaviorQ0.L0(false);
        i().f17498d.setOnClickListener(new View.OnClickListener() { // from class: aj0.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1.m(bottomSheetBehaviorQ0, view);
            }
        });
        i().f17497c.setOnClickListener(new View.OnClickListener() { // from class: aj0.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1.n(this.f1638a, view);
            }
        });
        i().f17500f.setOnClickListener(new View.OnClickListener() { // from class: aj0.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1.o(this.f1655a, bottomSheetBehaviorQ0, view);
            }
        });
        ConstraintLayout signatureSheet = i().f17505k;
        p013kotlin.jvm.internal.s.j(signatureSheet, "signatureSheet");
        ui0.c.c(signatureSheet, stepStyles, null, new Rect(0, (int) yh0.h.a(12.0d), 0, 0), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l(v1 v1Var) {
        wn0.p<? super Boolean, ? super Bitmap, jn0.h0> pVar = v1Var.currentOnCompleteListener;
        if (pVar != null) {
            pVar.invoke(Boolean.TRUE, null);
        }
        v1Var.currentOnCompleteListener = null;
        v1Var.i().f17502h.k();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.Y0(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(v1 v1Var, View view) {
        v1Var.i().f17502h.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(v1 v1Var, BottomSheetBehavior bottomSheetBehavior, View view) {
        wn0.p<? super Boolean, ? super Bitmap, jn0.h0> pVar = v1Var.currentOnCompleteListener;
        if (pVar != null) {
            pVar.invoke(Boolean.FALSE, v1Var.i().f17502h.n());
        }
        v1Var.currentOnCompleteListener = null;
        bottomSheetBehavior.Y0(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(v1 v1Var) {
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(v1Var.i().f17496b);
        p013kotlin.jvm.internal.s.j(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.Y0(3);
    }

    public final boolean h() {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(i().f17496b);
        p013kotlin.jvm.internal.s.j(bottomSheetBehaviorQ0, "from(...)");
        if (bottomSheetBehaviorQ0.w0() == 5) {
            return false;
        }
        bottomSheetBehaviorQ0.Y0(5);
        return true;
    }

    public final void p(ESignatureComponent component, ESignature config, StepStyles.UiStepStyle stepStyles, ViewEnvironment viewEnvironment, wn0.p<? super Boolean, ? super Bitmap, jn0.h0> onComplete) {
        String dialogText;
        p013kotlin.jvm.internal.s.k(component, "component");
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
        p013kotlin.jvm.internal.s.k(onComplete, "onComplete");
        k(stepStyles, viewEnvironment);
        this.currentOnCompleteListener = onComplete;
        i().f17502h.k();
        TextView textView = i().f17504j;
        ESignature.Attributes attributes = config.getAttributes();
        textView.setText(attributes != null ? attributes.getDialogTitle() : null);
        TextView textView2 = i().f17503i;
        ESignature.Attributes attributes2 = config.getAttributes();
        if (attributes2 == null || (dialogText = attributes2.getDialogText()) == null) {
            dialogText = "";
        }
        textView2.setText(dialogText);
        ESignature.ESignatureComponentStyle styles = config.getStyles();
        if (styles != null) {
            g(styles);
        }
        i().getRoot().postDelayed(new Runnable() { // from class: aj0.q1
            @Override // java.lang.Runnable
            public final void run() {
                v1.q(this.f1592a);
            }
        }, 100L);
    }
}
