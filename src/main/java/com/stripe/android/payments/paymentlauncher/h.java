package com.stripe.android.payments.paymentlauncher;

import androidx.p002activity.result.ActivityResultLauncher;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JU\u0010\u000e\u001a\u00020\r2\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/h;", "", "Lkotlin/Function0;", "", "publishableKey", "stripeAccountId", "", "statusBarColor", "", "includePaymentSheetNextHandlers", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "hostActivityLauncher", "Lcom/stripe/android/payments/paymentlauncher/g;", "a", "(Lwn0/a;Lwn0/a;Ljava/lang/Integer;ZLandroidx/activity/result/ActivityResultLauncher;)Lcom/stripe/android/payments/paymentlauncher/g;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface h {
    g a(wn0.a<String> publishableKey, wn0.a<String> stripeAccountId, Integer statusBarColor, boolean includePaymentSheetNextHandlers, ActivityResultLauncher<PaymentLauncherContract.a> hostActivityLauncher);
}
