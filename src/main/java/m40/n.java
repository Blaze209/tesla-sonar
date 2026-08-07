package m40;

import java.util.Locale;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements qj0.e<t50.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<r50.a> f91195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w30.l.b> f91196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<u50.c> f91197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<Locale> f91198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<o30.d> f91199e;

    public n(Provider<r50.a> provider, Provider<w30.l.b> provider2, Provider<u50.c> provider3, Provider<Locale> provider4, Provider<o30.d> provider5) {
        this.f91195a = provider;
        this.f91196b = provider2;
        this.f91197c = provider3;
        this.f91198d = provider4;
        this.f91199e = provider5;
    }

    public static n a(Provider<r50.a> provider, Provider<w30.l.b> provider2, Provider<u50.c> provider3, Provider<Locale> provider4, Provider<o30.d> provider5) {
        return new n(provider, provider2, provider3, provider4, provider5);
    }

    public static t50.p c(r50.a aVar, w30.l.b bVar, u50.c cVar, Locale locale, o30.d dVar) {
        return (t50.p) qj0.h.d(m.f91193a.b(aVar, bVar, cVar, locale, dVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t50.p get() {
        return c(this.f91195a.get(), this.f91196b.get(), this.f91197c.get(), this.f91198d.get(), this.f91199e.get());
    }
}
