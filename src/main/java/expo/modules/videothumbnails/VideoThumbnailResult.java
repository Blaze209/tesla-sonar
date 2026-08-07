package expo.modules.videothumbnails;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001e"}, d2 = {"Lexpo/modules/videothumbnails/VideoThumbnailResult;", "Lexpo/modules/kotlin/records/Record;", "uri", "", Snapshot.WIDTH, "", Snapshot.HEIGHT, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getUri$annotations", "()V", "getUri", "()Ljava/lang/String;", "getWidth$annotations", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight$annotations", "getHeight", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lexpo/modules/videothumbnails/VideoThumbnailResult;", "equals", "", "other", "", "hashCode", "toString", "expo-video-thumbnails_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VideoThumbnailResult implements Record {
    private final Integer height;
    private final String uri;
    private final Integer width;

    public VideoThumbnailResult(String uri, Integer num, Integer num2) {
        s.k(uri, "uri");
        this.uri = uri;
        this.width = num;
        this.height = num2;
    }

    public static /* synthetic */ VideoThumbnailResult copy$default(VideoThumbnailResult videoThumbnailResult, String str, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = videoThumbnailResult.uri;
        }
        if ((i11 & 2) != 0) {
            num = videoThumbnailResult.width;
        }
        if ((i11 & 4) != 0) {
            num2 = videoThumbnailResult.height;
        }
        return videoThumbnailResult.copy(str, num, num2);
    }

    @Field
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Field
    public static /* synthetic */ void getUri$annotations() {
    }

    @Field
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    public final VideoThumbnailResult copy(String uri, Integer width, Integer height) {
        s.k(uri, "uri");
        return new VideoThumbnailResult(uri, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoThumbnailResult)) {
            return false;
        }
        VideoThumbnailResult videoThumbnailResult = (VideoThumbnailResult) other;
        return s.f(this.uri, videoThumbnailResult.uri) && s.f(this.width, videoThumbnailResult.width) && s.f(this.height, videoThumbnailResult.height);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = this.uri.hashCode() * 31;
        Integer num = this.width;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "VideoThumbnailResult(uri=" + this.uri + ", width=" + this.width + ", height=" + this.height + ")";
    }
}
