package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.core.impl.r2;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f126057a;

    public v(@NonNull r2 r2Var) {
        this.f126057a = r2Var.a(Preview3AThreadCrashQuirk.class);
    }

    public boolean a() {
        return this.f126057a;
    }
}
