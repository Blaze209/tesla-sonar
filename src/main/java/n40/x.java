package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements qj0.e<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.r> f93315a;

    public x(Provider<t50.r> provider) {
        this.f93315a = provider;
    }

    public static x a(Provider<t50.r> provider) {
        return new x(provider);
    }

    public static w c(t50.r rVar) {
        return new w(rVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f93315a.get());
    }
}
