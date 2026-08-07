package fu;

import android.util.Log;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Set f66605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f66606b;

    s(a aVar, Set set) {
        this.f66606b = aVar;
        this.f66605a = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f66606b.h(this.f66605a);
        } catch (Exception e11) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e11);
        }
    }
}
