package ts;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class j0 implements d {
    protected j0() {
    }

    @Override // ts.d
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // ts.d
    public q c(Looper looper, Handler.Callback callback) {
        return new k0(new Handler(looper, callback));
    }

    @Override // ts.d
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // ts.d
    public void b() {
    }
}
