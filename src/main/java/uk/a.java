package uk;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import pk.p;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f116395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f116396i = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile File f116398b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile File f116400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f116401e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile StatFs f116397a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile StatFs f116399c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f116403g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lock f116402f = new ReentrantLock();

    /* JADX INFO: renamed from: uk.a$a, reason: collision with other inner class name */
    public enum EnumC2508a {
        INTERNAL,
        EXTERNAL
    }

    protected a() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (this.f116403g) {
            return;
        }
        this.f116402f.lock();
        try {
            if (!this.f116403g) {
                this.f116398b = Environment.getDataDirectory();
                this.f116400d = Environment.getExternalStorageDirectory();
                g();
                this.f116403g = true;
            }
        } finally {
            this.f116402f.unlock();
        }
    }

    public static synchronized a d() {
        try {
            if (f116395h == null) {
                f116395h = new a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f116395h;
    }

    private void e() {
        if (this.f116402f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f116401e > f116396i) {
                    g();
                }
            } finally {
                this.f116402f.unlock();
            }
        }
    }

    private void g() {
        this.f116397a = h(this.f116397a, this.f116398b);
        this.f116399c = h(this.f116399c, this.f116400d);
        this.f116401e = SystemClock.uptimeMillis();
    }

    private StatFs h(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return a(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th2) {
                throw p.a(th2);
            }
        }
        return null;
    }

    @SuppressLint({"DeprecatedMethod"})
    public long c(EnumC2508a enumC2508a) {
        b();
        e();
        StatFs statFs = enumC2508a == EnumC2508a.INTERNAL ? this.f116397a : this.f116399c;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    public boolean f(EnumC2508a enumC2508a, long j11) {
        b();
        long jC = c(enumC2508a);
        return jC <= 0 || jC < j11;
    }
}
