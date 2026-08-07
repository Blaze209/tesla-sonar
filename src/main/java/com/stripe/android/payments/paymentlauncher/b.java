package com.stripe.android.payments.paymentlauncher;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u00052\u00020\u0001:\u0003\u0005\f\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/b;", "", "Lcom/stripe/android/model/l;", "params", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/l;)V", "Lcom/stripe/android/model/m;", "c", "(Lcom/stripe/android/model/m;)V", "", "clientSecret", "b", "(Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f52200a;

    /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/b$a;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "", "publishableKey", "stripeAccountId", "Lcom/stripe/android/payments/paymentlauncher/b$c;", "callback", "Lcom/stripe/android/payments/paymentlauncher/b;", "a", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/b$c;)Lcom/stripe/android/payments/paymentlauncher/b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f52200a = new Companion();

        private Companion() {
        }

        public final b a(Fragment fragment, String publishableKey, String stripeAccountId, c callback) {
            s.k(fragment, "fragment");
            s.k(publishableKey, "publishableKey");
            s.k(callback, "callback");
            return new com.stripe.android.payments.paymentlauncher.c(fragment, d.b(callback)).a(publishableKey, stripeAccountId);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/b$b;", "", "Lcom/stripe/android/payments/paymentlauncher/a;", "launcherResult", "Ljn0/h0;", "a", "(Lcom/stripe/android/payments/paymentlauncher/a;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC0952b {
        void a(a launcherResult);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/b$c;", "", "Lcom/stripe/android/payments/paymentlauncher/f;", "paymentResult", "Ljn0/h0;", "a", "(Lcom/stripe/android/payments/paymentlauncher/f;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        void a(f paymentResult);
    }

    void a(ConfirmPaymentIntentParams params);

    void b(String clientSecret);

    void c(ConfirmSetupIntentParams params);

    void d(String clientSecret);
}
