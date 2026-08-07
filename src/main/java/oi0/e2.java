package oi0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectComponent;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/e;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/e;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e2 {
    public static final TextInputLayout b(InputSelectComponent inputSelectComponent, p5 uiComponentHelper, final InputSelect config) {
        EditText editText;
        p013kotlin.jvm.internal.s.k(inputSelectComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.r rVarC = ri0.r.c(uiComponentHelper.getLayoutInflater());
        InputSelect.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null && !p013kotlin.text.t.y0(placeholder)) {
                rVarC.getRoot().setPlaceholderText(attributes.getPlaceholder());
                rVarC.getRoot().setExpandedHintEnabled(false);
                TextInputLayout root = rVarC.getRoot();
                p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
                ki0.o.a(root);
            }
            String prefill = attributes.getPrefill();
            if (prefill != null && (editText = rVarC.getRoot().getEditText()) != null) {
                editText.setText(prefill);
            }
            String label = attributes.getLabel();
            if (label != null) {
                rVarC.getRoot().setHint(label);
            }
        }
        uiComponentHelper.d(new wn0.a() { // from class: oi0.d2
            @Override // wn0.a
            public final Object invoke() {
                return e2.c(config, rVarC);
            }
        });
        TextInputLayout root2 = rVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root2, "getRoot(...)");
        return root2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(InputSelect inputSelect, ri0.r rVar) {
        InputSelectComponentStyle styles = inputSelect.getStyles();
        if (styles != null) {
            TextInputLayout listSelector = rVar.f108387b;
            p013kotlin.jvm.internal.s.j(listSelector, "listSelector");
            ui0.o.i(listSelector, styles);
        }
        return jn0.h0.f84049a;
    }
}
