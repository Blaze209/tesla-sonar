package uk0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import tk0.i;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0002\r\u000fBF\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR3\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Luk0/e;", "", "Lkotlin/Function2;", "Lyk0/c;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "responseHandler", "Lkotlin/Function1;", "Lpk0/a;", "", "filter", "<init>", "(Lwn0/p;Lwn0/l;)V", "a", "Lwn0/p;", "b", "Lwn0/l;", "c", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl0.a<e> f116411d = new dl0.a<>("BodyInterceptor");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p<yk0.c, Continuation<? super h0>, Object> responseHandler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<pk0.a, Boolean> filter;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003RA\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0000@\u0000X\u0080\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Luk0/e$a;", "", "<init>", "()V", "Lkotlin/Function2;", "Lyk0/c;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "a", "Lwn0/p;", "b", "()Lwn0/p;", "c", "(Lwn0/p;)V", "responseHandler", "Lkotlin/Function1;", "Lpk0/a;", "", "Lwn0/l;", "()Lwn0/l;", "setFilter$ktor_client_core", "(Lwn0/l;)V", "filter", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private p<? super yk0.c, ? super Continuation<? super h0>, ? extends Object> responseHandler = new C2509a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private l<? super pk0.a, Boolean> filter;

        /* JADX INFO: renamed from: uk0.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyk0/c;", "it", "Ljn0/h0;", "<anonymous>", "(Lyk0/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserver$Config$responseHandler$1", f = "ResponseObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C2509a extends SuspendLambda implements p<yk0.c, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f116416n;

            C2509a(Continuation<? super C2509a> continuation) {
                super(2, continuation);
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yk0.c cVar, Continuation<? super h0> continuation) {
                return ((C2509a) create(cVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C2509a(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f116416n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return h0.f84049a;
            }
        }

        public final l<pk0.a, Boolean> a() {
            return this.filter;
        }

        public final p<yk0.c, Continuation<? super h0>, Object> b() {
            return this.responseHandler;
        }

        public final void c(p<? super yk0.c, ? super Continuation<? super h0>, ? extends Object> pVar) {
            s.k(pVar, "<set-?>");
            this.responseHandler = pVar;
        }
    }

    /* JADX INFO: renamed from: uk0.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Luk0/e$b;", "Ltk0/i;", "Luk0/e$a;", "Luk0/e;", "<init>", "()V", "Lkotlin/Function1;", "Ljn0/h0;", "block", DateTokenConverter.CONVERTER_KEY, "(Lwn0/l;)Luk0/e;", "plugin", "Lok0/a;", "scope", "c", "(Luk0/e;Lok0/a;)V", "Ldl0/a;", Action.KEY_ATTRIBUTE, "Ldl0/a;", "getKey", "()Ldl0/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements i<a, e> {

        /* JADX INFO: renamed from: uk0.e$b$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhl0/e;", "Lyk0/c;", "Ljn0/h0;", "response", "<anonymous>", "(Lhl0/e;Lyk0/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1", f = "ResponseObserver.kt", i = {0, 0, 0}, l = {68, 77}, m = "invokeSuspend", n = {"$this$intercept", "newResponse", "sideResponse"}, s = {"L$0", "L$1", "L$2"})
        static final class a extends SuspendLambda implements q<hl0.e<yk0.c, h0>, yk0.c, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f116417n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f116418o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f116419p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private /* synthetic */ Object f116420q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f116421r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ e f116422s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ok0.a f116423t;

            /* JADX INFO: renamed from: uk0.e$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1$1", f = "ResponseObserver.kt", i = {0}, l = {69, 73}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
            static final class C2510a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f116424n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f116425o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ yk0.c f116426p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ e f116427q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2510a(yk0.c cVar, e eVar, Continuation<? super C2510a> continuation) {
                    super(2, continuation);
                    this.f116426p = cVar;
                    this.f116427q = eVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    C2510a c2510a = new C2510a(this.f116426p, this.f116427q, continuation);
                    c2510a.f116425o = obj;
                    return c2510a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
                
                    if (r7 == r0) goto L29;
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
                        int r1 = r6.f116424n
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L26
                        if (r1 == r3) goto L1c
                        if (r1 != r2) goto L14
                        jn0.t.b(r7)     // Catch: java.lang.Throwable -> L12
                        goto L69
                    L12:
                        r7 = move-exception
                        goto L77
                    L14:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1c:
                        java.lang.Object r1 = r6.f116425o
                        kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                        jn0.t.b(r7)     // Catch: java.lang.Throwable -> L24
                        goto L42
                    L24:
                        r7 = move-exception
                        goto L48
                    L26:
                        jn0.t.b(r7)
                        java.lang.Object r7 = r6.f116425o
                        kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
                        uk0.e r1 = r6.f116427q
                        yk0.c r4 = r6.f116426p
                        jn0.s$a r5 = jn0.s.INSTANCE     // Catch: java.lang.Throwable -> L24
                        wn0.p r1 = uk0.e.c(r1)     // Catch: java.lang.Throwable -> L24
                        r6.f116425o = r7     // Catch: java.lang.Throwable -> L24
                        r6.f116424n = r3     // Catch: java.lang.Throwable -> L24
                        java.lang.Object r7 = r1.invoke(r4, r6)     // Catch: java.lang.Throwable -> L24
                        if (r7 != r0) goto L42
                        goto L68
                    L42:
                        jn0.h0 r7 = jn0.h0.f84049a     // Catch: java.lang.Throwable -> L24
                        jn0.s.b(r7)     // Catch: java.lang.Throwable -> L24
                        goto L51
                    L48:
                        jn0.s$a r1 = jn0.s.INSTANCE
                        java.lang.Object r7 = jn0.t.a(r7)
                        jn0.s.b(r7)
                    L51:
                        yk0.c r7 = r6.f116426p
                        io.ktor.utils.io.g r7 = r7.getContent()
                        boolean r1 = r7.o()
                        if (r1 != 0) goto L80
                        r1 = 0
                        r6.f116425o = r1     // Catch: java.lang.Throwable -> L12
                        r6.f116424n = r2     // Catch: java.lang.Throwable -> L12
                        java.lang.Object r7 = io.ktor.utils.io.i.c(r7, r6)     // Catch: java.lang.Throwable -> L12
                        if (r7 != r0) goto L69
                    L68:
                        return r0
                    L69:
                        java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L12
                        long r0 = r7.longValue()     // Catch: java.lang.Throwable -> L12
                        java.lang.Long r7 = p013kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)     // Catch: java.lang.Throwable -> L12
                        jn0.s.b(r7)     // Catch: java.lang.Throwable -> L12
                        goto L80
                    L77:
                        jn0.s$a r0 = jn0.s.INSTANCE
                        java.lang.Object r7 = jn0.t.a(r7)
                        jn0.s.b(r7)
                    L80:
                        jn0.h0 r7 = jn0.h0.f84049a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: uk0.e.Companion.a.C2510a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C2510a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, ok0.a aVar, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f116422s = eVar;
                this.f116423t = aVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hl0.e<yk0.c, h0> eVar, yk0.c cVar, Continuation<? super h0> continuation) {
                a aVar = new a(this.f116422s, this.f116423t, continuation);
                aVar.f116420q = eVar;
                aVar.f116421r = cVar;
                return aVar.invokeSuspend(h0.f84049a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x00be, code lost:
            
                if (r10.d(r9, r12) == r0) goto L23;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r12.f116419p
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L34
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    jn0.t.b(r13)
                    goto Lc1
                L13:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1b:
                    java.lang.Object r1 = r12.f116418o
                    kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                    java.lang.Object r3 = r12.f116417n
                    yk0.c r3 = (yk0.c) r3
                    java.lang.Object r4 = r12.f116421r
                    yk0.c r4 = (yk0.c) r4
                    java.lang.Object r5 = r12.f116420q
                    hl0.e r5 = (hl0.e) r5
                    jn0.t.b(r13)
                    r9 = r3
                    r3 = r1
                    r1 = r9
                    r9 = r4
                L32:
                    r10 = r5
                    goto L9f
                L34:
                    jn0.t.b(r13)
                    java.lang.Object r13 = r12.f116420q
                    r5 = r13
                    hl0.e r5 = (hl0.e) r5
                    java.lang.Object r13 = r12.f116421r
                    yk0.c r13 = (yk0.c) r13
                    uk0.e r1 = r12.f116422s
                    wn0.l r1 = uk0.e.a(r1)
                    if (r1 == 0) goto L5b
                    pk0.a r4 = r13.getCall()
                    java.lang.Object r1 = r1.invoke(r4)
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L5b
                    jn0.h0 r13 = jn0.h0.f84049a
                    return r13
                L5b:
                    io.ktor.utils.io.g r1 = r13.getContent()
                    kotlin.Pair r1 = dl0.f.a(r1, r13)
                    java.lang.Object r4 = r1.a()
                    io.ktor.utils.io.g r4 = (io.ktor.utils.io.g) r4
                    java.lang.Object r1 = r1.b()
                    io.ktor.utils.io.g r1 = (io.ktor.utils.io.g) r1
                    pk0.a r6 = r13.getCall()
                    pk0.a r1 = uk0.b.a(r6, r1)
                    yk0.c r1 = r1.e()
                    pk0.a r13 = r13.getCall()
                    pk0.a r13 = uk0.b.a(r13, r4)
                    yk0.c r13 = r13.e()
                    ok0.a r4 = r12.f116423t
                    r12.f116420q = r5
                    r12.f116421r = r1
                    r12.f116417n = r13
                    r12.f116418o = r4
                    r12.f116419p = r3
                    java.lang.Object r3 = uk0.f.a(r12)
                    if (r3 != r0) goto L9a
                    goto Lc0
                L9a:
                    r9 = r1
                    r1 = r13
                    r13 = r3
                    r3 = r4
                    goto L32
                L9f:
                    r4 = r13
                    kotlin.coroutines.CoroutineContext r4 = (p013kotlin.coroutines.CoroutineContext) r4
                    uk0.e$b$a$a r6 = new uk0.e$b$a$a
                    uk0.e r13 = r12.f116422s
                    r11 = 0
                    r6.<init>(r1, r13, r11)
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r3, r4, r5, r6, r7, r8)
                    r12.f116420q = r11
                    r12.f116421r = r11
                    r12.f116417n = r11
                    r12.f116418o = r11
                    r12.f116419p = r2
                    java.lang.Object r13 = r10.d(r9, r12)
                    if (r13 != r0) goto Lc1
                Lc0:
                    return r0
                Lc1:
                    jn0.h0 r13 = jn0.h0.f84049a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: uk0.e.Companion.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(e plugin, ok0.a scope) {
            s.k(plugin, "plugin");
            s.k(scope, "scope");
            scope.getReceivePipeline().l(yk0.b.INSTANCE.a(), new a(plugin, scope, null));
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e a(l<? super a, h0> block) {
            s.k(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new e(aVar.b(), aVar.a());
        }

        @Override // tk0.i
        public dl0.a<e> getKey() {
            return e.f116411d;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(p<? super yk0.c, ? super Continuation<? super h0>, ? extends Object> responseHandler, l<? super pk0.a, Boolean> lVar) {
        s.k(responseHandler, "responseHandler");
        this.responseHandler = responseHandler;
        this.filter = lVar;
    }
}
