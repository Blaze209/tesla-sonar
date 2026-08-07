package hh0;

import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements qj0.e<dj0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.withpersona.sdk2.inquiry.internal.network.f f72846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<z> f72847b;

    public r(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        this.f72846a = fVar;
        this.f72847b = iVar;
    }

    public static r a(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        return new r(fVar, iVar);
    }

    public static dj0.a c(com.withpersona.sdk2.inquiry.internal.network.f fVar, z zVar) {
        return (dj0.a) qj0.h.d(fVar.n(zVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dj0.a get() {
        return c(this.f72846a, this.f72847b.get());
    }
}
