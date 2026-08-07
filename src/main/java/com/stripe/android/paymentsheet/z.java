package com.stripe.android.paymentsheet;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import f90.PrimaryButtonColors;
import f90.PrimaryButtonShape;
import f90.PrimaryButtonStyle;
import f90.PrimaryButtonTypography;
import f90.StripeColors;
import f90.StripeTypography;
import k3.r1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0001*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/y$h;", "Ljn0/h0;", "e", "(Lcom/stripe/android/paymentsheet/y$h;)V", "other", "", "a", "(Lcom/stripe/android/paymentsheet/y$h;Lcom/stripe/android/paymentsheet/y$h;)Z", "Lcom/stripe/android/paymentsheet/y$b;", "b", "(Lcom/stripe/android/paymentsheet/y$b;)V", "Lcom/stripe/android/paymentsheet/g0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/y$h;)Lcom/stripe/android/paymentsheet/g0;", "Lcom/stripe/android/paymentsheet/y$l;", "Lcom/stripe/android/paymentsheet/g0$a;", "c", "(Lcom/stripe/android/paymentsheet/y$l;)Lcom/stripe/android/paymentsheet/g0$a;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class z {
    public static final boolean a(y.Configuration configuration, y.Configuration other) {
        p013kotlin.jvm.internal.s.k(configuration, "<this>");
        p013kotlin.jvm.internal.s.k(other, "other");
        return !p013kotlin.jvm.internal.s.f(d(configuration), d(other));
    }

    public static final void b(y.Appearance appearance) {
        long jK;
        p013kotlin.jvm.internal.s.k(appearance, "<this>");
        f90.l lVar = f90.l.f64654a;
        f90.m mVar = f90.m.f64661a;
        StripeColors stripeColorsC = mVar.c();
        lVar.f(stripeColorsC.a((32 & 1) != 0 ? stripeColorsC.component : r1.b(appearance.getColorsLight().getComponent()), (32 & 2) != 0 ? stripeColorsC.componentBorder : r1.b(appearance.getColorsLight().getComponentBorder()), (32 & 4) != 0 ? stripeColorsC.componentDivider : r1.b(appearance.getColorsLight().getComponentDivider()), (32 & 8) != 0 ? stripeColorsC.onComponent : r1.b(appearance.getColorsLight().getOnComponent()), (32 & 16) != 0 ? stripeColorsC.subtitle : r1.b(appearance.getColorsLight().getSubtitle()), (32 & 32) != 0 ? stripeColorsC.textCursor : 0L, (32 & 64) != 0 ? stripeColorsC.placeholderText : r1.b(appearance.getColorsLight().getPlaceholderText()), (32 & 128) != 0 ? stripeColorsC.appBarIcon : r1.b(appearance.getColorsLight().getAppBarIcon()), (32 & 256) != 0 ? stripeColorsC.materialColors : p009i2.s.h(r1.b(appearance.getColorsLight().getPrimary()), 0L, 0L, 0L, 0L, r1.b(appearance.getColorsLight().getSurface()), r1.b(appearance.getColorsLight().getError()), 0L, 0L, 0L, r1.b(appearance.getColorsLight().getOnSurface()), 0L, 2974, null)));
        StripeColors stripeColorsB = mVar.b();
        lVar.e(stripeColorsB.a((32 & 1) != 0 ? stripeColorsB.component : r1.b(appearance.getColorsDark().getComponent()), (32 & 2) != 0 ? stripeColorsB.componentBorder : r1.b(appearance.getColorsDark().getComponentBorder()), (32 & 4) != 0 ? stripeColorsB.componentDivider : r1.b(appearance.getColorsDark().getComponentDivider()), (32 & 8) != 0 ? stripeColorsB.onComponent : r1.b(appearance.getColorsDark().getOnComponent()), (32 & 16) != 0 ? stripeColorsB.subtitle : r1.b(appearance.getColorsDark().getSubtitle()), (32 & 32) != 0 ? stripeColorsB.textCursor : 0L, (32 & 64) != 0 ? stripeColorsB.placeholderText : r1.b(appearance.getColorsDark().getPlaceholderText()), (32 & 128) != 0 ? stripeColorsB.appBarIcon : r1.b(appearance.getColorsDark().getAppBarIcon()), (32 & 256) != 0 ? stripeColorsB.materialColors : p009i2.s.d(r1.b(appearance.getColorsDark().getPrimary()), 0L, 0L, 0L, 0L, r1.b(appearance.getColorsDark().getSurface()), r1.b(appearance.getColorsDark().getError()), 0L, 0L, 0L, r1.b(appearance.getColorsDark().getOnSurface()), 0L, 2974, null)));
        lVar.h(mVar.e().a(appearance.getShapes().getCornerRadiusDp(), appearance.getShapes().getBorderStrokeWidthDp()));
        lVar.i(StripeTypography.b(mVar.f(), 0, 0, 0, appearance.getTypography().getSizeScaleFactor(), 0L, 0L, 0L, 0L, 0L, 0L, appearance.getTypography().getFontResId(), null, null, null, null, null, null, null, 261111, null));
        PrimaryButtonStyle primaryButtonStyleD = mVar.d();
        Integer background = appearance.getPrimaryButton().getColorsLight().getBackground();
        PrimaryButtonColors primaryButtonColors = new PrimaryButtonColors(r1.b(background != null ? background.intValue() : appearance.getColorsLight().getPrimary()), r1.b(appearance.getPrimaryButton().getColorsLight().getOnBackground()), r1.b(appearance.getPrimaryButton().getColorsLight().getBorder()), r1.b(appearance.getPrimaryButton().getColorsLight().getSuccessBackgroundColor()), r1.b(appearance.getPrimaryButton().getColorsLight().getOnSuccessBackgroundColor()), null);
        Integer background2 = appearance.getPrimaryButton().getColorsDark().getBackground();
        PrimaryButtonColors primaryButtonColors2 = new PrimaryButtonColors(r1.b(background2 != null ? background2.intValue() : appearance.getColorsDark().getPrimary()), r1.b(appearance.getPrimaryButton().getColorsDark().getOnBackground()), r1.b(appearance.getPrimaryButton().getColorsDark().getBorder()), r1.b(appearance.getPrimaryButton().getColorsDark().getSuccessBackgroundColor()), r1.b(appearance.getPrimaryButton().getColorsDark().getOnSuccessBackgroundColor()), null);
        Float cornerRadiusDp = appearance.getPrimaryButton().getShape().getCornerRadiusDp();
        float fFloatValue = cornerRadiusDp != null ? cornerRadiusDp.floatValue() : appearance.getShapes().getCornerRadiusDp();
        Float borderStrokeWidthDp = appearance.getPrimaryButton().getShape().getBorderStrokeWidthDp();
        PrimaryButtonShape primaryButtonShape = new PrimaryButtonShape(fFloatValue, borderStrokeWidthDp != null ? borderStrokeWidthDp.floatValue() : appearance.getShapes().getBorderStrokeWidthDp());
        Integer fontResId = appearance.getPrimaryButton().getTypography().getFontResId();
        if (fontResId == null) {
            fontResId = appearance.getTypography().getFontResId();
        }
        Float fontSizeSp = appearance.getPrimaryButton().getTypography().getFontSizeSp();
        if (fontSizeSp != null) {
            jK = w4.w.g(fontSizeSp.floatValue());
        } else {
            long largeFontSize = mVar.f().getLargeFontSize();
            float sizeScaleFactor = appearance.getTypography().getSizeScaleFactor();
            w4.w.b(largeFontSize);
            jK = w4.w.k(w4.v.f(largeFontSize), w4.v.h(largeFontSize) * sizeScaleFactor);
        }
        lVar.g(primaryButtonStyleD.a(primaryButtonColors, primaryButtonColors2, primaryButtonShape, new PrimaryButtonTypography(fontResId, jK, null)));
    }

    private static final VolatilePaymentSheetConfiguration.GooglePayConfiguration c(y.GooglePayConfiguration googlePayConfiguration) {
        return new VolatilePaymentSheetConfiguration.GooglePayConfiguration(googlePayConfiguration.getEnvironment(), googlePayConfiguration.getCountryCode(), googlePayConfiguration.getCurrencyCode());
    }

    private static final VolatilePaymentSheetConfiguration d(y.Configuration configuration) {
        y.CustomerConfiguration customer = configuration.getCustomer();
        y.GooglePayConfiguration googlePay = configuration.getGooglePay();
        return new VolatilePaymentSheetConfiguration(customer, googlePay != null ? c(googlePay) : null, configuration.getDefaultBillingDetails(), configuration.getShippingDetails(), configuration.getAllowsDelayedPaymentMethods(), configuration.getAllowsPaymentMethodsRequiringShippingAddress(), configuration.getBillingDetailsCollectionConfiguration(), configuration.q(), configuration.getAllowsRemovalOfLastSavedPaymentMethod());
    }

    public static final void e(y.Configuration configuration) {
        y.i accessType;
        String id2;
        p013kotlin.jvm.internal.s.k(configuration, "<this>");
        if (p013kotlin.text.t.y0(configuration.getMerchantDisplayName())) {
            throw new IllegalArgumentException("When a Configuration is passed to PaymentSheet, the Merchant display name cannot be an empty string.");
        }
        y.CustomerConfiguration customer = configuration.getCustomer();
        if (customer != null && (id2 = customer.getId()) != null && p013kotlin.text.t.y0(id2)) {
            throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the Customer ID cannot be an empty string.");
        }
        y.CustomerConfiguration customer2 = configuration.getCustomer();
        if (customer2 == null || (accessType = customer2.getAccessType()) == null) {
            return;
        }
        if (accessType instanceof y.i.LegacyCustomerEphemeralKey) {
            if (p013kotlin.text.t.y0(((y.i.LegacyCustomerEphemeralKey) accessType).getEphemeralKeySecret()) || p013kotlin.text.t.y0(configuration.getCustomer().getEphemeralKeySecret())) {
                throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the ephemeralKeySecret cannot be an empty string.");
            }
        } else if (accessType instanceof y.i.CustomerSession) {
            n30.d.a aVarA = n30.d.f92877a.a(((y.i.CustomerSession) accessType).getCustomerSessionClientSecret());
            if (aVarA instanceof n30.a) {
                throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the customerSessionClientSecret cannot be an empty string.");
            }
            if (aVarA instanceof n30.b) {
                throw new IllegalArgumentException("Argument looks like an Ephemeral Key secret, but expecting a CustomerSession client secret. See CustomerSession API: https://docs.stripe.com/api/customer_sessions/create");
            }
            if (aVarA instanceof n30.c) {
                throw new IllegalArgumentException("Argument does not look like a CustomerSession client secret. See CustomerSession API: https://docs.stripe.com/api/customer_sessions/create");
            }
        }
    }
}
