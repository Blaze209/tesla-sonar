package a60;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements qj0.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f474a;

    public b(Provider<Context> provider) {
        this.f474a = provider;
    }

    public static b a(Provider<Context> provider) {
        return new b(provider);
    }

    public static a c(Context context) {
        return new a(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f474a.get());
    }
}
