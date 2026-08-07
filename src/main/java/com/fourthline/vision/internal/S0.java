package com.fourthline.vision.internal;

import android.content.Context;
import android.hardware.SensorManager;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.TimestampProviderInternal;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.location.FourthlineLocationHelper;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f37930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineScope f37931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f37932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimestampProvider f37933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f37934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final T2 f37935f;

    public S0(Context context, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f37930a = context;
        this.f37931b = coroutineScope;
        Executor mainExecutor = androidx.core.content.b.getMainExecutor(context);
        p013kotlin.jvm.internal.s.j(mainExecutor, "getMainExecutor(...)");
        this.f37932c = mainExecutor;
        this.f37933d = new TimestampProviderInternal();
        this.f37934e = jn0.m.b(new wn0.a() { // from class: com.fourthline.vision.internal.h8
            @Override // wn0.a
            public final Object invoke() {
                return S0.locationProvider_delegate$lambda$0(this.f38386a);
            }
        });
        Object systemService = context.getSystemService("sensor");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        H2 h11 = new H2((SensorManager) systemService, 0, Dispatchers.getDefault().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), 2, null);
        Object systemService2 = context.getSystemService("sensor");
        p013kotlin.jvm.internal.s.i(systemService2, "null cannot be cast to non-null type android.hardware.SensorManager");
        this.f37935f = new T2(h11, new C4144a((SensorManager) systemService2, 0, Dispatchers.getDefault().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), 2, null), 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Dispatchers.getDefault().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), 28, null);
    }

    private final LocationProvider getLocationProvider() {
        return (LocationProvider) this.f37934e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationProvider locationProvider_delegate$lambda$0(S0 s11) {
        Context applicationContext = s11.f37930a.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        Object obj = s11.f37930a;
        h.d dVar = obj instanceof h.d ? (h.d) obj : null;
        if (dVar != null) {
            return FourthlineLocationHelper.getLocationProvider(applicationContext, dVar.getActivityResultRegistry());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final MotionDataCollector motionDataCollector(boolean z11) {
        return new MotionDataCollector(new AndroidDataCollectorHelper(this.f37930a, null, null, null, null, null, null, null, null, null, this.f37931b, 1022, null), new ArrayList(), new LinkedHashMap(), z11, 100L);
    }

    public final androidx.camera.core.f.a analyzer(int i11, M0 callback) {
        p013kotlin.jvm.internal.s.k(callback, "callback");
        return new L0(this.f37932c, i11, callback);
    }

    public final E3 motionDataManager(boolean z11) {
        return new C4176e(z11, motionDataCollector(z11), this.f37933d, new M3(this.f37933d));
    }

    public final X1 stateMachine(wn0.a<j3.i> detectionArea, DocumentScannerConfig config, InterfaceC4264q cameraEngine, E3 motionDataManager, wn0.a<E5> screenSizeProvider, wn0.l<? super DocumentScannerEvent, jn0.h0> publicCallbacks) {
        p013kotlin.jvm.internal.s.k(detectionArea, "detectionArea");
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(cameraEngine, "cameraEngine");
        p013kotlin.jvm.internal.s.k(motionDataManager, "motionDataManager");
        p013kotlin.jvm.internal.s.k(screenSizeProvider, "screenSizeProvider");
        p013kotlin.jvm.internal.s.k(publicCallbacks, "publicCallbacks");
        return new X1(cameraEngine, config, publicCallbacks, detectionArea, screenSizeProvider, motionDataManager, this.f37933d, getLocationProvider(), this.f37935f, this.f37931b);
    }
}
