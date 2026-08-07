package m40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements qj0.e<t50.r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.s> f91171a;

    public d0(Provider<t50.s> provider) {
        this.f91171a = provider;
    }

    public static d0 a(Provider<t50.s> provider) {
        return new d0(provider);
    }

    public static t50.r c(t50.s sVar) {
        return (t50.r) qj0.h.d(b0.INSTANCE.d(sVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t50.r get() {
        return c(this.f91171a.get());
    }
}
