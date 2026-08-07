package k70;

import com.stripe.android.model.StripeIntent;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements qj0.e<i70.f<StripeIntent>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f85251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<i70.n> f85252b;

    public c0(b0 b0Var, Provider<i70.n> provider) {
        this.f85251a = b0Var;
        this.f85252b = provider;
    }

    public static c0 a(b0 b0Var, Provider<i70.n> provider) {
        return new c0(b0Var, provider);
    }

    public static i70.f<StripeIntent> c(b0 b0Var, i70.n nVar) {
        return (i70.f) qj0.h.d(b0Var.a(nVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i70.f<StripeIntent> get() {
        return c(this.f85251a, this.f85252b.get());
    }
}
