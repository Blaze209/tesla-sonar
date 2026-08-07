package com.stripe.android.core.networking;

import android.app.Application;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.common.util.concurrent.s;
import ezvcard.property.Kind;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.u;
import w30.AnalyticsRequestV2;
import w30.h;
import w30.j0;
import w30.k;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/core/networking/a;", "Lw30/h;", "Landroid/app/Application;", Kind.APPLICATION, "Lw30/j0;", "networkClient", "Lo30/d;", "logger", "Lw30/k;", PlaceTypes.STORAGE, "Lz30/e;", "isWorkManagerAvailable", "<init>", "(Landroid/app/Application;Lw30/j0;Lo30/d;Lw30/k;Lz30/e;)V", "Lw30/g;", "request", "", DateTokenConverter.CONVERTER_KEY, "(Lw30/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "e", "a", "Landroid/app/Application;", "b", "Lw30/j0;", "c", "Lo30/d;", "Lw30/k;", "Lz30/e;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j0 networkClient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k storage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z30.e isWorkManagerAvailable;

    /* JADX INFO: renamed from: com.stripe.android.core.networking.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor", f = "AnalyticsRequestV2Executor.kt", i = {0, 0, 1, 1}, l = {29, 29, 31}, m = "enqueue", n = {"this", "request", "this", "request"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C0796a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f49688n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f49689o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f49690p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f49692r;

        C0796a(Continuation<? super C0796a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49690p = obj;
            this.f49692r |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor", f = "AnalyticsRequestV2Executor.kt", i = {0, 0, 1, 1}, l = {37, 74}, m = "enqueueRequest", n = {"this", "workManager", "$completion$iv", "$this$await$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f49693n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f49694o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f49695p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f49697r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49695p = obj;
            this.f49697r |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"R", "Ljn0/h0;", "run", "()V", "androidx/work/ListenableFutureKt$await$2$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f49698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f49699b;

        public c(CancellableContinuation cancellableContinuation, s sVar) {
            this.f49698a = cancellableContinuation;
            this.f49699b = sVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                CancellableContinuation cancellableContinuation = this.f49698a;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(this.f49699b.get()));
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    cause = th2;
                }
                if (th2 instanceof CancellationException) {
                    this.f49698a.cancel(cause);
                    return;
                }
                CancellableContinuation cancellableContinuation2 = this.f49698a;
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                cancellableContinuation2.resumeWith(jn0.s.b(t.a(cause)));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V", "androidx/work/ListenableFutureKt$await$2$2"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s f49700c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s sVar) {
            super(1);
            this.f49700c = sVar;
        }

        public final void a(Throwable th2) {
            this.f49700c.cancel(false);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor", f = "AnalyticsRequestV2Executor.kt", i = {0, 0, 0}, l = {55}, m = "executeRequest", n = {"this", "request", "$this$executeRequest_u24lambda_u241"}, s = {"L$0", "L$1", "L$2"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f49701n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f49702o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f49703p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f49704q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f49706s;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49704q = obj;
            this.f49706s |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    public a(Application application, j0 networkClient, o30.d logger, k storage, z30.e isWorkManagerAvailable) {
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(networkClient, "networkClient");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(storage, "storage");
        p013kotlin.jvm.internal.s.k(isWorkManagerAvailable, "isWorkManagerAvailable");
        this.application = application;
        this.networkClient = networkClient;
        this.logger = logger;
        this.storage = storage;
        this.isWorkManagerAvailable = isWorkManagerAvailable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ff, code lost:
    
        if (r10 == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(w30.AnalyticsRequestV2 r9, p013kotlin.coroutines.Continuation<? super java.lang.Boolean> r10) throws java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.networking.a.d(w30.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(AnalyticsRequestV2 analyticsRequestV2, Continuation<? super h0> continuation) {
        e eVar;
        a aVar;
        AnalyticsRequestV2 analyticsRequestV3;
        a aVar2;
        Object objB;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f49706s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f49706s = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f49704q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f49706s;
        if (i12 == 0) {
            t.b(obj);
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                j0 j0Var = this.networkClient;
                eVar.f49701n = this;
                eVar.f49702o = analyticsRequestV2;
                eVar.f49703p = this;
                eVar.f49706s = 1;
                if (j0Var.a(analyticsRequestV2, eVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = this;
                analyticsRequestV3 = analyticsRequestV2;
                aVar2 = aVar;
            } catch (Throwable th2) {
                th = th2;
                aVar = this;
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (a) eVar.f49703p;
            analyticsRequestV3 = (AnalyticsRequestV2) eVar.f49702o;
            aVar = (a) eVar.f49701n;
            try {
                t.b(obj);
            } catch (Throwable th3) {
                th = th3;
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th));
            }
        }
        aVar2.logger.debug("EVENT: " + analyticsRequestV3.getEventName());
        objB = jn0.s.b(h0.f84049a);
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            aVar.logger.error("Exception while making analytics request", thE);
        }
        return h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0080 A[PHI: r2 r7
      0x0080: PHI (r2v4 com.stripe.android.core.networking.a) = (r2v2 com.stripe.android.core.networking.a), (r2v5 com.stripe.android.core.networking.a) binds: [B:23:0x0068, B:28:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r7v5 w30.g) = (r7v1 w30.g), (r7v6 w30.g) binds: [B:23:0x0068, B:28:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (r2.e(r7, r0) == r1) goto L34;
     */
    @Override // w30.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(w30.AnalyticsRequestV2 r7, p013kotlin.coroutines.Continuation<? super jn0.h0> r8) throws java.util.concurrent.ExecutionException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.core.networking.a.C0796a
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.core.networking.a$a r0 = (com.stripe.android.core.networking.a.C0796a) r0
            int r1 = r0.f49692r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49692r = r1
            goto L18
        L13:
            com.stripe.android.core.networking.a$a r0 = new com.stripe.android.core.networking.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f49690p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49692r
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            jn0.t.b(r8)
            goto L91
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f49689o
            w30.g r7 = (w30.AnalyticsRequestV2) r7
            java.lang.Object r2 = r0.f49688n
            com.stripe.android.core.networking.a r2 = (com.stripe.android.core.networking.a) r2
            jn0.t.b(r8)
            goto L77
        L43:
            java.lang.Object r7 = r0.f49689o
            w30.g r7 = (w30.AnalyticsRequestV2) r7
            java.lang.Object r2 = r0.f49688n
            com.stripe.android.core.networking.a r2 = (com.stripe.android.core.networking.a) r2
            jn0.t.b(r8)
            goto L62
        L4f:
            jn0.t.b(r8)
            z30.e r8 = r6.isWorkManagerAvailable
            r0.f49688n = r6
            r0.f49689o = r7
            r0.f49692r = r5
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L61
            goto L90
        L61:
            r2 = r6
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r0.f49688n = r2
            r0.f49689o = r7
            r0.f49692r = r4
            java.lang.Object r8 = r2.d(r7, r0)
            if (r8 != r1) goto L77
            goto L90
        L77:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            goto L81
        L80:
            r5 = 0
        L81:
            if (r5 != 0) goto L94
            r8 = 0
            r0.f49688n = r8
            r0.f49689o = r8
            r0.f49692r = r3
            java.lang.Object r7 = r2.e(r7, r0)
            if (r7 != r1) goto L91
        L90:
            return r1
        L91:
            jn0.h0 r7 = jn0.h0.f84049a
            return r7
        L94:
            jn0.h0 r7 = jn0.h0.f84049a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.networking.a.a(w30.g, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
