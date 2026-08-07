package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.m;
import androidx.work.multiprocess.RemoteListenableDelegatingWorker;
import androidx.work.y;
import androidx.work.z;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import lb.e1;
import lb.r1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import xb.ParcelableForegroundInfo;
import xb.ParcelableInterruptRequest;
import xb.h;
import xb.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;", "Landroidx/work/y;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/s;", "Landroidx/work/y$a;", "startWork", "()Lcom/google/common/util/concurrent/s;", "Landroidx/work/m;", "getForegroundInfoAsync", "Ljn0/h0;", "onStopped", "()V", "c", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "Landroidx/work/WorkerParameters;", "Landroidx/work/multiprocess/e;", "e", "Landroidx/work/multiprocess/e;", "f", "()Landroidx/work/multiprocess/e;", "client", "Landroid/content/ComponentName;", "Landroid/content/ComponentName;", "componentName", "g", "a", "work-multiprocess_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteListenableDelegatingWorker extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters workerParameters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e client;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ComponentName componentName;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.multiprocess.RemoteListenableDelegatingWorker$getForegroundInfoAsync$$inlined$executeRemote$1", f = "RemoteListenableDelegatingWorker.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super m>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f14656n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ RemoteListenableDelegatingWorker f14658p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements wb.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RemoteListenableDelegatingWorker f14659a;

            public a(RemoteListenableDelegatingWorker remoteListenableDelegatingWorker) {
                this.f14659a = remoteListenableDelegatingWorker;
            }

            @Override // wb.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(androidx.work.multiprocess.a iListenableWorkerImpl, androidx.work.multiprocess.c callback) {
                s.k(iListenableWorkerImpl, "iListenableWorkerImpl");
                s.k(callback, "callback");
                String strI = this.f14659a.getInputData().i("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                if (strI == null) {
                    throw new IllegalArgumentException("Need to specify a class name for the RemoteListenableWorker to delegate to.");
                }
                byte[] bArrA = xb.a.a(new h(strI, this.f14659a.workerParameters));
                s.j(bArrA, "marshall(...)");
                iListenableWorkerImpl.E2(bArrA, callback);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, RemoteListenableDelegatingWorker remoteListenableDelegatingWorker) {
            super(2, continuation);
            this.f14658p = remoteListenableDelegatingWorker;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return RemoteListenableDelegatingWorker.this.new b(continuation, this.f14658p);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f14656n;
            if (i11 == 0) {
                t.b(obj);
                String strI = RemoteListenableDelegatingWorker.this.getInputData().i("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                String strI2 = RemoteListenableDelegatingWorker.this.getInputData().i("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                if (strI == null) {
                    throw new IllegalArgumentException("Need to specify a package name for the Remote Service.");
                }
                if (strI2 == null) {
                    throw new IllegalArgumentException("Need to specify a class name for the Remote Service.");
                }
                RemoteListenableDelegatingWorker.this.componentName = new ComponentName(strI, strI2);
                e client = RemoteListenableDelegatingWorker.this.getClient();
                ComponentName componentName = RemoteListenableDelegatingWorker.this.componentName;
                s.h(componentName);
                com.google.common.util.concurrent.s<byte[]> sVarA = client.a(componentName, new a(this.f14658p));
                s.j(sVarA, "execute(...)");
                RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = RemoteListenableDelegatingWorker.this;
                this.f14656n = 1;
                obj = r1.d(sVarA, remoteListenableDelegatingWorker, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            byte[] bArr = (byte[]) obj;
            s.h(bArr);
            Object objB = xb.a.b(bArr, ParcelableForegroundInfo.CREATOR);
            s.j(objB, "unmarshall(...)");
            m foregroundInfo = ((ParcelableForegroundInfo) objB).getForegroundInfo();
            z.e().a("RemoteListenableDelegatingWorker", "Cleaning up");
            RemoteListenableDelegatingWorker.this.getClient().e();
            return foregroundInfo;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super m> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "androidx.work.multiprocess.RemoteListenableDelegatingWorker$startWork$$inlined$executeRemote$1", f = "RemoteListenableDelegatingWorker.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super y.a>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f14660n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ RemoteListenableDelegatingWorker f14662p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements wb.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RemoteListenableDelegatingWorker f14663a;

            public a(RemoteListenableDelegatingWorker remoteListenableDelegatingWorker) {
                this.f14663a = remoteListenableDelegatingWorker;
            }

            @Override // wb.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(androidx.work.multiprocess.a iListenableWorkerImpl, androidx.work.multiprocess.c callback) {
                s.k(iListenableWorkerImpl, "iListenableWorkerImpl");
                s.k(callback, "callback");
                String strI = this.f14663a.getInputData().i("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                if (strI == null) {
                    throw new IllegalArgumentException("Need to specify a class name for the RemoteListenableWorker to delegate to.");
                }
                byte[] bArrA = xb.a.a(new h(strI, this.f14663a.workerParameters));
                s.j(bArrA, "marshall(...)");
                iListenableWorkerImpl.U(bArrA, callback);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Continuation continuation, RemoteListenableDelegatingWorker remoteListenableDelegatingWorker) {
            super(2, continuation);
            this.f14662p = remoteListenableDelegatingWorker;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return RemoteListenableDelegatingWorker.this.new c(continuation, this.f14662p);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f14660n;
            if (i11 == 0) {
                t.b(obj);
                String strI = RemoteListenableDelegatingWorker.this.getInputData().i("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                String strI2 = RemoteListenableDelegatingWorker.this.getInputData().i("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                if (strI == null) {
                    throw new IllegalArgumentException("Need to specify a package name for the Remote Service.");
                }
                if (strI2 == null) {
                    throw new IllegalArgumentException("Need to specify a class name for the Remote Service.");
                }
                RemoteListenableDelegatingWorker.this.componentName = new ComponentName(strI, strI2);
                e client = RemoteListenableDelegatingWorker.this.getClient();
                ComponentName componentName = RemoteListenableDelegatingWorker.this.componentName;
                s.h(componentName);
                com.google.common.util.concurrent.s<byte[]> sVarA = client.a(componentName, new a(this.f14662p));
                s.j(sVarA, "execute(...)");
                RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = RemoteListenableDelegatingWorker.this;
                this.f14660n = 1;
                obj = r1.d(sVarA, remoteListenableDelegatingWorker, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            byte[] bArr = (byte[]) obj;
            s.h(bArr);
            Object objB = xb.a.b(bArr, i.CREATOR);
            s.j(objB, "unmarshall(...)");
            y.a aVarA = ((i) objB).a();
            s.j(aVarA, "getResult(...)");
            z.e().a("RemoteListenableDelegatingWorker", "Cleaning up");
            RemoteListenableDelegatingWorker.this.getClient().e();
            return aVarA;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super y.a> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteListenableDelegatingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        s.k(context, "context");
        s.k(workerParameters, "workerParameters");
        this.context = context;
        this.workerParameters = workerParameters;
        this.client = new e(context, workerParameters.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(RemoteListenableDelegatingWorker remoteListenableDelegatingWorker, a iListenableWorkerImpl, androidx.work.multiprocess.c callback) {
        s.k(iListenableWorkerImpl, "iListenableWorkerImpl");
        s.k(callback, "callback");
        String string = remoteListenableDelegatingWorker.workerParameters.d().toString();
        s.j(string, "toString(...)");
        byte[] bArrA = xb.a.a(new ParcelableInterruptRequest(string, remoteListenableDelegatingWorker.getStopReason()));
        s.j(bArrA, "marshall(...)");
        iListenableWorkerImpl.S0(bArrA, callback);
        remoteListenableDelegatingWorker.client.e();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getClient() {
        return this.client;
    }

    @Override // androidx.work.y
    public com.google.common.util.concurrent.s<m> getForegroundInfoAsync() {
        e1 e1VarS = e1.s(this.context.getApplicationContext());
        s.j(e1VarS, "getInstance(...)");
        CoroutineDispatcher coroutineDispatcherA = e1VarS.A().a();
        s.j(coroutineDispatcherA, "getTaskCoroutineDispatcher(...)");
        return androidx.concurrent.futures.g.c(androidx.concurrent.futures.g.f6458a, coroutineDispatcherA, false, new b(null, this), 2, null);
    }

    @Override // androidx.work.y
    @SuppressLint({"NewApi"})
    public void onStopped() {
        super.onStopped();
        ComponentName componentName = this.componentName;
        if (componentName != null) {
            e eVar = this.client;
            s.h(componentName);
            eVar.a(componentName, new wb.b() { // from class: wb.c
                @Override // wb.b
                public final void a(Object obj, androidx.work.multiprocess.c cVar) {
                    RemoteListenableDelegatingWorker.g(this.f121645a, (androidx.work.multiprocess.a) obj, cVar);
                }
            });
        }
    }

    @Override // androidx.work.y
    public com.google.common.util.concurrent.s<y.a> startWork() {
        e1 e1VarS = e1.s(this.context.getApplicationContext());
        s.j(e1VarS, "getInstance(...)");
        CoroutineDispatcher coroutineDispatcherA = e1VarS.A().a();
        s.j(coroutineDispatcherA, "getTaskCoroutineDispatcher(...)");
        return androidx.concurrent.futures.g.c(androidx.concurrent.futures.g.f6458a, coroutineDispatcherA, false, new c(null, this), 2, null);
    }
}
