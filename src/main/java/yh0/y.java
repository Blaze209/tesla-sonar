package yh0;

import android.view.Window;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements qj0.e<ji0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f125595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<Window> f125596b;

    public y(v vVar, qj0.i<Window> iVar) {
        this.f125595a = vVar;
        this.f125596b = iVar;
    }

    public static y a(v vVar, qj0.i<Window> iVar) {
        return new y(vVar, iVar);
    }

    public static ji0.a c(v vVar, Window window) {
        return (ji0.a) qj0.h.d(vVar.c(window));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ji0.a get() {
        return c(this.f125595a, this.f125596b.get());
    }
}
