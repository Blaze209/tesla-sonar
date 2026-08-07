package fu;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f66604a;

    r(a aVar) {
        this.f66604a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f66604a.f66576a.k();
        } catch (Exception e11) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e11);
        }
    }
}
