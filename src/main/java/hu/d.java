package hu;

import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f73628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ gu.e f73629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f73630c;

    d(e eVar, List list, gu.e eVar2) {
        this.f73630c = eVar;
        this.f73628a = list;
        this.f73629b = eVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f73630c.f73638c.b(this.f73628a)) {
                e.d(this.f73630c, this.f73629b);
            } else {
                e.c(this.f73630c, this.f73628a, this.f73629b);
            }
        } catch (Exception e11) {
            Log.e("SplitCompat", "Error checking verified files.", e11);
            this.f73629b.zzb(-11);
        }
    }
}
