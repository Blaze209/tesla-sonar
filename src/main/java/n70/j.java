package n70;

import androidx.p002activity.result.ActivityResultLauncher;
import com.stripe.android.model.PaymentMethod;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ln70/j;", "", "<init>", "()V", "", "externalPaymentMethodType", "Lcom/stripe/android/model/v0$e;", "billingDetails", "Lkotlin/Function1;", "Lcom/stripe/android/payments/paymentlauncher/f;", "Ljn0/h0;", "onPaymentResult", "Landroidx/activity/result/ActivityResultLauncher;", "Ln70/i;", "externalPaymentMethodLauncher", "Lh70/h;", "errorReporter", "b", "(Ljava/lang/String;Lcom/stripe/android/model/v0$e;Lwn0/l;Landroidx/activity/result/ActivityResultLauncher;Lh70/h;)V", "Ln70/h;", "externalPaymentMethodConfirmHandler", "Ln70/h;", "a", "()Ln70/h;", "c", "(Ln70/h;)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f93418a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f93419b = 8;

    private j() {
    }

    public final h a() {
        return null;
    }

    public final void b(String externalPaymentMethodType, PaymentMethod.BillingDetails billingDetails, wn0.l<? super com.stripe.android.payments.paymentlauncher.f, h0> onPaymentResult, ActivityResultLauncher<ExternalPaymentMethodInput> externalPaymentMethodLauncher, h70.h errorReporter) {
        p013kotlin.jvm.internal.s.k(externalPaymentMethodType, "externalPaymentMethodType");
        p013kotlin.jvm.internal.s.k(onPaymentResult, "onPaymentResult");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        h70.h.b.a(errorReporter, h70.h.d.EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL, null, v0.f(jn0.x.a("external_payment_method_type", externalPaymentMethodType)), 2, null);
        onPaymentResult.invoke(new com.stripe.android.payments.paymentlauncher.f.d(new IllegalStateException("externalPaymentMethodConfirmHandler is null. Cannot process payment for payment selection: " + externalPaymentMethodType)));
    }

    public final void c(h hVar) {
    }
}
