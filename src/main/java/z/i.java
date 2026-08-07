package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.r2;
import c0.y0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f126037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f126038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f126039c;

    public i(@NonNull r2 r2Var, @NonNull r2 r2Var2) {
        this.f126037a = r2Var2.a(TextureViewIsClosedQuirk.class);
        this.f126038b = r2Var.a(PreviewOrientationIncorrectQuirk.class);
        this.f126039c = r2Var.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void a(List<DeferrableSurface> list) {
        if (!b() || list == null) {
            return;
        }
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        y0.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean b() {
        return this.f126037a || this.f126038b || this.f126039c;
    }
}
