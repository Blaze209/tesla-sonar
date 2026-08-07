package io.sentry.android.replay;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.sentry.r7;
import java.util.Date;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: io.sentry.android.replay.d, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b!\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u0010\u0016R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b$\u00102¨\u00063"}, d2 = {"Lio/sentry/android/replay/d;", "", "Lio/sentry/android/replay/s;", "recorderConfig", "Lio/sentry/android/replay/i;", "cache", "Ljava/util/Date;", "timestamp", "", "id", "", "duration", "Lio/sentry/r7$b;", "replayType", "", "screenAtStart", "", "Lio/sentry/rrweb/b;", "events", "<init>", "(Lio/sentry/android/replay/s;Lio/sentry/android/replay/i;Ljava/util/Date;IJLio/sentry/r7$b;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lio/sentry/android/replay/s;", "e", "()Lio/sentry/android/replay/s;", "b", "Lio/sentry/android/replay/i;", "()Lio/sentry/android/replay/i;", "c", "Ljava/util/Date;", "h", "()Ljava/util/Date;", DateTokenConverter.CONVERTER_KEY, "I", "J", "()J", "f", "Lio/sentry/r7$b;", "()Lio/sentry/r7$b;", "g", "Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LastSegmentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScreenshotRecorderConfig recorderConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final i cache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date timestamp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long duration;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final r7.b replayType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String screenAtStart;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<io.sentry.rrweb.b> events;

    /* JADX WARN: Multi-variable type inference failed */
    public LastSegmentData(ScreenshotRecorderConfig recorderConfig, i cache, Date timestamp, int i11, long j11, r7.b replayType, String str, List<? extends io.sentry.rrweb.b> events) {
        p013kotlin.jvm.internal.s.k(recorderConfig, "recorderConfig");
        p013kotlin.jvm.internal.s.k(cache, "cache");
        p013kotlin.jvm.internal.s.k(timestamp, "timestamp");
        p013kotlin.jvm.internal.s.k(replayType, "replayType");
        p013kotlin.jvm.internal.s.k(events, "events");
        this.recorderConfig = recorderConfig;
        this.cache = cache;
        this.timestamp = timestamp;
        this.id = i11;
        this.duration = j11;
        this.replayType = replayType;
        this.screenAtStart = str;
        this.events = events;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i getCache() {
        return this.cache;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final List<io.sentry.rrweb.b> c() {
        return this.events;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ScreenshotRecorderConfig getRecorderConfig() {
        return this.recorderConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastSegmentData)) {
            return false;
        }
        LastSegmentData lastSegmentData = (LastSegmentData) other;
        return p013kotlin.jvm.internal.s.f(this.recorderConfig, lastSegmentData.recorderConfig) && p013kotlin.jvm.internal.s.f(this.cache, lastSegmentData.cache) && p013kotlin.jvm.internal.s.f(this.timestamp, lastSegmentData.timestamp) && this.id == lastSegmentData.id && this.duration == lastSegmentData.duration && this.replayType == lastSegmentData.replayType && p013kotlin.jvm.internal.s.f(this.screenAtStart, lastSegmentData.screenAtStart) && p013kotlin.jvm.internal.s.f(this.events, lastSegmentData.events);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final r7.b getReplayType() {
        return this.replayType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getScreenAtStart() {
        return this.screenAtStart;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.recorderConfig.hashCode() * 31) + this.cache.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + Long.hashCode(this.duration)) * 31) + this.replayType.hashCode()) * 31;
        String str = this.screenAtStart;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.events.hashCode();
    }

    public String toString() {
        return "LastSegmentData(recorderConfig=" + this.recorderConfig + ", cache=" + this.cache + ", timestamp=" + this.timestamp + ", id=" + this.id + ", duration=" + this.duration + ", replayType=" + this.replayType + ", screenAtStart=" + this.screenAtStart + ", events=" + this.events + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
