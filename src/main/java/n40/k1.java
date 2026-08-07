package n40;

import javax.inject.Provider;
import s50.FinancialConnectionsSheetNativeState;

/* JADX INFO: loaded from: classes7.dex */
public final class k1 implements qj0.e<j1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<FinancialConnectionsSheetNativeState> f93160a;

    public k1(Provider<FinancialConnectionsSheetNativeState> provider) {
        this.f93160a = provider;
    }

    public static k1 a(Provider<FinancialConnectionsSheetNativeState> provider) {
        return new k1(provider);
    }

    public static j1 c(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
        return new j1(financialConnectionsSheetNativeState);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j1 get() {
        return c(this.f93160a.get());
    }
}
