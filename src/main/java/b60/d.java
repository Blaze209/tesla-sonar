package b60;

import android.content.Context;
import javax.inject.Provider;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements qj0.e<l<a60.d, com.stripe.android.googlepaylauncher.l>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f16724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Context> f16725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<o30.d> f16726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<h70.h> f16727d;

    public d(c cVar, Provider<Context> provider, Provider<o30.d> provider2, Provider<h70.h> provider3) {
        this.f16724a = cVar;
        this.f16725b = provider;
        this.f16726c = provider2;
        this.f16727d = provider3;
    }

    public static d a(c cVar, Provider<Context> provider, Provider<o30.d> provider2, Provider<h70.h> provider3) {
        return new d(cVar, provider, provider2, provider3);
    }

    public static l<a60.d, com.stripe.android.googlepaylauncher.l> c(c cVar, Context context, o30.d dVar, h70.h hVar) {
        return (l) qj0.h.d(cVar.a(context, dVar, hVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l<a60.d, com.stripe.android.googlepaylauncher.l> get() {
        return c(this.f16724a, this.f16725b.get(), this.f16726c.get(), this.f16727d.get());
    }
}
