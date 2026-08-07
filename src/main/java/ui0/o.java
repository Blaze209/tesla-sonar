package ui0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.n0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)V", "", "bottomBorderWidth", "h", "(Lcom/google/android/material/textfield/TextInputLayout;I)V", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o {
    private static final void h(TextInputLayout textInputLayout, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(i11, textInputLayout.getBoxStrokeColor());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        int i12 = -i11;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        layerDrawable.setLayerInset(0, i12, i12, i12, marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        textInputLayout.setBackground(layerDrawable);
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [T, ui0.h] */
    public static final void i(final TextInputLayout textInputLayout, InputSelectComponentStyle styles) {
        int i11;
        Double dValueOf = Double.valueOf(0.0d);
        p013kotlin.jvm.internal.s.k(textInputLayout, "<this>");
        p013kotlin.jvm.internal.s.k(styles, "styles");
        final n0 n0Var = new n0();
        Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            final int iIntValue = baseBackgroundColorValue.intValue();
            Integer focusedBackgroundColorValue = styles.getFocusedBackgroundColorValue();
            final int iIntValue2 = focusedBackgroundColorValue != null ? focusedBackgroundColorValue.intValue() : iIntValue;
            Integer disabledBackgroundColorValue = styles.getDisabledBackgroundColorValue();
            final int iIntValue3 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : iIntValue;
            Integer errorBackgroundColorValue = styles.getErrorBackgroundColorValue();
            final int iIntValue4 = errorBackgroundColorValue != null ? errorBackgroundColorValue.intValue() : iIntValue;
            textInputLayout.setBoxBackgroundMode(2);
            z.i(textInputLayout, textInputLayout.hasFocus(), iIntValue, iIntValue2, iIntValue3);
            n0Var.f86529a = new wn0.l() { // from class: ui0.h
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return o.n(textInputLayout, iIntValue, iIntValue2, iIntValue3, ((Boolean) obj).booleanValue());
                }
            };
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ui0.i
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    o.o(textInputLayout, iIntValue4, iIntValue, iIntValue2, iIntValue3, view, i12, i13, i14, i15, i16, i17, i18, i19);
                }
            });
        }
        Integer baseBorderColorValue = styles.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int iIntValue5 = baseBorderColorValue.intValue();
            Integer focusedBorderColorValue = styles.getFocusedBorderColorValue();
            int iIntValue6 = focusedBorderColorValue != null ? focusedBorderColorValue.intValue() : iIntValue5;
            Integer disabledBorderColorValue = styles.getDisabledBorderColorValue();
            i11 = -16842910;
            textInputLayout.setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue5, iIntValue6, disabledBorderColorValue != null ? disabledBorderColorValue.intValue() : iIntValue5}));
            Integer errorBorderColorValue = styles.getErrorBorderColorValue();
            if (errorBorderColorValue != null) {
                iIntValue5 = errorBorderColorValue.intValue();
            }
            textInputLayout.setBoxStrokeErrorColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue5, iIntValue5, iIntValue5}));
        } else {
            i11 = -16842910;
        }
        Double topBorderWidthValue = styles.getTopBorderWidthValue();
        if (topBorderWidthValue != null) {
            double dDoubleValue = topBorderWidthValue.doubleValue();
            textInputLayout.setBoxStrokeWidth((int) Math.ceil(yh0.h.a(dDoubleValue)));
            textInputLayout.setBoxStrokeWidthFocused((int) Math.ceil(yh0.h.a(dDoubleValue)));
        }
        if (textInputLayout.getBoxStrokeWidth() == 0) {
            Double bottomBorderWidthValue = styles.getBottomBorderWidthValue();
            if ((bottomBorderWidthValue != null ? bottomBorderWidthValue.doubleValue() : 0.0d) > 0.0d) {
                Double bottomBorderWidthValue2 = styles.getBottomBorderWidthValue();
                h(textInputLayout, (int) Math.ceil(bottomBorderWidthValue2 != null ? yh0.h.a(bottomBorderWidthValue2.doubleValue()) : 0.0d));
            }
        }
        Integer chevronColor = styles.getChevronColor();
        if (chevronColor != null) {
            int iIntValue7 = chevronColor.intValue();
            textInputLayout.setEndIconTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842908}, new int[]{R.attr.state_hovered}, new int[]{R.attr.state_enabled}, new int[]{i11}}, new int[]{iIntValue7, iIntValue7, iIntValue7, iIntValue7, iIntValue7, iIntValue7}));
        }
        Double borderRadiusValue = styles.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double dDoubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout.setBoxCornerRadii((float) yh0.h.a(dDoubleValue2), (float) yh0.h.a(dDoubleValue2), (float) yh0.h.a(dDoubleValue2), (float) yh0.h.a(dDoubleValue2));
        }
        StyleElements.SizeSet inputSelectBoxMargins = styles.getInputSelectBoxMargins();
        if (inputSelectBoxMargins != null) {
            xi0.d.c(textInputLayout, inputSelectBoxMargins);
        }
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            e0.n(editText, styles.getTextBasedStyle(), null, 2, null);
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            xi0.d.c(editText2, new StyleElements.SizeSet(new StyleElements.DPSize(dValueOf), new StyleElements.DPSize(dValueOf), new StyleElements.DPSize(dValueOf), new StyleElements.DPSize(dValueOf)));
        }
        Integer baseTextColor = styles.getBaseTextColor();
        if (baseTextColor != null) {
            int iIntValue8 = baseTextColor.intValue();
            Integer valueFocusedTextColor = styles.getValueFocusedTextColor();
            int iIntValue9 = valueFocusedTextColor != null ? valueFocusedTextColor.intValue() : iIntValue8;
            Integer valueDisabledTextColor = styles.getValueDisabledTextColor();
            int iIntValue10 = valueDisabledTextColor != null ? valueDisabledTextColor.intValue() : iIntValue8;
            Integer valueErrorTextColor = styles.getValueErrorTextColor();
            final int iIntValue11 = valueErrorTextColor != null ? valueErrorTextColor.intValue() : iIntValue8;
            final ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i11}, new int[]{-16842914}}, new int[]{iIntValue8, iIntValue9, iIntValue10, iIntValue8});
            EditText editText3 = textInputLayout.getEditText();
            if (editText3 != null) {
                editText3.setTextColor(colorStateList);
            }
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ui0.j
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    o.p(textInputLayout, iIntValue11, colorStateList, view, i12, i13, i14, i15, i16, i17, i18, i19);
                }
            });
        }
        Integer errorBaseTextColor = styles.getErrorBaseTextColor();
        if (errorBaseTextColor != null) {
            int iIntValue12 = errorBaseTextColor.intValue();
            Integer errorErrorTextColor = styles.getErrorErrorTextColor();
            int iIntValue13 = errorErrorTextColor != null ? errorErrorTextColor.intValue() : iIntValue12;
            Integer errorFocusedTextColor = styles.getErrorFocusedTextColor();
            int iIntValue14 = errorFocusedTextColor != null ? errorFocusedTextColor.intValue() : iIntValue12;
            Integer errorDisabledTextColor = styles.getErrorDisabledTextColor();
            if (errorDisabledTextColor != null) {
                iIntValue12 = errorDisabledTextColor.intValue();
            }
            textInputLayout.setErrorTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i11}, new int[]{-16842914}}, new int[]{iIntValue13, iIntValue14, iIntValue12, iIntValue13}));
        }
        Integer labelBaseTextColor = styles.getLabelBaseTextColor();
        if (labelBaseTextColor != null) {
            int iIntValue15 = labelBaseTextColor.intValue();
            Integer labelFocusedTextColor = styles.getLabelFocusedTextColor();
            int iIntValue16 = labelFocusedTextColor != null ? labelFocusedTextColor.intValue() : iIntValue15;
            Integer labelDisabledTextColor = styles.getLabelDisabledTextColor();
            int iIntValue17 = labelDisabledTextColor != null ? labelDisabledTextColor.intValue() : iIntValue15;
            Integer labelErrorTextColor = styles.getLabelErrorTextColor();
            int iIntValue18 = labelErrorTextColor != null ? labelErrorTextColor.intValue() : iIntValue15;
            final ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i11}, new int[]{-16842914}}, new int[]{iIntValue15, iIntValue16, iIntValue17, iIntValue15});
            final ColorStateList colorStateList3 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i11}, new int[]{-16842914}}, new int[]{iIntValue18, iIntValue18, iIntValue18, iIntValue18});
            textInputLayout.setDefaultHintTextColor(colorStateList2);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ui0.k
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    o.j(textInputLayout, colorStateList3, colorStateList2, view, i12, i13, i14, i15, i16, i17, i18, i19);
                }
            });
        }
        Integer placeholderBaseTextColor = styles.getPlaceholderBaseTextColor();
        if (placeholderBaseTextColor != null) {
            int iIntValue19 = placeholderBaseTextColor.intValue();
            Integer placeholderFocusedTextColor = styles.getPlaceholderFocusedTextColor();
            int iIntValue20 = placeholderFocusedTextColor != null ? placeholderFocusedTextColor.intValue() : iIntValue19;
            Integer placeholderErrorTextColor = styles.getPlaceholderErrorTextColor();
            int iIntValue21 = placeholderErrorTextColor != null ? placeholderErrorTextColor.intValue() : iIntValue19;
            Integer placeholderDisabledTextColor = styles.getPlaceholderDisabledTextColor();
            final ColorStateList colorStateList4 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i11}, new int[]{-16842914}}, new int[]{iIntValue19, iIntValue20, placeholderDisabledTextColor != null ? placeholderDisabledTextColor.intValue() : iIntValue19, iIntValue19});
            final ColorStateList colorStateList5 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{i11}, new int[]{-16842914}}, new int[]{iIntValue21, iIntValue21, iIntValue21, iIntValue21});
            textInputLayout.setPlaceholderTextColor(colorStateList4);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ui0.l
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    o.k(textInputLayout, colorStateList5, colorStateList4, view, i12, i13, i14, i15, i16, i17, i18, i19);
                }
            });
        }
        EditText editText4 = textInputLayout.getEditText();
        if (editText4 != null) {
            editText4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ui0.m
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    o.l(textInputLayout, n0Var, view, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !p013kotlin.text.t.K1(error)) {
            textInputLayout.setDefaultHintTextColor(colorStateList2);
        } else {
            textInputLayout.setDefaultHintTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !p013kotlin.text.t.K1(error)) {
            textInputLayout.setPlaceholderTextColor(colorStateList2);
        } else {
            textInputLayout.setPlaceholderTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(TextInputLayout textInputLayout, final n0 n0Var, View view, final boolean z11) {
        textInputLayout.post(new Runnable() { // from class: ui0.n
            @Override // java.lang.Runnable
            public final void run() {
                o.m(n0Var, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(n0 n0Var, boolean z11) {
        wn0.l lVar = (wn0.l) n0Var.f86529a;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 n(TextInputLayout textInputLayout, int i11, int i12, int i13, boolean z11) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !p013kotlin.text.t.K1(error)) {
            z.i(textInputLayout, z11, i11, i12, i13);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(TextInputLayout textInputLayout, int i11, int i12, int i13, int i14, View view, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !p013kotlin.text.t.K1(error)) {
            z.i(textInputLayout, textInputLayout.hasFocus(), i12, i13, i14);
        } else {
            textInputLayout.setBoxBackgroundColor(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(TextInputLayout textInputLayout, int i11, ColorStateList colorStateList, View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !p013kotlin.text.t.K1(error)) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setTextColor(colorStateList);
                return;
            }
            return;
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTextColor(i11);
        }
    }
}
