package hh0;

import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements qj0.e<com.withpersona.sdk2.inquiry.governmentid.network.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.withpersona.sdk2.inquiry.internal.network.f f72832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<z> f72833b;

    public h(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        this.f72832a = fVar;
        this.f72833b = iVar;
    }

    public static h a(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        return new h(fVar, iVar);
    }

    public static com.withpersona.sdk2.inquiry.governmentid.network.a c(com.withpersona.sdk2.inquiry.internal.network.f fVar, z zVar) {
        return (com.withpersona.sdk2.inquiry.governmentid.network.a) qj0.h.d(fVar.d(zVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.governmentid.network.a get() {
        return c(this.f72832a, this.f72833b.get());
    }
}
