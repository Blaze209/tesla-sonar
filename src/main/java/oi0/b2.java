package oi0;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.OptionWithDescription;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;", "config", "Landroid/widget/LinearLayout;", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b2 {
    public static final LinearLayout f(final InputRadioGroupComponent inputRadioGroupComponent, p5 uiComponentHelper, final InputRadioGroup config) {
        List<OptionWithDescription> listM;
        TextBasedComponentStyle errorTextStyle;
        p013kotlin.jvm.internal.s.k(inputRadioGroupComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.m mVarC = ri0.m.c(uiComponentHelper.getLayoutInflater());
        InputRadioGroup.Attributes attributes = config.getAttributes();
        final ArrayList arrayList = new ArrayList();
        if (attributes == null || (listM = attributes.getOptions()) == null) {
            listM = p013kotlin.collections.v.m();
        }
        for (final OptionWithDescription optionWithDescription : listM) {
            final ri0.b bVarC = ri0.b.c(uiComponentHelper.getLayoutInflater(), mVarC.getRoot(), false);
            TextView radioButtonLabel = bVarC.f108303d;
            p013kotlin.jvm.internal.s.j(radioButtonLabel, "radioButtonLabel");
            pi0.g.d(radioButtonLabel, optionWithDescription.getText());
            String descriptionText = optionWithDescription.getDescriptionText();
            if (descriptionText == null || p013kotlin.text.t.y0(descriptionText)) {
                bVarC.f108302c.setVisibility(8);
            } else {
                bVarC.f108302c.setVisibility(0);
                TextView radioButtonDescription = bVarC.f108302c;
                p013kotlin.jvm.internal.s.j(radioButtonDescription, "radioButtonDescription");
                pi0.g.d(radioButtonDescription, descriptionText);
            }
            uiComponentHelper.d(new wn0.a() { // from class: oi0.w1
                @Override // wn0.a
                public final Object invoke() {
                    return b2.i(config, bVarC);
                }
            });
            bVarC.f108301b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oi0.x1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    b2.j(arrayList, config, optionWithDescription, inputRadioGroupComponent, compoundButton, z11);
                }
            });
            bVarC.getRoot().setOnClickListener(new View.OnClickListener() { // from class: oi0.y1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b2.k(bVarC, view);
                }
            });
            mVarC.f108364b.addView(bVarC.getRoot());
            MaterialRadioButton radioButton = bVarC.f108301b;
            p013kotlin.jvm.internal.s.j(radioButton, "radioButton");
            arrayList.add(radioButton);
            if (p013kotlin.jvm.internal.s.f(inputRadioGroupComponent.getTextController().c(), optionWithDescription.getValue())) {
                bVarC.f108301b.setChecked(true);
            }
        }
        InputRadioGroup.InputRadioGroupComponentStyle styles = config.getStyles();
        if (styles != null && (errorTextStyle = styles.getErrorTextStyle()) != null) {
            TextView radioGroupError = mVarC.f108365c;
            p013kotlin.jvm.internal.s.j(radioGroupError, "radioGroupError");
            ui0.e0.n(radioGroupError, errorTextStyle, null, 2, null);
        }
        String label = attributes != null ? attributes.getLabel() : null;
        if (label == null || label.length() == 0) {
            mVarC.f108366d.setVisibility(8);
        } else {
            mVarC.f108366d.setVisibility(0);
            mVarC.f108366d.setText(label);
            uiComponentHelper.d(new wn0.a() { // from class: oi0.z1
                @Override // wn0.a
                public final Object invoke() {
                    return b2.g(config, mVarC);
                }
            });
        }
        uiComponentHelper.d(new wn0.a() { // from class: oi0.a2
            @Override // wn0.a
            public final Object invoke() {
                return b2.h(config, mVarC);
            }
        });
        mVarC.getRoot().setTag(mVarC);
        LinearLayout root = mVarC.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g(InputRadioGroup inputRadioGroup, ri0.m mVar) {
        TextBasedComponentStyle textBasedStyle;
        InputRadioGroup.InputRadioGroupComponentStyle styles = inputRadioGroup.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView radioGroupLabel = mVar.f108366d;
            p013kotlin.jvm.internal.s.j(radioGroupLabel, "radioGroupLabel");
            ui0.e0.n(radioGroupLabel, textBasedStyle, null, 2, null);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h(InputRadioGroup inputRadioGroup, ri0.m mVar) {
        StyleElements.SizeSet margins;
        InputRadioGroup.InputRadioGroupComponentStyle styles = inputRadioGroup.getStyles();
        if (styles != null && (margins = styles.getMargins()) != null) {
            LinearLayout root = mVar.getRoot();
            p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
            xi0.d.c(root, margins);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i(InputRadioGroup inputRadioGroup, ri0.b bVar) {
        TextBasedComponentStyle descriptionTextStyle;
        TextBasedComponentStyle textBasedStyle;
        InputRadioGroup.InputRadioGroupComponentStyle styles = inputRadioGroup.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView radioButtonLabel = bVar.f108303d;
            p013kotlin.jvm.internal.s.j(radioButtonLabel, "radioButtonLabel");
            ui0.e0.n(radioButtonLabel, textBasedStyle, null, 2, null);
        }
        InputRadioGroup.InputRadioGroupComponentStyle styles2 = inputRadioGroup.getStyles();
        if (styles2 != null && (descriptionTextStyle = styles2.getDescriptionTextStyle()) != null) {
            TextView radioButtonDescription = bVar.f108302c;
            p013kotlin.jvm.internal.s.j(radioButtonDescription, "radioButtonDescription");
            ui0.e0.n(radioButtonDescription, descriptionTextStyle, null, 2, null);
        }
        bVar.f108301b.setButtonTintList(ColorStateList.valueOf(k5.d.l(bVar.f108303d.getCurrentTextColor(), 150)));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(List list, InputRadioGroup inputRadioGroup, OptionWithDescription optionWithDescription, InputRadioGroupComponent inputRadioGroupComponent, CompoundButton button, boolean z11) {
        p013kotlin.jvm.internal.s.k(button, "button");
        if (z11) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!p013kotlin.jvm.internal.s.f((RadioButton) obj, button)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((RadioButton) it.next()).setChecked(false);
            }
            l(inputRadioGroupComponent, inputRadioGroup, optionWithDescription.getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ri0.b bVar, View view) {
        if (bVar.f108301b.isChecked()) {
            return;
        }
        bVar.f108301b.setChecked(true);
    }

    private static final void l(InputRadioGroupComponent inputRadioGroupComponent, InputRadioGroup inputRadioGroup, String str) {
        List<OptionWithDescription> options;
        Object next;
        InputRadioGroup.Attributes attributes = inputRadioGroup.getAttributes();
        String value = null;
        if (attributes != null && (options = attributes.getOptions()) != null) {
            Iterator<T> it = options.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p013kotlin.jvm.internal.s.f(((OptionWithDescription) next).getText(), str));
            OptionWithDescription optionWithDescription = (OptionWithDescription) next;
            if (optionWithDescription != null) {
                value = optionWithDescription.getValue();
            }
        }
        if (value != null) {
            inputRadioGroupComponent.getTextController().a(value);
        }
    }
}
