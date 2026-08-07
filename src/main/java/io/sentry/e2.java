package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public interface e2 {

    public enum a implements e2 {
        NANOSECOND,
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK;

        @Override // io.sentry.e2
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    String apiName();
}
