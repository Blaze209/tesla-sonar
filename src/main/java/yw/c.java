package yw;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements xw.b<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f125889a;

    public c(Provider<Context> provider) {
        this.f125889a = provider;
    }

    public static c a(Provider<Context> provider) {
        return new c(provider);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f125889a.get());
    }
}
