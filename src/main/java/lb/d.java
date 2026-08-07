package lb;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class d implements androidx.work.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f89763a = q5.i.a(Looper.getMainLooper());

    @Override // androidx.work.m0
    public void a(Runnable runnable) {
        this.f89763a.removeCallbacks(runnable);
    }

    @Override // androidx.work.m0
    public void b(long j11, Runnable runnable) {
        this.f89763a.postDelayed(runnable, j11);
    }
}
