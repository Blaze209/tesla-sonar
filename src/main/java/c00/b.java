package c00;

import java.util.ArrayList;
import java.util.Arrays;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;

/* JADX INFO: loaded from: classes6.dex */
public class b implements VideoEncoderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoEncoderFactory f18512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VideoEncoderFactory f18513b = new d();

    public b(EglBase.Context context) {
        this.f18512a = new HardwareVideoEncoderFactory(context, false, true);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return videoCodecInfo.name.equalsIgnoreCase("H264") ? this.f18512a.createEncoder(videoCodecInfo) : this.f18513b.createEncoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        String str;
        ArrayList arrayList = new ArrayList();
        VideoCodecInfo videoCodecInfo = null;
        VideoCodecInfo videoCodecInfo2 = null;
        for (VideoCodecInfo videoCodecInfo3 : this.f18512a.getSupportedCodecs()) {
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
        arrayList.addAll(Arrays.asList(this.f18513b.getSupportedCodecs()));
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
