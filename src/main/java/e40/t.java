package e40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements qj0.e<o30.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Boolean> f61775a;

    public t(Provider<Boolean> provider) {
        this.f61775a = provider;
    }

    public static t a(Provider<Boolean> provider) {
        return new t(provider);
    }

    public static o30.d c(boolean z11) {
        return (o30.d) qj0.h.d(l.INSTANCE.j(z11));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o30.d get() {
        return c(this.f61775a.get().booleanValue());
    }
}
