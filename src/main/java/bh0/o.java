package bh0;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements qj0.e<ec.r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f17316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<Context> f17317b;

    public o(l lVar, qj0.i<Context> iVar) {
        this.f17316a = lVar;
        this.f17317b = iVar;
    }

    public static o a(l lVar, qj0.i<Context> iVar) {
        return new o(lVar, iVar);
    }

    public static ec.r c(l lVar, Context context) {
        return (ec.r) qj0.h.d(lVar.c(context));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ec.r get() {
        return c(this.f17316a, this.f17317b.get());
    }
}
