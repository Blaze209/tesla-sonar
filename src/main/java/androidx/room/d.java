package androidx.room;

import android.os.CancellationSignal;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/d;", "", "a", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.room.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/room/d$a;", "", "<init>", "()V", "R", "Landroidx/room/b0;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "b", "(Landroidx/room/b0;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "a", "(Landroidx/room/b0;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", i = {0}, l = {48, 49}, m = "execute", n = {"callable"}, s = {"L$0"})
        static final class C0225a<R> extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f13665n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f13666o;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f13668q;

            C0225a(Continuation<? super C0225a> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f13666o = obj;
                this.f13668q |= Integer.MIN_VALUE;
                return Companion.this.b(null, false, null, this);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [R] */
        /* JADX INFO: renamed from: androidx.room.d$a$b */
        @Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "R", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b<R> extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super R>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f13669n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Callable<R> f13670o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Callable<R> callable, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f13670o = callable;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f13670o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f13669n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return this.f13670o.call();
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: androidx.room.d$a$c */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {64, 94}, m = "execute", n = {"db", "cancellationSignal", "callable", "db", "cancellationSignal", "callable", CoreConstants.CONTEXT_SCOPE_VALUE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
        static final class c<R> extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f13671n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f13672o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f13673p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f13674q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f13675r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f13677t;

            c(Continuation<? super c> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f13675r = obj;
                this.f13677t |= Integer.MIN_VALUE;
                return Companion.this.a(null, false, null, null, this);
            }
        }

        /* JADX INFO: renamed from: androidx.room.d$a$d, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C0226d implements wn0.l<Throwable, jn0.h0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellationSignal f13678a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Job f13679b;

            C0226d(CancellationSignal cancellationSignal, Job job) {
                this.f13678a = cancellationSignal;
                this.f13679b = job;
            }

            public final void a(Throwable th2) {
                CancellationSignal cancellationSignal = this.f13678a;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                Job.DefaultImpls.cancel$default(this.f13679b, (CancellationException) null, 1, (Object) null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(Throwable th2) {
                a(th2);
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: androidx.room.d$a$e */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f13680n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Callable<R> f13681o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ CancellableContinuation<R> f13682p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            e(Callable<R> callable, CancellableContinuation<? super R> cancellableContinuation, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f13681o = callable;
                this.f13682p = cancellableContinuation;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new e(this.f13681o, this.f13682p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f13680n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                try {
                    this.f13682p.resumeWith(jn0.s.b(this.f13681o.call()));
                } catch (Throwable th2) {
                    Continuation continuation = this.f13682p;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    continuation.resumeWith(jn0.s.b(jn0.t.a(th2)));
                }
                return jn0.h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        @jn0.e
        public final <R> Object a(b0 b0Var, boolean z11, CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
            c cVar;
            CancellationSignal cancellationSignal2;
            Callable<R> callable2;
            Object objD;
            b0 b0Var2 = b0Var;
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i11 = cVar.f13677t;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    cVar.f13677t = i11 - Integer.MIN_VALUE;
                } else {
                    cVar = new c(continuation);
                }
            } else {
                cVar = new c(continuation);
            }
            Object obj = cVar.f13675r;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = cVar.f13677t;
            if (i12 == 0) {
                jn0.t.b(obj);
                if (b0Var2.isOpenInternal() && b0Var2.inTransaction()) {
                    return callable.call();
                }
                cVar.f13671n = b0Var2;
                cancellationSignal2 = cancellationSignal;
                cVar.f13672o = cancellationSignal2;
                callable2 = callable;
                cVar.f13673p = callable2;
                cVar.f13677t = 1;
                objD = wa.b.d(b0Var2, z11, cVar);
                if (objD != coroutine_suspended) {
                }
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            Callable<R> callable3 = (Callable) cVar.f13673p;
            CancellationSignal cancellationSignal3 = (CancellationSignal) cVar.f13672o;
            b0 b0Var3 = (b0) cVar.f13671n;
            jn0.t.b(obj);
            callable2 = callable3;
            b0Var2 = b0Var3;
            objD = obj;
            cancellationSignal2 = cancellationSignal3;
            CoroutineContext coroutineContext = (CoroutineContext) objD;
            cVar.f13671n = b0Var2;
            cVar.f13672o = cancellationSignal2;
            cVar.f13673p = callable2;
            cVar.f13674q = coroutineContext;
            cVar.f13677t = 2;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(cVar), 1);
            cancellableContinuationImpl.initCancellability();
            cancellableContinuationImpl.invokeOnCancellation(new C0226d(cancellationSignal2, BuildersKt__Builders_commonKt.launch$default(b0Var2.getCoroutineScope(), coroutineContext, null, new e(callable2, cancellableContinuationImpl, null), 2, null)));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(cVar);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @jn0.e
        public final <R> Object b(b0 b0Var, boolean z11, Callable<R> callable, Continuation<? super R> continuation) {
            C0225a c0225a;
            if (continuation instanceof C0225a) {
                c0225a = (C0225a) continuation;
                int i11 = c0225a.f13668q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c0225a.f13668q = i11 - Integer.MIN_VALUE;
                } else {
                    c0225a = new C0225a(continuation);
                }
            } else {
                c0225a = new C0225a(continuation);
            }
            Object objD = c0225a.f13666o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = c0225a.f13668q;
            if (i12 == 0) {
                jn0.t.b(objD);
                if (b0Var.isOpenInternal() && b0Var.inTransaction()) {
                    return callable.call();
                }
                c0225a.f13665n = callable;
                c0225a.f13668q = 1;
                objD = wa.b.d(b0Var, z11, c0225a);
                if (objD != coroutine_suspended) {
                }
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(objD);
                return objD;
            }
            callable = (Callable) c0225a.f13665n;
            jn0.t.b(objD);
            b bVar = new b(callable, null);
            c0225a.f13665n = null;
            c0225a.f13668q = 2;
            Object objWithContext = BuildersKt.withContext((CoroutineContext) objD, bVar, c0225a);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        }

        private Companion() {
        }
    }

    @jn0.e
    public static final <R> Object a(b0 b0Var, boolean z11, CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
        return INSTANCE.a(b0Var, z11, cancellationSignal, callable, continuation);
    }

    @jn0.e
    public static final <R> Object b(b0 b0Var, boolean z11, Callable<R> callable, Continuation<? super R> continuation) {
        return INSTANCE.b(b0Var, z11, callable, continuation);
    }
}
