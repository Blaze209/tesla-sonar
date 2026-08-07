package u6;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lu6/c0;", "", "<init>", "()V", "Ljn0/h0;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "c", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "runMutex", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;", "didRun", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Mutex runMutex = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CompletableDeferred<jn0.h0> didRun = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", i = {0, 0, 1, 1}, l = {544, DownloaderService.STATUS_TOO_MANY_REDIRECTS}, m = "runIfNeeded", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115439n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115440o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f115441p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f115443r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115441p = obj;
            this.f115443r |= Integer.MIN_VALUE;
            return c0.this.c(this);
        }
    }

    public final Object a(Continuation<? super jn0.h0> continuation) {
        Object objAwait = this.didRun.await(continuation);
        return objAwait == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : jn0.h0.f84049a;
    }

    protected abstract Object b(Continuation<? super jn0.h0> continuation);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Continuation<? super jn0.h0> continuation) throws Throwable {
        a aVar;
        Mutex mutex;
        c0 c0Var;
        Mutex mutex2;
        Throwable th2;
        c0 c0Var2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f115443r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f115443r = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f115441p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f115443r;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                if (this.didRun.isCompleted()) {
                    return jn0.h0.f84049a;
                }
                mutex = this.runMutex;
                aVar.f115439n = this;
                aVar.f115440o = mutex;
                aVar.f115443r = 1;
                if (mutex.lock(null, aVar) != coroutine_suspended) {
                    c0Var = this;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) aVar.f115440o;
                c0Var2 = (c0) aVar.f115439n;
                try {
                    jn0.t.b(obj);
                    CompletableDeferred<jn0.h0> completableDeferred = c0Var2.didRun;
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    completableDeferred.complete(h0Var);
                    mutex2.unlock(null);
                    return h0Var;
                } catch (Throwable th3) {
                    th2 = th3;
                    mutex2.unlock(null);
                    throw th2;
                }
            }
            Mutex mutex3 = (Mutex) aVar.f115440o;
            c0Var = (c0) aVar.f115439n;
            jn0.t.b(obj);
            mutex = mutex3;
            if (c0Var.didRun.isCompleted()) {
                jn0.h0 h0Var2 = jn0.h0.f84049a;
                mutex.unlock(null);
                return h0Var2;
            }
            aVar.f115439n = c0Var;
            aVar.f115440o = mutex;
            aVar.f115443r = 2;
            if (c0Var.b(aVar) != coroutine_suspended) {
                mutex2 = mutex;
                c0Var2 = c0Var;
                CompletableDeferred<jn0.h0> completableDeferred2 = c0Var2.didRun;
                jn0.h0 h0Var3 = jn0.h0.f84049a;
                completableDeferred2.complete(h0Var3);
                mutex2.unlock(null);
                return h0Var3;
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            mutex2 = mutex;
            th2 = th4;
            mutex2.unlock(null);
            throw th2;
        }
    }
}
