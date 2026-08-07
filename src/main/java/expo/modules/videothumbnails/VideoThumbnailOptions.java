package expo.modules.videothumbnails;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lexpo/modules/videothumbnails/VideoThumbnailOptions;", "Lexpo/modules/kotlin/records/Record;", "quality", "", "time", "", "headers", "", "", "<init>", "(DILjava/util/Map;)V", "getQuality$annotations", "()V", "getQuality", "()D", "getTime$annotations", "getTime", "()I", "getHeaders$annotations", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "expo-video-thumbnails_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VideoThumbnailOptions implements Record {
    private final Map<String, String> headers;
    private final double quality;
    private final int time;

    public VideoThumbnailOptions() {
        this(0.0d, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoThumbnailOptions copy$default(VideoThumbnailOptions videoThumbnailOptions, double d11, int i11, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            d11 = videoThumbnailOptions.quality;
        }
        if ((i12 & 2) != 0) {
            i11 = videoThumbnailOptions.time;
        }
        if ((i12 & 4) != 0) {
            map = videoThumbnailOptions.headers;
        }
        return videoThumbnailOptions.copy(d11, i11, map);
    }

    @Field
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @Field
    public static /* synthetic */ void getQuality$annotations() {
    }

    @Field
    public static /* synthetic */ void getTime$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    public final VideoThumbnailOptions copy(double quality, int time, Map<String, String> headers) {
        s.k(headers, "headers");
        return new VideoThumbnailOptions(quality, time, headers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoThumbnailOptions)) {
            return false;
        }
        VideoThumbnailOptions videoThumbnailOptions = (VideoThumbnailOptions) other;
        return Double.compare(this.quality, videoThumbnailOptions.quality) == 0 && this.time == videoThumbnailOptions.time && s.f(this.headers, videoThumbnailOptions.headers);
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final double getQuality() {
        return this.quality;
    }

    public final int getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((Double.hashCode(this.quality) * 31) + Integer.hashCode(this.time)) * 31) + this.headers.hashCode();
    }

    public String toString() {
        return "VideoThumbnailOptions(quality=" + this.quality + ", time=" + this.time + ", headers=" + this.headers + ")";
    }

    public VideoThumbnailOptions(double d11, int i11, Map<String, String> headers) {
        s.k(headers, "headers");
        this.quality = d11;
        this.time = i11;
        this.headers = headers;
    }

    public /* synthetic */ VideoThumbnailOptions(double d11, int i11, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 1.0d : d11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? v0.i() : map);
    }
}
