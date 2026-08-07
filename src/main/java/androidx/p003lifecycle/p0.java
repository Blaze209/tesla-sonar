package androidx.p003lifecycle;

import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a@\u0010\f\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "a", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "b", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class p0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8853n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f8854o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Lifecycle f8855p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Lifecycle.State f8856q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p<CoroutineScope, Continuation<? super h0>, Object> f8857r;

        /* JADX INFO: renamed from: androidx.lifecycle.p0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
        static final class C0181a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f8858n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f8859o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f8860p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f8861q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f8862r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f8863s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f8864t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ Lifecycle f8865u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Lifecycle.State f8866v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f8867w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ p<CoroutineScope, Continuation<? super h0>, Object> f8868x;

            /* JADX INFO: renamed from: androidx.lifecycle.p0$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "<anonymous parameter 0>", "Landroidx/lifecycle/Lifecycle$a;", "event", "Ljn0/h0;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class C0182a implements u {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Lifecycle.a f8869a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ n0<Job> f8870b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ CoroutineScope f8871c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Lifecycle.a f8872d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ CancellableContinuation<h0> f8873e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ Mutex f8874f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ p<CoroutineScope, Continuation<? super h0>, Object> f8875g;

                /* JADX INFO: renamed from: androidx.lifecycle.p0$a$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {171, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
                static final class C0183a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    Object f8876n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    Object f8877o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    int f8878p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ Mutex f8879q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ p<CoroutineScope, Continuation<? super h0>, Object> f8880r;

                    /* JADX INFO: renamed from: androidx.lifecycle.p0$a$a$a$a$a, reason: collision with other inner class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
                    static final class C0184a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f8881n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        private /* synthetic */ Object f8882o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        final /* synthetic */ p<CoroutineScope, Continuation<? super h0>, Object> f8883p;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C0184a(p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super C0184a> continuation) {
                            super(2, continuation);
                            this.f8883p = pVar;
                        }

                        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                            C0184a c0184a = new C0184a(this.f8883p, continuation);
                            c0184a.f8882o = obj;
                            return c0184a;
                        }

                        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i11 = this.f8881n;
                            if (i11 == 0) {
                                t.b(obj);
                                CoroutineScope coroutineScope = (CoroutineScope) this.f8882o;
                                p<CoroutineScope, Continuation<? super h0>, Object> pVar = this.f8883p;
                                this.f8881n = 1;
                                if (pVar.invoke(coroutineScope, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                t.b(obj);
                            }
                            return h0.f84049a;
                        }

                        @Override // wn0.p
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                            return ((C0184a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0183a(Mutex mutex, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super C0183a> continuation) {
                        super(2, continuation);
                        this.f8879q = mutex;
                        this.f8880r = pVar;
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                        return new C0183a(this.f8879q, this.f8880r, continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Mutex mutex;
                        p<CoroutineScope, Continuation<? super h0>, Object> pVar;
                        Mutex mutex2;
                        Throwable th2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i11 = this.f8878p;
                        try {
                            if (i11 == 0) {
                                t.b(obj);
                                mutex = this.f8879q;
                                pVar = this.f8880r;
                                this.f8876n = mutex;
                                this.f8877o = pVar;
                                this.f8878p = 1;
                                if (mutex.lock(null, this) != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            }
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex2 = (Mutex) this.f8876n;
                                try {
                                    t.b(obj);
                                    h0 h0Var = h0.f84049a;
                                    mutex2.unlock(null);
                                    return h0.f84049a;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    mutex2.unlock(null);
                                    throw th2;
                                }
                            }
                            pVar = (p) this.f8877o;
                            Mutex mutex3 = (Mutex) this.f8876n;
                            t.b(obj);
                            mutex = mutex3;
                            C0184a c0184a = new C0184a(pVar, null);
                            this.f8876n = mutex;
                            this.f8877o = null;
                            this.f8878p = 2;
                            if (CoroutineScopeKt.coroutineScope(c0184a, this) != coroutine_suspended) {
                                mutex2 = mutex;
                                h0 h0Var2 = h0.f84049a;
                                mutex2.unlock(null);
                                return h0.f84049a;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th4) {
                            mutex2 = mutex;
                            th2 = th4;
                            mutex2.unlock(null);
                            throw th2;
                        }
                    }

                    @Override // wn0.p
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                        return ((C0183a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C0182a(Lifecycle.a aVar, n0<Job> n0Var, CoroutineScope coroutineScope, Lifecycle.a aVar2, CancellableContinuation<? super h0> cancellableContinuation, Mutex mutex, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar) {
                    this.f8869a = aVar;
                    this.f8870b = n0Var;
                    this.f8871c = coroutineScope;
                    this.f8872d = aVar2;
                    this.f8873e = cancellableContinuation;
                    this.f8874f = mutex;
                    this.f8875g = pVar;
                }

                /* JADX WARN: Type inference failed for: r9v5, types: [T, kotlinx.coroutines.Job] */
                @Override // androidx.p003lifecycle.u
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.a event) {
                    s.k(lifecycleOwner, "<anonymous parameter 0>");
                    s.k(event, "event");
                    if (event == this.f8869a) {
                        this.f8870b.f86529a = BuildersKt__Builders_commonKt.launch$default(this.f8871c, null, null, new C0183a(this.f8874f, this.f8875g, null), 3, null);
                        return;
                    }
                    if (event == this.f8872d) {
                        Job job = this.f8870b.f86529a;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        this.f8870b.f86529a = null;
                    }
                    if (event == Lifecycle.a.ON_DESTROY) {
                        CancellableContinuation<h0> cancellableContinuation = this.f8873e;
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        cancellableContinuation.resumeWith(jn0.s.b(h0.f84049a));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0181a(Lifecycle lifecycle, Lifecycle.State state, CoroutineScope coroutineScope, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super C0181a> continuation) {
                super(2, continuation);
                this.f8865u = lifecycle;
                this.f8866v = state;
                this.f8867w = coroutineScope;
                this.f8868x = pVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C0181a(this.f8865u, this.f8866v, this.f8867w, this.f8868x, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00af  */
            /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
            /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.p0$a$a$a, java.lang.Object] */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                n0 n0Var;
                Throwable th2;
                n0 n0Var2;
                Job job;
                u uVar;
                Job job2;
                u uVar2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f8864t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n0Var = (n0) this.f8859o;
                    n0Var2 = (n0) this.f8858n;
                    try {
                        t.b(obj);
                        job2 = (Job) n0Var2.f86529a;
                        if (job2 != null) {
                            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                        }
                        uVar2 = (u) n0Var.f86529a;
                        if (uVar2 != null) {
                            this.f8865u.d(uVar2);
                        }
                        return h0.f84049a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        job = (Job) n0Var2.f86529a;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        uVar = (u) n0Var.f86529a;
                        if (uVar != null) {
                            throw th2;
                        }
                        this.f8865u.d(uVar);
                        throw th2;
                    }
                }
                t.b(obj);
                if (this.f8865u.getState() == Lifecycle.State.DESTROYED) {
                    return h0.f84049a;
                }
                n0 n0Var3 = new n0();
                n0Var = new n0();
                try {
                    Lifecycle.State state = this.f8866v;
                    Lifecycle lifecycle = this.f8865u;
                    CoroutineScope coroutineScope = this.f8867w;
                    p<CoroutineScope, Continuation<? super h0>, Object> pVar = this.f8868x;
                    this.f8858n = n0Var3;
                    this.f8859o = n0Var;
                    this.f8860p = state;
                    this.f8861q = lifecycle;
                    this.f8862r = coroutineScope;
                    this.f8863s = pVar;
                    this.f8864t = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    Lifecycle.a.Companion companion = Lifecycle.a.INSTANCE;
                    ?? c0182a = new C0182a(companion.d(state), n0Var3, coroutineScope, companion.a(state), cancellableContinuationImpl, MutexKt.Mutex$default(false, 1, null), pVar);
                    n0Var.f86529a = c0182a;
                    s.i(c0182a, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lifecycle.a((u) c0182a);
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    n0Var2 = n0Var3;
                    job2 = (Job) n0Var2.f86529a;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                    }
                    uVar2 = (u) n0Var.f86529a;
                    if (uVar2 != null) {
                        this.f8865u.d(uVar2);
                    }
                    return h0.f84049a;
                } catch (Throwable th4) {
                    th2 = th4;
                    n0Var2 = n0Var3;
                    job = (Job) n0Var2.f86529a;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    uVar = (u) n0Var.f86529a;
                    if (uVar != null) {
                        throw th2;
                    }
                    this.f8865u.d(uVar);
                    throw th2;
                }
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C0181a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Lifecycle lifecycle, Lifecycle.State state, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8855p = lifecycle;
            this.f8856q = state;
            this.f8857r = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f8855p, this.f8856q, this.f8857r, continuation);
            aVar.f8854o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f8853n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f8854o;
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                C0181a c0181a = new C0181a(this.f8855p, this.f8856q, coroutineScope, this.f8857r, null);
                this.f8853n = 1;
                if (BuildersKt.withContext(immediate, c0181a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final Object a(Lifecycle lifecycle, Lifecycle.State state, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return h0.f84049a;
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(lifecycle, state, pVar, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : h0.f84049a;
    }

    public static final Object b(LifecycleOwner lifecycleOwner, Lifecycle.State state, p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        Object objA = a(lifecycleOwner.getLifecycle(), state, pVar, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : h0.f84049a;
    }
}
