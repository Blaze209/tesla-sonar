package az;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Laz/a;", "Lorg/webrtc/VideoDecoderFactory;", "", "forceSWCodec", "", "", "forceSWCodecs", "<init>", "(ZLjava/util/List;)V", "Lorg/webrtc/VideoCodecInfo;", "videoCodecInfo", "Lorg/webrtc/VideoDecoder;", "createDecoder", "(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoDecoder;", "", "getSupportedCodecs", "()[Lorg/webrtc/VideoCodecInfo;", "a", "Z", "b", "Ljava/util/List;", "Lc00/c;", "c", "Lc00/c;", "softwareVideoDecoderFactory", "Laz/p;", DateTokenConverter.CONVERTER_KEY, "Laz/p;", "wrappedVideoDecoderFactory", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class a implements VideoDecoderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean forceSWCodec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<String> forceSWCodecs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c00.c softwareVideoDecoderFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p wrappedVideoDecoderFactory;

    public a(boolean z11, List<String> forceSWCodecs) {
        s.k(forceSWCodecs, "forceSWCodecs");
        this.forceSWCodec = z11;
        this.forceSWCodecs = forceSWCodecs;
        this.softwareVideoDecoderFactory = new c00.c();
        this.wrappedVideoDecoderFactory = new p();
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        s.k(videoCodecInfo, "videoCodecInfo");
        if (this.forceSWCodec) {
            return this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        }
        return (this.forceSWCodecs.isEmpty() || !this.forceSWCodecs.contains(videoCodecInfo.name)) ? this.wrappedVideoDecoderFactory.createDecoder(videoCodecInfo) : this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        if (!this.forceSWCodec || !this.forceSWCodecs.isEmpty()) {
            return this.wrappedVideoDecoderFactory.getSupportedCodecs();
        }
        VideoCodecInfo[] supportedCodecs = this.softwareVideoDecoderFactory.getSupportedCodecs();
        s.h(supportedCodecs);
        return supportedCodecs;
    }

    public /* synthetic */ a(boolean z11, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? v.e("VP9") : list);
    }
}
