package com.fourthline.scanners;

import android.graphics.Bitmap;
import com.fourthline.core.VideoRecording;
import com.fourthline.scanners.config.ImageReturnType;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003JO\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00060"}, d2 = {"Lcom/fourthline/scanners/SelfieResultHolder;", "", "image", "Landroid/graphics/Bitmap;", "videoRecording", "Lcom/fourthline/core/VideoRecording;", "location", "Lkotlin/Pair;", "", "timestamp", "Ljava/util/Date;", "imageReturnType", "Lcom/fourthline/scanners/config/ImageReturnType;", "<init>", "(Landroid/graphics/Bitmap;Lcom/fourthline/core/VideoRecording;Lkotlin/Pair;Ljava/util/Date;Lcom/fourthline/scanners/config/ImageReturnType;)V", "getImage", "()Landroid/graphics/Bitmap;", "setImage", "(Landroid/graphics/Bitmap;)V", "getVideoRecording", "()Lcom/fourthline/core/VideoRecording;", "setVideoRecording", "(Lcom/fourthline/core/VideoRecording;)V", "getLocation", "()Lkotlin/Pair;", "setLocation", "(Lkotlin/Pair;)V", "getTimestamp", "()Ljava/util/Date;", "setTimestamp", "(Ljava/util/Date;)V", "getImageReturnType", "()Lcom/fourthline/scanners/config/ImageReturnType;", "setImageReturnType", "(Lcom/fourthline/scanners/config/ImageReturnType;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelfieResultHolder {
    private Bitmap image;
    private ImageReturnType imageReturnType;
    private Pair<Double, Double> location;
    private Date timestamp;
    private VideoRecording videoRecording;

    public SelfieResultHolder() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelfieResultHolder copy$default(SelfieResultHolder selfieResultHolder, Bitmap bitmap, VideoRecording videoRecording, Pair pair, Date date, ImageReturnType imageReturnType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bitmap = selfieResultHolder.image;
        }
        if ((i11 & 2) != 0) {
            videoRecording = selfieResultHolder.videoRecording;
        }
        if ((i11 & 4) != 0) {
            pair = selfieResultHolder.location;
        }
        if ((i11 & 8) != 0) {
            date = selfieResultHolder.timestamp;
        }
        if ((i11 & 16) != 0) {
            imageReturnType = selfieResultHolder.imageReturnType;
        }
        ImageReturnType imageReturnType2 = imageReturnType;
        Pair pair2 = pair;
        return selfieResultHolder.copy(bitmap, videoRecording, pair2, date, imageReturnType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    public final Pair<Double, Double> component3() {
        return this.location;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ImageReturnType getImageReturnType() {
        return this.imageReturnType;
    }

    public final SelfieResultHolder copy(Bitmap image, VideoRecording videoRecording, Pair<Double, Double> location, Date timestamp, ImageReturnType imageReturnType) {
        s.k(imageReturnType, "imageReturnType");
        return new SelfieResultHolder(image, videoRecording, location, timestamp, imageReturnType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieResultHolder)) {
            return false;
        }
        SelfieResultHolder selfieResultHolder = (SelfieResultHolder) other;
        return s.f(this.image, selfieResultHolder.image) && s.f(this.videoRecording, selfieResultHolder.videoRecording) && s.f(this.location, selfieResultHolder.location) && s.f(this.timestamp, selfieResultHolder.timestamp) && this.imageReturnType == selfieResultHolder.imageReturnType;
    }

    public final Bitmap getImage() {
        return this.image;
    }

    public final ImageReturnType getImageReturnType() {
        return this.imageReturnType;
    }

    public final Pair<Double, Double> getLocation() {
        return this.location;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    public int hashCode() {
        Bitmap bitmap = this.image;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        VideoRecording videoRecording = this.videoRecording;
        int iHashCode2 = (iHashCode + (videoRecording == null ? 0 : videoRecording.hashCode())) * 31;
        Pair<Double, Double> pair = this.location;
        int iHashCode3 = (iHashCode2 + (pair == null ? 0 : pair.hashCode())) * 31;
        Date date = this.timestamp;
        return ((iHashCode3 + (date != null ? date.hashCode() : 0)) * 31) + this.imageReturnType.hashCode();
    }

    public final void setImage(Bitmap bitmap) {
        this.image = bitmap;
    }

    public final void setImageReturnType(ImageReturnType imageReturnType) {
        s.k(imageReturnType, "<set-?>");
        this.imageReturnType = imageReturnType;
    }

    public final void setLocation(Pair<Double, Double> pair) {
        this.location = pair;
    }

    public final void setTimestamp(Date date) {
        this.timestamp = date;
    }

    public final void setVideoRecording(VideoRecording videoRecording) {
        this.videoRecording = videoRecording;
    }

    public String toString() {
        return "SelfieResultHolder(image=" + this.image + ", videoRecording=" + this.videoRecording + ", location=" + this.location + ", timestamp=" + this.timestamp + ", imageReturnType=" + this.imageReturnType + ")";
    }

    public SelfieResultHolder(Bitmap bitmap, VideoRecording videoRecording, Pair<Double, Double> pair, Date date, ImageReturnType imageReturnType) {
        s.k(imageReturnType, "imageReturnType");
        this.image = bitmap;
        this.videoRecording = videoRecording;
        this.location = pair;
        this.timestamp = date;
        this.imageReturnType = imageReturnType;
    }

    public /* synthetic */ SelfieResultHolder(Bitmap bitmap, VideoRecording videoRecording, Pair pair, Date date, ImageReturnType imageReturnType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bitmap, (i11 & 2) != 0 ? null : videoRecording, (i11 & 4) != 0 ? null : pair, (i11 & 8) != 0 ? null : date, (i11 & 16) != 0 ? ImageReturnType.BASE_64 : imageReturnType);
    }
}
