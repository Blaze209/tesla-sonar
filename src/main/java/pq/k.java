package pq;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements rq.b<Executor> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f103617a = new k();
    }

    public static k a() {
        return a.f103617a;
    }

    public static Executor b() {
        return (Executor) rq.d.d(j.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
