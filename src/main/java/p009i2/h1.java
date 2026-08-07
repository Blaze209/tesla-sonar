package p009i2;

import androidx.camera.view.i;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import q1.h0;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0015j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Li2/h1;", "", "<init>", "()V", "Li2/h1$a;", "mutator", "Ljn0/h0;", "f", "(Li2/h1$a;)V", "R", "Lq1/h0;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", DateTokenConverter.CONVERTER_KEY, "(Lq1/h0;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "e", "(Lwn0/a;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/material/InternalAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lkotlinx/coroutines/sync/Mutex;", "b", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Li2/h1$a;", "", "Lq1/h0;", "priority", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lq1/h0;Lkotlinx/coroutines/Job;)V", "other", "", "a", "(Li2/h1$a;)Z", "Ljn0/h0;", "b", "()V", "Lq1/h0;", "getPriority", "()Lq1/h0;", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h0 priority;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Job job;

        public a(h0 h0Var, Job job) {
            this.priority = h0Var;
            this.job = job;
        }

        public final boolean a(a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {177, 99}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class b<R> extends SuspendLambda implements p<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74462n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f74463o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f74464p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f74465q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f74466r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ h0 f74467s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ h1 f74468t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ l<Continuation<? super R>, Object> f74469u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h0 h0Var, h1 h1Var, l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f74467s = h0Var;
            this.f74468t = h1Var;
            this.f74469u = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f74467s, this.f74468t, this.f74469u, continuation);
            bVar.f74466r = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            a aVar;
            h1 h1Var;
            l<Continuation<? super R>, Object> lVar;
            Throwable th2;
            h1 h1Var2;
            a aVar2;
            Mutex mutex2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r11 = this.f74465q;
            try {
                try {
                    if (r11 == 0) {
                        t.b(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.f74466r;
                        h0 h0Var = this.f74467s;
                        CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.INSTANCE);
                        s.h(element);
                        a aVar3 = new a(h0Var, (Job) element);
                        this.f74468t.f(aVar3);
                        mutex = this.f74468t.mutex;
                        l<Continuation<? super R>, Object> lVar2 = this.f74469u;
                        h1 h1Var3 = this.f74468t;
                        this.f74466r = aVar3;
                        this.f74462n = mutex;
                        this.f74463o = lVar2;
                        this.f74464p = h1Var3;
                        this.f74465q = 1;
                        if (mutex.lock(null, this) != coroutine_suspended) {
                            aVar = aVar3;
                            h1Var = h1Var3;
                            lVar = lVar2;
                        }
                        return coroutine_suspended;
                    }
                    if (r11 != 1) {
                        if (r11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h1Var2 = (h1) this.f74463o;
                        mutex2 = (Mutex) this.f74462n;
                        aVar2 = (a) this.f74466r;
                        try {
                            t.b(obj);
                            i.a(h1Var2.currentMutator, aVar2, null);
                            mutex2.unlock(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            i.a(h1Var2.currentMutator, aVar2, null);
                            throw th2;
                        }
                    }
                    h1Var = (h1) this.f74464p;
                    lVar = (l) this.f74463o;
                    Mutex mutex3 = (Mutex) this.f74462n;
                    aVar = (a) this.f74466r;
                    t.b(obj);
                    mutex = mutex3;
                    this.f74466r = aVar;
                    this.f74462n = mutex;
                    this.f74463o = h1Var;
                    this.f74464p = null;
                    this.f74465q = 2;
                    Object objInvoke = lVar.invoke(this);
                    if (objInvoke != coroutine_suspended) {
                        h1Var2 = h1Var;
                        mutex2 = mutex;
                        obj = objInvoke;
                        aVar2 = aVar;
                        i.a(h1Var2.currentMutator, aVar2, null);
                        mutex2.unlock(null);
                        return obj;
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th2 = th4;
                    h1Var2 = h1Var;
                    aVar2 = aVar;
                    i.a(h1Var2.currentMutator, aVar2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r11.unlock(null);
                throw th5;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(a mutator) {
        a aVar;
        do {
            aVar = this.currentMutator.get();
            if (aVar != null && !mutator.a(aVar)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!i.a(this.currentMutator, aVar, mutator));
        if (aVar != null) {
            aVar.b();
        }
    }

    public final <R> Object d(h0 h0Var, l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new b(h0Var, this, lVar, null), continuation);
    }

    public final boolean e(wn0.a<jn0.h0> block) {
        boolean zTryLock$default = Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null);
        if (!zTryLock$default) {
            return zTryLock$default;
        }
        try {
            block.invoke();
            return zTryLock$default;
        } finally {
            Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        }
    }
}
