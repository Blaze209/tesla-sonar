package j40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements qj0.e<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<wo0.b> f82623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<o30.d> f82624b;

    public m(Provider<wo0.b> provider, Provider<o30.d> provider2) {
        this.f82623a = provider;
        this.f82624b = provider2;
    }

    public static m a(Provider<wo0.b> provider, Provider<o30.d> provider2) {
        return new m(provider, provider2);
    }

    public static l c(wo0.b bVar, o30.d dVar) {
        return new l(bVar, dVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f82623a.get(), this.f82624b.get());
    }
}
