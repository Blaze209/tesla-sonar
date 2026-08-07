package c00;

import java.util.ArrayList;
import java.util.Arrays;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoDecoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;

/* JADX INFO: loaded from: classes6.dex */
public class a implements VideoDecoderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoDecoderFactory f18510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VideoDecoderFactory f18511b = new c();

    public a(EglBase.Context context) {
        this.f18510a = new HardwareVideoDecoderFactory(context);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return videoCodecInfo.name.equalsIgnoreCase("H264") ? this.f18510a.createDecoder(videoCodecInfo) : this.f18511b.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        String str;
        ArrayList arrayList = new ArrayList();
        VideoCodecInfo videoCodecInfo = null;
        VideoCodecInfo videoCodecInfo2 = null;
        for (VideoCodecInfo videoCodecInfo3 : this.f18510a.getSupportedCodecs()) {
            if (videoCodecInfo3.name.equalsIgnoreCase("H264") && (str = videoCodecInfo3.params.get("profile-level-id")) != null) {
                if (str.equalsIgnoreCase("640c1f")) {
                    videoCodecInfo = videoCodecInfo3;
                } else if (str.equalsIgnoreCase("42e01f")) {
                    videoCodecInfo2 = videoCodecInfo3;
                }
            }
        }
        if (videoCodecInfo != null) {
            arrayList.add(videoCodecInfo);
        }
        if (videoCodecInfo2 != null) {
            arrayList.add(videoCodecInfo2);
        }
        arrayList.addAll(Arrays.asList(this.f18511b.getSupportedCodecs()));
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
