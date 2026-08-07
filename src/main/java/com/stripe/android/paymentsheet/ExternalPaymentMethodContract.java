package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.core.exception.LocalStripeException;
import n70.ExternalPaymentMethodInput;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ln70/i;", "Lcom/stripe/android/payments/paymentlauncher/f;", "Lh70/h;", "errorReporter", "<init>", "(Lh70/h;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ln70/i;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/stripe/android/payments/paymentlauncher/f;", DateTokenConverter.CONVERTER_KEY, "Lh70/h;", "getErrorReporter", "()Lh70/h;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExternalPaymentMethodContract extends ActivityResultContract<ExternalPaymentMethodInput, com.stripe.android.payments.paymentlauncher.f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    public ExternalPaymentMethodContract(h70.h errorReporter) {
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, ExternalPaymentMethodInput input) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(input, "input");
        Intent intentPutExtra = new Intent().setClass(context, ExternalPaymentMethodProxyActivity.class).putExtra("external_payment_method_type", input.getType()).putExtra("external_payment_method_billing_details", input.getBillingDetails());
        p013kotlin.jvm.internal.s.j(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.payments.paymentlauncher.f parseResult(int resultCode, Intent intent) {
        if (resultCode == -1) {
            return com.stripe.android.payments.paymentlauncher.f.c.f52256c;
        }
        if (resultCode == 0) {
            return com.stripe.android.payments.paymentlauncher.f.a.f52255c;
        }
        if (resultCode == 1) {
            return new com.stripe.android.payments.paymentlauncher.f.d(new LocalStripeException(intent != null ? intent.getStringExtra("external_payment_method_error_message") : null, "externalPaymentMethodFailure"));
        }
        h70.h.b.a(this.errorReporter, h70.h.f.EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE, null, v0.f(jn0.x.a("result_code", String.valueOf(resultCode))), 2, null);
        return new com.stripe.android.payments.paymentlauncher.f.d(new IllegalArgumentException("Invalid result code returned by external payment method activity"));
    }
}
