package oi0;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g2 {
    public static final TextInputLayout b(InputTextAreaComponent inputTextAreaComponent, p5 uiComponentHelper, final InputTextArea config) {
        p013kotlin.jvm.internal.s.k(inputTextAreaComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.n nVarC = ri0.n.c(uiComponentHelper.getLayoutInflater());
        InputTextArea.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            a30.t textController = inputTextAreaComponent.getTextController();
            TextInputEditText editText = nVarC.f108368b;
            p013kotlin.jvm.internal.s.j(editText, "editText");
            a30.u.b(textController, editText);
            String label = attributes.getLabel();
            if (label != null) {
                nVarC.f108369c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                nVarC.f108369c.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = nVarC.f108369c;
                p013kotlin.jvm.internal.s.j(inputLayout, "inputLayout");
                ki0.o.a(inputLayout);
            }
            Integer rows = attributes.getRows();
            if (rows != null) {
                int iIntValue = rows.intValue();
                nVarC.f108368b.setMaxLines(iIntValue);
                nVarC.f108368b.setMinLines(iIntValue);
                nVarC.f108368b.setVerticalScrollBarEnabled(true);
            }
        }
        uiComponentHelper.d(new wn0.a() { // from class: oi0.f2
            @Override // wn0.a
            public final Object invoke() {
                return g2.c(config, nVarC);
            }
        });
        TextInputLayout root = nVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(InputTextArea inputTextArea, ri0.n nVar) {
        InputTextBasedComponentStyle styles = inputTextArea.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = nVar.f108369c;
            p013kotlin.jvm.internal.s.j(inputLayout, "inputLayout");
            ui0.z.k(inputLayout, styles);
        }
        return jn0.h0.f84049a;
    }
}
