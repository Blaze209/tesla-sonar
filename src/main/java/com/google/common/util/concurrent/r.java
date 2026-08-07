package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f43828a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f43830c;

    r(Class<?> cls) {
        this.f43829b = cls.getName();
    }

    Logger a() {
        Logger logger = this.f43830c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f43828a) {
            try {
                Logger logger2 = this.f43830c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f43829b);
                this.f43830c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
