package yc;

import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import jn0.h0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.n0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Ljn0/h0;", "a", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/w;", "observer", "b", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/w;)V", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.util.LifecyclesKt", f = "lifecycles.kt", i = {0, 0}, l = {42}, m = "awaitStarted", n = {"$this$awaitStarted", "observer"}, s = {"L$0", "L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f125356n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f125357o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f125358p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f125359q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f125358p = obj;
            this.f125359q |= Integer.MIN_VALUE;
            return r.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"yc/r$b", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<h0> f125360a;

        /* JADX WARN: Multi-variable type inference failed */
        b(CancellableContinuation<? super h0> cancellableContinuation) {
            this.f125360a = cancellableContinuation;
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner owner) {
            CancellableContinuation<h0> cancellableContinuation = this.f125360a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            cancellableContinuation.resumeWith(jn0.s.b(h0.f84049a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, yc.r$b] */
    public static final Object a(Lifecycle lifecycle, Continuation<? super h0> continuation) {
        a aVar;
        Lifecycle lifecycle2;
        n0 n0Var;
        Throwable th2;
        androidx.p003lifecycle.w wVar;
        androidx.p003lifecycle.w wVar2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f125359q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f125359q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f125358p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f125359q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) aVar.f125357o;
            lifecycle2 = (Lifecycle) aVar.f125356n;
            try {
                jn0.t.b(obj);
                wVar2 = (androidx.p003lifecycle.w) n0Var.f86529a;
                if (wVar2 != null) {
                    lifecycle2.d(wVar2);
                }
                return h0.f84049a;
            } catch (Throwable th3) {
                th2 = th3;
                wVar = (androidx.p003lifecycle.w) n0Var.f86529a;
                if (wVar != null) {
                    lifecycle2.d(wVar);
                }
                throw th2;
            }
        }
        jn0.t.b(obj);
        if (lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            return h0.f84049a;
        }
        n0 n0Var2 = new n0();
        try {
            aVar.f125356n = lifecycle;
            aVar.f125357o = n0Var2;
            aVar.f125359q = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(aVar), 1);
            cancellableContinuationImpl.initCancellability();
            ?? bVar = new b(cancellableContinuationImpl);
            n0Var2.f86529a = bVar;
            p013kotlin.jvm.internal.s.h(bVar);
            lifecycle.a((androidx.p003lifecycle.w) bVar);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(aVar);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            lifecycle2 = lifecycle;
            n0Var = n0Var2;
            wVar2 = (androidx.p003lifecycle.w) n0Var.f86529a;
            if (wVar2 != null) {
                lifecycle2.d(wVar2);
            }
            return h0.f84049a;
        } catch (Throwable th4) {
            lifecycle2 = lifecycle;
            n0Var = n0Var2;
            th2 = th4;
            wVar = (androidx.p003lifecycle.w) n0Var.f86529a;
            if (wVar != null) {
                lifecycle2.d(wVar);
            }
            throw th2;
        }
    }

    public static final void b(Lifecycle lifecycle, androidx.p003lifecycle.w wVar) {
        lifecycle.d(wVar);
        lifecycle.a(wVar);
    }
}
