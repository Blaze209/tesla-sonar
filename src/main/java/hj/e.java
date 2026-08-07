package hj;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f72917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f72918c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private aj.a f72920e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f72919d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f72916a = new j();

    @Deprecated
    protected e(File file, long j11) {
        this.f72917b = file;
        this.f72918c = j11;
    }

    public static a c(File file, long j11) {
        return new e(file, j11);
    }

    private synchronized aj.a d() {
        try {
            if (this.f72920e == null) {
                this.f72920e = aj.a.t0(this.f72917b, 1, 1, this.f72918c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f72920e;
    }

    private synchronized void e() {
        this.f72920e = null;
    }

    @Override // hj.a
    public File a(dj.e eVar) throws Throwable {
        String strB = this.f72916a.b(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + eVar);
        }
        try {
            aj.a.e eVarR0 = d().r0(strB);
            if (eVarR0 != null) {
                return eVarR0.a(0);
            }
            return null;
        } catch (IOException e11) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e11);
            return null;
        }
    }

    @Override // hj.a
    public void b(dj.e eVar, a.b bVar) {
        String strB = this.f72916a.b(eVar);
        this.f72919d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + eVar);
            }
            try {
                aj.a aVarD = d();
                if (aVarD.r0(strB) == null) {
                    aj.a.c cVarE0 = aVarD.e0(strB);
                    if (cVarE0 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                    }
                    try {
                        if (bVar.a(cVarE0.f(0))) {
                            cVarE0.e();
                        }
                        cVarE0.b();
                    } catch (Throwable th2) {
                        cVarE0.b();
                        throw th2;
                    }
                }
            } catch (IOException e11) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e11);
                }
            }
            this.f72919d.b(strB);
        } catch (Throwable th3) {
            this.f72919d.b(strB);
            throw th3;
        }
    }

    @Override // hj.a
    public synchronized void clear() {
        try {
            try {
                d().b0();
            } catch (IOException e11) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e11);
                }
            }
            e();
        } catch (Throwable th2) {
            e();
            throw th2;
        }
    }
}
