package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.impl.r2;

/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f126032a;

    public c0(@NonNull r2 r2Var) {
        this.f126032a = r2Var.a(UseTorchAsFlashQuirk.class);
    }

    public boolean a() {
        return this.f126032a;
    }
}
