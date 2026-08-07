package androidx.camera.video.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.n2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {
    @NonNull
    static List<m2> a(@NonNull n2 n2Var) {
        ArrayList arrayList = new ArrayList();
        if (n2Var.a(MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class, MediaFormatMustNotUseFrameRateToFindEncoderQuirk.g())) {
            arrayList.add(new MediaFormatMustNotUseFrameRateToFindEncoderQuirk());
        }
        if (n2Var.a(MediaCodecInfoReportIncorrectInfoQuirk.class, MediaCodecInfoReportIncorrectInfoQuirk.p())) {
            arrayList.add(new MediaCodecInfoReportIncorrectInfoQuirk());
        }
        if (n2Var.a(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class, DeactivateEncoderSurfaceBeforeStopEncoderQuirk.g())) {
            arrayList.add(new DeactivateEncoderSurfaceBeforeStopEncoderQuirk());
        }
        if (n2Var.a(CameraUseInconsistentTimebaseQuirk.class, CameraUseInconsistentTimebaseQuirk.i())) {
            arrayList.add(new CameraUseInconsistentTimebaseQuirk());
        }
        if (n2Var.a(ReportedVideoQualityNotSupportedQuirk.class, ReportedVideoQualityNotSupportedQuirk.l())) {
            arrayList.add(new ReportedVideoQualityNotSupportedQuirk());
        }
        if (n2Var.a(EncoderNotUsePersistentInputSurfaceQuirk.class, EncoderNotUsePersistentInputSurfaceQuirk.g())) {
            arrayList.add(new EncoderNotUsePersistentInputSurfaceQuirk());
        }
        if (n2Var.a(VideoEncoderCrashQuirk.class, VideoEncoderCrashQuirk.h())) {
            arrayList.add(new VideoEncoderCrashQuirk());
        }
        if (n2Var.a(ExcludeStretchedVideoQualityQuirk.class, ExcludeStretchedVideoQualityQuirk.n())) {
            arrayList.add(new ExcludeStretchedVideoQualityQuirk());
        }
        if (n2Var.a(MediaStoreVideoCannotWrite.class, MediaStoreVideoCannotWrite.i())) {
            arrayList.add(new MediaStoreVideoCannotWrite());
        }
        if (n2Var.a(AudioEncoderIgnoresInputTimestampQuirk.class, AudioEncoderIgnoresInputTimestampQuirk.h())) {
            arrayList.add(new AudioEncoderIgnoresInputTimestampQuirk());
        }
        if (n2Var.a(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.g())) {
            arrayList.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
        }
        if (n2Var.a(NegativeLatLongSavesIncorrectlyQuirk.class, NegativeLatLongSavesIncorrectlyQuirk.g())) {
            arrayList.add(new NegativeLatLongSavesIncorrectlyQuirk());
        }
        if (n2Var.a(AudioTimestampFramePositionIncorrectQuirk.class, AudioTimestampFramePositionIncorrectQuirk.n())) {
            arrayList.add(new AudioTimestampFramePositionIncorrectQuirk());
        }
        if (n2Var.a(ExtraSupportedResolutionQuirk.class, ExtraSupportedResolutionQuirk.h())) {
            arrayList.add(new ExtraSupportedResolutionQuirk());
        }
        if (n2Var.a(StretchedVideoResolutionQuirk.class, StretchedVideoResolutionQuirk.i())) {
            arrayList.add(new StretchedVideoResolutionQuirk());
        }
        if (n2Var.a(CodecStuckOnFlushQuirk.class, CodecStuckOnFlushQuirk.i())) {
            arrayList.add(new CodecStuckOnFlushQuirk());
        }
        if (n2Var.a(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.h())) {
            arrayList.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
        }
        if (n2Var.a(ExtraSupportedQualityQuirk.class, ExtraSupportedQualityQuirk.k())) {
            arrayList.add(new ExtraSupportedQualityQuirk());
        }
        if (n2Var.a(SignalEosOutputBufferNotComeQuirk.class, SignalEosOutputBufferNotComeQuirk.h())) {
            arrayList.add(new SignalEosOutputBufferNotComeQuirk());
        }
        if (n2Var.a(SizeCannotEncodeVideoQuirk.class, SizeCannotEncodeVideoQuirk.k())) {
            arrayList.add(new SizeCannotEncodeVideoQuirk());
        }
        if (n2Var.a(PreviewBlackScreenQuirk.class, PreviewBlackScreenQuirk.h())) {
            arrayList.add(new PreviewBlackScreenQuirk());
        }
        if (n2Var.a(PrematureEndOfStreamVideoQuirk.class, PrematureEndOfStreamVideoQuirk.g())) {
            arrayList.add(PrematureEndOfStreamVideoQuirk.f3665a);
        }
        return arrayList;
    }
}
