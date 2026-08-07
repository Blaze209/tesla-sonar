package org.webrtc;

/* JADX INFO: loaded from: classes10.dex */
class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int DEFAULT_FRAMERATE_FPS = 30;

    FramerateBitrateAdjuster() {
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i11, double d11) {
        this.targetFramerateFps = 30.0d;
        this.targetBitrateBps = (int) (((double) (i11 * 30)) / d11);
    }
}
