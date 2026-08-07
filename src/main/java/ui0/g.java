package ui0;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001aE\u0010\t\u001a\u00020\b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\b*\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001aY\u0010\u0017\u001a\u00020\b*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "styles", "", "", "originalStrokeColors", "originalFillColors", "originalBackgroundColors", "Ljn0/h0;", "c", "(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "Landroid/widget/ImageView;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;", "b", "(Landroid/widget/ImageView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "component", "f", "(Landroid/widget/ImageView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "", "newStrokeColor", "newFillColor", "newBackgroundColor", "g", "(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116316a;

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
            f116316a = iArr;
        }
    }

    public static final void b(ImageView imageView, CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle combinedStepImagePreviewComponentStyle) {
        AttributeStyles.RemoteImageJustifyStyle justify;
        StyleElements.Position base;
        StyleElements.PositionType base2;
        float f11;
        StyleElements.SizeSet marginValue;
        p013kotlin.jvm.internal.s.k(imageView, "<this>");
        if (combinedStepImagePreviewComponentStyle != null && (marginValue = combinedStepImagePreviewComponentStyle.getMarginValue()) != null) {
            xi0.d.c(imageView, marginValue);
        }
        xi0.d.b(imageView, combinedStepImagePreviewComponentStyle != null ? combinedStepImagePreviewComponentStyle.getWidthValue() : null);
        xi0.d.a(imageView, combinedStepImagePreviewComponentStyle != null ? combinedStepImagePreviewComponentStyle.getHeightValue() : null);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (combinedStepImagePreviewComponentStyle != null && (justify = combinedStepImagePreviewComponentStyle.getJustify()) != null && (base = justify.getBase()) != null && (base2 = base.getBase()) != null && (layoutParams instanceof ConstraintLayout.b)) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            int i11 = a.f116316a[base2.ordinal()];
            if (i11 == 1) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            } else if (i11 == 2) {
                f11 = 0.5f;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f11 = 1.0f;
            }
            bVar.G = f11;
        }
        imageView.setLayoutParams(layoutParams);
    }

    public static final void c(final ThemeableLottieAnimationView themeableLottieAnimationView, final LocalImageComponentStyle localImageComponentStyle, final String[] originalStrokeColors, final String[] originalFillColors, final String[] originalBackgroundColors) {
        p013kotlin.jvm.internal.s.k(themeableLottieAnimationView, "<this>");
        p013kotlin.jvm.internal.s.k(originalStrokeColors, "originalStrokeColors");
        p013kotlin.jvm.internal.s.k(originalFillColors, "originalFillColors");
        p013kotlin.jvm.internal.s.k(originalBackgroundColors, "originalBackgroundColors");
        if (themeableLottieAnimationView.isLaidOut()) {
            d(themeableLottieAnimationView, localImageComponentStyle, originalStrokeColors, originalFillColors, originalBackgroundColors);
        } else {
            ki0.s.b(themeableLottieAnimationView, new wn0.a() { // from class: ui0.f
                @Override // wn0.a
                public final Object invoke() {
                    return g.e(themeableLottieAnimationView, localImageComponentStyle, originalStrokeColors, originalFillColors, originalBackgroundColors);
                }
            });
        }
    }

    private static final void d(ThemeableLottieAnimationView themeableLottieAnimationView, LocalImageComponentStyle localImageComponentStyle, String[] strArr, String[] strArr2, String[] strArr3) {
        AttributeStyles.LocalImageJustifyStyle justify;
        StyleElements.Position base;
        StyleElements.PositionType base2;
        float f11;
        StyleElements.SizeSet marginValue;
        g(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getStrokeColorValue() : null, localImageComponentStyle != null ? localImageComponentStyle.getFillColorValue() : null, localImageComponentStyle != null ? localImageComponentStyle.getBackgroundColorValue() : null, strArr, strArr2, strArr3);
        if (localImageComponentStyle != null && (marginValue = localImageComponentStyle.getMarginValue()) != null) {
            xi0.d.c(themeableLottieAnimationView, marginValue);
        }
        xi0.d.b(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getWidthValue() : null);
        xi0.d.a(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getHeightValue() : null);
        ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView.getLayoutParams();
        if (localImageComponentStyle != null && (justify = localImageComponentStyle.getJustify()) != null && (base = justify.getBase()) != null && (base2 = base.getBase()) != null && (layoutParams instanceof ConstraintLayout.b)) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            int i11 = a.f116316a[base2.ordinal()];
            if (i11 == 1) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            } else if (i11 == 2) {
                f11 = 0.5f;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f11 = 1.0f;
            }
            bVar.G = f11;
        }
        themeableLottieAnimationView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e(ThemeableLottieAnimationView themeableLottieAnimationView, LocalImageComponentStyle localImageComponentStyle, String[] strArr, String[] strArr2, String[] strArr3) {
        d(themeableLottieAnimationView, localImageComponentStyle, strArr, strArr2, strArr3);
        return h0.f84049a;
    }

    public static final void f(ImageView imageView, RemoteImage component) {
        p013kotlin.jvm.internal.s.k(imageView, "<this>");
        p013kotlin.jvm.internal.s.k(component, "component");
        StyleElements.SizeSet margin = component.getMargin();
        if (margin != null) {
            xi0.d.c(imageView, margin);
        }
        xi0.d.b(imageView, component.getWidth());
        xi0.d.a(imageView, component.getHeight());
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StyleElements.PositionType justification = component.getJustification();
        float f11 = BitmapDescriptorFactory.HUE_RED;
        if (justification != null) {
            if (layoutParams instanceof ConstraintLayout.b) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                int i11 = a.f116316a[justification.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        f11 = 0.5f;
                    } else {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f11 = 1.0f;
                    }
                }
                bVar.G = f11;
            }
        } else if (layoutParams instanceof ConstraintLayout.b) {
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
            Context context = imageView.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            if (yh0.s.b(context, qh0.a.f105517b, null, false, false, 14, null)) {
                f11 = 0.5f;
            }
            bVar2.G = f11;
        }
        imageView.setLayoutParams(layoutParams);
    }

    public static final void g(ThemeableLottieAnimationView themeableLottieAnimationView, Integer num, Integer num2, Integer num3, String[] originalStrokeColors, String[] originalFillColors, String[] originalBackgroundColors) {
        p013kotlin.jvm.internal.s.k(themeableLottieAnimationView, "<this>");
        p013kotlin.jvm.internal.s.k(originalStrokeColors, "originalStrokeColors");
        p013kotlin.jvm.internal.s.k(originalFillColors, "originalFillColors");
        p013kotlin.jvm.internal.s.k(originalBackgroundColors, "originalBackgroundColors");
        if (num != null) {
            int iIntValue = num.intValue();
            for (String str : originalStrokeColors) {
                themeableLottieAnimationView.F(Color.parseColor(str), iIntValue);
            }
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            for (String str2 : originalFillColors) {
                themeableLottieAnimationView.F(Color.parseColor(str2), iIntValue2);
            }
        }
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            for (String str3 : originalBackgroundColors) {
                themeableLottieAnimationView.F(Color.parseColor(str3), iIntValue3);
            }
        }
    }
}
