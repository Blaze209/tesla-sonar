package az;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Laz/b;", "Lorg/webrtc/VideoEncoderFactory;", "Lorg/webrtc/EglBase$Context;", "sharedContext", "", "enableIntelVp8Encoder", "enableH264HighProfile", "forceSWCodec", "", "", "forceSWCodecs", "<init>", "(Lorg/webrtc/EglBase$Context;ZZZLjava/util/List;)V", "Lorg/webrtc/VideoCodecInfo;", "videoCodecInfo", "Lorg/webrtc/VideoEncoder;", "createEncoder", "(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;", "", "getSupportedCodecs", "()[Lorg/webrtc/VideoCodecInfo;", "a", "Z", "b", "Ljava/util/List;", "Lc00/d;", "c", "Lc00/d;", "softwareVideoEncoderFactory", "Laz/c;", DateTokenConverter.CONVERTER_KEY, "Laz/c;", "simulcastVideoEncoderFactoryWrapper", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class b implements VideoEncoderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean forceSWCodec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<String> forceSWCodecs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c00.d softwareVideoEncoderFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c simulcastVideoEncoderFactoryWrapper;

    public b(EglBase.Context context, boolean z11, boolean z12, boolean z13, List<String> forceSWCodecs) {
        s.k(forceSWCodecs, "forceSWCodecs");
        this.forceSWCodec = z13;
        this.forceSWCodecs = forceSWCodecs;
        this.softwareVideoEncoderFactory = new c00.d();
        this.simulcastVideoEncoderFactoryWrapper = new c(context, z11, z12);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        s.k(videoCodecInfo, "videoCodecInfo");
        if (this.forceSWCodec) {
            return this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        }
        return (this.forceSWCodecs.isEmpty() || !this.forceSWCodecs.contains(videoCodecInfo.name)) ? this.simulcastVideoEncoderFactoryWrapper.createEncoder(videoCodecInfo) : this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        if (!this.forceSWCodec || !this.forceSWCodecs.isEmpty()) {
            return this.simulcastVideoEncoderFactoryWrapper.getSupportedCodecs();
        }
        VideoCodecInfo[] supportedCodecs = this.softwareVideoEncoderFactory.getSupportedCodecs();
        s.h(supportedCodecs);
        return supportedCodecs;
    }

    public /* synthetic */ b(EglBase.Context context, boolean z11, boolean z12, boolean z13, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, z11, z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) != 0 ? v.e("VP9") : list);
    }
}
