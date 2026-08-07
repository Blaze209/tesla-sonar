package com.withpersona.sdk2.inquiry.governmentid.video_capture;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.moshi.g;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import fg0.a;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%R\u0011\u0010&\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010%¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "", "", "maxRecordingLengthMs", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "enabledCaptureFileTypes", "Lfg0/a;", "videoCaptureMethods", "", "webRtcJwt", "", "recordAudio", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "copy", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/util/List;", "getEnabledCaptureFileTypes", "()Ljava/util/List;", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "e", "Z", "()Z", "isVideoCaptureEnabled", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VideoCaptureConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long maxRecordingLengthMs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<a> videoCaptureMethods;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String webRtcJwt;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean recordAudio;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoCaptureConfig(long j11, List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, List<? extends a> videoCaptureMethods, @g(name = "webRTCJwt") String str, boolean z11) {
        s.k(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        s.k(videoCaptureMethods, "videoCaptureMethods");
        this.maxRecordingLengthMs = j11;
        this.enabledCaptureFileTypes = enabledCaptureFileTypes;
        this.videoCaptureMethods = videoCaptureMethods;
        this.webRtcJwt = str;
        this.recordAudio = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getMaxRecordingLengthMs() {
        return this.maxRecordingLengthMs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRecordAudio() {
        return this.recordAudio;
    }

    public final List<a> c() {
        return this.videoCaptureMethods;
    }

    public final VideoCaptureConfig copy(long maxRecordingLengthMs, List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, List<? extends a> videoCaptureMethods, @g(name = "webRTCJwt") String webRtcJwt, boolean recordAudio) {
        s.k(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        s.k(videoCaptureMethods, "videoCaptureMethods");
        return new VideoCaptureConfig(maxRecordingLengthMs, enabledCaptureFileTypes, videoCaptureMethods, webRtcJwt, recordAudio);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getWebRtcJwt() {
        return this.webRtcJwt;
    }

    public final boolean e() {
        return this.enabledCaptureFileTypes.contains(NextStep.GovernmentId.CaptureFileType.Video);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCaptureConfig)) {
            return false;
        }
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) other;
        return this.maxRecordingLengthMs == videoCaptureConfig.maxRecordingLengthMs && s.f(this.enabledCaptureFileTypes, videoCaptureConfig.enabledCaptureFileTypes) && s.f(this.videoCaptureMethods, videoCaptureConfig.videoCaptureMethods) && s.f(this.webRtcJwt, videoCaptureConfig.webRtcJwt) && this.recordAudio == videoCaptureConfig.recordAudio;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.maxRecordingLengthMs) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
        String str = this.webRtcJwt;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.recordAudio);
    }

    public String toString() {
        return "VideoCaptureConfig(maxRecordingLengthMs=" + this.maxRecordingLengthMs + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", webRtcJwt=" + this.webRtcJwt + ", recordAudio=" + this.recordAudio + ")";
    }

    public /* synthetic */ VideoCaptureConfig(long j11, List list, List list2, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 120000L : j11, list, list2, str, z11);
    }
}
