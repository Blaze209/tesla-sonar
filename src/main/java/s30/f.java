package s30;

import p013kotlin.coroutines.CoroutineContext;
import qj0.h;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements qj0.e<CoroutineContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f109795a;

    public f(d dVar) {
        this.f109795a = dVar;
    }

    public static f a(d dVar) {
        return new f(dVar);
    }

    public static CoroutineContext c(d dVar) {
        return (CoroutineContext) h.d(dVar.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoroutineContext get() {
        return c(this.f109795a);
    }
}
