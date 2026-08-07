package gh0;

import android.content.Context;
import kotlinx.coroutines.CoroutineDispatcher;
import qj0.i;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements qj0.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<Context> f68956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i<kh0.e.a> f68957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i<f> f68958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i<CoroutineDispatcher> f68959d;

    public c(i<Context> iVar, i<kh0.e.a> iVar2, i<f> iVar3, i<CoroutineDispatcher> iVar4) {
        this.f68956a = iVar;
        this.f68957b = iVar2;
        this.f68958c = iVar3;
        this.f68959d = iVar4;
    }

    public static c a(i<Context> iVar, i<kh0.e.a> iVar2, i<f> iVar3, i<CoroutineDispatcher> iVar4) {
        return new c(iVar, iVar2, iVar3, iVar4);
    }

    public static a c(Context context, kh0.e.a aVar, f fVar, CoroutineDispatcher coroutineDispatcher) {
        return new a(context, aVar, fVar, coroutineDispatcher);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f68956a.get(), this.f68957b.get(), this.f68958c.get(), this.f68959d.get());
    }
}
