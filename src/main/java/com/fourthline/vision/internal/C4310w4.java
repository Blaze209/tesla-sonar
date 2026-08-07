package com.fourthline.vision.internal;

import android.content.Context;
import android.hardware.SensorManager;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.TimestampProviderInternal;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.location.FourthlineLocationHelper;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.vision.internal.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4310w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineScope f39055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f39056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimestampProvider f39057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f39058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final T2 f39059f;

    public C4310w4(Context context, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f39054a = context;
        this.f39055b = coroutineScope;
        Executor mainExecutor = androidx.core.content.b.getMainExecutor(context);
        p013kotlin.jvm.internal.s.j(mainExecutor, "getMainExecutor(...)");
        this.f39056c = mainExecutor;
        this.f39057d = new TimestampProviderInternal();
        this.f39058e = jn0.m.b(new wn0.a() { // from class: com.fourthline.vision.internal.vb
            @Override // wn0.a
            public final Object invoke() {
                return C4310w4.locationProvider_delegate$lambda$0(this.f39052a);
            }
        });
        Object systemService = context.getSystemService("sensor");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        H2 h11 = new H2((SensorManager) systemService, 0, Dispatchers.getDefault().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), 2, null);
        Object systemService2 = context.getSystemService("sensor");
        p013kotlin.jvm.internal.s.i(systemService2, "null cannot be cast to non-null type android.hardware.SensorManager");
        this.f39059f = new T2(h11, new C4144a((SensorManager) systemService2, 0, Dispatchers.getDefault().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), 2, null), 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Dispatchers.getDefault().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), 28, null);
    }

    private final LocationProvider getLocationProvider() {
        return (LocationProvider) this.f39058e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationProvider locationProvider_delegate$lambda$0(C4310w4 c4310w4) {
        Context applicationContext = c4310w4.f39054a.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        Object obj = c4310w4.f39054a;
        h.d dVar = obj instanceof h.d ? (h.d) obj : null;
        if (dVar != null) {
            return FourthlineLocationHelper.getLocationProvider(applicationContext, dVar.getActivityResultRegistry());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final MotionDataCollector motionDataCollector(boolean z11) {
        return new MotionDataCollector(new AndroidDataCollectorHelper(this.f39054a, null, null, null, null, null, null, null, null, null, this.f39055b, 1022, null), new ArrayList(), new LinkedHashMap(), z11, 100L);
    }

    public final androidx.camera.core.f.a analyzer(int i11, InterfaceC4267q2 onFacesDetected) {
        p013kotlin.jvm.internal.s.k(onFacesDetected, "onFacesDetected");
        return new C4260p2(this.f39056c, i11, onFacesDetected);
    }

    public final E3 motionDataManager(boolean z11) {
        return new C4176e(z11, motionDataCollector(z11), this.f39057d, new M3(this.f39057d));
    }

    public final C4242m5 stateMachine(InterfaceC4264q cameraEngine, E3 motionDataManager, wn0.a<E5> screenSizeProvider, wn0.a<j3.i> faceDetectionAreaProvider, SelfieScannerConfig config, wn0.l<? super SelfieScannerEvent, jn0.h0> publicCallbacks) {
        p013kotlin.jvm.internal.s.k(cameraEngine, "cameraEngine");
        p013kotlin.jvm.internal.s.k(motionDataManager, "motionDataManager");
        p013kotlin.jvm.internal.s.k(screenSizeProvider, "screenSizeProvider");
        p013kotlin.jvm.internal.s.k(faceDetectionAreaProvider, "faceDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(publicCallbacks, "publicCallbacks");
        CoroutineScope coroutineScope = this.f39055b;
        return new C4242m5(screenSizeProvider, faceDetectionAreaProvider, config, publicCallbacks, cameraEngine, motionDataManager, this.f39057d, getLocationProvider(), this.f39059f, coroutineScope);
    }
}
