package y20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032$\u0010\b\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00060\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"OutputT", "Ly20/o;", "worker", "", "renderKey", "Ly20/h;", "Ly20/r;", "", "actionSink", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ly20/o;Ljava/lang/String;Ly20/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lkotlinx/coroutines/flow/Flow;", "c", "(Ly20/o;)Lkotlinx/coroutines/flow/Flow;", Action.KEY_ATTRIBUTE, "b", "(Ly20/o;Ljava/lang/String;)Ljava/lang/String;", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
final /* synthetic */ class a0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"OutputT", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.squareup.workflow1.Workflows__WorkerWorkflowKt$runWorker$2", f = "WorkerWorkflow.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124656n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ o<OutputT> f124657o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> f124658p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f124659q;

        /* JADX INFO: Add missing generic type declarations: [OutputT] */
        /* JADX INFO: renamed from: y20.a0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"OutputT", "output", "Ly20/r;", "Ly20/o;", "", "b", "(Ljava/lang/Object;)Ly20/r;"}, k = 3, mv = {1, 6, 0})
        static final class C2692a<OutputT> extends p013kotlin.jvm.internal.u implements wn0.l<OutputT, r<? super o<? extends OutputT>, Integer, ? extends OutputT>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ o<OutputT> f124660c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f124661d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2692a(o<? extends OutputT> oVar, String str) {
                super(1);
                this.f124660c = oVar;
                this.f124661d = str;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final r<o<? extends OutputT>, Integer, OutputT> invoke(OutputT outputt) {
                return new b(this.f124660c, this.f124661d, outputt);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(o<? extends OutputT> oVar, h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f124657o = oVar;
            this.f124658p = hVar;
            this.f124659q = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f124657o, this.f124658p, this.f124659q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f124656n;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flowC = a0.c(this.f124657o);
                h<r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar = this.f124658p;
                C2692a c2692a = new C2692a(this.f124657o, this.f124659q);
                this.f124656n = 1;
                if (w.i(flowC, hVar, c2692a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    private static final String b(o<?> oVar, String str) {
        String string = oVar.toString();
        if (p013kotlin.text.t.y0(str)) {
            return string;
        }
        return string + CoreConstants.COLON_CHAR + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Flow<T> c(o<? extends T> oVar) {
        Flow<? extends T> flowRun = oVar.run();
        if (flowRun != null) {
            return flowRun;
        }
        throw new NullPointerException("Worker " + oVar + " returned a null Flow. If this is a test mock, make sure you mock the run() method!");
    }

    public static final <OutputT> Object d(o<? extends OutputT> oVar, String str, h<? super r<? super o<? extends OutputT>, Integer, ? extends OutputT>> hVar, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(new CoroutineName(b(oVar, str)), new a(oVar, hVar, str, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }
}
