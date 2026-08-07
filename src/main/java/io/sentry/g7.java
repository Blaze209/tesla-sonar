package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public enum g7 implements a2 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    public static final class a implements q1<g7> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g7 a(i3 i3Var, ILogger iLogger) {
            return g7.valueOf(i3Var.O().toUpperCase(Locale.ROOT));
        }
    }

    g7(int i11) {
        this.severityNumber = i11;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.w(name().toLowerCase(Locale.ROOT));
    }
}
