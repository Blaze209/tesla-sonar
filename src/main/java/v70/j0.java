package v70;

import android.content.Context;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import f30.PaymentConfiguration;
import javax.inject.Provider;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007JU\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lv70/j0;", "", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "starterArgs", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;)V", "b", "()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "Landroidx/lifecycle/s0;", "savedStateHandle", "Ljavax/inject/Provider;", "Lf30/o;", "paymentConfigurationProvider", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;", "bacsMandateConfirmationLauncherFactory", "Lb60/e;", "googlePayPaymentMethodLauncherFactory", "Lcom/stripe/android/payments/paymentlauncher/h;", "stripePaymentLauncherAssistedFactory", "Lcom/stripe/android/paymentsheet/i;", "intentConfirmationInterceptor", "Lh70/h;", "errorReporter", "Lz30/j;", "logger", "Lcom/stripe/android/paymentsheet/h$d;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/s0;Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;Lb60/e;Lcom/stripe/android/payments/paymentlauncher/h;Lcom/stripe/android/paymentsheet/i;Lh70/h;Lz30/j;)Lcom/stripe/android/paymentsheet/h$d;", "Landroid/content/Context;", "appContext", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Ln70/r;", "c", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Ln70/r;", "a", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PaymentSheetContractV2.Args starterArgs;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Integer> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return j0.this.starterArgs.getStatusBarColor();
        }
    }

    public j0(PaymentSheetContractV2.Args starterArgs) {
        p013kotlin.jvm.internal.s.k(starterArgs, "starterArgs");
        this.starterArgs = starterArgs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PaymentSheetContractV2.Args getStarterArgs() {
        return this.starterArgs;
    }

    public final n70.r c(Context appContext, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(appContext, "appContext");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        com.stripe.android.paymentsheet.y.CustomerConfiguration jVarG = this.starterArgs.getConfig().getCustomer();
        return new n70.e(appContext, jVarG != null ? jVarG.getId() : null, workContext);
    }

    public final com.stripe.android.paymentsheet.h.d d(s0 savedStateHandle, Provider<PaymentConfiguration> paymentConfigurationProvider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, b60.e googlePayPaymentMethodLauncherFactory, com.stripe.android.payments.paymentlauncher.h stripePaymentLauncherAssistedFactory, com.stripe.android.paymentsheet.i intentConfirmationInterceptor, h70.h errorReporter, z30.j logger) {
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        p013kotlin.jvm.internal.s.k(paymentConfigurationProvider, "paymentConfigurationProvider");
        p013kotlin.jvm.internal.s.k(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
        p013kotlin.jvm.internal.s.k(googlePayPaymentMethodLauncherFactory, "googlePayPaymentMethodLauncherFactory");
        p013kotlin.jvm.internal.s.k(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
        p013kotlin.jvm.internal.s.k(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        return new com.stripe.android.paymentsheet.h.d(intentConfirmationInterceptor, paymentConfigurationProvider, bacsMandateConfirmationLauncherFactory, stripePaymentLauncherAssistedFactory, googlePayPaymentMethodLauncherFactory, savedStateHandle, new a(), errorReporter, logger);
    }
}
