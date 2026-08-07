package i80;

import com.fourthline.analytics.internal.AnalyticsContext;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.CombineKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.q;
import wn0.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aÕ\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00060\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u0005\"\u0004\b\u0006\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00030\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00040\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00050\u00072@\u0010\u0011\u001a<\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00060\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T1", "T2", "T3", "T4", "T5", "T6", "R", "Lkotlinx/coroutines/flow/Flow;", AnalyticsContext.Flow, "flow2", "flow3", "flow4", "flow5", "flow6", "Lkotlin/Function7;", "Lkotlin/coroutines/Continuation;", "", "transform", "a", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lwn0/u;)Lkotlinx/coroutines/flow/Flow;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$$inlined$unsafeFlow$2", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<R> implements Flow<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f76216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f76217b;

        /* JADX INFO: renamed from: i80.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$1"}, k = 3, mv = {1, 9, 0})
        static final class C1599a extends p013kotlin.jvm.internal.u implements wn0.a<Object[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Flow[] f76218c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1599a(Flow[] flowArr) {
                super(0);
                this.f76218c = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Object[this.f76218c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.utils.FlowUtilsKt$combine$$inlined$combine$1$3", f = "FlowUtils.kt", i = {}, l = {333, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements q<FlowCollector<? super R>, Object[], Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f76219n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f76220o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f76221p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ u f76222q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Continuation continuation, u uVar) {
                super(3, continuation);
                this.f76222q = uVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
            
                if (r1.emit(r13, r12) == r0) goto L15;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r12.f76219n
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L24
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    jn0.t.b(r13)
                    r11 = r12
                    goto L62
                L13:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1b:
                    java.lang.Object r1 = r12.f76220o
                    kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                    jn0.t.b(r13)
                    r11 = r12
                    goto L56
                L24:
                    jn0.t.b(r13)
                    java.lang.Object r13 = r12.f76220o
                    r1 = r13
                    kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                    java.lang.Object r13 = r12.f76221p
                    java.lang.Object[] r13 = (java.lang.Object[]) r13
                    wn0.u r4 = r12.f76222q
                    r5 = 0
                    r5 = r13[r5]
                    r6 = r13[r3]
                    r7 = r13[r2]
                    r8 = 3
                    r8 = r13[r8]
                    r9 = 4
                    r9 = r13[r9]
                    r10 = 5
                    r10 = r13[r10]
                    r12.f76220o = r1
                    r12.f76219n = r3
                    r13 = 6
                    p013kotlin.jvm.internal.q.c(r13)
                    r11 = r12
                    java.lang.Object r13 = r4.k(r5, r6, r7, r8, r9, r10, r11)
                    r3 = 7
                    p013kotlin.jvm.internal.q.c(r3)
                    if (r13 != r0) goto L56
                    goto L61
                L56:
                    r3 = 0
                    r11.f76220o = r3
                    r11.f76219n = r2
                    java.lang.Object r13 = r1.emit(r13, r12)
                    if (r13 != r0) goto L62
                L61:
                    return r0
                L62:
                    jn0.h0 r13 = jn0.h0.f84049a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: i80.c.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.q
            public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, Continuation<? super h0> continuation) {
                b bVar = new b(continuation, this.f76222q);
                bVar.f76220o = flowCollector;
                bVar.f76221p = objArr;
                return bVar.invokeSuspend(h0.f84049a);
            }
        }

        public a(Flow[] flowArr, u uVar) {
            this.f76216a = flowArr;
            this.f76217b = uVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f76216a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C1599a(flowArr), new b(null, this.f76217b), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
        }
    }

    public static final <T1, T2, T3, T4, T5, T6, R> Flow<R> a(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, Flow<? extends T6> flow6, u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super Continuation<? super R>, ? extends Object> transform) {
        s.k(flow, "flow");
        s.k(flow2, "flow2");
        s.k(flow3, "flow3");
        s.k(flow4, "flow4");
        s.k(flow5, "flow5");
        s.k(flow6, "flow6");
        s.k(transform, "transform");
        return new a(new Flow[]{flow, flow2, flow3, flow4, flow5, flow6}, transform);
    }
}
