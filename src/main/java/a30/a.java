package a30;

import androidx.p003lifecycle.s0;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u009c\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2$\b\u0002\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"PropsT", "OutputT", "RenderingT", "Ly20/q;", AnalyticsContext.Workflow, "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/flow/StateFlow;", "props", "Landroidx/lifecycle/s0;", "savedStateHandle", "", "Ly20/t;", "interceptors", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "onOutput", "a", "(Ly20/q;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/s0;Ljava/util/List;Lwn0/p;)Lkotlinx/coroutines/flow/StateFlow;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class a {

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    /* JADX INFO: renamed from: a30.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class C0007a<RenderingT> implements Flow<RenderingT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f108a;

        /* JADX INFO: renamed from: a30.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0008a implements FlowCollector<y20.g<? extends RenderingT>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f109a;

            /* JADX INFO: renamed from: a30.a$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$$inlined$map$1$2", f = "AndroidRenderWorkflow.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
            public static final class C0009a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f110n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f111o;

                public C0009a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f110n = obj;
                    this.f111o |= Integer.MIN_VALUE;
                    return C0008a.this.emit(null, this);
                }
            }

            public C0008a(FlowCollector flowCollector) {
                this.f109a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public Object emit(Object obj, Continuation continuation) {
                C0009a c0009a;
                if (continuation instanceof C0009a) {
                    c0009a = (C0009a) continuation;
                    int i11 = c0009a.f111o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0009a.f111o = i11 - Integer.MIN_VALUE;
                    } else {
                        c0009a = new C0009a(continuation);
                    }
                } else {
                    c0009a = new C0009a(continuation);
                }
                Object obj2 = c0009a.f110n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c0009a.f111o;
                if (i12 == 0) {
                    jn0.t.b(obj2);
                    FlowCollector flowCollector = this.f109a;
                    Object objA = ((y20.g) obj).a();
                    c0009a.f111o = 1;
                    if (flowCollector.emit(objA, c0009a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj2);
                }
                return jn0.h0.f84049a;
            }
        }

        public C0007a(Flow flow) {
            this.f108a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f108a.collect(new C0008a(flowCollector), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [RenderingT] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"PropsT", "OutputT", "RenderingT", "Ly20/g;", "it", "Ljn0/h0;", "<anonymous>", "(Ly20/g;)V"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.squareup.workflow1.ui.AndroidRenderWorkflowKt$renderWorkflowIn$4", f = "AndroidRenderWorkflow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b<RenderingT> extends SuspendLambda implements wn0.p<y20.g<? extends RenderingT>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f114o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ s0 f115p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s0 s0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f115p = s0Var;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y20.g<? extends RenderingT> gVar, Continuation<? super jn0.h0> continuation) {
            return ((b) create(gVar, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f115p, continuation);
            bVar.f114o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f113n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            y20.g gVar = (y20.g) this.f114o;
            s0 s0Var = this.f115p;
            if (s0Var != null) {
                s0Var.n("com.squareup.workflow1.ui.renderWorkflowIn-snapshot", new p(gVar.getSnapshot()));
            }
            return jn0.h0.f84049a;
        }
    }

    public static final <PropsT, OutputT, RenderingT> StateFlow<RenderingT> a(y20.q<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, CoroutineScope scope, StateFlow<? extends PropsT> props, s0 s0Var, List<? extends y20.t> interceptors, wn0.p<? super OutputT, ? super Continuation<? super jn0.h0>, ? extends Object> onOutput) {
        p pVar;
        p013kotlin.jvm.internal.s.k(workflow, "workflow");
        p013kotlin.jvm.internal.s.k(scope, "scope");
        p013kotlin.jvm.internal.s.k(props, "props");
        p013kotlin.jvm.internal.s.k(interceptors, "interceptors");
        p013kotlin.jvm.internal.s.k(onOutput, "onOutput");
        StateFlow stateFlowA = y20.f.a(workflow, scope, props, (s0Var == null || (pVar = (p) s0Var.f("com.squareup.workflow1.ui.renderWorkflowIn-snapshot")) == null) ? null : pVar.getSnapshot(), interceptors, onOutput);
        return FlowKt.stateIn(new C0007a(FlowKt.onEach(stateFlowA, new b(s0Var, null))), scope, SharingStarted.INSTANCE.getEagerly(), ((y20.g) stateFlowA.getValue()).a());
    }
}
