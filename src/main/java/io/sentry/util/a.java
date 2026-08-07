package io.sentry.util;

import io.sentry.d1;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends ReentrantLock {

    /* JADX INFO: renamed from: io.sentry.util.a$a, reason: collision with other inner class name */
    static final class C1707a implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReentrantLock f81449a;

        C1707a(ReentrantLock reentrantLock) {
            this.f81449a = reentrantLock;
        }

        @Override // io.sentry.d1, java.lang.AutoCloseable
        public void close() {
            this.f81449a.unlock();
        }
    }

    public d1 a() {
        lock();
        return new C1707a(this);
    }
}
