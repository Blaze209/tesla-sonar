package e40;

import android.content.Context;
import android.content.pm.PackageManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import f30.PaymentConfiguration;
import java.util.Calendar;
import java.util.Set;
import javax.inject.Provider;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Le40/c;", "", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f61693a;

    /* JADX INFO: renamed from: e40.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000bH\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Le40/c$a;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lf30/o;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Lf30/o;", "Ljavax/inject/Provider;", "paymentConfiguration", "Lkotlin/Function0;", "", "e", "(Ljavax/inject/Provider;)Lwn0/a;", "", "h", "()Ljava/util/Set;", "", "g", "()Z", CoreConstants.CONTEXT_SCOPE_VALUE, "Lw30/e;", "b", "(Landroid/content/Context;Ljavax/inject/Provider;)Lw30/e;", "", "f", "()Lwn0/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f61693a = new Companion();

        /* JADX INFO: renamed from: e40.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class C1265a extends p013kotlin.jvm.internal.u implements wn0.a<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Provider<PaymentConfiguration> f61694c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1265a(Provider<PaymentConfiguration> provider) {
                super(0);
                this.f61694c = provider;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f61694c.get().getPublishableKey();
            }
        }

        /* JADX INFO: renamed from: e40.c$a$b */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.a<Long> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f61695c = new b();

            b() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Long invoke() {
                return Long.valueOf(Calendar.getInstance().getTimeInMillis());
            }
        }

        private Companion() {
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
            return new w30.e(packageManager, z30.a.f126806a.a(context), packageName, new Provider() { // from class: e40.a
                @Override // javax.inject.Provider
                public final Object get() {
                    return c.Companion.c(paymentConfiguration);
                }
            }, new e40.b(new w30.x(context)), null, 32, null);
        }

        public final PaymentConfiguration d(Context appContext) {
            p013kotlin.jvm.internal.s.k(appContext, "appContext");
            return PaymentConfiguration.INSTANCE.a(appContext);
        }

        public final wn0.a<String> e(Provider<PaymentConfiguration> paymentConfiguration) {
            p013kotlin.jvm.internal.s.k(paymentConfiguration, "paymentConfiguration");
            return new C1265a(paymentConfiguration);
        }

        public final wn0.a<Long> f() {
            return b.f61695c;
        }

        public final boolean g() {
            return false;
        }

        public final Set<String> h() {
            return d1.c("WalletMode");
        }
    }
}
