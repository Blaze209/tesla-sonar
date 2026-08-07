package z50;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aE\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0010\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u00072\u0006\u0010\r\u001a\u00028\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"K", "V", "Lkotlinx/coroutines/flow/Flow;", "", "keyFlow", "a", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Pair;", "entry", "Ljn0/h0;", "c", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/Pair;)V", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "transform", "b", "(Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/Object;Lwn0/l;)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class i {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\n\u0012\u0006\u0012\u0004\b\u00028\u00010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u008a@"}, d2 = {"K", "V", "Lkotlinx/coroutines/flow/FlowCollector;", "", "map", Action.KEY_ATTRIBUTE, "Ljn0/h0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.utils.FlowsKt$get$1", f = "Flows.kt", i = {}, l = {13}, m = "invokeSuspend", n = {}, s = {})
    static final class a<K, V> extends SuspendLambda implements r<FlowCollector<? super V>, Map<K, ? extends V>, K, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126994n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f126995o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f126996p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f126997q;

        a(Continuation<? super a> continuation) {
            super(4, continuation);
        }

        @Override // wn0.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super V> flowCollector, Map<K, ? extends V> map, K k11, Continuation<? super h0> continuation) {
            a aVar = new a(continuation);
            aVar.f126995o = flowCollector;
            aVar.f126996p = map;
            aVar.f126997q = k11;
            return aVar.invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f126994n;
            if (i11 == 0) {
                t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f126995o;
                Object obj2 = ((Map) this.f126996p).get(this.f126997q);
                if (obj2 != null) {
                    this.f126995o = null;
                    this.f126996p = null;
                    this.f126994n = 1;
                    if (flowCollector.emit(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }
    }

    public static final <K, V> Flow<V> a(Flow<? extends Map<K, ? extends V>> flow, Flow<? extends K> keyFlow) {
        s.k(flow, "<this>");
        s.k(keyFlow, "keyFlow");
        return FlowKt.distinctUntilChanged(FlowKt.flowCombineTransform(flow, keyFlow, new a(null)));
    }

    public static final <K, V> void b(MutableStateFlow<Map<K, V>> mutableStateFlow, K k11, wn0.l<? super V, ? extends V> transform) {
        Map<K, V> value;
        Map<K, V> mapR;
        s.k(mutableStateFlow, "<this>");
        s.k(transform, "transform");
        do {
            value = mutableStateFlow.getValue();
            mapR = value;
            V v11 = mapR.get(k11);
            if (v11 != null) {
                mapR = v0.r(mapR, v0.f(x.a(k11, transform.invoke(v11))));
            }
        } while (!mutableStateFlow.compareAndSet(value, mapR));
    }

    public static final <K, V> void c(MutableStateFlow<Map<K, V>> mutableStateFlow, Pair<? extends K, ? extends V> entry) {
        Map<K, V> value;
        s.k(mutableStateFlow, "<this>");
        s.k(entry, "entry");
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, v0.r(value, v0.f(entry))));
    }
}
