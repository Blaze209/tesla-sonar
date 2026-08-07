package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0 f81335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f81336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f81337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue<String> f81338d;

    private static final class a implements io.sentry.hints.e, io.sentry.hints.k, io.sentry.hints.p, io.sentry.hints.i, io.sentry.hints.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f81339a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f81340b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CountDownLatch f81341c = new CountDownLatch(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f81342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ILogger f81343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f81344f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Queue<String> f81345g;

        public a(long j11, ILogger iLogger, String str, Queue<String> queue) {
            this.f81342d = j11;
            this.f81344f = str;
            this.f81345g = queue;
            this.f81343e = iLogger;
        }

        @Override // io.sentry.hints.g
        public void a() {
            this.f81345g.add(this.f81344f);
        }

        @Override // io.sentry.hints.p
        public boolean b() {
            return this.f81340b;
        }

        @Override // io.sentry.hints.k
        public boolean c() {
            return this.f81339a;
        }

        @Override // io.sentry.hints.p
        public void d(boolean z11) {
            this.f81340b = z11;
            this.f81341c.countDown();
        }

        @Override // io.sentry.hints.k
        public void e(boolean z11) {
            this.f81339a = z11;
        }

        @Override // io.sentry.hints.i
        public boolean h() {
            try {
                return this.f81341c.await(this.f81342d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                this.f81343e.a(b7.ERROR, "Exception while awaiting on lock.", e11);
                return false;
            }
        }
    }

    t(z0 z0Var, ILogger iLogger, long j11, int i11) {
        this.f81335a = z0Var;
        this.f81336b = iLogger;
        this.f81337c = j11;
        this.f81338d = u8.d(new f(i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c(String str);

    public void d(File file) {
        try {
            ILogger iLogger = this.f81336b;
            b7 b7Var = b7.DEBUG;
            iLogger.c(b7Var, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: io.sentry.s
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return this.f81307a.c(str);
                }
            });
            if (fileArrListFiles == null) {
                this.f81336b.c(b7.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
                return;
            }
            this.f81336b.c(b7Var, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    if (this.f81338d.contains(absolutePath)) {
                        this.f81336b.c(b7.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                    } else {
                        io.sentry.transport.a0 a0VarQ = this.f81335a.q();
                        if (a0VarQ != null && a0VarQ.I(k.All)) {
                            this.f81336b.c(b7.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                            return;
                        } else {
                            this.f81336b.c(b7.DEBUG, "Processing file: %s", absolutePath);
                            e(file2, io.sentry.util.n.e(new a(this.f81337c, this.f81336b, absolutePath, this.f81338d)));
                            Thread.sleep(100L);
                        }
                    }
                } else {
                    this.f81336b.c(b7.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th2) {
            this.f81336b.b(b7.ERROR, th2, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    protected abstract void e(File file, h0 h0Var);
}
