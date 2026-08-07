package p013kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultSimpleLock implements SimpleLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f88825a;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSimpleLock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    protected final Lock a() {
        return this.f88825a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        this.f88825a.lock();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
        this.f88825a.unlock();
    }

    public DefaultSimpleLock(Lock lock) {
        s.k(lock, "lock");
        this.f88825a = lock;
    }

    public /* synthetic */ DefaultSimpleLock(Lock lock, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
