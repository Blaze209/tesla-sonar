package oi0;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class s1 {
    public static final TextInputLayout b(InputNumberComponent inputNumberComponent, p5 uiComponentHelper, final InputNumber config) {
        p013kotlin.jvm.internal.s.k(inputNumberComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.k kVarC = ri0.k.c(uiComponentHelper.getLayoutInflater());
        InputNumber.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                kVarC.f108360c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                kVarC.f108360c.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = kVarC.f108360c;
                p013kotlin.jvm.internal.s.j(inputLayout, "inputLayout");
                ki0.o.a(inputLayout);
            }
            Integer precision = attributes.getPrecision();
            if (precision != null) {
                int iIntValue = precision.intValue();
                EditText editText = kVarC.f108360c.getEditText();
                if (editText != null) {
                    editText.setFilters(new u[]{new u(iIntValue)});
                }
            }
        }
        kVarC.f108359b.setText(String.valueOf(inputNumberComponent.getNumberController().b()));
        TextInputEditText editText2 = kVarC.f108359b;
        p013kotlin.jvm.internal.s.j(editText2, "editText");
        editText2.addTextChangedListener(new a(inputNumberComponent));
        uiComponentHelper.d(new wn0.a() { // from class: oi0.r1
            @Override // wn0.a
            public final Object invoke() {
                return s1.c(config, kVarC);
            }
        });
        TextInputLayout root = kVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(InputNumber inputNumber, ri0.k kVar) {
        InputTextBasedComponentStyle styles = inputNumber.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = kVar.f108360c;
            p013kotlin.jvm.internal.s.j(inputLayout, "inputLayout");
            ui0.z.k(inputLayout, styles);
        }
        return jn0.h0.f84049a;
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Ljn0/h0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputNumberComponent f97750a;

        public a(InputNumberComponent inputNumberComponent) {
            this.f97750a = inputNumberComponent;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            String string;
            this.f97750a.getNumberController().c((s11 == null || (string = s11.toString()) == null) ? null : p013kotlin.text.t.u(string));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }
    }
}
