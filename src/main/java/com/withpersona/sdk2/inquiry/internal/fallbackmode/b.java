package com.withpersona.sdk2.inquiry.internal.fallbackmode;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements qj0.e<fh0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f57692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<d> f57693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<f.a> f57694c;

    public b(a aVar, qj0.i<d> iVar, qj0.i<f.a> iVar2) {
        this.f57692a = aVar;
        this.f57693b = iVar;
        this.f57694c = iVar2;
    }

    public static fh0.a a(a aVar, d dVar, f.a aVar2) {
        return (fh0.a) qj0.h.d(aVar.a(dVar, aVar2));
    }

    public static b b(a aVar, qj0.i<d> iVar, qj0.i<f.a> iVar2) {
        return new b(aVar, iVar, iVar2);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fh0.a get() {
        return a(this.f57692a, this.f57693b.get(), this.f57694c.get());
    }
}
