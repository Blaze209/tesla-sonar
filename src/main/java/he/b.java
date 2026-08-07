package he;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusRequest;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.plaid.internal.EnumC4419g;
import io0.j;
import io0.k;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001\u001cB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u0004H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00182\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lhe/b;", "Lhe/c;", "Lhe/d;", "statusService", "", "clientKey", "Lio0/k;", "timeSource", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "<init>", "(Lhe/d;Ljava/lang/String;Lio0/k;Lkotlinx/coroutines/CoroutineDispatcher;)V", "paymentData", "Ljn0/s;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "h", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio0/j;", "startTime", "", "maxPollingDuration", "", IntegerTokenConverter.CONVERTER_KEY, "(Lio0/j;J)Z", "Lkotlinx/coroutines/flow/Flow;", "b", "(Ljava/lang/String;J)Lkotlinx/coroutines/flow/Flow;", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "Lhe/d;", "Ljava/lang/String;", "c", "Lio0/k;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CoroutineDispatcher;", "e", "J", "delay", "Lkotlinx/coroutines/channels/Channel;", "f", "Lkotlinx/coroutines/channels/Channel;", "refreshFlow", "g", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements he.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f72577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f72578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f72579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f72580k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final he.d statusService;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String clientKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k timeSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher coroutineDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long delay;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Channel<String> refreshFlow;

    /* JADX INFO: renamed from: he.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository", f = "StatusRepository.kt", i = {}, l = {100}, m = "fetchStatus-gIAlu-s", n = {}, s = {})
    static final class C1526b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f72587n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f72589p;

        C1526b(Continuation<? super C1526b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72587n = obj;
            this.f72589p |= Integer.MIN_VALUE;
            Object objH = b.this.h(null, this);
            return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : s.a(objH);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$fetchStatus$2", f = "StatusRepository.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends StatusResponse>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72590n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f72591o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f72593q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f72593q = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = b.this.new c(this.f72593q, continuation);
            cVar.f72591o = obj;
            return cVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends StatusResponse>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<StatusResponse>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f72590n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    b bVar = b.this;
                    String str = this.f72593q;
                    s.Companion companion = s.INSTANCE;
                    he.d dVar = bVar.statusService;
                    String str2 = bVar.clientKey;
                    StatusRequest statusRequest = new StatusRequest(str);
                    this.f72590n = 1;
                    obj = dVar.a(str2, statusRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                objB = s.b((StatusResponse) obj);
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
            return s.a(objB);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<StatusResponse>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements Flow<s<? extends StatusResponse>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f72594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f72595b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f72596a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f72597b;

            /* JADX INFO: renamed from: he.b$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$map$1$2", f = "StatusRepository.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
            public static final class C1527a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f72598n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f72599o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                Object f72600p;

                public C1527a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f72598n = obj;
                    this.f72599o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, b bVar) {
                this.f72596a = flowCollector;
                this.f72597b = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
            
                if (r7.emit(r8, r0) == r1) goto L22;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, p013kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof he.b.d.a.C1527a
                    if (r0 == 0) goto L13
                    r0 = r8
                    he.b$d$a$a r0 = (he.b.d.a.C1527a) r0
                    int r1 = r0.f72599o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f72599o = r1
                    goto L18
                L13:
                    he.b$d$a$a r0 = new he.b$d$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f72598n
                    java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f72599o
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L42
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    jn0.t.b(r8)
                    goto L69
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f72600p
                    kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                    jn0.t.b(r8)
                    jn0.s r8 = (jn0.s) r8
                    java.lang.Object r8 = r8.getValue()
                    goto L59
                L42:
                    jn0.t.b(r8)
                    kotlinx.coroutines.flow.FlowCollector r8 = r6.f72596a
                    java.lang.String r7 = (java.lang.String) r7
                    he.b r2 = r6.f72597b
                    r0.f72600p = r8
                    r0.f72599o = r4
                    java.lang.Object r7 = he.b.c(r2, r7, r0)
                    if (r7 != r1) goto L56
                    goto L68
                L56:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L59:
                    jn0.s r8 = jn0.s.a(r8)
                    r2 = 0
                    r0.f72600p = r2
                    r0.f72599o = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L69
                L68:
                    return r1
                L69:
                    jn0.h0 r7 = jn0.h0.f84049a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: he.b.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(Flow flow, b bVar) {
            this.f72594a = flow;
            this.f72595b = bVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super s<? extends StatusResponse>> flowCollector, Continuation continuation) {
            Object objCollect = this.f72594a.collect(new a(flowCollector, this.f72595b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$transform$1", f = "StatusRepository.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<FlowCollector<? super s<? extends StatusResponse>>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72602n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f72603o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Flow f72604p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ b f72605q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ j f72606r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ long f72607s;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector<s<? extends StatusResponse>> f72608a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f72609b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f72610c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f72611d;

            /* JADX INFO: renamed from: he.b$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$$inlined$transform$1$1", f = "StatusRepository.kt", i = {0, 0, 0}, l = {EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m = "emit", n = {"this", "result", "$this$poll_u24lambda_u242"}, s = {"L$0", "L$1", "L$2"})
            public static final class C1528a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f72612n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f72613o;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                Object f72615q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f72616r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f72617s;

                public C1528a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f72612n = obj;
                    this.f72613o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, b bVar, j jVar, long j11) {
                this.f72609b = bVar;
                this.f72610c = jVar;
                this.f72611d = j11;
                this.f72608a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
            
                if (r10.emit(r11, r0) == r1) goto L36;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r10, p013kotlin.coroutines.Continuation<? super jn0.h0> r11) {
                /*
                    Method dump skipped, instruction units count: 259
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: he.b.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Flow flow, Continuation continuation, b bVar, j jVar, long j11) {
            super(2, continuation);
            this.f72604p = flow;
            this.f72605q = bVar;
            this.f72606r = jVar;
            this.f72607s = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f72604p, continuation, this.f72605q, this.f72606r, this.f72607s);
            eVar.f72603o = obj;
            return eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f72602n;
            if (i11 == 0) {
                t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f72603o;
                Flow flow = this.f72604p;
                a aVar = new a(flowCollector, this.f72605q, this.f72606r, this.f72607s);
                this.f72602n = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super s<? extends StatusResponse>> flowCollector, Continuation<? super h0> continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljn0/s;", "Lcom/adyen/checkout/components/core/internal/data/model/StatusResponse;", "it", "Ljn0/h0;", "<anonymous>", "(Ljn0/s;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$3", f = "StatusRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<s<? extends StatusResponse>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72618n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f72619o;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = b.this.new f(continuation);
            fVar.f72619o = obj;
            return fVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(s<? extends StatusResponse> sVar, Continuation<? super h0> continuation) {
            return invoke(sVar.getValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72618n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Object value = ((s) this.f72619o).getValue();
            b bVar = b.this;
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = bVar.getClass().getName();
                p013kotlin.jvm.internal.s.h(name);
                String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = p013kotlin.text.t.W0(strU1, "Kt");
                }
                String str = "CO." + name;
                me.b bVarA = companion.a();
                if (s.g(value)) {
                    value = null;
                }
                StatusResponse statusResponse = (StatusResponse) value;
                bVarA.b(aVar, str, "Emitting status: " + (statusResponse != null ? statusResponse.getResultCode() : null), null);
            }
            return h0.f84049a;
        }

        public final Object invoke(Object obj, Continuation<? super h0> continuation) {
            return ((f) create(s.a(obj), continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.data.api.DefaultStatusRepository$poll$pollingFlow$1", f = "StatusRepository.kt", i = {0, 1}, l = {69, 70}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    static final class g extends SuspendLambda implements p<FlowCollector<? super String>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72621n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f72622o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f72623p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ b f72624q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, b bVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f72623p = str;
            this.f72624q = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f72623p, this.f72624q, continuation);
            gVar.f72622o = obj;
            return gVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0038  */
        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        /* JADX WARN: Code duplicated, block: B:21:0x0057  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(r4, r6) == r0) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:7:0x0015). Please report as a decompilation issue!!! */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f72621n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r6.f72622o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r7)
            L15:
                r7 = r1
                goto L2e
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                java.lang.Object r1 = r6.f72622o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r7)
                goto L46
            L27:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f72622o
                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            L2e:
                kotlin.coroutines.CoroutineContext r1 = r6.getContext()
                boolean r1 = kotlinx.coroutines.JobKt.isActive(r1)
                if (r1 == 0) goto L57
                java.lang.String r1 = r6.f72623p
                r6.f72622o = r7
                r6.f72621n = r3
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L45
                goto L56
            L45:
                r1 = r7
            L46:
                he.b r7 = r6.f72624q
                long r4 = he.b.e(r7)
                r6.f72622o = r1
                r6.f72621n = r2
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
                if (r7 != r0) goto L15
            L56:
                return r0
            L57:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: he.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super String> flowCollector, Continuation<? super h0> continuation) {
            return ((g) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    static {
        io0.b.Companion companion = io0.b.INSTANCE;
        io0.e eVar = io0.e.SECONDS;
        f72577h = io0.b.p(io0.d.s(2, eVar));
        f72578i = io0.b.p(io0.d.s(10, eVar));
        f72579j = io0.b.p(io0.d.s(60, eVar));
        f72580k = io0.b.p(io0.d.s(100, io0.e.MILLISECONDS));
    }

    public b(he.d statusService, String clientKey, k timeSource, CoroutineDispatcher coroutineDispatcher) {
        p013kotlin.jvm.internal.s.k(statusService, "statusService");
        p013kotlin.jvm.internal.s.k(clientKey, "clientKey");
        p013kotlin.jvm.internal.s.k(timeSource, "timeSource");
        p013kotlin.jvm.internal.s.k(coroutineDispatcher, "coroutineDispatcher");
        this.statusService = statusService;
        this.clientKey = clientKey;
        this.timeSource = timeSource;
        this.coroutineDispatcher = coroutineDispatcher;
        this.refreshFlow = le.b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, Continuation<? super s<StatusResponse>> continuation) {
        C1526b c1526b;
        if (continuation instanceof C1526b) {
            c1526b = (C1526b) continuation;
            int i11 = c1526b.f72589p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1526b.f72589p = i11 - Integer.MIN_VALUE;
            } else {
                c1526b = new C1526b(continuation);
            }
        } else {
            c1526b = new C1526b(continuation);
        }
        Object objWithContext = c1526b.f72587n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1526b.f72589p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.coroutineDispatcher;
            c cVar = new c(str, null);
            c1526b.f72589p = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, cVar, c1526b);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(j startTime, long maxPollingDuration) {
        long jP = io0.b.p(startTime.a());
        if (jP <= f72579j) {
            this.delay = f72577h;
            return true;
        }
        if (jP > maxPollingDuration) {
            return false;
        }
        this.delay = f72578i;
        return true;
    }

    @Override // he.c
    public void a(String paymentData) {
        p013kotlin.jvm.internal.s.k(paymentData, "paymentData");
        me.a aVar = me.a.VERBOSE;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = b.class.getName();
            p013kotlin.jvm.internal.s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "refreshStatus", null);
        }
        this.refreshFlow.mo85trySendJP2dKIU(paymentData);
    }

    @Override // he.c
    public Flow<s<StatusResponse>> b(String paymentData, long maxPollingDuration) {
        p013kotlin.jvm.internal.s.k(paymentData, "paymentData");
        j jVarA = this.timeSource.a();
        i(jVarA, maxPollingDuration);
        return FlowKt.onEach(FlowKt.flow(new e(new d(FlowKt.debounce(FlowKt.merge(FlowKt.flow(new g(paymentData, this, null)), FlowKt.receiveAsFlow(this.refreshFlow)), f72580k), this), null, this, jVarA, maxPollingDuration)), new f(null));
    }

    public /* synthetic */ b(he.d dVar, String str, k kVar, CoroutineDispatcher coroutineDispatcher, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, str, (i11 & 4) != 0 ? k.a.f81656a : kVar, (i11 & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
