package wq;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements rq.b<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f122230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<qq.e> f122231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<xq.d> f122232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<x> f122233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<Executor> f122234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<yq.a> f122235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<zq.a> f122236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<zq.a> f122237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<xq.c> f122238i;

    public s(Provider<Context> provider, Provider<qq.e> provider2, Provider<xq.d> provider3, Provider<x> provider4, Provider<Executor> provider5, Provider<yq.a> provider6, Provider<zq.a> provider7, Provider<zq.a> provider8, Provider<xq.c> provider9) {
        this.f122230a = provider;
        this.f122231b = provider2;
        this.f122232c = provider3;
        this.f122233d = provider4;
        this.f122234e = provider5;
        this.f122235f = provider6;
        this.f122236g = provider7;
        this.f122237h = provider8;
        this.f122238i = provider9;
    }

    public static s a(Provider<Context> provider, Provider<qq.e> provider2, Provider<xq.d> provider3, Provider<x> provider4, Provider<Executor> provider5, Provider<yq.a> provider6, Provider<zq.a> provider7, Provider<zq.a> provider8, Provider<xq.c> provider9) {
        return new s(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static r c(Context context, qq.e eVar, xq.d dVar, x xVar, Executor executor, yq.a aVar, zq.a aVar2, zq.a aVar3, xq.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, aVar, aVar2, aVar3, cVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f122230a.get(), this.f122231b.get(), this.f122232c.get(), this.f122233d.get(), this.f122234e.get(), this.f122235f.get(), this.f122236g.get(), this.f122237h.get(), this.f122238i.get());
    }
}
