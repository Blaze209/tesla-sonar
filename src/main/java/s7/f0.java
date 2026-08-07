package s7;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class f0 implements j {
    protected f0() {
    }

    @Override // s7.j
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // s7.j
    public p c(Looper looper, Handler.Callback callback) {
        return new g0(new Handler(looper, callback));
    }

    @Override // s7.j
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // s7.j
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // s7.j
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // s7.j
    public void b() {
    }
}
