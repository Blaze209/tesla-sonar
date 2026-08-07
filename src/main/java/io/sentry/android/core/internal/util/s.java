package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;

/* JADX INFO: loaded from: classes9.dex */
public final class s {
    public static boolean a(Context context, String str) {
        io.sentry.util.y.c(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
