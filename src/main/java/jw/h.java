package jw;

import nq.j;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements qj0.e<yv.b<j>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f84366a;

    public h(a aVar) {
        this.f84366a = aVar;
    }

    public static h a(a aVar) {
        return new h(aVar);
    }

    public static yv.b<j> c(a aVar) {
        return (yv.b) qj0.h.d(aVar.g());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public yv.b<j> get() {
        return c(this.f84366a);
    }
}
