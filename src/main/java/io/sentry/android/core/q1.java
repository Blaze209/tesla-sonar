package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.ILogger;
import io.sentry.b7;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
final class q1 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f79704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.q0 f79705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f79706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f79707d;

    private static final class a implements io.sentry.hints.e, io.sentry.hints.k, io.sentry.hints.p, io.sentry.hints.i, io.sentry.hints.b, io.sentry.hints.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f79708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f79709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CountDownLatch f79710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f79711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ILogger f79712e;

        public a(long j11, ILogger iLogger) {
            reset();
            this.f79711d = j11;
            this.f79712e = (ILogger) io.sentry.util.y.c(iLogger, "ILogger is required.");
        }

        @Override // io.sentry.hints.p
        public boolean b() {
            return this.f79709b;
        }

        @Override // io.sentry.hints.k
        public boolean c() {
            return this.f79708a;
        }

        @Override // io.sentry.hints.p
        public void d(boolean z11) {
            this.f79709b = z11;
            this.f79710c.countDown();
        }

        @Override // io.sentry.hints.k
        public void e(boolean z11) {
            this.f79708a = z11;
        }

        @Override // io.sentry.hints.i
        public boolean h() {
            try {
                return this.f79710c.await(this.f79711d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                this.f79712e.a(b7.ERROR, "Exception while awaiting on lock.", e11);
                return false;
            }
        }

        @Override // io.sentry.hints.j
        public void reset() {
            this.f79710c = new CountDownLatch(1);
            this.f79708a = false;
            this.f79709b = false;
        }
    }

    q1(String str, io.sentry.q0 q0Var, ILogger iLogger, long j11) {
        super(str);
        this.f79704a = str;
        this.f79705b = (io.sentry.q0) io.sentry.util.y.c(q0Var, "Envelope sender is required.");
        this.f79706c = (ILogger) io.sentry.util.y.c(iLogger, "Logger is required.");
        this.f79707d = j11;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i11, String str) {
        if (str == null || i11 != 8) {
            return;
        }
        this.f79706c.c(b7.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i11), this.f79704a, str);
        io.sentry.h0 h0VarE = io.sentry.util.n.e(new a(this.f79707d, this.f79706c));
        this.f79705b.a(this.f79704a + File.separator + str, h0VarE);
    }
}
