package va;

import android.os.SystemClock;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002%#B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\u001b\u0010!\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00104R$\u0010:\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b6\u0010\u001c\"\u0004\b8\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010?R\u0011\u0010C\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lva/b;", "", "", "timeoutAmount", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lva/b$b;", "watch", "<init>", "(JLjava/util/concurrent/TimeUnit;Lva/b$b;)V", "Ljn0/h0;", "e", "()V", "Lza/d;", "delegateOpenHelper", "l", "(Lza/d;)V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "k", "(Lkotlinx/coroutines/CoroutineScope;)V", "V", "Lkotlin/Function1;", "Lza/c;", "block", "h", "(Lwn0/l;)Ljava/lang/Object;", "j", "()Lza/c;", "g", "f", "Lkotlin/Function0;", "onAutoClose", "n", "(Lwn0/a;)V", "a", "Lva/b$b;", "b", "Lza/d;", "c", "Lkotlinx/coroutines/CoroutineScope;", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "onAutoCloseCallback", "Ljava/lang/Object;", "lock", "J", "autoCloseTimeoutInMs", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "lastDecrementRefCountTimeStamp", IntegerTokenConverter.CONVERTER_KEY, "Lza/c;", "setDelegateDatabase$room_runtime_release", "(Lza/c;)V", "delegateDatabase", "", "Z", "manuallyClosed", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "autoCloseJob", "m", "()Z", "isActive", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2540b watch;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private za.d delegateOpenHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> onAutoCloseCallback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long autoCloseTimeoutInMs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger referenceCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private AtomicLong lastDecrementRefCountTimeStamp;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private za.c delegateDatabase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean manuallyClosed;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Job autoCloseJob;

    /* JADX INFO: renamed from: va.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lva/b$b;", "", "", "a", "()J", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface InterfaceC2540b {
        long a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.support.AutoCloser$decrementCountAndScheduleClose$2", f = "AutoCloser.android.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f118510n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f118510n;
            if (i11 == 0) {
                t.b(obj);
                long j11 = b.this.autoCloseTimeoutInMs;
                this.f118510n = 1;
                if (DelayKt.delay(j11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            b.this.e();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(long j11, TimeUnit timeUnit, InterfaceC2540b watch) {
        s.k(timeUnit, "timeUnit");
        s.k(watch, "watch");
        this.watch = watch;
        this.lock = new Object();
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j11);
        this.referenceCount = new AtomicInteger(0);
        this.lastDecrementRefCountTimeStamp = new AtomicLong(watch.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        synchronized (this.lock) {
            try {
                if (this.watch.a() - this.lastDecrementRefCountTimeStamp.get() < this.autoCloseTimeoutInMs) {
                    return;
                }
                if (this.referenceCount.get() != 0) {
                    return;
                }
                wn0.a<h0> aVar = this.onAutoCloseCallback;
                if (aVar == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                aVar.invoke();
                za.c cVar = this.delegateDatabase;
                if (cVar != null && cVar.isOpen()) {
                    cVar.close();
                }
                this.delegateDatabase = null;
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                Job job = this.autoCloseJob;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.autoCloseJob = null;
                za.c cVar = this.delegateDatabase;
                if (cVar != null) {
                    cVar.close();
                }
                this.delegateDatabase = null;
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        CoroutineScope coroutineScope;
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Unbalanced reference count.");
        }
        this.lastDecrementRefCountTimeStamp.set(this.watch.a());
        if (iDecrementAndGet == 0) {
            CoroutineScope coroutineScope2 = this.coroutineScope;
            if (coroutineScope2 == null) {
                s.B("coroutineScope");
                coroutineScope = null;
            } else {
                coroutineScope = coroutineScope2;
            }
            this.autoCloseJob = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(null), 3, null);
        }
    }

    public final <V> V h(wn0.l<? super za.c, ? extends V> block) {
        s.k(block, "block");
        try {
            return block.invoke(j());
        } finally {
            g();
        }
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final za.c getDelegateDatabase() {
        return this.delegateDatabase;
    }

    public final za.c j() {
        Job job = this.autoCloseJob;
        za.d dVar = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.autoCloseJob = null;
        this.referenceCount.incrementAndGet();
        if (this.manuallyClosed) {
            throw new IllegalStateException("Attempting to open already closed database.");
        }
        synchronized (this.lock) {
            za.c cVar = this.delegateDatabase;
            if (cVar != null && cVar.isOpen()) {
                return cVar;
            }
            za.d dVar2 = this.delegateOpenHelper;
            if (dVar2 == null) {
                s.B("delegateOpenHelper");
            } else {
                dVar = dVar2;
            }
            za.c writableDatabase = dVar.getWritableDatabase();
            this.delegateDatabase = writableDatabase;
            return writableDatabase;
        }
    }

    public final void k(CoroutineScope coroutineScope) {
        s.k(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
    }

    public final void l(za.d delegateOpenHelper) {
        s.k(delegateOpenHelper, "delegateOpenHelper");
        if (delegateOpenHelper instanceof g) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.delegateOpenHelper = delegateOpenHelper;
    }

    public final boolean m() {
        return !this.manuallyClosed;
    }

    public final void n(wn0.a<h0> onAutoClose) {
        s.k(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    public /* synthetic */ b(long j11, TimeUnit timeUnit, InterfaceC2540b interfaceC2540b, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, timeUnit, (i11 & 4) != 0 ? new InterfaceC2540b() { // from class: va.a
            @Override // va.b.InterfaceC2540b
            public final long a() {
                return b.b();
            }
        } : interfaceC2540b);
    }
}
