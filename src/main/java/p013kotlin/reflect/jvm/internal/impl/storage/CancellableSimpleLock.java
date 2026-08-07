package p013kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import jn0.h0;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class CancellableSimpleLock extends DefaultSimpleLock {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f88823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l<InterruptedException, h0> f88824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancellableSimpleLock(Lock lock, Runnable checkCancelled, l<? super InterruptedException, h0> interruptedExceptionHandler) {
        super(lock);
        s.k(lock, "lock");
        s.k(checkCancelled, "checkCancelled");
        s.k(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f88823b = checkCancelled;
        this.f88824c = interruptedExceptionHandler;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock, p013kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f88823b.run();
            } catch (InterruptedException e11) {
                this.f88824c.invoke(e11);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CancellableSimpleLock(Runnable checkCancelled, l<? super InterruptedException, h0> interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        s.k(checkCancelled, "checkCancelled");
        s.k(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
