package hh0;

import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements qj0.e<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.withpersona.sdk2.inquiry.internal.network.f f72834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<z> f72835b;

    public i(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        this.f72834a = fVar;
        this.f72835b = iVar;
    }

    public static i a(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        return new i(fVar, iVar);
    }

    public static s c(com.withpersona.sdk2.inquiry.internal.network.f fVar, z zVar) {
        return (s) qj0.h.d(fVar.e(zVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.f72834a, this.f72835b.get());
    }
}
