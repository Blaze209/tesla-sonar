package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.IInterface;
import androidx.work.z;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.common.util.concurrent.s;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a0\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0080@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/os/IInterface;", "T", "Ljava/util/concurrent/Executor;", "executor", "Lcom/google/common/util/concurrent/s;", "iInterface", "Lwb/b;", "dispatcher", "", "a", "(Ljava/util/concurrent/Executor;Lcom/google/common/util/concurrent/s;Lwb/b;)Lcom/google/common/util/concurrent/s;", "b", "(Landroid/os/IInterface;Lwb/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/IBinder;", "Landroid/os/IBinder$DeathRecipient;", "recipient", "Ljn0/h0;", "c", "(Landroid/os/IBinder;Landroid/os/IBinder$DeathRecipient;)V", "work-multiprocess_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.multiprocess.RemoteExecuteKt$execute$1", f = "RemoteExecute.kt", i = {}, l = {43, 50}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super byte[]>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f14706n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ s<T> f14707o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wb.b<T> f14708p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<T> sVar, wb.b<T> bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14707o = sVar;
            this.f14708p = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f14707o, this.f14708p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f14706n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    s<T> sVar = this.f14707o;
                    this.f14706n = 1;
                    obj = androidx.concurrent.futures.e.a(sVar, this);
                    if (obj == coroutine_suspended) {
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                IInterface iInterface = (IInterface) obj;
                wb.b<T> bVar = this.f14708p;
                this.f14706n = 2;
                Object objB = f.b(iInterface, bVar, this);
                return objB == coroutine_suspended ? coroutine_suspended : objB;
            } catch (Throwable th2) {
                if (!(th2 instanceof CancellationException)) {
                    z.e().d(e.f14699e, "Unable to bind to service", th2);
                }
                throw th2;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.multiprocess.RemoteExecuteKt", f = "RemoteExecute.kt", i = {0, 0, 0, 0}, l = {61}, m = "execute", n = {"iInterface", "dispatcher", "deathRecipient", "binder"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class b<T extends IInterface> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f14709n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f14710o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f14711p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f14712q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f14713r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f14714s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14713r = obj;
            this.f14714s |= Integer.MIN_VALUE;
            return f.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/work/multiprocess/f$c", "Landroidx/work/multiprocess/c$a;", "", "response", "Ljn0/h0;", "d1", "([B)V", "", AnalyticsAttribute.Error, "u2", "(Ljava/lang/String;)V", "work-multiprocess_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends androidx.work.multiprocess.c.a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation<byte[]> f14715n;

        /* JADX WARN: Multi-variable type inference failed */
        c(Continuation<? super byte[]> continuation) {
            this.f14715n = continuation;
        }

        @Override // androidx.work.multiprocess.c
        public void d1(byte[] response) {
            p013kotlin.jvm.internal.s.k(response, "response");
            this.f14715n.resumeWith(jn0.s.b(response));
        }

        @Override // androidx.work.multiprocess.c
        public void u2(String error) {
            Continuation<byte[]> continuation = this.f14715n;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            continuation.resumeWith(jn0.s.b(t.a(new RuntimeException(error))));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation<byte[]> f14716a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Continuation<? super byte[]> continuation) {
            this.f14716a = continuation;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            Continuation<byte[]> continuation = this.f14716a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            continuation.resumeWith(jn0.s.b(t.a(new RuntimeException("Binder died"))));
        }
    }

    public static final <T extends IInterface> s<byte[]> a(Executor executor, s<T> iInterface, wb.b<T> dispatcher) {
        p013kotlin.jvm.internal.s.k(executor, "executor");
        p013kotlin.jvm.internal.s.k(iInterface, "iInterface");
        p013kotlin.jvm.internal.s.k(dispatcher, "dispatcher");
        return androidx.concurrent.futures.g.f6458a.b(ExecutorsKt.from(executor).plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), false, new a(iInterface, dispatcher, null));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a1 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:33:0x009d, B:35:0x00a1, B:38:0x00af), top: B:47:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, android.os.IBinder$DeathRecipient, androidx.work.multiprocess.f$d] */
    public static final <T extends IInterface> Object b(T t11, wb.b<T> bVar, Continuation<? super byte[]> continuation) {
        b bVar2;
        n0 n0Var;
        Throwable th2;
        IBinder iBinder;
        if (continuation instanceof b) {
            bVar2 = (b) continuation;
            int i11 = bVar2.f14714s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar2.f14714s = i11 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(continuation);
            }
        } else {
            bVar2 = new b(continuation);
        }
        Object obj = bVar2.f14713r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar2.f14714s;
        if (i12 == 0) {
            t.b(obj);
            n0 n0Var2 = new n0();
            IBinder iBinderAsBinder = t11.asBinder();
            try {
                bVar2.f14709n = t11;
                bVar2.f14710o = bVar;
                bVar2.f14711p = n0Var2;
                bVar2.f14712q = iBinderAsBinder;
                bVar2.f14714s = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(bVar2));
                ?? dVar = new d(safeContinuation);
                n0Var2.f86529a = dVar;
                iBinderAsBinder.linkToDeath(dVar, 0);
                bVar.a(t11, new c(safeContinuation));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(bVar2);
                }
                if (orThrow == coroutine_suspended) {
                    return coroutine_suspended;
                }
                n0Var = n0Var2;
                obj = orThrow;
                iBinder = iBinderAsBinder;
            } catch (Throwable th3) {
                n0Var = n0Var2;
                th2 = th3;
                iBinder = iBinderAsBinder;
                if (!(th2 instanceof CancellationException)) {
                    z.e().d(e.f14699e, "Unable to execute", th2);
                }
                throw th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iBinder = (IBinder) bVar2.f14712q;
            n0Var = (n0) bVar2.f14711p;
            try {
                t.b(obj);
                iBinder = iBinder;
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    if (!(th2 instanceof CancellationException)) {
                        z.e().d(e.f14699e, "Unable to execute", th2);
                    }
                    throw th2;
                } catch (Throwable th5) {
                    IBinder.DeathRecipient deathRecipient = (IBinder.DeathRecipient) n0Var.f86529a;
                    if (deathRecipient != null) {
                        p013kotlin.jvm.internal.s.h(iBinder);
                        c(iBinder, deathRecipient);
                    }
                    throw th5;
                }
            }
        }
        byte[] bArr = (byte[]) obj;
        IBinder.DeathRecipient deathRecipient2 = (IBinder.DeathRecipient) n0Var.f86529a;
        if (deathRecipient2 != null) {
            p013kotlin.jvm.internal.s.h(iBinder);
            c(iBinder, deathRecipient2);
        }
        return bArr;
    }

    private static final void c(IBinder iBinder, IBinder.DeathRecipient deathRecipient) {
        try {
            iBinder.unlinkToDeath(deathRecipient, 0);
        } catch (NoSuchElementException unused) {
        }
    }
}
