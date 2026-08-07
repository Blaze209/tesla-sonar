package q1;

import androidx.compose.foundation.MutationInterruptedException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010JR\u0010\u0014\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\t2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u001a\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0016j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lq1/i0;", "", "<init>", "()V", "Lq1/i0$a;", "mutator", "Ljn0/h0;", "g", "(Lq1/i0$a;)V", "R", "Lq1/h0;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", DateTokenConverter.CONVERTER_KEY, "(Lq1/h0;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "f", "(Ljava/lang/Object;Lq1/h0;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lkotlinx/coroutines/sync/Mutex;", "b", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lq1/i0$a;", "", "Lq1/h0;", "priority", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lq1/h0;Lkotlinx/coroutines/Job;)V", "other", "", "a", "(Lq1/i0$a;)Z", "Ljn0/h0;", "b", "()V", "Lq1/h0;", "getPriority", "()Lq1/h0;", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
            this.job.cancel((CancellationException) new MutationInterruptedException());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {EnumC4419g.SDK_ASSET_ICON_PIN_VALUE, 126}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class b<R> extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f104274n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f104275o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f104276p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f104277q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f104278r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ h0 f104279s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ i0 f104280t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ wn0.l<Continuation<? super R>, Object> f104281u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h0 h0Var, i0 i0Var, wn0.l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f104279s = h0Var;
            this.f104280t = i0Var;
            this.f104281u = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f104279s, this.f104280t, this.f104281u, continuation);
            bVar.f104278r = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            a aVar;
            i0 i0Var;
            wn0.l<Continuation<? super R>, Object> lVar;
            Throwable th2;
            i0 i0Var2;
            a aVar2;
            Mutex mutex2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r11 = this.f104277q;
            try {
                try {
                    if (r11 == 0) {
                        jn0.t.b(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.f104278r;
                        h0 h0Var = this.f104279s;
                        CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.INSTANCE);
                        p013kotlin.jvm.internal.s.h(element);
                        a aVar3 = new a(h0Var, (Job) element);
                        this.f104280t.g(aVar3);
                        mutex = this.f104280t.mutex;
                        wn0.l<Continuation<? super R>, Object> lVar2 = this.f104281u;
                        i0 i0Var3 = this.f104280t;
                        this.f104278r = aVar3;
                        this.f104274n = mutex;
                        this.f104275o = lVar2;
                        this.f104276p = i0Var3;
                        this.f104277q = 1;
                        if (mutex.lock(null, this) != coroutine_suspended) {
                            aVar = aVar3;
                            i0Var = i0Var3;
                            lVar = lVar2;
                        }
                        return coroutine_suspended;
                    }
                    if (r11 != 1) {
                        if (r11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i0Var2 = (i0) this.f104275o;
                        mutex2 = (Mutex) this.f104274n;
                        aVar2 = (a) this.f104278r;
                        try {
                            jn0.t.b(obj);
                            androidx.camera.view.i.a(i0Var2.currentMutator, aVar2, null);
                            mutex2.unlock(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            androidx.camera.view.i.a(i0Var2.currentMutator, aVar2, null);
                            throw th2;
                        }
                    }
                    i0Var = (i0) this.f104276p;
                    lVar = (wn0.l) this.f104275o;
                    Mutex mutex3 = (Mutex) this.f104274n;
                    aVar = (a) this.f104278r;
                    jn0.t.b(obj);
                    mutex = mutex3;
                    this.f104278r = aVar;
                    this.f104274n = mutex;
                    this.f104275o = i0Var;
                    this.f104276p = null;
                    this.f104277q = 2;
                    Object objInvoke = lVar.invoke(this);
                    if (objInvoke != coroutine_suspended) {
                        i0Var2 = i0Var;
                        mutex2 = mutex;
                        obj = objInvoke;
                        aVar2 = aVar;
                        androidx.camera.view.i.a(i0Var2.currentMutator, aVar2, null);
                        mutex2.unlock(null);
                        return obj;
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th2 = th4;
                    i0Var2 = i0Var;
                    aVar2 = aVar;
                    androidx.camera.view.i.a(i0Var2.currentMutator, aVar2, null);
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {EnumC4419g.SDK_ASSET_ICON_PIN_VALUE, 167}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class c<R> extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f104282n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f104283o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f104284p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f104285q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f104286r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f104287s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ h0 f104288t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ i0 f104289u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ wn0.p<T, Continuation<? super R>, Object> f104290v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ T f104291w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h0 h0Var, i0 i0Var, wn0.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar, T t11, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f104288t = h0Var;
            this.f104289u = i0Var;
            this.f104290v = pVar;
            this.f104291w = t11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f104288t, this.f104289u, this.f104290v, this.f104291w, continuation);
            cVar.f104287s = obj;
            return cVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            wn0.p pVar;
            a aVar;
            i0 i0Var;
            Object obj2;
            Throwable th2;
            i0 i0Var2;
            a aVar2;
            Mutex mutex2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r11 = this.f104286r;
            try {
                try {
                    if (r11 == 0) {
                        jn0.t.b(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.f104287s;
                        h0 h0Var = this.f104288t;
                        CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.INSTANCE);
                        p013kotlin.jvm.internal.s.h(element);
                        a aVar3 = new a(h0Var, (Job) element);
                        this.f104289u.g(aVar3);
                        mutex = this.f104289u.mutex;
                        pVar = this.f104290v;
                        Object obj3 = this.f104291w;
                        i0 i0Var3 = this.f104289u;
                        this.f104287s = aVar3;
                        this.f104282n = mutex;
                        this.f104283o = pVar;
                        this.f104284p = obj3;
                        this.f104285q = i0Var3;
                        this.f104286r = 1;
                        if (mutex.lock(null, this) != coroutine_suspended) {
                            aVar = aVar3;
                            i0Var = i0Var3;
                            obj2 = obj3;
                        }
                        return coroutine_suspended;
                    }
                    if (r11 != 1) {
                        if (r11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i0Var2 = (i0) this.f104283o;
                        mutex2 = (Mutex) this.f104282n;
                        aVar2 = (a) this.f104287s;
                        try {
                            jn0.t.b(obj);
                            androidx.camera.view.i.a(i0Var2.currentMutator, aVar2, null);
                            mutex2.unlock(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            androidx.camera.view.i.a(i0Var2.currentMutator, aVar2, null);
                            throw th2;
                        }
                    }
                    i0Var = (i0) this.f104285q;
                    obj2 = this.f104284p;
                    pVar = (wn0.p) this.f104283o;
                    Mutex mutex3 = (Mutex) this.f104282n;
                    aVar = (a) this.f104287s;
                    jn0.t.b(obj);
                    mutex = mutex3;
                    this.f104287s = aVar;
                    this.f104282n = mutex;
                    this.f104283o = i0Var;
                    this.f104284p = null;
                    this.f104285q = null;
                    this.f104286r = 2;
                    Object objInvoke = pVar.invoke(obj2, this);
                    if (objInvoke != coroutine_suspended) {
                        i0Var2 = i0Var;
                        mutex2 = mutex;
                        obj = objInvoke;
                        aVar2 = aVar;
                        androidx.camera.view.i.a(i0Var2.currentMutator, aVar2, null);
                        mutex2.unlock(null);
                        return obj;
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th2 = th4;
                    i0Var2 = i0Var;
                    aVar2 = aVar;
                    androidx.camera.view.i.a(i0Var2.currentMutator, aVar2, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r11.unlock(null);
                throw th5;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public static /* synthetic */ Object e(i0 i0Var, h0 h0Var, wn0.l lVar, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            h0Var = h0.Default;
        }
        return i0Var.d(h0Var, lVar, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(a mutator) {
        a aVar;
        do {
            aVar = this.currentMutator.get();
            if (aVar != null && !mutator.a(aVar)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!androidx.camera.view.i.a(this.currentMutator, aVar, mutator));
        if (aVar != null) {
            aVar.b();
        }
    }

    public final <R> Object d(h0 h0Var, wn0.l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new b(h0Var, this, lVar, null), continuation);
    }

    public final <T, R> Object f(T t11, h0 h0Var, wn0.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new c(h0Var, this, pVar, t11, null), continuation);
    }
}
