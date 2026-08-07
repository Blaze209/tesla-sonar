package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class ExternalAudioProcessingFactory implements AudioProcessingFactory {
    private long apmPtr = nativeGetDefaultApm();
    private long capturePostProcessingPtr = 0;
    private long renderPreProcessingPtr = 0;

    public interface AudioProcessing {
        @CalledByNative("AudioProcessing")
        void initialize(int i11, int i12);

        @CalledByNative("AudioProcessing")
        void process(int i11, int i12, ByteBuffer byteBuffer);

        @CalledByNative("AudioProcessing")
        void reset(int i11);
    }

    private void checkExternalAudioProcessorExists() {
        if (this.apmPtr == 0) {
            throw new IllegalStateException("ExternalAudioProcessor has been disposed.");
        }
    }

    private static native void nativeDestroy();

    private static native long nativeGetDefaultApm();

    private static native void nativeSetBypassFlagForCapturePost(boolean z11);

    private static native void nativeSetBypassFlagForRenderPre(boolean z11);

    private static native long nativeSetCapturePostProcessing(AudioProcessing audioProcessing);

    private static native long nativeSetRenderPreProcessing(AudioProcessing audioProcessing);

    @Override // org.webrtc.AudioProcessingFactory
    public long createNative() {
        if (this.apmPtr == 0) {
            this.apmPtr = nativeGetDefaultApm();
        }
        return this.apmPtr;
    }

    public void destroy() {
        checkExternalAudioProcessorExists();
        long j11 = this.renderPreProcessingPtr;
        if (j11 != 0) {
            JniCommon.nativeReleaseRef(j11);
            this.renderPreProcessingPtr = 0L;
        }
        long j12 = this.capturePostProcessingPtr;
        if (j12 != 0) {
            JniCommon.nativeReleaseRef(j12);
            this.capturePostProcessingPtr = 0L;
        }
        nativeDestroy();
        this.apmPtr = 0L;
    }

    public void setBypassFlagForCapturePost(boolean z11) {
        checkExternalAudioProcessorExists();
        nativeSetBypassFlagForCapturePost(z11);
    }

    public void setBypassFlagForRenderPre(boolean z11) {
        checkExternalAudioProcessorExists();
        nativeSetBypassFlagForRenderPre(z11);
    }

    public void setCapturePostProcessing(AudioProcessing audioProcessing) {
        checkExternalAudioProcessorExists();
        long jNativeSetCapturePostProcessing = nativeSetCapturePostProcessing(audioProcessing);
        long j11 = this.capturePostProcessingPtr;
        if (j11 != 0) {
            JniCommon.nativeReleaseRef(j11);
            this.capturePostProcessingPtr = 0L;
        }
        this.capturePostProcessingPtr = jNativeSetCapturePostProcessing;
    }

    public void setRenderPreProcessing(AudioProcessing audioProcessing) {
        checkExternalAudioProcessorExists();
        long jNativeSetRenderPreProcessing = nativeSetRenderPreProcessing(audioProcessing);
        long j11 = this.renderPreProcessingPtr;
        if (j11 != 0) {
            JniCommon.nativeReleaseRef(j11);
            this.renderPreProcessingPtr = 0L;
        }
        this.renderPreProcessingPtr = jNativeSetRenderPreProcessing;
    }
}
