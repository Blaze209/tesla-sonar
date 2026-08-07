package y5;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ezvcard.property.Kind;
import java.util.ArrayList;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w5.k;
import w5.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Ly5/a;", "Lv5/h;", "Lw5/d;", "uwbClient", "Lv5/a;", "rangingCapabilities", "Lv5/f;", "localAddress", "<init>", "(Lw5/d;Lv5/a;Lv5/f;)V", "Lv5/c;", "parameters", "Lkotlinx/coroutines/flow/Flow;", "Lv5/e;", "a", "(Lv5/c;)Lkotlinx/coroutines/flow/Flow;", "Lw5/d;", "b", "Lv5/a;", "getRangingCapabilities", "()Lv5/a;", "c", "Lv5/f;", "getLocalAddress", "()Lv5/f;", "", DateTokenConverter.CONVERTER_KEY, "Z", "sessionStarted", "e", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a implements v5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w5.d uwbClient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v5.a rangingCapabilities;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v5.f localAddress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean sessionStarted;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lv5/e;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.core.uwb.impl.UwbClientSessionScopeAospImpl$prepareSession$1", f = "UwbClientSessionScopeAospImpl.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<ProducerScope<? super v5.e>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124955n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f124956o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ v5.c f124958q;

        /* JADX INFO: renamed from: y5.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class C2704a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f124959c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ BinderC2706b f124960d;

            /* JADX INFO: renamed from: y5.a$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.core.uwb.impl.UwbClientSessionScopeAospImpl$prepareSession$1$1$1", f = "UwbClientSessionScopeAospImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C2705a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f124961n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ a f124962o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ BinderC2706b f124963p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2705a(a aVar, BinderC2706b binderC2706b, Continuation<? super C2705a> continuation) {
                    super(2, continuation);
                    this.f124962o = aVar;
                    this.f124963p = binderC2706b;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C2705a(this.f124962o, this.f124963p, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f124961n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    this.f124962o.uwbClient.A1(this.f124963p);
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C2705a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2704a(a aVar, BinderC2706b binderC2706b) {
                super(0);
                this.f124959c = aVar;
                this.f124960d = binderC2706b;
            }

            public final void b() {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate()), null, null, new C2705a(this.f124959c, this.f124960d, null), 3, null);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: y5.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"y5/a$b$b", "Lw5/a$a;", "Lw5/k;", Kind.DEVICE, "Ljn0/h0;", "N0", "(Lw5/k;)V", "Lw5/h;", "position", "n1", "(Lw5/k;Lw5/h;)V", "", AnalyticsAttribute.Reason, "Z1", "(Lw5/k;I)V", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BinderC2706b extends w5.a.AbstractBinderC2578a {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ ProducerScope<v5.e> f124964n;

            /* JADX WARN: Multi-variable type inference failed */
            BinderC2706b(ProducerScope<? super v5.e> producerScope) {
                this.f124964n = producerScope;
            }

            @Override // w5.a
            public void N0(k device) {
                s.k(device, "device");
                ProducerScope<v5.e> producerScope = this.f124964n;
                w5.i iVar = device.f120842a;
                byte[] bArr = iVar != null ? iVar.f120839a : null;
                s.h(bArr);
                producerScope.mo85trySendJP2dKIU(new v5.e.a(new v5.k(new v5.f(bArr))));
            }

            @Override // w5.a
            public void Z1(k device, int reason) {
                s.k(device, "device");
                ProducerScope<v5.e> producerScope = this.f124964n;
                w5.i iVar = device.f120842a;
                byte[] bArr = iVar != null ? iVar.f120839a : null;
                s.h(bArr);
                producerScope.mo85trySendJP2dKIU(new v5.e.b(new v5.k(new v5.f(bArr))));
            }

            @Override // w5.a
            public void n1(k device, w5.h position) {
                s.k(device, "device");
                s.k(position, "position");
                ProducerScope<v5.e> producerScope = this.f124964n;
                w5.i iVar = device.f120842a;
                byte[] bArr = iVar != null ? iVar.f120839a : null;
                s.h(bArr);
                v5.k kVar = new v5.k(new v5.f(bArr));
                w5.f fVar = position.f120835a;
                v5.b bVar = fVar != null ? new v5.b(fVar.f120823b) : null;
                w5.f fVar2 = position.f120836b;
                v5.b bVar2 = fVar2 != null ? new v5.b(fVar2.f120823b) : null;
                w5.f fVar3 = position.f120837c;
                producerScope.mo85trySendJP2dKIU(new v5.e.c(kVar, new v5.d(bVar, bVar2, fVar3 != null ? new v5.b(fVar3.f120823b) : null, position.f120838d)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v5.c cVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f124958q = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = a.this.new b(this.f124958q, continuation);
            bVar.f124956o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f124955n;
            if (i12 == 0) {
                t.b(obj);
                ProducerScope producerScope = (ProducerScope) this.f124956o;
                if (a.this.sessionStarted) {
                    throw new IllegalStateException("Ranging has already started. To initiate a new ranging session, create a new client session scope.");
                }
                w5.g gVar = new w5.g();
                int i13 = 3;
                int i14 = 2;
                switch (this.f124958q.getUwbConfigType()) {
                    case 1:
                        i11 = 1;
                        break;
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 5;
                        break;
                    case 6:
                        i11 = 6;
                        break;
                    case 7:
                        i11 = 7;
                        break;
                    default:
                        throw new IllegalArgumentException("The selected UWB Config Id is not a valid id.");
                }
                gVar.f120824a = i11;
                int updateRateType = this.f124958q.getUpdateRateType();
                if (updateRateType == 1) {
                    i13 = 1;
                } else if (updateRateType == 2) {
                    i13 = 2;
                } else if (updateRateType != 3) {
                    throw new IllegalArgumentException("The selected ranging update rate is not a valid update rate.");
                }
                gVar.f120831h = i13;
                gVar.f120825b = this.f124958q.getSessionId();
                gVar.f120827d = this.f124958q.getSessionKeyInfo();
                if (this.f124958q.getUwbConfigType() == 7) {
                    gVar.f120826c = this.f124958q.getSubSessionId();
                    gVar.f120828e = this.f124958q.getSubSessionKeyInfo();
                }
                if (this.f124958q.getComplexChannel() != null) {
                    w5.j jVar = new w5.j();
                    jVar.f120840a = this.f124958q.getComplexChannel().getChannel();
                    jVar.f120841b = this.f124958q.getComplexChannel().getPreambleIndex();
                    gVar.f120829f = jVar;
                }
                ArrayList arrayList = new ArrayList();
                for (v5.k kVar : this.f124958q.b()) {
                    k kVar2 = new k();
                    w5.i iVar = new w5.i();
                    iVar.f120839a = kVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String();
                    kVar2.f120842a = iVar;
                    arrayList.add(kVar2);
                }
                gVar.f120830g = arrayList;
                gVar.f120834k = this.f124958q.getIsAoaDisabled();
                if (this.f124958q.getSlotDurationMillis() != 0) {
                    long slotDurationMillis = this.f124958q.getSlotDurationMillis();
                    if (slotDurationMillis == 1) {
                        i14 = 1;
                    } else if (slotDurationMillis != 2) {
                        throw new IllegalArgumentException("The selected slot duration is not a valid slot duration.");
                    }
                    gVar.f120833j = i14;
                }
                if (this.f124958q.getUwbRangeDataNtfConfig() != null) {
                    l lVar = new l();
                    lVar.f120843a = this.f124958q.getUwbRangeDataNtfConfig().getConfigType();
                    lVar.f120845c = this.f124958q.getUwbRangeDataNtfConfig().getNtfProximityFarCm();
                    lVar.f120844b = this.f124958q.getUwbRangeDataNtfConfig().getNtfProximityNearCm();
                    gVar.f120832i = lVar;
                }
                BinderC2706b binderC2706b = new BinderC2706b(producerScope);
                a.this.uwbClient.k2(gVar, binderC2706b);
                a.this.sessionStarted = true;
                C2704a c2704a = new C2704a(a.this, binderC2706b);
                this.f124955n = 1;
                if (ProduceKt.awaitClose(producerScope, c2704a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(ProducerScope<? super v5.e> producerScope, Continuation<? super h0> continuation) {
            return ((b) create(producerScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(w5.d uwbClient, v5.a rangingCapabilities, v5.f localAddress) {
        s.k(uwbClient, "uwbClient");
        s.k(rangingCapabilities, "rangingCapabilities");
        s.k(localAddress, "localAddress");
        this.uwbClient = uwbClient;
        this.rangingCapabilities = rangingCapabilities;
        this.localAddress = localAddress;
    }

    @Override // v5.h
    public Flow<v5.e> a(v5.c parameters) {
        s.k(parameters, "parameters");
        return FlowKt.callbackFlow(new b(parameters, null));
    }
}
