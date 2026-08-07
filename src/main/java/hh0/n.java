package hh0;

import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements qj0.e<vh0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.withpersona.sdk2.inquiry.internal.network.f f72840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<z> f72841b;

    public n(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        this.f72840a = fVar;
        this.f72841b = iVar;
    }

    public static n a(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        return new n(fVar, iVar);
    }

    public static vh0.a c(com.withpersona.sdk2.inquiry.internal.network.f fVar, z zVar) {
        return (vh0.a) qj0.h.d(fVar.j(zVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public vh0.a get() {
        return c(this.f72840a, this.f72841b.get());
    }
}
