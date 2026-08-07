package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i<V> extends n<V> {

    static abstract class a<V> extends i<V> implements com.google.common.util.concurrent.a.e<V> {
        a() {
        }

        @Override // com.google.common.util.concurrent.a, com.google.common.util.concurrent.s
        public final void b(Runnable runnable, Executor executor) {
            super.b(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean cancel(boolean z11) {
            return super.cancel(z11);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get(long j11, TimeUnit timeUnit) {
            return (V) super.get(j11, timeUnit);
        }
    }

    i() {
    }
}
