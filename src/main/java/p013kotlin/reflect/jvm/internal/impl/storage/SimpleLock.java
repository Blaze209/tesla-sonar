package p013kotlin.reflect.jvm.internal.impl.storage;

import jn0.h0;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public interface SimpleLock {
    public static final Companion Companion = Companion.f88846a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f88846a = new Companion();

        private Companion() {
        }

        public final DefaultSimpleLock simpleLock(Runnable runnable, l<? super InterruptedException, h0> lVar) {
            return (runnable == null || lVar == null) ? new DefaultSimpleLock(null, 1, null) : new CancellableSimpleLock(runnable, lVar);
        }
    }

    void lock();

    void unlock();
}
