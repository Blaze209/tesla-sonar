package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<z0> f80796a = new ThreadLocal<>();

    static final class a implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z0 f80797a;

        a(z0 z0Var) {
            this.f80797a = z0Var;
        }

        @Override // io.sentry.d1, java.lang.AutoCloseable
        public void close() {
            o.f80796a.set(this.f80797a);
        }
    }

    @Override // io.sentry.a1
    public d1 a(z0 z0Var) {
        z0 z0Var2 = get();
        f80796a.set(z0Var);
        return new a(z0Var2);
    }

    @Override // io.sentry.a1
    public void close() {
        f80796a.remove();
    }

    @Override // io.sentry.a1
    public z0 get() {
        return f80796a.get();
    }

    @Override // io.sentry.a1
    public void init() {
    }
}
