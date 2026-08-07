package com.stripe.android.core.networking;

import android.app.Application;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.g;
import androidx.work.y;
import com.google.android.libraries.places.api.model.PlaceTypes;
import jn0.t;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w30.AnalyticsRequestV2;
import w30.g0;
import w30.j0;
import w30.k;
import w30.l0;
import w30.r;
import w30.z;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/y$a;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "b", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SendAnalyticsRequestV2Worker extends CoroutineWorker {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static j0 f49675d = new r(null, null, null, 0, null, 31, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static l<? super Context, ? extends k> f49676e = a.f49677c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Lw30/z;", "a", "(Landroid/content/Context;)Lw30/z;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<Context, z> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f49677c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z invoke(Context it) {
            s.k(it, "it");
            Context applicationContext = it.getApplicationContext();
            s.i(applicationContext, "null cannot be cast to non-null type android.app.Application");
            return new z((Application) applicationContext);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.core.networking.SendAnalyticsRequestV2Worker$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR<\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$b;", "", "<init>", "()V", "", "id", "Landroidx/work/g;", "a", "(Ljava/lang/String;)Landroidx/work/g;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lw30/k;", "<set-?>", PlaceTypes.STORAGE, "Lwn0/l;", "b", "()Lwn0/l;", "TAG", "Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(String id2) {
            s.k(id2, "id");
            Pair[] pairArr = {x.a("data", id2)};
            g.a aVar = new g.a();
            Pair pair = pairArr[0];
            aVar.b((String) pair.e(), pair.f());
            g gVarA = aVar.a();
            s.j(gVarA, "dataBuilder.build()");
            return gVarA;
        }

        public final l<Context, k> b() {
            return SendAnalyticsRequestV2Worker.f49676e;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.SendAnalyticsRequestV2Worker", f = "SendAnalyticsRequestV2Worker.kt", i = {0, 0, 1}, l = {83, 22}, m = "doWork", n = {"this", "this_$iv", "this"}, s = {"L$0", "L$1", "L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f49678n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f49679o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f49680p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f49682r;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49680p = obj;
            this.f49682r |= Integer.MIN_VALUE;
            return SendAnalyticsRequestV2Worker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAnalyticsRequestV2Worker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        s.k(appContext, "appContext");
        s.k(params, "params");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super y.a> continuation) {
        c cVar;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker2;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker3;
        Object objB;
        Throwable thE;
        y.a aVarA;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f49682r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f49682r = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objA = cVar.f49680p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f49682r;
        if (i12 == 0) {
            t.b(objA);
            String strI = getInputData().i("data");
            if (strI == null) {
                y.a aVarA2 = y.a.a();
                s.j(aVarA2, "failure(...)");
                return aVarA2;
            }
            l<Context, k> lVarB = INSTANCE.b();
            Context applicationContext = getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            k kVarInvoke = lVarB.invoke(applicationContext);
            cVar.f49678n = this;
            cVar.f49679o = this;
            cVar.f49682r = 1;
            objA = kVarInvoke.a(strI, cVar);
            if (objA != coroutine_suspended) {
                sendAnalyticsRequestV2Worker = this;
                sendAnalyticsRequestV2Worker2 = sendAnalyticsRequestV2Worker;
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sendAnalyticsRequestV2Worker3 = (SendAnalyticsRequestV2Worker) cVar.f49678n;
            try {
                t.b(objA);
                objB = jn0.s.b((l0) objA);
            } catch (Throwable th2) {
                th = th2;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th));
            }
            thE = jn0.s.e(objB);
            if (thE == null) {
                aVarA = y.a.e();
            } else if (g0.b(thE) || sendAnalyticsRequestV2Worker3.getRunAttemptCount() >= 4) {
                aVarA = y.a.a();
            } else {
                aVarA = y.a.d();
            }
            s.j(aVarA, "fold(...)");
            return aVarA;
        }
        sendAnalyticsRequestV2Worker = (SendAnalyticsRequestV2Worker) cVar.f49679o;
        sendAnalyticsRequestV2Worker2 = (SendAnalyticsRequestV2Worker) cVar.f49678n;
        t.b(objA);
        AnalyticsRequestV2 analyticsRequestV2 = (AnalyticsRequestV2) objA;
        if (analyticsRequestV2 == null) {
            y.a aVarA3 = y.a.a();
            s.j(aVarA3, "failure(...)");
            return aVarA3;
        }
        AnalyticsRequestV2 analyticsRequestV2U = analyticsRequestV2.u(sendAnalyticsRequestV2Worker.getRunAttemptCount());
        try {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            j0 j0Var = f49675d;
            cVar.f49678n = sendAnalyticsRequestV2Worker2;
            cVar.f49679o = null;
            cVar.f49682r = 2;
            objA = j0Var.a(analyticsRequestV2U, cVar);
            if (objA != coroutine_suspended) {
                sendAnalyticsRequestV2Worker3 = sendAnalyticsRequestV2Worker2;
                objB = jn0.s.b((l0) objA);
                thE = jn0.s.e(objB);
                if (thE == null) {
                    aVarA = y.a.e();
                } else if (g0.b(thE)) {
                    aVarA = y.a.a();
                } else {
                    aVarA = y.a.a();
                }
                s.j(aVarA, "fold(...)");
                return aVarA;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            sendAnalyticsRequestV2Worker3 = sendAnalyticsRequestV2Worker2;
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th));
        }
    }
}
