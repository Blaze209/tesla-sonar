package org.webrtc;

/* JADX INFO: loaded from: classes10.dex */
public interface StatsObserver {
    @CalledByNative
    void onComplete(StatsReport[] statsReportArr);
}
