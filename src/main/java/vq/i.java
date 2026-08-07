package vq;

import android.content.Context;
import javax.inject.Provider;
import wq.x;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements rq.b<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Context> f119758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<xq.d> f119759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<wq.f> f119760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<zq.a> f119761d;

    public i(Provider<Context> provider, Provider<xq.d> provider2, Provider<wq.f> provider3, Provider<zq.a> provider4) {
        this.f119758a = provider;
        this.f119759b = provider2;
        this.f119760c = provider3;
        this.f119761d = provider4;
    }

    public static i a(Provider<Context> provider, Provider<xq.d> provider2, Provider<wq.f> provider3, Provider<zq.a> provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static x c(Context context, xq.d dVar, wq.f fVar, zq.a aVar) {
        return (x) rq.d.d(h.a(context, dVar, fVar, aVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f119758a.get(), this.f119759b.get(), this.f119760c.get(), this.f119761d.get());
    }
}
