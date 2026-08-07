package r90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendFunction;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.u;
import wn0.q;
import wn0.r;
import wn0.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aE\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u0006\u001a]\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aw\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00030\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u00022\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0091\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00040\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0014\"\u0004\b\u0004\u0010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00030\u00022$\u0010\u0004\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a«\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00050\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0014\"\u0004\b\u0004\u0010\u0019\"\u0004\b\u0005\u0010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00030\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00040\u00022*\u0010\u0004\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aÅ\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00060\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0014\"\u0004\b\u0004\u0010\u0019\"\u0004\b\u0005\u0010\u001e\"\u0004\b\u0006\u0010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00030\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00040\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00050\u000220\u0010\u0004\u001a,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060 H\u0007¢\u0006\u0004\b!\u0010\"\u001a#\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010#\u001a\u00028\u0000H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/Function1;", "transform", "m", "(Lkotlinx/coroutines/flow/StateFlow;Lwn0/l;)Lkotlinx/coroutines/flow/StateFlow;", "l", "T1", "T2", "flow1", "flow2", "Lkotlin/Function2;", "h", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lwn0/p;)Lkotlinx/coroutines/flow/StateFlow;", "T3", "flow3", "Lkotlin/Function3;", "g", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lwn0/q;)Lkotlinx/coroutines/flow/StateFlow;", "T4", "flow4", "Lkotlin/Function4;", "f", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lwn0/r;)Lkotlinx/coroutines/flow/StateFlow;", "T5", "flow5", "Lkotlin/Function5;", "e", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lwn0/s;)Lkotlinx/coroutines/flow/StateFlow;", "T6", "flow6", "Lkotlin/Function6;", DateTokenConverter.CONVERTER_KEY, "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lwn0/t;)Lkotlinx/coroutines/flow/StateFlow;", "value", "n", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$$inlined$unsafeFlow$3", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<R> implements Flow<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f107396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f107397b;

        /* JADX INFO: renamed from: r90.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1"}, k = 3, mv = {1, 9, 0})
        static final class C2284a extends u implements wn0.a<Object[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Flow[] f107398c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2284a(Flow[] flowArr) {
                super(0);
                this.f107398c = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Object[this.f107398c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$$inlined$combine$2$3", f = "StateFlows.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements q<FlowCollector<? super R>, Object[], Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f107399n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f107400o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f107401p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ s f107402q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Continuation continuation, s sVar) {
                super(3, continuation);
                this.f107402q = sVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f107399n;
                if (i11 == 0) {
                    t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f107400o;
                    Object[] objArr = (Object[]) this.f107401p;
                    Object objD = this.f107402q.d(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
                    this.f107399n = 1;
                    if (flowCollector.emit(objD, this) == coroutine_suspended) {
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

            @Override // wn0.q
            public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, Continuation<? super h0> continuation) {
                b bVar = new b(continuation, this.f107402q);
                bVar.f107400o = flowCollector;
                bVar.f107401p = objArr;
                return bVar.invokeSuspend(h0.f84049a);
            }
        }

        public a(Flow[] flowArr, s sVar) {
            this.f107396a = flowArr;
            this.f107397b = sVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f107396a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C2284a(flowArr), new b(null, this.f107397b), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$$inlined$unsafeFlow$3", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<R> implements Flow<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f107403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.t f107404b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<Object[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Flow[] f107405c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Flow[] flowArr) {
                super(0);
                this.f107405c = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Object[this.f107405c.length];
            }
        }

        /* JADX INFO: renamed from: r90.g$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$$inlined$combine$3$3", f = "StateFlows.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class C2285b extends SuspendLambda implements q<FlowCollector<? super R>, Object[], Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f107406n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f107407o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f107408p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ wn0.t f107409q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2285b(Continuation continuation, wn0.t tVar) {
                super(3, continuation);
                this.f107409q = tVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f107406n;
                if (i11 == 0) {
                    t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f107407o;
                    Object[] objArr = (Object[]) this.f107408p;
                    Object objI = this.f107409q.i(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
                    this.f107406n = 1;
                    if (flowCollector.emit(objI, this) == coroutine_suspended) {
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

            @Override // wn0.q
            public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, Continuation<? super h0> continuation) {
                C2285b c2285b = new C2285b(continuation, this.f107409q);
                c2285b.f107407o = flowCollector;
                c2285b.f107408p = objArr;
                return c2285b.invokeSuspend(h0.f84049a);
            }
        }

        public b(Flow[] flowArr, wn0.t tVar) {
            this.f107403a = flowArr;
            this.f107404b = tVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f107403a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new a(flowArr), new C2285b(null, this.f107404b), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\n\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u0007\"\u0004\b\u0006\u0010\u0001H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c<R> extends u implements wn0.a<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.t<T1, T2, T3, T4, T5, T6, R> f107410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StateFlow<T1> f107411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ StateFlow<T2> f107412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ StateFlow<T3> f107413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ StateFlow<T4> f107414g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ StateFlow<T5> f107415h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ StateFlow<T6> f107416i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> tVar, StateFlow<? extends T1> stateFlow, StateFlow<? extends T2> stateFlow2, StateFlow<? extends T3> stateFlow3, StateFlow<? extends T4> stateFlow4, StateFlow<? extends T5> stateFlow5, StateFlow<? extends T6> stateFlow6) {
            super(0);
            this.f107410c = tVar;
            this.f107411d = stateFlow;
            this.f107412e = stateFlow2;
            this.f107413f = stateFlow3;
            this.f107414g = stateFlow4;
            this.f107415h = stateFlow5;
            this.f107416i = stateFlow6;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // wn0.a
        public final R invoke() {
            return this.f107410c.i((T1) this.f107411d.getValue(), (T2) this.f107412e.getValue(), (T3) this.f107413f.getValue(), (T4) this.f107414g.getValue(), (T5) this.f107415h.getValue(), (T6) this.f107416i.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T1, T2] */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class d<R, T1, T2> extends p implements q<T1, T2, Continuation<? super R>, Object>, SuspendFunction {
        d(Object obj) {
            super(3, obj, kotlin.jvm.internal.s.a.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$1(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T1 t11, T2 t12, Continuation<? super R> continuation) {
            return g.i((wn0.p) this.receiver, t11, t12, continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "R", "T1", "T2", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e<R> extends u implements wn0.a<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.p<T1, T2, R> f107417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StateFlow<T1> f107418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ StateFlow<T2> f107419e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(wn0.p<? super T1, ? super T2, ? extends R> pVar, StateFlow<? extends T1> stateFlow, StateFlow<? extends T2> stateFlow2) {
            super(0);
            this.f107417c = pVar;
            this.f107418d = stateFlow;
            this.f107419e = stateFlow2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // wn0.a
        public final R invoke() {
            return this.f107417c.invoke((T1) this.f107418d.getValue(), (T2) this.f107419e.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T1, T2, T3] */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class f<R, T1, T2, T3> extends p implements r<T1, T2, T3, Continuation<? super R>, Object>, SuspendFunction {
        f(Object obj) {
            super(4, obj, kotlin.jvm.internal.s.a.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$2(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T1 t11, T2 t12, T3 t13, Continuation<? super R> continuation) {
            return g.j((q) this.receiver, t11, t12, t13, continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: r90.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0007\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C2286g<R> extends u implements wn0.a<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q<T1, T2, T3, R> f107420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StateFlow<T1> f107421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ StateFlow<T2> f107422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ StateFlow<T3> f107423f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2286g(q<? super T1, ? super T2, ? super T3, ? extends R> qVar, StateFlow<? extends T1> stateFlow, StateFlow<? extends T2> stateFlow2, StateFlow<? extends T3> stateFlow3) {
            super(0);
            this.f107420c = qVar;
            this.f107421d = stateFlow;
            this.f107422e = stateFlow2;
            this.f107423f = stateFlow3;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // wn0.a
        public final R invoke() {
            return this.f107420c.invoke((T1) this.f107421d.getValue(), (T2) this.f107422e.getValue(), (T3) this.f107423f.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T4, R, T1, T2, T3] */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class h<R, T1, T2, T3, T4> extends p implements s<T1, T2, T3, T4, Continuation<? super R>, Object>, SuspendFunction {
        h(Object obj) {
            super(5, obj, kotlin.jvm.internal.s.a.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$3(Lkotlin/jvm/functions/Function4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object d(T1 t11, T2 t12, T3 t13, T4 t14, Continuation<? super R> continuation) {
            return g.k((r) this.receiver, t11, t12, t13, t14, continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i<R> extends u implements wn0.a<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r<T1, T2, T3, T4, R> f107424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StateFlow<T1> f107425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ StateFlow<T2> f107426e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ StateFlow<T3> f107427f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ StateFlow<T4> f107428g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> rVar, StateFlow<? extends T1> stateFlow, StateFlow<? extends T2> stateFlow2, StateFlow<? extends T3> stateFlow3, StateFlow<? extends T4> stateFlow4) {
            super(0);
            this.f107424c = rVar;
            this.f107425d = stateFlow;
            this.f107426e = stateFlow2;
            this.f107427f = stateFlow3;
            this.f107428g = stateFlow4;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // wn0.a
        public final R invoke() {
            return this.f107424c.invoke((T1) this.f107425d.getValue(), (T2) this.f107426e.getValue(), (T3) this.f107427f.getValue(), (T4) this.f107428g.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\t\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j<R> extends u implements wn0.a<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s<T1, T2, T3, T4, T5, R> f107429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StateFlow<T1> f107430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ StateFlow<T2> f107431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ StateFlow<T3> f107432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ StateFlow<T4> f107433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ StateFlow<T5> f107434h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(s<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sVar, StateFlow<? extends T1> stateFlow, StateFlow<? extends T2> stateFlow2, StateFlow<? extends T3> stateFlow3, StateFlow<? extends T4> stateFlow4, StateFlow<? extends T5> stateFlow5) {
            super(0);
            this.f107429c = sVar;
            this.f107430d = stateFlow;
            this.f107431e = stateFlow2;
            this.f107432f = stateFlow3;
            this.f107433g = stateFlow4;
            this.f107434h = stateFlow5;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // wn0.a
        public final R invoke() {
            return this.f107429c.d((T1) this.f107430d.getValue(), (T2) this.f107431e.getValue(), (T3) this.f107432f.getValue(), (T4) this.f107433g.getValue(), (T5) this.f107434h.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "Ljn0/h0;", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.uicore.utils.StateFlowsKt$flatMapLatestAsStateFlow$$inlined$flatMapLatest$1", f = "StateFlows.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
    public static final class k<R, T> extends SuspendLambda implements q<FlowCollector<? super R>, T, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f107435n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f107436o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f107437p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ wn0.l f107438q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Continuation continuation, wn0.l lVar) {
            super(3, continuation);
            this.f107438q = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f107435n;
            if (i11 == 0) {
                t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f107436o;
                Flow flow = (Flow) this.f107438q.invoke(this.f107437p);
                this.f107435n = 1;
                if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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

        @Override // wn0.q
        public final Object invoke(FlowCollector<? super R> flowCollector, T t11, Continuation<? super h0> continuation) {
            k kVar = new k(continuation, this.f107438q);
            kVar.f107436o = flowCollector;
            kVar.f107437p = t11;
            return kVar.invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "R", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class l<R> extends u implements wn0.a<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<T, StateFlow<R>> f107439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StateFlow<T> f107440d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(wn0.l<? super T, ? extends StateFlow<? extends R>> lVar, StateFlow<? extends T> stateFlow) {
            super(0);
            this.f107439c = lVar;
            this.f107440d = stateFlow;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // wn0.a
        public final R invoke() {
            return this.f107439c.invoke((T) this.f107440d.getValue()).getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m<R> implements Flow<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f107441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f107442b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f107443a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ wn0.l f107444b;

            /* JADX INFO: renamed from: r90.g$m$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.uicore.utils.StateFlowsKt$mapAsStateFlow$$inlined$map$1$2", f = "StateFlows.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
            public static final class C2287a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f107445n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f107446o;

                public C2287a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f107445n = obj;
                    this.f107446o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, wn0.l lVar) {
                this.f107443a = flowCollector;
                this.f107444b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C2287a c2287a;
                if (continuation instanceof C2287a) {
                    c2287a = (C2287a) continuation;
                    int i11 = c2287a.f107446o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2287a.f107446o = i11 - Integer.MIN_VALUE;
                    } else {
                        c2287a = new C2287a(continuation);
                    }
                } else {
                    c2287a = new C2287a(continuation);
                }
                Object obj2 = c2287a.f107445n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c2287a.f107446o;
                if (i12 == 0) {
                    t.b(obj2);
                    FlowCollector flowCollector = this.f107443a;
                    Object objInvoke = this.f107444b.invoke(obj);
                    c2287a.f107446o = 1;
                    if (flowCollector.emit(objInvoke, c2287a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj2);
                }
                return h0.f84049a;
            }
        }

        public m(Flow flow, wn0.l lVar) {
            this.f107441a = flow;
            this.f107442b = lVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f107441a.collect(new a(flowCollector, this.f107442b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "R", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class n<R> extends u implements wn0.a<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<T, R> f107448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StateFlow<T> f107449d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(wn0.l<? super T, ? extends R> lVar, StateFlow<? extends T> stateFlow) {
            super(0);
            this.f107448c = lVar;
            this.f107449d = stateFlow;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // wn0.a
        public final R invoke() {
            return this.f107448c.invoke((T) this.f107449d.getValue());
        }
    }

    public static final <T1, T2, T3, T4, T5, T6, R> StateFlow<R> d(StateFlow<? extends T1> flow1, StateFlow<? extends T2> flow2, StateFlow<? extends T3> flow3, StateFlow<? extends T4> flow4, StateFlow<? extends T5> flow5, StateFlow<? extends T6> flow6, wn0.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> transform) {
        p013kotlin.jvm.internal.s.k(flow1, "flow1");
        p013kotlin.jvm.internal.s.k(flow2, "flow2");
        p013kotlin.jvm.internal.s.k(flow3, "flow3");
        p013kotlin.jvm.internal.s.k(flow4, "flow4");
        p013kotlin.jvm.internal.s.k(flow5, "flow5");
        p013kotlin.jvm.internal.s.k(flow6, "flow6");
        p013kotlin.jvm.internal.s.k(transform, "transform");
        return new r90.e(new b((Flow[]) v.m1(v.p(flow1, flow2, flow3, flow4, flow5, flow6)).toArray(new Flow[0]), transform), new c(transform, flow1, flow2, flow3, flow4, flow5, flow6));
    }

    public static final <T1, T2, T3, T4, T5, R> StateFlow<R> e(StateFlow<? extends T1> flow1, StateFlow<? extends T2> flow2, StateFlow<? extends T3> flow3, StateFlow<? extends T4> flow4, StateFlow<? extends T5> flow5, s<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> transform) {
        p013kotlin.jvm.internal.s.k(flow1, "flow1");
        p013kotlin.jvm.internal.s.k(flow2, "flow2");
        p013kotlin.jvm.internal.s.k(flow3, "flow3");
        p013kotlin.jvm.internal.s.k(flow4, "flow4");
        p013kotlin.jvm.internal.s.k(flow5, "flow5");
        p013kotlin.jvm.internal.s.k(transform, "transform");
        return new r90.e(new a((Flow[]) v.m1(v.p(flow1, flow2, flow3, flow4, flow5)).toArray(new Flow[0]), transform), new j(transform, flow1, flow2, flow3, flow4, flow5));
    }

    public static final <T1, T2, T3, T4, R> StateFlow<R> f(StateFlow<? extends T1> flow1, StateFlow<? extends T2> flow2, StateFlow<? extends T3> flow3, StateFlow<? extends T4> flow4, r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> transform) {
        p013kotlin.jvm.internal.s.k(flow1, "flow1");
        p013kotlin.jvm.internal.s.k(flow2, "flow2");
        p013kotlin.jvm.internal.s.k(flow3, "flow3");
        p013kotlin.jvm.internal.s.k(flow4, "flow4");
        p013kotlin.jvm.internal.s.k(transform, "transform");
        return new r90.e(FlowKt.combine(flow1, flow2, flow3, flow4, new h(transform)), new i(transform, flow1, flow2, flow3, flow4));
    }

    public static final <T1, T2, T3, R> StateFlow<R> g(StateFlow<? extends T1> flow1, StateFlow<? extends T2> flow2, StateFlow<? extends T3> flow3, q<? super T1, ? super T2, ? super T3, ? extends R> transform) {
        p013kotlin.jvm.internal.s.k(flow1, "flow1");
        p013kotlin.jvm.internal.s.k(flow2, "flow2");
        p013kotlin.jvm.internal.s.k(flow3, "flow3");
        p013kotlin.jvm.internal.s.k(transform, "transform");
        return new r90.e(FlowKt.combine(flow1, flow2, flow3, new f(transform)), new C2286g(transform, flow1, flow2, flow3));
    }

    public static final <T1, T2, R> StateFlow<R> h(StateFlow<? extends T1> flow1, StateFlow<? extends T2> flow2, wn0.p<? super T1, ? super T2, ? extends R> transform) {
        p013kotlin.jvm.internal.s.k(flow1, "flow1");
        p013kotlin.jvm.internal.s.k(flow2, "flow2");
        p013kotlin.jvm.internal.s.k(transform, "transform");
        return new r90.e(FlowKt.combine(flow1, flow2, new d(transform)), new e(transform, flow1, flow2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object i(wn0.p pVar, Object obj, Object obj2, Continuation continuation) {
        return pVar.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object j(q qVar, Object obj, Object obj2, Object obj3, Continuation continuation) {
        return qVar.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object k(r rVar, Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation) {
        return rVar.invoke(obj, obj2, obj3, obj4);
    }

    public static final <T, R> StateFlow<R> l(StateFlow<? extends T> stateFlow, wn0.l<? super T, ? extends StateFlow<? extends R>> transform) {
        p013kotlin.jvm.internal.s.k(stateFlow, "<this>");
        p013kotlin.jvm.internal.s.k(transform, "transform");
        return new r90.e(FlowKt.transformLatest(stateFlow, new k(null, transform)), new l(transform, stateFlow));
    }

    public static final <T, R> StateFlow<R> m(StateFlow<? extends T> stateFlow, wn0.l<? super T, ? extends R> transform) {
        p013kotlin.jvm.internal.s.k(stateFlow, "<this>");
        p013kotlin.jvm.internal.s.k(transform, "transform");
        return new r90.e(new m(stateFlow, transform), new n(transform, stateFlow));
    }

    public static final <T> StateFlow<T> n(T t11) {
        return FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(t11));
    }
}
