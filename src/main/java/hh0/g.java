package hh0;

import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements qj0.e<og0.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.withpersona.sdk2.inquiry.internal.network.f f72830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<z> f72831b;

    public g(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        this.f72830a = fVar;
        this.f72831b = iVar;
    }

    public static g a(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        return new g(fVar, iVar);
    }

    public static og0.b b(com.withpersona.sdk2.inquiry.internal.network.f fVar, z zVar) {
        return (og0.b) qj0.h.d(fVar.c(zVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public og0.b get() {
        return b(this.f72830a, this.f72831b.get());
    }
}
