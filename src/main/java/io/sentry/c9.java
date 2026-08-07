package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
interface c9 {

    public static final class a implements c9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f80345a = new a();

        private a() {
        }

        static c9 c() {
            return f80345a;
        }

        @Override // io.sentry.c9
        public void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.c9
        public Thread.UncaughtExceptionHandler b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    Thread.UncaughtExceptionHandler b();
}
