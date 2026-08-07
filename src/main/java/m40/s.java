package m40;

import javax.inject.Provider;
import s50.FinancialConnectionsSheetNativeState;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements qj0.e<com.stripe.android.financialconnections.a.ElementsSessionContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<FinancialConnectionsSheetNativeState> f91205a;

    public s(Provider<FinancialConnectionsSheetNativeState> provider) {
        this.f91205a = provider;
    }

    public static s a(Provider<FinancialConnectionsSheetNativeState> provider) {
        return new s(provider);
    }

    public static com.stripe.android.financialconnections.a.ElementsSessionContext c(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
        return q.INSTANCE.b(financialConnectionsSheetNativeState);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.financialconnections.a.ElementsSessionContext get() {
        return c(this.f91205a.get());
    }
}
