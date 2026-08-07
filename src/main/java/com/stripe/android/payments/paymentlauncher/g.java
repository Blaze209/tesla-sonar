package com.stripe.android.payments.paymentlauncher;

import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001Bk\b\u0001\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/g;", "Lcom/stripe/android/payments/paymentlauncher/b;", "Lkotlin/Function0;", "", "publishableKeyProvider", "stripeAccountIdProvider", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "hostActivityLauncher", "", "statusBarColor", "", "includePaymentSheetNextHandlers", "enableLogging", "", "productUsage", "<init>", "(Lwn0/a;Lwn0/a;Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/Integer;ZZLjava/util/Set;)V", "Lcom/stripe/android/model/l;", "params", "Ljn0/h0;", "a", "(Lcom/stripe/android/model/l;)V", "Lcom/stripe/android/model/m;", "c", "(Lcom/stripe/android/model/m;)V", "clientSecret", "b", "(Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "Landroidx/activity/result/ActivityResultLauncher;", "e", "Ljava/lang/Integer;", "f", "Z", "g", "h", "Ljava/util/Set;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> publishableKeyProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> stripeAccountIdProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<PaymentLauncherContract.a> hostActivityLauncher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Integer statusBarColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean includePaymentSheetNextHandlers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean enableLogging;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Set<String> productUsage;

    public g(wn0.a<String> publishableKeyProvider, wn0.a<String> stripeAccountIdProvider, ActivityResultLauncher<PaymentLauncherContract.a> hostActivityLauncher, Integer num, boolean z11, boolean z12, Set<String> productUsage) {
        s.k(publishableKeyProvider, "publishableKeyProvider");
        s.k(stripeAccountIdProvider, "stripeAccountIdProvider");
        s.k(hostActivityLauncher, "hostActivityLauncher");
        s.k(productUsage, "productUsage");
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
        this.hostActivityLauncher = hostActivityLauncher;
        this.statusBarColor = num;
        this.includePaymentSheetNextHandlers = z11;
        this.enableLogging = z12;
        this.productUsage = productUsage;
    }

    @Override // com.stripe.android.payments.paymentlauncher.b
    public void a(ConfirmPaymentIntentParams params) {
        s.k(params, "params");
        this.hostActivityLauncher.b(new PaymentLauncherContract.a.IntentConfirmationArgs(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), this.enableLogging, this.productUsage, this.includePaymentSheetNextHandlers, params, this.statusBarColor));
    }

    @Override // com.stripe.android.payments.paymentlauncher.b
    public void b(String clientSecret) {
        s.k(clientSecret, "clientSecret");
        this.hostActivityLauncher.b(new PaymentLauncherContract.a.PaymentIntentNextActionArgs(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), this.enableLogging, this.productUsage, this.includePaymentSheetNextHandlers, clientSecret, this.statusBarColor));
    }

    @Override // com.stripe.android.payments.paymentlauncher.b
    public void c(ConfirmSetupIntentParams params) {
        s.k(params, "params");
        this.hostActivityLauncher.b(new PaymentLauncherContract.a.IntentConfirmationArgs(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), this.enableLogging, this.productUsage, this.includePaymentSheetNextHandlers, params, this.statusBarColor));
    }

    @Override // com.stripe.android.payments.paymentlauncher.b
    public void d(String clientSecret) {
        s.k(clientSecret, "clientSecret");
        this.hostActivityLauncher.b(new PaymentLauncherContract.a.SetupIntentNextActionArgs(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), this.enableLogging, this.productUsage, this.includePaymentSheetNextHandlers, clientSecret, this.statusBarColor));
    }
}
