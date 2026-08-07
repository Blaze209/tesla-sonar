package io.sentry.android.replay.video;

import android.annotation.TargetApi;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: io.sentry.android.replay.video.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b \u0010\u000e¨\u0006\""}, d2 = {"Lio/sentry/android/replay/video/a;", "", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "", "recordingWidth", "recordingHeight", "frameRate", "bitRate", "", "mimeType", "<init>", "(Ljava/io/File;IIIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "b", "()Ljava/io/File;", "I", "f", "setRecordingWidth", "(I)V", "c", "e", "setRecordingHeight", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(24)
public final /* data */ class MuxerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final File file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private int recordingWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private int recordingHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int frameRate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int bitRate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mimeType;

    public MuxerConfig(File file, int i11, int i12, int i13, int i14, String mimeType) {
        s.k(file, "file");
        s.k(mimeType, "mimeType");
        this.file = file;
        this.recordingWidth = i11;
        this.recordingHeight = i12;
        this.frameRate = i13;
        this.bitRate = i14;
        this.mimeType = mimeType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBitRate() {
        return this.bitRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MuxerConfig)) {
            return false;
        }
        MuxerConfig muxerConfig = (MuxerConfig) other;
        return s.f(this.file, muxerConfig.file) && this.recordingWidth == muxerConfig.recordingWidth && this.recordingHeight == muxerConfig.recordingHeight && this.frameRate == muxerConfig.frameRate && this.bitRate == muxerConfig.bitRate && s.f(this.mimeType, muxerConfig.mimeType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public int hashCode() {
        return (((((((((this.file.hashCode() * 31) + Integer.hashCode(this.recordingWidth)) * 31) + Integer.hashCode(this.recordingHeight)) * 31) + Integer.hashCode(this.frameRate)) * 31) + Integer.hashCode(this.bitRate)) * 31) + this.mimeType.hashCode();
    }

    public String toString() {
        return "MuxerConfig(file=" + this.file + ", recordingWidth=" + this.recordingWidth + ", recordingHeight=" + this.recordingHeight + ", frameRate=" + this.frameRate + ", bitRate=" + this.bitRate + ", mimeType=" + this.mimeType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ MuxerConfig(File file, int i11, int i12, int i13, int i14, String str, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i11, i12, i13, i14, (i15 & 32) != 0 ? "video/avc" : str);
    }
}
