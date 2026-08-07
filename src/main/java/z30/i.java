package z30;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements qj0.e<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f126821a;

    public i(Provider<Context> provider) {
        this.f126821a = provider;
    }

    public static i a(Provider<Context> provider) {
        return new i(provider);
    }

    public static h c(Context context) {
        return new h(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f126821a.get());
    }
}
