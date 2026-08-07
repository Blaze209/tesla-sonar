package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class a2 implements qj0.e<z1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.p> f93047a;

    public a2(Provider<t50.p> provider) {
        this.f93047a = provider;
    }

    public static a2 a(Provider<t50.p> provider) {
        return new a2(provider);
    }

    public static z1 c(t50.p pVar) {
        return new z1(pVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z1 get() {
        return c(this.f93047a.get());
    }
}
