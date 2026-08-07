package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class w1 implements qj0.e<v1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.j> f93314a;

    public w1(Provider<t50.j> provider) {
        this.f93314a = provider;
    }

    public static w1 a(Provider<t50.j> provider) {
        return new w1(provider);
    }

    public static v1 c(t50.j jVar) {
        return new v1(jVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v1 get() {
        return c(this.f93314a.get());
    }
}
