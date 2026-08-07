package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements qj0.e<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.j> f93181a;

    public m(Provider<t50.j> provider) {
        this.f93181a = provider;
    }

    public static m a(Provider<t50.j> provider) {
        return new m(provider);
    }

    public static l c(t50.j jVar) {
        return new l(jVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f93181a.get());
    }
}
