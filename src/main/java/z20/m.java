package z20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.selects.SelectBuilderImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import y20.WorkflowOutput;
import y20.q;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004BI\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010 \u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010,R0\u00100\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lz20/m;", "PropsT", "OutputT", "RenderingT", "", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Ly20/q;", "protoWorkflow", "Lkotlinx/coroutines/flow/StateFlow;", "props", "Ly20/m;", "snapshot", "Ly20/t;", "interceptor", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ly20/q;Lkotlinx/coroutines/flow/StateFlow;Ly20/m;Ly20/t;)V", "Ly20/g;", "g", "()Ly20/g;", "Ly20/v;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Ljn0/h0;", "e", "(Ljava/util/concurrent/CancellationException;)V", "Ly20/k;", "a", "Ly20/k;", AnalyticsContext.Workflow, "Lz20/d;", "b", "Lz20/d;", "idCounter", "c", "Ljava/lang/Object;", "currentProps", "Lkotlinx/coroutines/channels/ReceiveChannel;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/channels/ReceiveChannel;", "getPropsChannel$annotations", "()V", "propsChannel", "Lz20/j;", "Lz20/j;", "rootNode", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class m<PropsT, OutputT, RenderingT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y20.k<PropsT, ?, OutputT, RenderingT> workflow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d idCounter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private PropsT currentProps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ReceiveChannel<PropsT> propsChannel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j<PropsT, ? extends Object, OutputT, RenderingT> rootNode;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lkotlinx/coroutines/channels/ChannelResult;", "channelResult", "Ly20/v;", "<anonymous>", "(Lkotlinx/coroutines/channels/ChannelResult;)Ly20/v;"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.squareup.workflow1.internal.WorkflowRunner$nextOutput$2$1", f = "WorkflowRunner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<ChannelResult<? extends PropsT>, Continuation<? super WorkflowOutput<? extends OutputT>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126632n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f126633o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m<PropsT, OutputT, RenderingT> f126634p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m<PropsT, OutputT, RenderingT> mVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f126634p = mVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f126634p, continuation);
            aVar.f126633o = obj;
            return aVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m860invokeWpGqRn0(((ChannelResult) obj).getHolder(), (Continuation) obj2);
        }

        /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
        public final Object m860invokeWpGqRn0(Object obj, Continuation<? super WorkflowOutput<? extends OutputT>> continuation) {
            return ((a) create(ChannelResult.m530boximpl(obj), continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f126632n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Object holder = ((ChannelResult) this.f126633o).getHolder();
            Throwable thM534exceptionOrNullimpl = ChannelResult.m534exceptionOrNullimpl(holder);
            if (thM534exceptionOrNullimpl != null) {
                throw thM534exceptionOrNullimpl;
            }
            Object objM535getOrNullimpl = ChannelResult.m535getOrNullimpl(holder);
            if (objM535getOrNullimpl == null) {
                return null;
            }
            m<PropsT, OutputT, RenderingT> mVar = this.f126634p;
            if (s.f(((m) mVar).currentProps, objM535getOrNullimpl)) {
                return null;
            }
            ((m) mVar).currentProps = objM535getOrNullimpl;
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "PropsT", "OutputT", "RenderingT", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.squareup.workflow1.internal.WorkflowRunner$propsChannel$1", f = "WorkflowRunner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<PropsT, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126635n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f126636o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m<PropsT, OutputT, RenderingT> f126637p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m<PropsT, OutputT, RenderingT> mVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f126637p = mVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f126637p, continuation);
            bVar.f126636o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f126635n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxBoolean(s.f(this.f126636o, ((m) this.f126637p).currentProps));
        }

        @Override // wn0.p
        public final Object invoke(PropsT propst, Continuation<? super Boolean> continuation) {
            return ((b) create(propst, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public m(CoroutineScope scope, q<? super PropsT, ? extends OutputT, ? extends RenderingT> protoWorkflow, StateFlow<? extends PropsT> props, y20.m mVar, y20.t interceptor) {
        s.k(scope, "scope");
        s.k(protoWorkflow, "protoWorkflow");
        s.k(props, "props");
        s.k(interceptor, "interceptor");
        y20.k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT> kVarA = protoWorkflow.a();
        this.workflow = kVarA;
        d dVar = new d();
        this.idCounter = dVar;
        this.currentProps = props.getValue();
        this.propsChannel = FlowKt.produceIn(FlowKt.dropWhile(props, new b(this, null)), scope);
        this.rootNode = new j<>(l.b(kVarA, null, 1, null), kVarA, this.currentProps, mVar, scope.getCoroutineContext(), null, null, interceptor, dVar, 96, null);
    }

    public final void e(CancellationException cause) {
        this.rootNode.d(cause);
    }

    public final Object f(Continuation<? super WorkflowOutput<? extends OutputT>> continuation) {
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(continuation);
        try {
            if (!this.propsChannel.isClosedForReceive()) {
                selectBuilderImpl.invoke(this.propsChannel.getOnReceiveCatching(), new a(this, null));
            }
            this.rootNode.o(selectBuilderImpl);
        } catch (Throwable th2) {
            selectBuilderImpl.handleBuilderException(th2);
        }
        Object result = selectBuilderImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final y20.g<RenderingT> g() {
        return new y20.g<>(this.rootNode.l((y20.k<? super PropsT, ?, ? extends OutputT, ? extends RenderingT>) this.workflow, this.currentProps), this.rootNode.n((y20.k<?, ?, ?, ?>) this.workflow));
    }
}
