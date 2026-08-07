package c60;

import com.stripe.android.link.LinkActivityContract;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements qj0.e<LinkActivityContract> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<z60.g> f18791a;

    public b(Provider<z60.g> provider) {
        this.f18791a = provider;
    }

    public static b a(Provider<z60.g> provider) {
        return new b(provider);
    }

    public static LinkActivityContract c(z60.g gVar) {
        return new LinkActivityContract(gVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinkActivityContract get() {
        return c(this.f18791a.get());
    }
}
