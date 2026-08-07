package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.n2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {
    @NonNull
    static List<m2> a(@NonNull n2 n2Var) {
        ArrayList arrayList = new ArrayList();
        if (n2Var.a(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.g())) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (n2Var.a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.i())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (n2Var.a(Nexus4AndroidLTargetAspectRatioQuirk.class, Nexus4AndroidLTargetAspectRatioQuirk.h())) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (n2Var.a(ExcludedSupportedSizesQuirk.class, ExcludedSupportedSizesQuirk.v())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        if (n2Var.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.g())) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (n2Var.a(PreviewPixelHDRnetQuirk.class, PreviewPixelHDRnetQuirk.g())) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (n2Var.a(StillCaptureFlashStopRepeatingQuirk.class, StillCaptureFlashStopRepeatingQuirk.g())) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (n2Var.a(ExtraSupportedSurfaceCombinationsQuirk.class, ExtraSupportedSurfaceCombinationsQuirk.l())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (n2Var.a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.h())) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (n2Var.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, RepeatingStreamConstraintForVideoRecordingQuirk.h())) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (n2Var.a(TextureViewIsClosedQuirk.class, TextureViewIsClosedQuirk.g())) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (n2Var.a(CaptureSessionOnClosedNotCalledQuirk.class, CaptureSessionOnClosedNotCalledQuirk.g())) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        if (n2Var.a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.g())) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (n2Var.a(ZslDisablerQuirk.class, ZslDisablerQuirk.j())) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (n2Var.a(ExtraSupportedOutputSizeQuirk.class, ExtraSupportedOutputSizeQuirk.j())) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        if (n2Var.a(InvalidVideoProfilesQuirk.class, InvalidVideoProfilesQuirk.t())) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (n2Var.a(Preview3AThreadCrashQuirk.class, Preview3AThreadCrashQuirk.g())) {
            arrayList.add(new Preview3AThreadCrashQuirk());
        }
        if (n2Var.a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.h())) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (n2Var.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.g())) {
            arrayList.add(PreviewUnderExposureQuirk.f3009a);
        }
        return arrayList;
    }
}
