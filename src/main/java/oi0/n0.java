package oi0;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "g", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Landroidx/constraintlayout/widget/ConstraintLayout;", "other", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Z", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class n0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(InputAddress inputAddress) {
        InputAddress.Attributes attributes = inputAddress.getAttributes();
        String prefillAddressStreet1 = attributes != null ? attributes.getPrefillAddressStreet1() : null;
        if (prefillAddressStreet1 != null && !p013kotlin.text.t.y0(prefillAddressStreet1)) {
            return false;
        }
        InputAddress.Attributes attributes2 = inputAddress.getAttributes();
        String prefillAddressStreet2 = attributes2 != null ? attributes2.getPrefillAddressStreet2() : null;
        if (prefillAddressStreet2 != null && !p013kotlin.text.t.y0(prefillAddressStreet2)) {
            return false;
        }
        InputAddress.Attributes attributes3 = inputAddress.getAttributes();
        String prefillAddressCity = attributes3 != null ? attributes3.getPrefillAddressCity() : null;
        if (prefillAddressCity != null && !p013kotlin.text.t.y0(prefillAddressCity)) {
            return false;
        }
        InputAddress.Attributes attributes4 = inputAddress.getAttributes();
        String prefillAddressPostalCode = attributes4 != null ? attributes4.getPrefillAddressPostalCode() : null;
        if (prefillAddressPostalCode != null && !p013kotlin.text.t.y0(prefillAddressPostalCode)) {
            return false;
        }
        InputAddress.Attributes attributes5 = inputAddress.getAttributes();
        String prefillAddressSubdivision = attributes5 != null ? attributes5.getPrefillAddressSubdivision() : null;
        return prefillAddressSubdivision == null || p013kotlin.text.t.y0(prefillAddressSubdivision);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputAddressComponent f(InputAddressComponent inputAddressComponent, InputAddressComponent inputAddressComponent2) {
        inputAddressComponent.K(inputAddressComponent2.getIsAddressFieldCollapsed());
        inputAddressComponent.N(inputAddressComponent2.getTextControllerForAddressStreet1());
        inputAddressComponent.O(inputAddressComponent2.getTextControllerForAddressStreet2());
        inputAddressComponent.L(inputAddressComponent2.getTextControllerForAddressCity());
        inputAddressComponent.P(inputAddressComponent2.getTextControllerForAddressSubdivision());
        inputAddressComponent.M(inputAddressComponent2.getTextControllerForAddressPostalCode());
        return inputAddressComponent;
    }

    public static final ConstraintLayout g(final InputAddressComponent inputAddressComponent, p5 uiComponentHelper, final InputAddress config) {
        p013kotlin.jvm.internal.s.k(inputAddressComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.d dVarC = ri0.d.c(uiComponentHelper.getLayoutInflater());
        InputAddress.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            a30.t tVarJ = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText = dVarC.f108314d.getEditText();
            p013kotlin.jvm.internal.s.h(editText);
            a30.u.b(tVarJ, editText);
            a30.t tVarJ2 = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText2 = dVarC.f108316f.getEditText();
            p013kotlin.jvm.internal.s.h(editText2);
            a30.u.b(tVarJ2, editText2);
            a30.t tVarK = inputAddressComponent.getTextControllerForAddressStreet2();
            EditText editText3 = dVarC.f108324n.getEditText();
            p013kotlin.jvm.internal.s.h(editText3);
            a30.u.b(tVarK, editText3);
            a30.t tVarA = inputAddressComponent.getTextControllerForAddressCity();
            EditText editText4 = dVarC.f108312b.getEditText();
            p013kotlin.jvm.internal.s.h(editText4);
            a30.u.b(tVarA, editText4);
            a30.t tVarC = inputAddressComponent.getTextControllerForAddressSubdivision();
            EditText editText5 = dVarC.f108323m.getEditText();
            p013kotlin.jvm.internal.s.h(editText5);
            a30.u.b(tVarC, editText5);
            a30.t tVarB = inputAddressComponent.getTextControllerForAddressPostalCode();
            EditText editText6 = dVarC.f108322l.getEditText();
            p013kotlin.jvm.internal.s.h(editText6);
            a30.u.b(tVarB, editText6);
            String placeholderAutocomplete = attributes.getPlaceholderAutocomplete();
            if (placeholderAutocomplete != null) {
                dVarC.f108314d.setHint(placeholderAutocomplete);
            }
            String placeholderAddressStreet1 = attributes.getPlaceholderAddressStreet1();
            if (placeholderAddressStreet1 != null) {
                dVarC.f108316f.setHint(placeholderAddressStreet1);
            }
            String placeholderAddressStreet2 = attributes.getPlaceholderAddressStreet2();
            if (placeholderAddressStreet2 != null) {
                dVarC.f108324n.setHint(placeholderAddressStreet2);
            }
            String placeholderAddressCity = attributes.getPlaceholderAddressCity();
            if (placeholderAddressCity != null) {
                dVarC.f108312b.setHint(placeholderAddressCity);
            }
            boolean zF = p013kotlin.jvm.internal.s.f(attributes.getSelectedCountryCode(), "US");
            dVarC.f108323m.setHint(zF ? attributes.getPlaceholderAddressSubdivisionUs() : attributes.getPlaceholderAddressSubdivision());
            dVarC.f108322l.setHint(zF ? attributes.getPlaceholderAddressPostalCodeUs() : attributes.getPlaceholderAddressPostalCode());
            String label = attributes.getLabel();
            if (label != null) {
                dVarC.f108321k.setText(label);
            }
            String editAddressManuallyPrompt = attributes.getEditAddressManuallyPrompt();
            if (editAddressManuallyPrompt != null) {
                dVarC.f108313c.setText(editAddressManuallyPrompt);
            }
        }
        dVarC.getRoot().setTag(dVarC);
        uiComponentHelper.d(new wn0.a() { // from class: oi0.l0
            @Override // wn0.a
            public final Object invoke() {
                return n0.i(config, dVarC);
            }
        });
        dVarC.f108313c.setOnClickListener(new View.OnClickListener() { // from class: oi0.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.h(inputAddressComponent, view);
            }
        });
        dVarC.getRoot().setTag(dVarC);
        ConstraintLayout constraintLayoutB = dVarC.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InputAddressComponent inputAddressComponent, View view) {
        inputAddressComponent.G(Boolean.FALSE);
        pi0.n nVarM = inputAddressComponent.getIsAddressFieldCollapsed();
        Boolean boolF = inputAddressComponent.getIsAddressComponentsCollapsed();
        nVarM.c(boolF != null ? boolF.booleanValue() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i(InputAddress inputAddress, ri0.d dVar) {
        InputTextBasedComponentStyle inputTextStyle;
        TextBasedComponentStyle expandComponentsButtonStyle;
        InputAddress.AddressComponentStyle styles = inputAddress.getStyles();
        if (styles != null && (expandComponentsButtonStyle = styles.getExpandComponentsButtonStyle()) != null) {
            TextView addressExpandComponentsButton = dVar.f108313c;
            p013kotlin.jvm.internal.s.j(addressExpandComponentsButton, "addressExpandComponentsButton");
            ui0.e0.n(addressExpandComponentsButton, expandComponentsButtonStyle, null, 2, null);
        }
        InputAddress.AddressComponentStyle styles2 = inputAddress.getStyles();
        if (styles2 != null && (inputTextStyle = styles2.getInputTextStyle()) != null) {
            TextView addressLabel = dVar.f108321k;
            p013kotlin.jvm.internal.s.j(addressLabel, "addressLabel");
            ui0.e0.n(addressLabel, inputTextStyle.getLabelTextBasedStyle(), null, 2, null);
            TextInputLayout addressFieldCollapsed = dVar.f108314d;
            p013kotlin.jvm.internal.s.j(addressFieldCollapsed, "addressFieldCollapsed");
            ui0.z.k(addressFieldCollapsed, inputTextStyle);
            TextInputLayout addressFieldExpanded = dVar.f108316f;
            p013kotlin.jvm.internal.s.j(addressFieldExpanded, "addressFieldExpanded");
            ui0.z.k(addressFieldExpanded, inputTextStyle);
            TextInputLayout addressSuite = dVar.f108324n;
            p013kotlin.jvm.internal.s.j(addressSuite, "addressSuite");
            ui0.z.k(addressSuite, inputTextStyle);
            TextInputLayout addressCity = dVar.f108312b;
            p013kotlin.jvm.internal.s.j(addressCity, "addressCity");
            ui0.z.k(addressCity, inputTextStyle);
            TextInputLayout addressSubdivision = dVar.f108323m;
            p013kotlin.jvm.internal.s.j(addressSubdivision, "addressSubdivision");
            ui0.z.k(addressSubdivision, inputTextStyle);
            TextInputLayout addressPostalCode = dVar.f108322l;
            p013kotlin.jvm.internal.s.j(addressPostalCode, "addressPostalCode");
            ui0.z.k(addressPostalCode, inputTextStyle);
        }
        return jn0.h0.f84049a;
    }
}
