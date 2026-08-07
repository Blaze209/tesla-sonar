package b70;

import androidx.fragment.app.Fragment;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import jn0.h0;
import jn0.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.m;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ[\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH'¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb70/f;", "", "", "publishableKey", "stripeAccountId", "clientSecret", "Lb70/a;", "configuration", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb70/a;)V", "b", "elementsSessionId", "customerId", "onBehalfOf", "", "amount", "currency", "c", "(Ljava/lang/String;Ljava/lang/String;Lb70/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "e", "(Ljava/lang/String;Ljava/lang/String;Lb70/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "()V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f16790a;

    /* JADX INFO: renamed from: b70.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb70/f$a;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function1;", "Lcom/stripe/android/payments/bankaccount/navigation/d;", "Ljn0/h0;", "callback", "Lb70/f;", "b", "(Landroidx/fragment/app/Fragment;Lwn0/l;)Lb70/f;", "", "hostedSurface", "Lh/d;", "activityResultRegistryOwner", "Lcom/stripe/android/payments/bankaccount/navigation/e;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lh/d;Lwn0/l;)Lb70/f;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16790a = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(l callback, com.stripe.android.payments.bankaccount.navigation.e eVar) {
            s.k(callback, "$callback");
            s.h(eVar);
            callback.invoke(com.stripe.android.payments.bankaccount.navigation.f.a(eVar));
        }

        public final f b(Fragment fragment, final l<? super com.stripe.android.payments.bankaccount.navigation.d, h0> callback) {
            s.k(fragment, "fragment");
            s.k(callback, "callback");
            ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new CollectBankAccountContract(), new ActivityResultCallback() { // from class: b70.e
                @Override // androidx.p002activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    f.Companion.c(callback, (com.stripe.android.payments.bankaccount.navigation.e) obj);
                }
            });
            s.h(activityResultLauncherRegisterForActivityResult);
            return new b70.b(activityResultLauncherRegisterForActivityResult, null);
        }

        public final f d(String hostedSurface, h.d activityResultRegistryOwner, l<? super com.stripe.android.payments.bankaccount.navigation.e, h0> callback) {
            s.k(hostedSurface, "hostedSurface");
            s.k(activityResultRegistryOwner, "activityResultRegistryOwner");
            s.k(callback, "callback");
            ActivityResultLauncher activityResultLauncherL = activityResultRegistryOwner.getActivityResultRegistry().l("CollectBankAccountLauncher", new CollectBankAccountContract(), new b(callback));
            s.h(activityResultLauncherL);
            return new b70.b(activityResultLauncherL, hostedSurface);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b implements ActivityResultCallback, m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f16791a;

        b(l function) {
            s.k(function, "function");
            this.f16791a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof m)) {
                return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final i<?> getFunctionDelegate() {
            return this.f16791a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        public final /* synthetic */ void onActivityResult(Object obj) {
            this.f16791a.invoke(obj);
        }
    }

    void a();

    void b(String publishableKey, String stripeAccountId, String clientSecret, a configuration);

    void c(String publishableKey, String stripeAccountId, a configuration, String elementsSessionId, String customerId, String onBehalfOf, Integer amount, String currency);

    void d(String publishableKey, String stripeAccountId, String clientSecret, a configuration);

    void e(String publishableKey, String stripeAccountId, a configuration, String elementsSessionId, String customerId, String onBehalfOf);
}
