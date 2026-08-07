package e40;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Kind;
import f30.PaymentConfiguration;
import java.util.Set;
import javax.inject.Provider;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Le40/l;", "", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f61761a;

    /* JADX INFO: renamed from: e40.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0014J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#JO\u00100\u001a\u00020/2\u0006\u0010%\u001a\u00020$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001eH\u0007¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\tH\u0007¢\u0006\u0004\b5\u0010\u000bJ\u0015\u00107\u001a\b\u0012\u0004\u0012\u00020\u001206H\u0007¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0007¢\u0006\u0004\b9\u0010:J\u0019\u0010=\u001a\u00020<2\b\b\u0001\u0010;\u001a\u00020\u0016H\u0007¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0016H\u0007¢\u0006\u0004\b?\u0010:J\u0011\u0010A\u001a\u0004\u0018\u00010@H\u0007¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bD\u0010ER\u0016\u0010G\u001a\u0004\u0018\u00010@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010F¨\u0006H"}, d2 = {"Le40/l$a;", "", "<init>", "()V", "Landroid/app/Application;", Kind.APPLICATION, "Lf30/o;", "e", "(Landroid/app/Application;)Lf30/o;", "Lkotlin/coroutines/CoroutineContext;", "h", "()Lkotlin/coroutines/CoroutineContext;", "Ll70/d;", "s", "()Ll70/d;", "Ljavax/inject/Provider;", "paymentConfiguration", "Lkotlin/Function0;", "", "l", "(Ljavax/inject/Provider;)Lwn0/a;", "m", "", DateTokenConverter.CONVERTER_KEY, "Lw30/e;", "g", "(Landroid/app/Application;Ljavax/inject/Provider;)Lw30/e;", "analyticsRequestFactory", "Lw30/c;", "analyticsRequestExecutor", "Lh70/h;", "q", "(Lw30/e;Lw30/c;)Lh70/h;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;", "n", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;", "Landroidx/lifecycle/s0;", "savedStateHandle", "paymentConfigurationProvider", "bacsMandateConfirmationLauncherFactory", "Lcom/stripe/android/payments/paymentlauncher/h;", "stripePaymentLauncherAssistedFactory", "", "statusBarColor", "Lcom/stripe/android/paymentsheet/i;", "intentConfirmationInterceptor", "errorReporter", "Lcom/stripe/android/paymentsheet/h$d;", "r", "(Landroidx/lifecycle/s0;Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;Lcom/stripe/android/payments/paymentlauncher/h;Ljava/lang/Integer;Lcom/stripe/android/paymentsheet/i;Lh70/h;)Lcom/stripe/android/paymentsheet/h$d;", "Landroid/content/Context;", "b", "(Landroid/app/Application;)Landroid/content/Context;", "c", "", "k", "()Ljava/util/Set;", "p", "()Z", "enableLogging", "Lo30/d;", "j", "(Z)Lo30/d;", IntegerTokenConverter.CONVERTER_KEY, "Lw70/j;", "t", "()Lw70/j;", "Lh80/t$a;", "o", "()Lh80/t$a;", "Lw70/j;", "savedPaymentSelection", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f61761a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final w70.j savedPaymentSelection = null;

        /* JADX INFO: renamed from: e40.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class C1267a extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Provider<PaymentConfiguration> f61763c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1267a(Provider<PaymentConfiguration> provider) {
                super(0);
                this.f61763c = provider;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(p013kotlin.text.t.b0(this.f61763c.get().getPublishableKey(), "pk_live", false, 2, null));
            }
        }

        /* JADX INFO: renamed from: e40.l$a$b */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.a<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Provider<PaymentConfiguration> f61764c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Provider<PaymentConfiguration> provider) {
                super(0);
                this.f61764c = provider;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f61764c.get().getPublishableKey();
            }
        }

        /* JADX INFO: renamed from: e40.l$a$c */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class c extends p013kotlin.jvm.internal.u implements wn0.a<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Provider<PaymentConfiguration> f61765c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Provider<PaymentConfiguration> provider) {
                super(0);
                this.f61765c = provider;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f61765c.get().getStripeAccountId();
            }
        }

        /* JADX INFO: renamed from: e40.l$a$d */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
        static final class d extends p013kotlin.jvm.internal.u implements wn0.a<Integer> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Integer f61766c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Integer num) {
                super(0);
                this.f61766c = num;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return this.f61766c;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String f(Provider paymentConfiguration) {
            p013kotlin.jvm.internal.s.k(paymentConfiguration, "$paymentConfiguration");
            return ((PaymentConfiguration) paymentConfiguration.get()).getPublishableKey();
        }

        public final Context b(Application application) {
            p013kotlin.jvm.internal.s.k(application, "application");
            return application;
        }

        public final CoroutineContext c() {
            return Dispatchers.getIO();
        }

        public final wn0.a<Boolean> d(Provider<PaymentConfiguration> paymentConfiguration) {
            p013kotlin.jvm.internal.s.k(paymentConfiguration, "paymentConfiguration");
            return new C1267a(paymentConfiguration);
        }

        public final PaymentConfiguration e(Application application) {
            p013kotlin.jvm.internal.s.k(application, "application");
            return PaymentConfiguration.INSTANCE.a(application);
        }

        public final w30.e g(Application application, final Provider<PaymentConfiguration> paymentConfiguration) {
            p013kotlin.jvm.internal.s.k(application, "application");
            p013kotlin.jvm.internal.s.k(paymentConfiguration, "paymentConfiguration");
            PackageManager packageManager = application.getPackageManager();
            String packageName = application.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            return new w30.e(packageManager, z30.a.f126806a.a(application), packageName, new Provider() { // from class: e40.k
                @Override // javax.inject.Provider
                public final Object get() {
                    return l.Companion.f(paymentConfiguration);
                }
            }, new e40.b(new w30.x(application)), null, 32, null);
        }

        public final CoroutineContext h() {
            return Dispatchers.getIO();
        }

        public final boolean i() {
            return false;
        }

        public final o30.d j(boolean enableLogging) {
            return o30.d.INSTANCE.a(enableLogging);
        }

        public final Set<String> k() {
            return d1.c("CustomerSheet");
        }

        public final wn0.a<String> l(Provider<PaymentConfiguration> paymentConfiguration) {
            p013kotlin.jvm.internal.s.k(paymentConfiguration, "paymentConfiguration");
            return new b(paymentConfiguration);
        }

        public final wn0.a<String> m(Provider<PaymentConfiguration> paymentConfiguration) {
            p013kotlin.jvm.internal.s.k(paymentConfiguration, "paymentConfiguration");
            return new c(paymentConfiguration);
        }

        public final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b n() {
            return com.stripe.android.paymentsheet.paymentdatacollection.bacs.g.f53328a;
        }

        public final h80.t.a o() {
            return h80.j.a.f71137a;
        }

        public final boolean p() {
            return false;
        }

        public final h70.h q(w30.e analyticsRequestFactory, w30.c analyticsRequestExecutor) {
            p013kotlin.jvm.internal.s.k(analyticsRequestFactory, "analyticsRequestFactory");
            p013kotlin.jvm.internal.s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
            return new h70.i(analyticsRequestExecutor, analyticsRequestFactory);
        }

        public final com.stripe.android.paymentsheet.h.d r(s0 savedStateHandle, Provider<PaymentConfiguration> paymentConfigurationProvider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, com.stripe.android.payments.paymentlauncher.h stripePaymentLauncherAssistedFactory, Integer statusBarColor, com.stripe.android.paymentsheet.i intentConfirmationInterceptor, h70.h errorReporter) {
            p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
            p013kotlin.jvm.internal.s.k(paymentConfigurationProvider, "paymentConfigurationProvider");
            p013kotlin.jvm.internal.s.k(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
            p013kotlin.jvm.internal.s.k(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
            p013kotlin.jvm.internal.s.k(intentConfirmationInterceptor, "intentConfirmationInterceptor");
            p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
            return new com.stripe.android.paymentsheet.h.d(intentConfirmationInterceptor, paymentConfigurationProvider, bacsMandateConfirmationLauncherFactory, stripePaymentLauncherAssistedFactory, null, savedStateHandle, new d(statusBarColor), errorReporter, null);
        }

        public final l70.d s() {
            return l70.a.f89677a;
        }

        public final w70.j t() {
            return savedPaymentSelection;
        }
    }
}
