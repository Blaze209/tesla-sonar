package oi0;

import android.content.Context;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;)Lcom/google/android/material/textfield/TextInputLayout;", "Lri0/l;", "binding", "Lkotlin/Function0;", "Ljn0/h0;", "onCountryInputClick", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;Lri0/l;Lwn0/a;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class v1 {
    public static final TextInputLayout c(InputPhoneNumberComponent inputPhoneNumberComponent, p5 uiComponentHelper, final InputPhoneNumber config) {
        EditText editText;
        p013kotlin.jvm.internal.s.k(inputPhoneNumberComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.l lVarC = ri0.l.c(uiComponentHelper.getLayoutInflater());
        InputPhoneNumber.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String prefill = attributes.getPrefill();
            if (prefill != null && (editText = lVarC.f108362b.getEditText()) != null) {
                editText.setText(prefill);
            }
            String label = attributes.getLabel();
            if (label != null) {
                lVarC.f108362b.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                lVarC.f108362b.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = lVarC.f108362b;
                p013kotlin.jvm.internal.s.j(inputLayout, "inputLayout");
                ki0.o.a(inputLayout);
            }
            EditText editText2 = lVarC.f108362b.getEditText();
            if (editText2 != null) {
                a30.u.b(inputPhoneNumberComponent.getTextController(), editText2);
                yh0.a0.a(editText2, new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.getSelectedCountryCode()));
            }
        }
        uiComponentHelper.d(new wn0.a() { // from class: oi0.t1
            @Override // wn0.a
            public final Object invoke() {
                return v1.d(config, lVarC);
            }
        });
        lVarC.getRoot().setTag(lVarC);
        TextInputLayout root = lVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(InputPhoneNumber inputPhoneNumber, ri0.l lVar) {
        InputTextBasedComponentStyle styles = inputPhoneNumber.getStyles();
        if (styles != null) {
            TextView prefixTextView = lVar.f108362b.getPrefixTextView();
            p013kotlin.jvm.internal.s.j(prefixTextView, "getPrefixTextView(...)");
            ui0.e0.n(prefixTextView, styles.getTextBasedStyle(), null, 2, null);
            TextInputLayout inputLayout = lVar.f108362b;
            p013kotlin.jvm.internal.s.j(inputLayout, "inputLayout");
            ui0.z.k(inputLayout, styles);
        }
        return jn0.h0.f84049a;
    }

    public static final void e(InputPhoneNumberComponent inputPhoneNumberComponent, ri0.l binding, final wn0.a<jn0.h0> onCountryInputClick) {
        p013kotlin.jvm.internal.s.k(inputPhoneNumberComponent, "<this>");
        p013kotlin.jvm.internal.s.k(binding, "binding");
        p013kotlin.jvm.internal.s.k(onCountryInputClick, "onCountryInputClick");
        binding.f108362b.setPrefixText(pi0.e.f103042a.i((Option) p013kotlin.collections.v.o0(inputPhoneNumberComponent.getCountryCodeOptionsController().b())));
        String selectedCountryCode = inputPhoneNumberComponent.getSelectedCountryCode();
        List<Option> listE = inputPhoneNumberComponent.e();
        if (selectedCountryCode == null && listE.size() == 1) {
            inputPhoneNumberComponent.getCountryCodeOptionsController().c(p013kotlin.collections.v.e(p013kotlin.collections.v.o0(listE)));
        }
        binding.f108362b.getPrefixTextView().setOnClickListener(new View.OnClickListener() { // from class: oi0.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1.f(onCountryInputClick, view);
            }
        });
        TextView prefixTextView = binding.f108362b.getPrefixTextView();
        Context context = binding.getRoot().getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        prefixTextView.setBackground(pi0.g.b(context, binding.f108362b.getPrefixTextView().getTextColors().getDefaultColor(), (int) binding.f108362b.getPrefixTextView().getPaint().measureText(String.valueOf(binding.f108362b.getPrefixText()))));
        EditText editText = binding.f108362b.getEditText();
        if (editText != null) {
            yh0.a0.a(editText, new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.getSelectedCountryCode()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(wn0.a aVar, View view) {
        aVar.invoke();
    }
}
