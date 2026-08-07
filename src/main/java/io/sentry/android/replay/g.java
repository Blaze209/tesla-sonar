package io.sentry.android.replay;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.Closeable;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/g;", "Ljava/io/Closeable;", "Ljn0/h0;", "start", "()V", "Lio/sentry/android/replay/s;", "config", "s", "(Lio/sentry/android/replay/s;)V", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "reset", "stop", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface g extends Closeable {
    void d();

    void i();

    void reset();

    void s(ScreenshotRecorderConfig config);

    void start();

    void stop();
}
