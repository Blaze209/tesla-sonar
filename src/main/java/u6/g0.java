package u6;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006\""}, d2 = {"Lu6/g0;", "Lu6/s;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "c", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "a", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Ljava/lang/String;", "Lkotlinx/coroutines/sync/Mutex;", "b", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lu6/b;", "Lu6/b;", "version", "Lkotlinx/coroutines/flow/Flow;", "Ljn0/h0;", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "updateNotifications", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g0 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String filePath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Mutex mutex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u6.b version;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Flow<jn0.h0> updateNotifications;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", i = {0, 0, 1}, l = {66, 41}, m = "lock", n = {"block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class a<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115481n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115482o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f115483p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f115485r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115483p = obj;
            this.f115485r |= Integer.MIN_VALUE;
            return g0.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", i = {0, 0}, l = {50}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv"}, s = {"L$0", "Z$0"})
    static final class b<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115486n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f115487o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f115488p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f115490r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115488p = obj;
            this.f115490r |= Integer.MIN_VALUE;
            return g0.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<FlowCollector<? super jn0.h0>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115491n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f115491n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super jn0.h0> flowCollector, Continuation<? super jn0.h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public g0(String filePath) {
        p013kotlin.jvm.internal.s.k(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.version = new u6.b(0);
        this.updateNotifications = FlowKt.flow(new c(null));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u6.s
    public <T> Object a(wn0.p<? super Boolean, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) throws Throwable {
        b bVar;
        Mutex mutex;
        Throwable th2;
        boolean z11;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f115490r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f115490r = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f115488p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f115490r;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = bVar.f115487o;
            mutex = (Mutex) bVar.f115486n;
            try {
                jn0.t.b(obj);
                if (z11) {
                    mutex.unlock(null);
                }
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                if (z11) {
                    mutex.unlock(null);
                }
                throw th2;
            }
        }
        jn0.t.b(obj);
        Mutex mutex2 = this.mutex;
        boolean zTryLock = mutex2.tryLock(null);
        try {
            Boolean boolBoxBoolean = Boxing.boxBoolean(zTryLock);
            bVar.f115486n = mutex2;
            bVar.f115487o = zTryLock;
            bVar.f115490r = 1;
            Object objInvoke = pVar.invoke(boolBoxBoolean, bVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
            obj = objInvoke;
            z11 = zTryLock;
            if (z11) {
                mutex.unlock(null);
            }
            return obj;
        } catch (Throwable th4) {
            mutex = mutex2;
            th2 = th4;
            z11 = zTryLock;
            if (z11) {
                mutex.unlock(null);
            }
            throw th2;
        }
    }

    @Override // u6.s
    public Flow<jn0.h0> b() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u6.s
    public <T> Object c(wn0.l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) throws Throwable {
        a aVar;
        Mutex mutex;
        Throwable th2;
        Mutex mutex2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f115485r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f115485r = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f115483p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f115485r;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                mutex = this.mutex;
                aVar.f115481n = lVar;
                aVar.f115482o = mutex;
                aVar.f115485r = 1;
                if (mutex.lock(null, aVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) aVar.f115481n;
                try {
                    jn0.t.b(obj);
                    mutex2.unlock(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    mutex2.unlock(null);
                    throw th2;
                }
            }
            Mutex mutex3 = (Mutex) aVar.f115482o;
            wn0.l<? super Continuation<? super T>, ? extends Object> lVar2 = (wn0.l) aVar.f115481n;
            jn0.t.b(obj);
            mutex = mutex3;
            lVar = lVar2;
            aVar.f115481n = mutex;
            aVar.f115482o = null;
            aVar.f115485r = 2;
            Object objInvoke = lVar.invoke(aVar);
            if (objInvoke != coroutine_suspended) {
                Mutex mutex4 = mutex;
                obj = objInvoke;
                mutex2 = mutex4;
                mutex2.unlock(null);
                return obj;
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            Mutex mutex5 = mutex;
            th2 = th4;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th2;
        }
    }

    @Override // u6.s
    public Object d(Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.version.b());
    }

    @Override // u6.s
    public Object e(Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.version.d());
    }
}
