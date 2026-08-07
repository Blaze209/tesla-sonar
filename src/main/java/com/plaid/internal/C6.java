package com.plaid.internal;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class C6 implements B6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I6 f46241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f46242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue<D6> f46243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile G6 f46244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f46245e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46246a;

        static {
            int[] iArr = new int[G6.values().length];
            try {
                iArr[G6.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G6.ERRORS_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G6.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46246a = iArr;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.remotelog.RemoteLogControllerImpl$maybeFlushEvents$1", f = "RemoteLogControllerImpl.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46247a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ G6 f46249c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(G6 g11, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f46249c = g11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C6.this.new b(this.f46249c, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return C6.this.new b(this.f46249c, continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f46247a;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    C6 c11 = C6.this;
                    G6 g11 = this.f46249c;
                    this.f46247a = 1;
                    if (c11.a(g11, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                C6.this.f46245e.set(false);
                if (!C6.this.f46243c.isEmpty()) {
                    C6.this.a();
                }
                return jn0.h0.f84049a;
            } catch (Throwable th2) {
                C6.this.f46245e.set(false);
                if (!C6.this.f46243c.isEmpty()) {
                    C6.this.a();
                }
                throw th2;
            }
        }
    }

    public C6(I6 eventSender) {
        CoroutineScope scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        p013kotlin.jvm.internal.s.k(eventSender, "eventSender");
        p013kotlin.jvm.internal.s.k(scope, "scope");
        this.f46241a = eventSender;
        this.f46242b = scope;
        this.f46243c = new ConcurrentLinkedQueue<>();
        this.f46245e = new AtomicBoolean(false);
    }

    @Override // com.plaid.internal.B6
    public final void a(String eventName, Map<String, String> metadata, E6 logLevel) {
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        p013kotlin.jvm.internal.s.k(logLevel, "logLevel");
        a(new D6(eventName, metadata, logLevel));
    }

    @Override // com.plaid.internal.B6
    public final void clear() {
        this.f46243c.clear();
        this.f46244d = null;
        this.f46245e.set(false);
        I6 i11 = this.f46241a;
        i11.f46358e = null;
        i11.f46359f = null;
        i11.f46360g = null;
        X5.f46812a.getClass();
        X5.a.a("RemoteLogSender: session data cleared", true);
        X5.a.a("Remote log controller cleared", true);
    }

    public final void a(D6 event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        this.f46243c.offer(event);
        X5.a.a(X5.f46812a, "Remote log event queued: " + event.a() + ", queue size: " + this.f46243c.size());
        a();
    }

    public final void a(G6 threshold) {
        p013kotlin.jvm.internal.s.k(threshold, "threshold");
        if (this.f46244d != threshold) {
            X5.a.e(X5.f46812a, "Log level threshold is being changed from " + this.f46244d + " to " + threshold);
        }
        this.f46244d = threshold;
        X5.a.a(X5.f46812a, "Remote log level threshold set: " + threshold);
        a();
    }

    public final void a(String str, String str2) {
        this.f46241a.a(str, str2);
    }

    public final void a() {
        G6 g11 = this.f46244d;
        if (this.f46241a.f46358e == null || g11 == null || this.f46243c.isEmpty() || !this.f46245e.compareAndSet(false, true)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f46242b, null, null, new b(g11, null), 3, null);
    }

    public final Object a(G6 g11, b bVar) {
        int i11;
        ArrayList arrayList = new ArrayList();
        while (!this.f46243c.isEmpty()) {
            D6 d6Poll = this.f46243c.poll();
            if (d6Poll != null && (i11 = a.f46246a[g11.ordinal()]) != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (d6Poll.f46275d == E6.ERROR) {
                }
                arrayList.add(d6Poll);
            }
        }
        if (!arrayList.isEmpty()) {
            X5.a.a(X5.f46812a, "Flushing " + arrayList.size() + " remote log events");
            Object objA = this.f46241a.a(arrayList, bVar);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
        }
        return jn0.h0.f84049a;
    }
}
