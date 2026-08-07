package b00;

import java.util.Iterator;
import java.util.List;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;
import org.webrtc.VideoSink;

/* JADX INFO: loaded from: classes6.dex */
public class b implements VideoProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VideoSink f15249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceTextureHelper f15250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<c> f15251c;

    public b(List<c> list, SurfaceTextureHelper surfaceTextureHelper) {
        this.f15250b = surfaceTextureHelper;
        this.f15251c = list;
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        videoFrame.retain();
        Iterator<c> it = this.f15251c.iterator();
        VideoFrame videoFrameA = videoFrame;
        while (it.hasNext()) {
            videoFrameA = it.next().a(videoFrameA, this.f15250b);
            if (videoFrameA == null) {
                this.f15249a.onFrame(videoFrame);
                videoFrame.release();
                return;
            }
        }
        this.f15249a.onFrame(videoFrameA);
        videoFrameA.release();
        videoFrame.release();
    }

    @Override // org.webrtc.VideoProcessor
    public void setSink(VideoSink videoSink) {
        this.f15249a = videoSink;
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z11) {
    }
}
