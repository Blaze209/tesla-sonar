package androidx.work;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.coroutines.ContinuationInterceptor;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "isTaskExecutor", "Ljava/util/concurrent/Executor;", "e", "(Z)Ljava/util/concurrent/Executor;", "Landroidx/work/o0;", "f", "()Landroidx/work/o0;", "Lkotlin/coroutines/CoroutineContext;", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/CoroutineContext;)Ljava/util/concurrent/Executor;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"androidx/work/d$a", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadCount", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicInteger threadCount = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14502b;

        a(boolean z11) {
            this.f14502b = z11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            p013kotlin.jvm.internal.s.k(runnable, "runnable");
            return new Thread(runnable, (this.f14502b ? "WM.task-" : "androidx.work-") + this.threadCount.incrementAndGet());
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/work/d$b", "Landroidx/work/o0;", "", "isEnabled", "()Z", "", AnnotatedPrivateKey.LABEL, "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "b", "()V", "methodName", "", "cookie", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;I)V", "c", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements o0 {
        b() {
        }

        @Override // androidx.work.o0
        public void a(String label) {
            p013kotlin.jvm.internal.s.k(label, "label");
            eb.a.c(label);
        }

        @Override // androidx.work.o0
        public void b() {
            eb.a.f();
        }

        @Override // androidx.work.o0
        public void c(String methodName, int cookie) {
            p013kotlin.jvm.internal.s.k(methodName, "methodName");
            eb.a.d(methodName, cookie);
        }

        @Override // androidx.work.o0
        public void d(String methodName, int cookie) {
            p013kotlin.jvm.internal.s.k(methodName, "methodName");
            eb.a.a(methodName, cookie);
        }

        @Override // androidx.work.o0
        public boolean isEnabled() {
            return eb.a.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor d(CoroutineContext coroutineContext) {
        ContinuationInterceptor continuationInterceptor = coroutineContext != null ? (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.INSTANCE) : null;
        CoroutineDispatcher coroutineDispatcher = continuationInterceptor instanceof CoroutineDispatcher ? (CoroutineDispatcher) continuationInterceptor : null;
        if (coroutineDispatcher != null) {
            return ExecutorsKt.asExecutor(coroutineDispatcher);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor e(boolean z11) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z11));
        p013kotlin.jvm.internal.s.j(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 f() {
        return new b();
    }
}
