package hh0;

import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements qj0.e<cj0.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.withpersona.sdk2.inquiry.internal.network.f f72843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<z> f72844b;

    public p(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        this.f72843a = fVar;
        this.f72844b = iVar;
    }

    public static p a(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        return new p(fVar, iVar);
    }

    public static cj0.b c(com.withpersona.sdk2.inquiry.internal.network.f fVar, z zVar) {
        return (cj0.b) qj0.h.d(fVar.l(zVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public cj0.b get() {
        return c(this.f72843a, this.f72844b.get());
    }
}
