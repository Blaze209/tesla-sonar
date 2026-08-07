package io.ktor.utils.io;

import ch.qos.logback.core.CoreConstants;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\\\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\u000e*\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "autoFlush", "Lkotlin/Function2;", "Lio/ktor/utils/io/u;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "Lio/ktor/utils/io/t;", "b", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ZLwn0/p;)Lio/ktor/utils/io/t;", "S", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/ktor/utils/io/c;", "channel", "attachJob", "Lio/ktor/utils/io/l;", "a", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/c;ZLwn0/p;)Lio/ktor/utils/io/l;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "S", "", "cause", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f78833c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.f78833c = cVar;
        }

        public final void a(Throwable th2) {
            this.f78833c.close(th2);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "S", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.utils.io.CoroutinesKt$launchChannel$job$1", f = "Coroutines.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f78834n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f78835o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f78836p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ c f78837q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ wn0.p<S, Continuation<? super h0>, Object> f78838r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ CoroutineDispatcher f78839s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z11, c cVar, wn0.p<? super S, ? super Continuation<? super h0>, ? extends Object> pVar, CoroutineDispatcher coroutineDispatcher, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f78836p = z11;
            this.f78837q = cVar;
            this.f78838r = pVar;
            this.f78839s = coroutineDispatcher;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f78836p, this.f78837q, this.f78838r, this.f78839s, continuation);
            bVar.f78835o = obj;
            return bVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.utils.io.p$b for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f78834n
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                jn0.t.b(r6)     // Catch: java.lang.Throwable -> Lf
                goto L61
            Lf:
                r6 = move-exception
                goto L4a
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L19:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.f78835o
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                boolean r1 = r5.f78836p
                if (r1 == 0) goto L38
                io.ktor.utils.io.c r1 = r5.f78837q
                kotlin.coroutines.CoroutineContext r3 = r6.getCoroutineContext()
                kotlinx.coroutines.Job$Key r4 = kotlinx.coroutines.Job.INSTANCE
                kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r4)
                p013kotlin.jvm.internal.s.h(r3)
                kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
                r1.m(r3)
            L38:
                io.ktor.utils.io.m r1 = new io.ktor.utils.io.m
                io.ktor.utils.io.c r3 = r5.f78837q
                r1.<init>(r6, r3)
                wn0.p<S, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object> r6 = r5.f78838r     // Catch: java.lang.Throwable -> Lf
                r5.f78834n = r2     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r6 = r6.invoke(r1, r5)     // Catch: java.lang.Throwable -> Lf
                if (r6 != r0) goto L61
                return r0
            L4a:
                kotlinx.coroutines.CoroutineDispatcher r0 = r5.f78839s
                kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
                boolean r0 = p013kotlin.jvm.internal.s.f(r0, r1)
                if (r0 != 0) goto L5c
                kotlinx.coroutines.CoroutineDispatcher r0 = r5.f78839s
                if (r0 != 0) goto L5b
                goto L5c
            L5b:
                throw r6
            L5c:
                io.ktor.utils.io.c r0 = r5.f78837q
                r0.cancel(r6)
            L61:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.p.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    private static final <S extends CoroutineScope> l a(CoroutineScope coroutineScope, CoroutineContext coroutineContext, c cVar, boolean z11, wn0.p<? super S, ? super Continuation<? super h0>, ? extends Object> pVar) {
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, null, new b(z11, cVar, pVar, (CoroutineDispatcher) coroutineScope.getCoroutineContext().get(CoroutineDispatcher.INSTANCE), null), 2, null);
        jobLaunch$default.invokeOnCompletion(new a(cVar));
        return new l(jobLaunch$default, cVar);
    }

    public static final t b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z11, wn0.p<? super u, ? super Continuation<? super h0>, ? extends Object> block) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "<this>");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        p013kotlin.jvm.internal.s.k(block, "block");
        return a(coroutineScope, coroutineContext, e.a(z11), true, block);
    }

    public static /* synthetic */ t c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z11, wn0.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return b(coroutineScope, coroutineContext, z11, pVar);
    }
}
