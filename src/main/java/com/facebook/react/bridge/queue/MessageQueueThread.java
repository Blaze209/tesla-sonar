package com.facebook.react.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0010\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH&¢\u0006\u0004\b\u0015\u0010\u0011J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH&¢\u0006\u0004\b\u0019\u0010\u0011J\u000f\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/queue/MessageQueueThread;", "", "Ljava/lang/Runnable;", "runnable", "", "runOnQueue", "(Ljava/lang/Runnable;)Z", "T", "Ljava/util/concurrent/Callable;", "callable", "Ljava/util/concurrent/Future;", "callOnQueue", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "isOnThread", "()Z", "Ljn0/h0;", "assertIsOnThread", "()V", "", "message", "(Ljava/lang/String;)V", "quitSynchronous", "Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;", "getPerfStats", "()Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;", "resetPerfStats", "isIdle", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MessageQueueThread {
    void assertIsOnThread();

    void assertIsOnThread(String message);

    <T> Future<T> callOnQueue(Callable<T> callable);

    MessageQueueThreadPerfStats getPerfStats();

    boolean isIdle();

    boolean isOnThread();

    void quitSynchronous();

    void resetPerfStats();

    boolean runOnQueue(Runnable runnable);
}
