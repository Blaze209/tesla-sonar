package e40;

import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements qj0.e<CoroutineContext> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final r f61773a = new r();
    }

    public static r a() {
        return a.f61773a;
    }

    public static CoroutineContext c() {
        return (CoroutineContext) qj0.h.d(l.INSTANCE.h());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoroutineContext get() {
        return c();
    }
}
