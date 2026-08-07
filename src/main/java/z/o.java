package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.core.impl.r2;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f126045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f126046b = false;

    public o(@NonNull r2 r2Var) {
        this.f126045a = r2Var.b(AutoFlashUnderExposedQuirk.class) != null;
    }

    public void a() {
        this.f126046b = false;
    }

    public void b() {
        this.f126046b = true;
    }

    public boolean c(int i11) {
        return this.f126046b && i11 == 0 && this.f126045a;
    }
}
