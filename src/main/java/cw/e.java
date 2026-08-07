package cw;

import com.google.firebase.installations.h;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f59220d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f59221e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f59222a = h.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f59223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f59224c;

    e() {
    }

    private synchronized long a(int i11) {
        if (c(i11)) {
            return (long) Math.min(Math.pow(2.0d, this.f59224c) + this.f59222a.e(), f59221e);
        }
        return f59220d;
    }

    private static boolean c(int i11) {
        if (i11 != 429) {
            return i11 >= 500 && i11 < 600;
        }
        return true;
    }

    private static boolean d(int i11) {
        return (i11 >= 200 && i11 < 300) || i11 == 401 || i11 == 404;
    }

    private synchronized void e() {
        this.f59224c = 0;
    }

    public synchronized boolean b() {
        return this.f59224c == 0 || this.f59222a.a() > this.f59223b;
    }

    public synchronized void f(int i11) {
        if (d(i11)) {
            e();
            return;
        }
        this.f59224c++;
        this.f59223b = this.f59222a.a() + a(i11);
    }
}
