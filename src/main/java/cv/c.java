package cv;

import android.os.Bundle;
import androidx.annotation.NonNull;
import bv.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class c implements b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f59190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeUnit f59192c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CountDownLatch f59194e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f59193d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f59195f = false;

    public c(@NonNull e eVar, int i11, TimeUnit timeUnit) {
        this.f59190a = eVar;
        this.f59191b = i11;
        this.f59192c = timeUnit;
    }

    @Override // cv.a
    public void a(@NonNull String str, Bundle bundle) {
        synchronized (this.f59193d) {
            try {
                g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f59194e = new CountDownLatch(1);
                this.f59195f = false;
                this.f59190a.a(str, bundle);
                g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f59194e.await(this.f59191b, this.f59192c)) {
                        this.f59195f = true;
                        g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f59194e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // cv.b
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f59194e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
