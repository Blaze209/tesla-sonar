package io.sentry.android.replay;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: io.sentry.android.replay.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lio/sentry/android/replay/c;", "", "Ljava/io/File;", MediaStreamTrack.VIDEO_TRACK_KIND, "", "frameCount", "", "duration", "<init>", "(Ljava/io/File;IJ)V", "a", "()Ljava/io/File;", "b", "()I", "c", "()J", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/io/File;", "getVideo", "I", "getFrameCount", "J", "getDuration", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GeneratedVideo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final File video;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int frameCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long duration;

    public GeneratedVideo(File video, int i11, long j11) {
        p013kotlin.jvm.internal.s.k(video, "video");
        this.video = video;
        this.frameCount = i11;
        this.duration = j11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final File getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFrameCount() {
        return this.frameCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneratedVideo)) {
            return false;
        }
        GeneratedVideo generatedVideo = (GeneratedVideo) other;
        return p013kotlin.jvm.internal.s.f(this.video, generatedVideo.video) && this.frameCount == generatedVideo.frameCount && this.duration == generatedVideo.duration;
    }

    public int hashCode() {
        return (((this.video.hashCode() * 31) + Integer.hashCode(this.frameCount)) * 31) + Long.hashCode(this.duration);
    }

    public String toString() {
        return "GeneratedVideo(video=" + this.video + ", frameCount=" + this.frameCount + ", duration=" + this.duration + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
