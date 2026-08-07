package k70;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements qj0.e<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f85296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Context> f85297b;

    public n(l lVar, Provider<Context> provider) {
        this.f85296a = lVar;
        this.f85297b = provider;
    }

    public static n a(l lVar, Provider<Context> provider) {
        return new n(lVar, provider);
    }

    public static boolean c(l lVar, Context context) {
        return lVar.b(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c(this.f85296a, this.f85297b.get()));
    }
}
