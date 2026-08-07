package s30;

import javax.inject.Provider;
import qj0.h;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements qj0.e<o30.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f109792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Boolean> f109793b;

    public c(a aVar, Provider<Boolean> provider) {
        this.f109792a = aVar;
        this.f109793b = provider;
    }

    public static c a(a aVar, Provider<Boolean> provider) {
        return new c(aVar, provider);
    }

    public static o30.d c(a aVar, boolean z11) {
        return (o30.d) h.d(aVar.b(z11));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o30.d get() {
        return c(this.f109792a, this.f109793b.get().booleanValue());
    }
}
