package e40;

import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements qj0.e<CoroutineContext> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final n f61768a = new n();
    }

    public static n a() {
        return a.f61768a;
    }

    public static CoroutineContext c() {
        return (CoroutineContext) qj0.h.d(l.INSTANCE.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoroutineContext get() {
        return c();
    }
}
