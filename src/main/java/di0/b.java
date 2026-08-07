package di0;

import kotlinx.coroutines.CoroutineDispatcher;
import qj0.e;
import qj0.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements e<CoroutineDispatcher> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f60682a;

    public b(a aVar) {
        this.f60682a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static CoroutineDispatcher c(a aVar) {
        return (CoroutineDispatcher) h.d(aVar.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoroutineDispatcher get() {
        return c(this.f60682a);
    }
}
