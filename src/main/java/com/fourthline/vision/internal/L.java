package com.fourthline.vision.internal;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.renderscript.RenderScript;
import androidx.p002activity.result.ActivityResultRegistry;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.TimestampProviderInternal;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f37810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4213i4 f37811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V5 f37812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineContext f37813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final VisionDocumentScannerFeatureConfig f37814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f37815f;

    public L(Context context, C4213i4 scannerConfig, V5 videoConfig, CoroutineContext coroutineContext, VisionDocumentScannerFeatureConfig featureConfig) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(scannerConfig, "scannerConfig");
        p013kotlin.jvm.internal.s.k(videoConfig, "videoConfig");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        p013kotlin.jvm.internal.s.k(featureConfig, "featureConfig");
        this.f37810a = context;
        this.f37811b = scannerConfig;
        this.f37812c = videoConfig;
        this.f37813d = coroutineContext;
        this.f37814e = featureConfig;
        Context applicationContext = context.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        this.f37815f = applicationContext;
    }

    public final ActivityResultRegistry provideActivityResultRegistry() {
        Object obj = this.f37810a;
        if ((obj instanceof h.d ? (h.d) obj : null) != null) {
            return ((h.d) obj).getActivityResultRegistry();
        }
        throw new IllegalStateException("Can't retrieve activityResultRegistry. Context's holder (Activity, Fragment etc) should implement ActivityResultRegistryOwner");
    }

    public final InterfaceC4184f provideAudioRecorder() {
        return new C4192g();
    }

    public final C4243n provideBitrateCalculator() {
        return new C4243n(this.f37812c.getTargetBitRate());
    }

    public final Context provideContext() {
        return this.f37815f;
    }

    public final CoroutineContext provideCoroutineContext() {
        return this.f37813d;
    }

    public final Handler provideHandler(HandlerThread handlerThread) {
        p013kotlin.jvm.internal.s.k(handlerThread, "handlerThread");
        if (!handlerThread.isAlive()) {
            handlerThread.start();
        }
        return new Handler(handlerThread.getLooper());
    }

    public final HandlerThread provideHandlerThread() {
        return new HandlerThread("camera2 background thread");
    }

    public final I2 provideImageConverter(RenderScript renderScript, r6 visionInfoProvider) {
        p013kotlin.jvm.internal.s.k(renderScript, "renderScript");
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        return new C4189f4(renderScript, visionInfoProvider.getOrientationHint());
    }

    public final J2 provideImageCropper() {
        return new C4229l();
    }

    public final Q2 provideImageToScannerImageInteractor(I2 imageConverter, J2 imageCropper, r6 visionInfoProvider) {
        p013kotlin.jvm.internal.s.k(imageConverter, "imageConverter");
        p013kotlin.jvm.internal.s.k(imageCropper, "imageCropper");
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        return new N2(imageConverter, imageCropper, visionInfoProvider.getImageReaderSize());
    }

    public final InterfaceC4164c3 provideMLKitConverter(r6 visionInfoProvider) {
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        return new G2(visionInfoProvider.getOrientationHint());
    }

    public final C4196g3 provideMediaCodecProvider(r6 visionInfoProvider, C4204h3 sizeCalculator, C4243n bitrateCalculator) {
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        p013kotlin.jvm.internal.s.k(sizeCalculator, "sizeCalculator");
        p013kotlin.jvm.internal.s.k(bitrateCalculator, "bitrateCalculator");
        return new C4196g3(visionInfoProvider, sizeCalculator, bitrateCalculator, this.f37812c.getCodec());
    }

    public final C4204h3 provideMediaCodecSizeCalculator() {
        return new C4204h3();
    }

    public final MotionDataCollector provideMotionDataCollector(Context context, CoroutineContext coroutineContext, C4213i4 scannerConfig) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        p013kotlin.jvm.internal.s.k(scannerConfig, "scannerConfig");
        return new MotionDataCollector(new AndroidDataCollectorHelper(context, null, null, null, null, null, null, null, null, null, CoroutineScopeKt.CoroutineScope(coroutineContext), 1022, null), new ArrayList(), new LinkedHashMap(), scannerConfig.getShouldCollectMotionData(), 100L);
    }

    public final RenderScript provideRenderScript(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return RenderScript.create(context);
    }

    public final C4213i4 provideScannerConfig() {
        return this.f37811b;
    }

    public final Q2 provideScannerImageToStepResultInteractor(Q2 scannerImageCreator) {
        p013kotlin.jvm.internal.s.k(scannerImageCreator, "scannerImageCreator");
        return new C4269q4(scannerImageCreator);
    }

    public final SensorManager provideSensorManager(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("sensor");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return (SensorManager) systemService;
    }

    public final TimestampProvider provideTimestampProvider() {
        return new TimestampProviderInternal();
    }

    public final P5 provideTriggerPreconditionConsumer(Q5 triggerRepository) {
        p013kotlin.jvm.internal.s.k(triggerRepository, "triggerRepository");
        return new P5(triggerRepository);
    }

    public final InterfaceC4226k3 provideVideoFilesManager(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return new C4233l3(new File(ContextExtensionsKt.getFourthlineDirectory(context)));
    }

    public final InterfaceC4254o3 provideVideoTrimmer() {
        return new C4261p3();
    }

    public final VisionDocumentScannerFeatureConfig providesFeatureConfig$fourthline_vision_release() {
        return this.f37814e;
    }

    public final Y2 providesLegacyPreviewCalculator(r6 visionInfoProvider) {
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        return new Y2(visionInfoProvider);
    }

    public final S3 providesPlayServicesAvailabilityDataSource(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Context applicationContext = context.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        return new S3(applicationContext);
    }

    public final U3 providesPreviewCalculator(r6 visionInfoProvider) {
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        return new U3(visionInfoProvider);
    }

    public /* synthetic */ L(Context context, C4213i4 c4213i4, V5 v11, CoroutineContext coroutineContext, VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, c4213i4, (i11 & 4) != 0 ? new V5(null, U5.AVC) : v11, (i11 & 8) != 0 ? Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)) : coroutineContext, (i11 & 16) != 0 ? new VisionDocumentScannerFeatureConfig(false, false, VisionDocumentScannerFeatureConfig.AutoDetectMode.DirectCapture, null, 11, null) : visionDocumentScannerFeatureConfig);
    }
}
