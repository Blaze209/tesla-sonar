package vq;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import wq.x;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements rq.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Executor> f119752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<qq.e> f119753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<x> f119754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<xq.d> f119755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<yq.a> f119756e;

    public d(Provider<Executor> provider, Provider<qq.e> provider2, Provider<x> provider3, Provider<xq.d> provider4, Provider<yq.a> provider5) {
        this.f119752a = provider;
        this.f119753b = provider2;
        this.f119754c = provider3;
        this.f119755d = provider4;
        this.f119756e = provider5;
    }

    public static d a(Provider<Executor> provider, Provider<qq.e> provider2, Provider<x> provider3, Provider<xq.d> provider4, Provider<yq.a> provider5) {
        return new d(provider, provider2, provider3, provider4, provider5);
    }

    public static c c(Executor executor, qq.e eVar, x xVar, xq.d dVar, yq.a aVar) {
        return new c(executor, eVar, xVar, dVar, aVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f119752a.get(), this.f119753b.get(), this.f119754c.get(), this.f119755d.get(), this.f119756e.get());
    }
}
