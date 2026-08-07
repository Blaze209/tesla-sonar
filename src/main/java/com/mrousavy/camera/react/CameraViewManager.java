package com.mrousavy.camera.react;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import fz.CameraDeviceFormat;
import fz.CodeScannerOptions;
import java.util.Map;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0016\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001[B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001f\u0010\u001bJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0018H\u0007¢\u0006\u0004\b!\u0010\u001bJ\u001f\u0010#\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0018H\u0007¢\u0006\u0004\b#\u0010\u001bJ\u001f\u0010%\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0018H\u0007¢\u0006\u0004\b%\u0010\u001bJ\u001f\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0018H\u0007¢\u0006\u0004\b'\u0010\u001bJ!\u0010)\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b)\u0010\u0017J\u001f\u0010+\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0018H\u0007¢\u0006\u0004\b+\u0010\u001bJ\u001f\u0010-\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0018H\u0007¢\u0006\u0004\b-\u0010\u001bJ!\u0010/\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b/\u0010\u0017J\u001f\u00101\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0018H\u0007¢\u0006\u0004\b1\u0010\u001bJ!\u00104\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b7\u0010\u0017J!\u00109\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b9\u0010\u0017J\u001f\u0010<\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010>\u001a\u00020:H\u0007¢\u0006\u0004\b?\u0010=J\u001f\u0010A\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u0018H\u0007¢\u0006\u0004\bA\u0010\u001bJ!\u0010C\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010B\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\bC\u0010\u0017J\u001f\u0010E\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0018H\u0007¢\u0006\u0004\bE\u0010\u001bJ\u001f\u0010H\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010G\u001a\u00020FH\u0007¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010J\u001a\u00020FH\u0007¢\u0006\u0004\bK\u0010IJ\u001f\u0010M\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u0018H\u0007¢\u0006\u0004\bM\u0010\u001bJ\u001f\u0010O\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u0018H\u0007¢\u0006\u0004\bO\u0010\u001bJ!\u0010Q\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\bQ\u0010\u0017J\u001f\u0010S\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010R\u001a\u00020FH\u0007¢\u0006\u0004\bS\u0010IJ\u001f\u0010U\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010T\u001a\u00020FH\u0007¢\u0006\u0004\bU\u0010IJ!\u0010W\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010V\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\bW\u0010\u0017J!\u0010Y\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010X\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\bY\u00105¨\u0006\\"}, d2 = {"Lcom/mrousavy/camera/react/CameraViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/mrousavy/camera/react/o;", "<init>", "()V", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/mrousavy/camera/react/o;", "view", "Ljn0/h0;", "onAfterUpdateTransaction", "(Lcom/mrousavy/camera/react/o;)V", "", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "onDropViewInstance", "cameraId", "setCameraId", "(Lcom/mrousavy/camera/react/o;Ljava/lang/String;)V", "", "isMirrored", "setIsMirrored", "(Lcom/mrousavy/camera/react/o;Z)V", "preview", "setPreview", "photo", "setPhoto", MediaStreamTrack.VIDEO_TRACK_KIND, "setVideo", MediaStreamTrack.AUDIO_TRACK_KIND, "setAudio", "enableLocation", "setEnableLocation", "enableFrameProcessor", "setEnableFrameProcessor", "pixelFormat", "setPixelFormat", "enableDepthData", "setEnableDepthData", "enableZoomGesture", "setEnableZoomGesture", "videoStabilizationMode", "setVideoStabilizationMode", "enablePortraitEffectsMatteDelivery", "setEnablePortraitEffectsMatteDelivery", "Lcom/facebook/react/bridge/ReadableMap;", "format", "setFormat", "(Lcom/mrousavy/camera/react/o;Lcom/facebook/react/bridge/ReadableMap;)V", "resizeMode", "setResizeMode", "androidPreviewViewType", "setAndroidPreviewViewType", "", "minFps", "setMinFps", "(Lcom/mrousavy/camera/react/o;I)V", "maxFps", "setMaxFps", "photoHdr", "setPhotoHdr", "photoQualityBalance", "setPhotoQualityBalance", "videoHdr", "setVideoHdr", "", "videoBitRateOverride", "setVideoBitRateOverride", "(Lcom/mrousavy/camera/react/o;D)V", "videoBitRateMultiplier", "setVideoBitRateMultiplier", "lowLightBoost", "setLowLightBoost", "isActive", "setIsActive", "torch", "setTorch", "zoom", "setZoom", "exposure", "setExposure", "outputOrientation", "setOrientation", "codeScannerOptions", "setCodeScanner", "Companion", "a", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CameraViewManager extends ViewGroupManager<o> {
    public static final String TAG = "CameraView";

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return jn.c.a().b("topCameraViewReady", jn.c.d("registrationName", "onViewReady")).b("topCameraInitialized", jn.c.d("registrationName", "onInitialized")).b("topCameraStarted", jn.c.d("registrationName", "onStarted")).b("topCameraStopped", jn.c.d("registrationName", "onStopped")).b("topCameraShutter", jn.c.d("registrationName", "onShutter")).b("topCameraError", jn.c.d("registrationName", "onError")).b("topCameraCodeScanned", jn.c.d("registrationName", "onCodeScanned")).b("topCameraPreviewStarted", jn.c.d("registrationName", "onPreviewStarted")).b("topCameraPreviewStopped", jn.c.d("registrationName", "onPreviewStopped")).b("topCameraOutputOrientationChanged", jn.c.d("registrationName", "onOutputOrientationChanged")).b("topCameraPreviewOrientationChanged", jn.c.d("registrationName", "onPreviewOrientationChanged")).b("topCameraAverageFpsChanged", jn.c.d("registrationName", "onAverageFpsChanged")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CameraView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(name = "androidPreviewViewType")
    public final void setAndroidPreviewViewType(o view, String androidPreviewViewType) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (androidPreviewViewType != null) {
            view.setAndroidPreviewViewType(fz.n.INSTANCE.a(androidPreviewViewType));
        } else {
            view.setAndroidPreviewViewType(fz.n.SURFACE_VIEW);
        }
    }

    @no.a(name = MediaStreamTrack.AUDIO_TRACK_KIND)
    public final void setAudio(o view, boolean audio) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setAudio(audio);
    }

    @no.a(name = "cameraId")
    public final void setCameraId(o view, String cameraId) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(cameraId, "cameraId");
        view.setCameraId(cameraId);
    }

    @no.a(name = "codeScannerOptions")
    public final void setCodeScanner(o view, ReadableMap codeScannerOptions) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (codeScannerOptions != null) {
            view.setCodeScannerOptions(CodeScannerOptions.INSTANCE.a(codeScannerOptions));
        } else {
            view.setCodeScannerOptions(null);
        }
    }

    @no.a(name = "enableDepthData")
    public final void setEnableDepthData(o view, boolean enableDepthData) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setEnableDepthData(enableDepthData);
    }

    @no.a(name = "enableFrameProcessor")
    public final void setEnableFrameProcessor(o view, boolean enableFrameProcessor) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setEnableFrameProcessor(enableFrameProcessor);
    }

    @no.a(name = "enableLocation")
    public final void setEnableLocation(o view, boolean enableLocation) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setEnableLocation(enableLocation);
    }

    @no.a(name = "enablePortraitEffectsMatteDelivery")
    public final void setEnablePortraitEffectsMatteDelivery(o view, boolean enablePortraitEffectsMatteDelivery) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setEnablePortraitEffectsMatteDelivery(enablePortraitEffectsMatteDelivery);
    }

    @no.a(name = "enableZoomGesture")
    public final void setEnableZoomGesture(o view, boolean enableZoomGesture) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setEnableZoomGesture(enableZoomGesture);
    }

    @no.a(name = "exposure")
    public final void setExposure(o view, double exposure) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setExposure(exposure);
    }

    @no.a(name = "format")
    public final void setFormat(o view, ReadableMap format) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (format != null) {
            view.setFormat(CameraDeviceFormat.INSTANCE.a(format));
        } else {
            view.setFormat(null);
        }
    }

    @no.a(name = "isActive")
    public final void setIsActive(o view, boolean isActive) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setActive(isActive);
    }

    @no.a(name = "isMirrored")
    public final void setIsMirrored(o view, boolean isMirrored) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setMirrored(isMirrored);
    }

    @no.a(name = "lowLightBoost")
    public final void setLowLightBoost(o view, boolean lowLightBoost) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setLowLightBoost(lowLightBoost);
    }

    @no.a(defaultInt = -1, name = "maxFps")
    public final void setMaxFps(o view, int maxFps) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setMaxFps(maxFps > 0 ? Integer.valueOf(maxFps) : null);
    }

    @no.a(defaultInt = -1, name = "minFps")
    public final void setMinFps(o view, int minFps) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setMinFps(minFps > 0 ? Integer.valueOf(minFps) : null);
    }

    @no.a(name = "outputOrientation")
    public final void setOrientation(o view, String outputOrientation) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (outputOrientation != null) {
            view.setOutputOrientation(fz.j.INSTANCE.a(outputOrientation));
        } else {
            view.setOutputOrientation(fz.j.DEVICE);
        }
    }

    @no.a(name = "photo")
    public final void setPhoto(o view, boolean photo) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setPhoto(photo);
    }

    @no.a(name = "photoHdr")
    public final void setPhotoHdr(o view, boolean photoHdr) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setPhotoHdr(photoHdr);
    }

    @no.a(name = "photoQualityBalance")
    public final void setPhotoQualityBalance(o view, String photoQualityBalance) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (photoQualityBalance != null) {
            view.setPhotoQualityBalance(fz.o.INSTANCE.a(photoQualityBalance));
        } else {
            view.setPhotoQualityBalance(fz.o.BALANCED);
        }
    }

    @no.a(name = "pixelFormat")
    public final void setPixelFormat(o view, String pixelFormat) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (pixelFormat != null) {
            view.setPixelFormat(fz.l.INSTANCE.b(pixelFormat));
        } else {
            view.setPixelFormat(fz.l.YUV);
        }
    }

    @no.a(defaultBoolean = true, name = "preview")
    public final void setPreview(o view, boolean preview) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setPreview(preview);
    }

    @no.a(name = "resizeMode")
    public final void setResizeMode(o view, String resizeMode) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (resizeMode != null) {
            view.setResizeMode(fz.q.INSTANCE.a(resizeMode));
        } else {
            view.setResizeMode(fz.q.COVER);
        }
    }

    @no.a(name = "torch")
    public final void setTorch(o view, String torch) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (torch != null) {
            view.setTorch(fz.u.INSTANCE.a(torch));
        } else {
            view.setTorch(fz.u.OFF);
        }
    }

    @no.a(name = MediaStreamTrack.VIDEO_TRACK_KIND)
    public final void setVideo(o view, boolean video) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setVideo(video);
    }

    @no.a(defaultDouble = com.swmansion.rnscreens.t.SHEET_FIT_TO_CONTENTS, name = "videoBitRateMultiplier")
    public final void setVideoBitRateMultiplier(o view, double videoBitRateMultiplier) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (videoBitRateMultiplier == -1.0d) {
            view.setVideoBitRateMultiplier(null);
        } else {
            view.setVideoBitRateMultiplier(Double.valueOf(videoBitRateMultiplier));
        }
    }

    @no.a(defaultDouble = com.swmansion.rnscreens.t.SHEET_FIT_TO_CONTENTS, name = "videoBitRateOverride")
    public final void setVideoBitRateOverride(o view, double videoBitRateOverride) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (videoBitRateOverride == -1.0d) {
            view.setVideoBitRateOverride(null);
        } else {
            view.setVideoBitRateOverride(Double.valueOf(videoBitRateOverride));
        }
    }

    @no.a(name = "videoHdr")
    public final void setVideoHdr(o view, boolean videoHdr) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setVideoHdr(videoHdr);
    }

    @no.a(name = "videoStabilizationMode")
    public final void setVideoStabilizationMode(o view, String videoStabilizationMode) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (videoStabilizationMode != null) {
            view.setVideoStabilizationMode(fz.y.INSTANCE.a(videoStabilizationMode));
        } else {
            view.setVideoStabilizationMode(null);
        }
    }

    @no.a(name = "zoom")
    public final void setZoom(o view, double zoom) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.setZoom((float) zoom);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public o createViewInstance(v0 context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return new o(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(o view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        super.onAfterUpdateTransaction(view);
        view.s();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(o view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.k();
        super.onDropViewInstance(view);
    }
}
