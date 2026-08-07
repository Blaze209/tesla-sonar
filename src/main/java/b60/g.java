package b60;

import com.google.android.gms.wallet.PaymentsClient;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lb60/g;", "", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b60.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb60/g$a;", "", "<init>", "()V", "Lcom/stripe/android/googlepaylauncher/h$e;", "googlePayConfig", "La60/h;", "paymentsClientFactory", "Lcom/google/android/gms/wallet/PaymentsClient;", "a", "(Lcom/stripe/android/googlepaylauncher/h$e;La60/h;)Lcom/google/android/gms/wallet/PaymentsClient;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentsClient a(com.stripe.android.googlepaylauncher.h.Config googlePayConfig, a60.h paymentsClientFactory) {
            s.k(googlePayConfig, "googlePayConfig");
            s.k(paymentsClientFactory, "paymentsClientFactory");
            return paymentsClientFactory.a(googlePayConfig.getEnvironment());
        }

        private Companion() {
        }
    }
}
