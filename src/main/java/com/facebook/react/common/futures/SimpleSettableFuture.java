package com.facebook.react.common.futures;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\u00052\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001d\u0010\u0017R\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#¨\u0006$"}, d2 = {"Lcom/facebook/react/common/futures/SimpleSettableFuture;", "T", "Ljava/util/concurrent/Future;", "<init>", "()V", "Ljn0/h0;", "a", "result", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "e", "(Ljava/lang/Exception;)V", "", "mayInterruptIfRunning", "cancel", "(Z)Z", "isCancelled", "()Z", "isDone", "get", "()Ljava/lang/Object;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "c", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readyLatch", "b", "Ljava/lang/Object;", "Ljava/lang/Exception;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleSettableFuture<T> implements Future<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CountDownLatch readyLatch = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private T result;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Exception exception;

    private final void a() {
        if (this.readyLatch.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public final T c() {
        try {
            return get();
        } catch (InterruptedException e11) {
            throw new RuntimeException(e11);
        } catch (ExecutionException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        throw new UnsupportedOperationException();
    }

    public final void d(T result) {
        a();
        this.result = result;
        this.readyLatch.countDown();
    }

    public final void e(Exception exception) {
        s.k(exception, "exception");
        a();
        this.exception = exception;
        this.readyLatch.countDown();
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        this.readyLatch.await();
        if (this.exception == null) {
            return this.result;
        }
        throw new ExecutionException(this.exception);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.readyLatch.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, TimeUnit unit) throws ExecutionException, TimeoutException {
        s.k(unit, "unit");
        if (this.readyLatch.await(timeout, unit)) {
            if (this.exception == null) {
                return this.result;
            }
            throw new ExecutionException(this.exception);
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
