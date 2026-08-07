package r40;

import i50.SharedPartnerAuthState;
import javax.inject.Provider;
import n40.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f106979a;

    public c(Provider<p0> provider) {
        this.f106979a = provider;
    }

    public static c a(Provider<p0> provider) {
        return new c(provider);
    }

    public static b c(SharedPartnerAuthState sharedPartnerAuthState, p0 p0Var) {
        return new b(sharedPartnerAuthState, p0Var);
    }

    public b b(SharedPartnerAuthState sharedPartnerAuthState) {
        return c(sharedPartnerAuthState, this.f106979a.get());
    }
}
