package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.core.util.Consumer;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.x0;
import androidx.work.y;
import androidx.work.y0;
import androidx.work.z;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.common.util.concurrent.s;
import com.plaid.internal.EnumC4419g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import lb.e1;
import ob.m;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import qb.n;
import sb.m0;
import sb.n0;
import tb.o0;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/y$a;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/y;", "delegate", "Lob/m;", "workConstraintsTracker", "Lsb/m0;", "workSpec", DateTokenConverter.CONVERTER_KEY, "(Landroidx/work/y;Lob/m;Lsb/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doWork", "c", "Landroidx/work/WorkerParameters;", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters workerParameters;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "stopReason", "<init>", "(I)V", "a", "I", "()I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a extends CancellationException {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int stopReason;

        public a(int i11) {
            this.stopReason = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getStopReason() {
            return this.stopReason;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/y$a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/work/y$a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2", f = "ConstraintTrackingWorker.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super y.a>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f14620n;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return ConstraintTrackingWorker.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f14620n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            this.f14620n = 1;
            Object objE = constraintTrackingWorker.e(this);
            return objE == coroutine_suspended ? coroutine_suspended : objE;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super y.a> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", i = {}, l = {125}, m = "runWorker", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f14622n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f14624p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14622n = obj;
            this.f14624p |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.d(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/y$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/work/y$a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", i = {0, 0, 0}, l = {134}, m = "invokeSuspend", n = {"atomicReason", "future", "constraintTrackingJob"}, s = {"L$0", "L$1", "L$2"})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super y.a>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f14625n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f14626o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f14627p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f14628q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ y f14629r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ m f14630s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ m0 f14631t;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1", f = "ConstraintTrackingWorker.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f14632n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ m f14633o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ m0 f14634p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f14635q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ s<y.a> f14636r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, m0 m0Var, AtomicInteger atomicInteger, s<y.a> sVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f14633o = mVar;
                this.f14634p = m0Var;
                this.f14635q = atomicInteger;
                this.f14636r = sVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f14633o, this.f14634p, this.f14635q, this.f14636r, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f14632n;
                if (i11 == 0) {
                    t.b(obj);
                    m mVar = this.f14633o;
                    m0 m0Var = this.f14634p;
                    this.f14632n = 1;
                    obj = vb.a.c(mVar, m0Var, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                this.f14635q.set(((Number) obj).intValue());
                this.f14636r.cancel(true);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(y yVar, m mVar, m0 m0Var, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f14629r = yVar;
            this.f14630s = mVar;
            this.f14631t = m0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f14629r, this.f14630s, this.f14631t, continuation);
            dVar.f14628q = obj;
            return dVar;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.Job] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            AtomicInteger atomicInteger;
            s<y.a> sVar;
            Job job;
            CancellationException cancellationException;
            boolean z11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r11 = this.f14627p;
            try {
                if (r11 == 0) {
                    t.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f14628q;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    s<y.a> sVarStartWork = this.f14629r.startWork();
                    p013kotlin.jvm.internal.s.j(sVarStartWork, "startWork(...)");
                    Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(this.f14630s, this.f14631t, atomicInteger2, sVarStartWork, null), 3, null);
                    try {
                        this.f14628q = atomicInteger2;
                        this.f14625n = sVarStartWork;
                        this.f14626o = jobLaunch$default;
                        this.f14627p = 1;
                        Object objA = androidx.concurrent.futures.e.a(sVarStartWork, this);
                        if (objA == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sVar = sVarStartWork;
                        obj = objA;
                        atomicInteger = atomicInteger2;
                        job = jobLaunch$default;
                    } catch (CancellationException e11) {
                        e = e11;
                        atomicInteger = atomicInteger2;
                        sVar = sVarStartWork;
                        cancellationException = e;
                        String str = vb.a.f118555a;
                        y yVar = this.f14629r;
                        z.e().b(str, "Delegated worker " + yVar.getClass() + " was cancelled", cancellationException);
                        if (atomicInteger.get() != -256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (sVar.isCancelled()) {
                            throw cancellationException;
                        }
                        throw cancellationException;
                    } catch (Throwable th3) {
                        th2 = th3;
                        String str2 = vb.a.f118555a;
                        y yVar2 = this.f14629r;
                        z.e().b(str2, "Delegated worker " + yVar2.getClass() + " threw exception in startWork.", th2);
                        throw th2;
                    }
                } else {
                    if (r11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    job = (Job) this.f14626o;
                    sVar = (s) this.f14625n;
                    atomicInteger = (AtomicInteger) this.f14628q;
                    try {
                        t.b(obj);
                    } catch (CancellationException e12) {
                        e = e12;
                        cancellationException = e;
                        String str3 = vb.a.f118555a;
                        y yVar3 = this.f14629r;
                        z.e().b(str3, "Delegated worker " + yVar3.getClass() + " was cancelled", cancellationException);
                        if (atomicInteger.get() != -256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (sVar.isCancelled() || !z11) {
                            throw cancellationException;
                        }
                        throw new a(atomicInteger.get());
                    } catch (Throwable th4) {
                        th2 = th4;
                        String str4 = vb.a.f118555a;
                        y yVar4 = this.f14629r;
                        z.e().b(str4, "Delegated worker " + yVar4.getClass() + " threw exception in startWork.", th2);
                        throw th2;
                    }
                }
                y.a aVar = (y.a) obj;
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                return aVar;
            } catch (Throwable th5) {
                Job.DefaultImpls.cancel$default((Job) r11, (CancellationException) null, 1, (Object) null);
                throw th5;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super y.a> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", i = {0}, l = {97}, m = "setupAndRunConstraintTrackingWork", n = {"delegate"}, s = {"L$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f14637n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f14638o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f14640q;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14638o = obj;
            this.f14640q |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/y$a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/work/y$a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5", f = "ConstraintTrackingWorker.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super y.a>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f14641n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ y f14643p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ m f14644q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ m0 f14645r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(y yVar, m mVar, m0 m0Var, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f14643p = yVar;
            this.f14644q = mVar;
            this.f14645r = m0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return ConstraintTrackingWorker.this.new f(this.f14643p, this.f14644q, this.f14645r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f14641n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            y yVar = this.f14643p;
            m mVar = this.f14644q;
            m0 m0Var = this.f14645r;
            this.f14641n = 1;
            Object objD = constraintTrackingWorker.d(yVar, mVar, m0Var, this);
            return objD == coroutine_suspended ? coroutine_suspended : objD;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super y.a> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        p013kotlin.jvm.internal.s.k(appContext, "appContext");
        p013kotlin.jvm.internal.s.k(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(y yVar, m mVar, m0 m0Var, Continuation<? super y.a> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f14624p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f14624p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objCoroutineScope = cVar.f14622n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f14624p;
        if (i12 == 0) {
            t.b(objCoroutineScope);
            d dVar = new d(yVar, mVar, m0Var, null);
            cVar.f14624p = 1;
            objCoroutineScope = CoroutineScopeKt.coroutineScope(dVar, cVar);
            if (objCoroutineScope == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objCoroutineScope);
        }
        p013kotlin.jvm.internal.s.j(objCoroutineScope, "coroutineScope(...)");
        return objCoroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.work.y] */
    public final Object e(Continuation<? super y.a> continuation) {
        e eVar;
        int stopReason;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f14640q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f14640q = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object objWithContext = eVar2.f14638o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r11 = eVar2.f14640q;
        try {
            if (r11 == 0) {
                t.b(objWithContext);
                String strI = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (strI == null || strI.length() == 0) {
                    z.e().c(vb.a.f118555a, "No worker to delegate to.");
                    y.a aVarA = y.a.a();
                    p013kotlin.jvm.internal.s.j(aVarA, "failure(...)");
                    return aVarA;
                }
                e1 e1VarS = e1.s(getApplicationContext());
                p013kotlin.jvm.internal.s.j(e1VarS, "getInstance(...)");
                n0 n0VarJ = e1VarS.y().j();
                String string = getId().toString();
                p013kotlin.jvm.internal.s.j(string, "toString(...)");
                m0 m0VarT = n0VarJ.t(string);
                if (m0VarT == null) {
                    y.a aVarA2 = y.a.a();
                    p013kotlin.jvm.internal.s.j(aVarA2, "failure(...)");
                    return aVarA2;
                }
                n nVarX = e1VarS.x();
                p013kotlin.jvm.internal.s.j(nVarX, "getTrackers(...)");
                m mVar = new m(nVarX);
                if (!mVar.b(m0VarT)) {
                    String str = vb.a.f118555a;
                    z.e().a(str, "Constraints not met for delegate " + strI + ". Requesting retry.");
                    y.a aVarD = y.a.d();
                    p013kotlin.jvm.internal.s.j(aVarD, "retry(...)");
                    return aVarD;
                }
                String str2 = vb.a.f118555a;
                z.e().a(str2, "Constraints met for delegate " + strI);
                try {
                    y0 workerFactory = getWorkerFactory();
                    Context applicationContext = getApplicationContext();
                    p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
                    y yVarB = workerFactory.b(applicationContext, strI, this.workerParameters);
                    Executor executorC = this.workerParameters.k().c();
                    p013kotlin.jvm.internal.s.j(executorC, "getMainThreadExecutor(...)");
                    CoroutineDispatcher coroutineDispatcherFrom = ExecutorsKt.from(executorC);
                    f fVar = new f(yVarB, mVar, m0VarT, null);
                    eVar2.f14637n = yVarB;
                    eVar2.f14640q = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcherFrom, fVar, eVar2);
                    r11 = yVarB;
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    z.e().a(vb.a.f118555a, "No worker to delegate to.");
                    Consumer<x0> consumerS = e1VarS.q().s();
                    if (consumerS != null) {
                        o0.a(consumerS, new x0(strI, this.workerParameters, th2), vb.a.f118555a);
                    }
                    y.a aVarA3 = y.a.a();
                    p013kotlin.jvm.internal.s.j(aVarA3, "failure(...)");
                    return aVarA3;
                }
            } else {
                if (r11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y yVar = (y) eVar2.f14637n;
                t.b(objWithContext);
                r11 = yVar;
            }
            return (y.a) objWithContext;
        } catch (CancellationException e11) {
            if (isStopped() || (e11 instanceof a)) {
                if (Build.VERSION.SDK_INT < 31) {
                    stopReason = -512;
                } else if (isStopped()) {
                    stopReason = getStopReason();
                } else {
                    if (!(e11 instanceof a)) {
                        throw new IllegalStateException("Unreachable");
                    }
                    stopReason = ((a) e11).getStopReason();
                }
                r11.stop(stopReason);
            }
            if (!(e11 instanceof a)) {
                throw e11;
            }
            y.a aVarD2 = y.a.d();
            p013kotlin.jvm.internal.s.h(aVarD2);
            return aVarD2;
        }
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super y.a> continuation) {
        Executor backgroundExecutor = getBackgroundExecutor();
        p013kotlin.jvm.internal.s.j(backgroundExecutor, "getBackgroundExecutor(...)");
        return BuildersKt.withContext(ExecutorsKt.from(backgroundExecutor), new b(null), continuation);
    }
}
