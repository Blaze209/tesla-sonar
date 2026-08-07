package e40;

import androidx.p003lifecycle.s0;
import f30.PaymentConfiguration;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements qj0.e<com.stripe.android.paymentsheet.h.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<s0> f61685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<PaymentConfiguration> f61686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<com.stripe.android.paymentsheet.paymentdatacollection.bacs.b> f61687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<com.stripe.android.payments.paymentlauncher.h> f61688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<Integer> f61689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<com.stripe.android.paymentsheet.i> f61690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<h70.h> f61691g;

    public b0(Provider<s0> provider, Provider<PaymentConfiguration> provider2, Provider<com.stripe.android.paymentsheet.paymentdatacollection.bacs.b> provider3, Provider<com.stripe.android.payments.paymentlauncher.h> provider4, Provider<Integer> provider5, Provider<com.stripe.android.paymentsheet.i> provider6, Provider<h70.h> provider7) {
        this.f61685a = provider;
        this.f61686b = provider2;
        this.f61687c = provider3;
        this.f61688d = provider4;
        this.f61689e = provider5;
        this.f61690f = provider6;
        this.f61691g = provider7;
    }

    public static b0 a(Provider<s0> provider, Provider<PaymentConfiguration> provider2, Provider<com.stripe.android.paymentsheet.paymentdatacollection.bacs.b> provider3, Provider<com.stripe.android.payments.paymentlauncher.h> provider4, Provider<Integer> provider5, Provider<com.stripe.android.paymentsheet.i> provider6, Provider<h70.h> provider7) {
        return new b0(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.stripe.android.paymentsheet.h.d c(s0 s0Var, Provider<PaymentConfiguration> provider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bVar, com.stripe.android.payments.paymentlauncher.h hVar, Integer num, com.stripe.android.paymentsheet.i iVar, h70.h hVar2) {
        return (com.stripe.android.paymentsheet.h.d) qj0.h.d(l.INSTANCE.r(s0Var, provider, bVar, hVar, num, iVar, hVar2));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.paymentsheet.h.d get() {
        return c(this.f61685a.get(), this.f61686b, this.f61687c.get(), this.f61688d.get(), this.f61689e.get(), this.f61690f.get(), this.f61691g.get());
    }
}
