package rh0;

import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements qj0.e<Interceptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f108267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<c> f108268b;

    public g(f fVar, qj0.i<c> iVar) {
        this.f108267a = fVar;
        this.f108268b = iVar;
    }

    public static g a(f fVar, qj0.i<c> iVar) {
        return new g(fVar, iVar);
    }

    public static Interceptor c(f fVar, c cVar) {
        return (Interceptor) qj0.h.d(fVar.b(cVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Interceptor get() {
        return c(this.f108267a, this.f108268b.get());
    }
}
