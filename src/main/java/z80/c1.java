package z80;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class c1 implements qj0.e<b1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<h70.h> f127400a;

    public c1(Provider<h70.h> provider) {
        this.f127400a = provider;
    }

    public static c1 a(Provider<h70.h> provider) {
        return new c1(provider);
    }

    public static b1 c(h70.h hVar) {
        return new b1(hVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b1 get() {
        return c(this.f127400a.get());
    }
}
