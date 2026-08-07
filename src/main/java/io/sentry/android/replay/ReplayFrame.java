package io.sentry.android.replay;

import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.io.File;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: io.sentry.android.replay.j, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001b"}, d2 = {"Lio/sentry/android/replay/j;", "", "Ljava/io/File;", "screenshot", "", "timestamp", "", AnalyticsContext.Screen, "<init>", "(Ljava/io/File;JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "b", "()Ljava/io/File;", "J", "c", "()J", "Ljava/lang/String;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ReplayFrame {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final File screenshot;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String screen;

    public ReplayFrame(File screenshot, long j11, String str) {
        p013kotlin.jvm.internal.s.k(screenshot, "screenshot");
        this.screenshot = screenshot;
        this.timestamp = j11;
        this.screen = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final File getScreenshot() {
        return this.screenshot;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplayFrame)) {
            return false;
        }
        ReplayFrame replayFrame = (ReplayFrame) other;
        return p013kotlin.jvm.internal.s.f(this.screenshot, replayFrame.screenshot) && this.timestamp == replayFrame.timestamp && p013kotlin.jvm.internal.s.f(this.screen, replayFrame.screen);
    }

    public int hashCode() {
        int iHashCode = ((this.screenshot.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31;
        String str = this.screen;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReplayFrame(screenshot=" + this.screenshot + ", timestamp=" + this.timestamp + ", screen=" + this.screen + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
