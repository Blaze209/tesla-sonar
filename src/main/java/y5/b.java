package y5;

import androidx.core.uwb.exceptions.UwbServiceNotAvailableException;
import androidx.core.uwb.exceptions.UwbSystemCallbackException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.nearby.uwb.RangingMeasurement;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbClient;
import com.google.android.gms.nearby.uwb.UwbDevice;
import com.google.android.gms.tasks.Task;
import ezvcard.property.Kind;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.tasks.TasksKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import v5.k;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Ly5/b;", "Lv5/h;", "Lcom/google/android/gms/nearby/uwb/UwbClient;", "uwbClient", "Lv5/a;", "rangingCapabilities", "Lv5/f;", "localAddress", "<init>", "(Lcom/google/android/gms/nearby/uwb/UwbClient;Lv5/a;Lv5/f;)V", "Lv5/c;", "parameters", "Lkotlinx/coroutines/flow/Flow;", "Lv5/e;", "a", "(Lv5/c;)Lkotlinx/coroutines/flow/Flow;", "Lcom/google/android/gms/nearby/uwb/UwbClient;", "b", "Lv5/a;", "getRangingCapabilities", "()Lv5/a;", "c", "Lv5/f;", "getLocalAddress", "()Lv5/f;", "", DateTokenConverter.CONVERTER_KEY, "Z", "sessionStarted", "e", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class b implements v5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final UwbClient uwbClient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v5.a rangingCapabilities;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v5.f localAddress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean sessionStarted;

    /* JADX INFO: renamed from: y5.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lv5/e;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.core.uwb.impl.UwbClientSessionScopeImpl$prepareSession$1", f = "UwbClientSessionScopeImpl.kt", i = {0, 0}, l = {173, 179}, m = "invokeSuspend", n = {"$this$callbackFlow", "callback"}, s = {"L$0", "L$1"})
    static final class C2707b extends SuspendLambda implements p<ProducerScope<? super v5.e>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f124970n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f124971o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f124972p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ v5.c f124974r;

        /* JADX INFO: renamed from: y5.b$b$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f124975c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ C2709b f124976d;

            /* JADX INFO: renamed from: y5.b$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.core.uwb.impl.UwbClientSessionScopeImpl$prepareSession$1$1$1", f = "UwbClientSessionScopeImpl.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
            static final class C2708a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f124977n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ b f124978o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ C2709b f124979p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2708a(b bVar, C2709b c2709b, Continuation<? super C2708a> continuation) {
                    super(2, continuation);
                    this.f124978o = bVar;
                    this.f124979p = c2709b;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C2708a(this.f124978o, this.f124979p, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws UwbSystemCallbackException, UwbServiceNotAvailableException {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f124977n;
                    try {
                        if (i11 == 0) {
                            t.b(obj);
                            Task<Void> taskStopRanging = this.f124978o.uwbClient.stopRanging(this.f124979p);
                            s.j(taskStopRanging, "uwbClient.stopRanging(callback)");
                            this.f124977n = 1;
                            if (TasksKt.await(taskStopRanging, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t.b(obj);
                        }
                    } catch (ApiException e11) {
                        x5.a.b(e11);
                    }
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C2708a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, C2709b c2709b) {
                super(0);
                this.f124975c = bVar;
                this.f124976d = c2709b;
            }

            public final void b() {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate()), null, null, new C2708a(this.f124975c, this.f124976d, null), 3, null);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: y5.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"y5/b$b$b", "Lcom/google/android/gms/nearby/uwb/RangingSessionCallback;", "Lcom/google/android/gms/nearby/uwb/UwbDevice;", Kind.DEVICE, "Ljn0/h0;", "onRangingInitialized", "(Lcom/google/android/gms/nearby/uwb/UwbDevice;)V", "Lcom/google/android/gms/nearby/uwb/RangingPosition;", "position", "onRangingResult", "(Lcom/google/android/gms/nearby/uwb/UwbDevice;Lcom/google/android/gms/nearby/uwb/RangingPosition;)V", "", AnalyticsAttribute.Reason, "onRangingSuspended", "(Lcom/google/android/gms/nearby/uwb/UwbDevice;I)V", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C2709b implements RangingSessionCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProducerScope<v5.e> f124980a;

            /* JADX WARN: Multi-variable type inference failed */
            C2709b(ProducerScope<? super v5.e> producerScope) {
                this.f124980a = producerScope;
            }

            @Override // com.google.android.gms.nearby.uwb.RangingSessionCallback
            public void onRangingInitialized(UwbDevice device) {
                s.k(device, "device");
                ProducerScope<v5.e> producerScope = this.f124980a;
                byte[] address = device.getAddress().getAddress();
                s.j(address, "device.address.address");
                producerScope.mo85trySendJP2dKIU(new v5.e.a(new k(new v5.f(address))));
            }

            @Override // com.google.android.gms.nearby.uwb.RangingSessionCallback
            public void onRangingResult(UwbDevice device, RangingPosition position) {
                s.k(device, "device");
                s.k(position, "position");
                ProducerScope<v5.e> producerScope = this.f124980a;
                byte[] address = device.getAddress().getAddress();
                s.j(address, "device.address.address");
                k kVar = new k(new v5.f(address));
                v5.b bVar = new v5.b(position.getDistance().getValue());
                RangingMeasurement azimuth = position.getAzimuth();
                v5.b bVar2 = azimuth != null ? new v5.b(azimuth.getValue()) : null;
                RangingMeasurement elevation = position.getElevation();
                producerScope.mo85trySendJP2dKIU(new v5.e.c(kVar, new v5.d(bVar, bVar2, elevation != null ? new v5.b(elevation.getValue()) : null, position.getElapsedRealtimeNanos())));
            }

            @Override // com.google.android.gms.nearby.uwb.RangingSessionCallback
            public void onRangingSuspended(UwbDevice device, int reason) {
                s.k(device, "device");
                ProducerScope<v5.e> producerScope = this.f124980a;
                byte[] address = device.getAddress().getAddress();
                s.j(address, "device.address.address");
                producerScope.mo85trySendJP2dKIU(new v5.e.b(new k(new v5.f(address))));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2707b(v5.c cVar, Continuation<? super C2707b> continuation) {
            super(2, continuation);
            this.f124974r = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C2707b c2707b = b.this.new C2707b(this.f124974r, continuation);
            c2707b.f124972p = obj;
            return c2707b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:66:0x019e, code lost:
        
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(r5, r12, r11) == r0) goto L67;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws androidx.core.uwb.exceptions.UwbSystemCallbackException, androidx.core.uwb.exceptions.UwbServiceNotAvailableException {
            /*
                Method dump skipped, instruction units count: 454
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.b.C2707b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(ProducerScope<? super v5.e> producerScope, Continuation<? super h0> continuation) {
            return ((C2707b) create(producerScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(UwbClient uwbClient, v5.a rangingCapabilities, v5.f localAddress) {
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
        return FlowKt.callbackFlow(new C2707b(parameters, null));
    }
}
