package rm0;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static void a(nr0.b<?> bVar, AtomicInteger atomicInteger, b bVar2) {
        if (atomicInteger.getAndIncrement() == 0) {
            bVar2.f(bVar);
        }
    }

    public static void b(nr0.b<?> bVar, Throwable th2, AtomicInteger atomicInteger, b bVar2) {
        if (bVar2.c(th2) && atomicInteger.getAndIncrement() == 0) {
            bVar2.f(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean c(nr0.b<? super T> bVar, T t11, AtomicInteger atomicInteger, b bVar2) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.onNext(t11);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            bVar2.f(bVar);
        }
        return false;
    }
}
