package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f46797a = new Date();

    public static CrashLogLevel a(int i11) {
        switch (i11) {
            case 2:
                return CrashLogLevel.INFO;
            case 3:
                return CrashLogLevel.DEBUG;
            case 4:
                return CrashLogLevel.INFO;
            case 5:
                return CrashLogLevel.WARNING;
            case 6:
                return CrashLogLevel.ERROR;
            case 7:
                return CrashLogLevel.DEBUG;
            default:
                return CrashLogLevel.ERROR;
        }
    }
}
