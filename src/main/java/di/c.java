package di;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f60631a = -1;

    public static synchronized boolean a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f60631a < 3000) {
            return true;
        }
        f60631a = jElapsedRealtime;
        return false;
    }
}
