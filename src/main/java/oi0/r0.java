package oi0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", DateTokenConverter.CONVERTER_KEY, "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lri0/i;", "binding", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;Loi0/p5;Lri0/i;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r0 {
    public static final ConstraintLayout d(InputCheckboxComponent inputCheckboxComponent, p5 uiComponentHelper, InputCheckbox config) {
        p013kotlin.jvm.internal.s.k(inputCheckboxComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        ri0.i iVarC = ri0.i.c(uiComponentHelper.getLayoutInflater());
        p013kotlin.jvm.internal.s.j(iVarC, "inflate(...)");
        return e(inputCheckboxComponent, uiComponentHelper, iVarC, config);
    }

    public static final ConstraintLayout e(final InputCheckboxComponent inputCheckboxComponent, p5 uiComponentHelper, final ri0.i binding, final InputCheckbox config) {
        AttributeStyles.TextBasedTextColorStyle textColorHighlight;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        Integer value;
        p013kotlin.jvm.internal.s.k(inputCheckboxComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(binding, "binding");
        p013kotlin.jvm.internal.s.k(config, "config");
        Context context = uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String();
        binding.f108350b.setChecked(inputCheckboxComponent.getTwoStateViewController().b());
        binding.f108350b.setClickable(false);
        binding.f108350b.setFocusable(false);
        InputCheckbox.Attributes attributes = config.getAttributes();
        String label = attributes != null ? attributes.getLabel() : null;
        if (label == null || p013kotlin.text.t.y0(label)) {
            binding.f108353e.setVisibility(8);
        } else {
            binding.f108353e.setVisibility(0);
            TextView checkboxLabel = binding.f108353e;
            p013kotlin.jvm.internal.s.j(checkboxLabel, "checkboxLabel");
            pi0.g.d(checkboxLabel, label);
        }
        InputCheckbox.Attributes attributes2 = config.getAttributes();
        String descriptionText = attributes2 != null ? attributes2.getDescriptionText() : null;
        if (descriptionText == null || p013kotlin.text.t.y0(descriptionText)) {
            binding.f108351c.setVisibility(8);
        } else {
            binding.f108351c.setVisibility(0);
            TextView checkboxDescription = binding.f108351c;
            p013kotlin.jvm.internal.s.j(checkboxDescription, "checkboxDescription");
            pi0.g.d(checkboxDescription, descriptionText);
        }
        binding.f108350b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: oi0.o0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                r0.f(inputCheckboxComponent, compoundButton, z11);
            }
        });
        binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: oi0.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r0.g(binding, view);
            }
        });
        InputCheckbox.InputCheckboxComponentStyle styles = config.getStyles();
        if (styles != null && (textColorHighlight = styles.getTextColorHighlight()) != null && (base = textColorHighlight.getBase()) != null && (base2 = base.getBase()) != null && (value = base2.getValue()) != null) {
            binding.f108350b.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{k5.d.l(yh0.s.d(context, zs.c.f128587q, null, false, 6, null), (int) (j5.h.g(context.getResources(), zs.e.P) * 255)), yh0.s.d(context, zs.c.f128587q, null, false, 6, null), value.intValue()}));
        }
        uiComponentHelper.d(new wn0.a() { // from class: oi0.q0
            @Override // wn0.a
            public final Object invoke() {
                return r0.h(config, binding);
            }
        });
        binding.getRoot().setTag(binding);
        ConstraintLayout root = binding.getRoot();
        p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InputCheckboxComponent inputCheckboxComponent, CompoundButton compoundButton, boolean z11) {
        p013kotlin.jvm.internal.s.k(compoundButton, "<unused var>");
        inputCheckboxComponent.getTwoStateViewController().c(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ri0.i iVar, View view) {
        iVar.f108350b.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h(InputCheckbox inputCheckbox, ri0.i iVar) {
        TextBasedComponentStyle errorTextStyle;
        TextBasedComponentStyle descriptionTextStyle;
        TextBasedComponentStyle textBasedStyle;
        InputCheckbox.InputCheckboxComponentStyle styles = inputCheckbox.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView checkboxLabel = iVar.f108353e;
            p013kotlin.jvm.internal.s.j(checkboxLabel, "checkboxLabel");
            ui0.e0.n(checkboxLabel, textBasedStyle, null, 2, null);
        }
        InputCheckbox.InputCheckboxComponentStyle styles2 = inputCheckbox.getStyles();
        if (styles2 != null && (descriptionTextStyle = styles2.getDescriptionTextStyle()) != null) {
            TextView checkboxDescription = iVar.f108351c;
            p013kotlin.jvm.internal.s.j(checkboxDescription, "checkboxDescription");
            ui0.e0.n(checkboxDescription, descriptionTextStyle, null, 2, null);
        }
        InputCheckbox.InputCheckboxComponentStyle styles3 = inputCheckbox.getStyles();
        if (styles3 != null && (errorTextStyle = styles3.getErrorTextStyle()) != null) {
            TextView checkboxError = iVar.f108352d;
            p013kotlin.jvm.internal.s.j(checkboxError, "checkboxError");
            ui0.e0.n(checkboxError, errorTextStyle, null, 2, null);
        }
        TextView checkboxLabel2 = iVar.f108353e;
        p013kotlin.jvm.internal.s.j(checkboxLabel2, "checkboxLabel");
        ViewGroup.LayoutParams layoutParams = checkboxLabel2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        TextView checkboxLabel3 = iVar.f108353e;
        p013kotlin.jvm.internal.s.j(checkboxLabel3, "checkboxLabel");
        int iA = ki0.p.a(checkboxLabel3);
        TextView checkboxDescription2 = iVar.f108351c;
        p013kotlin.jvm.internal.s.j(checkboxDescription2, "checkboxDescription");
        int iA2 = iA + ki0.p.a(checkboxDescription2);
        if (iA2 != 0) {
            if (iA2 != 1) {
                ((ViewGroup.MarginLayoutParams) bVar).topMargin = (int) yh0.h.a(4.0d);
            } else {
                ((ViewGroup.MarginLayoutParams) bVar).topMargin = (int) yh0.h.a(0.0d);
            }
        }
        checkboxLabel2.setLayoutParams(bVar);
        return jn0.h0.f84049a;
    }
}
