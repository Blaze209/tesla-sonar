package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Qk implements InterfaceC3700ps {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27490d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27491e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final wn0.l f27492f = new wn0.l() { // from class: com.fourthline.orca.internal.mm0
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return Long.valueOf(Qk.a(((Integer) obj).intValue()));
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final wn0.l f27493g = new wn0.l() { // from class: com.fourthline.orca.internal.nm0
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return Long.valueOf(Qk.b(((Integer) obj).intValue()));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G2 f27494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.l f27496c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27497a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27499c;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27497a = obj;
            this.f27499c |= Integer.MIN_VALUE;
            Object objA = Qk.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27500a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3700ps.a f27502c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3700ps.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f27502c = aVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Qk.this.new c(this.f27502c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f27500a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Qk qk2 = Qk.this;
                InterfaceC3700ps.a aVar = this.f27502c;
                this.f27500a = 1;
                objA = qk2.a(0, aVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objA = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objA);
        }
    }

    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27506d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f27508f;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27506d = obj;
            this.f27508f |= Integer.MIN_VALUE;
            Object objA = Qk.this.a(0, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Qk(G2 bavStatusWorker, long j11, wn0.l retryStrategy) {
        p013kotlin.jvm.internal.s.k(bavStatusWorker, "bavStatusWorker");
        p013kotlin.jvm.internal.s.k(retryStrategy, "retryStrategy");
        this.f27494a = bavStatusWorker;
        this.f27495b = j11;
        this.f27496c = retryStrategy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(int i11) {
        return 2000L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3700ps
    public Object a(InterfaceC3700ps.a aVar, Continuation continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f27499c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f27499c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objWithTimeout = bVar.f27497a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f27499c;
        try {
            if (i12 == 0) {
                jn0.t.b(objWithTimeout);
                long j11 = this.f27495b;
                c cVar = new c(aVar, null);
                bVar.f27499c = 1;
                objWithTimeout = TimeoutKt.withTimeout(j11, cVar, bVar);
                if (objWithTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(objWithTimeout);
            }
            return ((jn0.s) objWithTimeout).getValue();
        } catch (TimeoutCancellationException unused) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(new ZD.b("NetworkPollBavStatusWorker.timeout")));
        }
    }

    public /* synthetic */ Qk(G2 g11, long j11, wn0.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(g11, (i11 & 2) != 0 ? 60000L : j11, (i11 & 4) != 0 ? f27493g : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        if (r9 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, com.fourthline.orca.internal.InterfaceC3700ps.a r10, p013kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.Qk.a(int, com.fourthline.orca.internal.ps$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(int i11) {
        return ((long) Math.pow(2.0d, i11)) * ((long) 1000);
    }
}
