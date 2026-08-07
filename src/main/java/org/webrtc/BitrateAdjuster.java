package org.webrtc;

/* JADX INFO: loaded from: classes10.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int i11);

    void setTargets(int i11, double d11);
}
