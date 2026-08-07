package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public interface u extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.u
    s<?> submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.u
    <T> s<T> submit(Runnable runnable, T t11);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.u
    <T> s<T> submit(Callable<T> callable);
}
