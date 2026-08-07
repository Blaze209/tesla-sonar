package com.fourthline.vision.internal;

import android.content.Context;
import android.hardware.SensorManager;
import android.media.ImageReader;
import android.os.Handler;
import androidx.p002activity.result.ActivityResultRegistry;
import com.fourthline.core.location.FourthlineLocationHelper;
import com.fourthline.core.location.LocationProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4297u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f38938a = new a(null);

    /* JADX INFO: renamed from: com.fourthline.vision.internal.u5$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final C4144a provideAccelerometerFlow(CoroutineContext coroutineContext, SensorManager sensorManager) {
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        p013kotlin.jvm.internal.s.k(sensorManager, "sensorManager");
        return new C4144a(sensorManager, 0, coroutineContext, 2, null);
    }

    public final C4313x0 provideDebugConsumer() {
        return new C4313x0();
    }

    public final H2 provideGyroscopeFlow(CoroutineContext coroutineContext, SensorManager sensorManager) {
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        p013kotlin.jvm.internal.s.k(sensorManager, "sensorManager");
        return new H2(sensorManager, 0, coroutineContext, 2, null);
    }

    public final K2 provideImageDataSource(ImageReader imageReader, Handler handler, CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(imageReader, "imageReader");
        p013kotlin.jvm.internal.s.k(handler, "handler");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        return new K2(imageReader, handler, coroutineContext);
    }

    public final ImageReader provideImageReader(C4312x cameraInfoProvider) {
        p013kotlin.jvm.internal.s.k(cameraInfoProvider, "cameraInfoProvider");
        ImageReader imageReaderNewInstance = ImageReader.newInstance(cameraInfoProvider.getImageReaderSize().getWidth(), cameraInfoProvider.getImageReaderSize().getHeight(), 35, 5);
        p013kotlin.jvm.internal.s.j(imageReaderNewInstance, "newInstance(...)");
        return imageReaderNewInstance;
    }

    public final T2 provideIsSteadyDataSource(CoroutineContext coroutineContext, H2 gyroscopeFlow, C4144a accelerometerFlow) {
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        p013kotlin.jvm.internal.s.k(gyroscopeFlow, "gyroscopeFlow");
        p013kotlin.jvm.internal.s.k(accelerometerFlow, "accelerometerFlow");
        return new T2(gyroscopeFlow, accelerometerFlow, 0L, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, coroutineContext.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), 28, null);
    }

    public final LocationProvider provideLocationProvider(Context context, ActivityResultRegistry registry) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(registry, "registry");
        return FourthlineLocationHelper.getLocationProvider(context, registry);
    }

    public final C4323y3 provideMetadataRepository() {
        return new C4323y3();
    }

    public final Q5 provideTriggerRepository() {
        return new Q5();
    }
}
