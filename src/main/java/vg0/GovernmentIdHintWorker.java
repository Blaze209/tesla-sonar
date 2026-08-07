package vg0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import pg0.IdConfig;
import wn0.p;
import y20.o;
import zf0.ImageLightCondition;
import zf0.e0;
import zf0.q0;

/* JADX INFO: renamed from: vg0.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u0000 &2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u0012#!B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%¨\u0006'"}, d2 = {"Lvg0/a;", "Ly20/o;", "Lvg0/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzf0/e0;", "governmentIdFeed", "Lpg0/d4$e;", "side", "<init>", "(Landroid/content/Context;Lzf0/e0;Lpg0/d4$e;)V", "Lzf0/q0;", "it", "Lvg0/a$c;", DateTokenConverter.CONVERTER_KEY, "(Lzf0/q0;)Lvg0/a$c;", "otherWorker", "", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroid/content/Context;", "c", "Lzf0/e0;", "Lpg0/d4$e;", "e", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GovernmentIdHintWorker implements o<vg0.d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final e0 governmentIdFeed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdConfig.e side;

    /* JADX INFO: renamed from: vg0.a$b */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvg0/a$b;", "", "Lpg0/d4$e;", "side", "Lvg0/a;", "a", "(Lpg0/d4$e;)Lvg0/a;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        GovernmentIdHintWorker a(IdConfig.e side);
    }

    /* JADX INFO: renamed from: vg0.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvg0/a$c;", "", "Lvg0/d;", "hint", "", "minDurationMs", "<init>", "(Lvg0/d;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvg0/d;", "()Lvg0/d;", "b", "J", "()J", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class HintEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vg0.d hint;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long minDurationMs;

        public HintEvent(vg0.d hint, long j11) {
            s.k(hint, "hint");
            this.hint = hint;
            this.minDurationMs = j11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final vg0.d getHint() {
            return this.hint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintEvent)) {
                return false;
            }
            HintEvent hintEvent = (HintEvent) other;
            return s.f(this.hint, hintEvent.hint) && this.minDurationMs == hintEvent.minDurationMs;
        }

        public int hashCode() {
            return (this.hint.hashCode() * 31) + Long.hashCode(this.minDurationMs);
        }

        public String toString() {
            return "HintEvent(hint=" + this.hint + ", minDurationMs=" + this.minDurationMs + ")";
        }
    }

    /* JADX INFO: renamed from: vg0.a$d */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lvg0/d;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1", f = "GovernmentIdHintWorker.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<FlowCollector<? super vg0.d>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f119311n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f119312o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Flow<HintEvent> f119313p;

        /* JADX INFO: renamed from: vg0.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C2550a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector<vg0.d> f119314a;

            /* JADX INFO: renamed from: vg0.a$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1", f = "GovernmentIdHintWorker.kt", i = {0}, l = {93, 94}, m = "emit", n = {"eventHint"}, s = {"L$0"})
            static final class C2551a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f119315n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                /* synthetic */ Object f119316o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ C2550a<T> f119317p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f119318q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2551a(C2550a<? super T> c2550a, Continuation<? super C2551a> continuation) {
                    super(continuation);
                    this.f119317p = c2550a;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f119316o = obj;
                    this.f119318q |= Integer.MIN_VALUE;
                    return this.f119317p.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C2550a(FlowCollector<? super vg0.d> flowCollector) {
                this.f119314a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
            
                if (kotlinx.coroutines.DelayKt.delay(r8, r0) == r1) goto L28;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(vg0.GovernmentIdHintWorker.HintEvent r8, p013kotlin.coroutines.Continuation<? super jn0.h0> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof vg0.GovernmentIdHintWorker.d.C2550a.C2551a
                    if (r0 == 0) goto L13
                    r0 = r9
                    vg0.a$d$a$a r0 = (vg0.GovernmentIdHintWorker.d.C2550a.C2551a) r0
                    int r1 = r0.f119318q
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f119318q = r1
                    goto L18
                L13:
                    vg0.a$d$a$a r0 = new vg0.a$d$a$a
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f119316o
                    java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f119318q
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L3d
                    if (r2 == r5) goto L35
                    if (r2 != r4) goto L2d
                    jn0.t.b(r9)
                    goto L6f
                L2d:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L35:
                    java.lang.Object r8 = r0.f119315n
                    vg0.a$c r8 = (vg0.GovernmentIdHintWorker.HintEvent) r8
                    jn0.t.b(r9)
                    goto L55
                L3d:
                    jn0.t.b(r9)
                    kotlinx.coroutines.flow.FlowCollector<vg0.d> r9 = r7.f119314a
                    if (r8 == 0) goto L49
                    vg0.d r2 = r8.getHint()
                    goto L4a
                L49:
                    r2 = r3
                L4a:
                    r0.f119315n = r8
                    r0.f119318q = r5
                    java.lang.Object r9 = r9.emit(r2, r0)
                    if (r9 != r1) goto L55
                    goto L6e
                L55:
                    if (r8 == 0) goto L5c
                    long r8 = r8.getMinDurationMs()
                    goto L5e
                L5c:
                    r8 = 0
                L5e:
                    r5 = 33
                    long r8 = bo0.n.g(r8, r5)
                    r0.f119315n = r3
                    r0.f119318q = r4
                    java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r8, r0)
                    if (r8 != r1) goto L6f
                L6e:
                    return r1
                L6f:
                    jn0.h0 r8 = jn0.h0.f84049a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: vg0.GovernmentIdHintWorker.d.C2550a.emit(vg0.a$c, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Flow<HintEvent> flow, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f119313p = flow;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f119313p, continuation);
            dVar.f119312o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f119311n;
            if (i11 == 0) {
                t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f119312o;
                Flow flowConflate = FlowKt.conflate(this.f119313p);
                C2550a c2550a = new C2550a(flowCollector);
                this.f119311n = 1;
                if (flowConflate.collect(c2550a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super vg0.d> flowCollector, Continuation<? super h0> continuation) {
            return ((d) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: vg0.a$e */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lvg0/a$c;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$hintFlow$1", f = "GovernmentIdHintWorker.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<FlowCollector<? super HintEvent>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f119319n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f119320o;

        /* JADX INFO: renamed from: vg0.a$e$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C2552a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector<HintEvent> f119322a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GovernmentIdHintWorker f119323b;

            /* JADX WARN: Multi-variable type inference failed */
            C2552a(FlowCollector<? super HintEvent> flowCollector, GovernmentIdHintWorker governmentIdHintWorker) {
                this.f119322a = flowCollector;
                this.f119323b = governmentIdHintWorker;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation<? super h0> continuation) {
                Object value = ((jn0.s) obj).getValue();
                FlowCollector<HintEvent> flowCollector = this.f119322a;
                GovernmentIdHintWorker governmentIdHintWorker = this.f119323b;
                if (jn0.s.e(value) == null) {
                    Object objEmit = flowCollector.emit(governmentIdHintWorker.d((q0) value), continuation);
                    if (objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objEmit;
                    }
                } else {
                    Object objEmit2 = flowCollector.emit(null, continuation);
                    if (objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objEmit2;
                    }
                }
                return h0.f84049a;
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = GovernmentIdHintWorker.this.new e(continuation);
            eVar.f119320o = obj;
            return eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f119319n;
            if (i11 == 0) {
                t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f119320o;
                e0 e0Var = GovernmentIdHintWorker.this.governmentIdFeed;
                C2552a c2552a = new C2552a(flowCollector, GovernmentIdHintWorker.this);
                this.f119319n = 1;
                if (e0Var.collect(c2552a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super HintEvent> flowCollector, Continuation<? super h0> continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public GovernmentIdHintWorker(Context context, e0 governmentIdFeed, IdConfig.e side) {
        s.k(context, "context");
        s.k(governmentIdFeed, "governmentIdFeed");
        s.k(side, "side");
        this.context = context;
        this.governmentIdFeed = governmentIdFeed;
        this.side = side;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HintEvent d(q0 it) {
        if (it instanceof q0.ParsedIdSide) {
            return new HintEvent(vg0.e.f119327a, 1000L);
        }
        ImageLightCondition imageLightCondition = it.getImageLightCondition();
        if (imageLightCondition == null) {
            return null;
        }
        boolean z11 = imageLightCondition.getRmsContrast() < 0.2d || imageLightCondition.getLowHighContrast() < 0.2d;
        boolean z12 = imageLightCondition.getRmsContrast() > 0.3d && imageLightCondition.getLowHighContrast() > 0.5d;
        if ((imageLightCondition.getLuminosity() >= 0.34d || z12) && (imageLightCondition.getLuminosity() >= 0.45d || !z11)) {
            return null;
        }
        return new HintEvent(f.f119328a, 1000L);
    }

    @Override // y20.o
    public boolean a(o<?> otherWorker) {
        s.k(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdHintWorker) && ((GovernmentIdHintWorker) otherWorker).side == this.side;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdHintWorker)) {
            return false;
        }
        GovernmentIdHintWorker governmentIdHintWorker = (GovernmentIdHintWorker) other;
        return s.f(this.context, governmentIdHintWorker.context) && s.f(this.governmentIdFeed, governmentIdHintWorker.governmentIdFeed) && this.side == governmentIdHintWorker.side;
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.side.hashCode();
    }

    @Override // y20.o
    public Flow<vg0.d> run() {
        return FlowKt.distinctUntilChanged(FlowKt.flow(new d(FlowKt.flow(new e(null)), null)));
    }

    public String toString() {
        return "GovernmentIdHintWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", side=" + this.side + ")";
    }
}
