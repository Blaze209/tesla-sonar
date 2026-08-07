package yy;

import bo0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\r\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Lio0/b;", "interval", "c", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "", "", "fft", "", "averages", "", "barCount", "b", "(Ljava/util/List;[FI)[F", "livekit_react-native_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.livekit.reactnative.audio.processing.MultibandVolumeProcessorKt$throttleLatest-HG0u8IE$$inlined$transform$1", f = "MultibandVolumeProcessor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class a<T> extends SuspendLambda implements p<FlowCollector<? super T>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126012n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f126013o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Flow f126014p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f126015q;

        /* JADX INFO: renamed from: yy.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        public static final class C2739a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector<T> f126016a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f126017b;

            /* JADX INFO: renamed from: yy.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.livekit.reactnative.audio.processing.MultibandVolumeProcessorKt$throttleLatest-HG0u8IE$$inlined$transform$1$1", f = "MultibandVolumeProcessor.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 224}, m = "emit", n = {"this"}, s = {"L$0"})
            public static final class C2740a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f126018n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f126019o;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                Object f126021q;

                public C2740a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f126018n = obj;
                    this.f126019o |= Integer.MIN_VALUE;
                    return C2739a.this.emit(null, this);
                }
            }

            public C2739a(FlowCollector flowCollector, long j11) {
                this.f126017b = j11;
                this.f126016a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
            
                if (kotlinx.coroutines.DelayKt.m506delayVtjQ1oo(r6, r0) == r1) goto L22;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, p013kotlin.coroutines.Continuation<? super jn0.h0> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof yy.k.a.C2739a.C2740a
                    if (r0 == 0) goto L13
                    r0 = r7
                    yy.k$a$a$a r0 = (yy.k.a.C2739a.C2740a) r0
                    int r1 = r0.f126019o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f126019o = r1
                    goto L18
                L13:
                    yy.k$a$a$a r0 = new yy.k$a$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f126018n
                    java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f126019o
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    jn0.t.b(r7)
                    goto L5b
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f126021q
                    yy.k$a$a r6 = (yy.k.a.C2739a) r6
                    jn0.t.b(r7)
                    goto L4d
                L3c:
                    jn0.t.b(r7)
                    kotlinx.coroutines.flow.FlowCollector<T> r7 = r5.f126016a
                    r0.f126021q = r5
                    r0.f126019o = r4
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4c
                    goto L5a
                L4c:
                    r6 = r5
                L4d:
                    long r6 = r6.f126017b
                    r2 = 0
                    r0.f126021q = r2
                    r0.f126019o = r3
                    java.lang.Object r6 = kotlinx.coroutines.DelayKt.m506delayVtjQ1oo(r6, r0)
                    if (r6 != r1) goto L5b
                L5a:
                    return r1
                L5b:
                    jn0.h0 r6 = jn0.h0.f84049a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: yy.k.a.C2739a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, Continuation continuation, long j11) {
            super(2, continuation);
            this.f126014p = flow;
            this.f126015q = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f126014p, continuation, this.f126015q);
            aVar.f126013o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f126012n;
            if (i11 == 0) {
                t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f126013o;
                Flow flow = this.f126014p;
                C2739a c2739a = new C2739a(flowCollector, this.f126015q);
                this.f126012n = 1;
                if (flow.collect(c2739a, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super h0> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] b(List<Float> list, float[] fArr, int i11) {
        int i12;
        float fSqrt;
        List<Float> list2 = list;
        int i13 = i11;
        float[] fArr2 = new float[i13];
        if (!list2.isEmpty()) {
            int i14 = 0;
            int i15 = 0;
            while (i15 < i13) {
                float f11 = 2;
                float f12 = i13;
                int iN = n.n(((int) Math.rint(((list2.size() / f11) * i15) / f12)) * 2, i14, list2.size() - 1);
                float size = list2.size() / f11;
                int i16 = i15 + 1;
                int iN2 = n.n(((int) Math.rint((size * i16) / f12)) * 2, i14, list2.size() - 1);
                bo0.h hVarU = n.u(n.w(iN, iN2), 2);
                int first = hVarU.getFirst();
                int last = hVarU.getLast();
                int step = hVarU.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    fSqrt = BitmapDescriptorFactory.HUE_RED;
                    while (true) {
                        i12 = i15;
                        fSqrt += (float) Math.sqrt(Math.pow(list2.get(first).floatValue(), 2.0d) + Math.pow(list2.get(first + 1).floatValue(), 2.0d));
                        if (first == last) {
                            break;
                        }
                        first += step;
                        list2 = list;
                        i15 = i12;
                    }
                } else {
                    i12 = i15;
                    fSqrt = BitmapDescriptorFactory.HUE_RED;
                }
                int i17 = iN2 - iN;
                float f13 = i17 != 0 ? fSqrt / i17 : BitmapDescriptorFactory.HUE_RED;
                float f14 = fArr[i12];
                float f15 = f14 + (f13 - (f14 / 5));
                fArr[i12] = f15;
                fArr2[i12] = (n.m(f15, 2.0f, 25.0f) - 2.0f) / 23.0f;
                i14 = 0;
                list2 = list;
                i13 = i11;
                i15 = i16;
            }
        }
        return fArr2;
    }

    public static final <T> Flow<T> c(Flow<? extends T> throttleLatest, long j11) {
        s.k(throttleLatest, "$this$throttleLatest");
        return FlowKt.flow(new a(FlowKt.conflate(throttleLatest), null, j11));
    }
}
