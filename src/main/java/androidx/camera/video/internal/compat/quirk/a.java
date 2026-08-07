package androidx.camera.video.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.n2;
import androidx.camera.core.impl.o2;
import androidx.camera.core.impl.r2;
import androidx.core.util.Consumer;
import c0.y0;
import i0.c;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private static volatile r2 f3669a;

    static {
        o2.b().c(c.b(), new Consumer() { // from class: e1.b
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                androidx.camera.video.internal.compat.quirk.a.a((n2) obj);
            }
        });
    }

    public static /* synthetic */ void a(n2 n2Var) {
        f3669a = new r2(b.a(n2Var));
        y0.a("DeviceQuirks", "video DeviceQuirks = " + r2.d(f3669a));
    }

    public static <T extends m2> T b(@NonNull Class<T> cls) {
        return (T) f3669a.b(cls);
    }

    @NonNull
    public static r2 c() {
        return f3669a;
    }
}
