package io.sentry.android.core;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class r0 {
    public static io.sentry.o1 a(Context context, z0 z0Var) {
        return z0Var.d() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
