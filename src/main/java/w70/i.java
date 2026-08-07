package w70;

import android.content.Context;
import android.content.res.Resources;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements qj0.e<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Resources> f121136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<o90.f> f121137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<Context> f121138c;

    public i(Provider<Resources> provider, Provider<o90.f> provider2, Provider<Context> provider3) {
        this.f121136a = provider;
        this.f121137b = provider2;
        this.f121138c = provider3;
    }

    public static i a(Provider<Resources> provider, Provider<o90.f> provider2, Provider<Context> provider3) {
        return new i(provider, provider2, provider3);
    }

    public static h c(Resources resources, o90.f fVar, Context context) {
        return new h(resources, fVar, context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f121136a.get(), this.f121137b.get(), this.f121138c.get());
    }
}
