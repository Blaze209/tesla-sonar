package oi0;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.OptionWithDescription;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "config", "Landroid/widget/LinearLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class u0 {
    public static final LinearLayout c(final InputCheckboxGroupComponent inputCheckboxGroupComponent, p5 uiComponentHelper, final InputCheckboxGroup config) {
        List<OptionWithDescription> listM;
        String str;
        TextBasedComponentStyle errorTextStyle;
        List<String> prefill;
        p013kotlin.jvm.internal.s.k(inputCheckboxGroupComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.j jVarC = ri0.j.c(uiComponentHelper.getLayoutInflater());
        InputCheckboxGroup.Attributes attributes = config.getAttributes();
        final ArrayList arrayList = new ArrayList();
        Set setR1 = (attributes == null || (prefill = attributes.getPrefill()) == null) ? null : p013kotlin.collections.v.r1(prefill);
        if (attributes == null || (listM = attributes.getOptions()) == null) {
            listM = p013kotlin.collections.v.m();
        }
        for (OptionWithDescription optionWithDescription : listM) {
            InputCheckbox inputCheckbox = new InputCheckbox(optionWithDescription.getValue(), new InputCheckbox.Attributes(Boolean.valueOf(setR1 != null && setR1.contains(optionWithDescription.getValue())), optionWithDescription.getText(), optionWithDescription.getDescriptionText(), attributes != null ? attributes.getHidden() : null, attributes != null ? attributes.getDisabled() : null), config.getStyles());
            InputCheckboxComponent inputCheckboxComponent = new InputCheckboxComponent(inputCheckbox, setR1 != null && setR1.contains(optionWithDescription.getValue()) == r17);
            ri0.i iVarD = ri0.i.d(uiComponentHelper.getLayoutInflater(), jVarC.f108355b, false);
            p013kotlin.jvm.internal.s.j(iVarD, "inflate(...)");
            jVarC.f108355b.addView(r0.e(inputCheckboxComponent, uiComponentHelper, iVarD, inputCheckbox));
            iVarD.f108350b.setTag(optionWithDescription.getValue());
            if (inputCheckboxGroupComponent.getStringSetController().b().contains(optionWithDescription.getValue())) {
                iVarD.f108350b.setChecked(r17);
            }
            MaterialCheckBox checkbox = iVarD.f108350b;
            p013kotlin.jvm.internal.s.j(checkbox, "checkbox");
            arrayList.add(checkbox);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((MaterialCheckBox) it.next()).c(new MaterialCheckBox.b() { // from class: oi0.s0
                @Override // com.google.android.material.checkbox.MaterialCheckBox.b
                public final void a(MaterialCheckBox materialCheckBox, int i11) {
                    u0.d(inputCheckboxGroupComponent, arrayList, materialCheckBox, i11);
                }
            });
        }
        InputCheckbox.InputCheckboxComponentStyle styles = config.getStyles();
        if (styles == null || (errorTextStyle = styles.getErrorTextStyle()) == null) {
            str = null;
        } else {
            TextView checkboxGroupError = jVarC.f108356c;
            p013kotlin.jvm.internal.s.j(checkboxGroupError, "checkboxGroupError");
            str = null;
            ui0.e0.n(checkboxGroupError, errorTextStyle, null, 2, null);
        }
        String label = attributes != null ? attributes.getLabel() : str;
        if (label == null || label.length() == 0) {
            jVarC.f108357d.setVisibility(8);
        } else {
            jVarC.f108357d.setVisibility(0);
            jVarC.f108357d.setText(label);
            uiComponentHelper.d(new wn0.a() { // from class: oi0.t0
                @Override // wn0.a
                public final Object invoke() {
                    return u0.e(config, jVarC);
                }
            });
        }
        jVarC.getRoot().setTag(jVarC);
        LinearLayout root = jVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InputCheckboxGroupComponent inputCheckboxGroupComponent, List list, MaterialCheckBox checkBox, int i11) {
        p013kotlin.jvm.internal.s.k(checkBox, "checkBox");
        f(inputCheckboxGroupComponent, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e(InputCheckboxGroup inputCheckboxGroup, ri0.j jVar) {
        TextBasedComponentStyle textBasedStyle;
        InputCheckbox.InputCheckboxComponentStyle styles = inputCheckboxGroup.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView checkboxGroupLabel = jVar.f108357d;
            p013kotlin.jvm.internal.s.j(checkboxGroupLabel, "checkboxGroupLabel");
            ui0.e0.n(checkboxGroupLabel, textBasedStyle, null, 2, null);
        }
        return jn0.h0.f84049a;
    }

    private static final void f(InputCheckboxGroupComponent inputCheckboxGroupComponent, List<MaterialCheckBox> list) {
        String str;
        pi0.m stringSetController = inputCheckboxGroupComponent.getStringSetController();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MaterialCheckBox materialCheckBox : list) {
            if (materialCheckBox.isChecked()) {
                Object tag = materialCheckBox.getTag();
                p013kotlin.jvm.internal.s.i(tag, "null cannot be cast to non-null type kotlin.String");
                str = (String) tag;
            } else {
                str = null;
            }
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        stringSetController.c(linkedHashSet);
    }
}
