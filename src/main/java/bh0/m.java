package bh0;

import android.app.Application;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements qj0.e<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f17295a;

    public m(l lVar) {
        this.f17295a = lVar;
    }

    public static Application a(l lVar) {
        return (Application) qj0.h.d(lVar.a());
    }

    public static m b(l lVar) {
        return new m(lVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return a(this.f17295a);
    }
}
