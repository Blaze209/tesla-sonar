package oi0;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "config", "Landroid/widget/LinearLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c0 {
    public static final LinearLayout c(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, p5 uiComponentHelper, final GovernmentIdNfcScan config) {
        String launchButtonText;
        Boolean hidePrefilledInputs;
        p013kotlin.jvm.internal.s.k(governmentIdNfcScanComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        LinearLayout linearLayout = new LinearLayout(uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String());
        linearLayout.setOrientation(1);
        GovernmentIdNfcScan.Attributes attributes = config.getAttributes();
        String cardAccessNumberLabel = attributes != null ? attributes.getCardAccessNumberLabel() : null;
        GovernmentIdNfcScan.Attributes attributes2 = config.getAttributes();
        String prefillCardAccessNumber = attributes2 != null ? attributes2.getPrefillCardAccessNumber() : null;
        InputText.InputType inputType = InputText.InputType.TEXT;
        GovernmentIdNfcScan.Attributes attributes3 = config.getAttributes();
        JsonLogicBoolean disabled = attributes3 != null ? attributes3.getDisabled() : null;
        GovernmentIdNfcScan.Attributes attributes4 = config.getAttributes();
        InputText.Attributes attributes5 = new InputText.Attributes(prefillCardAccessNumber, cardAccessNumberLabel, null, inputType, null, attributes4 != null ? attributes4.getHidden() : null, disabled);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles = config.getStyles();
        InputText inputText = new InputText("can_access_code", attributes5, styles != null ? styles.getDocumentNumberStyle() : null);
        final TextInputLayout textInputLayoutB = i2.b(new InputTextComponent(inputText), uiComponentHelper, inputText, governmentIdNfcScanComponent.getCardAccessNumberController());
        textInputLayoutB.setId(mi0.e.f92167e0);
        linearLayout.addView(textInputLayoutB);
        GovernmentIdNfcScan.Attributes attributes6 = config.getAttributes();
        String documentNumberLabel = attributes6 != null ? attributes6.getDocumentNumberLabel() : null;
        GovernmentIdNfcScan.Attributes attributes7 = config.getAttributes();
        String prefillDocumentNumber = attributes7 != null ? attributes7.getPrefillDocumentNumber() : null;
        GovernmentIdNfcScan.Attributes attributes8 = config.getAttributes();
        JsonLogicBoolean disabled2 = attributes8 != null ? attributes8.getDisabled() : null;
        GovernmentIdNfcScan.Attributes attributes9 = config.getAttributes();
        InputText.Attributes attributes10 = new InputText.Attributes(prefillDocumentNumber, documentNumberLabel, null, inputType, null, attributes9 != null ? attributes9.getHidden() : null, disabled2);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles2 = config.getStyles();
        InputText inputText2 = new InputText("doc_number", attributes10, styles2 != null ? styles2.getDocumentNumberStyle() : null);
        final TextInputLayout textInputLayoutB2 = i2.b(new InputTextComponent(inputText2), uiComponentHelper, inputText2, governmentIdNfcScanComponent.getDocumentNumberController());
        textInputLayoutB2.setId(mi0.e.f92171g0);
        linearLayout.addView(textInputLayoutB2);
        GovernmentIdNfcScan.Attributes attributes11 = config.getAttributes();
        String dateOfBirthLabel = attributes11 != null ? attributes11.getDateOfBirthLabel() : null;
        GovernmentIdNfcScan.Attributes attributes12 = config.getAttributes();
        String prefillDateOfBirth = attributes12 != null ? attributes12.getPrefillDateOfBirth() : null;
        GovernmentIdNfcScan.Companion companion = GovernmentIdNfcScan.INSTANCE;
        List<String> listGenerateTextMonths = companion.generateTextMonths();
        GovernmentIdNfcScan.Attributes attributes13 = config.getAttributes();
        JsonLogicBoolean disabled3 = attributes13 != null ? attributes13.getDisabled() : null;
        GovernmentIdNfcScan.Attributes attributes14 = config.getAttributes();
        InputDate.Attributes attributes15 = new InputDate.Attributes(prefillDateOfBirth, dateOfBirthLabel, null, null, null, listGenerateTextMonths, attributes14 != null ? attributes14.getHidden() : null, disabled3, 28, null);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles3 = config.getStyles();
        InputDate inputDate = new InputDate("dob", styles3 != null ? styles3.getDateStyle() : null, attributes15);
        final ConstraintLayout constraintLayoutB = e1.b(new InputDateComponent(inputDate), uiComponentHelper, governmentIdNfcScanComponent.getDateOfBirthController(), inputDate);
        constraintLayoutB.setId(mi0.e.f92169f0);
        linearLayout.addView(constraintLayoutB);
        GovernmentIdNfcScan.Attributes attributes16 = config.getAttributes();
        String expirationDateLabel = attributes16 != null ? attributes16.getExpirationDateLabel() : null;
        GovernmentIdNfcScan.Attributes attributes17 = config.getAttributes();
        String prefillExpirationDate = attributes17 != null ? attributes17.getPrefillExpirationDate() : null;
        List<String> listGenerateTextMonths2 = companion.generateTextMonths();
        GovernmentIdNfcScan.Attributes attributes18 = config.getAttributes();
        JsonLogicBoolean disabled4 = attributes18 != null ? attributes18.getDisabled() : null;
        GovernmentIdNfcScan.Attributes attributes19 = config.getAttributes();
        InputDate.Attributes attributes20 = new InputDate.Attributes(prefillExpirationDate, expirationDateLabel, null, null, null, listGenerateTextMonths2, attributes19 != null ? attributes19.getHidden() : null, disabled4, 28, null);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles4 = config.getStyles();
        InputDate inputDate2 = new InputDate(GovernmentIdNfcScan.expirationDateName, styles4 != null ? styles4.getDateStyle() : null, attributes20);
        final ConstraintLayout constraintLayoutB2 = e1.b(new InputDateComponent(inputDate2), uiComponentHelper, governmentIdNfcScanComponent.getExpirationDateController(), inputDate2);
        constraintLayoutB2.setId(mi0.e.f92175i0);
        linearLayout.addView(constraintLayoutB2);
        GovernmentIdNfcScan.Attributes attributes21 = config.getAttributes();
        if (attributes21 == null || (launchButtonText = attributes21.getLaunchButtonText()) == null) {
            launchButtonText = "";
        }
        BasicButtonAttributes basicButtonAttributes = new BasicButtonAttributes(launchButtonText, Button.ButtonType.PRIMARY, null, null, null, null, 60, null);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles5 = config.getStyles();
        SubmitButton submitButton = new SubmitButton(GovernmentIdNfcScan.launchButtonName, basicButtonAttributes, styles5 != null ? styles5.getLaunchButtonStyle() : null);
        ButtonWithLoadingIndicator buttonWithLoadingIndicatorA = g5.a(new SubmitButtonComponent(submitButton), uiComponentHelper, submitButton);
        buttonWithLoadingIndicatorA.setId(mi0.e.f92177j0);
        linearLayout.addView(buttonWithLoadingIndicatorA);
        GovernmentIdNfcScan.Attributes attributes22 = config.getAttributes();
        String prefillCardAccessNumber2 = attributes22 != null ? attributes22.getPrefillCardAccessNumber() : null;
        if (prefillCardAccessNumber2 == null || p013kotlin.text.t.y0(prefillCardAccessNumber2)) {
            textInputLayoutB.setVisibility(8);
        }
        GovernmentIdNfcScan.Attributes attributes23 = config.getAttributes();
        if (attributes23 != null && (hidePrefilledInputs = attributes23.getHidePrefilledInputs()) != null && hidePrefilledInputs.booleanValue()) {
            uiComponentHelper.d(new wn0.a() { // from class: oi0.a0
                @Override // wn0.a
                public final Object invoke() {
                    return c0.d(textInputLayoutB, textInputLayoutB2, constraintLayoutB, constraintLayoutB2);
                }
            });
        }
        final TextView textView = new TextView(linearLayout.getContext());
        textView.setId(mi0.e.f92173h0);
        uiComponentHelper.d(new wn0.a() { // from class: oi0.b0
            @Override // wn0.a
            public final Object invoke() {
                return c0.e(textView, config);
            }
        });
        linearLayout.addView(textView);
        Object tag = constraintLayoutB.getTag();
        p013kotlin.jvm.internal.s.i(tag, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
        ri0.f fVar = (ri0.f) tag;
        Object tag2 = constraintLayoutB2.getTag();
        p013kotlin.jvm.internal.s.i(tag2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
        linearLayout.setTag(new d0(textInputLayoutB, textInputLayoutB2, fVar, (ri0.f) tag2, buttonWithLoadingIndicatorA, textView));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        textInputLayout.setVisibility(8);
        textInputLayout2.setVisibility(8);
        constraintLayout.setVisibility(8);
        constraintLayout2.setVisibility(8);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e(TextView textView, GovernmentIdNfcScan governmentIdNfcScan) {
        TextBasedComponentStyle errorLabelStyle;
        textView.setVisibility(8);
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles = governmentIdNfcScan.getStyles();
        if (styles != null && (errorLabelStyle = styles.getErrorLabelStyle()) != null) {
            ui0.e0.n(textView, errorLabelStyle, null, 2, null);
        }
        return jn0.h0.f84049a;
    }
}
