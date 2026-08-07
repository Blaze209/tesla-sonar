package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Ljava/util/concurrent/Executor;", "Lkotlin/Function0;", "block", "Lcom/google/common/util/concurrent/s;", "e", "(Ljava/util/concurrent/Executor;Lwn0/a;)Lcom/google/common/util/concurrent/s;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> com.google.common.util.concurrent.s<T> e(final Executor executor, final wn0.a<? extends T> aVar) {
        com.google.common.util.concurrent.s<T> sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.work.a1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar2) {
                return d1.f(executor, aVar, aVar2);
            }
        });
        p013kotlin.jvm.internal.s.j(sVarA, "getFuture(...)");
        return sVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 f(Executor executor, final wn0.a aVar, final androidx.concurrent.futures.c.a it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        it.a(new Runnable() { // from class: androidx.work.b1
            @Override // java.lang.Runnable
            public final void run() {
                d1.g(atomicBoolean);
            }
        }, j.INSTANCE);
        executor.execute(new Runnable() { // from class: androidx.work.c1
            @Override // java.lang.Runnable
            public final void run() {
                d1.h(atomicBoolean, it, aVar);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AtomicBoolean atomicBoolean, androidx.concurrent.futures.c.a aVar, wn0.a aVar2) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(aVar2.invoke());
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }
}
