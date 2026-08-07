package com.tesla.dashcam_viewer;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/tesla/dashcam_viewer/b;", "Lorg/webrtc/SdpObserver;", "<init>", "()V", "Ljn0/h0;", "onSetSuccess", "", AnalyticsAttribute.Error, "onSetFailure", "(Ljava/lang/String;)V", "Lorg/webrtc/SessionDescription;", "sdp", "onCreateSuccess", "(Lorg/webrtc/SessionDescription;)V", "onCreateFailure", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b implements SdpObserver {
    @Override // org.webrtc.SdpObserver
    public void onCreateFailure(String error) {
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateSuccess(SessionDescription sdp) {
    }

    @Override // org.webrtc.SdpObserver
    public void onSetFailure(String error) {
    }

    @Override // org.webrtc.SdpObserver
    public void onSetSuccess() {
    }
}
