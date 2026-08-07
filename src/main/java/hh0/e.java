package hh0;

import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements qj0.e<kg0.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.withpersona.sdk2.inquiry.internal.network.f f72826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<z> f72827b;

    public e(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        this.f72826a = fVar;
        this.f72827b = iVar;
    }

    public static e a(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        return new e(fVar, iVar);
    }

    public static kg0.b b(com.withpersona.sdk2.inquiry.internal.network.f fVar, z zVar) {
        return (kg0.b) qj0.h.d(fVar.a(zVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg0.b get() {
        return b(this.f72826a, this.f72827b.get());
    }
}
