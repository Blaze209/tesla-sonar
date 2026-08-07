package io.sentry.android.replay.util;

import io.sentry.util.b0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/sentry/util/b0;", "", "rate", "", "a", "(Lio/sentry/util/b0;Ljava/lang/Double;)Z", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class m {
    public static final boolean a(b0 b0Var, Double d11) {
        s.k(b0Var, "<this>");
        return d11 != null && d11.doubleValue() >= b0Var.c();
    }
}
