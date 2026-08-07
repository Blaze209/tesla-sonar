package androidx.concurrent.futures;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.action.AwaitAction;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.util.concurrent.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.ContinuationKt;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendFunction;
import p013kotlin.jvm.internal.p;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/concurrent/futures/g;", "", "<init>", "()V", "T", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "launchUndispatched", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "block", "Lcom/google/common/util/concurrent/s;", "b", "(Lkotlin/coroutines/CoroutineContext;ZLwn0/p;)Lcom/google/common/util/concurrent/s;", "androidx/concurrent/futures/g$b", "Landroidx/concurrent/futures/g$b;", "GlobalListenableFutureScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "c", "Lkotlinx/coroutines/CoroutineDispatcher;", "GlobalListenableFutureAwaitContext", "a", "concurrent-futures-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f6458a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b GlobalListenableFutureScope = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final CoroutineDispatcher GlobalListenableFutureAwaitContext = Dispatchers.getUnconfined();

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010&\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00018\u00008\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/concurrent/futures/g$a;", "T", "Lcom/google/common/util/concurrent/s;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/Deferred;", "resultDeferred", "<init>", "(Lkotlinx/coroutines/Deferred;)V", "", "shouldInterrupt", "cancel", "(Z)Z", "isCancelled", "()Z", "isDone", "get", "()Ljava/lang/Object;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "Ljava/lang/Runnable;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/concurrent/Executor;", "executor", "Ljn0/h0;", "b", "(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V", "Ljn0/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", "a", "Lkotlinx/coroutines/Deferred;", "Landroidx/concurrent/futures/f;", "kotlin.jvm.PlatformType", "Landroidx/concurrent/futures/f;", "delegateFuture", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "concurrent-futures-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<T> implements s<T>, Continuation<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Deferred<T> resultDeferred;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final f<T> delegateFuture = f.t();

        /* JADX WARN: Multi-variable type inference failed */
        public a(Deferred<? extends T> deferred) {
            this.resultDeferred = deferred;
        }

        @Override // com.google.common.util.concurrent.s
        public void b(Runnable listener, Executor executor) {
            this.delegateFuture.b(listener, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean shouldInterrupt) {
            boolean zCancel = this.delegateFuture.cancel(shouldInterrupt);
            if (zCancel) {
                Job.DefaultImpls.cancel$default((Job) this.resultDeferred, (CancellationException) null, 1, (Object) null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.delegateFuture.get();
        }

        @Override // p013kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return g.GlobalListenableFutureAwaitContext;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegateFuture.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegateFuture.isDone();
        }

        @Override // p013kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            Throwable thE = jn0.s.e(result);
            if (thE == null) {
                this.delegateFuture.p(result);
            } else if (thE instanceof CancellationException) {
                this.delegateFuture.cancel(false);
            } else {
                this.delegateFuture.q(thE);
            }
        }

        @Override // java.util.concurrent.Future
        public T get(long timeout, TimeUnit unit) {
            return this.delegateFuture.get(timeout, unit);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"androidx/concurrent/futures/g$b", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "concurrent-futures-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements CoroutineScope {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final CoroutineContext coroutineContext = Dispatchers.getMain();

        b() {
        }

        @Override // kotlinx.coroutines.CoroutineScope
        public CoroutineContext getCoroutineContext() {
            return this.coroutineContext;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class c<T> extends p implements l<Continuation<? super T>, Object>, SuspendFunction {
        c(Object obj) {
            super(1, obj, Deferred.class, AwaitAction.ACTION_TYPE, "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super T> continuation) {
            return ((Deferred) this.receiver).await(continuation);
        }
    }

    private g() {
    }

    public static /* synthetic */ s c(g gVar, CoroutineContext coroutineContext, boolean z11, wn0.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return gVar.b(coroutineContext, z11, pVar);
    }

    public final <T> s<T> b(CoroutineContext context, boolean launchUndispatched, wn0.p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        Deferred deferredAsync = BuildersKt.async(GlobalListenableFutureScope, context, launchUndispatched ? CoroutineStart.UNDISPATCHED : CoroutineStart.DEFAULT, block);
        a aVar = new a(deferredAsync);
        Continuation<h0> continuationCreateCoroutine = ContinuationKt.createCoroutine(new c(deferredAsync), aVar);
        jn0.s.Companion companion = jn0.s.INSTANCE;
        continuationCreateCoroutine.resumeWith(jn0.s.b(h0.f84049a));
        return aVar;
    }
}
