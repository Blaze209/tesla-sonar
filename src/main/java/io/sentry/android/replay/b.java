package io.sentry.android.replay;

import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/sentry/android/replay/b;", "", "Ljava/util/concurrent/ScheduledExecutorService;", "c", "()Ljava/util/concurrent/ScheduledExecutorService;", "Lio/sentry/android/replay/util/h;", "o", "()Lio/sentry/android/replay/util/h;", "Landroid/os/Handler;", "p", "()Landroid/os/Handler;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b {
    ScheduledExecutorService c();

    io.sentry.android.replay.util.h o();

    Handler p();
}
