package n40;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class y1 implements qj0.e<x1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<t50.h> f93331a;

    public y1(Provider<t50.h> provider) {
        this.f93331a = provider;
    }

    public static y1 a(Provider<t50.h> provider) {
        return new y1(provider);
    }

    public static x1 c(t50.h hVar) {
        return new x1(hVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x1 get() {
        return c(this.f93331a.get());
    }
}
