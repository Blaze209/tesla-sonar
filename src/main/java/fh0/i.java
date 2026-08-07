package fh0;

import com.squareup.moshi.u;
import com.withpersona.sdk2.inquiry.FallbackMode;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements qj0.e<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<FallbackMode> f65993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<a> f65994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<bh0.f> f65995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qj0.i<u> f65996d;

    public i(qj0.i<FallbackMode> iVar, qj0.i<a> iVar2, qj0.i<bh0.f> iVar3, qj0.i<u> iVar4) {
        this.f65993a = iVar;
        this.f65994b = iVar2;
        this.f65995c = iVar3;
        this.f65996d = iVar4;
    }

    public static i a(qj0.i<FallbackMode> iVar, qj0.i<a> iVar2, qj0.i<bh0.f> iVar3, qj0.i<u> iVar4) {
        return new i(iVar, iVar2, iVar3, iVar4);
    }

    public static h c(FallbackMode fallbackMode, a aVar, bh0.f fVar, u uVar) {
        return new h(fallbackMode, aVar, fVar, uVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f65993a.get(), this.f65994b.get(), this.f65995c.get(), this.f65996d.get());
    }
}
