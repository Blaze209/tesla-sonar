package p013kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: loaded from: classes9.dex */
public final class EmptySimpleLock implements SimpleLock {
    public static final EmptySimpleLock INSTANCE = new EmptySimpleLock();

    private EmptySimpleLock() {
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
    }
}
