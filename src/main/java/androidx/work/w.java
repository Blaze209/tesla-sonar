package androidx.work;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "Lcom/google/common/util/concurrent/s;", "j", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lwn0/p;)Lcom/google/common/util/concurrent/s;", "V", "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "f", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lwn0/a;)Lcom/google/common/util/concurrent/s;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f14780n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f14781o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.p<CoroutineScope, Continuation<? super T>, Object> f14782p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a<T> f14783q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, androidx.concurrent.futures.c.a<T> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14782p = pVar;
            this.f14783q = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f14782p, this.f14783q, continuation);
            aVar.f14781o = obj;
            return aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.work.w$a for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.f14780n
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                jn0.t.b(r4)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                goto L2b
            Lf:
                r4 = move-exception
                goto L31
            L11:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L19:
                jn0.t.b(r4)
                java.lang.Object r4 = r3.f14781o
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                wn0.p<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r1 = r3.f14782p     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                r3.f14780n = r2     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                java.lang.Object r4 = r1.invoke(r4, r3)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                if (r4 != r0) goto L2b
                return r0
            L2b:
                androidx.concurrent.futures.c$a<T> r0 = r3.f14783q     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                r0.c(r4)     // Catch: java.lang.Throwable -> Lf java.util.concurrent.CancellationException -> L37
                goto L3c
            L31:
                androidx.concurrent.futures.c$a<T> r0 = r3.f14783q
                r0.f(r4)
                goto L3c
            L37:
                androidx.concurrent.futures.c$a<T> r4 = r3.f14783q
                r4.d()
            L3c:
                jn0.h0 r4 = jn0.h0.f84049a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.w.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public static final <V> com.google.common.util.concurrent.s<V> f(final Executor executor, final String debugTag, final wn0.a<? extends V> block) {
        p013kotlin.jvm.internal.s.k(executor, "<this>");
        p013kotlin.jvm.internal.s.k(debugTag, "debugTag");
        p013kotlin.jvm.internal.s.k(block, "block");
        com.google.common.util.concurrent.s<V> sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.work.s
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return w.g(executor, debugTag, block, aVar);
            }
        });
        p013kotlin.jvm.internal.s.j(sVarA, "getFuture(...)");
        return sVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(Executor executor, String str, final wn0.a aVar, final androidx.concurrent.futures.c.a completer) {
        p013kotlin.jvm.internal.s.k(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.a(new Runnable() { // from class: androidx.work.u
            @Override // java.lang.Runnable
            public final void run() {
                w.h(atomicBoolean);
            }
        }, j.INSTANCE);
        executor.execute(new Runnable() { // from class: androidx.work.v
            @Override // java.lang.Runnable
            public final void run() {
                w.i(atomicBoolean, completer, aVar);
            }
        });
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AtomicBoolean atomicBoolean, androidx.concurrent.futures.c.a aVar, wn0.a aVar2) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(aVar2.invoke());
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }

    public static final <T> com.google.common.util.concurrent.s<T> j(final CoroutineContext context, final CoroutineStart start, final wn0.p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(start, "start");
        p013kotlin.jvm.internal.s.k(block, "block");
        com.google.common.util.concurrent.s<T> sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.work.r
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return w.l(context, start, block, aVar);
            }
        });
        p013kotlin.jvm.internal.s.j(sVarA, "getFuture(...)");
        return sVarA;
    }

    public static /* synthetic */ com.google.common.util.concurrent.s k(CoroutineContext coroutineContext, CoroutineStart coroutineStart, wn0.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return j(coroutineContext, coroutineStart, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(CoroutineContext coroutineContext, CoroutineStart coroutineStart, wn0.p pVar, androidx.concurrent.futures.c.a completer) {
        p013kotlin.jvm.internal.s.k(completer, "completer");
        final Job job = (Job) coroutineContext.get(Job.INSTANCE);
        completer.a(new Runnable() { // from class: androidx.work.t
            @Override // java.lang.Runnable
            public final void run() {
                w.m(job);
            }
        }, j.INSTANCE);
        return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineContext), null, coroutineStart, new a(pVar, completer, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(Job job) {
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}
