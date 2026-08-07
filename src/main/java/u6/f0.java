package u6;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lu6/f0;", "T", "", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function1;", "", "Ljn0/h0;", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lkotlin/coroutines/Continuation;", "consumeMessage", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lwn0/l;Lwn0/p;Lwn0/p;)V", "msg", "e", "(Ljava/lang/Object;)V", "a", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lwn0/p;", "Lkotlinx/coroutines/channels/Channel;", "c", "Lkotlinx/coroutines/channels/Channel;", "messageQueue", "Lu6/b;", DateTokenConverter.CONVERTER_KEY, "Lu6/b;", "remainingMessages", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<T, Continuation<? super jn0.h0>, Object> consumeMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Channel<T> messageQueue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u6.b remainingMessages;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "ex", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Throwable, jn0.h0> f115453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0<T> f115454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<T, Throwable, jn0.h0> f115455e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.l<? super Throwable, jn0.h0> lVar, f0<T> f0Var, wn0.p<? super T, ? super Throwable, jn0.h0> pVar) {
            super(1);
            this.f115453c = lVar;
            this.f115454d = f0Var;
            this.f115455e = pVar;
        }

        public final void a(Throwable th2) {
            jn0.h0 h0Var;
            this.f115453c.invoke(th2);
            ((f0) this.f115454d).messageQueue.close(th2);
            do {
                Object objM535getOrNullimpl = ChannelResult.m535getOrNullimpl(((f0) this.f115454d).messageQueue.mo523tryReceivePtdJZtk());
                if (objM535getOrNullimpl != null) {
                    this.f115455e.invoke((T) objM535getOrNullimpl, th2);
                    h0Var = jn0.h0.f84049a;
                } else {
                    h0Var = null;
                }
            } while (h0Var != null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Throwable th2) {
            a(th2);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {121, 121}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115456n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f115457o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f0<T> f115458p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f0<T> f0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f115458p = f0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f115458p, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 wn0.p) = (r1v2 wn0.p), (r1v4 wn0.p) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f115457o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f115456n
                wn0.p r1 = (wn0.p) r1
                jn0.t.b(r6)
                goto L51
            L22:
                jn0.t.b(r6)
                u6.f0<T> r6 = r5.f115458p
                u6.b r6 = u6.f0.c(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                u6.f0<T> r6 = r5.f115458p
                kotlinx.coroutines.CoroutineScope r6 = u6.f0.d(r6)
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r6)
                u6.f0<T> r6 = r5.f115458p
                wn0.p r1 = u6.f0.a(r6)
                u6.f0<T> r6 = r5.f115458p
                kotlinx.coroutines.channels.Channel r6 = u6.f0.b(r6)
                r5.f115456n = r1
                r5.f115457o = r3
                java.lang.Object r6 = r6.receive(r5)
                if (r6 != r0) goto L51
                goto L5c
            L51:
                r4 = 0
                r5.f115456n = r4
                r5.f115457o = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                u6.f0<T> r6 = r5.f115458p
                u6.b r6 = u6.f0.c(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.f0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(CoroutineScope scope, wn0.l<? super Throwable, jn0.h0> onComplete, wn0.p<? super T, ? super Throwable, jn0.h0> onUndeliveredElement, wn0.p<? super T, ? super Continuation<? super jn0.h0>, ? extends Object> consumeMessage) {
        p013kotlin.jvm.internal.s.k(scope, "scope");
        p013kotlin.jvm.internal.s.k(onComplete, "onComplete");
        p013kotlin.jvm.internal.s.k(onUndeliveredElement, "onUndeliveredElement");
        p013kotlin.jvm.internal.s.k(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new u6.b(0);
        Job job = (Job) scope.getCoroutineContext().get(Job.INSTANCE);
        if (job != null) {
            job.invokeOnCompletion(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(T msg) throws Throwable {
        Object objMo85trySendJP2dKIU = this.messageQueue.mo85trySendJP2dKIU(msg);
        if (objMo85trySendJP2dKIU instanceof ChannelResult.Closed) {
            Throwable thM534exceptionOrNullimpl = ChannelResult.m534exceptionOrNullimpl(objMo85trySendJP2dKIU);
            if (thM534exceptionOrNullimpl != null) {
                throw thM534exceptionOrNullimpl;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!ChannelResult.m540isSuccessimpl(objMo85trySendJP2dKIU)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.c() == 0) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new b(this, null), 3, null);
        }
    }
}
