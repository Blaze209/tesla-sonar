package sa;

import androidx.room.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00112\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R$\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\f0)j\b\u0012\u0004\u0012\u00020\f`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00102\u001a\u00060.j\u0002`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lsa/g;", "Lsa/b;", "Lya/c;", "driver", "", "fileName", "<init>", "(Lya/c;Ljava/lang/String;)V", "", "maxNumOfReaders", "maxNumOfWriters", "(Lya/c;Ljava/lang/String;II)V", "Lsa/l;", "connection", "Lkotlin/coroutines/CoroutineContext;", "C", "(Lsa/l;)Lkotlin/coroutines/CoroutineContext;", "", "isReadOnly", "", "H", "(Z)Ljava/lang/Void;", "R", "Lkotlin/Function2;", "Landroidx/room/s0;", "Lkotlin/coroutines/Continuation;", "", "block", "B3", "(ZLwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "close", "()V", "a", "Lya/c;", "Lsa/k;", "b", "Lsa/k;", "readers", "c", "writers", "Ljava/lang/ThreadLocal;", "Landroidx/room/concurrent/ThreadLocal;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/ThreadLocal;", "threadLocal", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isClosed", "Lio0/b;", "f", "J", "getTimeout-UwyO8pc$room_runtime_release", "()J", "setTimeout-LRDsOJo$room_runtime_release", "(J)V", "timeout", "isClosed", "()Z", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements sa.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ya.c driver;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k readers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k writers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ThreadLocal<l> threadLocal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean _isClosed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long timeout;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", i = {2, 2, 2, 2, 2, 2, 2, 3, 3}, l = {114, 118, 541, 147}, m = "useConnection", n = {"this", "block", "pool", "connection", "currentContext", "connection$iv", "isReadOnly", "pool", "connection"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1"})
    static final class a<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110671n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f110672o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f110673p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f110674q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f110675r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f110676s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f110677t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f110678u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f110680w;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110678u = obj;
            this.f110680w |= Integer.MIN_VALUE;
            return g.this.B3(false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    static final class b<R> extends SuspendLambda implements p<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110681n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p<s0, Continuation<? super R>, Object> f110682o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ l f110683p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super s0, ? super Continuation<? super R>, ? extends Object> pVar, l lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f110682o = pVar;
            this.f110683p = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f110682o, this.f110683p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f110681n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            p<s0, Continuation<? super R>, Object> pVar = this.f110682o;
            l lVar = this.f110683p;
            this.f110681n = 1;
            Object objInvoke = pVar.invoke(lVar, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    static final class c<R> extends SuspendLambda implements p<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110684n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p<s0, Continuation<? super R>, Object> f110685o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ n0<l> f110686p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super s0, ? super Continuation<? super R>, ? extends Object> pVar, n0<l> n0Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f110685o = pVar;
            this.f110686p = n0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f110685o, this.f110686p, continuation);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to sa.g$c<R> for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.f110684n
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r4)
                return r4
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                jn0.t.b(r4)
                wn0.p<androidx.room.s0, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r3.f110685o
                kotlin.jvm.internal.n0<sa.l> r1 = r3.f110686p
                T r1 = r1.f86529a
                r3.f110684n = r2
                java.lang.Object r4 = r4.invoke(r1, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: sa.g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public g(final ya.c driver, final String fileName) {
        s.k(driver, "driver");
        s.k(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        io0.b.Companion companion = io0.b.INSTANCE;
        this.timeout = io0.d.s(30, io0.e.SECONDS);
        this.driver = driver;
        k kVar = new k(1, new wn0.a() { // from class: sa.e
            @Override // wn0.a
            public final Object invoke() {
                return g.p(driver, fileName);
            }
        });
        this.readers = kVar;
        this.writers = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya.b B(ya.c cVar, String str) {
        return cVar.a(str);
    }

    private final CoroutineContext C(l connection) {
        return new sa.a(connection).plus(ra.d.a(this.threadLocal, connection));
    }

    private final Void H(boolean isReadOnly) {
        String str = isReadOnly ? "reader" : "writer";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Timed out attempting to acquire a " + str + " connection.");
        sb2.append('\n');
        sb2.append('\n');
        sb2.append("Writer pool:");
        sb2.append('\n');
        this.writers.c(sb2);
        sb2.append("Reader pool:");
        sb2.append('\n');
        this.readers.c(sb2);
        ya.a.b(5, sb2.toString());
        throw new KotlinNothingValueException();
    }

    private final boolean isClosed() {
        return this._isClosed.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya.b p(ya.c cVar, String str) {
        return cVar.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya.b t(ya.c cVar, String str) throws Exception {
        ya.b bVarA = cVar.a(str);
        ya.a.a(bVarA, "PRAGMA query_only = 1");
        return bVarA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0194 A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #3 {all -> 0x01a5, blocks: (B:88:0x018e, B:90:0x0194), top: B:117:0x018e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, sa.l] */
    /* JADX WARN: Type inference failed for: r14v4 */
    @Override // sa.b
    public <R> Object B3(boolean z11, p<? super s0, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        a aVar;
        n0 n0Var;
        Throwable th2;
        k kVar;
        n0 n0Var2;
        n0 n0Var3;
        k kVar2;
        CoroutineContext coroutineContext;
        g gVar;
        p<? super s0, ? super Continuation<? super R>, ? extends Object> pVar2;
        n0 n0Var4;
        g gVar2;
        boolean z12;
        n0 n0Var5;
        g gVar3;
        ?? lVar;
        l lVar2;
        boolean z13 = z11;
        p<? super s0, ? super Continuation<? super R>, ? extends Object> pVar3 = pVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f110680w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f110680w = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f110678u;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f110680w;
        boolean z14 = true;
        try {
            if (i12 == 0) {
                t.b(objWithContext);
                if (isClosed()) {
                    ya.a.b(21, "Connection pool is closed");
                    throw new KotlinNothingValueException();
                }
                l connectionWrapper = this.threadLocal.get();
                if (connectionWrapper == null) {
                    sa.a aVar2 = (sa.a) aVar.get$context().get(sa.a.INSTANCE);
                    connectionWrapper = aVar2 != null ? aVar2.getConnectionWrapper() : null;
                }
                if (connectionWrapper == null) {
                    k kVar3 = z13 ? this.readers : this.writers;
                    n0Var = new n0();
                    try {
                        CoroutineContext coroutineContext2 = aVar.get$context();
                        n0Var2 = new n0();
                        try {
                            long j11 = this.timeout;
                            f fVar = new f(n0Var2, kVar3, null);
                            aVar.f110671n = this;
                            aVar.f110672o = pVar3;
                            aVar.f110673p = kVar3;
                            aVar.f110674q = n0Var;
                            aVar.f110675r = coroutineContext2;
                            aVar.f110676s = n0Var2;
                            aVar.f110677t = z13;
                            aVar.f110680w = 3;
                            if (TimeoutKt.m515withTimeoutKLykuaI(j11, fVar, aVar) != coroutine_suspended) {
                                n0Var3 = n0Var;
                                kVar2 = kVar3;
                                coroutineContext = coroutineContext2;
                                pVar2 = pVar3;
                                n0Var4 = n0Var2;
                                gVar2 = this;
                                n0 n0Var6 = n0Var4;
                                z12 = z13;
                                n0Var5 = n0Var3;
                                gVar3 = gVar2;
                                n0Var2 = n0Var6;
                                th = null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            n0Var3 = n0Var;
                            kVar2 = kVar3;
                            coroutineContext = coroutineContext2;
                            gVar = this;
                            p<? super s0, ? super Continuation<? super R>, ? extends Object> pVar4 = pVar3;
                            z12 = z13;
                            n0Var5 = n0Var3;
                            gVar3 = gVar;
                            pVar2 = pVar4;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        kVar = kVar3;
                        throw th2;
                    }
                } else {
                    if (!z13 && connectionWrapper.getIsReadOnly()) {
                        ya.a.b(1, "Cannot upgrade connection from reader to writer");
                        throw new KotlinNothingValueException();
                    }
                    if (aVar.get$context().get(sa.a.INSTANCE) == null) {
                        CoroutineContext coroutineContextC = C(connectionWrapper);
                        b bVar = new b(pVar3, connectionWrapper, null);
                        aVar.f110680w = 1;
                        Object objWithContext2 = BuildersKt.withContext(coroutineContextC, bVar, aVar);
                        if (objWithContext2 != coroutine_suspended) {
                            return objWithContext2;
                        }
                    } else {
                        aVar.f110680w = 2;
                        Object objInvoke = pVar3.invoke(connectionWrapper, aVar);
                        if (objInvoke != coroutine_suspended) {
                            return objInvoke;
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                t.b(objWithContext);
                return objWithContext;
            }
            if (i12 == 2) {
                t.b(objWithContext);
                return objWithContext;
            }
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n0Var5 = (n0) aVar.f110672o;
                kVar = (k) aVar.f110671n;
                try {
                    t.b(objWithContext);
                    try {
                        lVar2 = (l) n0Var5.f86529a;
                        if (lVar2 != null) {
                            lVar2.n();
                            lVar2.getDelegate().o();
                            kVar.d(lVar2.getDelegate());
                        }
                    } catch (Throwable unused) {
                    }
                    return objWithContext;
                } catch (Throwable th5) {
                    th = th5;
                    n0Var = n0Var5;
                    th2 = th;
                    try {
                        throw th2;
                    } catch (Throwable th6) {
                        try {
                            l lVar3 = (l) n0Var.f86529a;
                            if (lVar3 == null) {
                                throw th6;
                            }
                            lVar3.n();
                            lVar3.getDelegate().o();
                            kVar.d(lVar3.getDelegate());
                            throw th6;
                        } catch (Throwable th7) {
                            jn0.g.a(th2, th7);
                            throw th6;
                        }
                    }
                }
            }
            z13 = aVar.f110677t;
            n0Var4 = (n0) aVar.f110676s;
            coroutineContext = (CoroutineContext) aVar.f110675r;
            n0Var3 = (n0) aVar.f110674q;
            kVar2 = (k) aVar.f110673p;
            pVar2 = (p) aVar.f110672o;
            gVar2 = (g) aVar.f110671n;
            try {
                t.b(objWithContext);
                n0 n0Var7 = n0Var4;
                z12 = z13;
                n0Var5 = n0Var3;
                gVar3 = gVar2;
                n0Var2 = n0Var7;
                th = null;
            } catch (Throwable th8) {
                th = th8;
                n0Var2 = n0Var4;
                pVar3 = pVar2;
                gVar = gVar2;
                p<? super s0, ? super Continuation<? super R>, ? extends Object> pVar5 = pVar3;
                z12 = z13;
                n0Var5 = n0Var3;
                gVar3 = gVar;
                pVar2 = pVar5;
            }
            Pair pairA = x.a(n0Var2.f86529a, th);
            i iVar = (i) pairA.a();
            Throwable th9 = (Throwable) pairA.b();
            if (iVar != null) {
                i iVarN = iVar.n(coroutineContext);
                if (gVar3.readers == gVar3.writers || !z12) {
                    z14 = false;
                }
                lVar = new l(iVarN, z14);
            } else {
                lVar = 0;
            }
            n0Var5.f86529a = lVar;
            if (th9 instanceof TimeoutCancellationException) {
                gVar3.H(z12);
                throw new KotlinNothingValueException();
            }
            if (th9 != null) {
                throw th9;
            }
            if (lVar == 0) {
                throw new IllegalArgumentException("Required value was null.");
            }
            CoroutineContext coroutineContextC2 = gVar3.C(lVar);
            c cVar = new c(pVar2, n0Var5, null);
            aVar.f110671n = kVar2;
            aVar.f110672o = n0Var5;
            aVar.f110673p = null;
            aVar.f110674q = null;
            aVar.f110675r = null;
            aVar.f110676s = null;
            aVar.f110680w = 4;
            objWithContext = BuildersKt.withContext(coroutineContextC2, cVar, aVar);
            if (objWithContext != coroutine_suspended) {
                kVar = kVar2;
                lVar2 = (l) n0Var5.f86529a;
                if (lVar2 != null) {
                    lVar2.n();
                    lVar2.getDelegate().o();
                    kVar.d(lVar2.getDelegate());
                }
                return objWithContext;
            }
            return coroutine_suspended;
        } catch (Throwable th10) {
            th = th10;
            kVar = kVar2;
            n0Var = n0Var5;
            th2 = th;
            throw th2;
        }
    }

    @Override // sa.b, java.lang.AutoCloseable
    public void close() {
        if (this._isClosed.compareAndSet(false, true)) {
            this.readers.b();
            this.writers.b();
        }
    }

    public g(final ya.c driver, final String fileName, int i11, int i12) {
        s.k(driver, "driver");
        s.k(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        io0.b.Companion companion = io0.b.INSTANCE;
        this.timeout = io0.d.s(30, io0.e.SECONDS);
        if (i11 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i12 > 0) {
            this.driver = driver;
            this.readers = new k(i11, new wn0.a() { // from class: sa.c
                @Override // wn0.a
                public final Object invoke() {
                    return g.t(driver, fileName);
                }
            });
            this.writers = new k(i12, new wn0.a() { // from class: sa.d
                @Override // wn0.a
                public final Object invoke() {
                    return g.B(driver, fileName);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
