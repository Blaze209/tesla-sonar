package com.plaid.internal.core.crashreporting.internal;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.g;
import androidx.work.y;
import com.google.gson.f;
import com.plaid.internal.C4350b0;
import com.plaid.internal.C4429h0;
import com.plaid.internal.C4438i0;
import com.plaid.internal.C4443i5;
import com.plaid.internal.E5;
import com.plaid.internal.S6;
import com.plaid.internal.W;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import java.io.File;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/CrashUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CrashUploadWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E5 f46914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f46915b;

    @DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashUploadWorker", f = "CrashUploadWorker.kt", i = {}, l = {35}, m = "doWork", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f46916a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46918c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f46916a = obj;
            this.f46918c |= Integer.MIN_VALUE;
            return CrashUploadWorker.this.doWork(this);
        }
    }

    @DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$doWork$2", f = "CrashUploadWorker.kt", i = {1}, l = {36, 39, 40}, m = "invokeSuspend", n = {"batchEvents"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super y.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f46919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C4429h0 f46921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ S6 f46922d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4429h0 c4429h0, S6 s11, Continuation continuation) {
            super(2, continuation);
            this.f46921c = c4429h0;
            this.f46922d = s11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f46921c, this.f46922d, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super y.a> continuation) {
            return new b(this.f46921c, this.f46922d, continuation).invokeSuspend(h0.f84049a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        
            if (r7.a(r1, r6) == r0) goto L23;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f46920b
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L28
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                jn0.t.b(r7)
                goto L6e
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.util.List r1 = r6.f46919a
                jn0.t.b(r7)
                goto L61
            L24:
                jn0.t.b(r7)
                goto L3f
            L28:
                jn0.t.b(r7)
                com.plaid.internal.h0 r7 = r6.f46921c
                r6.f46920b = r4
                kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getIO()
                com.plaid.internal.e0 r4 = new com.plaid.internal.e0
                r4.<init>(r7, r5)
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r4, r6)
                if (r7 != r0) goto L3f
                goto L6d
            L3f:
                r1 = r7
                java.util.List r1 = (java.util.List) r1
                com.plaid.internal.h0 r7 = r6.f46921c
                r6.f46919a = r1
                r6.f46920b = r3
                kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
                com.plaid.internal.d0 r4 = new com.plaid.internal.d0
                r4.<init>(r7, r5)
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r6)
                java.lang.Object r3 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r7 != r3) goto L5c
                goto L5e
            L5c:
                jn0.h0 r7 = jn0.h0.f84049a
            L5e:
                if (r7 != r0) goto L61
                goto L6d
            L61:
                com.plaid.internal.S6 r7 = r6.f46922d
                r6.f46919a = r5
                r6.f46920b = r2
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L6e
            L6d:
                return r0
            L6e:
                androidx.work.y$a r7 = androidx.work.y.a.e()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.core.crashreporting.internal.CrashUploadWorker.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashUploadWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        s.k(appContext, "appContext");
        s.k(workerParams, "workerParams");
        this.f46914a = E5.f46295c.a(null);
        this.f46915b = new f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(Continuation<? super y.a> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f46918c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f46918c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f46916a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f46918c;
        if (i12 == 0) {
            t.b(objWithContext);
            g inputData = getInputData();
            s.j(inputData, "getInputData(...)");
            S6 s6A = new W(this.f46914a).a(inputData.i("crashesApiClass"));
            CrashApiOptions crashApiOptions = (CrashApiOptions) this.f46915b.j(inputData.i("crashOptions"), CrashApiOptions.class);
            if (crashApiOptions == null) {
                throw new IllegalArgumentException("No crash options provided");
            }
            s.k(crashApiOptions, "crashApiOptions");
            s6A.f46701c = crashApiOptions;
            Context application = getApplicationContext();
            s.j(application, "getApplicationContext(...)");
            Context applicationContext = getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            g inputData2 = getInputData();
            s.j(inputData2, "getInputData(...)");
            CrashApiOptions crashApiOptions2 = (CrashApiOptions) this.f46915b.j(inputData2.i("crashOptions"), CrashApiOptions.class);
            if (crashApiOptions2 == null) {
                throw new IllegalArgumentException("No crash options provided");
            }
            C4350b0 crashReportFactory = new C4350b0(applicationContext, crashApiOptions2, C4438i0.f47725a);
            s.k(application, "application");
            s.k(crashReportFactory, "crashReportFactory");
            File filesDir = application.getFilesDir();
            s.j(filesDir, "getFilesDir(...)");
            C4429h0 c4429h0 = new C4429h0(new C4443i5(filesDir, "plaid-sdk/crashes"), crashReportFactory);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            b bVar = new b(c4429h0, s6A, null);
            aVar.f46918c = 1;
            objWithContext = BuildersKt.withContext(io2, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        s.j(objWithContext, "withContext(...)");
        return objWithContext;
    }
}
