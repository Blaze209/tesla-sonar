package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.n2;
import androidx.camera.core.impl.o2;
import androidx.camera.core.impl.r2;
import c0.y0;
import java.util.ArrayList;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class a {
    @NonNull
    public static r2 a(@NonNull String str, @NonNull z zVar) {
        n2 n2VarA = o2.b().a();
        ArrayList arrayList = new ArrayList();
        if (n2VarA.a(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.h(zVar))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(zVar));
        }
        if (n2VarA.a(AspectRatioLegacyApi21Quirk.class, AspectRatioLegacyApi21Quirk.h(zVar))) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (n2VarA.a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.g(zVar))) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (n2VarA.a(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.g(zVar))) {
            arrayList.add(new JpegCaptureDownsizingQuirk());
        }
        if (n2VarA.a(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.h(zVar))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(zVar));
        }
        if (n2VarA.a(CaptureNoResponseQuirk.class, CaptureNoResponseQuirk.g(zVar))) {
            arrayList.add(new CaptureNoResponseQuirk());
        }
        if (n2VarA.a(LegacyCameraOutputConfigNullPointerQuirk.class, LegacyCameraOutputConfigNullPointerQuirk.g(zVar))) {
            arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        if (n2VarA.a(LegacyCameraSurfaceCleanupQuirk.class, LegacyCameraSurfaceCleanupQuirk.h(zVar))) {
            arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        if (n2VarA.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.g(zVar))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (n2VarA.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.g(zVar))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (n2VarA.a(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.m(zVar))) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (n2VarA.a(FlashTooSlowQuirk.class, FlashTooSlowQuirk.h(zVar))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (n2VarA.a(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.g(zVar))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        if (n2VarA.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.g(zVar))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (n2VarA.a(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.g(zVar))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        if (n2VarA.a(CaptureSessionStuckQuirk.class, CaptureSessionStuckQuirk.g(zVar))) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (n2VarA.a(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.g(zVar))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (n2VarA.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.g(zVar))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (n2VarA.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.g(zVar))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (n2VarA.a(IncorrectCaptureStateQuirk.class, IncorrectCaptureStateQuirk.g(zVar))) {
            arrayList.add(new IncorrectCaptureStateQuirk());
        }
        if (n2VarA.a(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.l(zVar))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(zVar));
        }
        if (n2VarA.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.m())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (n2VarA.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.g())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (n2VarA.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.n())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (n2VarA.a(TemporalNoiseQuirk.class, TemporalNoiseQuirk.h(zVar))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (n2VarA.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.i())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if (n2VarA.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class, CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.g(zVar))) {
            arrayList.add(new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk());
        }
        r2 r2Var = new r2(arrayList);
        y0.a("CameraQuirks", "camera2 CameraQuirks = " + r2.d(r2Var));
        return r2Var;
    }
}
