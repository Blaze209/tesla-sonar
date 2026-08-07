package bh0;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements qj0.e<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f17301a;

    public n(l lVar) {
        this.f17301a = lVar;
    }

    public static Context a(l lVar) {
        return (Context) qj0.h.d(lVar.b());
    }

    public static n b(l lVar) {
        return new n(lVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return a(this.f17301a);
    }
}
