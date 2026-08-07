package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public enum b7 implements a2 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public static final class a implements q1<b7> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b7 a(i3 i3Var, ILogger iLogger) {
            return b7.valueOf(i3Var.O().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.w(name().toLowerCase(Locale.ROOT));
    }
}
