package c00;

import org.webrtc.SoftwareVideoEncoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;

/* JADX INFO: loaded from: classes6.dex */
public class d implements VideoEncoderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VideoEncoderFactory f18515a;

    private synchronized VideoEncoderFactory a() {
        try {
            if (this.f18515a == null) {
                this.f18515a = new SoftwareVideoEncoderFactory();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f18515a;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return a().createEncoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return a().getSupportedCodecs();
    }
}
