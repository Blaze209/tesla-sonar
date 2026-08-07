package b70;

import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010JY\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001f¨\u0006 "}, d2 = {"Lb70/b;", "Lb70/f;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "hostActivityLauncher", "", "hostedSurface", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;)V", "publishableKey", "stripeAccountId", "clientSecret", "Lb70/a;", "configuration", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb70/a;)V", "b", "elementsSessionId", "customerId", "onBehalfOf", "", "amount", "currency", "c", "(Ljava/lang/String;Ljava/lang/String;Lb70/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "e", "(Ljava/lang/String;Ljava/lang/String;Lb70/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "()V", "Landroidx/activity/result/ActivityResultLauncher;", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<CollectBankAccountContract.a> hostActivityLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String hostedSurface;

    public b(ActivityResultLauncher<CollectBankAccountContract.a> hostActivityLauncher, String str) {
        s.k(hostActivityLauncher, "hostActivityLauncher");
        this.hostActivityLauncher = hostActivityLauncher;
        this.hostedSurface = str;
    }

    @Override // b70.f
    public void a() {
        this.hostActivityLauncher.d();
    }

    @Override // b70.f
    public void b(String publishableKey, String stripeAccountId, String clientSecret, a configuration) {
        s.k(publishableKey, "publishableKey");
        s.k(clientSecret, "clientSecret");
        s.k(configuration, "configuration");
        this.hostActivityLauncher.b(new CollectBankAccountContract.a.ForSetupIntent(publishableKey, stripeAccountId, clientSecret, configuration, true, this.hostedSurface));
    }

    @Override // b70.f
    public void c(String publishableKey, String stripeAccountId, a configuration, String elementsSessionId, String customerId, String onBehalfOf, Integer amount, String currency) {
        s.k(publishableKey, "publishableKey");
        s.k(configuration, "configuration");
        s.k(elementsSessionId, "elementsSessionId");
        this.hostActivityLauncher.b(new CollectBankAccountContract.a.ForDeferredPaymentIntent(publishableKey, stripeAccountId, configuration, this.hostedSurface, elementsSessionId, customerId, onBehalfOf, amount, currency));
    }

    @Override // b70.f
    public void d(String publishableKey, String stripeAccountId, String clientSecret, a configuration) {
        s.k(publishableKey, "publishableKey");
        s.k(clientSecret, "clientSecret");
        s.k(configuration, "configuration");
        this.hostActivityLauncher.b(new CollectBankAccountContract.a.ForPaymentIntent(publishableKey, stripeAccountId, clientSecret, configuration, true, this.hostedSurface));
    }

    @Override // b70.f
    public void e(String publishableKey, String stripeAccountId, a configuration, String elementsSessionId, String customerId, String onBehalfOf) {
        s.k(publishableKey, "publishableKey");
        s.k(configuration, "configuration");
        s.k(elementsSessionId, "elementsSessionId");
        this.hostActivityLauncher.b(new CollectBankAccountContract.a.ForDeferredSetupIntent(publishableKey, stripeAccountId, configuration, this.hostedSurface, elementsSessionId, customerId, onBehalfOf));
    }
}
