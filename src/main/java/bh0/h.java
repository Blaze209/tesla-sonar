package bh0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements qj0.e<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<hh0.s> f17263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<com.squareup.moshi.u> f17264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<kh0.b> f17265c;

    public h(qj0.i<hh0.s> iVar, qj0.i<com.squareup.moshi.u> iVar2, qj0.i<kh0.b> iVar3) {
        this.f17263a = iVar;
        this.f17264b = iVar2;
        this.f17265c = iVar3;
    }

    public static h a(qj0.i<hh0.s> iVar, qj0.i<com.squareup.moshi.u> iVar2, qj0.i<kh0.b> iVar3) {
        return new h(iVar, iVar2, iVar3);
    }

    public static g c(hh0.s sVar, com.squareup.moshi.u uVar, kh0.b bVar) {
        return new g(sVar, uVar, bVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f17263a.get(), this.f17264b.get(), this.f17265c.get());
    }
}
