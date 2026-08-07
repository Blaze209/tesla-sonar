package com.tesla.dashcam_viewer;

import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpTransceiver;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0003J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/tesla/dashcam_viewer/a;", "Lorg/webrtc/PeerConnection$Observer;", "<init>", "()V", "Lorg/webrtc/PeerConnection$SignalingState;", "newState", "Ljn0/h0;", "onSignalingChange", "(Lorg/webrtc/PeerConnection$SignalingState;)V", "Lorg/webrtc/PeerConnection$PeerConnectionState;", "onConnectionChange", "(Lorg/webrtc/PeerConnection$PeerConnectionState;)V", "Lorg/webrtc/IceCandidate;", "candidate", "onIceCandidate", "(Lorg/webrtc/IceCandidate;)V", "Lorg/webrtc/PeerConnection$IceConnectionState;", "onIceConnectionChange", "(Lorg/webrtc/PeerConnection$IceConnectionState;)V", "", "candidates", "onIceCandidatesRemoved", "([Lorg/webrtc/IceCandidate;)V", "Lorg/webrtc/PeerConnection$IceGatheringState;", "onIceGatheringChange", "(Lorg/webrtc/PeerConnection$IceGatheringState;)V", "", "receiving", "onIceConnectionReceivingChange", "(Z)V", "Lorg/webrtc/MediaStream;", "stream", "onAddStream", "(Lorg/webrtc/MediaStream;)V", "onRemoveStream", "Lorg/webrtc/DataChannel;", "channel", "onDataChannel", "(Lorg/webrtc/DataChannel;)V", "onRenegotiationNeeded", "Lorg/webrtc/RtpTransceiver;", "transceiver", "onTrack", "(Lorg/webrtc/RtpTransceiver;)V", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a implements PeerConnection.Observer {
    @Override // org.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream stream) {
        p013kotlin.jvm.internal.s.k(stream, "stream");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onConnectionChange(PeerConnection.PeerConnectionState newState) {
        p013kotlin.jvm.internal.s.k(newState, "newState");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel channel) {
        p013kotlin.jvm.internal.s.k(channel, "channel");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate candidate) {
        p013kotlin.jvm.internal.s.k(candidate, "candidate");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidatesRemoved(IceCandidate[] candidates) {
        p013kotlin.jvm.internal.s.k(candidates, "candidates");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState newState) {
        p013kotlin.jvm.internal.s.k(newState, "newState");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionReceivingChange(boolean receiving) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceGatheringChange(PeerConnection.IceGatheringState newState) {
        p013kotlin.jvm.internal.s.k(newState, "newState");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream stream) {
        p013kotlin.jvm.internal.s.k(stream, "stream");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSignalingChange(PeerConnection.SignalingState newState) {
        p013kotlin.jvm.internal.s.k(newState, "newState");
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onTrack(RtpTransceiver transceiver) {
        p013kotlin.jvm.internal.s.k(transceiver, "transceiver");
    }
}
