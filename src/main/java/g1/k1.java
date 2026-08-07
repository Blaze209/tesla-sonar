package g1;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class k1 implements l1 {
    @Override // g1.l1
    public long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // g1.l1
    public long b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }
}
