package io.sentry.android.replay.util;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/util/l;", "Ljava/lang/Runnable;", "", "taskName", "delegate", "<init>", "(Ljava/lang/String;Ljava/lang/Runnable;)V", "Ljn0/h0;", "run", "()V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String taskName;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Runnable f80185b;

    public l(String taskName, Runnable delegate) {
        s.k(taskName, "taskName");
        s.k(delegate, "delegate");
        this.taskName = taskName;
        this.f80185b = delegate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTaskName() {
        return this.taskName;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f80185b.run();
    }
}
