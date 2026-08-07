package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.o3;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements io.sentry.v0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ILogger f79801h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f79794a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f79795b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f79796c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f79797d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f79798e = 1000000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f79799f = 1.0E9d / 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f79800g = new File("/proc/self/stat");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f79802i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Pattern f79803j = Pattern.compile("[\n\t\r ]");

    public w(ILogger iLogger) {
        this.f79801h = (ILogger) io.sentry.util.y.c(iLogger, "Logger is required.");
    }

    private long e() {
        String strC;
        try {
            strC = io.sentry.util.i.c(this.f79800g);
        } catch (IOException e11) {
            this.f79802i = false;
            this.f79801h.a(b7.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e11);
            strC = null;
        }
        if (strC != null) {
            String[] strArrSplit = this.f79803j.split(strC.trim());
            try {
                return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f79799f);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e12) {
                this.f79801h.a(b7.ERROR, "Error parsing /proc/self/stat file.", e12);
            }
        }
        return 0L;
    }

    @Override // io.sentry.v0
    public void c() {
        this.f79802i = true;
        this.f79796c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f79797d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f79799f = 1.0E9d / this.f79796c;
        this.f79795b = e();
    }

    @Override // io.sentry.v0
    public void d(o3 o3Var) {
        if (this.f79802i) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j11 = jElapsedRealtimeNanos - this.f79794a;
            this.f79794a = jElapsedRealtimeNanos;
            long jE = e();
            long j12 = jE - this.f79795b;
            this.f79795b = jE;
            o3Var.e(Double.valueOf(((j12 / j11) / this.f79797d) * 100.0d));
        }
    }
}
