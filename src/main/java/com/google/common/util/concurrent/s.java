package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
public interface s<V> extends Future<V> {
    void b(Runnable runnable, Executor executor);
}
