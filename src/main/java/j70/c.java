package j70;

import f30.l;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements qj0.e<com.stripe.android.payments.core.authentication.threeds2.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<l> f82789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Boolean> f82790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<wn0.a<String>> f82791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<Set<String>> f82792d;

    public c(Provider<l> provider, Provider<Boolean> provider2, Provider<wn0.a<String>> provider3, Provider<Set<String>> provider4) {
        this.f82789a = provider;
        this.f82790b = provider2;
        this.f82791c = provider3;
        this.f82792d = provider4;
    }

    public static c a(Provider<l> provider, Provider<Boolean> provider2, Provider<wn0.a<String>> provider3, Provider<Set<String>> provider4) {
        return new c(provider, provider2, provider3, provider4);
    }

    public static com.stripe.android.payments.core.authentication.threeds2.b c(l lVar, boolean z11, wn0.a<String> aVar, Set<String> set) {
        return new com.stripe.android.payments.core.authentication.threeds2.b(lVar, z11, aVar, set);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.payments.core.authentication.threeds2.b get() {
        return c(this.f82789a.get(), this.f82790b.get().booleanValue(), this.f82791c.get(), this.f82792d.get());
    }
}
