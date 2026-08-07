package az;

import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.WrappedVideoDecoderFactory;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Laz/p;", "Lorg/webrtc/VideoDecoderFactory;", "<init>", "()V", "Lorg/webrtc/VideoCodecInfo;", "codecInfo", "Lorg/webrtc/VideoDecoder;", "createDecoder", "(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoDecoder;", "", "getSupportedCodecs", "()[Lorg/webrtc/VideoCodecInfo;", "Lorg/webrtc/WrappedVideoDecoderFactory;", "a", "Lkotlin/Lazy;", "c", "()Lorg/webrtc/WrappedVideoDecoderFactory;", "factory", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p implements VideoDecoderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy factory = jn0.m.b(new wn0.a() { // from class: az.o
        @Override // wn0.a
        public final Object invoke() {
            return p.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final WrappedVideoDecoderFactory b() {
        return new WrappedVideoDecoderFactory(com.oney.WebRTCModule.h.b());
    }

    private final WrappedVideoDecoderFactory c() {
        return (WrappedVideoDecoderFactory) this.factory.getValue();
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo codecInfo) {
        s.k(codecInfo, "codecInfo");
        return c().createDecoder(codecInfo);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo[] supportedCodecs = c().getSupportedCodecs();
        s.j(supportedCodecs, "getSupportedCodecs(...)");
        return supportedCodecs;
    }
}
