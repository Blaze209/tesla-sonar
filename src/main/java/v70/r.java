package v70;

import android.content.Context;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import f30.PaymentConfiguration;
import javax.inject.Provider;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lv70/r;", "", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: v70.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J%\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Lv70/r$a;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lf30/o;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Lf30/o;", "Ljavax/inject/Provider;", "paymentConfiguration", "Lkotlin/Function0;", "", "k", "(Ljavax/inject/Provider;)Lwn0/a;", "l", "", "h", "()Z", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/y$j;", "Ln70/r;", "j", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Lwn0/l;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/a;", "f", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/a;", "Lr70/a;", "e", "()Lr70/a;", "Lz30/d;", "g", "()Lz30/d;", "Lh80/t$a;", "n", "()Lh80/t$a;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lw30/e;", "b", "(Landroid/content/Context;Ljavax/inject/Provider;)Lw30/e;", "Lc80/e$a;", "m", "()Lc80/e$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: v70.r$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/y$j;", "customerConfig", "Ln70/e;", "a", "(Lcom/stripe/android/paymentsheet/y$j;)Ln70/e;"}, k = 3, mv = {1, 9, 0})
        static final class C2537a extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.paymentsheet.y.CustomerConfiguration, n70.e> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f118314c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f118315d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2537a(Context context, CoroutineContext coroutineContext) {
                super(1);
                this.f118314c = context;
                this.f118315d = coroutineContext;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n70.e invoke(com.stripe.android.paymentsheet.y.CustomerConfiguration customerConfiguration) {
                return new n70.e(this.f118314c, customerConfiguration != null ? customerConfiguration.getId() : null, this.f118315d);
            }
        }

        /* JADX INFO: renamed from: v70.r$a$b */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.a<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Provider<PaymentConfiguration> f118316c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Provider<PaymentConfiguration> provider) {
                super(0);
                this.f118316c = provider;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f118316c.get().getPublishableKey();
            }
        }

        /* JADX INFO: renamed from: v70.r$a$c */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class c extends p013kotlin.jvm.internal.u implements wn0.a<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Provider<PaymentConfiguration> f118317c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Provider<PaymentConfiguration> provider) {
                super(0);
                this.f118317c = provider;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f118317c.get().getStripeAccountId();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(Provider paymentConfiguration) {
            p013kotlin.jvm.internal.s.k(paymentConfiguration, "$paymentConfiguration");
            return ((PaymentConfiguration) paymentConfiguration.get()).getPublishableKey();
        }

        public final w30.e b(Context context, final Provider<PaymentConfiguration> paymentConfiguration) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(paymentConfiguration, "paymentConfiguration");
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            return new w30.e(packageManager, z30.a.f126806a.a(context), packageName, new Provider() { // from class: v70.q
                @Override // javax.inject.Provider
                public final Object get() {
                    return r.Companion.c(paymentConfiguration);
                }
            }, new e40.b(new w30.x(context)), null, 32, null);
        }

        public final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b d() {
            return com.stripe.android.paymentsheet.paymentdatacollection.bacs.g.f53328a;
        }

        public final r70.a e() {
            return new r70.b();
        }

        public final com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a f() {
            return com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.g.f53413a;
        }

        public final z30.d g() {
            return z30.c.INSTANCE.a();
        }

        public final boolean h() {
            return false;
        }

        public final PaymentConfiguration i(Context appContext) {
            p013kotlin.jvm.internal.s.k(appContext, "appContext");
            return PaymentConfiguration.INSTANCE.a(appContext);
        }

        public final wn0.l<com.stripe.android.paymentsheet.y.CustomerConfiguration, n70.r> j(Context appContext, CoroutineContext workContext) {
            p013kotlin.jvm.internal.s.k(appContext, "appContext");
            p013kotlin.jvm.internal.s.k(workContext, "workContext");
            return new C2537a(appContext, workContext);
        }

        public final wn0.a<String> k(Provider<PaymentConfiguration> paymentConfiguration) {
            p013kotlin.jvm.internal.s.k(paymentConfiguration, "paymentConfiguration");
            return new b(paymentConfiguration);
        }

        public final wn0.a<String> l(Provider<PaymentConfiguration> paymentConfiguration) {
            p013kotlin.jvm.internal.s.k(paymentConfiguration, "paymentConfiguration");
            return new c(paymentConfiguration);
        }

        public final c80.e.a m() {
            return c80.i.b.f18958a;
        }

        public final h80.t.a n() {
            return h80.j.a.f71137a;
        }

        private Companion() {
        }
    }
}
