package s30;

import p013kotlin.coroutines.CoroutineContext;
import qj0.h;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements qj0.e<CoroutineContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f109794a;

    public e(d dVar) {
        this.f109794a = dVar;
    }

    public static e a(d dVar) {
        return new e(dVar);
    }

    public static CoroutineContext c(d dVar) {
        return (CoroutineContext) h.d(dVar.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoroutineContext get() {
        return c(this.f109794a);
    }
}
