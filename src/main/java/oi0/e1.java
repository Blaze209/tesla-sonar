package oi0;

import android.graphics.drawable.ColorDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "Loi0/p5;", "uiComponentHelper", "Lpi0/f;", "dateController", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;Loi0/p5;Lpi0/f;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;)Landroidx/constraintlayout/widget/ConstraintLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e1 {
    public static final ConstraintLayout b(InputDateComponent inputDateComponent, p5 uiComponentHelper, pi0.f dateController, InputDate config) {
        AttributeStyles.DateSelectBackgroundColorStyle backgroundColor;
        Integer inputSelectBackgroundColor;
        InputSelectComponentStyle inputSelectStyle;
        p013kotlin.jvm.internal.s.k(inputDateComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(dateController, "dateController");
        p013kotlin.jvm.internal.s.k(config, "config");
        final ri0.f fVarC = ri0.f.c(uiComponentHelper.getLayoutInflater());
        final InputDate.InputDateComponentStyle styles = config.getStyles();
        InputDate.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            fVarC.f108334b.setText(attributes.getLabel());
            List<String> textMonths = attributes.getTextMonths();
            if (textMonths == null) {
                textMonths = p013kotlin.collections.v.m();
            }
            ni0.a aVar = new ni0.a(uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String(), mi0.f.f92216g, textMonths, (styles == null || (inputSelectStyle = styles.getInputSelectStyle()) == null) ? null : inputSelectStyle.getTextBasedStyle());
            a30.t tVarD = dateController.getMonthController();
            AutoCompleteTextView monthEditText = fVarC.f108339g;
            p013kotlin.jvm.internal.s.j(monthEditText, "monthEditText");
            a30.u.b(tVarD, monthEditText);
            fVarC.f108339g.setAdapter(aVar);
            if (styles != null && (backgroundColor = styles.getBackgroundColor()) != null && (inputSelectBackgroundColor = backgroundColor.getInputSelectBackgroundColor()) != null) {
                fVarC.f108339g.setDropDownBackgroundDrawable(new ColorDrawable(inputSelectBackgroundColor.intValue()));
            }
            fVarC.f108335c.setHint(attributes.getPlaceholderDay());
            a30.t tVarC = dateController.getDayController();
            TextInputEditText dayEditText = fVarC.f108336d;
            p013kotlin.jvm.internal.s.j(dayEditText, "dayEditText");
            a30.u.b(tVarC, dayEditText);
            fVarC.f108340h.setHint(attributes.getPlaceholderYear());
            a30.t tVarG = dateController.getYearController();
            TextInputEditText yearEditText = fVarC.f108341i;
            p013kotlin.jvm.internal.s.j(yearEditText, "yearEditText");
            a30.u.b(tVarG, yearEditText);
        }
        uiComponentHelper.d(new wn0.a() { // from class: oi0.d1
            @Override // wn0.a
            public final Object invoke() {
                return e1.d(styles, fVarC);
            }
        });
        fVarC.getRoot().setTag(fVarC);
        ConstraintLayout constraintLayoutB = fVarC.getRoot();
        p013kotlin.jvm.internal.s.j(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    public static /* synthetic */ ConstraintLayout c(InputDateComponent inputDateComponent, p5 p5Var, pi0.f fVar, InputDate inputDate, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fVar = inputDateComponent.getDateController();
        }
        return b(inputDateComponent, p5Var, fVar, inputDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(InputDate.InputDateComponentStyle inputDateComponentStyle, ri0.f fVar) {
        InputTextBasedComponentStyle inputTextStyle;
        InputTextBasedComponentStyle inputTextStyle2;
        InputSelectComponentStyle inputSelectStyle;
        InputSelectComponentStyle inputSelectStyle2;
        TextBasedComponentStyle errorTextStyle;
        InputSelectComponentStyle inputSelectStyle3;
        TextBasedComponentStyle labelStyle;
        AttributeStyles.InputMarginStyle margin;
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        if (inputDateComponentStyle != null && (margin = inputDateComponentStyle.getMargin()) != null && (base = margin.getBase()) != null && (base2 = base.getBase()) != null) {
            ConstraintLayout constraintLayoutB = fVar.getRoot();
            p013kotlin.jvm.internal.s.j(constraintLayoutB, "getRoot(...)");
            xi0.d.c(constraintLayoutB, base2);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle3 = inputDateComponentStyle.getInputSelectStyle()) != null && (labelStyle = inputSelectStyle3.getLabelStyle()) != null) {
            TextView dateLabel = fVar.f108334b;
            p013kotlin.jvm.internal.s.j(dateLabel, "dateLabel");
            ui0.e0.n(dateLabel, labelStyle, null, 2, null);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle2 = inputDateComponentStyle.getInputSelectStyle()) != null && (errorTextStyle = inputSelectStyle2.getErrorTextStyle()) != null) {
            TextView errorLabel = fVar.f108337e;
            p013kotlin.jvm.internal.s.j(errorLabel, "errorLabel");
            ui0.e0.n(errorLabel, errorTextStyle, null, 2, null);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle = inputDateComponentStyle.getInputSelectStyle()) != null) {
            TextInputLayout month = fVar.f108338f;
            p013kotlin.jvm.internal.s.j(month, "month");
            ui0.o.i(month, inputSelectStyle);
        }
        if (inputDateComponentStyle != null && (inputTextStyle2 = inputDateComponentStyle.getInputTextStyle()) != null) {
            TextInputLayout day = fVar.f108335c;
            p013kotlin.jvm.internal.s.j(day, "day");
            ui0.z.k(day, inputTextStyle2);
        }
        if (inputDateComponentStyle != null && (inputTextStyle = inputDateComponentStyle.getInputTextStyle()) != null) {
            TextInputLayout year = fVar.f108340h;
            p013kotlin.jvm.internal.s.j(year, "year");
            ui0.z.k(year, inputTextStyle);
        }
        return jn0.h0.f84049a;
    }
}
