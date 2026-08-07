package androidx.p003lifecycle;

import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0081@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"R", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "", "dispatchNeeded", "Lkotlinx/coroutines/CoroutineDispatcher;", "lifecycleDispatcher", "Lkotlin/Function0;", "block", "a", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/CoroutineDispatcher;Lwn0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i1 {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineDispatcher f8815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Lifecycle f8816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f8817e;

        /* JADX INFO: renamed from: androidx.lifecycle.i1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ljn0/h0;", "run", "()V", "kotlinx/coroutines/RunnableKt$Runnable$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class RunnableC0178a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Lifecycle f8818a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f8819b;

            public RunnableC0178a(Lifecycle lifecycle, b bVar) {
                this.f8818a = lifecycle;
                this.f8819b = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8818a.d(this.f8819b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CoroutineDispatcher coroutineDispatcher, Lifecycle lifecycle, b bVar) {
            super(1);
            this.f8815c = coroutineDispatcher;
            this.f8816d = lifecycle;
            this.f8817e = bVar;
        }

        public final void a(Throwable th2) {
            CoroutineDispatcher coroutineDispatcher = this.f8815c;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            if (coroutineDispatcher.isDispatchNeeded(emptyCoroutineContext)) {
                this.f8815c.mo574dispatch(emptyCoroutineContext, new RunnableC0178a(this.f8816d, this.f8817e));
            } else {
                this.f8816d.d(this.f8817e);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/i1$b", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$a;", "event", "Ljn0/h0;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Lifecycle.State f8820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Lifecycle f8821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<R> f8822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<R> f8823d;

        /* JADX WARN: Multi-variable type inference failed */
        b(Lifecycle.State state, Lifecycle lifecycle, CancellableContinuation<? super R> cancellableContinuation, wn0.a<? extends R> aVar) {
            this.f8820a = state;
            this.f8821b = lifecycle;
            this.f8822c = cancellableContinuation;
            this.f8823d = aVar;
        }

        @Override // androidx.p003lifecycle.u
        public void onStateChanged(LifecycleOwner source, Lifecycle.a event) {
            Object objB;
            s.k(source, "source");
            s.k(event, "event");
            if (event != Lifecycle.a.INSTANCE.d(this.f8820a)) {
                if (event == Lifecycle.a.ON_DESTROY) {
                    this.f8821b.d(this);
                    Continuation continuation = this.f8822c;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    continuation.resumeWith(jn0.s.b(t.a(new LifecycleDestroyedException())));
                    return;
                }
                return;
            }
            this.f8821b.d(this);
            Continuation continuation2 = this.f8822c;
            wn0.a<R> aVar = this.f8823d;
            try {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(aVar.invoke());
            } catch (Throwable th2) {
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            continuation2.resumeWith(objB);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ljn0/h0;", "run", "()V", "kotlinx/coroutines/RunnableKt$Runnable$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Lifecycle f8824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f8825b;

        public c(Lifecycle lifecycle, b bVar) {
            this.f8824a = lifecycle;
            this.f8825b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8824a.a(this.f8825b);
        }
    }

    public static final <R> Object a(Lifecycle lifecycle, Lifecycle.State state, boolean z11, CoroutineDispatcher coroutineDispatcher, wn0.a<? extends R> aVar, Continuation<? super R> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        b bVar = new b(state, lifecycle, cancellableContinuationImpl, aVar);
        if (z11) {
            coroutineDispatcher.mo574dispatch(EmptyCoroutineContext.INSTANCE, new c(lifecycle, bVar));
        } else {
            lifecycle.a(bVar);
        }
        cancellableContinuationImpl.invokeOnCancellation(new a(coroutineDispatcher, lifecycle, bVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
