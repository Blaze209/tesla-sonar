package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
final class f2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f80546a;

    f2(q7 q7Var) {
        this.f80546a = q7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f80546a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f80546a.getLogger().c(b7.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
            return;
        }
        if (!this.f80546a.isEnableAutoSessionTracking()) {
            this.f80546a.getLogger().c(b7.DEBUG, "Session tracking is disabled, bailing from previous session mover.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f80546a.getEnvelopeDiskCache();
        if (envelopeDiskCache instanceof io.sentry.cache.f) {
            io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
            fVar.w(io.sentry.cache.f.t(cacheDirPath), io.sentry.cache.f.v(cacheDirPath));
            fVar.s();
        }
    }
}
