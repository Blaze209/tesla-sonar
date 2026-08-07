package m40;

import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import java.util.Locale;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements qj0.e<t50.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<r50.a> f91229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<w30.l.b> f91230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<u50.c> f91231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<Locale> f91232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<o30.d> f91233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<SynchronizeSessionResponse> f91234f;

    public y(Provider<r50.a> provider, Provider<w30.l.b> provider2, Provider<u50.c> provider3, Provider<Locale> provider4, Provider<o30.d> provider5, Provider<SynchronizeSessionResponse> provider6) {
        this.f91229a = provider;
        this.f91230b = provider2;
        this.f91231c = provider3;
        this.f91232d = provider4;
        this.f91233e = provider5;
        this.f91234f = provider6;
    }

    public static y a(Provider<r50.a> provider, Provider<w30.l.b> provider2, Provider<u50.c> provider3, Provider<Locale> provider4, Provider<o30.d> provider5, Provider<SynchronizeSessionResponse> provider6) {
        return new y(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static t50.p c(r50.a aVar, w30.l.b bVar, u50.c cVar, Locale locale, o30.d dVar, SynchronizeSessionResponse synchronizeSessionResponse) {
        return (t50.p) qj0.h.d(q.INSTANCE.h(aVar, bVar, cVar, locale, dVar, synchronizeSessionResponse));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t50.p get() {
        return c(this.f91229a.get(), this.f91230b.get(), this.f91231c.get(), this.f91232d.get(), this.f91233e.get(), this.f91234f.get());
    }
}
