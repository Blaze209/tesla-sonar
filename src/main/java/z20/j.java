package z20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.selects.SelectBuilder;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import y20.WorkflowOutput;
import y20.r;
import y20.t;
import y20.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0083\u0001\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001c\u001a\u00028\u00032\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u0010\u001b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010 \u001a\u00020\u001f2\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b \u0010!J5\u0010%\u001a\u0004\u0018\u00018\u0004\"\b\b\u0004\u0010\"*\u00020\u00122\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020#H\u0002¢\u0006\u0004\b%\u0010&J>\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020'2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0*\u0012\u0006\u0012\u0004\u0018\u00010\u00120)H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020'H\u0016¢\u0006\u0004\b/\u00100J3\u00102\u001a\u00028\u00032\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u0006\u00101\u001a\u00028\u0000¢\u0006\u0004\b2\u0010\u001dJ%\u00103\u001a\u00020\r2\u0016\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n¢\u0006\u0004\b3\u00104J>\u00105\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0*\u0012\u0006\u0012\u0004\u0018\u00010\u00120)H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106J)\u0010:\u001a\u00020\u001f\"\u0004\b\u0004\u0010\"2\u0014\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0004\u0018\u00010807¢\u0006\u0004\b:\u0010;J\u001f\u0010?\u001a\u00020\u001f2\u0010\b\u0002\u0010>\u001a\n\u0018\u00010<j\u0004\u0018\u0001`=¢\u0006\u0004\b?\u0010@R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u0010A\u001a\u0004\bB\u0010CR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010IR\u001a\u0010N\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010S\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010P\u001a\u0004\bQ\u0010RR&\u0010V\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020,0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010[R,\u0010`\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020#0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010a\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010[R\u0014\u0010d\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010cR\u0014\u0010e\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006f"}, d2 = {"Lz20/j;", "PropsT", "StateT", "OutputT", "RenderingT", "Lkotlinx/coroutines/CoroutineScope;", "Lz20/f$b;", "Ly20/t$c;", "Lz20/k;", "id", "Ly20/k;", AnalyticsContext.Workflow, "initialProps", "Ly20/m;", "snapshot", "Lkotlin/coroutines/CoroutineContext;", "baseContext", "Lkotlin/Function1;", "", "emitOutputToParent", "parent", "Ly20/t;", "interceptor", "Lz20/d;", "idCounter", "<init>", "(Lz20/k;Ly20/k;Ljava/lang/Object;Ly20/m;Lkotlin/coroutines/CoroutineContext;Lwn0/l;Ly20/t$c;Ly20/t;Lz20/d;)V", "props", "m", "(Ly20/k;Ljava/lang/Object;)Ljava/lang/Object;", "newProps", "Ljn0/h0;", "p", "(Ly20/k;Ljava/lang/Object;)V", "T", "Ly20/r;", "action", "c", "(Ly20/r;)Ljava/lang/Object;", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "sideEffect", "Lz20/g;", "f", "(Ljava/lang/String;Lwn0/p;)Lz20/g;", "toString", "()Ljava/lang/String;", "input", "l", "n", "(Ly20/k;)Ly20/m;", "a", "(Ljava/lang/String;Lwn0/p;)V", "Lkotlinx/coroutines/selects/SelectBuilder;", "Ly20/v;", "selector", "o", "(Lkotlinx/coroutines/selects/SelectBuilder;)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/concurrent/CancellationException;)V", "Lz20/k;", "g", "()Lz20/k;", "b", "Lwn0/l;", "Ly20/t$c;", IntegerTokenConverter.CONVERTER_KEY, "()Ly20/t$c;", "Ly20/t;", "e", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "J", "k", "()J", "sessionId", "Lz20/h;", "Lz20/h;", "subtreeManager", "Lz20/a;", "h", "Lz20/a;", "sideEffects", "Ljava/lang/Object;", "lastProps", "Lkotlinx/coroutines/channels/Channel;", "j", "Lkotlinx/coroutines/channels/Channel;", "eventActionsChannel", "state", "Ly20/s;", "()Ly20/s;", "identifier", "renderKey", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class j<PropsT, StateT, OutputT, RenderingT> implements CoroutineScope, f.b, t.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WorkflowNodeId id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<OutputT, Object> emitOutputToParent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t.c parent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t interceptor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long sessionId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h<PropsT, StateT, OutputT> subtreeManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final z20.a<g> sideEffects;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private PropsT lastProps;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Channel<r<PropsT, StateT, OutputT>> eventActionsChannel;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private StateT state;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "it", "Ly20/v;", "b", "(Ljava/lang/Object;)Ly20/v;"}, k = 3, mv = {1, 6, 0})
    static final class a extends u implements wn0.l<OutputT, WorkflowOutput<? extends OutputT>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f126619c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WorkflowOutput<OutputT> invoke(OutputT outputt) {
            return new WorkflowOutput<>(outputt);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "", "Lz20/k;", "Ly20/m;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    static final class b extends u implements wn0.a<Map<WorkflowNodeId, ? extends y20.m>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<WorkflowNodeId, y20.m> f126620c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map<WorkflowNodeId, y20.m> map) {
            super(0);
            this.f126620c = map;
        }

        @Override // wn0.a
        public final Map<WorkflowNodeId, ? extends y20.m> invoke() {
            return this.f126620c;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* synthetic */ class c extends p implements wn0.l<r<? super PropsT, StateT, ? extends OutputT>, Object> {
        c(Object obj) {
            super(1, obj, j.class, "applyAction", "applyAction(Lcom/squareup/workflow1/WorkflowAction;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r<? super PropsT, StateT, ? extends OutputT> p11) {
            s.k(p11, "p0");
            return ((j) this.receiver).c(p11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "PropsT", "StateT", "OutputT", "RenderingT", "Ly20/r;", "action", "Ly20/v;", "<anonymous>", "(Ly20/r;)Ly20/v;"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.squareup.workflow1.internal.WorkflowNode$tick$1$1", f = "WorkflowNode.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d<T> extends SuspendLambda implements wn0.p<r<? super PropsT, StateT, ? extends OutputT>, Continuation<? super WorkflowOutput<? extends T>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126621n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f126622o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ j<PropsT, StateT, OutputT, RenderingT> f126623p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j<PropsT, StateT, OutputT, RenderingT> jVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f126623p = jVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r<? super PropsT, StateT, ? extends OutputT> rVar, Continuation<? super WorkflowOutput<? extends T>> continuation) {
            return ((d) create(rVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f126623p, continuation);
            dVar.f126622o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f126621n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return this.f126623p.c((r) this.f126622o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(WorkflowNodeId id2, y20.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT propst, y20.m mVar, CoroutineContext baseContext, wn0.l<? super OutputT, ? extends Object> emitOutputToParent, t.c cVar, t interceptor, z20.d dVar) {
        s.k(id2, "id");
        s.k(workflow, "workflow");
        s.k(baseContext, "baseContext");
        s.k(emitOutputToParent, "emitOutputToParent");
        s.k(interceptor, "interceptor");
        this.id = id2;
        this.emitOutputToParent = emitOutputToParent;
        this.parent = cVar;
        this.interceptor = interceptor;
        this.coroutineContext = baseContext.plus(JobKt.Job((Job) baseContext.get(Job.INSTANCE))).plus(new CoroutineName(id2.toString()));
        this.sessionId = dVar == null ? 0L : dVar.a();
        this.subtreeManager = new h<>(mVar == null ? null : mVar.a(), getCoroutineContext(), new c(this), this, interceptor, dVar);
        this.sideEffects = new z20.a<>();
        this.lastProps = propst;
        this.eventActionsChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        interceptor.c(this, this);
        this.state = (StateT) y20.u.a(interceptor, workflow, this).d(propst, mVar != null ? mVar.b() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T c(r<? super PropsT, StateT, ? extends OutputT> action) {
        Pair pairH = w.h(action, this.lastProps, this.state);
        StateT statet = (StateT) pairH.a();
        WorkflowOutput workflowOutput = (WorkflowOutput) pairH.b();
        this.state = statet;
        if (workflowOutput == null) {
            return null;
        }
        return (T) this.emitOutputToParent.invoke((OutputT) workflowOutput.a());
    }

    public static /* synthetic */ void e(j jVar, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        jVar.d(cancellationException);
    }

    private final g f(String key, wn0.p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> sideEffect) {
        return new g(key, BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.plus(this, new CoroutineName("sideEffect[" + key + "] for " + this.id)), null, CoroutineStart.LAZY, sideEffect, 1, null));
    }

    private final RenderingT m(y20.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT props) {
        p(workflow, props);
        f fVar = new f(this.subtreeManager, this, this.eventActionsChannel);
        RenderingT renderingt = (RenderingT) y20.u.a(this.interceptor, workflow, this).f(props, this.state, w.a(fVar, workflow));
        fVar.f();
        this.subtreeManager.c();
        for (e.a aVarB = ((z20.a) this.sideEffects).staging.b(); aVarB != null; aVarB = aVarB.getNextListNode()) {
            ((g) aVarB).getJob().start();
        }
        z20.a<g> aVar = this.sideEffects;
        for (e.a aVarB2 = ((z20.a) aVar).active.b(); aVarB2 != null; aVarB2 = aVarB2.getNextListNode()) {
            Job.DefaultImpls.cancel$default(((g) aVarB2).getJob(), (CancellationException) null, 1, (Object) null);
        }
        e eVar = ((z20.a) aVar).active;
        ((z20.a) aVar).active = ((z20.a) aVar).staging;
        ((z20.a) aVar).staging = eVar;
        ((z20.a) aVar).staging.a();
        return renderingt;
    }

    private final void p(y20.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT> workflow, PropsT newProps) {
        if (!s.f(newProps, this.lastProps)) {
            this.state = (StateT) y20.u.a(this.interceptor, workflow, this).e(this.lastProps, newProps, this.state);
        }
        this.lastProps = newProps;
    }

    @Override // z20.f.b
    public void a(String key, wn0.p<? super CoroutineScope, ? super Continuation<? super h0>, ? extends Object> sideEffect) {
        s.k(key, "key");
        s.k(sideEffect, "sideEffect");
        for (e.a aVarB = ((z20.a) this.sideEffects).staging.b(); aVarB != null; aVarB = aVarB.getNextListNode()) {
            if (s.f(key, ((g) aVarB).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String())) {
                throw new IllegalArgumentException(("Expected side effect keys to be unique: \"" + key + CoreConstants.DOUBLE_QUOTE_CHAR).toString());
            }
        }
        z20.a<g> aVar = this.sideEffects;
        e eVar = ((z20.a) aVar).active;
        e.a aVarF = null;
        e.a aVar2 = null;
        for (e.a aVarB2 = eVar.b(); aVarB2 != null; aVarB2 = aVarB2.getNextListNode()) {
            if (s.f(key, ((g) aVarB2).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String())) {
                if (aVar2 == null) {
                    eVar.e(aVarB2.getNextListNode());
                } else {
                    aVar2.a(aVarB2.getNextListNode());
                }
                if (s.f(eVar.c(), aVarB2)) {
                    eVar.f(aVar2);
                }
                aVarB2.a(null);
                aVarF = aVarB2;
                break;
            }
            aVar2 = aVarB2;
        }
        if (aVarF == null) {
            aVarF = f(key, sideEffect);
        }
        ((z20.a) aVar).staging.d(aVarF);
    }

    public final void d(CancellationException cause) {
        JobKt.cancel(getCoroutineContext(), cause);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final WorkflowNodeId getId() {
        return this.id;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public y20.s h() {
        return this.id.getIdentifier();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public t.c getParent() {
        return this.parent;
    }

    public String j() {
        return this.id.getName();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public long getSessionId() {
        return this.sessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RenderingT l(y20.k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> workflow, PropsT input) {
        s.k(workflow, "workflow");
        return m(workflow, input);
    }

    public final y20.m n(y20.k<?, ?, ?, ?> workflow) {
        s.k(workflow, "workflow");
        return new y20.m(y20.u.a(this.interceptor, workflow, this).g(this.state), new b(this.subtreeManager.f()));
    }

    public final <T> void o(SelectBuilder<? super WorkflowOutput<? extends T>> selector) {
        s.k(selector, "selector");
        this.subtreeManager.g(selector);
        selector.invoke(this.eventActionsChannel.getOnReceive(), new d(this, null));
    }

    public String toString() {
        return "WorkflowInstance(identifier=" + h() + ", renderKey=" + j() + ", instanceId=" + getSessionId() + ", parent=" + ((Object) (getParent() == null ? null : "WorkflowInstance(…)")) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ j(WorkflowNodeId workflowNodeId, y20.k kVar, Object obj, y20.m mVar, CoroutineContext coroutineContext, wn0.l lVar, t.c cVar, t tVar, z20.d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(workflowNodeId, kVar, obj, mVar, coroutineContext, (i11 & 32) != 0 ? a.f126619c : lVar, (i11 & 64) != 0 ? null : cVar, (i11 & 128) != 0 ? y20.e.f124678a : tVar, (i11 & 256) != 0 ? null : dVar);
    }
}
