package wq;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements rq.b<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Executor> f122245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<xq.d> f122246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<x> f122247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<yq.a> f122248d;

    public w(Provider<Executor> provider, Provider<xq.d> provider2, Provider<x> provider3, Provider<yq.a> provider4) {
        this.f122245a = provider;
        this.f122246b = provider2;
        this.f122247c = provider3;
        this.f122248d = provider4;
    }

    public static w a(Provider<Executor> provider, Provider<xq.d> provider2, Provider<x> provider3, Provider<yq.a> provider4) {
        return new w(provider, provider2, provider3, provider4);
    }

    public static v c(Executor executor, xq.d dVar, x xVar, yq.a aVar) {
        return new v(executor, dVar, xVar, aVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f122245a.get(), this.f122246b.get(), this.f122247c.get(), this.f122248d.get());
    }
}
