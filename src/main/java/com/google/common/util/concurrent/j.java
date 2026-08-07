package com.google.common.util.concurrent;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j<V> extends com.google.common.collect.t implements Future<V> {
    protected j() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return d().cancel(z11);
    }

    protected abstract Future<? extends V> d();

    @Override // java.util.concurrent.Future
    public V get() {
        return d().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return d().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return d().isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j11, TimeUnit timeUnit) {
        return d().get(j11, timeUnit);
    }
}
