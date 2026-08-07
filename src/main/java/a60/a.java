package a60;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"La60/a;", "La60/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "La60/d;", AnalyticsAttribute.Environment, "Lcom/google/android/gms/wallet/PaymentsClient;", "a", "(La60/d;)Lcom/google/android/gms/wallet/PaymentsClient;", "Landroid/content/Context;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public a(Context context) {
        s.k(context, "context");
        this.context = context;
    }

    @Override // a60.h
    public PaymentsClient a(d environment) {
        s.k(environment, "environment");
        Wallet.WalletOptions walletOptionsBuild = new Wallet.WalletOptions.Builder().setEnvironment(environment.getValue()).build();
        s.j(walletOptionsBuild, "build(...)");
        PaymentsClient paymentsClient = Wallet.getPaymentsClient(this.context, walletOptionsBuild);
        s.j(paymentsClient, "getPaymentsClient(...)");
        return paymentsClient;
    }
}
