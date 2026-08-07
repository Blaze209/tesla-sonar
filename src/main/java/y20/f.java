package y20;

import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.List;
import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009e\u0001\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00130\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"PropsT", "OutputT", "RenderingT", "Ly20/q;", AnalyticsContext.Workflow, "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/flow/StateFlow;", "props", "Ly20/m;", "initialSnapshot", "", "Ly20/t;", "interceptors", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "onOutput", "Ly20/g;", "a", "(Ly20/q;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/StateFlow;Ly20/m;Ljava/util/List;Lwn0/p;)Lkotlinx/coroutines/flow/StateFlow;", "wf1-workflow-runtime"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"PropsT", "OutputT", "RenderingT", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.squareup.workflow1.RenderWorkflowKt$renderWorkflowIn$1", f = "RenderWorkflow.kt", i = {0, 1}, l = {136, 145}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124679n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f124680o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ z20.m<PropsT, OutputT, RenderingT> f124681p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ MutableStateFlow<g<RenderingT>> f124682q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ wn0.p<OutputT, Continuation<? super h0>, Object> f124683r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(z20.m<PropsT, OutputT, RenderingT> mVar, MutableStateFlow<g<RenderingT>> mutableStateFlow, wn0.p<? super OutputT, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f124681p = mVar;
            this.f124682q = mutableStateFlow;
            this.f124683r = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f124681p, this.f124682q, this.f124683r, continuation);
            aVar.f124680o = obj;
            return aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:23:0x005b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:23:0x005b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to y20.f$a for r7v2 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f124679n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r7.f124680o
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                jn0.t.b(r8)
                goto L5b
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r1 = r7.f124680o
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                jn0.t.b(r8)
                goto L43
            L26:
                jn0.t.b(r8)
                java.lang.Object r8 = r7.f124680o
                kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            L2d:
                boolean r1 = kotlinx.coroutines.CoroutineScopeKt.isActive(r8)
                if (r1 == 0) goto L6e
                z20.m<PropsT, OutputT, RenderingT> r1 = r7.f124681p
                r7.f124680o = r8
                r7.f124679n = r3
                java.lang.Object r1 = r1.f(r7)
                if (r1 != r0) goto L40
                goto L6d
            L40:
                r6 = r1
                r1 = r8
                r8 = r6
            L43:
                y20.v r8 = (y20.WorkflowOutput) r8
                boolean r4 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r4 != 0) goto L4e
                jn0.h0 r8 = jn0.h0.f84049a
                return r8
            L4e:
                kotlinx.coroutines.flow.MutableStateFlow<y20.g<RenderingT>> r4 = r7.f124682q
                z20.m<PropsT, OutputT, RenderingT> r5 = r7.f124681p
                y20.g r5 = r5.g()
                r4.setValue(r5)
                if (r8 != 0) goto L5d
            L5b:
                r8 = r1
                goto L2d
            L5d:
                wn0.p<OutputT, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object> r4 = r7.f124683r
                java.lang.Object r8 = r8.a()
                r7.f124680o = r1
                r7.f124679n = r2
                java.lang.Object r8 = r4.invoke(r8, r7)
                if (r8 != r0) goto L5b
            L6d:
                return r0
            L6e:
                jn0.h0 r8 = jn0.h0.f84049a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: y20.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final <PropsT, OutputT, RenderingT> StateFlow<g<RenderingT>> a(q<? super PropsT, ? extends OutputT, ? extends RenderingT> workflow, CoroutineScope scope, StateFlow<? extends PropsT> props, m mVar, List<? extends t> interceptors, wn0.p<? super OutputT, ? super Continuation<? super h0>, ? extends Object> onOutput) {
        p013kotlin.jvm.internal.s.k(workflow, "workflow");
        p013kotlin.jvm.internal.s.k(scope, "scope");
        p013kotlin.jvm.internal.s.k(props, "props");
        p013kotlin.jvm.internal.s.k(interceptors, "interceptors");
        p013kotlin.jvm.internal.s.k(onOutput, "onOutput");
        z20.m mVar2 = new z20.m(scope, workflow, props, mVar, z20.c.a(interceptors));
        try {
            MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(mVar2.g());
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new a(mVar2, MutableStateFlow, onOutput, null), 3, null);
            return MutableStateFlow;
        } catch (Throwable th2) {
            CancellationException CancellationException = th2 instanceof CancellationException ? th2 : null;
            if (CancellationException == null) {
                CancellationException = ExceptionsKt.CancellationException("Workflow runtime failed", th2);
            }
            mVar2.e(CancellationException);
            throw th2;
        }
    }
}
