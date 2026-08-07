package androidx.work;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010\u001d\u001a\u00020\u001c8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/y;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/s;", "Landroidx/work/y$a;", "startWork", "()Lcom/google/common/util/concurrent/s;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/m;", "getForegroundInfo", "Landroidx/work/g;", "data", "Ljn0/h0;", "setProgress", "(Landroidx/work/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Landroidx/work/WorkerParameters;", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends y {
    private final CoroutineDispatcher coroutineContext;
    private final WorkerParameters params;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/work/CoroutineWorker$a;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ljn0/h0;", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "isDispatchNeeded", "(Lkotlin/coroutines/CoroutineContext;)Z", "c", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a extends CoroutineDispatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14429b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final CoroutineDispatcher dispatcher = Dispatchers.getDefault();

        private a() {
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        /* JADX INFO: renamed from: dispatch */
        public void mo574dispatch(CoroutineContext context, Runnable block) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(block, "block");
            dispatcher.mo574dispatch(context, block);
        }

        @Override // kotlinx.coroutines.CoroutineDispatcher
        public boolean isDispatchNeeded(CoroutineContext context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            return dispatcher.isDispatchNeeded(context);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/m;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/work/m;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super m>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f14431n;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f14431n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f14431n = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            return foregroundInfo == coroutine_suspended ? coroutine_suspended : foregroundInfo;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super m> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/y$a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/work/y$a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super y.a>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f14433n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f14433n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f14433n = 1;
            Object objDoWork = coroutineWorker.doWork(this);
            return objDoWork == coroutine_suspended ? coroutine_suspended : objDoWork;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super y.a> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        p013kotlin.jvm.internal.s.k(appContext, "appContext");
        p013kotlin.jvm.internal.s.k(params, "params");
        this.params = params;
        this.coroutineContext = a.f14429b;
    }

    @jn0.e
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, Continuation<? super m> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(Continuation<? super y.a> continuation);

    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(Continuation<? super m> continuation) {
        return getForegroundInfo$suspendImpl(this, continuation);
    }

    @Override // androidx.work.y
    public final com.google.common.util.concurrent.s<m> getForegroundInfoAsync() {
        return w.k(getCoroutineContext().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), null, new b(null), 2, null);
    }

    @Override // androidx.work.y
    public final void onStopped() {
        super.onStopped();
    }

    public final Object setForeground(m mVar, Continuation<? super jn0.h0> continuation) {
        com.google.common.util.concurrent.s<Void> foregroundAsync = setForegroundAsync(mVar);
        p013kotlin.jvm.internal.s.j(foregroundAsync, "setForegroundAsync(...)");
        Object objA = androidx.concurrent.futures.e.a(foregroundAsync, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }

    public final Object setProgress(g gVar, Continuation<? super jn0.h0> continuation) {
        com.google.common.util.concurrent.s<Void> progressAsync = setProgressAsync(gVar);
        p013kotlin.jvm.internal.s.j(progressAsync, "setProgressAsync(...)");
        Object objA = androidx.concurrent.futures.e.a(progressAsync, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }

    @Override // androidx.work.y
    public final com.google.common.util.concurrent.s<y.a> startWork() {
        CoroutineContext coroutineContext = !p013kotlin.jvm.internal.s.f(getCoroutineContext(), a.f14429b) ? getCoroutineContext() : this.params.n();
        p013kotlin.jvm.internal.s.h(coroutineContext);
        return w.k(coroutineContext.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), null, new c(null), 2, null);
    }
}
