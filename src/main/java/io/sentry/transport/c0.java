package io.sentry.transport;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c0 {

    private static final class b extends c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f81365a;

        b(int i11) {
            super();
            this.f81365a = i11;
        }

        @Override // io.sentry.transport.c0
        public int c() {
            return this.f81365a;
        }

        @Override // io.sentry.transport.c0
        public boolean d() {
            return false;
        }
    }

    private static final class c extends c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f81366a = new c();

        private c() {
            super();
        }

        @Override // io.sentry.transport.c0
        public int c() {
            return -1;
        }

        @Override // io.sentry.transport.c0
        public boolean d() {
            return true;
        }
    }

    public static c0 a() {
        return b(-1);
    }

    public static c0 b(int i11) {
        return new b(i11);
    }

    public static c0 e() {
        return c.f81366a;
    }

    public abstract int c();

    public abstract boolean d();

    private c0() {
    }
}
