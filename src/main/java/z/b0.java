package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.impl.r2;
import c0.y0;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TorchFlashRequiredFor3aUpdateQuirk f126031a;

    public b0(@NonNull r2 r2Var) {
        this.f126031a = (TorchFlashRequiredFor3aUpdateQuirk) r2Var.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public boolean a() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.f126031a;
        boolean z11 = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.j();
        y0.a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z11);
        return z11;
    }
}
