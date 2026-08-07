package io.sentry.android.replay.util;

import io.sentry.b7;
import io.sentry.c1;
import io.sentry.q7;
import java.util.concurrent.Future;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/sentry/c1;", "Lio/sentry/q7;", "options", "", "taskName", "Ljava/lang/Runnable;", "task", "Ljava/util/concurrent/Future;", "b", "(Lio/sentry/c1;Lio/sentry/q7;Ljava/lang/String;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {
    public static final Future<?> b(c1 c1Var, final q7 options, final String taskName, final Runnable task) {
        s.k(c1Var, "<this>");
        s.k(options, "options");
        s.k(taskName, "taskName");
        s.k(task, "task");
        try {
            return c1Var.submit(new Runnable() { // from class: io.sentry.android.replay.util.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.c(task, options, taskName);
                }
            });
        } catch (Throwable th2) {
            options.getLogger().a(b7.ERROR, "Failed to submit task " + taskName + " to executor", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Runnable runnable, q7 q7Var, String str) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            q7Var.getLogger().a(b7.ERROR, "Failed to execute task " + str, th2);
        }
    }
}
