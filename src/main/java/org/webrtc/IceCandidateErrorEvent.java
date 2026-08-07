package org.webrtc;

/* JADX INFO: loaded from: classes10.dex */
public final class IceCandidateErrorEvent {
    public final String address;
    public final int errorCode;
    public final String errorText;
    public final int port;
    public final String url;

    @CalledByNative
    public IceCandidateErrorEvent(String str, int i11, String str2, int i12, String str3) {
        this.address = str;
        this.port = i11;
        this.url = str2;
        this.errorCode = i12;
        this.errorText = str3;
    }
}
