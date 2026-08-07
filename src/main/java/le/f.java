package le;

import androidx.p003lifecycle.LifecycleOwner;
import java.util.Arrays;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aS\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u00002\u001e\u0010\u0011\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0010\"\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function1;", "Ljn0/h0;", "callback", "Lkotlinx/coroutines/Job;", "a", "(Lkotlinx/coroutines/flow/Flow;Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/CoroutineScope;Lwn0/l;)Lkotlinx/coroutines/Job;", "scope", "Lkotlinx/coroutines/flow/SharingStarted;", "started", "initialValue", "", "flows", "Lkotlinx/coroutines/flow/StateFlow;", "b", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;[Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/StateFlow;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Ljn0/h0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.util.FlowExtensionsKt$mapToCallbackWithLifeCycle$1", f = "FlowExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a<T> extends SuspendLambda implements p<T, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f89949n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f89950o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ l<T, h0> f89951p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super T, h0> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f89951p = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f89951p, continuation);
            aVar.f89950o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f89949n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            this.f89951p.invoke((T) this.f89950o);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(T t11, Continuation<? super h0> continuation) {
            return ((a) create(t11, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final <T> Job a(Flow<? extends T> flow, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope, l<? super T, h0> callback) {
        s.k(flow, "<this>");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(coroutineScope, "coroutineScope");
        s.k(callback, "callback");
        return FlowKt.launchIn(FlowKt.onEach(androidx.p003lifecycle.l.b(flow, lifecycleOwner.getLifecycle(), null, 2, null), new a(callback, null)), coroutineScope);
    }

    public static final <T> StateFlow<T> b(CoroutineScope scope, SharingStarted started, T t11, Flow<? extends T>... flows) {
        s.k(scope, "scope");
        s.k(started, "started");
        s.k(flows, "flows");
        return FlowKt.stateIn(FlowKt.merge((Flow[]) Arrays.copyOf(flows, flows.length)), scope, started, t11);
    }
}
