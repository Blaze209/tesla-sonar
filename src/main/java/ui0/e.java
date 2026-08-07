package ui0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\n\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "styles", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;)V", "Landroid/widget/Button;", "", "isLoading", "shouldStyleWidthAndHeight", "c", "(Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZ)V", "isEnabled", "Landroid/graphics/drawable/GradientDrawable;", "b", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZ)Landroid/graphics/drawable/GradientDrawable;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116308a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f116308a = iArr;
        }
    }

    private static final GradientDrawable b(BaseButtonComponentStyle baseButtonComponentStyle, boolean z11, boolean z12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Double borderWidthValue = baseButtonComponentStyle.getBorderWidthValue();
        int iA = borderWidthValue != null ? (int) yh0.h.a(borderWidthValue.doubleValue()) : 0;
        Integer baseBorderColorValue = baseButtonComponentStyle.getBaseBorderColorValue();
        int iIntValue = baseBorderColorValue != null ? baseBorderColorValue.intValue() : 0;
        Integer activeTextColorValue = baseButtonComponentStyle.getActiveTextColorValue();
        int iIntValue2 = activeTextColorValue != null ? activeTextColorValue.intValue() : iIntValue;
        Integer disabledTextColorValue = baseButtonComponentStyle.getDisabledTextColorValue();
        gradientDrawable.setStroke(iA, new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue2, disabledTextColorValue != null ? disabledTextColorValue.intValue() : iIntValue, iIntValue}));
        Double borderRadiusValue = baseButtonComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            float fA = (float) yh0.h.a(borderRadiusValue.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            p013kotlin.jvm.internal.s.i(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
        }
        Integer baseBackgroundColorValue = baseButtonComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            Integer activeBackgroundColorValue = baseButtonComponentStyle.getActiveBackgroundColorValue();
            int iIntValue3 = activeBackgroundColorValue != null ? activeBackgroundColorValue.intValue() : baseBackgroundColorValue.intValue();
            Integer disabledBackgroundColorValue = baseButtonComponentStyle.getDisabledBackgroundColorValue();
            int iIntValue4 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : baseBackgroundColorValue.intValue();
            new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue3, iIntValue4, baseBackgroundColorValue.intValue()});
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue3, iIntValue4, baseBackgroundColorValue.intValue()}));
        }
        return gradientDrawable;
    }

    public static final void c(final Button button, final BaseButtonComponentStyle styles, final boolean z11, final boolean z12) {
        p013kotlin.jvm.internal.s.k(button, "<this>");
        p013kotlin.jvm.internal.s.k(styles, "styles");
        if (button.isLaidOut()) {
            e(styles, button, z11, z12);
        } else {
            ki0.s.b(button, new wn0.a() { // from class: ui0.d
                @Override // wn0.a
                public final Object invoke() {
                    return e.g(styles, button, z11, z12);
                }
            });
        }
    }

    public static final void d(ButtonWithLoadingIndicator buttonWithLoadingIndicator, BaseButtonComponentStyle styles) {
        p013kotlin.jvm.internal.s.k(buttonWithLoadingIndicator, "<this>");
        p013kotlin.jvm.internal.s.k(styles, "styles");
        f(buttonWithLoadingIndicator.getButton(), styles, false, false, 6, null);
        Integer activeTextColorValue = styles.getActiveTextColorValue();
        if (activeTextColorValue != null) {
            buttonWithLoadingIndicator.getProgressBar().setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{activeTextColorValue.intValue()}));
        }
    }

    private static final void e(BaseButtonComponentStyle baseButtonComponentStyle, Button button, boolean z11, boolean z12) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Integer baseTextColorValue = baseButtonComponentStyle.getBaseTextColorValue();
        if (baseTextColorValue != null) {
            int iIntValue = baseTextColorValue.intValue();
            Integer activeTextColorValue = baseButtonComponentStyle.getActiveTextColorValue();
            int iIntValue2 = activeTextColorValue != null ? activeTextColorValue.intValue() : iIntValue;
            Integer disabledTextColorValue = baseButtonComponentStyle.getDisabledTextColorValue();
            button.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue2, disabledTextColorValue != null ? disabledTextColorValue.intValue() : iIntValue, iIntValue}));
        }
        Double fontSizeValue = baseButtonComponentStyle.getFontSizeValue();
        if (fontSizeValue != null) {
            button.setTextSize((float) fontSizeValue.doubleValue());
        }
        Double letterSpacingValue = baseButtonComponentStyle.getLetterSpacingValue();
        if (letterSpacingValue != null) {
            button.setLetterSpacing((float) (letterSpacingValue.doubleValue() / ((double) button.getTextSize())));
        }
        String fontNameValue = baseButtonComponentStyle.getFontNameValue();
        StyleElements.FontWeight fontWeightValue = baseButtonComponentStyle.getFontWeightValue();
        if (fontWeightValue == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        e0.j(button, fontNameValue, fontWeightValue, null, 4, null);
        Double lineHeightValue = baseButtonComponentStyle.getLineHeightValue();
        if (lineHeightValue != null) {
            double dDoubleValue = lineHeightValue.doubleValue();
            if (Build.VERSION.SDK_INT >= 28) {
                button.setLineHeight((int) yh0.h.a(dDoubleValue));
            }
        }
        button.setBackground(b(baseButtonComponentStyle, button.isEnabled(), z11));
        button.setBackgroundTintList(null);
        float f11 = BitmapDescriptorFactory.HUE_RED;
        button.setElevation(BitmapDescriptorFactory.HUE_RED);
        button.setStateListAnimator(null);
        button.setAllCaps(false);
        Object parent = button.getParent();
        View view = parent instanceof ButtonWithLoadingIndicator ? (View) parent : button;
        StyleElements.SizeSet marginValue = baseButtonComponentStyle.getMarginValue();
        if (marginValue != null) {
            xi0.d.c(button, marginValue);
            if (view instanceof ButtonWithLoadingIndicator) {
                ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
                ProgressBar progressBar = buttonWithLoadingIndicator.getProgressBar();
                StyleElements.Size left = marginValue.getLeft();
                int paddingLeft = (left == null || (dp5 = left.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingLeft() : (int) yh0.h.a(dp5.doubleValue());
                StyleElements.Size top = marginValue.getTop();
                int paddingTop = (top == null || (dp4 = top.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingTop() : (int) yh0.h.a(dp4.doubleValue());
                StyleElements.Size right = marginValue.getRight();
                int paddingRight = (right == null || (dp3 = right.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingRight() : (int) yh0.h.a(dp3.doubleValue());
                StyleElements.Size bottom = marginValue.getBottom();
                progressBar.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp2 = bottom.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingBottom() : (int) yh0.h.a(dp2.doubleValue()));
            }
        }
        StyleElements.SizeSet paddingValue = baseButtonComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            xi0.d.e(button, paddingValue);
        }
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Double widthValue = baseButtonComponentStyle.getWidthValue();
        if (widthValue != null) {
            double dDoubleValue2 = widthValue.doubleValue();
            if (z12) {
                layoutParams.width = bo0.n.j((int) yh0.h.a(dDoubleValue2), measuredWidth);
            }
        }
        Double heightValue = baseButtonComponentStyle.getHeightValue();
        if (heightValue != null) {
            double dDoubleValue3 = heightValue.doubleValue();
            if (z12) {
                layoutParams.height = (int) yh0.h.a(dDoubleValue3);
            }
        }
        if (view instanceof ButtonWithLoadingIndicator) {
            int i11 = layoutParams.height;
            ViewGroup.LayoutParams layoutParams2 = button.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i12 = i11 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams3 = button.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            layoutParams.height = i12 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        }
        StyleElements.PositionType justificationValue = baseButtonComponentStyle.getJustificationValue();
        if (justificationValue != null && (layoutParams instanceof ConstraintLayout.b)) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            int i13 = a.f116308a[justificationValue.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    f11 = 0.5f;
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f11 = 1.0f;
                }
            }
            bVar.G = f11;
        }
        view.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ void f(Button button, BaseButtonComponentStyle baseButtonComponentStyle, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        c(button, baseButtonComponentStyle, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 g(BaseButtonComponentStyle baseButtonComponentStyle, Button button, boolean z11, boolean z12) {
        e(baseButtonComponentStyle, button, z11, z12);
        return h0.f84049a;
    }
}
