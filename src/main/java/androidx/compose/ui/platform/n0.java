package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.ContinuationInterceptor;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/n0;", "Lr2/f1;", "Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/l0;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/l0;)V", "R", "Lkotlin/Function1;", "", "onFrame", "B", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroid/view/Choreographer;", "()Landroid/view/Choreographer;", "b", "Landroidx/compose/ui/platform/l0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n0 implements p020r2.f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Choreographer choreographer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0 dispatcher;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0 f5875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f5876d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l0 l0Var, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f5875c = l0Var;
            this.f5876d = frameCallback;
        }

        public final void a(Throwable th2) {
            this.f5875c.w0(this.f5876d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Throwable th2) {
            a(th2);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f5878d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f5878d = frameCallback;
        }

        public final void a(Throwable th2) {
            n0.this.getChoreographer().removeFrameCallback(this.f5878d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Throwable th2) {
            a(th2);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "frameTimeNanos", "Ljn0/h0;", "doFrame", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<R> f5879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f5880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Long, R> f5881c;

        /* JADX WARN: Multi-variable type inference failed */
        c(CancellableContinuation<? super R> cancellableContinuation, n0 n0Var, wn0.l<? super Long, ? extends R> lVar) {
            this.f5879a = cancellableContinuation;
            this.f5880b = n0Var;
            this.f5881c = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j11) {
            Object objB;
            Continuation continuation = this.f5879a;
            wn0.l<Long, R> lVar = this.f5881c;
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(lVar.invoke(Long.valueOf(j11)));
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            continuation.resumeWith(objB);
        }
    }

    public n0(Choreographer choreographer, l0 l0Var) {
        this.choreographer = choreographer;
        this.dispatcher = l0Var;
    }

    @Override // p020r2.f1
    public <R> Object B(wn0.l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        l0 l0Var = this.dispatcher;
        if (l0Var == null) {
            CoroutineContext.Element element = continuation.getContext().get(ContinuationInterceptor.INSTANCE);
            l0Var = element instanceof l0 ? (l0) element : null;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        c cVar = new c(cancellableContinuationImpl, this, lVar);
        if (l0Var == null || !p013kotlin.jvm.internal.s.f(l0Var.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(cVar);
            cancellableContinuationImpl.invokeOnCancellation(new b(cVar));
        } else {
            l0Var.u0(cVar);
            cancellableContinuationImpl.invokeOnCancellation(new a(l0Var, cVar));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public <R> R fold(R r11, wn0.p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        return (R) r2.f1.a.a(this, r11, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) r2.f1.a.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p013kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return r2.f1.a.c(this, key);
    }

    @Override // p013kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return r2.f1.a.d(this, coroutineContext);
    }
}
