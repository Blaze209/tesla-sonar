package c00;

import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;

/* JADX INFO: loaded from: classes6.dex */
public class c implements VideoDecoderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VideoDecoderFactory f18514a;

    private synchronized VideoDecoderFactory a() {
        try {
            if (this.f18514a == null) {
                this.f18514a = new SoftwareVideoDecoderFactory();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f18514a;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return a().createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return a().getSupportedCodecs();
    }
}
