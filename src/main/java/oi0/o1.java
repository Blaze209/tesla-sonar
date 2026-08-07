package oi0;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponent;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "g", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;)Lcom/google/android/material/textfield/TextInputLayout;", "Loi0/y3;", "newState", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/google/android/material/textfield/TextInputLayout;Loi0/y3;)V", "Landroid/text/Editable;", "", "mask", "f", "(Landroid/text/Editable;Ljava/lang/String;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o1 {
    public static final void d(final TextInputLayout textInputLayout, MaskTextInputState newState) {
        EditText editText;
        final String mask;
        EditText editText2;
        p013kotlin.jvm.internal.s.k(textInputLayout, "<this>");
        p013kotlin.jvm.internal.s.k(newState, "newState");
        Object tag = textInputLayout.getTag(mi0.e.f92165d0);
        if (p013kotlin.jvm.internal.s.f(tag instanceof MaskTextInputState ? (MaskTextInputState) tag : null, newState)) {
            return;
        }
        textInputLayout.setTag(mi0.e.f92165d0, newState);
        String prefill = newState.getPrefill();
        if (prefill != null && (editText2 = textInputLayout.getEditText()) != null) {
            editText2.setText(prefill);
        }
        String label = newState.getLabel();
        if (label != null) {
            textInputLayout.setHint(label);
        }
        String placeholder = newState.getPlaceholder();
        if (placeholder != null) {
            textInputLayout.setPlaceholderText(placeholder);
            ki0.o.a(textInputLayout);
        }
        if (p013kotlin.jvm.internal.s.f(newState.getSecure(), Boolean.TRUE) && (mask = newState.getMask()) != null) {
            textInputLayout.setEndIconMode(-1);
            textInputLayout.setEndIconDrawable(androidx.core.content.b.getDrawable(textInputLayout.getContext(), mi0.d.f92156d));
            textInputLayout.setEndIconContentDescription(textInputLayout.getContext().getString(qh0.e.R));
            EditText editText3 = textInputLayout.getEditText();
            if (editText3 != null) {
                editText3.setTransformationMethod(new v4(mask));
            }
            textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: oi0.n1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o1.e(textInputLayout, mask, view);
                }
            });
        }
        Object tag2 = textInputLayout.getTag(mi0.e.f92179k0);
        z3 z3Var = tag2 instanceof z3 ? (z3) tag2 : null;
        if (z3Var != null && (editText = textInputLayout.getEditText()) != null) {
            editText.removeTextChangedListener(z3Var);
        }
        String mask2 = newState.getMask();
        if (mask2 == null || p013kotlin.text.t.y0(mask2)) {
            return;
        }
        z3 z3Var2 = new z3(newState.getMask());
        EditText editText4 = textInputLayout.getEditText();
        if (editText4 != null) {
            editText4.addTextChangedListener(z3Var2);
        }
        textInputLayout.setTag(mi0.e.f92179k0, z3Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(TextInputLayout textInputLayout, String str, View view) {
        EditText editText = textInputLayout.getEditText();
        boolean z11 = (editText != null ? editText.getTransformationMethod() : null) != null;
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTransformationMethod(z11 ? null : new v4(str));
        }
        textInputLayout.setEndIconDrawable(androidx.core.content.b.getDrawable(textInputLayout.getContext(), z11 ? mi0.d.f92155c : mi0.d.f92156d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Editable editable, String str) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            x3 x3VarA = x3.INSTANCE.a(cCharAt);
            while (i11 < editable.length()) {
                char cCharAt2 = editable.charAt(i11);
                if (x3VarA.a(cCharAt2)) {
                    sb2.append(cCharAt2);
                    i11++;
                    break;
                } else {
                    if (x3VarA instanceof x3.Literal) {
                        sb2.append(cCharAt);
                        break;
                    }
                    i11++;
                }
            }
        }
        editable.replace(0, editable.length(), sb2);
    }

    public static final TextInputLayout g(InputMaskedTextComponent inputMaskedTextComponent, p5 uiComponentHelper, final InputMaskedText config) {
        p013kotlin.jvm.internal.s.k(inputMaskedTextComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.u uVarC = ri0.u.c(uiComponentHelper.getLayoutInflater());
        TextInputLayout root = uVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        InputMaskedText.Attributes attributes = config.getAttributes();
        String prefill = attributes != null ? attributes.getPrefill() : null;
        InputMaskedText.Attributes attributes2 = config.getAttributes();
        String mask = attributes2 != null ? attributes2.getMask() : null;
        InputMaskedText.Attributes attributes3 = config.getAttributes();
        Boolean secure = attributes3 != null ? attributes3.getSecure() : null;
        InputMaskedText.Attributes attributes4 = config.getAttributes();
        String label = attributes4 != null ? attributes4.getLabel() : null;
        InputMaskedText.Attributes attributes5 = config.getAttributes();
        d(root, new MaskTextInputState(prefill, mask, secure, label, attributes5 != null ? attributes5.getPlaceholder() : null));
        EditText editText = uVarC.getRoot().getEditText();
        if (editText != null) {
            a30.u.b(inputMaskedTextComponent.getTextController(), editText);
        }
        uiComponentHelper.d(new wn0.a() { // from class: oi0.m1
            @Override // wn0.a
            public final Object invoke() {
                return o1.h(config, uVarC);
            }
        });
        TextInputLayout root2 = uVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root2, "getRoot(...)");
        return root2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h(InputMaskedText inputMaskedText, ri0.u uVar) {
        InputTextBasedComponentStyle styles = inputMaskedText.getStyles();
        if (styles != null) {
            TextInputLayout root = uVar.getRoot();
            p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
            ui0.z.k(root, styles);
        }
        return jn0.h0.f84049a;
    }
}
