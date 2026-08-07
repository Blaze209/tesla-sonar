package oi0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import p013kotlin.Metadata;
import rc.ImageRequest;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lri0/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "styles", "Ljn0/h0;", "b", "(Lri0/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class x {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"oi0/x$a", "Lvc/c;", "Lec/n;", "placeholder", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lec/n;)V", AnalyticsAttribute.Error, "c", "result", "b", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements vc.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ri0.v f97802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ri0.v f97803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ESignatureComponent f97804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ri0.v f97805d;

        public a(ri0.v vVar, ri0.v vVar2, ESignatureComponent eSignatureComponent, ri0.v vVar3) {
            this.f97802a = vVar;
            this.f97803b = vVar2;
            this.f97804c = eSignatureComponent;
            this.f97805d = vVar3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vc.c
        public void b(ec.n result) {
            Bitmap bitmap;
            BitmapDrawable bitmapDrawable = result instanceof BitmapDrawable ? (BitmapDrawable) result : null;
            if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                return;
            }
            this.f97804c.getBitmapController().c(bitmap);
            this.f97805d.f108400g.setVisibility(0);
            this.f97805d.f108396c.setVisibility(0);
        }

        @Override // vc.c
        public void c(ec.n error) {
            this.f97803b.f108395b.setVisibility(0);
        }

        @Override // vc.c
        public void d(ec.n placeholder) {
            this.f97802a.f108395b.setVisibility(8);
            this.f97802a.f108396c.setVisibility(8);
            this.f97802a.f108400g.setVisibility(8);
        }
    }

    private static final void b(ri0.v vVar, ESignature.ESignatureComponentStyle eSignatureComponentStyle) {
        Drawable drawableMutate;
        TextView addSignatureLabel = vVar.f108395b;
        p013kotlin.jvm.internal.s.j(addSignatureLabel, "addSignatureLabel");
        ui0.e0.n(addSignatureLabel, eSignatureComponentStyle.getInputTextStyle().getPlaceholderTextBasedStyle(), null, 2, null);
        Integer signaturePreviewBackgroundColor = eSignatureComponentStyle.getSignaturePreviewBackgroundColor();
        if (signaturePreviewBackgroundColor != null) {
            vVar.f108399f.setCardBackgroundColor(signaturePreviewBackgroundColor.intValue());
        }
        Integer fillColorValue = eSignatureComponentStyle.getFillColorValue();
        if (fillColorValue != null) {
            int iIntValue = fillColorValue.intValue();
            Drawable drawable = vVar.f108396c.getDrawable();
            if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                drawableMutate.setTint(iIntValue);
            }
        }
        TextView errorLabel = vVar.f108397d;
        p013kotlin.jvm.internal.s.j(errorLabel, "errorLabel");
        ui0.e0.n(errorLabel, eSignatureComponentStyle.getInputTextStyle().getErrorTextStyle(), null, 2, null);
        TextView label = vVar.f108398e;
        p013kotlin.jvm.internal.s.j(label, "label");
        ui0.e0.n(label, eSignatureComponentStyle.getInputTextStyle().getLabelTextBasedStyle(), null, 2, null);
        StyleElements.SizeSet margins = eSignatureComponentStyle.getMargins();
        if (margins != null) {
            ConstraintLayout root = vVar.getRoot();
            p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
            xi0.d.c(root, margins);
        }
        Integer baseBorderColorValue = eSignatureComponentStyle.getInputTextStyle().getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            vVar.f108399f.setStrokeColor(baseBorderColorValue.intValue());
        }
        Double borderWidthValue = eSignatureComponentStyle.getInputTextStyle().getBorderWidthValue();
        if (borderWidthValue != null) {
            vVar.f108399f.setStrokeWidth((int) Math.ceil(yh0.h.a(borderWidthValue.doubleValue())));
        }
        Double borderRadiusValue = eSignatureComponentStyle.getInputTextStyle().getBorderRadiusValue();
        if (borderRadiusValue != null) {
            vVar.f108399f.setRadius((float) yh0.h.a(borderRadiusValue.doubleValue()));
        }
    }

    public static final ConstraintLayout c(final ESignatureComponent eSignatureComponent, p5 uiComponentHelper, final ESignature config) {
        p013kotlin.jvm.internal.s.k(eSignatureComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.v vVarC = ri0.v.c(uiComponentHelper.getLayoutInflater());
        uiComponentHelper.d(new wn0.a() { // from class: oi0.w
            @Override // wn0.a
            public final Object invoke() {
                return x.d(config, vVarC, eSignatureComponent);
            }
        });
        vVarC.getRoot().setTag(vVarC);
        ConstraintLayout root = vVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(ESignature eSignature, ri0.v vVar, ESignatureComponent eSignatureComponent) {
        String prefill;
        ESignature.Attributes attributes = eSignature.getAttributes();
        if (attributes != null && (prefill = attributes.getPrefill()) != null) {
            Context context = vVar.f108400g.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            ec.r rVarC = rc.i.a(rc.h.a(new ec.r.a(context), true), 100).c();
            Context context2 = vVar.f108400g.getContext();
            p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
            rVarC.b(new ImageRequest.a(context2).c(prefill).p(new a(vVar, vVar, eSignatureComponent, vVar)).b());
        }
        ESignature.ESignatureComponentStyle styles = eSignature.getStyles();
        if (styles != null) {
            p013kotlin.jvm.internal.s.h(vVar);
            b(vVar, styles);
        }
        return jn0.h0.f84049a;
    }
}
