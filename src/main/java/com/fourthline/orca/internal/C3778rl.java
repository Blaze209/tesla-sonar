package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3778rl implements InterfaceC3617nv {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f35088d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35089e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final wn0.l f35090f = new wn0.l() { // from class: com.fourthline.orca.internal.mb1
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return Long.valueOf(C3778rl.a(((Integer) obj).intValue()));
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final wn0.l f35091g = new wn0.l() { // from class: com.fourthline.orca.internal.nb1
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return Long.valueOf(C3778rl.b(((Integer) obj).intValue()));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Vu f35092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f35093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.l f35094c;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rl$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rl$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35095a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35097c;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f35095a = obj;
            this.f35097c |= Integer.MIN_VALUE;
            Object objA = C3778rl.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rl$c */
    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35098a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3617nv.a f35100c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3617nv.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f35100c = aVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3778rl.this.new c(this.f35100c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f35098a;
            if (i11 == 0) {
                jn0.t.b(obj);
                C3778rl c3778rl = C3778rl.this;
                InterfaceC3617nv.a aVar = this.f35100c;
                this.f35098a = 1;
                objA = c3778rl.a(0, aVar, this);
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

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rl$d */
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f35104d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f35106f;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f35104d = obj;
            this.f35106f |= Integer.MIN_VALUE;
            Object objA = C3778rl.this.a(0, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3778rl(Vu getSignatureStatusWorker, long j11, wn0.l retryStrategy) {
        p013kotlin.jvm.internal.s.k(getSignatureStatusWorker, "getSignatureStatusWorker");
        p013kotlin.jvm.internal.s.k(retryStrategy, "retryStrategy");
        this.f35092a = getSignatureStatusWorker;
        this.f35093b = j11;
        this.f35094c = retryStrategy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(int i11) {
        return 2000L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.InterfaceC3617nv
    public Object a(InterfaceC3617nv.a aVar, Continuation continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f35097c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f35097c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objWithTimeout = bVar.f35095a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f35097c;
        try {
            if (i12 == 0) {
                jn0.t.b(objWithTimeout);
                long j11 = this.f35093b;
                c cVar = new c(aVar, null);
                bVar.f35097c = 1;
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
            return jn0.s.b(jn0.t.a(new ZD.b("NetworkQesPollSignatureStatusWorker.timeout")));
        }
    }

    public /* synthetic */ C3778rl(Vu vu2, long j11, wn0.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(vu2, (i11 & 2) != 0 ? 60000L : j11, (i11 & 4) != 0 ? f35091g : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        if (r9 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, com.fourthline.orca.internal.InterfaceC3617nv.a r10, p013kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3778rl.a(int, com.fourthline.orca.internal.nv$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(int i11) {
        return ((long) Math.pow(2.0d, i11)) * ((long) 1000);
    }
}
