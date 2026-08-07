package ai0;

import qj0.h;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements qj0.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f1130a;

    public c(b bVar) {
        this.f1130a = bVar;
    }

    public static c a(b bVar) {
        return new c(bVar);
    }

    public static a b(b bVar) {
        return (a) h.d(bVar.getDataCollector());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a get() {
        return b(this.f1130a);
    }
}
