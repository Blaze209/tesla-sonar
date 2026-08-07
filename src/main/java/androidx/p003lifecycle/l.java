package androidx.p003lifecycle;

import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "a", "(Lkotlinx/coroutines/flow/Flow;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;)Lkotlinx/coroutines/flow/Flow;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/channels/ProducerScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    static final class a<T> extends SuspendLambda implements p<ProducerScope<? super T>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8830n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f8831o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Lifecycle f8832p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Lifecycle.State f8833q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Flow<T> f8834r;

        /* JADX INFO: renamed from: androidx.lifecycle.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        static final class C0179a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f8835n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Flow<T> f8836o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ ProducerScope<T> f8837p;

            /* JADX INFO: renamed from: androidx.lifecycle.l$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class C0180a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ ProducerScope<T> f8838a;

                /* JADX WARN: Multi-variable type inference failed */
                C0180a(ProducerScope<? super T> producerScope) {
                    this.f8838a = producerScope;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t11, Continuation<? super h0> continuation) {
                    Object objSend = this.f8838a.send(t11, continuation);
                    return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0179a(Flow<? extends T> flow, ProducerScope<? super T> producerScope, Continuation<? super C0179a> continuation) {
                super(2, continuation);
                this.f8836o = flow;
                this.f8837p = producerScope;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C0179a(this.f8836o, this.f8837p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f8835n;
                if (i11 == 0) {
                    t.b(obj);
                    Flow<T> flow = this.f8836o;
                    C0180a c0180a = new C0180a(this.f8837p);
                    this.f8835n = 1;
                    if (flow.collect(c0180a, this) == coroutine_suspended) {
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
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C0179a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Lifecycle lifecycle, Lifecycle.State state, Flow<? extends T> flow, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8832p = lifecycle;
            this.f8833q = state;
            this.f8834r = flow;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f8832p, this.f8833q, this.f8834r, continuation);
            aVar.f8831o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ProducerScope producerScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f8830n;
            if (i11 == 0) {
                t.b(obj);
                ProducerScope producerScope2 = (ProducerScope) this.f8831o;
                Lifecycle lifecycle = this.f8832p;
                Lifecycle.State state = this.f8833q;
                C0179a c0179a = new C0179a(this.f8834r, producerScope2, null);
                this.f8831o = producerScope2;
                this.f8830n = 1;
                if (p0.a(lifecycle, state, c0179a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                producerScope = (ProducerScope) this.f8831o;
                t.b(obj);
            }
            SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super h0> continuation) {
            return ((a) create(producerScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final <T> Flow<T> a(Flow<? extends T> flow, Lifecycle lifecycle, Lifecycle.State minActiveState) {
        s.k(flow, "<this>");
        s.k(lifecycle, "lifecycle");
        s.k(minActiveState, "minActiveState");
        return FlowKt.callbackFlow(new a(lifecycle, minActiveState, flow, null));
    }

    public static /* synthetic */ Flow b(Flow flow, Lifecycle lifecycle, Lifecycle.State state, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return a(flow, lifecycle, state);
    }
}
