package com.fourthline.core;

import com.fourthline.core.location.Coordinate;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.URI;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000f¨\u0006%"}, d2 = {"Lcom/fourthline/core/VideoRecording;", "", "Ljava/net/URI;", ImagesContract.URL, "Lcom/fourthline/core/VideoDuration;", "duration", "Lcom/fourthline/core/location/Coordinate;", "location", "<init>", "(Ljava/net/URI;Lcom/fourthline/core/VideoDuration;Lcom/fourthline/core/location/Coordinate;)V", "component1", "()Ljava/net/URI;", "component2", "()Lcom/fourthline/core/VideoDuration;", "component3", "()Lcom/fourthline/core/location/Coordinate;", "copy", "(Ljava/net/URI;Lcom/fourthline/core/VideoDuration;Lcom/fourthline/core/location/Coordinate;)Lcom/fourthline/core/VideoRecording;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/net/URI;", "getUrl", "b", "Lcom/fourthline/core/VideoDuration;", "getDuration", "c", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VideoRecording {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final URI url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final VideoDuration duration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinate location;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoRecording(URI url, VideoDuration duration) {
        this(url, duration, null, 4, null);
        s.k(url, "url");
        s.k(duration, "duration");
    }

    public static /* synthetic */ VideoRecording copy$default(VideoRecording videoRecording, URI uri, VideoDuration videoDuration, Coordinate coordinate, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            uri = videoRecording.url;
        }
        if ((i11 & 2) != 0) {
            videoDuration = videoRecording.duration;
        }
        if ((i11 & 4) != 0) {
            coordinate = videoRecording.location;
        }
        return videoRecording.copy(uri, videoDuration, coordinate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final URI getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoDuration getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Coordinate getLocation() {
        return this.location;
    }

    public final VideoRecording copy(URI url, VideoDuration duration, Coordinate location) {
        s.k(url, "url");
        s.k(duration, "duration");
        return new VideoRecording(url, duration, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoRecording)) {
            return false;
        }
        VideoRecording videoRecording = (VideoRecording) other;
        return s.f(this.url, videoRecording.url) && s.f(this.duration, videoRecording.duration) && s.f(this.location, videoRecording.location);
    }

    public final VideoDuration getDuration() {
        return this.duration;
    }

    public final Coordinate getLocation() {
        return this.location;
    }

    public final URI getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.duration.hashCode()) * 31;
        Coordinate coordinate = this.location;
        return iHashCode + (coordinate == null ? 0 : coordinate.hashCode());
    }

    public String toString() {
        return "VideoRecording(url=" + this.url + ", duration=" + this.duration + ", location=" + this.location + ")";
    }

    public VideoRecording(URI url, VideoDuration duration, Coordinate coordinate) {
        s.k(url, "url");
        s.k(duration, "duration");
        this.url = url;
        this.duration = duration;
        this.location = coordinate;
    }

    public /* synthetic */ VideoRecording(URI uri, VideoDuration videoDuration, Coordinate coordinate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, videoDuration, (i11 & 4) != 0 ? null : coordinate);
    }
}
