package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.n2;
import androidx.camera.core.impl.o2;
import androidx.camera.core.impl.r2;
import androidx.core.util.Consumer;
import c0.y0;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private static volatile r2 f3017a;

    static {
        o2.b().c(i0.c.b(), new Consumer() { // from class: y.a
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                androidx.camera.camera2.internal.compat.quirk.b.a((n2) obj);
            }
        });
    }

    public static /* synthetic */ void a(n2 n2Var) {
        f3017a = new r2(c.a(n2Var));
        y0.a("DeviceQuirks", "camera2 DeviceQuirks = " + r2.d(f3017a));
    }

    public static <T extends m2> T b(@NonNull Class<T> cls) {
        return (T) f3017a.b(cls);
    }

    @NonNull
    public static r2 c() {
        return f3017a;
    }
}
