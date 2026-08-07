package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.Context;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.internal.devicedata.MotionFrame;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.JsonElement;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29835a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements VC {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ E6 f29836a;

        b(E6 e11) {
            this.f29836a = e11;
        }

        @Override // com.fourthline.orca.internal.VC
        public JsonElement a() {
            Map mapF;
            E6 e11 = this.f29836a;
            Map mapR = p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(e11.d(), e11.f()), e11.b()), e11.k()), e11.e()), e11.g()), e11.l()), e11.a()), e11.h()), e11.n()), e11.j());
            if (mapR.isEmpty() && e11.i().isEmpty()) {
                return null;
            }
            wo0.b bVarA = Ki.a();
            C4032xg c4032xg = new C4032xg();
            if (e11.i().isEmpty()) {
                mapF = p013kotlin.collections.v0.i();
            } else {
                wo0.b bVarA2 = Ki.a();
                List listI = e11.i();
                bVarA2.getSerializersModule();
                mapF = p013kotlin.collections.v0.f(jn0.x.a("motionFrames", bVarA2.e(new vo0.e(MotionFrame.INSTANCE.serializer()), listI)));
            }
            return bVarA.e(c4032xg, p013kotlin.collections.v0.r(mapR, mapF));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(InterfaceC3051ak interfaceC3051ak) {
        DeviceDataCollection deviceDataCollectionC = interfaceC3051ak.c();
        if (deviceDataCollectionC.getEnabled()) {
            return deviceDataCollectionC.getUploadTimeoutMs();
        }
        return 0L;
    }

    public final AndroidDataCollectorHelper a(Context context, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new AndroidDataCollectorHelper(context, null, null, null, null, null, null, null, null, null, coroutineScope, 1022, null);
    }

    public final boolean d(InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        DeviceDataCollection deviceDataCollectionC = mainRepository.c();
        return deviceDataCollectionC.getEnabled() && deviceDataCollectionC.getMotion().getEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceDataCollection b(InterfaceC3051ak interfaceC3051ak) {
        return interfaceC3051ak.c();
    }

    public final E6 a() {
        return new E6(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final wn0.a a(final InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new wn0.a() { // from class: com.fourthline.orca.internal.hw0
            @Override // wn0.a
            public final Object invoke() {
                return Y5.b(mainRepository);
            }
        };
    }

    public final H6 a(Context context, Activity activity, E6 deviceDataBundle, AndroidDataCollectorHelper androidDataCollectorHelper) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(activity, "activity");
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        p013kotlin.jvm.internal.s.k(androidDataCollectorHelper, "androidDataCollectorHelper");
        return new H6(context, activity, androidDataCollectorHelper, deviceDataBundle);
    }

    public final Ew a(AndroidDataCollectorHelper androidDataCollectorHelper, E6 deviceDataBundle, InterfaceC3051ak mainRepository, final CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(androidDataCollectorHelper, "androidDataCollectorHelper");
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        List listI = deviceDataBundle.i();
        Map mapJ = deviceDataBundle.j();
        boolean z11 = mainRepository instanceof If;
        final MotionDataCollector motionDataCollector = new MotionDataCollector(androidDataCollectorHelper, listI, mapJ, z11 || (mainRepository instanceof A9) || (mainRepository instanceof Xx), 0L, 16, null);
        if (z11) {
            return new Ew(motionDataCollector, ((If) mainRepository).g(), coroutineScope);
        }
        if (!(mainRepository instanceof A9) && !(mainRepository instanceof Xx)) {
            return (Ew) AbstractC3989wg.a("Expected FlatMainRepository for the ReactiveMotionDataCollector", new wn0.a() { // from class: com.fourthline.orca.internal.fw0
                @Override // wn0.a
                public final Object invoke() {
                    return Y5.a(motionDataCollector, coroutineScope);
                }
            });
        }
        return new Ew(motionDataCollector, FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(mainRepository.c())), coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ew a(MotionDataCollector motionDataCollector, CoroutineScope coroutineScope) {
        return new Ew(motionDataCollector, FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(new DeviceDataCollection(false, 0L, (DeviceDataCollection.Depth) null, (DeviceDataCollection.Motion) null, (DeviceDataCollection.Environment) null, (DeviceDataCollection.Gps) null, (DeviceDataCollection.Cellular) null, (DeviceDataCollection.Network) null, (DeviceDataCollection.Hardware) null, (DeviceDataCollection.Screen) null, (DeviceDataCollection.Battery) null, (DeviceDataCollection.Locale) null, (DeviceDataCollection.System) null, 8190, (DefaultConstructorMarker) null))), coroutineScope);
    }

    public final G6 a(H6 factory, wn0.a deviceDataCollectionProvider) {
        p013kotlin.jvm.internal.s.k(factory, "factory");
        p013kotlin.jvm.internal.s.k(deviceDataCollectionProvider, "deviceDataCollectionProvider");
        return new G6(factory, deviceDataCollectionProvider);
    }

    public final VC a(E6 deviceDataBundle) {
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        return new b(deviceDataBundle);
    }

    public final CC a(InterfaceC3457k6 dataUploaderWorker, VC deviceDataRepository, G6 deviceDataCollectorComposite, final InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(dataUploaderWorker, "dataUploaderWorker");
        p013kotlin.jvm.internal.s.k(deviceDataRepository, "deviceDataRepository");
        p013kotlin.jvm.internal.s.k(deviceDataCollectorComposite, "deviceDataCollectorComposite");
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new Jl(dataUploaderWorker, deviceDataCollectorComposite, deviceDataRepository, new wn0.a() { // from class: com.fourthline.orca.internal.gw0
            @Override // wn0.a
            public final Object invoke() {
                return Long.valueOf(Y5.c(mainRepository));
            }
        });
    }

    public final C3259ff a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return new C3259ff(context);
    }
}
