package bh0;

import android.view.Window;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements qj0.e<Window> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f17329a;

    public p(l lVar) {
        this.f17329a = lVar;
    }

    public static p a(l lVar) {
        return new p(lVar);
    }

    public static Window c(l lVar) {
        return (Window) qj0.h.d(lVar.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Window get() {
        return c(this.f17329a);
    }
}
