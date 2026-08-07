package com.plaid.internal.core.crashreporting.internal.models;

import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;", "", "(Ljava/lang/String;I)V", "FATAL", "ERROR", "WARNING", "INFO", "DEBUG", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum CrashLogLevel {
    FATAL,
    ERROR,
    WARNING,
    INFO,
    DEBUG;

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());

    public static EnumEntries<CrashLogLevel> getEntries() {
        return $ENTRIES;
    }
}
