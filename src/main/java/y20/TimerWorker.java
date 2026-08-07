package y20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: y20.l, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ly20/l;", "Ly20/o;", "Ljn0/h0;", "", "delayMs", "", Action.KEY_ATTRIBUTE, "<init>", "(JLjava/lang/String;)V", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "otherWorker", "", "a", "(Ly20/o;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "J", "c", "Ljava/lang/String;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final /* data */ class TimerWorker implements o<h0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long delayMs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String key;

    /* JADX INFO: renamed from: y20.l$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.squareup.workflow1.TimerWorker$run$1", f = "Worker.kt", i = {0}, l = {339, 340}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    static final class a extends SuspendLambda implements wn0.p<FlowCollector<? super h0>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124696n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f124697o;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = TimerWorker.this.new a(continuation);
            aVar.f124697o = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
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
                int r1 = r6.f124696n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r7)
                goto L49
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f124697o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r7)
                goto L3b
            L22:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f124697o
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                y20.l r7 = y20.TimerWorker.this
                long r4 = y20.TimerWorker.b(r7)
                r6.f124697o = r1
                r6.f124696n = r3
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
                if (r7 != r0) goto L3b
                goto L48
            L3b:
                jn0.h0 r7 = jn0.h0.f84049a
                r3 = 0
                r6.f124697o = r3
                r6.f124696n = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L49
            L48:
                return r0
            L49:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: y20.TimerWorker.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super h0> flowCollector, Continuation<? super h0> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public TimerWorker(long j11, String key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        this.delayMs = j11;
        this.key = key;
    }

    @Override // y20.o
    public boolean a(o<?> otherWorker) {
        p013kotlin.jvm.internal.s.k(otherWorker, "otherWorker");
        return (otherWorker instanceof TimerWorker) && p013kotlin.jvm.internal.s.f(((TimerWorker) otherWorker).key, this.key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerWorker)) {
            return false;
        }
        TimerWorker timerWorker = (TimerWorker) other;
        return this.delayMs == timerWorker.delayMs && p013kotlin.jvm.internal.s.f(this.key, timerWorker.key);
    }

    public int hashCode() {
        return (Long.hashCode(this.delayMs) * 31) + this.key.hashCode();
    }

    @Override // y20.o
    public Flow<h0> run() {
        return FlowKt.flow(new a(null));
    }

    public String toString() {
        return "TimerWorker(delayMs=" + this.delayMs + ", key=" + this.key + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
