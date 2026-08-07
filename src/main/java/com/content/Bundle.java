package com.content;

import android.content.Context;
import android.graphics.Color;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.content.utils.PaymentSheetAppearanceException;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.paymentsheet.y;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import p013kotlin.text.t;

/* JADX INFO: renamed from: com.reactnativestripesdk.s0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u001a\u001f\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010$\u001a)\u0010'\u001a\u00020%2\b\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(\u001a#\u0010)\u001a\u0004\u0018\u00010%2\b\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010*\u001a5\u0010+\u001a\u0004\u0018\u00010\r2\b\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroid/os/Bundle;", "userParams", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/paymentsheet/y$b;", "b", "(Landroid/os/Bundle;Landroid/content/Context;)Lcom/stripe/android/paymentsheet/y$b;", "fontParams", "Lcom/stripe/android/paymentsheet/y$u;", "f", "(Landroid/os/Bundle;Landroid/content/Context;)Lcom/stripe/android/paymentsheet/y$u;", "", "hexString", "", "default", "g", "(Ljava/lang/String;I)I", "colorParams", "Lcom/stripe/android/paymentsheet/y$f;", "a", "(Landroid/os/Bundle;Lcom/stripe/android/paymentsheet/y$f;)Lcom/stripe/android/paymentsheet/y$f;", "shapeParams", "Lcom/stripe/android/paymentsheet/y$t;", "e", "(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/y$t;", "params", "Lcom/stripe/android/paymentsheet/y$p;", "c", "(Landroid/os/Bundle;Landroid/content/Context;)Lcom/stripe/android/paymentsheet/y$p;", "Lcom/stripe/android/paymentsheet/y$q;", DateTokenConverter.CONVERTER_KEY, "(Landroid/os/Bundle;Lcom/stripe/android/paymentsheet/y$q;)Lcom/stripe/android/paymentsheet/y$q;", "bundle", Action.KEY_ATTRIBUTE, "", "h", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Double;", "", "defaultValue", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/os/Bundle;Ljava/lang/String;F)F", "j", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Float;", "k", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;Landroid/content/Context;)Ljava/lang/Integer;", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Bundle {
    private static final y.Colors a(android.os.Bundle bundle, y.Colors colors) {
        return bundle == null ? colors : colors.c(g(bundle.getString("primary"), colors.getPrimary()), g(bundle.getString(AppStateModule.APP_STATE_BACKGROUND), colors.getSurface()), g(bundle.getString("componentBackground"), colors.getComponent()), g(bundle.getString("componentBorder"), colors.getComponentBorder()), g(bundle.getString("componentDivider"), colors.getComponentDivider()), g(bundle.getString("componentText"), colors.getOnComponent()), g(bundle.getString("primaryText"), colors.getOnSurface()), g(bundle.getString("secondaryText"), colors.getSubtitle()), g(bundle.getString("placeholderText"), colors.getPlaceholderText()), g(bundle.getString("icon"), colors.getAppBarIcon()), g(bundle.getString(AnalyticsAttribute.Error), colors.getError()));
    }

    public static final y.Appearance b(android.os.Bundle bundle, Context context) throws PaymentSheetAppearanceException {
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        s.k(context, "context");
        android.os.Bundle bundle4 = bundle != null ? bundle.getBundle("colors") : null;
        if (bundle4 == null || (bundle2 = bundle4.getBundle("light")) == null) {
            bundle2 = bundle4;
        }
        if (bundle4 != null && (bundle3 = bundle4.getBundle("dark")) != null) {
            bundle4 = bundle3;
        }
        y.Typography typographyF = f(bundle != null ? bundle.getBundle("font") : null, context);
        y.Colors.Companion companion = y.Colors.INSTANCE;
        return new y.Appearance(a(bundle2, companion.b()), a(bundle4, companion.a()), e(bundle != null ? bundle.getBundle("shapes") : null), typographyF, c(bundle != null ? bundle.getBundle("primaryButton") : null, context));
    }

    private static final y.PrimaryButton c(android.os.Bundle bundle, Context context) throws PaymentSheetAppearanceException {
        if (bundle == null) {
            return new y.PrimaryButton(null, null, null, null, 15, null);
        }
        android.os.Bundle bundle2 = bundle.getBundle("font");
        if (bundle2 == null) {
            bundle2 = android.os.Bundle.EMPTY;
        }
        android.os.Bundle bundle3 = bundle.getBundle("shapes");
        if (bundle3 == null) {
            bundle3 = android.os.Bundle.EMPTY;
        }
        android.os.Bundle bundle4 = bundle.getBundle("colors");
        if (bundle4 == null) {
            bundle4 = android.os.Bundle.EMPTY;
        }
        android.os.Bundle bundle5 = bundle4.getBundle("light");
        if (bundle5 == null) {
            bundle5 = bundle4;
        }
        android.os.Bundle bundle6 = bundle4.getBundle("dark");
        if (bundle6 != null) {
            bundle4 = bundle6;
        }
        s.h(bundle5);
        y.PrimaryButtonColors.Companion companion = y.PrimaryButtonColors.INSTANCE;
        y.PrimaryButtonColors primaryButtonColorsD = d(bundle5, companion.b());
        s.h(bundle4);
        return new y.PrimaryButton(primaryButtonColorsD, d(bundle4, companion.a()), new y.PrimaryButtonShape(j(bundle3, Snapshot.BORDER_RADIUS), j(bundle3, "borderWidth")), new y.PrimaryButtonTypography(k(bundle2, "family", null, context), null, 2, null));
    }

    private static final y.PrimaryButtonColors d(android.os.Bundle bundle, y.PrimaryButtonColors primaryButtonColors) throws PaymentSheetAppearanceException {
        Integer numValueOf;
        String string;
        String strV;
        String string2 = bundle.getString(AppStateModule.APP_STATE_BACKGROUND);
        if (string2 == null || (string = t.F1(string2).toString()) == null || (strV = t.V(string, "#", "", false, 4, null)) == null) {
            numValueOf = null;
        } else {
            if (strV.length() != 6 && strV.length() != 8) {
                throw new PaymentSheetAppearanceException("Failed to set Payment Sheet appearance. Expected hex string of length 6 or 8, but received: " + strV);
            }
            numValueOf = Integer.valueOf(Color.parseColor("#" + strV));
        }
        return new y.PrimaryButtonColors(numValueOf, g(bundle.getString("text"), primaryButtonColors.getOnBackground()), g(bundle.getString("border"), primaryButtonColors.getBorder()));
    }

    private static final y.Shapes e(android.os.Bundle bundle) {
        y.Shapes.Companion companion = y.Shapes.INSTANCE;
        return companion.a().b(i(bundle, Snapshot.BORDER_RADIUS, companion.a().getCornerRadiusDp()), i(bundle, "borderWidth", companion.a().getBorderStrokeWidthDp()));
    }

    private static final y.Typography f(android.os.Bundle bundle, Context context) throws PaymentSheetAppearanceException {
        Double dH = h(bundle, "scale");
        y.Typography.Companion companion = y.Typography.INSTANCE;
        return companion.a().b(dH != null ? (float) dH.doubleValue() : companion.a().getSizeScaleFactor(), k(bundle, "family", companion.a().getFontResId(), context));
    }

    private static final int g(String str, int i11) throws PaymentSheetAppearanceException {
        String string;
        String strV;
        if (str == null || (string = t.F1(str).toString()) == null || (strV = t.V(string, "#", "", false, 4, null)) == null) {
            return i11;
        }
        if (strV.length() == 6 || strV.length() == 8) {
            return Color.parseColor("#" + strV);
        }
        throw new PaymentSheetAppearanceException("Failed to set Payment Sheet appearance. Expected hex string of length 6 or 8, but received: " + strV);
    }

    private static final Double h(android.os.Bundle bundle, String str) {
        if (bundle == null || !bundle.containsKey(str)) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Integer) {
            return Double.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Number) obj).floatValue());
        }
        return null;
    }

    private static final float i(android.os.Bundle bundle, String str, float f11) {
        if (bundle != null && bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj instanceof Float) {
                return ((Number) obj).floatValue();
            }
            if (obj instanceof Integer) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof Double) {
                return (float) ((Number) obj).doubleValue();
            }
        }
        return f11;
    }

    private static final Float j(android.os.Bundle bundle, String str) {
        if (bundle == null || !bundle.containsKey(str)) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Integer) {
            return Float.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Double) {
            return Float.valueOf((float) ((Number) obj).doubleValue());
        }
        return null;
    }

    private static final Integer k(android.os.Bundle bundle, String str, Integer num, Context context) throws PaymentSheetAppearanceException {
        if (bundle == null || !bundle.containsKey(str)) {
            return num;
        }
        String string = bundle.getString(str);
        if (string == null) {
            throw new PaymentSheetAppearanceException("Encountered an error when setting a custom font: expected String for font." + str + ", but received null.");
        }
        if (new q("[^a-z0-9]").b(string)) {
            throw new PaymentSheetAppearanceException("Encountered an error when setting a custom font: appearance.font." + str + " should only contain lowercase alphanumeric characters on Android, but received '" + string + "'. This value must match the filename in android/app/src/main/res/font");
        }
        int identifier = context.getResources().getIdentifier(string, "font", context.getPackageName());
        if (identifier != 0) {
            return Integer.valueOf(identifier);
        }
        throw new PaymentSheetAppearanceException("Encountered an error when setting a custom font: Failed to find font: " + string);
    }
}
