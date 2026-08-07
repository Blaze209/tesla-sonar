package oh0;

import android.content.Context;
import androidx.p002activity.result.ActivityResultLauncher;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<ActivityResultLauncher<h.e>> f97462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<Context> f97463b;

    public n(qj0.i<ActivityResultLauncher<h.e>> iVar, qj0.i<Context> iVar2) {
        this.f97462a = iVar;
        this.f97463b = iVar2;
    }

    public static n a(qj0.i<ActivityResultLauncher<h.e>> iVar, qj0.i<Context> iVar2) {
        return new n(iVar, iVar2);
    }

    public static m c(ActivityResultLauncher<h.e> activityResultLauncher, Context context) {
        return new m(activityResultLauncher, context);
    }

    public m b() {
        return c(this.f97462a.get(), this.f97463b.get());
    }
}
