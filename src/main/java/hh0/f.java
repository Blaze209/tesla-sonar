package hh0;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements qj0.e<FallbackModeService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.withpersona.sdk2.inquiry.internal.network.f f72828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<z> f72829b;

    public f(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        this.f72828a = fVar;
        this.f72829b = iVar;
    }

    public static f a(com.withpersona.sdk2.inquiry.internal.network.f fVar, qj0.i<z> iVar) {
        return new f(fVar, iVar);
    }

    public static FallbackModeService b(com.withpersona.sdk2.inquiry.internal.network.f fVar, z zVar) {
        return (FallbackModeService) qj0.h.d(fVar.b(zVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FallbackModeService get() {
        return b(this.f72828a, this.f72829b.get());
    }
}
